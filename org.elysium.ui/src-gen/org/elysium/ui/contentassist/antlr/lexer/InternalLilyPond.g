
/*
* generated by Xtext
*/
lexer grammar InternalLilyPond;

options {
	backtrack=true;
	memoize=true;
}

tokens {
	KEYWORD_1;
	KEYWORD_2;
	KEYWORD_3;
	KEYWORD_4;
	KEYWORD_5;
	KEYWORD_6;
	KEYWORD_7;
	KEYWORD_8;
	KEYWORD_9;
	KEYWORD_10;
	KEYWORD_11;
	KEYWORD_12;
	KEYWORD_13;
	KEYWORD_14;
	KEYWORD_15;
	KEYWORD_16;
	KEYWORD_17;
	KEYWORD_18;
	RULE_STRING;
	RULE_INT;
	RULE_BOOL;
	RULE_ID;
	RULE_WS;
	RULE_SL_COMMENT;
	RULE_ML_COMMENT;
	RULE_ANY_OTHER;
}

@header {
package org.elysium.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}



SYNTHETIC_ALL_KEYWORDS :
	(FRAGMENT_KEYWORD_1)=> FRAGMENT_KEYWORD_1 {$type = KEYWORD_1; } |
	(FRAGMENT_KEYWORD_2)=> FRAGMENT_KEYWORD_2 {$type = KEYWORD_2; } |
	(FRAGMENT_KEYWORD_3)=> FRAGMENT_KEYWORD_3 {$type = KEYWORD_3; } |
	(FRAGMENT_KEYWORD_4)=> FRAGMENT_KEYWORD_4 {$type = KEYWORD_4; } |
	(FRAGMENT_KEYWORD_5)=> FRAGMENT_KEYWORD_5 {$type = KEYWORD_5; } |
	(FRAGMENT_KEYWORD_6)=> FRAGMENT_KEYWORD_6 {$type = KEYWORD_6; } |
	(FRAGMENT_KEYWORD_7)=> FRAGMENT_KEYWORD_7 {$type = KEYWORD_7; } |
	(FRAGMENT_KEYWORD_8)=> FRAGMENT_KEYWORD_8 {$type = KEYWORD_8; } |
	(FRAGMENT_KEYWORD_9)=> FRAGMENT_KEYWORD_9 {$type = KEYWORD_9; } |
	(FRAGMENT_KEYWORD_10)=> FRAGMENT_KEYWORD_10 {$type = KEYWORD_10; } |
	(FRAGMENT_KEYWORD_11)=> FRAGMENT_KEYWORD_11 {$type = KEYWORD_11; } |
	(FRAGMENT_KEYWORD_12)=> FRAGMENT_KEYWORD_12 {$type = KEYWORD_12; } |
	(FRAGMENT_KEYWORD_13)=> FRAGMENT_KEYWORD_13 {$type = KEYWORD_13; } |
	(FRAGMENT_KEYWORD_14)=> FRAGMENT_KEYWORD_14 {$type = KEYWORD_14; } |
	(FRAGMENT_KEYWORD_15)=> FRAGMENT_KEYWORD_15 {$type = KEYWORD_15; } |
	(FRAGMENT_KEYWORD_16)=> FRAGMENT_KEYWORD_16 {$type = KEYWORD_16; } |
	(FRAGMENT_KEYWORD_17)=> FRAGMENT_KEYWORD_17 {$type = KEYWORD_17; } |
	(FRAGMENT_KEYWORD_18)=> FRAGMENT_KEYWORD_18 {$type = KEYWORD_18; } |
	(FRAGMENT_RULE_STRING)=> FRAGMENT_RULE_STRING {$type = RULE_STRING; } |
	(FRAGMENT_RULE_INT)=> FRAGMENT_RULE_INT {$type = RULE_INT; } |
	(FRAGMENT_RULE_BOOL)=> FRAGMENT_RULE_BOOL {$type = RULE_BOOL; } |
	(FRAGMENT_RULE_ID)=> FRAGMENT_RULE_ID {$type = RULE_ID; } |
	(FRAGMENT_RULE_WS)=> FRAGMENT_RULE_WS {$type = RULE_WS; } |
	(FRAGMENT_RULE_SL_COMMENT)=> FRAGMENT_RULE_SL_COMMENT {$type = RULE_SL_COMMENT; } |
	(FRAGMENT_RULE_ML_COMMENT)=> FRAGMENT_RULE_ML_COMMENT {$type = RULE_ML_COMMENT; } |
	(FRAGMENT_RULE_ANY_OTHER)=> FRAGMENT_RULE_ANY_OTHER {$type = RULE_ANY_OTHER; } ;

fragment FRAGMENT_KEYWORD_1 : '#';

fragment FRAGMENT_KEYWORD_2 : '\'';

fragment FRAGMENT_KEYWORD_3 : '(';

fragment FRAGMENT_KEYWORD_4 : ')';

fragment FRAGMENT_KEYWORD_5 : ',';

fragment FRAGMENT_KEYWORD_6 : '\\';

fragment FRAGMENT_KEYWORD_7 : '`';

fragment FRAGMENT_KEYWORD_8 : '{';

fragment FRAGMENT_KEYWORD_9 : '}';

fragment FRAGMENT_KEYWORD_10 : '#:';

fragment FRAGMENT_KEYWORD_11 : '#x';

fragment FRAGMENT_KEYWORD_12 : '#{';

fragment FRAGMENT_KEYWORD_13 : '#}';

fragment FRAGMENT_KEYWORD_14 : '<<';

fragment FRAGMENT_KEYWORD_15 : '>>';

fragment FRAGMENT_KEYWORD_16 : '\\\\';

fragment FRAGMENT_KEYWORD_17 : '\\include';

fragment FRAGMENT_KEYWORD_18 : '\\version';


// Rules duplicated to allow inter-rule references

fragment RULE_STRING : FRAGMENT_RULE_STRING;
fragment FRAGMENT_RULE_STRING : '"' ('\\' ('b'|'t'|'n'|' f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

fragment RULE_INT : FRAGMENT_RULE_INT;
fragment FRAGMENT_RULE_INT : ('0'..'9')+;

fragment RULE_BOOL : FRAGMENT_RULE_BOOL;
fragment FRAGMENT_RULE_BOOL : ('#f'|'#t');

fragment RULE_ID : FRAGMENT_RULE_ID;
fragment FRAGMENT_RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'-')*;

fragment RULE_WS : FRAGMENT_RULE_WS;
fragment FRAGMENT_RULE_WS : (' '|'\t'|'\r'|'\n')+;

fragment RULE_SL_COMMENT : FRAGMENT_RULE_SL_COMMENT;
fragment FRAGMENT_RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_ML_COMMENT : FRAGMENT_RULE_ML_COMMENT;
fragment FRAGMENT_RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';

fragment RULE_ANY_OTHER : FRAGMENT_RULE_ANY_OTHER;
fragment FRAGMENT_RULE_ANY_OTHER : .;



