lexer grammar InternalLilyPond;
@header {
package org.lilypond.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

// $ANTLR src "../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g" 112
RULE_WS : RULE_WS_CHAR+;

// $ANTLR src "../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g" 114
RULE_WS_CHAR : (' '|'\t'|'\r'|'\n');

// $ANTLR src "../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g" 116
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g" 118
RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';

// $ANTLR src "../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g" 120
RULE_TOPLEVELEXPRESSION : ~(RULE_WS_CHAR)+;


