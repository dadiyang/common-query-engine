/* Copyright 2016 Sparsity-Technologies
 
 The research leading to this code has been partially funded by the
 European Commission under FP7 programme project #611068.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package eu.coherentpaas.cqe.server;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.derby.iapi.util.InterruptStatus;
import org.apache.derby.impl.jdbc.EmbedConnection;
import org.apache.derby.impl.jdbc.EmbedPreparedStatement;

import eu.coherentpaas.cqe.TransformQueryPlan;
import eu.coherentpaas.engine.CPaaSQueryContext;
import eu.coherentpaas.engine.TransactionContext;

public class CloudMdSQLEmbedStatement extends EmbedPreparedStatement {

	public CloudMdSQLEmbedStatement(CloudMdSQLStatement stmt, EmbedConnection conn, String sql, boolean forMetaData,
			int resultSetType, int resultSetConcurrency, int resultSetHoldability, int autoGeneratedKeys,
			int[] columnIndexes, String[] columnNames) throws SQLException {

		super(conn, "", forMetaData, resultSetType, resultSetConcurrency, resultSetHoldability, autoGeneratedKeys,
				columnIndexes, columnNames, false);

		try {
			lcc = getEmbedConnection().getLanguageConnection();

			CloudMdSQL2DerbyStatement cloudStmt = new CloudMdSQL2DerbyStatement(stmt,
					lcc.getDataDictionary().getSystemSchemaDescriptor(), sql, true);

			preparedStatement = cloudStmt.prepare(lcc);

			activation = cloudStmt.getPreparedStatement().getActivation(lcc,
					resultSetType == java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE);
			checkRequiresCallableStatement(activation);
			InterruptStatus.restoreIntrFlagIfSeen(lcc);

		} catch (Throwable t) {
			t.printStackTrace();
			throw handleException(t);
		}
	}

	public CloudMdSQLEmbedStatement(String name, QueryContext ctx, CloudMdSQLStatement stmt, EmbedConnection conn,
			TransformQueryPlan trans) throws SQLException {
		super(conn, "", false, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY,
				ResultSet.CLOSE_CURSORS_AT_COMMIT, 0, null, null, false);

		try {
			lcc = getEmbedConnection().getLanguageConnection();
			CloudMdSQL2DerbyStatement cloudStmt = new CloudMdSQL2DerbyStatement(name, ctx, stmt,
					lcc.getDataDictionary().getSystemSchemaDescriptor());

			preparedStatement = cloudStmt.prepare(trans);

			activation = cloudStmt.getPreparedStatement().getActivation(lcc,
					resultSetType == java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE);
			checkRequiresCallableStatement(activation);
			InterruptStatus.restoreIntrFlagIfSeen(lcc);

		} catch (Throwable t) {
			throw handleException(t);
		}
	}

	public boolean execute() throws SQLException {
		TransactionContext transactionCtx = (TransactionContext) lcc.getContextManager().getContext("tm_cqe");

		CPaaSQueryContext qctx = (CPaaSQueryContext) lcc.getContextManager().getContext("cpaas_id");
		if (qctx != null) {
			QueryContext ctx = CloudMdSQLManager.getInstance().getQueryContext(qctx.getIdQuery());
			if (ctx != null) {
				ctx.setTransactionContext(transactionCtx.getTransactionContext());
				return super.execute();
			} else {
				throw new SQLException("Ops! There is no query context for " + qctx.getIdQuery());
			}

		} else {
			throw new SQLException(
					"Ops! There is no transaction context for this query."+
					" Please review if you have started a transaction property.");
		}

	}

}
