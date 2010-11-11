
/*
* generated by Xtext
*/
lexer grammar InternalLilyPond;


@header {
package org.elysium.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_88 : 'grobdescriptions';

KEYWORD_86 : 'sourcefileline';

KEYWORD_87 : 'sourcefilename';

KEYWORD_84 : 'defaultchild';

KEYWORD_85 : 'simultaneous';

KEYWORD_81 : 'alternative';

KEYWORD_82 : 'description';

KEYWORD_83 : 'markuplines';

KEYWORD_79 : 'figuremode';

KEYWORD_80 : 'sequential';

KEYWORD_74 : 'addlyrics';

KEYWORD_75 : 'chordmode';

KEYWORD_76 : 'lyricmode';

KEYWORD_77 : 'maininput';

KEYWORD_78 : 'transpose';

KEYWORD_66 : 'bookpart';

KEYWORD_67 : 'consists';

KEYWORD_68 : 'drummode';

KEYWORD_69 : 'lyricsto';

KEYWORD_70 : 'notemode';

KEYWORD_71 : 'objectid';

KEYWORD_72 : 'override';

KEYWORD_73 : 'relative';

KEYWORD_59 : 'accepts';

KEYWORD_60 : 'context';

KEYWORD_61 : 'default';

KEYWORD_62 : 'figures';

KEYWORD_63 : 'include';

KEYWORD_64 : 'partial';

KEYWORD_65 : 'version';

KEYWORD_48 : 'change';

KEYWORD_49 : 'chords';

KEYWORD_50 : 'denies';

KEYWORD_51 : 'header';

KEYWORD_52 : 'layout';

KEYWORD_53 : 'lyrics';

KEYWORD_54 : 'markup';

KEYWORD_55 : 'octave';

KEYWORD_56 : 'remove';

KEYWORD_57 : 'repeat';

KEYWORD_58 : 'revert';

KEYWORD_41 : 'alias';

KEYWORD_42 : 'drums';

KEYWORD_43 : 'paper';

KEYWORD_44 : 'score';

KEYWORD_45 : 'tempo';

KEYWORD_46 : 'times';

KEYWORD_47 : 'unset';

KEYWORD_31 : 'book';

KEYWORD_32 : 'mark';

KEYWORD_33 : 'midi';

KEYWORD_34 : 'name';

KEYWORD_35 : 'once';

KEYWORD_36 : 'rest';

KEYWORD_37 : 'skip';

KEYWORD_38 : 'time';

KEYWORD_39 : 'type';

KEYWORD_40 : 'with';

KEYWORD_28 : 'key';

KEYWORD_29 : 'new';

KEYWORD_30 : 'set';

KEYWORD_21 : '#:';

KEYWORD_22 : '#\\';

KEYWORD_23 : '#{';

KEYWORD_24 : '#}';

KEYWORD_25 : '<<';

KEYWORD_26 : '>>';

KEYWORD_27 : '\\\\';

KEYWORD_1 : '!';

KEYWORD_2 : '#';

KEYWORD_3 : '$';

KEYWORD_4 : '\'';

KEYWORD_5 : '(';

KEYWORD_6 : ')';

KEYWORD_7 : '+';

KEYWORD_8 : ',';

KEYWORD_9 : '-';

KEYWORD_10 : ':';

KEYWORD_11 : '<';

KEYWORD_12 : '=';

KEYWORD_13 : '>';

KEYWORD_14 : '[';

KEYWORD_15 : '\\';

KEYWORD_16 : ']';

KEYWORD_17 : '`';

KEYWORD_18 : '{';

KEYWORD_19 : '}';

KEYWORD_20 : '~';



RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_INT : ('0'..'9')+;

RULE_ALPHA : ('a'..'z'|'A'..'Z')+;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';

RULE_SCHEME_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_SCHEME_ML_COMMENT : '#!' ( options {greedy=false;} : . )*'!#';

RULE_ANY_OTHER : .;



