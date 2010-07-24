lexer grammar InternalLilyPond;
@header {
package org.elysium.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '\\\\' ;
T13 : '(' ;
T14 : ')' ;
T15 : '\'' ;
T16 : ',' ;
T17 : '{' ;
T18 : '}' ;
T19 : '<<' ;
T20 : '>>' ;
T21 : '#' ;
T22 : '#{' ;
T23 : '#}' ;
T24 : '\\' ;
T25 : 'include' ;
T26 : 'version' ;

// $ANTLR src "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g" 2194
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|' f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g" 2196
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g" 2198
RULE_BOOL : ('#f'|'#t');

// $ANTLR src "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g" 2200
RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'-')*;

// $ANTLR src "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g" 2202
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g" 2204
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g" 2206
RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';

// $ANTLR src "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g" 2208
RULE_ANY_OTHER : .;


