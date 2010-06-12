package org.elysium.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyPondLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_BOOL=4;
    public static final int Tokens=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=8;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalLilyPondLexer() {;} 
    public InternalLilyPondLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:10:5: ( '{' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:10:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:11:5: ( '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:11:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:12:5: ( '<<' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:12:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:13:5: ( '>>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:13:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:14:5: ( '#' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:14:7: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:15:5: ( '\\'' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:15:7: '\\''
            {
            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:16:5: ( '(' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:16:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:17:5: ( ')' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:17:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:18:5: ( '\\\\\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:18:7: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:19:5: ( '\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:19:7: '\\\\'
            {
            match('\\'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:20:5: ( 'include' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:20:7: 'include'
            {
            match("include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:21:5: ( 'version' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:21:7: 'version'
            {
            match("version"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:22:5: ( ',' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:22:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:19: ( '\\\\' ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:20: '\\\\' ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:25: ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    int alt1=8;
            	    switch ( input.LA(1) ) {
            	    case 'b':
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 't':
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 'n':
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case ' ':
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case 'r':
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    case '\"':
            	        {
            	        alt1=6;
            	        }
            	        break;
            	    case '\'':
            	        {
            	        alt1=7;
            	        }
            	        break;
            	    case '\\':
            	        {
            	        alt1=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("1503:25: ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:26: 'b'
            	            {
            	            match('b'); 

            	            }
            	            break;
            	        case 2 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:30: 't'
            	            {
            	            match('t'); 

            	            }
            	            break;
            	        case 3 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:34: 'n'
            	            {
            	            match('n'); 

            	            }
            	            break;
            	        case 4 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:38: ' f'
            	            {
            	            match(" f"); 


            	            }
            	            break;
            	        case 5 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:43: 'r'
            	            {
            	            match('r'); 

            	            }
            	            break;
            	        case 6 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:47: '\"'
            	            {
            	            match('\"'); 

            	            }
            	            break;
            	        case 7 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:51: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 8 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:56: '\\\\'
            	            {
            	            match('\\'); 

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:62: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop2;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1505:10: ( ( '0' .. '9' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1505:12: ( '0' .. '9' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1505:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1505:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_BOOL
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1507:11: ( ( '#f' | '#t' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1507:13: ( '#f' | '#t' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1507:13: ( '#f' | '#t' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='t') ) {
                    alt4=2;
                }
                else if ( (LA4_1=='f') ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1507:13: ( '#f' | '#t' )", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1507:13: ( '#f' | '#t' )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1507:14: '#f'
                    {
                    match("#f"); 


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1507:19: '#t'
                    {
                    match("#t"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BOOL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1509:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1509:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1509:31: ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-'||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:
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
            	    break loop5;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1511:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1513:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1513:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1513:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1513:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1513:39: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1513:40: ( '\\r' )? '\\n'
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1513:40: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1513:40: '\\r'
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1515:17: ( '%{' ( options {greedy=false; } : . )* '%}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1515:19: '%{' ( options {greedy=false; } : . )* '%}'
            {
            match("%{"); 

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1515:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='%') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='}') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='|')||(LA10_1>='~' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='$')||(LA10_0>='&' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1515:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1517:16: ( . )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1517:18: .
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
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_STRING | RULE_INT | RULE_BOOL | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ANY_OTHER )
        int alt11=21;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:62: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:74: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:83: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 17 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:93: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:101: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:109: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:125: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:141: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\3\uffff\2\22\1\30\3\uffff\1\35\2\37\1\uffff\1\22\3\uffff\1\46\14"+
        "\uffff\1\37\1\uffff\1\37\4\uffff\1\46\1\uffff\2\37\1\46\1\uffff"+
        "\2\46\2\37\1\46\1\uffff\4\37\1\67\1\70\2\uffff";
    static final String DFA11_eofS =
        "\71\uffff";
    static final String DFA11_minS =
        "\1\0\2\uffff\1\74\1\76\1\146\3\uffff\1\134\1\156\1\145\1\uffff\1"+
        "\0\3\uffff\1\173\14\uffff\1\143\1\uffff\1\162\4\uffff\1\0\1\uffff"+
        "\1\154\1\163\4\0\1\165\1\151\1\0\1\uffff\1\144\1\157\1\145\1\156"+
        "\2\55\2\uffff";
    static final String DFA11_maxS =
        "\1\ufffe\2\uffff\1\74\1\76\1\164\3\uffff\1\134\1\156\1\145\1\uffff"+
        "\1\ufffe\3\uffff\1\173\14\uffff\1\143\1\uffff\1\162\4\uffff\1\ufffe"+
        "\1\uffff\1\154\1\163\4\ufffe\1\165\1\151\1\ufffe\1\uffff\1\144\1"+
        "\157\1\145\1\156\2\172\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\1\7\1\10\3\uffff\1\15\1\uffff\1\17"+
        "\1\21\1\22\1\uffff\1\25\1\1\1\2\1\3\1\4\1\20\1\5\1\6\1\7\1\10\1"+
        "\11\1\12\1\uffff\1\21\1\uffff\1\15\1\16\1\17\1\22\1\uffff\1\23\11"+
        "\uffff\1\24\6\uffff\1\13\1\14";
    static final String DFA11_specialS =
        "\71\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\22\2\20\2\22\1\20\22\22\1\20\1\22\1\15\1\5\1\22\1\21\1\22"+
            "\1\6\1\7\1\10\2\22\1\14\3\22\12\16\2\22\1\3\1\22\1\4\2\22\32"+
            "\17\1\22\1\11\4\22\10\17\1\12\14\17\1\13\4\17\1\1\1\22\1\2\uff81"+
            "\22",
            "",
            "",
            "\1\25",
            "\1\26",
            "\1\27\15\uffff\1\27",
            "",
            "",
            "",
            "\1\34",
            "\1\36",
            "\1\40",
            "",
            "\uffff\42",
            "",
            "",
            "",
            "\1\45",
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
            "\1\47",
            "",
            "\1\50",
            "",
            "",
            "",
            "",
            "\12\54\1\53\2\54\1\52\27\54\1\51\uffd9\54",
            "",
            "\1\55",
            "\1\56",
            "\12\54\1\53\2\54\1\52\27\54\1\51\127\54\1\57\uff81\54",
            "\12\60\1\53\ufff4\60",
            "\uffff\60",
            "\12\54\1\53\2\54\1\52\27\54\1\51\uffd9\54",
            "\1\61",
            "\1\62",
            "\12\54\1\53\2\54\1\52\27\54\1\51\uffd9\54",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\37\23\uffff\32\37\6\uffff\32\37",
            "\1\37\23\uffff\32\37\6\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_STRING | RULE_INT | RULE_BOOL | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ANY_OTHER );";
        }
    }
 

}