lexer grammar InternalLilyPond;
@header {
package org.elysium.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : '{' ;
T13 : '}' ;
T14 : '<<' ;
T15 : '>>' ;
T16 : '#' ;
T17 : '\'' ;
T18 : '(' ;
T19 : ')' ;
T20 : '#{' ;
T21 : '#}' ;
T22 : '\\\\' ;
T23 : '\\' ;
T24 : 'include' ;
T25 : 'version' ;
T26 : ',' ;

// $ANTLR src "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g" 1585
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|' f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g" 1587
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g" 1589
RULE_BOOL : ('#f'|'#t');

// $ANTLR src "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g" 1591
RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'-')*;

// $ANTLR src "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g" 1593
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g" 1595
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g" 1597
RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';

// $ANTLR src "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g" 1599
RULE_ANY_OTHER : .;


