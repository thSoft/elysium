lexer grammar InternalLilyPond;
@header {
package org.lilypond.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

// $ANTLR src "../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g" 107
RULE_TOPLEVELEXPRESSION : ~(RULE_WS_CHAR)+;

// $ANTLR src "../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g" 109
RULE_WS_CHAR : (' '|'\t'|'\r'|'\n');

// $ANTLR src "../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g" 111
RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g" 113
RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';


