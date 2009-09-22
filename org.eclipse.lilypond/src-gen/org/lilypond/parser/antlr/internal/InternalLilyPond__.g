lexer grammar InternalLilyPond;
@header {
package org.lilypond.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

// $ANTLR src "../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g" 112
RULE_DUMMY : (~('\n')* '\n')* ~('\n')*;


