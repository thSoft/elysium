package org.lilypond.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalLilyPondLexer extends Lexer {
    public static final int RULE_WS_CHAR=5;
    public static final int RULE_TOPLEVELEXPRESSION=4;
    public static final int Tokens=8;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=6;
    public static final int RULE_ML_COMMENT=7;
    public InternalLilyPondLexer() {;} 
    public InternalLilyPondLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g"; }

    // $ANTLR start RULE_TOPLEVELEXPRESSION
    public final void mRULE_TOPLEVELEXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_TOPLEVELEXPRESSION;
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:107:25: ( (~ ( RULE_WS_CHAR ) )+ )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:107:27: (~ ( RULE_WS_CHAR ) )+
            {
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:107:27: (~ ( RULE_WS_CHAR ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:107:27: ~ ( RULE_WS_CHAR )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFE') ) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_TOPLEVELEXPRESSION

    // $ANTLR start RULE_WS_CHAR
    public final void mRULE_WS_CHAR() throws RecognitionException {
        try {
            int _type = RULE_WS_CHAR;
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:14: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:16: ( ' ' | '\\t' | '\\r' | '\\n' )
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS_CHAR

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:39: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:40: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:40: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:40: '\\r'
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
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:113:17: ( '%{' ( options {greedy=false; } : . )* '%}' )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:113:19: '%{' ( options {greedy=false; } : . )* '%}'
            {
            match("%{"); 

            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:113:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='%') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='}') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='|')||(LA5_1>='~' && LA5_1<='\uFFFE')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='$')||(LA5_0>='&' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:113:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:8: ( RULE_TOPLEVELEXPRESSION | RULE_WS_CHAR | RULE_SL_COMMENT | RULE_ML_COMMENT )
        int alt6=4;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:10: RULE_TOPLEVELEXPRESSION
                {
                mRULE_TOPLEVELEXPRESSION(); 

                }
                break;
            case 2 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:34: RULE_WS_CHAR
                {
                mRULE_WS_CHAR(); 

                }
                break;
            case 3 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:47: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 4 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:63: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\3\2\uffff\2\3\1\uffff\1\3\1\uffff\1\6\1\3\1\6\1\3\1\uffff"+
        "\2\6";
    static final String DFA6_eofS =
        "\20\uffff";
    static final String DFA6_minS =
        "\2\0\2\uffff\2\0\1\uffff\6\0\1\uffff\2\0";
    static final String DFA6_maxS =
        "\2\ufffe\2\uffff\2\ufffe\1\uffff\6\ufffe\1\uffff\2\ufffe";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\1\2\uffff\1\3\6\uffff\1\4\2\uffff";
    static final String DFA6_specialS =
        "\20\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\3\2\2\2\3\1\2\22\3\1\2\4\3\1\1\uffd9\3",
            "\11\5\2\6\2\5\1\6\22\5\1\6\132\5\1\4\uff83\5",
            "",
            "",
            "\11\12\1\13\1\11\2\12\1\10\22\12\1\13\4\12\1\7\uffd9\12",
            "\11\5\2\6\2\5\1\6\22\5\1\6\uffde\5",
            "",
            "\11\12\1\13\1\11\2\12\1\10\22\12\1\13\4\12\1\7\127\12\1\14\uff81"+
            "\12",
            "\12\15\1\11\ufff4\15",
            "\uffff\15",
            "\11\12\1\13\1\11\2\12\1\10\22\12\1\13\4\12\1\7\uffd9\12",
            "\12\13\1\11\2\13\1\10\27\13\1\16\uffd9\13",
            "\11\12\1\13\1\11\2\12\1\10\22\12\1\13\4\12\1\7\uffd9\12",
            "",
            "\12\13\1\11\2\13\1\10\27\13\1\16\127\13\1\17\uff81\13",
            "\12\13\1\11\2\13\1\10\27\13\1\16\uffd9\13"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_TOPLEVELEXPRESSION | RULE_WS_CHAR | RULE_SL_COMMENT | RULE_ML_COMMENT );";
        }
    }
 

}