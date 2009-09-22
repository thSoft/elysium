package org.lilypond.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalLilyPondLexer extends Lexer {
    public static final int RULE_DUMMY=4;
    public static final int Tokens=5;
    public static final int EOF=-1;
    public InternalLilyPondLexer() {;} 
    public InternalLilyPondLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g"; }

    // $ANTLR start RULE_DUMMY
    public final void mRULE_DUMMY() throws RecognitionException {
        try {
            int _type = RULE_DUMMY;
            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:112:12: ( ( (~ ( '\\n' ) )* '\\n' )* (~ ( '\\n' ) )* )
            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:112:14: ( (~ ( '\\n' ) )* '\\n' )* (~ ( '\\n' ) )*
            {
            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:112:14: ( (~ ( '\\n' ) )* '\\n' )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:112:15: (~ ( '\\n' ) )* '\\n'
            	    {
            	    // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:112:15: (~ ( '\\n' ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFE')) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:112:15: ~ ( '\\n' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFE') ) {
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

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:112:31: (~ ( '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:112:31: ~ ( '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFE') ) {
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
    // $ANTLR end RULE_DUMMY

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:1:8: ( RULE_DUMMY )
        // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:1:10: RULE_DUMMY
        {
        mRULE_DUMMY(); 

        }


    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\2\2\2\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\2\0\2\uffff";
    static final String DFA2_maxS =
        "\2\ufffe\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\12\1\1\3\ufff4\1",
            "\12\1\1\3\ufff4\1",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 112:14: ( (~ ( '\\n' ) )* '\\n' )*";
        }
    }
 

}