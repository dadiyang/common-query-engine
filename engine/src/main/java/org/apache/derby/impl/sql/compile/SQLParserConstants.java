/* Generated By:JavaCC: Do not edit this line. SQLParserConstants.java */
/*

   Derby - File org.apache.derby.impl.sql.compile.sqlgrammar.jj

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to you under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.apache.derby.impl.sql.compile;

public interface SQLParserConstants {

  int EOF = 0;
  int NOT_D = 16;
  int NOT_DE = 19;
  int NOT_DER = 22;
  int NOT_DERB = 25;
  int NOT_DERBY = 28;
  int NOT_DERBYDASH = 31;
  int NOT_DERBYDASHP = 34;
  int NOT_DERBYDASHPR = 37;
  int NOT_DERBYDASHPRO = 40;
  int NOT_DERBYDASHPROP = 43;
  int NOT_DERBYDASHPROPE = 46;
  int NOT_DERBYDASHPROPER = 49;
  int NOT_DERBYDASHPROPERT = 52;
  int NOT_DERBYDASHPROPERTI = 55;
  int NOT_DERBYDASHPROPERTIE = 58;
  int DERBYDASHPROPERTIES = 59;
  int NOT_PROPERTIES = 62;
  int SINGLE_LINE_SQLCOMMENT = 63;
  int CHECK_PROPERTIES = 64;
  int ADD = 65;
  int ALL = 66;
  int ALLOCATE = 67;
  int ALTER = 68;
  int AND = 69;
  int ANY = 70;
  int ARE = 71;
  int AS = 72;
  int ASC = 73;
  int ASSERTION = 74;
  int AT = 75;
  int AUTHORIZATION = 76;
  int AVG = 77;
  int BEGIN = 78;
  int BETWEEN = 79;
  int BINARY = 80;
  int BIT = 81;
  int BOTH = 82;
  int BY = 83;
  int CASCADE = 84;
  int CASCADED = 85;
  int CASE = 86;
  int CAST = 87;
  int CHAR = 88;
  int CHARACTER = 89;
  int CHARACTER_LENGTH = 90;
  int CHECK = 91;
  int CLOSE = 92;
  int COALESCE = 93;
  int COLLATE = 94;
  int COLLATION = 95;
  int COLUMN = 96;
  int COMMIT = 97;
  int CONNECT = 98;
  int CONNECTION = 99;
  int CONSTRAINT = 100;
  int CONSTRAINTS = 101;
  int CONTINUE = 102;
  int CONVERT = 103;
  int CORRESPONDING = 104;
  int COUNT = 105;
  int CREATE = 106;
  int CROSS = 107;
  int CURRENT = 108;
  int CURRENT_DATE = 109;
  int CURRENT_TIME = 110;
  int CURRENT_TIMESTAMP = 111;
  int CURRENT_USER = 112;
  int CURSOR = 113;
  int D = 114;
  int DEALLOCATE = 115;
  int DEC = 116;
  int DECIMAL = 117;
  int DECLARE = 118;
  int _DEFAULT = 119;
  int DEFERRABLE = 120;
  int DEFERRED = 121;
  int DELETE = 122;
  int DESC = 123;
  int DESCRIBE = 124;
  int DIAGNOSTICS = 125;
  int DISCONNECT = 126;
  int DISTINCT = 127;
  int DOUBLE = 128;
  int DROP = 129;
  int ELSE = 130;
  int END = 131;
  int ENDEXEC = 132;
  int ESCAPE = 133;
  int EXCEPT = 134;
  int EXCEPTION = 135;
  int EXEC = 136;
  int EXECUTE = 137;
  int EXISTS = 138;
  int EXTERNAL = 139;
  int FALSE = 140;
  int FETCH = 141;
  int FIRST = 142;
  int FLOAT = 143;
  int FOR = 144;
  int FOREIGN = 145;
  int FOUND = 146;
  int FROM = 147;
  int FULL = 148;
  int FUNCTION = 149;
  int GET = 150;
  int GLOBAL = 151;
  int GO = 152;
  int GOTO = 153;
  int GRANT = 154;
  int GROUP = 155;
  int HAVING = 156;
  int HOUR = 157;
  int IDENTITY = 158;
  int IMMEDIATE = 159;
  int IN = 160;
  int INDICATOR = 161;
  int INITIALLY = 162;
  int INNER = 163;
  int INPUT = 164;
  int INSENSITIVE = 165;
  int INSERT = 166;
  int INT = 167;
  int INTEGER = 168;
  int INTERSECT = 169;
  int INTO = 170;
  int IS = 171;
  int ISOLATION = 172;
  int JOIN = 173;
  int KEY = 174;
  int LAST = 175;
  int LEADING = 176;
  int LEFT = 177;
  int LIKE = 178;
  int LOWER = 179;
  int MATCH = 180;
  int MAX = 181;
  int MIN = 182;
  int MINUTE = 183;
  int MODULE = 184;
  int NATIONAL = 185;
  int NATURAL = 186;
  int NCHAR = 187;
  int NEXT = 188;
  int NO = 189;
  int NOT = 190;
  int NULL = 191;
  int NULLIF = 192;
  int NUMERIC = 193;
  int OF = 194;
  int ON = 195;
  int ONLY = 196;
  int OPEN = 197;
  int OPTION = 198;
  int OR = 199;
  int ORDER = 200;
  int OUTER = 201;
  int OUTPUT = 202;
  int OVERLAPS = 203;
  int PAD = 204;
  int PARTIAL = 205;
  int PREPARE = 206;
  int PRESERVE = 207;
  int PRIMARY = 208;
  int PRIOR = 209;
  int PRIVILEGES = 210;
  int PROCEDURE = 211;
  int PUBLIC = 212;
  int READ = 213;
  int REAL = 214;
  int REFERENCES = 215;
  int RELATIVE = 216;
  int RESTRICT = 217;
  int REVOKE = 218;
  int RIGHT = 219;
  int ROLLBACK = 220;
  int ROWS = 221;
  int SCHEMA = 222;
  int SCROLL = 223;
  int SECOND = 224;
  int SELECT = 225;
  int SESSION_USER = 226;
  int SET = 227;
  int SMALLINT = 228;
  int SOME = 229;
  int SPACE = 230;
  int SQL = 231;
  int SQLCODE = 232;
  int SQLERROR = 233;
  int SQLSTATE = 234;
  int SUBSTRING = 235;
  int SUM = 236;
  int SYSTEM_USER = 237;
  int T = 238;
  int TABLE = 239;
  int TEMPORARY = 240;
  int TIMEZONE_HOUR = 241;
  int TIMEZONE_MINUTE = 242;
  int TO = 243;
  int TRANSACTION = 244;
  int TRANSLATE = 245;
  int TRANSLATION = 246;
  int TRAILING = 247;
  int TRIM = 248;
  int TRUE = 249;
  int TS = 250;
  int UNION = 251;
  int UNIQUE = 252;
  int UNKNOWN = 253;
  int UPDATE = 254;
  int UPPER = 255;
  int USER = 256;
  int USING = 257;
  int VALUE = 258;
  int VALUES = 259;
  int VARBINARY = 260;
  int VARCHAR = 261;
  int VARYING = 262;
  int VIEW = 263;
  int WHENEVER = 264;
  int WHERE = 265;
  int WINDOW = 266;
  int WITH = 267;
  int WORK = 268;
  int WRITE = 269;
  int YEAR = 270;
  int ABS = 271;
  int ABSVAL = 272;
  int ACTION = 273;
  int ALWAYS = 274;
  int BLOB = 275;
  int C = 276;
  int CALLED = 277;
  int CLOB = 278;
  int COBOL = 279;
  int COMMITTED = 280;
  int CONCAT = 281;
  int CONTAINS = 282;
  int CYCLE = 283;
  int DATA = 284;
  int DATE = 285;
  int DAY = 286;
  int DEFINER = 287;
  int DETERMINISTIC = 288;
  int DYNAMIC = 289;
  int ENFORCED = 290;
  int FORTRAN = 291;
  int GENERATED = 292;
  int IDENTITY_VAL_LOCAL = 293;
  int INCREMENT = 294;
  int INITIAL = 295;
  int INOUT = 296;
  int INTERVAL = 297;
  int INVOKER = 298;
  int LANGUAGE = 299;
  int LARGE = 300;
  int LENGTH = 301;
  int LEVEL = 302;
  int LIMIT = 303;
  int LOCKS = 304;
  int LOCKSIZE = 305;
  int LOGGED = 306;
  int MATCHED = 307;
  int MAXVALUE = 308;
  int MERGE = 309;
  int MINVALUE = 310;
  int MOD = 311;
  int MODIFIES = 312;
  int MODIFY = 313;
  int MONTH = 314;
  int _MORE = 315;
  int MUMPS = 316;
  int NAME = 317;
  int NCLOB = 318;
  int NULLABLE = 319;
  int NULLS = 320;
  int NUMBER = 321;
  int OBJECT = 322;
  int OFFSET = 323;
  int PASCAL = 324;
  int PLI = 325;
  int PRECISION = 326;
  int RELEASE = 327;
  int REPEATABLE = 328;
  int RESTART = 329;
  int RETURNS = 330;
  int ROLLUP = 331;
  int ROW = 332;
  int SAVEPOINT = 333;
  int SCALE = 334;
  int SECURITY = 335;
  int SERIALIZABLE = 336;
  int SQL_TSI_FRAC_SECOND = 337;
  int SQL_TSI_SECOND = 338;
  int SQL_TSI_MINUTE = 339;
  int SQL_TSI_HOUR = 340;
  int SQL_TSI_DAY = 341;
  int SQL_TSI_WEEK = 342;
  int SQL_TSI_MONTH = 343;
  int SQL_TSI_QUARTER = 344;
  int SQL_TSI_YEAR = 345;
  int START = 346;
  int STATEMENT = 347;
  int SYNONYM = 348;
  int THEN = 349;
  int TIME = 350;
  int TIMESTAMP = 351;
  int TIMESTAMPADD = 352;
  int TIMESTAMPDIFF = 353;
  int TRUNCATE = 354;
  int TYPE = 355;
  int UNCOMMITTED = 356;
  int USAGE = 357;
  int WHEN = 358;
  int DERBYPLAN = 359;
  int BOOLEAN = 360;
  int CALL = 361;
  int CURDATE = 362;
  int CURRENT_ROLE = 363;
  int CURTIME = 364;
  int DATABASE = 365;
  int GET_CURRENT_CONNECTION = 366;
  int EXPLAIN = 367;
  int BIGINT = 368;
  int LONG = 369;
  int LTRIM = 370;
  int NONE = 371;
  int OVER = 372;
  int ROLE = 373;
  int ROWNUMBER = 374;
  int RTRIM = 375;
  int SUBSTR = 376;
  int XML = 377;
  int XMLEXISTS = 378;
  int XMLPARSE = 379;
  int XMLQUERY = 380;
  int XMLSERIALIZE = 381;
  int AFTER = 382;
  int AGGREGATE = 383;
  int BEFORE = 384;
  int CLASS = 385;
  int COMPRESS = 386;
  int CONTENT = 387;
  int CS = 388;
  int CURSORS = 389;
  int DB2SQL = 390;
  int DERBY = 391;
  int DERBY_JDBC_RESULT_SET = 392;
  int DEFRAGMENT = 393;
  int DIRTY = 394;
  int DOCUMENT = 395;
  int EACH = 396;
  int EMPTY = 397;
  int EXCLUSIVE = 398;
  int FN = 399;
  int INDEX = 400;
  int INPLACE = 401;
  int JAVA = 402;
  int LCASE = 403;
  int LOCATE = 404;
  int LOCK = 405;
  int MESSAGE_LOCALE = 406;
  int METHOD = 407;
  int MODE = 408;
  int NEW = 409;
  int NEW_TABLE = 410;
  int NVARCHAR = 411;
  int OJ = 412;
  int OFF = 413;
  int OLD = 414;
  int OLD_TABLE = 415;
  int OUT = 416;
  int PARAMETER = 417;
  int PASSING = 418;
  int PROPERTIES = 419;
  int PURGE = 420;
  int READS = 421;
  int REF = 422;
  int REFERENCING = 423;
  int RENAME = 424;
  int RESET = 425;
  int RESULT = 426;
  int RETAIN = 427;
  int RETURNING = 428;
  int RR = 429;
  int RS = 430;
  int STATISTICS = 431;
  int SEQUENCE = 432;
  int SEQUENTIAL = 433;
  int SETS = 434;
  int SHARE = 435;
  int SQLID = 436;
  int SPECIFIC = 437;
  int SQRT = 438;
  int STABILITY = 439;
  int STRIP = 440;
  int STYLE = 441;
  int TRIGGER = 442;
  int TRUNCATE_END = 443;
  int UCASE = 444;
  int UR = 445;
  int WHITESPACE = 446;
  int DOUBLE_QUOTE = 447;
  int PERCENT = 448;
  int AMPERSAND = 449;
  int QUOTE = 450;
  int LEFT_BRACE = 451;
  int RIGHT_BRACE = 452;
  int LEFT_PAREN = 453;
  int RIGHT_PAREN = 454;
  int ASTERISK = 455;
  int HASH = 456;
  int PLUS_SIGN = 457;
  int COMMA = 458;
  int MINUS_SIGN = 459;
  int PERIOD = 460;
  int SOLIDUS = 461;
  int COLON = 462;
  int DOUBLE_COLON = 463;
  int SEMICOLON = 464;
  int LESS_THAN_OPERATOR = 465;
  int LESS_THAN_OR_EQUALS_OPERATOR = 466;
  int EQUALS_OPERATOR = 467;
  int NOT_EQUALS_OPERATOR = 468;
  int NOT_EQUALS_OPERATOR2 = 469;
  int GREATER_THAN_OPERATOR = 470;
  int GREATER_THAN_OR_EQUALS_OPERATOR = 471;
  int QUESTION_MARK = 472;
  int UNDERSCORE = 473;
  int VERTICAL_BAR = 474;
  int LEFT_BRACKET = 475;
  int RIGHT_BRACKET = 476;
  int CONCATENATION_OPERATOR = 477;
  int FIELD_REFERENCE = 478;
  int ELLIPSIS = 479;
  int IDENTIFIER = 480;
  int K = 481;
  int M = 482;
  int G = 483;
  int LETTER = 484;
  int DIGIT = 485;
  int DELIMITED_IDENTIFIER = 486;
  int EXACT_NUMERIC = 487;
  int UINT = 488;
  int LENGTH_MODIFIER = 489;
  int STRING = 490;
  int HEX_STRING = 491;
  int APPROXIMATE_NUMERIC = 492;
  int INTERVAL_LITERAL = 493;
  int INTERVAL_STRING = 494;
  int INTERVAL_QUALIFIER = 495;
  int SINGLE_DATETIME_FIELD = 496;
  int START_FIELD = 497;
  int END_FIELD = 498;
  int NON_SECOND_DATETIME_FIELD = 499;
  int YEAR_MONTH_LITERAL = 500;
  int DAY_TIME_LITERAL = 501;
  int DAY_TIME_INTERVAL = 502;
  int SECONDS_VALUE = 503;
  int TIME_INTERVAL = 504;

  int DEFAULT = 0;
  int IN_BRACKETED_COMMENT = 1;
  int IN_NESTED_BRACKETED_COMMENT = 2;
  int IN_COMMENT = 3;
  int LOOKFOR_DE = 4;
  int LOOKFOR_DER = 5;
  int LOOKFOR_DERB = 6;
  int LOOKFOR_DERBY = 7;
  int LOOKFOR_DERBYDASH = 8;
  int LOOKFOR_DERBYDASHP = 9;
  int LOOKFOR_DERBYDASHPR = 10;
  int LOOKFOR_DERBYDASHPRO = 11;
  int LOOKFOR_DERBYDASHPROP = 12;
  int LOOKFOR_DERBYDASHPROPE = 13;
  int LOOKFOR_DERBYDASHPROPER = 14;
  int LOOKFOR_DERBYDASHPROPERT = 15;
  int LOOKFOR_DERBYDASHPROPERTI = 16;
  int LOOKFOR_DERBYDASHPROPERTIE = 17;
  int LOOKFOR_DERBYDASHPROPERTIES = 18;
  int IT_IS_NOT_DERBYPROPERTIES_COMMENT = 19;
  int PROPERTIES_LIST = 20;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"/*\"",
    "\"/*\"",
    "\"*/\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 10>",
    "\"--\"",
    "\" \"",
    "\"\\t\"",
    "\"D\"",
    "<token of kind 15>",
    "<NOT_D>",
    "\"E\"",
    "<token of kind 18>",
    "<NOT_DE>",
    "\"R\"",
    "<token of kind 21>",
    "<NOT_DER>",
    "\"B\"",
    "<token of kind 24>",
    "<NOT_DERB>",
    "\"Y\"",
    "<token of kind 27>",
    "<NOT_DERBY>",
    "\"-\"",
    "<token of kind 30>",
    "<NOT_DERBYDASH>",
    "\"P\"",
    "<token of kind 33>",
    "<NOT_DERBYDASHP>",
    "\"R\"",
    "<token of kind 36>",
    "<NOT_DERBYDASHPR>",
    "\"O\"",
    "<token of kind 39>",
    "<NOT_DERBYDASHPRO>",
    "\"P\"",
    "<token of kind 42>",
    "<NOT_DERBYDASHPROP>",
    "\"E\"",
    "<token of kind 45>",
    "<NOT_DERBYDASHPROPE>",
    "\"R\"",
    "<token of kind 48>",
    "<NOT_DERBYDASHPROPER>",
    "\"T\"",
    "<token of kind 51>",
    "<NOT_DERBYDASHPROPERT>",
    "\"I\"",
    "<token of kind 54>",
    "<NOT_DERBYDASHPROPERTI>",
    "\"E\"",
    "<token of kind 57>",
    "<NOT_DERBYDASHPROPERTIE>",
    "\"DERBYDASHPROPERTIES\"",
    "\"S\"",
    "<token of kind 61>",
    "<NOT_PROPERTIES>",
    "<SINGLE_LINE_SQLCOMMENT>",
    "<CHECK_PROPERTIES>",
    "\"add\"",
    "\"all\"",
    "\"allocate\"",
    "\"alter\"",
    "\"and\"",
    "\"any\"",
    "\"are\"",
    "\"as\"",
    "\"asc\"",
    "\"assertion\"",
    "\"at\"",
    "\"authorization\"",
    "\"avg\"",
    "\"begin\"",
    "\"between\"",
    "\"binary\"",
    "\"bit\"",
    "\"both\"",
    "\"by\"",
    "\"cascade\"",
    "\"cascaded\"",
    "\"case\"",
    "\"cast\"",
    "\"char\"",
    "\"character\"",
    "\"character_length\"",
    "\"check\"",
    "\"close\"",
    "\"coalesce\"",
    "\"collate\"",
    "\"collation\"",
    "\"column\"",
    "\"commit\"",
    "\"connect\"",
    "\"connection\"",
    "\"constraint\"",
    "\"constraints\"",
    "\"continue\"",
    "\"convert\"",
    "\"corresponding\"",
    "\"count\"",
    "\"create\"",
    "\"cross\"",
    "\"current\"",
    "\"current_date\"",
    "\"current_time\"",
    "\"current_timestamp\"",
    "\"current_user\"",
    "\"cursor\"",
    "\"d\"",
    "\"deallocate\"",
    "\"dec\"",
    "\"decimal\"",
    "\"declare\"",
    "\"default\"",
    "\"deferrable\"",
    "\"deferred\"",
    "\"delete\"",
    "\"desc\"",
    "\"describe\"",
    "\"diagnostics\"",
    "\"disconnect\"",
    "\"distinct\"",
    "\"double\"",
    "\"drop\"",
    "\"else\"",
    "\"end\"",
    "\"end-exec\"",
    "\"escape\"",
    "\"except\"",
    "\"exception\"",
    "\"exec\"",
    "\"execute\"",
    "\"exists\"",
    "\"external\"",
    "\"false\"",
    "\"fetch\"",
    "\"first\"",
    "\"float\"",
    "\"for\"",
    "\"foreign\"",
    "\"found\"",
    "\"from\"",
    "\"full\"",
    "\"function\"",
    "\"get\"",
    "\"global\"",
    "\"go\"",
    "\"goto\"",
    "\"grant\"",
    "\"group\"",
    "\"having\"",
    "\"hour\"",
    "\"identity\"",
    "\"immediate\"",
    "\"in\"",
    "\"indicator\"",
    "\"initially\"",
    "\"inner\"",
    "\"input\"",
    "\"insensitive\"",
    "\"insert\"",
    "\"int\"",
    "\"integer\"",
    "\"intersect\"",
    "\"into\"",
    "\"is\"",
    "\"isolation\"",
    "\"join\"",
    "\"key\"",
    "\"last\"",
    "\"leading\"",
    "\"left\"",
    "\"like\"",
    "\"lower\"",
    "\"match\"",
    "\"max\"",
    "\"min\"",
    "\"minute\"",
    "\"module\"",
    "\"national\"",
    "\"natural\"",
    "\"nchar\"",
    "\"next\"",
    "\"no\"",
    "\"not\"",
    "\"null\"",
    "\"nullif\"",
    "\"numeric\"",
    "\"of\"",
    "\"on\"",
    "\"only\"",
    "\"open\"",
    "\"option\"",
    "\"or\"",
    "\"order\"",
    "\"outer\"",
    "\"output\"",
    "\"overlaps\"",
    "\"pad\"",
    "\"partial\"",
    "\"prepare\"",
    "\"preserve\"",
    "\"primary\"",
    "\"prior\"",
    "\"privileges\"",
    "\"procedure\"",
    "\"public\"",
    "\"read\"",
    "\"real\"",
    "\"references\"",
    "\"relative\"",
    "\"restrict\"",
    "\"revoke\"",
    "\"right\"",
    "\"rollback\"",
    "\"rows\"",
    "\"schema\"",
    "\"scroll\"",
    "\"second\"",
    "\"select\"",
    "\"session_user\"",
    "\"set\"",
    "\"smallint\"",
    "\"some\"",
    "\"space\"",
    "\"sql\"",
    "\"sqlcode\"",
    "\"sqlerror\"",
    "\"sqlstate\"",
    "\"substring\"",
    "\"sum\"",
    "\"system_user\"",
    "\"t\"",
    "\"table\"",
    "\"temporary\"",
    "\"timezone_hour\"",
    "\"timezone_minute\"",
    "\"to\"",
    "\"transaction\"",
    "\"translate\"",
    "\"translation\"",
    "\"trailing\"",
    "\"trim\"",
    "\"true\"",
    "\"ts\"",
    "\"union\"",
    "\"unique\"",
    "\"unknown\"",
    "\"update\"",
    "\"upper\"",
    "\"user\"",
    "\"using\"",
    "\"value\"",
    "\"values\"",
    "\"varbinary\"",
    "\"varchar\"",
    "\"varying\"",
    "\"view\"",
    "\"whenever\"",
    "\"where\"",
    "\"window\"",
    "\"with\"",
    "\"work\"",
    "\"write\"",
    "\"year\"",
    "\"abs\"",
    "\"absval\"",
    "\"action\"",
    "\"always\"",
    "\"blob\"",
    "\"c\"",
    "\"called\"",
    "\"clob\"",
    "\"cobol\"",
    "\"committed\"",
    "\"concat\"",
    "\"contains\"",
    "\"cycle\"",
    "\"data\"",
    "\"date\"",
    "\"day\"",
    "\"definer\"",
    "\"deterministic\"",
    "\"dynamic\"",
    "\"enforced\"",
    "\"fortran\"",
    "\"generated\"",
    "\"identity_val_local\"",
    "\"increment\"",
    "\"initial\"",
    "\"inout\"",
    "\"interval\"",
    "\"invoker\"",
    "\"language\"",
    "\"large\"",
    "\"length\"",
    "\"level\"",
    "\"limit\"",
    "\"locks\"",
    "\"locksize\"",
    "\"logged\"",
    "\"matched\"",
    "\"maxvalue\"",
    "\"merge\"",
    "\"minvalue\"",
    "\"mod\"",
    "\"modifies\"",
    "\"modify\"",
    "\"month\"",
    "\"more\"",
    "\"mumps\"",
    "\"name\"",
    "\"nclob\"",
    "\"nullable\"",
    "\"nulls\"",
    "\"number\"",
    "\"object\"",
    "\"offset\"",
    "\"pascal\"",
    "\"pli\"",
    "\"precision\"",
    "\"release\"",
    "\"repeatable\"",
    "\"restart\"",
    "\"returns\"",
    "\"rollup\"",
    "\"row\"",
    "\"savepoint\"",
    "\"scale\"",
    "\"security\"",
    "\"serializable\"",
    "\"sql_tsi_frac_second\"",
    "\"sql_tsi_second\"",
    "\"sql_tsi_minute\"",
    "\"sql_tsi_hour\"",
    "\"sql_tsi_day\"",
    "\"sql_tsi_week\"",
    "\"sql_tsi_month\"",
    "\"sql_tsi_quarter\"",
    "\"sql_tsi_year\"",
    "\"start\"",
    "\"statement\"",
    "\"synonym\"",
    "\"then\"",
    "\"time\"",
    "\"timestamp\"",
    "\"timestampadd\"",
    "\"timestampdiff\"",
    "\"truncate\"",
    "\"type\"",
    "\"uncommitted\"",
    "\"usage\"",
    "\"when\"",
    "\"--derbyplan\"",
    "\"boolean\"",
    "\"call\"",
    "\"curdate\"",
    "\"current_role\"",
    "\"curtime\"",
    "\"database\"",
    "\"getCurrentConnection\"",
    "\"explain\"",
    "\"bigint\"",
    "\"long\"",
    "\"ltrim\"",
    "\"none\"",
    "\"over\"",
    "\"role\"",
    "\"row_number\"",
    "\"rtrim\"",
    "\"substr\"",
    "\"xml\"",
    "\"xmlexists\"",
    "\"xmlparse\"",
    "\"xmlquery\"",
    "\"xmlserialize\"",
    "\"after\"",
    "\"aggregate\"",
    "\"before\"",
    "\"class\"",
    "\"compress\"",
    "\"content\"",
    "\"cs\"",
    "\"cursors\"",
    "\"db2sql\"",
    "\"derby\"",
    "\"derby_jdbc_result_set\"",
    "\"defragment\"",
    "\"dirty\"",
    "\"document\"",
    "\"each\"",
    "\"empty\"",
    "\"exclusive\"",
    "\"fn\"",
    "\"index\"",
    "\"inplace\"",
    "\"java\"",
    "\"lcase\"",
    "\"locate\"",
    "\"lock\"",
    "\"message_locale\"",
    "\"method\"",
    "\"mode\"",
    "\"new\"",
    "\"new_table\"",
    "\"nvarchar\"",
    "\"oj\"",
    "\"off\"",
    "\"old\"",
    "\"old_table\"",
    "\"out\"",
    "\"parameter\"",
    "\"passing\"",
    "\"properties\"",
    "\"purge\"",
    "\"reads\"",
    "\"ref\"",
    "\"referencing\"",
    "\"rename\"",
    "\"reset\"",
    "\"result\"",
    "\"retain\"",
    "\"returning\"",
    "\"rr\"",
    "\"rs\"",
    "\"statistics\"",
    "\"sequence\"",
    "\"sequential\"",
    "\"sets\"",
    "\"share\"",
    "\"sqlid\"",
    "\"specific\"",
    "\"sqrt\"",
    "\"stability\"",
    "\"strip\"",
    "\"style\"",
    "\"trigger\"",
    "\"truncate_end\"",
    "\"ucase\"",
    "\"ur\"",
    "\"whitespace\"",
    "\"\\\"\"",
    "\"%\"",
    "\"&\"",
    "\"\\\'\"",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\"*\"",
    "\"#\"",
    "\"+\"",
    "\",\"",
    "\"-\"",
    "\".\"",
    "\"/\"",
    "\":\"",
    "\"::\"",
    "\";\"",
    "\"<\"",
    "\"<=\"",
    "\"=\"",
    "\"<>\"",
    "\"!=\"",
    "\">\"",
    "\">=\"",
    "\"?\"",
    "\"_\"",
    "\"|\"",
    "\"[\"",
    "\"]\"",
    "\"||\"",
    "\"->\"",
    "\"...\"",
    "<IDENTIFIER>",
    "\"K\"",
    "\"M\"",
    "\"G\"",
    "<LETTER>",
    "<DIGIT>",
    "<DELIMITED_IDENTIFIER>",
    "<EXACT_NUMERIC>",
    "<UINT>",
    "<LENGTH_MODIFIER>",
    "<STRING>",
    "<HEX_STRING>",
    "<APPROXIMATE_NUMERIC>",
    "<INTERVAL_LITERAL>",
    "<INTERVAL_STRING>",
    "<INTERVAL_QUALIFIER>",
    "<SINGLE_DATETIME_FIELD>",
    "<START_FIELD>",
    "<END_FIELD>",
    "<NON_SECOND_DATETIME_FIELD>",
    "<YEAR_MONTH_LITERAL>",
    "<DAY_TIME_LITERAL>",
    "<DAY_TIME_INTERVAL>",
    "<SECONDS_VALUE>",
    "<TIME_INTERVAL>",
  };

}
