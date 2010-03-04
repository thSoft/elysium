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
    public static final int RULE_WS=6;
    public static final int Tokens=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=8;
    public InternalLilyPondLexer() {;} 
    public InternalLilyPondLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g"; }

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:105:9: ( ( RULE_WS_CHAR )+ )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:105:11: ( RULE_WS_CHAR )+
            {
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:105:11: ( RULE_WS_CHAR )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:105:11: RULE_WS_CHAR
            	    {
            	    mRULE_WS_CHAR(); 

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
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_WS_CHAR
    public final void mRULE_WS_CHAR() throws RecognitionException {
        try {
            int _type = RULE_WS_CHAR;
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:107:14: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:107:16: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:23: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:39: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:40: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:40: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:109:40: '\\r'
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
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:17: ( '%{' ( options {greedy=false; } : . )* '%}' )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:19: '%{' ( options {greedy=false; } : . )* '%}'
            {
            match("%{"); 

            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:24: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:111:52: .
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

    // $ANTLR start RULE_TOPLEVELEXPRESSION
    public final void mRULE_TOPLEVELEXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_TOPLEVELEXPRESSION;
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:113:25: ( (~ ( RULE_WS_CHAR ) )+ )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:113:27: (~ ( RULE_WS_CHAR ) )+
            {
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:113:27: (~ ( RULE_WS_CHAR ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||(LA6_0>='!' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:113:27: ~ ( RULE_WS_CHAR )
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
    // $ANTLR end RULE_TOPLEVELEXPRESSION

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:8: ( RULE_WS | RULE_WS_CHAR | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_TOPLEVELEXPRESSION )
        int alt7=5;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:10: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 2 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:18: RULE_WS_CHAR
                {
                mRULE_WS_CHAR(); 

                }
                break;
            case 3 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:31: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 4 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:47: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 5 :
                // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:1:63: RULE_TOPLEVELEXPRESSION
                {
                mRULE_TOPLEVELEXPRESSION(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\2\uffff\1\7\2\uffff\2\7\2\uffff\4\7\1\uffff\3\7";
    static final String DFA7_eofS =
        "\21\uffff";
    static final String DFA7_minS =
        "\1\0\1\uffff\1\0\2\uffff\2\0\1\uffff\5\0\1\uffff\3\0";
    static final String DFA7_maxS =
        "\1\ufffe\1\uffff\1\ufffe\2\uffff\2\ufffe\1\uffff\5\ufffe\1\uffff"+
        "\3\ufffe";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\uffff\1\5\1\1\2\uffff\1\3\5\uffff\1\4\3\uffff";
    static final String DFA7_specialS =
        "\21\uffff}>";
    static final String[] DFA7_transitionS = {
            "\11\3\2\1\2\3\1\1\22\3\1\1\4\3\1\2\uffd9\3",
            "",
            "\11\6\2\uffff\2\6\1\uffff\22\6\1\uffff\132\6\1\5\uff83\6",
            "",
            "",
            "\11\14\1\13\1\11\2\14\1\10\22\14\1\13\4\14\1\12\uffd9\14",
            "\11\6\2\uffff\2\6\1\uffff\22\6\1\uffff\uffde\6",
            "",
            "\12\15\1\11\ufff4\15",
            "\uffff\15",
            "\11\14\1\13\1\11\2\14\1\10\22\14\1\13\4\14\1\12\127\14\1\16"+
            "\uff81\14",
            "\12\13\1\11\2\13\1\10\27\13\1\17\uffd9\13",
            "\11\14\1\13\1\11\2\14\1\10\22\14\1\13\4\14\1\12\uffd9\14",
            "",
            "\11\14\1\13\1\11\2\14\1\10\22\14\1\13\4\14\1\12\uffd9\14",
            "\12\13\1\11\2\13\1\10\27\13\1\17\127\13\1\20\uff81\13",
            "\12\13\1\11\2\13\1\10\27\13\1\17\uffd9\13"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_WS | RULE_WS_CHAR | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_TOPLEVELEXPRESSION );";
        }
    }
 

}