package org.elysium.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyPondLexer extends Lexer {
    public static final int RULE_ID=35;
    public static final int RULE_SCHEME_SL_COMMENT=39;
    public static final int RULE_ANY_OTHER=41;
    public static final int KEYWORD_19=8;
    public static final int KEYWORD_1=15;
    public static final int KEYWORD_17=31;
    public static final int KEYWORD_18=32;
    public static final int KEYWORD_15=29;
    public static final int KEYWORD_5=19;
    public static final int KEYWORD_16=30;
    public static final int KEYWORD_4=18;
    public static final int KEYWORD_13=27;
    public static final int KEYWORD_3=17;
    public static final int KEYWORD_14=28;
    public static final int KEYWORD_2=16;
    public static final int KEYWORD_11=25;
    public static final int Tokens=42;
    public static final int RULE_SL_COMMENT=37;
    public static final int KEYWORD_12=26;
    public static final int EOF=-1;
    public static final int KEYWORD_10=24;
    public static final int RULE_ML_COMMENT=38;
    public static final int RULE_STRING=33;
    public static final int KEYWORD_6=20;
    public static final int KEYWORD_7=21;
    public static final int KEYWORD_8=22;
    public static final int KEYWORD_9=23;
    public static final int KEYWORD_28=6;
    public static final int RULE_SCHEME_ML_COMMENT=40;
    public static final int KEYWORD_29=4;
    public static final int RULE_INT=34;
    public static final int KEYWORD_24=13;
    public static final int KEYWORD_25=14;
    public static final int KEYWORD_26=7;
    public static final int KEYWORD_27=5;
    public static final int RULE_WS=36;
    public static final int KEYWORD_20=9;
    public static final int KEYWORD_21=10;
    public static final int KEYWORD_22=11;
    public static final int KEYWORD_23=12;
    public InternalLilyPondLexer() {;} 
    public InternalLilyPondLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g"; }

    // $ANTLR start KEYWORD_29
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:19:12: ( 'markuplines' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:19:14: 'markuplines'
            {
            match("markuplines"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_29

    // $ANTLR start KEYWORD_27
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:21:12: ( 'include' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:21:14: 'include'
            {
            match("include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_27

    // $ANTLR start KEYWORD_28
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:23:12: ( 'version' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:23:14: 'version'
            {
            match("version"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_28

    // $ANTLR start KEYWORD_26
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:25:12: ( 'markup' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:25:14: 'markup'
            {
            match("markup"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_26

    // $ANTLR start KEYWORD_19
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:27:12: ( '#:' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:27:14: '#:'
            {
            match("#:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_19

    // $ANTLR start KEYWORD_20
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:29:12: ( '#\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:29:14: '#\\\\'
            {
            match("#\\"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_20

    // $ANTLR start KEYWORD_21
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:31:12: ( '#{' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:31:14: '#{'
            {
            match("#{"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_21

    // $ANTLR start KEYWORD_22
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:33:12: ( '#}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:33:14: '#}'
            {
            match("#}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_22

    // $ANTLR start KEYWORD_23
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:35:12: ( '<<' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:35:14: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_23

    // $ANTLR start KEYWORD_24
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:37:12: ( '>>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:37:14: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_24

    // $ANTLR start KEYWORD_25
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:39:12: ( '\\\\\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:39:14: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_25

    // $ANTLR start KEYWORD_1
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:41:11: ( '!' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:41:13: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_1

    // $ANTLR start KEYWORD_2
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:43:11: ( '#' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:43:13: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_2

    // $ANTLR start KEYWORD_3
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:45:11: ( '$' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:45:13: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_3

    // $ANTLR start KEYWORD_4
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:47:11: ( '\\'' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:47:13: '\\''
            {
            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_4

    // $ANTLR start KEYWORD_5
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:49:11: ( '(' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:49:13: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_5

    // $ANTLR start KEYWORD_6
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:51:11: ( ')' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:51:13: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_6

    // $ANTLR start KEYWORD_7
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:53:11: ( '+' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:53:13: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_7

    // $ANTLR start KEYWORD_8
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:55:11: ( ',' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:55:13: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_8

    // $ANTLR start KEYWORD_9
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:57:11: ( '<' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:57:13: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_9

    // $ANTLR start KEYWORD_10
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:59:12: ( '=' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:59:14: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_10

    // $ANTLR start KEYWORD_11
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:61:12: ( '>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:61:14: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_11

    // $ANTLR start KEYWORD_12
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:63:12: ( '[' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:63:14: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_12

    // $ANTLR start KEYWORD_13
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:65:12: ( '\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:65:14: '\\\\'
            {
            match('\\'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_13

    // $ANTLR start KEYWORD_14
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:67:12: ( ']' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:67:14: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_14

    // $ANTLR start KEYWORD_15
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:69:12: ( '`' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:69:14: '`'
            {
            match('`'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_15

    // $ANTLR start KEYWORD_16
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:71:12: ( '{' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:71:14: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_16

    // $ANTLR start KEYWORD_17
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:73:12: ( '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:73:14: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_17

    // $ANTLR start KEYWORD_18
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:75:12: ( '~' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:75:14: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_18

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:79:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:79:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:79:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFE')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:79:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:79:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:81:10: ( ( '0' .. '9' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:81:12: ( '0' .. '9' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:81:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:81:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:83:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:83:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:83:31: ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:85:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:85:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:85:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:39: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:40: ( '\\r' )? '\\n'
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:40: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:89:17: ( '%{' ( options {greedy=false; } : . )* '%}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:89:19: '%{' ( options {greedy=false; } : . )* '%}'
            {
            match("%{"); 

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:89:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='%') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='}') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='|')||(LA8_1>='~' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='$')||(LA8_0>='&' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:89:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("%}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SCHEME_SL_COMMENT
    public final void mRULE_SCHEME_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SCHEME_SL_COMMENT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:24: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:26: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(';'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:30: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:46: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:47: ( '\\r' )? '\\n'
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:47: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:47: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SCHEME_SL_COMMENT

    // $ANTLR start RULE_SCHEME_ML_COMMENT
    public final void mRULE_SCHEME_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SCHEME_ML_COMMENT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:93:24: ( '#!' ( options {greedy=false; } : . )* '!#' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:93:26: '#!' ( options {greedy=false; } : . )* '!#'
            {
            match("#!"); 

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:93:31: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='!') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='#') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='\"')||(LA12_1>='$' && LA12_1<='\uFFFE')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=' ')||(LA12_0>='\"' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:93:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("!#"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SCHEME_ML_COMMENT

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:95:16: ( . )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:95:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:8: ( KEYWORD_29 | KEYWORD_27 | KEYWORD_28 | KEYWORD_26 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | RULE_STRING | RULE_INT | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_SCHEME_SL_COMMENT | RULE_SCHEME_ML_COMMENT | RULE_ANY_OTHER )
        int alt13=38;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:10: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:21: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 3 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:32: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 4 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:43: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 5 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:54: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 6 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:65: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 7 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:76: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 8 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:87: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 9 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:98: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 10 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:109: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 11 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:120: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 12 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:131: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 13 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:141: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 14 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:151: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 15 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:161: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 16 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:171: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 17 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:181: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 18 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:191: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 19 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:201: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 20 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:211: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 21 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:221: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 22 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:232: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 23 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:243: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 24 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:254: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 25 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:265: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 26 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:276: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 27 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:287: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 28 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:298: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 29 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:309: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 30 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:320: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:332: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:341: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:349: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:357: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:373: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:389: RULE_SCHEME_SL_COMMENT
                {
                mRULE_SCHEME_SL_COMMENT(); 

                }
                break;
            case 37 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:412: RULE_SCHEME_ML_COMMENT
                {
                mRULE_SCHEME_ML_COMMENT(); 

                }
                break;
            case 38 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:435: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\36\1\46\1\50\1\52\1\54\16\uffff\1\34\3\uffff\1\77\2\uffff"+
        "\1\36\1\uffff\2\36\35\uffff\1\77\2\uffff\3\36\1\77\1\uffff\2\77"+
        "\3\36\1\77\1\uffff\3\36\1\124\3\36\1\uffff\1\130\1\131\1\36\2\uffff"+
        "\2\36\1\135\1\uffff";
    static final String DFA13_eofS =
        "\136\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\156\1\145\1\41\1\74\1\76\1\134\16\uffff\1\0\3\uffff"+
        "\1\173\2\uffff\1\162\1\uffff\1\143\1\162\35\uffff\1\0\2\uffff\1"+
        "\153\1\154\1\163\4\0\2\165\1\151\1\0\1\uffff\1\160\1\144\1\157\1"+
        "\55\1\145\1\156\1\151\1\uffff\2\55\1\156\2\uffff\1\145\1\163\1\55"+
        "\1\uffff";
    static final String DFA13_maxS =
        "\1\ufffe\1\141\1\156\1\145\1\175\1\74\1\76\1\134\16\uffff\1\ufffe"+
        "\3\uffff\1\173\2\uffff\1\162\1\uffff\1\143\1\162\35\uffff\1\ufffe"+
        "\2\uffff\1\153\1\154\1\163\4\ufffe\2\165\1\151\1\ufffe\1\uffff\1"+
        "\160\1\144\1\157\1\172\1\145\1\156\1\151\1\uffff\2\172\1\156\2\uffff"+
        "\1\145\1\163\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\10\uffff\1\14\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\27\1\31\1\32"+
        "\1\33\1\34\1\35\1\uffff\1\37\1\40\1\41\1\uffff\1\44\1\46\1\uffff"+
        "\1\40\2\uffff\1\5\1\10\1\7\1\6\1\45\1\15\1\11\1\24\1\12\1\26\1\13"+
        "\1\30\1\14\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\27\1\31\1\32\1\33"+
        "\1\34\1\35\1\36\1\37\1\41\1\uffff\1\42\1\44\13\uffff\1\43\7\uffff"+
        "\1\4\3\uffff\1\2\1\3\3\uffff\1\1";
    static final String DFA13_specialS =
        "\136\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\34\2\31\2\34\1\31\22\34\1\31\1\10\1\26\1\4\1\11\1\32\1\34"+
            "\1\12\1\13\1\14\1\34\1\15\1\16\3\34\12\27\1\34\1\33\1\5\1\17"+
            "\1\6\2\34\32\30\1\20\1\7\1\21\2\34\1\22\10\30\1\2\3\30\1\1\10"+
            "\30\1\3\4\30\1\23\1\34\1\24\1\25\uff80\34",
            "\1\35",
            "\1\37",
            "\1\40",
            "\1\45\30\uffff\1\41\41\uffff\1\44\36\uffff\1\43\1\uffff\1\42",
            "\1\47",
            "\1\51",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\uffff\73",
            "",
            "",
            "",
            "\1\76",
            "",
            "",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\107\1\106\2\107\1\105\27\107\1\104\uffd9\107",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\107\1\106\2\107\1\105\27\107\1\104\127\107\1\113\uff81\107",
            "\12\114\1\106\ufff4\114",
            "\uffff\114",
            "\12\107\1\106\2\107\1\105\27\107\1\104\uffd9\107",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\107\1\106\2\107\1\105\27\107\1\104\uffd9\107",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\36\23\uffff\32\36\6\uffff\13\36\1\123\16\36",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\36\23\uffff\32\36\6\uffff\32\36",
            "\1\36\23\uffff\32\36\6\uffff\32\36",
            "\1\132",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\36\23\uffff\32\36\6\uffff\32\36",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_29 | KEYWORD_27 | KEYWORD_28 | KEYWORD_26 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | RULE_STRING | RULE_INT | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_SCHEME_SL_COMMENT | RULE_SCHEME_ML_COMMENT | RULE_ANY_OTHER );";
        }
    }
 

}