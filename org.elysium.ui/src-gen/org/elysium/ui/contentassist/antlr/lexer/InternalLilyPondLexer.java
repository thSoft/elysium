package org.elysium.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLilyPondLexer extends Lexer {
    public static final int RULE_ID=25;
    public static final int RULE_ANY_OTHER=29;
    public static final int FRAGMENT_KEYWORD_3=32;
    public static final int FRAGMENT_KEYWORD_4=33;
    public static final int FRAGMENT_KEYWORD_1=30;
    public static final int FRAGMENT_KEYWORD_2=31;
    public static final int FRAGMENT_KEYWORD_8=37;
    public static final int RULE_BOOL=24;
    public static final int FRAGMENT_KEYWORD_7=36;
    public static final int KEYWORD_17=20;
    public static final int FRAGMENT_KEYWORD_6=35;
    public static final int KEYWORD_18=21;
    public static final int FRAGMENT_KEYWORD_5=34;
    public static final int KEYWORD_15=18;
    public static final int KEYWORD_16=19;
    public static final int KEYWORD_13=16;
    public static final int FRAGMENT_RULE_BOOL=50;
    public static final int KEYWORD_14=17;
    public static final int FRAGMENT_KEYWORD_9=38;
    public static final int KEYWORD_11=14;
    public static final int KEYWORD_12=15;
    public static final int EOF=-1;
    public static final int KEYWORD_10=13;
    public static final int KEYWORD_6=9;
    public static final int KEYWORD_7=10;
    public static final int KEYWORD_8=11;
    public static final int KEYWORD_9=12;
    public static final int RULE_INT=23;
    public static final int FRAGMENT_RULE_SL_COMMENT=53;
    public static final int KEYWORD_1=4;
    public static final int FRAGMENT_RULE_ID=51;
    public static final int KEYWORD_5=8;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_3=6;
    public static final int KEYWORD_2=5;
    public static final int Tokens=57;
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_ML_COMMENT=28;
    public static final int FRAGMENT_KEYWORD_15=44;
    public static final int FRAGMENT_KEYWORD_14=43;
    public static final int FRAGMENT_KEYWORD_17=46;
    public static final int FRAGMENT_KEYWORD_16=45;
    public static final int RULE_STRING=22;
    public static final int FRAGMENT_KEYWORD_18=47;
    public static final int SYNTHETIC_ALL_KEYWORDS=56;
    public static final int FRAGMENT_RULE_STRING=48;
    public static final int FRAGMENT_RULE_INT=49;
    public static final int FRAGMENT_KEYWORD_11=40;
    public static final int FRAGMENT_KEYWORD_10=39;
    public static final int FRAGMENT_KEYWORD_13=42;
    public static final int FRAGMENT_KEYWORD_12=41;
    public static final int FRAGMENT_RULE_ML_COMMENT=54;
    public static final int FRAGMENT_RULE_WS=52;
    public static final int FRAGMENT_RULE_ANY_OTHER=55;
    public static final int RULE_WS=26;
    public InternalLilyPondLexer() {;} 
    public InternalLilyPondLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[88+1];
     }
    public String getGrammarFileName() { return "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g"; }

    // $ANTLR start SYNTHETIC_ALL_KEYWORDS
    public final void mSYNTHETIC_ALL_KEYWORDS() throws RecognitionException {
        int SYNTHETIC_ALL_KEYWORDS_StartIndex = input.index();
        try {
            int _type = SYNTHETIC_ALL_KEYWORDS;
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:51:24: ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER )
            int alt1=26;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='#') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='x') && (synpred9())) {
                    alt1=9;
                }
                else if ( (LA1_1=='{') && (synpred10())) {
                    alt1=10;
                }
                else if ( (LA1_1=='}') && (synpred11())) {
                    alt1=11;
                }
                else if ( (LA1_1=='t') && (synpred21())) {
                    alt1=21;
                }
                else if ( (LA1_1=='f') && (synpred21())) {
                    alt1=21;
                }
                else if ( (synpred1()) ) {
                    alt1=1;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='\'') ) {
                int LA1_2 = input.LA(2);

                if ( (synpred2()) ) {
                    alt1=2;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='(') ) {
                int LA1_3 = input.LA(2);

                if ( (synpred3()) ) {
                    alt1=3;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==')') ) {
                int LA1_4 = input.LA(2);

                if ( (synpred4()) ) {
                    alt1=4;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==',') ) {
                int LA1_5 = input.LA(2);

                if ( (synpred5()) ) {
                    alt1=5;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 5, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='\\') ) {
                int LA1_6 = input.LA(2);

                if ( (LA1_6=='v') && (synpred16())) {
                    alt1=16;
                }
                else if ( (LA1_6=='s') ) {
                    int LA1_28 = input.LA(3);

                    if ( (LA1_28=='o') ) {
                        int LA1_45 = input.LA(4);

                        if ( (LA1_45=='u') ) {
                            int LA1_46 = input.LA(5);

                            if ( (LA1_46=='r') ) {
                                int LA1_47 = input.LA(6);

                                if ( (LA1_47=='c') ) {
                                    int LA1_48 = input.LA(7);

                                    if ( (LA1_48=='e') ) {
                                        int LA1_49 = input.LA(8);

                                        if ( (LA1_49=='f') ) {
                                            int LA1_50 = input.LA(9);

                                            if ( (LA1_50=='i') ) {
                                                int LA1_51 = input.LA(10);

                                                if ( (LA1_51=='l') ) {
                                                    int LA1_52 = input.LA(11);

                                                    if ( (LA1_52=='e') ) {
                                                        int LA1_53 = input.LA(12);

                                                        if ( (LA1_53=='n') && (synpred18())) {
                                                            alt1=18;
                                                        }
                                                        else if ( (LA1_53=='l') && (synpred17())) {
                                                            alt1=17;
                                                        }
                                                        else {
                                                            if (backtracking>0) {failed=true; return ;}
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 53, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        if (backtracking>0) {failed=true; return ;}
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 52, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    if (backtracking>0) {failed=true; return ;}
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 51, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 50, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return ;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 49, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 48, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 47, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 46, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 45, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 28, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_6=='\\') && (synpred14())) {
                    alt1=14;
                }
                else if ( (LA1_6=='i') && (synpred15())) {
                    alt1=15;
                }
                else if ( (synpred6()) ) {
                    alt1=6;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 6, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='{') ) {
                int LA1_7 = input.LA(2);

                if ( (synpred7()) ) {
                    alt1=7;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 7, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='}') ) {
                int LA1_8 = input.LA(2);

                if ( (synpred8()) ) {
                    alt1=8;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 8, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='<') ) {
                int LA1_9 = input.LA(2);

                if ( (LA1_9=='<') && (synpred12())) {
                    alt1=12;
                }
                else {
                    alt1=26;}
            }
            else if ( (LA1_0=='>') ) {
                int LA1_10 = input.LA(2);

                if ( (LA1_10=='>') && (synpred13())) {
                    alt1=13;
                }
                else {
                    alt1=26;}
            }
            else if ( (LA1_0=='\"') ) {
                int LA1_11 = input.LA(2);

                if ( (LA1_11=='\\') && (synpred19())) {
                    alt1=19;
                }
                else if ( ((LA1_11>='\u0000' && LA1_11<='!')||(LA1_11>='#' && LA1_11<='[')||(LA1_11>=']' && LA1_11<='\uFFFE')) && (synpred19())) {
                    alt1=19;
                }
                else if ( (LA1_11=='\"') && (synpred19())) {
                    alt1=19;
                }
                else {
                    alt1=26;}
            }
            else if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                int LA1_12 = input.LA(2);

                if ( (synpred20()) ) {
                    alt1=20;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 12, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                int LA1_13 = input.LA(2);

                if ( (synpred22()) ) {
                    alt1=22;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 13, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                int LA1_14 = input.LA(2);

                if ( (synpred23()) ) {
                    alt1=23;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 14, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='%') ) {
                int LA1_15 = input.LA(2);

                if ( (LA1_15=='{') && (synpred25())) {
                    alt1=25;
                }
                else if ( (synpred24()) ) {
                    alt1=24;
                }
                else if ( (synpred26()) ) {
                    alt1=26;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 15, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||LA1_0=='!'||LA1_0=='$'||LA1_0=='&'||(LA1_0>='*' && LA1_0<='+')||(LA1_0>='-' && LA1_0<='/')||(LA1_0>=':' && LA1_0<=';')||LA1_0=='='||(LA1_0>='?' && LA1_0<='@')||LA1_0=='['||(LA1_0>=']' && LA1_0<='`')||LA1_0=='|'||(LA1_0>='~' && LA1_0<='\uFFFE')) && (synpred26())) {
                alt1=26;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("51:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10 | ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11 | ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12 | ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13 | ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14 | ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15 | ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16 | ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17 | ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18 | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:52:2: ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1
                    {
                    mFRAGMENT_KEYWORD_1(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_1; 
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:53:2: ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2
                    {
                    mFRAGMENT_KEYWORD_2(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_2; 
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:54:2: ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3
                    {
                    mFRAGMENT_KEYWORD_3(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_3; 
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:55:2: ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4
                    {
                    mFRAGMENT_KEYWORD_4(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_4; 
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:56:2: ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5
                    {
                    mFRAGMENT_KEYWORD_5(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_5; 
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:57:2: ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6
                    {
                    mFRAGMENT_KEYWORD_6(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_6; 
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:58:2: ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7
                    {
                    mFRAGMENT_KEYWORD_7(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_7; 
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:59:2: ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8
                    {
                    mFRAGMENT_KEYWORD_8(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_8; 
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:60:2: ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9
                    {
                    mFRAGMENT_KEYWORD_9(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_9; 
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:61:2: ( FRAGMENT_KEYWORD_10 )=> FRAGMENT_KEYWORD_10
                    {
                    mFRAGMENT_KEYWORD_10(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_10; 
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:62:2: ( FRAGMENT_KEYWORD_11 )=> FRAGMENT_KEYWORD_11
                    {
                    mFRAGMENT_KEYWORD_11(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_11; 
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:63:2: ( FRAGMENT_KEYWORD_12 )=> FRAGMENT_KEYWORD_12
                    {
                    mFRAGMENT_KEYWORD_12(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_12; 
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:64:2: ( FRAGMENT_KEYWORD_13 )=> FRAGMENT_KEYWORD_13
                    {
                    mFRAGMENT_KEYWORD_13(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_13; 
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:65:2: ( FRAGMENT_KEYWORD_14 )=> FRAGMENT_KEYWORD_14
                    {
                    mFRAGMENT_KEYWORD_14(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_14; 
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:66:2: ( FRAGMENT_KEYWORD_15 )=> FRAGMENT_KEYWORD_15
                    {
                    mFRAGMENT_KEYWORD_15(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_15; 
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:67:2: ( FRAGMENT_KEYWORD_16 )=> FRAGMENT_KEYWORD_16
                    {
                    mFRAGMENT_KEYWORD_16(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_16; 
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:68:2: ( FRAGMENT_KEYWORD_17 )=> FRAGMENT_KEYWORD_17
                    {
                    mFRAGMENT_KEYWORD_17(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_17; 
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:69:2: ( FRAGMENT_KEYWORD_18 )=> FRAGMENT_KEYWORD_18
                    {
                    mFRAGMENT_KEYWORD_18(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = KEYWORD_18; 
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:70:2: ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING
                    {
                    mFRAGMENT_RULE_STRING(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = RULE_STRING; 
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:71:2: ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT
                    {
                    mFRAGMENT_RULE_INT(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = RULE_INT; 
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:72:2: ( FRAGMENT_RULE_BOOL )=> FRAGMENT_RULE_BOOL
                    {
                    mFRAGMENT_RULE_BOOL(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = RULE_BOOL; 
                    }

                    }
                    break;
                case 22 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:73:2: ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID
                    {
                    mFRAGMENT_RULE_ID(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = RULE_ID; 
                    }

                    }
                    break;
                case 23 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:74:2: ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS
                    {
                    mFRAGMENT_RULE_WS(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = RULE_WS; 
                    }

                    }
                    break;
                case 24 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:75:2: ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT
                    {
                    mFRAGMENT_RULE_SL_COMMENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = RULE_SL_COMMENT; 
                    }

                    }
                    break;
                case 25 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:76:2: ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT
                    {
                    mFRAGMENT_RULE_ML_COMMENT(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = RULE_ML_COMMENT; 
                    }

                    }
                    break;
                case 26 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:77:2: ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER
                    {
                    mFRAGMENT_RULE_ANY_OTHER(); if (failed) return ;
                    if ( backtracking==0 ) {
                      _type = RULE_ANY_OTHER; 
                    }

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, SYNTHETIC_ALL_KEYWORDS_StartIndex); }
        }
    }
    // $ANTLR end SYNTHETIC_ALL_KEYWORDS

    // $ANTLR start FRAGMENT_KEYWORD_1
    public final void mFRAGMENT_KEYWORD_1() throws RecognitionException {
        int FRAGMENT_KEYWORD_1_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:79:29: ( '#' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:79:31: '#'
            {
            match('#'); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, FRAGMENT_KEYWORD_1_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_1

    // $ANTLR start FRAGMENT_KEYWORD_2
    public final void mFRAGMENT_KEYWORD_2() throws RecognitionException {
        int FRAGMENT_KEYWORD_2_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:81:29: ( '\\'' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:81:31: '\\''
            {
            match('\''); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, FRAGMENT_KEYWORD_2_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_2

    // $ANTLR start FRAGMENT_KEYWORD_3
    public final void mFRAGMENT_KEYWORD_3() throws RecognitionException {
        int FRAGMENT_KEYWORD_3_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:83:29: ( '(' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:83:31: '('
            {
            match('('); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, FRAGMENT_KEYWORD_3_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_3

    // $ANTLR start FRAGMENT_KEYWORD_4
    public final void mFRAGMENT_KEYWORD_4() throws RecognitionException {
        int FRAGMENT_KEYWORD_4_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:85:29: ( ')' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:85:31: ')'
            {
            match(')'); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, FRAGMENT_KEYWORD_4_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_4

    // $ANTLR start FRAGMENT_KEYWORD_5
    public final void mFRAGMENT_KEYWORD_5() throws RecognitionException {
        int FRAGMENT_KEYWORD_5_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:87:29: ( ',' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:87:31: ','
            {
            match(','); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, FRAGMENT_KEYWORD_5_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_5

    // $ANTLR start FRAGMENT_KEYWORD_6
    public final void mFRAGMENT_KEYWORD_6() throws RecognitionException {
        int FRAGMENT_KEYWORD_6_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:89:29: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:89:31: '\\\\'
            {
            match('\\'); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, FRAGMENT_KEYWORD_6_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_6

    // $ANTLR start FRAGMENT_KEYWORD_7
    public final void mFRAGMENT_KEYWORD_7() throws RecognitionException {
        int FRAGMENT_KEYWORD_7_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:91:29: ( '{' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:91:31: '{'
            {
            match('{'); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, FRAGMENT_KEYWORD_7_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_7

    // $ANTLR start FRAGMENT_KEYWORD_8
    public final void mFRAGMENT_KEYWORD_8() throws RecognitionException {
        int FRAGMENT_KEYWORD_8_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:93:29: ( '}' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:93:31: '}'
            {
            match('}'); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, FRAGMENT_KEYWORD_8_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_8

    // $ANTLR start FRAGMENT_KEYWORD_9
    public final void mFRAGMENT_KEYWORD_9() throws RecognitionException {
        int FRAGMENT_KEYWORD_9_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:95:29: ( '#x' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:95:31: '#x'
            {
            match("#x"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, FRAGMENT_KEYWORD_9_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_9

    // $ANTLR start FRAGMENT_KEYWORD_10
    public final void mFRAGMENT_KEYWORD_10() throws RecognitionException {
        int FRAGMENT_KEYWORD_10_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:97:30: ( '#{' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:97:32: '#{'
            {
            match("#{"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, FRAGMENT_KEYWORD_10_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_10

    // $ANTLR start FRAGMENT_KEYWORD_11
    public final void mFRAGMENT_KEYWORD_11() throws RecognitionException {
        int FRAGMENT_KEYWORD_11_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:99:30: ( '#}' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:99:32: '#}'
            {
            match("#}"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, FRAGMENT_KEYWORD_11_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_11

    // $ANTLR start FRAGMENT_KEYWORD_12
    public final void mFRAGMENT_KEYWORD_12() throws RecognitionException {
        int FRAGMENT_KEYWORD_12_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:101:30: ( '<<' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:101:32: '<<'
            {
            match("<<"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, FRAGMENT_KEYWORD_12_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_12

    // $ANTLR start FRAGMENT_KEYWORD_13
    public final void mFRAGMENT_KEYWORD_13() throws RecognitionException {
        int FRAGMENT_KEYWORD_13_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:103:30: ( '>>' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:103:32: '>>'
            {
            match(">>"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, FRAGMENT_KEYWORD_13_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_13

    // $ANTLR start FRAGMENT_KEYWORD_14
    public final void mFRAGMENT_KEYWORD_14() throws RecognitionException {
        int FRAGMENT_KEYWORD_14_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:105:30: ( '\\\\\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:105:32: '\\\\\\\\'
            {
            match("\\\\"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, FRAGMENT_KEYWORD_14_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_14

    // $ANTLR start FRAGMENT_KEYWORD_15
    public final void mFRAGMENT_KEYWORD_15() throws RecognitionException {
        int FRAGMENT_KEYWORD_15_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:107:30: ( '\\\\include' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:107:32: '\\\\include'
            {
            match("\\include"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, FRAGMENT_KEYWORD_15_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_15

    // $ANTLR start FRAGMENT_KEYWORD_16
    public final void mFRAGMENT_KEYWORD_16() throws RecognitionException {
        int FRAGMENT_KEYWORD_16_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:109:30: ( '\\\\version' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:109:32: '\\\\version'
            {
            match("\\version"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, FRAGMENT_KEYWORD_16_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_16

    // $ANTLR start FRAGMENT_KEYWORD_17
    public final void mFRAGMENT_KEYWORD_17() throws RecognitionException {
        int FRAGMENT_KEYWORD_17_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:111:30: ( '\\\\sourcefileline' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:111:32: '\\\\sourcefileline'
            {
            match("\\sourcefileline"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, FRAGMENT_KEYWORD_17_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_17

    // $ANTLR start FRAGMENT_KEYWORD_18
    public final void mFRAGMENT_KEYWORD_18() throws RecognitionException {
        int FRAGMENT_KEYWORD_18_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:113:30: ( '\\\\sourcefilename' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:113:32: '\\\\sourcefilename'
            {
            match("\\sourcefilename"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, FRAGMENT_KEYWORD_18_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_KEYWORD_18

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        int RULE_STRING_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:118:22: ( FRAGMENT_RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:118:24: FRAGMENT_RULE_STRING
            {
            mFRAGMENT_RULE_STRING(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, RULE_STRING_StartIndex); }
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start FRAGMENT_RULE_STRING
    public final void mFRAGMENT_RULE_STRING() throws RecognitionException {
        int FRAGMENT_RULE_STRING_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:31: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:33: '\"' ( '\\\\' ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); if (failed) return ;
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:37: ( '\\\\' ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:38: '\\\\' ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); if (failed) return ;
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:43: ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    int alt2=8;
            	    switch ( input.LA(1) ) {
            	    case 'b':
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 't':
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 'n':
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    case ' ':
            	        {
            	        alt2=4;
            	        }
            	        break;
            	    case 'r':
            	        {
            	        alt2=5;
            	        }
            	        break;
            	    case '\"':
            	        {
            	        alt2=6;
            	        }
            	        break;
            	    case '\'':
            	        {
            	        alt2=7;
            	        }
            	        break;
            	    case '\\':
            	        {
            	        alt2=8;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("119:43: ( 'b' | 't' | 'n' | ' f' | 'r' | '\"' | '\\'' | '\\\\' )", 2, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:44: 'b'
            	            {
            	            match('b'); if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:48: 't'
            	            {
            	            match('t'); if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:52: 'n'
            	            {
            	            match('n'); if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:56: ' f'
            	            {
            	            match(" f"); if (failed) return ;


            	            }
            	            break;
            	        case 5 :
            	            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:61: 'r'
            	            {
            	            match('r'); if (failed) return ;

            	            }
            	            break;
            	        case 6 :
            	            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:65: '\"'
            	            {
            	            match('\"'); if (failed) return ;

            	            }
            	            break;
            	        case 7 :
            	            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:69: '\\''
            	            {
            	            match('\''); if (failed) return ;

            	            }
            	            break;
            	        case 8 :
            	            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:74: '\\\\'
            	            {
            	            match('\\'); if (failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:119:80: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
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

            match('\"'); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, FRAGMENT_RULE_STRING_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_RULE_STRING

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        int RULE_INT_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:121:19: ( FRAGMENT_RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:121:21: FRAGMENT_RULE_INT
            {
            mFRAGMENT_RULE_INT(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 22, RULE_INT_StartIndex); }
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start FRAGMENT_RULE_INT
    public final void mFRAGMENT_RULE_INT() throws RecognitionException {
        int FRAGMENT_RULE_INT_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:122:28: ( ( '0' .. '9' )+ )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:122:30: ( '0' .. '9' )+
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:122:30: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:122:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, FRAGMENT_RULE_INT_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_RULE_INT

    // $ANTLR start RULE_BOOL
    public final void mRULE_BOOL() throws RecognitionException {
        int RULE_BOOL_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:124:20: ( FRAGMENT_RULE_BOOL )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:124:22: FRAGMENT_RULE_BOOL
            {
            mFRAGMENT_RULE_BOOL(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, RULE_BOOL_StartIndex); }
        }
    }
    // $ANTLR end RULE_BOOL

    // $ANTLR start FRAGMENT_RULE_BOOL
    public final void mFRAGMENT_RULE_BOOL() throws RecognitionException {
        int FRAGMENT_RULE_BOOL_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:125:29: ( ( '#f' | '#t' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:125:31: ( '#f' | '#t' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:125:31: ( '#f' | '#t' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='#') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='f') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='t') ) {
                    alt5=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("125:31: ( '#f' | '#t' )", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("125:31: ( '#f' | '#t' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:125:32: '#f'
                    {
                    match("#f"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:125:37: '#t'
                    {
                    match("#t"); if (failed) return ;


                    }
                    break;

            }


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 25, FRAGMENT_RULE_BOOL_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_RULE_BOOL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        int RULE_ID_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:127:18: ( FRAGMENT_RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:127:20: FRAGMENT_RULE_ID
            {
            mFRAGMENT_RULE_ID(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, RULE_ID_StartIndex); }
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start FRAGMENT_RULE_ID
    public final void mFRAGMENT_RULE_ID() throws RecognitionException {
        int FRAGMENT_RULE_ID_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:128:27: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:128:29: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:128:49: ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-'||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, FRAGMENT_RULE_ID_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_RULE_ID

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        int RULE_WS_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:130:18: ( FRAGMENT_RULE_WS )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:130:20: FRAGMENT_RULE_WS
            {
            mFRAGMENT_RULE_WS(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, RULE_WS_StartIndex); }
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start FRAGMENT_RULE_WS
    public final void mFRAGMENT_RULE_WS() throws RecognitionException {
        int FRAGMENT_RULE_WS_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:131:27: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:131:29: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:131:29: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 29, FRAGMENT_RULE_WS_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_RULE_WS

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        int RULE_SL_COMMENT_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:133:26: ( FRAGMENT_RULE_SL_COMMENT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:133:28: FRAGMENT_RULE_SL_COMMENT
            {
            mFRAGMENT_RULE_SL_COMMENT(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, RULE_SL_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start FRAGMENT_RULE_SL_COMMENT
    public final void mFRAGMENT_RULE_SL_COMMENT() throws RecognitionException {
        int FRAGMENT_RULE_SL_COMMENT_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:134:35: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:134:37: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); if (failed) return ;
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:134:41: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:0:0: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:134:57: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:134:58: ( '\\r' )? '\\n'
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:134:58: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:0:0: '\\r'
                            {
                            match('\r'); if (failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, FRAGMENT_RULE_SL_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_RULE_SL_COMMENT

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        int RULE_ML_COMMENT_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:136:26: ( FRAGMENT_RULE_ML_COMMENT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:136:28: FRAGMENT_RULE_ML_COMMENT
            {
            mFRAGMENT_RULE_ML_COMMENT(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 32, RULE_ML_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start FRAGMENT_RULE_ML_COMMENT
    public final void mFRAGMENT_RULE_ML_COMMENT() throws RecognitionException {
        int FRAGMENT_RULE_ML_COMMENT_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:137:35: ( '%{' ( options {greedy=false; } : . )* '%}' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:137:37: '%{' ( options {greedy=false; } : . )* '%}'
            {
            match("%{"); if (failed) return ;

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:137:42: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='%') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='}') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='|')||(LA11_1>='~' && LA11_1<='\uFFFE')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='$')||(LA11_0>='&' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:137:70: .
            	    {
            	    matchAny(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("%}"); if (failed) return ;


            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 33, FRAGMENT_RULE_ML_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_RULE_ML_COMMENT

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        int RULE_ANY_OTHER_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:139:25: ( FRAGMENT_RULE_ANY_OTHER )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:139:27: FRAGMENT_RULE_ANY_OTHER
            {
            mFRAGMENT_RULE_ANY_OTHER(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 34, RULE_ANY_OTHER_StartIndex); }
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    // $ANTLR start FRAGMENT_RULE_ANY_OTHER
    public final void mFRAGMENT_RULE_ANY_OTHER() throws RecognitionException {
        int FRAGMENT_RULE_ANY_OTHER_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:140:34: ( . )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:140:36: .
            {
            matchAny(); if (failed) return ;

            }

        }
        finally {
            if ( backtracking>0 ) { memoize(input, 35, FRAGMENT_RULE_ANY_OTHER_StartIndex); }
        }
    }
    // $ANTLR end FRAGMENT_RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:1:8: ( SYNTHETIC_ALL_KEYWORDS )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:1:10: SYNTHETIC_ALL_KEYWORDS
        {
        mSYNTHETIC_ALL_KEYWORDS(); if (failed) return ;

        }


    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:52:2: ( FRAGMENT_KEYWORD_1 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:52:3: FRAGMENT_KEYWORD_1
        {
        mFRAGMENT_KEYWORD_1(); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:53:2: ( FRAGMENT_KEYWORD_2 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:53:3: FRAGMENT_KEYWORD_2
        {
        mFRAGMENT_KEYWORD_2(); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:54:2: ( FRAGMENT_KEYWORD_3 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:54:3: FRAGMENT_KEYWORD_3
        {
        mFRAGMENT_KEYWORD_3(); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:55:2: ( FRAGMENT_KEYWORD_4 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:55:3: FRAGMENT_KEYWORD_4
        {
        mFRAGMENT_KEYWORD_4(); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:56:2: ( FRAGMENT_KEYWORD_5 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:56:3: FRAGMENT_KEYWORD_5
        {
        mFRAGMENT_KEYWORD_5(); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:57:2: ( FRAGMENT_KEYWORD_6 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:57:3: FRAGMENT_KEYWORD_6
        {
        mFRAGMENT_KEYWORD_6(); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:58:2: ( FRAGMENT_KEYWORD_7 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:58:3: FRAGMENT_KEYWORD_7
        {
        mFRAGMENT_KEYWORD_7(); if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:59:2: ( FRAGMENT_KEYWORD_8 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:59:3: FRAGMENT_KEYWORD_8
        {
        mFRAGMENT_KEYWORD_8(); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:60:2: ( FRAGMENT_KEYWORD_9 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:60:3: FRAGMENT_KEYWORD_9
        {
        mFRAGMENT_KEYWORD_9(); if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:61:2: ( FRAGMENT_KEYWORD_10 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:61:3: FRAGMENT_KEYWORD_10
        {
        mFRAGMENT_KEYWORD_10(); if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:62:2: ( FRAGMENT_KEYWORD_11 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:62:3: FRAGMENT_KEYWORD_11
        {
        mFRAGMENT_KEYWORD_11(); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:63:2: ( FRAGMENT_KEYWORD_12 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:63:3: FRAGMENT_KEYWORD_12
        {
        mFRAGMENT_KEYWORD_12(); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:64:2: ( FRAGMENT_KEYWORD_13 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:64:3: FRAGMENT_KEYWORD_13
        {
        mFRAGMENT_KEYWORD_13(); if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:65:2: ( FRAGMENT_KEYWORD_14 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:65:3: FRAGMENT_KEYWORD_14
        {
        mFRAGMENT_KEYWORD_14(); if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:66:2: ( FRAGMENT_KEYWORD_15 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:66:3: FRAGMENT_KEYWORD_15
        {
        mFRAGMENT_KEYWORD_15(); if (failed) return ;

        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:67:2: ( FRAGMENT_KEYWORD_16 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:67:3: FRAGMENT_KEYWORD_16
        {
        mFRAGMENT_KEYWORD_16(); if (failed) return ;

        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:68:2: ( FRAGMENT_KEYWORD_17 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:68:3: FRAGMENT_KEYWORD_17
        {
        mFRAGMENT_KEYWORD_17(); if (failed) return ;

        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:69:2: ( FRAGMENT_KEYWORD_18 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:69:3: FRAGMENT_KEYWORD_18
        {
        mFRAGMENT_KEYWORD_18(); if (failed) return ;

        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:70:2: ( FRAGMENT_RULE_STRING )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:70:3: FRAGMENT_RULE_STRING
        {
        mFRAGMENT_RULE_STRING(); if (failed) return ;

        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:71:2: ( FRAGMENT_RULE_INT )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:71:3: FRAGMENT_RULE_INT
        {
        mFRAGMENT_RULE_INT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:72:2: ( FRAGMENT_RULE_BOOL )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:72:3: FRAGMENT_RULE_BOOL
        {
        mFRAGMENT_RULE_BOOL(); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:73:2: ( FRAGMENT_RULE_ID )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:73:3: FRAGMENT_RULE_ID
        {
        mFRAGMENT_RULE_ID(); if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:74:2: ( FRAGMENT_RULE_WS )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:74:3: FRAGMENT_RULE_WS
        {
        mFRAGMENT_RULE_WS(); if (failed) return ;

        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:75:2: ( FRAGMENT_RULE_SL_COMMENT )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:75:3: FRAGMENT_RULE_SL_COMMENT
        {
        mFRAGMENT_RULE_SL_COMMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:76:2: ( FRAGMENT_RULE_ML_COMMENT )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:76:3: FRAGMENT_RULE_ML_COMMENT
        {
        mFRAGMENT_RULE_ML_COMMENT(); if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:77:2: ( FRAGMENT_RULE_ANY_OTHER )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/lexer/InternalLilyPond.g:77:3: FRAGMENT_RULE_ANY_OTHER
        {
        mFRAGMENT_RULE_ANY_OTHER(); if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    public final boolean synpred20() {
        backtracking++;
        int start = input.mark();
        try {
            synpred20_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred22() {
        backtracking++;
        int start = input.mark();
        try {
            synpred22_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred19() {
        backtracking++;
        int start = input.mark();
        try {
            synpred19_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred18() {
        backtracking++;
        int start = input.mark();
        try {
            synpred18_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred15() {
        backtracking++;
        int start = input.mark();
        try {
            synpred15_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred17() {
        backtracking++;
        int start = input.mark();
        try {
            synpred17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred10() {
        backtracking++;
        int start = input.mark();
        try {
            synpred10_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred13() {
        backtracking++;
        int start = input.mark();
        try {
            synpred13_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

}