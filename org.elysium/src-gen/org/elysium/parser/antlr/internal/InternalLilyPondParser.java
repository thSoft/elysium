package org.elysium.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.elysium.services.LilyPondGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLilyPondParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ANY_OTHER", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "'='", "'{'", "'}'", "'<<'", "'>>'", "'!'", "'?'", "'+'", "'<'", "'>'", "'['", "']'", "'~'", "'\\\\'", "'('", "')'", "'\\''", "','", "':'", "'include'", "'version'", "'sourcefilename'", "'sourcefileline'", "'markup'", "'markuplines'", "'book'", "'bookpart'", "'header'", "'score'", "'paper'", "'midi'", "'layout'", "'relative'", "'transpose'", "'chordmode'", "'drummode'", "'figuremode'", "'lyricmode'", "'notemode'", "'lyricsto'", "'new'", "'context'", "'with'", "'accepts'", "'addlyrics'", "'alias'", "'alternative'", "'change'", "'chords'", "'consists'", "'default'", "'defaultchild'", "'denies'", "'description'", "'drums'", "'figures'", "'grobdescriptions'", "'key'", "'lyrics'", "'maininput'", "'mark'", "'name'", "'objectid'", "'octave'", "'once'", "'override'", "'partial'", "'remove'", "'repeat'", "'rest'", "'revert'", "'sequential'", "'set'", "'simultaneous'", "'skip'", "'tempo'", "'time'", "'times'", "'type'", "'unset'", "'#'", "'$'", "'`'", "'@'", "'#{'", "'#}'", "'#\\\\'", "'\\\\\\\\'", "'-'", "'#:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_SCHEME_SL_COMMENT=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SCHEME_ML_COMMENT=12;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=8;

    // delegates
    // delegators


        public InternalLilyPondParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLilyPondParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLilyPondParser.tokenNames; }
    public String getGrammarFileName() { return "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private LilyPondGrammarAccess grammarAccess;
     	
        public InternalLilyPondParser(TokenStream input, LilyPondGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LilyPond";	
       	}
       	
       	@Override
       	protected LilyPondGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLilyPond"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:73:1: entryRuleLilyPond returns [EObject current=null] : iv_ruleLilyPond= ruleLilyPond EOF ;
    public final EObject entryRuleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLilyPond = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:74:2: (iv_ruleLilyPond= ruleLilyPond EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:75:2: iv_ruleLilyPond= ruleLilyPond EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLilyPondRule()); 
            }
            pushFollow(FOLLOW_ruleLilyPond_in_entryRuleLilyPond81);
            iv_ruleLilyPond=ruleLilyPond();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLilyPond; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilyPond91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLilyPond"


    // $ANTLR start "ruleLilyPond"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:82:1: ruleLilyPond returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpression ) )* ;
    public final EObject ruleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:85:28: ( ( (lv_expressions_0_0= ruleExpression ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:86:1: ( (lv_expressions_0_0= ruleExpression ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:86:1: ( (lv_expressions_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=13 && LA1_0<=14)||LA1_0==16||(LA1_0>=18 && LA1_0<=94)||(LA1_0>=100 && LA1_0<=101)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:87:1: (lv_expressions_0_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:87:1: (lv_expressions_0_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:88:3: lv_expressions_0_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilyPondAccess().getExpressionsExpressionParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleLilyPond136);
            	    lv_expressions_0_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilyPondRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_0_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLilyPond"


    // $ANTLR start "entryRuleExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:112:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:113:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:114:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression172);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression182); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:121:1: ruleExpression returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_CommonExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:124:28: ( (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:125:1: (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:125:1: (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:126:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleExpression232);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:139:2: this_CommonExpression_1= ruleCommonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_ruleExpression262);
                    this_CommonExpression_1=ruleCommonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommonExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleCommonExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:158:1: entryRuleCommonExpression returns [EObject current=null] : iv_ruleCommonExpression= ruleCommonExpression EOF ;
    public final EObject entryRuleCommonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:159:2: (iv_ruleCommonExpression= ruleCommonExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:160:2: iv_ruleCommonExpression= ruleCommonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonExpression_in_entryRuleCommonExpression297);
            iv_ruleCommonExpression=ruleCommonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonExpression307); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommonExpression"


    // $ANTLR start "ruleCommonExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:167:1: ruleCommonExpression returns [EObject current=null] : (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Number_3= ruleNumber | this_Text_4= ruleText ) ;
    public final EObject ruleCommonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Block_1 = null;

        EObject this_Scheme_2 = null;

        EObject this_Number_3 = null;

        EObject this_Text_4 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:170:28: ( (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Number_3= ruleNumber | this_Text_4= ruleText ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:171:1: (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Number_3= ruleNumber | this_Text_4= ruleText )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:171:1: (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Number_3= ruleNumber | this_Text_4= ruleText )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 14:
            case 16:
                {
                alt3=2;
                }
                break;
            case 93:
            case 94:
                {
                alt3=3;
                }
                break;
            case RULE_INT:
                {
                int LA3_4 = input.LA(2);

                if ( (synpred6_InternalLilyPond()) ) {
                    alt3=4;
                }
                else if ( (true) ) {
                    alt3=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 13:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 100:
            case 101:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:172:2: this_Command_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getCommandParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommand_in_ruleCommonExpression357);
                    this_Command_0=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Command_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:185:2: this_Block_1= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleCommonExpression387);
                    this_Block_1=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:198:2: this_Scheme_2= ruleScheme
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getSchemeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleCommonExpression417);
                    this_Scheme_2=ruleScheme();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Scheme_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:211:2: this_Number_3= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getNumberParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleCommonExpression447);
                    this_Number_3=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Number_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:224:2: this_Text_4= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleCommonExpression477);
                    this_Text_4=ruleText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Text_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonExpression"


    // $ANTLR start "entryRuleAssignment"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:243:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:244:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:245:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment512);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:252:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:255:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:256:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:256:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:256:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:256:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:257:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:257:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:258:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:258:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:259:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_1, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_1, 
                              		"ID");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:274:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_2, grammarAccess.getAssignmentAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_2, 
                              		"STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAssignment606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:296:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:297:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:297:1: (lv_value_2_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:298:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment627);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePropertyAssignment"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:1: entryRulePropertyAssignment returns [EObject current=null] : iv_rulePropertyAssignment= rulePropertyAssignment EOF ;
    public final EObject entryRulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssignment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:323:2: (iv_rulePropertyAssignment= rulePropertyAssignment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:324:2: iv_rulePropertyAssignment= rulePropertyAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAssignmentRule()); 
            }
            pushFollow(FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment663);
            iv_rulePropertyAssignment=rulePropertyAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAssignment673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyAssignment"


    // $ANTLR start "rulePropertyAssignment"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:331:1: rulePropertyAssignment returns [EObject current=null] : ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:334:28: ( ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:335:1: ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:335:1: ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:335:2: ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:335:2: ( (lv_id_0_0= ruleSchemeIdentifier ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:336:1: (lv_id_0_0= ruleSchemeIdentifier )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:336:1: (lv_id_0_0= ruleSchemeIdentifier )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:337:3: lv_id_0_0= ruleSchemeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAssignmentAccess().getIdSchemeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeIdentifier_in_rulePropertyAssignment719);
            lv_id_0_0=ruleSchemeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"SchemeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_rulePropertyAssignment731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:357:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:358:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:358:1: (lv_value_2_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:359:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulePropertyAssignment752);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyAssignment"


    // $ANTLR start "entryRuleBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:383:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:384:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:385:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock788);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:392:1: ruleBlock returns [EObject current=null] : (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBlock_0 = null;

        EObject this_SimultaneousBlock_1 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:395:28: ( (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:396:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:396:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:397:2: this_SimpleBlock_0= ruleSimpleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlock848);
                    this_SimpleBlock_0=ruleSimpleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleBlock_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:410:2: this_SimultaneousBlock_1= ruleSimultaneousBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_ruleBlock878);
                    this_SimultaneousBlock_1=ruleSimultaneousBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimultaneousBlock_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleSimpleBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:429:1: entryRuleSimpleBlock returns [EObject current=null] : iv_ruleSimpleBlock= ruleSimpleBlock EOF ;
    public final EObject entryRuleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:430:2: (iv_ruleSimpleBlock= ruleSimpleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:431:2: iv_ruleSimpleBlock= ruleSimpleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock913);
            iv_ruleSimpleBlock=ruleSimpleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock923); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleBlock"


    // $ANTLR start "ruleSimpleBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:438:1: ruleSimpleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleSimpleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:441:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:442:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:442:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:442:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:442:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:443:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSimpleBlock972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:455:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_ANY_OTHER)||(LA6_0>=13 && LA6_0<=14)||LA6_0==16||(LA6_0>=18 && LA6_0<=94)||(LA6_0>=100 && LA6_0<=101)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:456:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:456:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:457:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimpleBlock993);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimpleBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSimpleBlock1006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleBlock"


    // $ANTLR start "entryRuleSimultaneousBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:485:1: entryRuleSimultaneousBlock returns [EObject current=null] : iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF ;
    public final EObject entryRuleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneousBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:486:2: (iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:487:2: iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimultaneousBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1042);
            iv_ruleSimultaneousBlock=ruleSimultaneousBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimultaneousBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock1052); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimultaneousBlock"


    // $ANTLR start "ruleSimultaneousBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:494:1: ruleSimultaneousBlock returns [EObject current=null] : ( () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>' ) ;
    public final EObject ruleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:497:28: ( ( () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:498:1: ( () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:498:1: ( () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:498:2: () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:498:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:499:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSimultaneousBlock1101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:511:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_ANY_OTHER)||(LA7_0>=13 && LA7_0<=14)||LA7_0==16||(LA7_0>=18 && LA7_0<=94)||(LA7_0>=100 && LA7_0<=101)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:512:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:512:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:513:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimultaneousBlock1122);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimultaneousBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSimultaneousBlock1135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimultaneousBlock"


    // $ANTLR start "entryRuleCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:541:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:542:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:543:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1171);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1181); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:550:1: ruleCommand returns [EObject current=null] : (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference | this_StringIndication_2= ruleStringIndication ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialCommand_0 = null;

        EObject this_Reference_1 = null;

        EObject this_StringIndication_2 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:553:28: ( (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference | this_StringIndication_2= ruleStringIndication ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:554:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference | this_StringIndication_2= ruleStringIndication )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:554:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference | this_StringIndication_2= ruleStringIndication )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                switch ( input.LA(2) ) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 27:
                case 28:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                    {
                    alt8=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt8=2;
                    }
                    break;
                case RULE_INT:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:555:2: this_SpecialCommand_0= ruleSpecialCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommand_in_ruleCommand1231);
                    this_SpecialCommand_0=ruleSpecialCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SpecialCommand_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:568:2: this_Reference_1= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleCommand1261);
                    this_Reference_1=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Reference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:581:2: this_StringIndication_2= ruleStringIndication
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getStringIndicationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringIndication_in_ruleCommand1291);
                    this_StringIndication_2=ruleStringIndication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringIndication_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSpecialCharacter"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:600:1: entryRuleSpecialCharacter returns [String current=null] : iv_ruleSpecialCharacter= ruleSpecialCharacter EOF ;
    public final String entryRuleSpecialCharacter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:601:2: (iv_ruleSpecialCharacter= ruleSpecialCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:602:2: iv_ruleSpecialCharacter= ruleSpecialCharacter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1327);
            iv_ruleSpecialCharacter=ruleSpecialCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialCharacter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCharacter1338); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialCharacter"


    // $ANTLR start "ruleSpecialCharacter"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:609:1: ruleSpecialCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '?' | kw= '+' | kw= '<' | kw= '>' | kw= '[' | kw= ']' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:612:28: ( (kw= '!' | kw= '?' | kw= '+' | kw= '<' | kw= '>' | kw= '[' | kw= ']' | kw= '~' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:613:1: (kw= '!' | kw= '?' | kw= '+' | kw= '<' | kw= '>' | kw= '[' | kw= ']' | kw= '~' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:613:1: (kw= '!' | kw= '?' | kw= '+' | kw= '<' | kw= '>' | kw= '[' | kw= ']' | kw= '~' )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            case 23:
                {
                alt9=6;
                }
                break;
            case 24:
                {
                alt9=7;
                }
                break;
            case 25:
                {
                alt9=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:614:2: kw= '!'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleSpecialCharacter1376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:621:2: kw= '?'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSpecialCharacter1395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getQuestionMarkKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:628:2: kw= '+'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleSpecialCharacter1414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:635:2: kw= '<'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSpecialCharacter1433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:642:2: kw= '>'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSpecialCharacter1452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:649:2: kw= '['
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSpecialCharacter1471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:656:2: kw= ']'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleSpecialCharacter1490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:663:2: kw= '~'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleSpecialCharacter1509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getTildeKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialCharacter"


    // $ANTLR start "entryRuleUnparsedBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:676:1: entryRuleUnparsedBlock returns [EObject current=null] : iv_ruleUnparsedBlock= ruleUnparsedBlock EOF ;
    public final EObject entryRuleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:677:2: (iv_ruleUnparsedBlock= ruleUnparsedBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:678:2: iv_ruleUnparsedBlock= ruleUnparsedBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnparsedBlockRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1549);
            iv_ruleUnparsedBlock=ruleUnparsedBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnparsedBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedBlock1559); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnparsedBlock"


    // $ANTLR start "ruleUnparsedBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:685:1: ruleUnparsedBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:688:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:690:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnparsedBlockAccess().getUnparsedBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleUnparsedBlock1608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:702:1: ( (lv_expressions_2_0= ruleUnparsedExpression ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_ANY_OTHER)||(LA10_0>=13 && LA10_0<=14)||(LA10_0>=18 && LA10_0<=94)||(LA10_0>=100 && LA10_0<=101)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:703:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:703:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:704:3: lv_expressions_2_0= ruleUnparsedExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock1629);
            	    lv_expressions_2_0=ruleUnparsedExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnparsedBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"UnparsedExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleUnparsedBlock1642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnparsedBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnparsedBlock"


    // $ANTLR start "entryRuleUnparsedExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:732:1: entryRuleUnparsedExpression returns [EObject current=null] : iv_ruleUnparsedExpression= ruleUnparsedExpression EOF ;
    public final EObject entryRuleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:733:2: (iv_ruleUnparsedExpression= ruleUnparsedExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:734:2: iv_ruleUnparsedExpression= ruleUnparsedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnparsedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1678);
            iv_ruleUnparsedExpression=ruleUnparsedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnparsedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedExpression1688); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnparsedExpression"


    // $ANTLR start "ruleUnparsedExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:741:1: ruleUnparsedExpression returns [EObject current=null] : (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText ) ;
    public final EObject ruleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAssignment_0 = null;

        EObject this_UnparsedCommand_1 = null;

        EObject this_UnparsedBlock_2 = null;

        EObject this_Scheme_3 = null;

        EObject this_Number_4 = null;

        EObject this_Text_5 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:744:28: ( (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:745:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:745:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText )
            int alt11=6;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:746:2: this_PropertyAssignment_0= rulePropertyAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_ruleUnparsedExpression1738);
                    this_PropertyAssignment_0=rulePropertyAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyAssignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:759:2: this_UnparsedCommand_1= ruleUnparsedCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedCommandParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression1768);
                    this_UnparsedCommand_1=ruleUnparsedCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnparsedCommand_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:772:2: this_UnparsedBlock_2= ruleUnparsedBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression1798);
                    this_UnparsedBlock_2=ruleUnparsedBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnparsedBlock_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:785:2: this_Scheme_3= ruleScheme
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getSchemeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleUnparsedExpression1828);
                    this_Scheme_3=ruleScheme();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Scheme_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:798:2: this_Number_4= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getNumberParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleUnparsedExpression1858);
                    this_Number_4=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Number_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:811:2: this_Text_5= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleUnparsedExpression1888);
                    this_Text_5=ruleText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Text_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnparsedExpression"


    // $ANTLR start "entryRuleUnparsedCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:830:1: entryRuleUnparsedCommand returns [EObject current=null] : iv_ruleUnparsedCommand= ruleUnparsedCommand EOF ;
    public final EObject entryRuleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:831:2: (iv_ruleUnparsedCommand= ruleUnparsedCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:832:2: iv_ruleUnparsedCommand= ruleUnparsedCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnparsedCommandRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand1923);
            iv_ruleUnparsedCommand=ruleUnparsedCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnparsedCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedCommand1933); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnparsedCommand"


    // $ANTLR start "ruleUnparsedCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:839:1: ruleUnparsedCommand returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_command_1_1 = null;

        AntlrDatatypeRuleToken lv_command_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:842:28: ( (otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:843:1: (otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:843:1: (otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:843:3: otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleUnparsedCommand1970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:847:1: ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:848:1: ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:848:1: ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:849:1: (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:849:1: (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:850:3: lv_command_1_1= ruleSchemeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandSchemeIdentifierParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeIdentifier_in_ruleUnparsedCommand1993);
                    lv_command_1_1=ruleSchemeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnparsedCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"command",
                              		lv_command_1_1, 
                              		"SchemeIdentifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:865:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand2012);
                    lv_command_1_2=ruleSpecialCommandName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnparsedCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"command",
                              		lv_command_1_2, 
                              		"SpecialCommandName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnparsedCommand"


    // $ANTLR start "entryRuleReference"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:891:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:892:2: (iv_ruleReference= ruleReference EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:893:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2051);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2061); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:900:1: ruleReference returns [EObject current=null] : (otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:903:28: ( (otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:904:1: (otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:904:1: (otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:904:3: otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleReference2098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:908:1: ( (otherlv_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:909:1: (otherlv_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:909:1: (otherlv_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:910:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference2122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleText"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:932:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:933:2: (iv_ruleText= ruleText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:934:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText2158);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2168); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:941:1: ruleText returns [EObject current=null] : ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        AntlrDatatypeRuleToken lv_value_0_1 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:944:28: ( ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:945:1: ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:945:1: ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:946:1: ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:946:1: ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:947:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:947:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' )
            int alt13=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_ANY_OTHER:
            case 13:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 100:
            case 101:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            case 30:
                {
                alt13=5;
                }
                break;
            case 31:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:948:3: lv_value_0_1= ruleSchemeTextValueSegment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextAccess().getValueSchemeTextValueSegmentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleText2215);
                    lv_value_0_1=ruleSchemeTextValueSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_0_1, 
                              		"SchemeTextValueSegment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:963:8: lv_value_0_2= '('
                    {
                    lv_value_0_2=(Token)match(input,27,FOLLOW_27_in_ruleText2231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_2, grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:975:8: lv_value_0_3= ')'
                    {
                    lv_value_0_3=(Token)match(input,28,FOLLOW_28_in_ruleText2260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_3, grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:987:8: lv_value_0_4= '\\''
                    {
                    lv_value_0_4=(Token)match(input,29,FOLLOW_29_in_ruleText2289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_4, grammarAccess.getTextAccess().getValueApostropheKeyword_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:999:8: lv_value_0_5= ','
                    {
                    lv_value_0_5=(Token)match(input,30,FOLLOW_30_in_ruleText2318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_5, grammarAccess.getTextAccess().getValueCommaKeyword_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_5, null);
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1011:8: lv_value_0_6= ':'
                    {
                    lv_value_0_6=(Token)match(input,31,FOLLOW_31_in_ruleText2347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_6, grammarAccess.getTextAccess().getValueColonKeyword_0_5());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_6, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNumber"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1034:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1035:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1036:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2398);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2408); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1043:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1046:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1047:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1047:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1048:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1048:1: (lv_value_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1049:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumberRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleSpecialCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1073:1: entryRuleSpecialCommand returns [EObject current=null] : iv_ruleSpecialCommand= ruleSpecialCommand EOF ;
    public final EObject entryRuleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1074:2: (iv_ruleSpecialCommand= ruleSpecialCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1075:2: iv_ruleSpecialCommand= ruleSpecialCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialCommandRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2489);
            iv_ruleSpecialCommand=ruleSpecialCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand2499); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialCommand"


    // $ANTLR start "ruleSpecialCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1082:1: ruleSpecialCommand returns [EObject current=null] : (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther ) ;
    public final EObject ruleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Include_0 = null;

        EObject this_Version_1 = null;

        EObject this_SourceFileName_2 = null;

        EObject this_SourceFileLine_3 = null;

        EObject this_Markup_4 = null;

        EObject this_MarkupLines_5 = null;

        EObject this_BlockCommand_6 = null;

        EObject this_OutputDefinition_7 = null;

        EObject this_RelativeMusic_8 = null;

        EObject this_TransposedMusic_9 = null;

        EObject this_ModeChange_10 = null;

        EObject this_MusicWithLyrics_11 = null;

        EObject this_NewContext_12 = null;

        EObject this_ContextDef_13 = null;

        EObject this_Other_14 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1085:28: ( (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1086:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1086:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther )
            int alt14=15;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1087:2: this_Include_0= ruleInclude
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleSpecialCommand2549);
                    this_Include_0=ruleInclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Include_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1100:2: this_Version_1= ruleVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleSpecialCommand2579);
                    this_Version_1=ruleVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Version_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1113:2: this_SourceFileName_2= ruleSourceFileName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getSourceFileNameParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSourceFileName_in_ruleSpecialCommand2609);
                    this_SourceFileName_2=ruleSourceFileName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SourceFileName_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1126:2: this_SourceFileLine_3= ruleSourceFileLine
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getSourceFileLineParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSourceFileLine_in_ruleSpecialCommand2639);
                    this_SourceFileLine_3=ruleSourceFileLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SourceFileLine_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1139:2: this_Markup_4= ruleMarkup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleSpecialCommand2669);
                    this_Markup_4=ruleMarkup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Markup_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1152:2: this_MarkupLines_5= ruleMarkupLines
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_ruleSpecialCommand2699);
                    this_MarkupLines_5=ruleMarkupLines();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MarkupLines_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1165:2: this_BlockCommand_6= ruleBlockCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getBlockCommandParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockCommand_in_ruleSpecialCommand2729);
                    this_BlockCommand_6=ruleBlockCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BlockCommand_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1178:2: this_OutputDefinition_7= ruleOutputDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getOutputDefinitionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputDefinition_in_ruleSpecialCommand2759);
                    this_OutputDefinition_7=ruleOutputDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OutputDefinition_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1191:2: this_RelativeMusic_8= ruleRelativeMusic
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getRelativeMusicParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelativeMusic_in_ruleSpecialCommand2789);
                    this_RelativeMusic_8=ruleRelativeMusic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RelativeMusic_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1204:2: this_TransposedMusic_9= ruleTransposedMusic
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getTransposedMusicParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransposedMusic_in_ruleSpecialCommand2819);
                    this_TransposedMusic_9=ruleTransposedMusic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TransposedMusic_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1217:2: this_ModeChange_10= ruleModeChange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getModeChangeParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModeChange_in_ruleSpecialCommand2849);
                    this_ModeChange_10=ruleModeChange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ModeChange_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1230:2: this_MusicWithLyrics_11= ruleMusicWithLyrics
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getMusicWithLyricsParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMusicWithLyrics_in_ruleSpecialCommand2879);
                    this_MusicWithLyrics_11=ruleMusicWithLyrics();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MusicWithLyrics_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1243:2: this_NewContext_12= ruleNewContext
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getNewContextParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewContext_in_ruleSpecialCommand2909);
                    this_NewContext_12=ruleNewContext();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewContext_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1256:2: this_ContextDef_13= ruleContextDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getContextDefParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextDef_in_ruleSpecialCommand2939);
                    this_ContextDef_13=ruleContextDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContextDef_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1269:2: this_Other_14= ruleOther
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getOtherParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOther_in_ruleSpecialCommand2969);
                    this_Other_14=ruleOther();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Other_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialCommand"


    // $ANTLR start "entryRuleInclude"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1288:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1289:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1290:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude3004);
            iv_ruleInclude=ruleInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude3014); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1297:1: ruleInclude returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_importURI_2_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1300:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1301:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1301:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1301:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleInclude3051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1305:1: ( (lv_keyword_1_0= 'include' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1306:1: (lv_keyword_1_0= 'include' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1306:1: (lv_keyword_1_0= 'include' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1307:3: lv_keyword_1_0= 'include'
            {
            lv_keyword_1_0=(Token)match(input,32,FOLLOW_32_in_ruleInclude3069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getIncludeAccess().getKeywordIncludeKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "include");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1320:2: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1321:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1321:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1322:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude3099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_2_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleVersion"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1346:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1347:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1348:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion3140);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion3150); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1355:1: ruleVersion returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_version_2_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1358:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1359:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1359:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1359:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleVersion3187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1363:1: ( (lv_keyword_1_0= 'version' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1364:1: (lv_keyword_1_0= 'version' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1364:1: (lv_keyword_1_0= 'version' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1365:3: lv_keyword_1_0= 'version'
            {
            lv_keyword_1_0=(Token)match(input,33,FOLLOW_33_in_ruleVersion3205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getVersionAccess().getKeywordVersionKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVersionRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "version");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1378:2: ( (lv_version_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1379:1: (lv_version_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1379:1: (lv_version_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1380:3: lv_version_2_0= RULE_STRING
            {
            lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion3235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_version_2_0, grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVersionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"version",
                      		lv_version_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleSourceFileName"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1404:1: entryRuleSourceFileName returns [EObject current=null] : iv_ruleSourceFileName= ruleSourceFileName EOF ;
    public final EObject entryRuleSourceFileName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFileName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1405:2: (iv_ruleSourceFileName= ruleSourceFileName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1406:2: iv_ruleSourceFileName= ruleSourceFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileNameRule()); 
            }
            pushFollow(FOLLOW_ruleSourceFileName_in_entryRuleSourceFileName3276);
            iv_ruleSourceFileName=ruleSourceFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFileName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceFileName3286); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceFileName"


    // $ANTLR start "ruleSourceFileName"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1413:1: ruleSourceFileName returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceFileName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_filename_2_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1416:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1417:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1417:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1417:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSourceFileName3323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSourceFileNameAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1421:1: ( (lv_keyword_1_0= 'sourcefilename' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1422:1: (lv_keyword_1_0= 'sourcefilename' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1422:1: (lv_keyword_1_0= 'sourcefilename' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1423:3: lv_keyword_1_0= 'sourcefilename'
            {
            lv_keyword_1_0=(Token)match(input,34,FOLLOW_34_in_ruleSourceFileName3341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getSourceFileNameAccess().getKeywordSourcefilenameKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSourceFileNameRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "sourcefilename");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1436:2: ( (lv_filename_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1437:1: (lv_filename_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1437:1: (lv_filename_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1438:3: lv_filename_2_0= RULE_STRING
            {
            lv_filename_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSourceFileName3371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_filename_2_0, grammarAccess.getSourceFileNameAccess().getFilenameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSourceFileNameRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"filename",
                      		lv_filename_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceFileName"


    // $ANTLR start "entryRuleSourceFileLine"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1462:1: entryRuleSourceFileLine returns [EObject current=null] : iv_ruleSourceFileLine= ruleSourceFileLine EOF ;
    public final EObject entryRuleSourceFileLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFileLine = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1463:2: (iv_ruleSourceFileLine= ruleSourceFileLine EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1464:2: iv_ruleSourceFileLine= ruleSourceFileLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileLineRule()); 
            }
            pushFollow(FOLLOW_ruleSourceFileLine_in_entryRuleSourceFileLine3412);
            iv_ruleSourceFileLine=ruleSourceFileLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFileLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceFileLine3422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceFileLine"


    // $ANTLR start "ruleSourceFileLine"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1471:1: ruleSourceFileLine returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSourceFileLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_line_2_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1474:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1475:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1475:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1475:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSourceFileLine3459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSourceFileLineAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1479:1: ( (lv_keyword_1_0= 'sourcefileline' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1480:1: (lv_keyword_1_0= 'sourcefileline' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1480:1: (lv_keyword_1_0= 'sourcefileline' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1481:3: lv_keyword_1_0= 'sourcefileline'
            {
            lv_keyword_1_0=(Token)match(input,35,FOLLOW_35_in_ruleSourceFileLine3477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getSourceFileLineAccess().getKeywordSourcefilelineKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSourceFileLineRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "sourcefileline");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1494:2: ( (lv_line_2_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1495:1: (lv_line_2_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1495:1: (lv_line_2_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1496:3: lv_line_2_0= RULE_INT
            {
            lv_line_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSourceFileLine3507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_line_2_0, grammarAccess.getSourceFileLineAccess().getLineINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSourceFileLineRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"line",
                      		lv_line_2_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceFileLine"


    // $ANTLR start "entryRuleMarkup"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1520:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1521:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1522:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupRule()); 
            }
            pushFollow(FOLLOW_ruleMarkup_in_entryRuleMarkup3548);
            iv_ruleMarkup=ruleMarkup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkup3558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkup"


    // $ANTLR start "ruleMarkup"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1529:1: ruleMarkup returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1532:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1533:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1533:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1533:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMarkup3595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1537:1: ( (lv_keyword_1_0= 'markup' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1538:1: (lv_keyword_1_0= 'markup' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1538:1: (lv_keyword_1_0= 'markup' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1539:3: lv_keyword_1_0= 'markup'
            {
            lv_keyword_1_0=(Token)match(input,36,FOLLOW_36_in_ruleMarkup3613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getMarkupAccess().getKeywordMarkupKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMarkupRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "markup");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1552:2: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1553:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1553:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1554:3: lv_body_2_0= ruleMarkupBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkup3647);
            lv_body_2_0=ruleMarkupBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMarkupRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"MarkupBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkup"


    // $ANTLR start "entryRuleMarkupLines"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1578:1: entryRuleMarkupLines returns [EObject current=null] : iv_ruleMarkupLines= ruleMarkupLines EOF ;
    public final EObject entryRuleMarkupLines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupLines = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1579:2: (iv_ruleMarkupLines= ruleMarkupLines EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1580:2: iv_ruleMarkupLines= ruleMarkupLines EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupLinesRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines3683);
            iv_ruleMarkupLines=ruleMarkupLines();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkupLines; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupLines3693); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkupLines"


    // $ANTLR start "ruleMarkupLines"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1587:1: ruleMarkupLines returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkupLines() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1590:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1591:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1591:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1591:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMarkupLines3730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1595:1: ( (lv_keyword_1_0= 'markuplines' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1596:1: (lv_keyword_1_0= 'markuplines' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1596:1: (lv_keyword_1_0= 'markuplines' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1597:3: lv_keyword_1_0= 'markuplines'
            {
            lv_keyword_1_0=(Token)match(input,37,FOLLOW_37_in_ruleMarkupLines3748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getMarkupLinesAccess().getKeywordMarkuplinesKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMarkupLinesRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "markuplines");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1610:2: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1611:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1611:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1612:3: lv_body_2_0= ruleMarkupBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkupLines3782);
            lv_body_2_0=ruleMarkupBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMarkupLinesRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"MarkupBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkupLines"


    // $ANTLR start "entryRuleMarkupBody"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1636:1: entryRuleMarkupBody returns [EObject current=null] : iv_ruleMarkupBody= ruleMarkupBody EOF ;
    public final EObject entryRuleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupBody = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1637:2: (iv_ruleMarkupBody= ruleMarkupBody EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1638:2: iv_ruleMarkupBody= ruleMarkupBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody3818);
            iv_ruleMarkupBody=ruleMarkupBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkupBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBody3828); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkupBody"


    // $ANTLR start "ruleMarkupBody"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1645:1: ruleMarkupBody returns [EObject current=null] : ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) ;
    public final EObject ruleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject lv_command_1_1 = null;

        EObject lv_command_1_2 = null;

        EObject lv_command_1_3 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1648:28: ( ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1649:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1649:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1649:2: () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1649:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1650:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMarkupBodyAccess().getMarkupBodyAction_0(),
                          current);
                  
            }

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1658:2: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) ) )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1659:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1659:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1660:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1660:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case 93:
            	    case 94:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case RULE_ID:
            	    case RULE_STRING:
            	    case RULE_INT:
            	    case RULE_ANY_OTHER:
            	    case 13:
            	    case 18:
            	    case 19:
            	    case 20:
            	    case 21:
            	    case 22:
            	    case 23:
            	    case 24:
            	    case 25:
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	    case 36:
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	    case 44:
            	    case 45:
            	    case 46:
            	    case 47:
            	    case 48:
            	    case 49:
            	    case 50:
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 55:
            	    case 56:
            	    case 57:
            	    case 58:
            	    case 59:
            	    case 60:
            	    case 61:
            	    case 62:
            	    case 63:
            	    case 64:
            	    case 65:
            	    case 66:
            	    case 67:
            	    case 68:
            	    case 69:
            	    case 70:
            	    case 71:
            	    case 72:
            	    case 73:
            	    case 74:
            	    case 75:
            	    case 76:
            	    case 77:
            	    case 78:
            	    case 79:
            	    case 80:
            	    case 81:
            	    case 82:
            	    case 83:
            	    case 84:
            	    case 85:
            	    case 86:
            	    case 87:
            	    case 88:
            	    case 89:
            	    case 90:
            	    case 91:
            	    case 92:
            	    case 100:
            	    case 101:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1661:3: lv_command_1_1= ruleScheme
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandSchemeParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleScheme_in_ruleMarkupBody3888);
            	            lv_command_1_1=ruleScheme();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMarkupBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"command",
            	                      		lv_command_1_1, 
            	                      		"Scheme");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1676:8: lv_command_1_2= ruleSchemeText
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandSchemeTextParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSchemeText_in_ruleMarkupBody3907);
            	            lv_command_1_2=ruleSchemeText();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMarkupBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"command",
            	                      		lv_command_1_2, 
            	                      		"SchemeText");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1691:8: lv_command_1_3= ruleUnparsedCommand
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody3926);
            	            lv_command_1_3=ruleUnparsedCommand();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMarkupBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"command",
            	                      		lv_command_1_3, 
            	                      		"UnparsedCommand");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1709:3: ( (lv_block_2_0= ruleUnparsedBlock ) )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1710:1: (lv_block_2_0= ruleUnparsedBlock )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1710:1: (lv_block_2_0= ruleUnparsedBlock )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1711:3: lv_block_2_0= ruleUnparsedBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody3951);
                    lv_block_2_0=ruleUnparsedBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMarkupBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"block",
                              		lv_block_2_0, 
                              		"UnparsedBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkupBody"


    // $ANTLR start "entryRuleBlockCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1735:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1736:2: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1737:2: iv_ruleBlockCommand= ruleBlockCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockCommandRule()); 
            }
            pushFollow(FOLLOW_ruleBlockCommand_in_entryRuleBlockCommand3988);
            iv_ruleBlockCommand=ruleBlockCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockCommand3998); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockCommand"


    // $ANTLR start "ruleBlockCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1744:1: ruleBlockCommand returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) ) ;
    public final EObject ruleBlockCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        Token lv_keyword_1_4=null;
        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1747:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1748:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1748:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1748:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleBlockCommand4035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBlockCommandAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1752:1: ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1753:1: ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1753:1: ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1754:1: (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1754:1: (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 40:
                {
                alt18=3;
                }
                break;
            case 41:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1755:3: lv_keyword_1_1= 'book'
                    {
                    lv_keyword_1_1=(Token)match(input,38,FOLLOW_38_in_ruleBlockCommand4055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_1, grammarAccess.getBlockCommandAccess().getKeywordBookKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBlockCommandRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1767:8: lv_keyword_1_2= 'bookpart'
                    {
                    lv_keyword_1_2=(Token)match(input,39,FOLLOW_39_in_ruleBlockCommand4084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_2, grammarAccess.getBlockCommandAccess().getKeywordBookpartKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBlockCommandRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1779:8: lv_keyword_1_3= 'header'
                    {
                    lv_keyword_1_3=(Token)match(input,40,FOLLOW_40_in_ruleBlockCommand4113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_3, grammarAccess.getBlockCommandAccess().getKeywordHeaderKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBlockCommandRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1791:8: lv_keyword_1_4= 'score'
                    {
                    lv_keyword_1_4=(Token)match(input,41,FOLLOW_41_in_ruleBlockCommand4142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_4, grammarAccess.getBlockCommandAccess().getKeywordScoreKeyword_1_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBlockCommandRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_4, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1806:2: ( (lv_block_2_0= ruleSimpleBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1807:1: (lv_block_2_0= ruleSimpleBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1807:1: (lv_block_2_0= ruleSimpleBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1808:3: lv_block_2_0= ruleSimpleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBlockCommandAccess().getBlockSimpleBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlockCommand4179);
            lv_block_2_0=ruleSimpleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBlockCommandRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_2_0, 
                      		"SimpleBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockCommand"


    // $ANTLR start "entryRuleOutputDefinition"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1832:1: entryRuleOutputDefinition returns [EObject current=null] : iv_ruleOutputDefinition= ruleOutputDefinition EOF ;
    public final EObject entryRuleOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDefinition = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1833:2: (iv_ruleOutputDefinition= ruleOutputDefinition EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1834:2: iv_ruleOutputDefinition= ruleOutputDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition4215);
            iv_ruleOutputDefinition=ruleOutputDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDefinition4225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputDefinition"


    // $ANTLR start "ruleOutputDefinition"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1841:1: ruleOutputDefinition returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleOutputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1844:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1845:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1845:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1845:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleOutputDefinition4262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOutputDefinitionAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1849:1: ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1850:1: ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1850:1: ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1851:1: (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1851:1: (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt19=1;
                }
                break;
            case 43:
                {
                alt19=2;
                }
                break;
            case 44:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1852:3: lv_keyword_1_1= 'paper'
                    {
                    lv_keyword_1_1=(Token)match(input,42,FOLLOW_42_in_ruleOutputDefinition4282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_1, grammarAccess.getOutputDefinitionAccess().getKeywordPaperKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOutputDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1864:8: lv_keyword_1_2= 'midi'
                    {
                    lv_keyword_1_2=(Token)match(input,43,FOLLOW_43_in_ruleOutputDefinition4311); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_2, grammarAccess.getOutputDefinitionAccess().getKeywordMidiKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOutputDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1876:8: lv_keyword_1_3= 'layout'
                    {
                    lv_keyword_1_3=(Token)match(input,44,FOLLOW_44_in_ruleOutputDefinition4340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_3, grammarAccess.getOutputDefinitionAccess().getKeywordLayoutKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOutputDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1891:2: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1892:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1892:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1893:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputDefinitionAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleOutputDefinition4377);
            lv_block_2_0=ruleUnparsedBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutputDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_2_0, 
                      		"UnparsedBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputDefinition"


    // $ANTLR start "entryRuleRelativeMusic"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1917:1: entryRuleRelativeMusic returns [EObject current=null] : iv_ruleRelativeMusic= ruleRelativeMusic EOF ;
    public final EObject entryRuleRelativeMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1918:2: (iv_ruleRelativeMusic= ruleRelativeMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1919:2: iv_ruleRelativeMusic= ruleRelativeMusic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelativeMusicRule()); 
            }
            pushFollow(FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic4413);
            iv_ruleRelativeMusic=ruleRelativeMusic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelativeMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeMusic4423); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeMusic"


    // $ANTLR start "ruleRelativeMusic"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1926:1: ruleRelativeMusic returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) ) ;
    public final EObject ruleRelativeMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_pitch_2_0 = null;

        EObject lv_music_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1929:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1930:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1930:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1930:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleRelativeMusic4460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRelativeMusicAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1934:1: ( (lv_keyword_1_0= 'relative' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1935:1: (lv_keyword_1_0= 'relative' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1935:1: (lv_keyword_1_0= 'relative' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1936:3: lv_keyword_1_0= 'relative'
            {
            lv_keyword_1_0=(Token)match(input,45,FOLLOW_45_in_ruleRelativeMusic4478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getRelativeMusicAccess().getKeywordRelativeKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRelativeMusicRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "relative");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1949:2: ( (lv_pitch_2_0= rulePitch ) )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1950:1: (lv_pitch_2_0= rulePitch )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1950:1: (lv_pitch_2_0= rulePitch )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1951:3: lv_pitch_2_0= rulePitch
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePitch_in_ruleRelativeMusic4512);
                    lv_pitch_2_0=rulePitch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelativeMusicRule());
                      	        }
                             		set(
                             			current, 
                             			"pitch",
                              		lv_pitch_2_0, 
                              		"Pitch");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1967:3: ( (lv_music_3_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1968:1: (lv_music_3_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1968:1: (lv_music_3_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1969:3: lv_music_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelativeMusicAccess().getMusicExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRelativeMusic4534);
            lv_music_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelativeMusicRule());
              	        }
                     		set(
                     			current, 
                     			"music",
                      		lv_music_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeMusic"


    // $ANTLR start "entryRulePitch"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1993:1: entryRulePitch returns [EObject current=null] : iv_rulePitch= rulePitch EOF ;
    public final EObject entryRulePitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePitch = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1994:2: (iv_rulePitch= rulePitch EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1995:2: iv_rulePitch= rulePitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPitchRule()); 
            }
            pushFollow(FOLLOW_rulePitch_in_entryRulePitch4570);
            iv_rulePitch=rulePitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePitch4580); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePitch"


    // $ANTLR start "rulePitch"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2002:1: rulePitch returns [EObject current=null] : ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )? ) ;
    public final EObject rulePitch() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token lv_octaveCheck_1_0=null;
        Token lv_reminderAccidental_3_0=null;
        Token lv_cautionaryAccidental_4_0=null;
        EObject lv_octaveShift_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2005:28: ( ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:2: ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:2: ( (lv_base_0_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2007:1: (lv_base_0_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2007:1: (lv_base_0_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2008:3: lv_base_0_0= RULE_ID
            {
            lv_base_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePitch4622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_base_0_0, grammarAccess.getPitchAccess().getBaseIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPitchRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"base",
                      		lv_base_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2024:2: ( (lv_octaveCheck_1_0= '=' ) )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2025:1: (lv_octaveCheck_1_0= '=' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2025:1: (lv_octaveCheck_1_0= '=' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2026:3: lv_octaveCheck_1_0= '='
                    {
                    lv_octaveCheck_1_0=(Token)match(input,13,FOLLOW_13_in_rulePitch4645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_octaveCheck_1_0, grammarAccess.getPitchAccess().getOctaveCheckEqualsSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPitchRule());
                      	        }
                             		setWithLastConsumed(current, "octaveCheck", true, "=");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2039:3: ( (lv_octaveShift_2_0= ruleOctave ) )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:1: (lv_octaveShift_2_0= ruleOctave )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:1: (lv_octaveShift_2_0= ruleOctave )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2041:3: lv_octaveShift_2_0= ruleOctave
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOctave_in_rulePitch4680);
                    lv_octaveShift_2_0=ruleOctave();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPitchRule());
                      	        }
                             		set(
                             			current, 
                             			"octaveShift",
                              		lv_octaveShift_2_0, 
                              		"Octave");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2057:3: ( (lv_reminderAccidental_3_0= '!' ) )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2058:1: (lv_reminderAccidental_3_0= '!' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2058:1: (lv_reminderAccidental_3_0= '!' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2059:3: lv_reminderAccidental_3_0= '!'
                    {
                    lv_reminderAccidental_3_0=(Token)match(input,18,FOLLOW_18_in_rulePitch4699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_reminderAccidental_3_0, grammarAccess.getPitchAccess().getReminderAccidentalExclamationMarkKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPitchRule());
                      	        }
                             		setWithLastConsumed(current, "reminderAccidental", true, "!");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2072:3: ( (lv_cautionaryAccidental_4_0= '?' ) )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2073:1: (lv_cautionaryAccidental_4_0= '?' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2073:1: (lv_cautionaryAccidental_4_0= '?' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2074:3: lv_cautionaryAccidental_4_0= '?'
                    {
                    lv_cautionaryAccidental_4_0=(Token)match(input,19,FOLLOW_19_in_rulePitch4731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_cautionaryAccidental_4_0, grammarAccess.getPitchAccess().getCautionaryAccidentalQuestionMarkKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPitchRule());
                      	        }
                             		setWithLastConsumed(current, "cautionaryAccidental", true, "?");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePitch"


    // $ANTLR start "entryRuleOctave"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2095:1: entryRuleOctave returns [EObject current=null] : iv_ruleOctave= ruleOctave EOF ;
    public final EObject entryRuleOctave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctave = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2096:2: (iv_ruleOctave= ruleOctave EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2097:2: iv_ruleOctave= ruleOctave EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOctaveRule()); 
            }
            pushFollow(FOLLOW_ruleOctave_in_entryRuleOctave4781);
            iv_ruleOctave=ruleOctave();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOctave; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOctave4791); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOctave"


    // $ANTLR start "ruleOctave"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2104:1: ruleOctave returns [EObject current=null] : ( ( (lv_up_0_0= '\\'' ) )+ | ( (lv_down_1_0= ',' ) )+ ) ;
    public final EObject ruleOctave() throws RecognitionException {
        EObject current = null;

        Token lv_up_0_0=null;
        Token lv_down_1_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2107:28: ( ( ( (lv_up_0_0= '\\'' ) )+ | ( (lv_down_1_0= ',' ) )+ ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2108:1: ( ( (lv_up_0_0= '\\'' ) )+ | ( (lv_down_1_0= ',' ) )+ )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2108:1: ( ( (lv_up_0_0= '\\'' ) )+ | ( (lv_down_1_0= ',' ) )+ )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            else if ( (LA27_0==30) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2108:2: ( (lv_up_0_0= '\\'' ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2108:2: ( (lv_up_0_0= '\\'' ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2109:1: (lv_up_0_0= '\\'' )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2109:1: (lv_up_0_0= '\\'' )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2110:3: lv_up_0_0= '\\''
                    	    {
                    	    lv_up_0_0=(Token)match(input,29,FOLLOW_29_in_ruleOctave4834); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              newLeafNode(lv_up_0_0, grammarAccess.getOctaveAccess().getUpApostropheKeyword_0_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOctaveRule());
                    	      	        }
                    	             		addWithLastConsumed(current, "up", lv_up_0_0, "\'");
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2124:6: ( (lv_down_1_0= ',' ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2124:6: ( (lv_down_1_0= ',' ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        alt26 = dfa26.predict(input);
                        switch (alt26) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2125:1: (lv_down_1_0= ',' )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2125:1: (lv_down_1_0= ',' )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2126:3: lv_down_1_0= ','
                    	    {
                    	    lv_down_1_0=(Token)match(input,30,FOLLOW_30_in_ruleOctave4872); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              newLeafNode(lv_down_1_0, grammarAccess.getOctaveAccess().getDownCommaKeyword_1_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOctaveRule());
                    	      	        }
                    	             		addWithLastConsumed(current, "down", lv_down_1_0, ",");
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOctave"


    // $ANTLR start "entryRuleTransposedMusic"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2147:1: entryRuleTransposedMusic returns [EObject current=null] : iv_ruleTransposedMusic= ruleTransposedMusic EOF ;
    public final EObject entryRuleTransposedMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransposedMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2148:2: (iv_ruleTransposedMusic= ruleTransposedMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2149:2: iv_ruleTransposedMusic= ruleTransposedMusic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransposedMusicRule()); 
            }
            pushFollow(FOLLOW_ruleTransposedMusic_in_entryRuleTransposedMusic4922);
            iv_ruleTransposedMusic=ruleTransposedMusic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransposedMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransposedMusic4932); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransposedMusic"


    // $ANTLR start "ruleTransposedMusic"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:1: ruleTransposedMusic returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) ) ) ;
    public final EObject ruleTransposedMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_source_2_0 = null;

        EObject lv_target_3_0 = null;

        EObject lv_music_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2159:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2160:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2160:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2160:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTransposedMusic4969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransposedMusicAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2164:1: ( (lv_keyword_1_0= 'transpose' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2165:1: (lv_keyword_1_0= 'transpose' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2165:1: (lv_keyword_1_0= 'transpose' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2166:3: lv_keyword_1_0= 'transpose'
            {
            lv_keyword_1_0=(Token)match(input,46,FOLLOW_46_in_ruleTransposedMusic4987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getTransposedMusicAccess().getKeywordTransposeKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransposedMusicRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "transpose");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2179:2: ( (lv_source_2_0= rulePitch ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2180:1: (lv_source_2_0= rulePitch )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2180:1: (lv_source_2_0= rulePitch )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2181:3: lv_source_2_0= rulePitch
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransposedMusicAccess().getSourcePitchParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePitch_in_ruleTransposedMusic5021);
            lv_source_2_0=rulePitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransposedMusicRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_2_0, 
                      		"Pitch");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2197:2: ( (lv_target_3_0= rulePitch ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2198:1: (lv_target_3_0= rulePitch )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2198:1: (lv_target_3_0= rulePitch )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2199:3: lv_target_3_0= rulePitch
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransposedMusicAccess().getTargetPitchParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePitch_in_ruleTransposedMusic5042);
            lv_target_3_0=rulePitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransposedMusicRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_3_0, 
                      		"Pitch");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2215:2: ( (lv_music_4_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:1: (lv_music_4_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:1: (lv_music_4_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2217:3: lv_music_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransposedMusicAccess().getMusicExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTransposedMusic5063);
            lv_music_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransposedMusicRule());
              	        }
                     		set(
                     			current, 
                     			"music",
                      		lv_music_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransposedMusic"


    // $ANTLR start "entryRuleModeChange"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2241:1: entryRuleModeChange returns [EObject current=null] : iv_ruleModeChange= ruleModeChange EOF ;
    public final EObject entryRuleModeChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeChange = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2242:2: (iv_ruleModeChange= ruleModeChange EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2243:2: iv_ruleModeChange= ruleModeChange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModeChangeRule()); 
            }
            pushFollow(FOLLOW_ruleModeChange_in_entryRuleModeChange5099);
            iv_ruleModeChange=ruleModeChange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModeChange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModeChange5109); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeChange"


    // $ANTLR start "ruleModeChange"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2250:1: ruleModeChange returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) ) ) ;
    public final EObject ruleModeChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        Token lv_keyword_1_4=null;
        Token lv_keyword_1_5=null;
        EObject lv_music_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2253:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2254:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2254:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2254:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleModeChange5146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModeChangeAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2258:1: ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2259:1: ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2259:1: ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt28=1;
                }
                break;
            case 48:
                {
                alt28=2;
                }
                break;
            case 49:
                {
                alt28=3;
                }
                break;
            case 50:
                {
                alt28=4;
                }
                break;
            case 51:
                {
                alt28=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2261:3: lv_keyword_1_1= 'chordmode'
                    {
                    lv_keyword_1_1=(Token)match(input,47,FOLLOW_47_in_ruleModeChange5166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_1, grammarAccess.getModeChangeAccess().getKeywordChordmodeKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getModeChangeRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2273:8: lv_keyword_1_2= 'drummode'
                    {
                    lv_keyword_1_2=(Token)match(input,48,FOLLOW_48_in_ruleModeChange5195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_2, grammarAccess.getModeChangeAccess().getKeywordDrummodeKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getModeChangeRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2285:8: lv_keyword_1_3= 'figuremode'
                    {
                    lv_keyword_1_3=(Token)match(input,49,FOLLOW_49_in_ruleModeChange5224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_3, grammarAccess.getModeChangeAccess().getKeywordFiguremodeKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getModeChangeRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2297:8: lv_keyword_1_4= 'lyricmode'
                    {
                    lv_keyword_1_4=(Token)match(input,50,FOLLOW_50_in_ruleModeChange5253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_4, grammarAccess.getModeChangeAccess().getKeywordLyricmodeKeyword_1_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getModeChangeRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2309:8: lv_keyword_1_5= 'notemode'
                    {
                    lv_keyword_1_5=(Token)match(input,51,FOLLOW_51_in_ruleModeChange5282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_5, grammarAccess.getModeChangeAccess().getKeywordNotemodeKeyword_1_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getModeChangeRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_5, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2324:2: ( (lv_music_2_0= ruleBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2325:1: (lv_music_2_0= ruleBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2325:1: (lv_music_2_0= ruleBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2326:3: lv_music_2_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModeChangeAccess().getMusicBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleModeChange5319);
            lv_music_2_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModeChangeRule());
              	        }
                     		set(
                     			current, 
                     			"music",
                      		lv_music_2_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeChange"


    // $ANTLR start "entryRuleMusicWithLyrics"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2350:1: entryRuleMusicWithLyrics returns [EObject current=null] : iv_ruleMusicWithLyrics= ruleMusicWithLyrics EOF ;
    public final EObject entryRuleMusicWithLyrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicWithLyrics = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2351:2: (iv_ruleMusicWithLyrics= ruleMusicWithLyrics EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2352:2: iv_ruleMusicWithLyrics= ruleMusicWithLyrics EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMusicWithLyricsRule()); 
            }
            pushFollow(FOLLOW_ruleMusicWithLyrics_in_entryRuleMusicWithLyrics5355);
            iv_ruleMusicWithLyrics=ruleMusicWithLyrics();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMusicWithLyrics; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMusicWithLyrics5365); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMusicWithLyrics"


    // $ANTLR start "ruleMusicWithLyrics"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2359:1: ruleMusicWithLyrics returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) ) ) ;
    public final EObject ruleMusicWithLyrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_id_2_1=null;
        Token lv_id_2_2=null;
        EObject lv_lyrics_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2362:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2363:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2363:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2363:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMusicWithLyrics5402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMusicWithLyricsAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2367:1: ( (lv_keyword_1_0= 'lyricsto' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2368:1: (lv_keyword_1_0= 'lyricsto' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2368:1: (lv_keyword_1_0= 'lyricsto' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2369:3: lv_keyword_1_0= 'lyricsto'
            {
            lv_keyword_1_0=(Token)match(input,52,FOLLOW_52_in_ruleMusicWithLyrics5420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getMusicWithLyricsAccess().getKeywordLyricstoKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMusicWithLyricsRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "lyricsto");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2382:2: ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2383:1: ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2383:1: ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2384:1: (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2384:1: (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_STRING) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2385:3: lv_id_2_1= RULE_ID
                    {
                    lv_id_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMusicWithLyrics5452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_2_1, grammarAccess.getMusicWithLyricsAccess().getIdIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMusicWithLyricsRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_2_1, 
                              		"ID");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2400:8: lv_id_2_2= RULE_STRING
                    {
                    lv_id_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMusicWithLyrics5472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_2_2, grammarAccess.getMusicWithLyricsAccess().getIdSTRINGTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMusicWithLyricsRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_2_2, 
                              		"STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2418:2: ( (lv_lyrics_3_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2419:1: (lv_lyrics_3_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2419:1: (lv_lyrics_3_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2420:3: lv_lyrics_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMusicWithLyricsAccess().getLyricsExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleMusicWithLyrics5501);
            lv_lyrics_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMusicWithLyricsRule());
              	        }
                     		set(
                     			current, 
                     			"lyrics",
                      		lv_lyrics_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMusicWithLyrics"


    // $ANTLR start "entryRuleNewContext"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2444:1: entryRuleNewContext returns [EObject current=null] : iv_ruleNewContext= ruleNewContext EOF ;
    public final EObject entryRuleNewContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContext = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2445:2: (iv_ruleNewContext= ruleNewContext EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2446:2: iv_ruleNewContext= ruleNewContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewContextRule()); 
            }
            pushFollow(FOLLOW_ruleNewContext_in_entryRuleNewContext5537);
            iv_ruleNewContext=ruleNewContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewContext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewContext5547); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewContext"


    // $ANTLR start "ruleNewContext"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2453:1: ruleNewContext returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) ) ;
    public final EObject ruleNewContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_context_2_0=null;
        Token otherlv_3=null;
        Token lv_id_4_1=null;
        Token lv_id_4_2=null;
        EObject lv_modification_5_0 = null;

        EObject lv_music_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2456:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2457:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2457:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2457:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleNewContext5584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewContextAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2461:1: ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2462:1: ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2462:1: ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2463:1: (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2463:1: (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            else if ( (LA30_0==54) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2464:3: lv_keyword_1_1= 'new'
                    {
                    lv_keyword_1_1=(Token)match(input,53,FOLLOW_53_in_ruleNewContext5604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_1, grammarAccess.getNewContextAccess().getKeywordNewKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNewContextRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2476:8: lv_keyword_1_2= 'context'
                    {
                    lv_keyword_1_2=(Token)match(input,54,FOLLOW_54_in_ruleNewContext5633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_2, grammarAccess.getNewContextAccess().getKeywordContextKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNewContextRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2491:2: ( (lv_context_2_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2492:1: (lv_context_2_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2492:1: (lv_context_2_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2493:3: lv_context_2_0= RULE_ID
            {
            lv_context_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewContext5666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_context_2_0, grammarAccess.getNewContextAccess().getContextIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNewContextRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"context",
                      		lv_context_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2509:2: (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2509:4: otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleNewContext5684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNewContextAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2513:1: ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2514:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2514:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2515:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2515:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_STRING) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2516:3: lv_id_4_1= RULE_ID
                            {
                            lv_id_4_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewContext5703); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_id_4_1, grammarAccess.getNewContextAccess().getIdIDTerminalRuleCall_3_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getNewContextRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"id",
                                      		lv_id_4_1, 
                                      		"ID");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2531:8: lv_id_4_2= RULE_STRING
                            {
                            lv_id_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNewContext5723); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_id_4_2, grammarAccess.getNewContextAccess().getIdSTRINGTerminalRuleCall_3_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getNewContextRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"id",
                                      		lv_id_4_2, 
                                      		"STRING");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2549:4: ( (lv_modification_5_0= ruleContextModification ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2550:1: (lv_modification_5_0= ruleContextModification )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2550:1: (lv_modification_5_0= ruleContextModification )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2551:3: lv_modification_5_0= ruleContextModification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContextModification_in_ruleNewContext5754);
                    lv_modification_5_0=ruleContextModification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNewContextRule());
                      	        }
                             		set(
                             			current, 
                             			"modification",
                              		lv_modification_5_0, 
                              		"ContextModification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2567:3: ( (lv_music_6_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2568:1: (lv_music_6_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2568:1: (lv_music_6_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2569:3: lv_music_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewContextAccess().getMusicExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNewContext5776);
            lv_music_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNewContextRule());
              	        }
                     		set(
                     			current, 
                     			"music",
                      		lv_music_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewContext"


    // $ANTLR start "entryRuleContextModification"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2593:1: entryRuleContextModification returns [EObject current=null] : iv_ruleContextModification= ruleContextModification EOF ;
    public final EObject entryRuleContextModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModification = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2594:2: (iv_ruleContextModification= ruleContextModification EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2595:2: iv_ruleContextModification= ruleContextModification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextModificationRule()); 
            }
            pushFollow(FOLLOW_ruleContextModification_in_entryRuleContextModification5812);
            iv_ruleContextModification=ruleContextModification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextModification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextModification5822); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextModification"


    // $ANTLR start "ruleContextModification"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2602:1: ruleContextModification returns [EObject current=null] : (otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleContextModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2605:28: ( (otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2606:1: (otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2606:1: (otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2606:3: otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleContextModification5859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContextModificationAccess().getReverseSolidusKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleContextModification5871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContextModificationAccess().getWithKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2614:1: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2615:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2615:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2616:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContextModificationAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContextModification5892);
            lv_block_2_0=ruleUnparsedBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContextModificationRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_2_0, 
                      		"UnparsedBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextModification"


    // $ANTLR start "entryRuleContextDef"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2640:1: entryRuleContextDef returns [EObject current=null] : iv_ruleContextDef= ruleContextDef EOF ;
    public final EObject entryRuleContextDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDef = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2641:2: (iv_ruleContextDef= ruleContextDef EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2642:2: iv_ruleContextDef= ruleContextDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextDefRule()); 
            }
            pushFollow(FOLLOW_ruleContextDef_in_entryRuleContextDef5928);
            iv_ruleContextDef=ruleContextDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDef5938); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextDef"


    // $ANTLR start "ruleContextDef"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2649:1: ruleContextDef returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleContextDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2652:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2653:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2653:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2653:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleContextDef5975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContextDefAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2657:1: ( (lv_keyword_1_0= 'context' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2658:1: (lv_keyword_1_0= 'context' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2658:1: (lv_keyword_1_0= 'context' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2659:3: lv_keyword_1_0= 'context'
            {
            lv_keyword_1_0=(Token)match(input,54,FOLLOW_54_in_ruleContextDef5993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_keyword_1_0, grammarAccess.getContextDefAccess().getKeywordContextKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getContextDefRule());
              	        }
                     		setWithLastConsumed(current, "keyword", lv_keyword_1_0, "context");
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2672:2: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2673:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2673:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2674:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContextDefAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContextDef6027);
            lv_block_2_0=ruleUnparsedBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContextDefRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_2_0, 
                      		"UnparsedBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextDef"


    // $ANTLR start "entryRuleStringIndication"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2698:1: entryRuleStringIndication returns [EObject current=null] : iv_ruleStringIndication= ruleStringIndication EOF ;
    public final EObject entryRuleStringIndication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringIndication = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2699:2: (iv_ruleStringIndication= ruleStringIndication EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2700:2: iv_ruleStringIndication= ruleStringIndication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringIndicationRule()); 
            }
            pushFollow(FOLLOW_ruleStringIndication_in_entryRuleStringIndication6063);
            iv_ruleStringIndication=ruleStringIndication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringIndication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringIndication6073); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringIndication"


    // $ANTLR start "ruleStringIndication"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2707:1: ruleStringIndication returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) ) ) ;
    public final EObject ruleStringIndication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_1_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2710:28: ( (otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2711:1: (otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2711:1: (otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2711:3: otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleStringIndication6110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringIndicationAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2715:1: ( (lv_string_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2716:1: (lv_string_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2716:1: (lv_string_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2717:3: lv_string_1_0= RULE_INT
            {
            lv_string_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringIndication6127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_string_1_0, grammarAccess.getStringIndicationAccess().getStringINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringIndicationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"string",
                      		lv_string_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringIndication"


    // $ANTLR start "entryRuleOther"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2741:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2742:2: (iv_ruleOther= ruleOther EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2743:2: iv_ruleOther= ruleOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOther_in_entryRuleOther6168);
            iv_ruleOther=ruleOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOther; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOther6178); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOther"


    // $ANTLR start "ruleOther"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2750:1: ruleOther returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        AntlrDatatypeRuleToken lv_keyword_1_1 = null;

        AntlrDatatypeRuleToken lv_keyword_1_4 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2753:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2754:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2754:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2754:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleOther6215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOtherAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2758:1: ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2759:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2759:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2760:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2760:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt34=1;
                }
                break;
            case 27:
                {
                alt34=2;
                }
                break;
            case 28:
                {
                alt34=3;
                }
                break;
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2761:3: lv_keyword_1_1= ruleSpecialCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherAccess().getKeywordSpecialCharacterParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleOther6238);
                    lv_keyword_1_1=ruleSpecialCharacter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOtherRule());
                      	        }
                             		set(
                             			current, 
                             			"keyword",
                              		lv_keyword_1_1, 
                              		"SpecialCharacter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2776:8: lv_keyword_1_2= '('
                    {
                    lv_keyword_1_2=(Token)match(input,27,FOLLOW_27_in_ruleOther6254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_2, grammarAccess.getOtherAccess().getKeywordLeftParenthesisKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOtherRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2788:8: lv_keyword_1_3= ')'
                    {
                    lv_keyword_1_3=(Token)match(input,28,FOLLOW_28_in_ruleOther6283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keyword_1_3, grammarAccess.getOtherAccess().getKeywordRightParenthesisKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOtherRule());
                      	        }
                             		setWithLastConsumed(current, "keyword", lv_keyword_1_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2800:8: lv_keyword_1_4= ruleOtherName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherAccess().getKeywordOtherNameParserRuleCall_1_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleOther6315);
                    lv_keyword_1_4=ruleOtherName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOtherRule());
                      	        }
                             		set(
                             			current, 
                             			"keyword",
                              		lv_keyword_1_4, 
                              		"OtherName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOther"


    // $ANTLR start "entryRuleOtherName"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2826:1: entryRuleOtherName returns [String current=null] : iv_ruleOtherName= ruleOtherName EOF ;
    public final String entryRuleOtherName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOtherName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2827:2: (iv_ruleOtherName= ruleOtherName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2828:2: iv_ruleOtherName= ruleOtherName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherNameRule()); 
            }
            pushFollow(FOLLOW_ruleOtherName_in_entryRuleOtherName6355);
            iv_ruleOtherName=ruleOtherName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherName6366); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOtherName"


    // $ANTLR start "ruleOtherName"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2835:1: ruleOtherName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'accepts' | kw= 'addlyrics' | kw= 'alias' | kw= 'alternative' | kw= 'change' | kw= 'chords' | kw= 'consists' | kw= 'default' | kw= 'defaultchild' | kw= 'denies' | kw= 'description' | kw= 'drums' | kw= 'figures' | kw= 'grobdescriptions' | kw= 'key' | kw= 'lyrics' | kw= 'maininput' | kw= 'mark' | kw= 'name' | kw= 'objectid' | kw= 'octave' | kw= 'once' | kw= 'override' | kw= 'partial' | kw= 'remove' | kw= 'repeat' | kw= 'rest' | kw= 'revert' | kw= 'sequential' | kw= 'set' | kw= 'simultaneous' | kw= 'skip' | kw= 'tempo' | kw= 'time' | kw= 'times' | kw= 'type' | kw= 'unset' | kw= 'with' ) ;
    public final AntlrDatatypeRuleToken ruleOtherName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2838:28: ( (kw= 'accepts' | kw= 'addlyrics' | kw= 'alias' | kw= 'alternative' | kw= 'change' | kw= 'chords' | kw= 'consists' | kw= 'default' | kw= 'defaultchild' | kw= 'denies' | kw= 'description' | kw= 'drums' | kw= 'figures' | kw= 'grobdescriptions' | kw= 'key' | kw= 'lyrics' | kw= 'maininput' | kw= 'mark' | kw= 'name' | kw= 'objectid' | kw= 'octave' | kw= 'once' | kw= 'override' | kw= 'partial' | kw= 'remove' | kw= 'repeat' | kw= 'rest' | kw= 'revert' | kw= 'sequential' | kw= 'set' | kw= 'simultaneous' | kw= 'skip' | kw= 'tempo' | kw= 'time' | kw= 'times' | kw= 'type' | kw= 'unset' | kw= 'with' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2839:1: (kw= 'accepts' | kw= 'addlyrics' | kw= 'alias' | kw= 'alternative' | kw= 'change' | kw= 'chords' | kw= 'consists' | kw= 'default' | kw= 'defaultchild' | kw= 'denies' | kw= 'description' | kw= 'drums' | kw= 'figures' | kw= 'grobdescriptions' | kw= 'key' | kw= 'lyrics' | kw= 'maininput' | kw= 'mark' | kw= 'name' | kw= 'objectid' | kw= 'octave' | kw= 'once' | kw= 'override' | kw= 'partial' | kw= 'remove' | kw= 'repeat' | kw= 'rest' | kw= 'revert' | kw= 'sequential' | kw= 'set' | kw= 'simultaneous' | kw= 'skip' | kw= 'tempo' | kw= 'time' | kw= 'times' | kw= 'type' | kw= 'unset' | kw= 'with' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2839:1: (kw= 'accepts' | kw= 'addlyrics' | kw= 'alias' | kw= 'alternative' | kw= 'change' | kw= 'chords' | kw= 'consists' | kw= 'default' | kw= 'defaultchild' | kw= 'denies' | kw= 'description' | kw= 'drums' | kw= 'figures' | kw= 'grobdescriptions' | kw= 'key' | kw= 'lyrics' | kw= 'maininput' | kw= 'mark' | kw= 'name' | kw= 'objectid' | kw= 'octave' | kw= 'once' | kw= 'override' | kw= 'partial' | kw= 'remove' | kw= 'repeat' | kw= 'rest' | kw= 'revert' | kw= 'sequential' | kw= 'set' | kw= 'simultaneous' | kw= 'skip' | kw= 'tempo' | kw= 'time' | kw= 'times' | kw= 'type' | kw= 'unset' | kw= 'with' )
            int alt35=38;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt35=1;
                }
                break;
            case 57:
                {
                alt35=2;
                }
                break;
            case 58:
                {
                alt35=3;
                }
                break;
            case 59:
                {
                alt35=4;
                }
                break;
            case 60:
                {
                alt35=5;
                }
                break;
            case 61:
                {
                alt35=6;
                }
                break;
            case 62:
                {
                alt35=7;
                }
                break;
            case 63:
                {
                alt35=8;
                }
                break;
            case 64:
                {
                alt35=9;
                }
                break;
            case 65:
                {
                alt35=10;
                }
                break;
            case 66:
                {
                alt35=11;
                }
                break;
            case 67:
                {
                alt35=12;
                }
                break;
            case 68:
                {
                alt35=13;
                }
                break;
            case 69:
                {
                alt35=14;
                }
                break;
            case 70:
                {
                alt35=15;
                }
                break;
            case 71:
                {
                alt35=16;
                }
                break;
            case 72:
                {
                alt35=17;
                }
                break;
            case 73:
                {
                alt35=18;
                }
                break;
            case 74:
                {
                alt35=19;
                }
                break;
            case 75:
                {
                alt35=20;
                }
                break;
            case 76:
                {
                alt35=21;
                }
                break;
            case 77:
                {
                alt35=22;
                }
                break;
            case 78:
                {
                alt35=23;
                }
                break;
            case 79:
                {
                alt35=24;
                }
                break;
            case 80:
                {
                alt35=25;
                }
                break;
            case 81:
                {
                alt35=26;
                }
                break;
            case 82:
                {
                alt35=27;
                }
                break;
            case 83:
                {
                alt35=28;
                }
                break;
            case 84:
                {
                alt35=29;
                }
                break;
            case 85:
                {
                alt35=30;
                }
                break;
            case 86:
                {
                alt35=31;
                }
                break;
            case 87:
                {
                alt35=32;
                }
                break;
            case 88:
                {
                alt35=33;
                }
                break;
            case 89:
                {
                alt35=34;
                }
                break;
            case 90:
                {
                alt35=35;
                }
                break;
            case 91:
                {
                alt35=36;
                }
                break;
            case 92:
                {
                alt35=37;
                }
                break;
            case 55:
                {
                alt35=38;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2840:2: kw= 'accepts'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOtherName6404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getAcceptsKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2847:2: kw= 'addlyrics'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOtherName6423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2854:2: kw= 'alias'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOtherName6442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getAliasKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2861:2: kw= 'alternative'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOtherName6461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getAlternativeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2868:2: kw= 'change'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOtherName6480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getChangeKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2875:2: kw= 'chords'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleOtherName6499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getChordsKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2882:2: kw= 'consists'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOtherName6518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getConsistsKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2889:2: kw= 'default'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleOtherName6537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDefaultKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2896:2: kw= 'defaultchild'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleOtherName6556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDefaultchildKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2903:2: kw= 'denies'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleOtherName6575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDeniesKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2910:2: kw= 'description'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleOtherName6594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDescriptionKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2917:2: kw= 'drums'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleOtherName6613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDrumsKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2924:2: kw= 'figures'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleOtherName6632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getFiguresKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2931:2: kw= 'grobdescriptions'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleOtherName6651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2938:2: kw= 'key'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleOtherName6670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getKeyKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2945:2: kw= 'lyrics'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleOtherName6689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getLyricsKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2952:2: kw= 'maininput'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleOtherName6708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getMaininputKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2959:2: kw= 'mark'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleOtherName6727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getMarkKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2966:2: kw= 'name'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleOtherName6746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getNameKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2973:2: kw= 'objectid'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleOtherName6765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getObjectidKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2980:2: kw= 'octave'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleOtherName6784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getOctaveKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2987:2: kw= 'once'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleOtherName6803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getOnceKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2994:2: kw= 'override'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleOtherName6822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getOverrideKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3001:2: kw= 'partial'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleOtherName6841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getPartialKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3008:2: kw= 'remove'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleOtherName6860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getRemoveKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3015:2: kw= 'repeat'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleOtherName6879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getRepeatKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3022:2: kw= 'rest'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleOtherName6898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getRestKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3029:2: kw= 'revert'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleOtherName6917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getRevertKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3036:2: kw= 'sequential'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleOtherName6936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getSequentialKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3043:2: kw= 'set'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleOtherName6955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getSetKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3050:2: kw= 'simultaneous'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleOtherName6974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getSimultaneousKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3057:2: kw= 'skip'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleOtherName6993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getSkipKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3064:2: kw= 'tempo'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleOtherName7012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getTempoKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3071:2: kw= 'time'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleOtherName7031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getTimeKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3078:2: kw= 'times'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleOtherName7050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getTimesKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3085:2: kw= 'type'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleOtherName7069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getTypeKeyword_35()); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3092:2: kw= 'unset'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleOtherName7088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getUnsetKeyword_36()); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3099:2: kw= 'with'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOtherName7107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getWithKeyword_37()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOtherName"


    // $ANTLR start "entryRuleSpecialCommandName"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3112:1: entryRuleSpecialCommandName returns [String current=null] : iv_ruleSpecialCommandName= ruleSpecialCommandName EOF ;
    public final String entryRuleSpecialCommandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCommandName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3113:2: (iv_ruleSpecialCommandName= ruleSpecialCommandName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3114:2: iv_ruleSpecialCommandName= ruleSpecialCommandName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialCommandNameRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName7148);
            iv_ruleSpecialCommandName=ruleSpecialCommandName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialCommandName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommandName7159); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialCommandName"


    // $ANTLR start "ruleSpecialCommandName"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3121:1: ruleSpecialCommandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCommandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OtherName_24 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3124:28: ( (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3125:1: (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3125:1: (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName )
            int alt36=25;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3126:2: kw= 'include'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleSpecialCommandName7197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3133:2: kw= 'version'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleSpecialCommandName7216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3140:2: kw= 'sourcefilename'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleSpecialCommandName7235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getSourcefilenameKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3147:2: kw= 'sourcefileline'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleSpecialCommandName7254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getSourcefilelineKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3154:2: kw= 'markup'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleSpecialCommandName7273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3161:2: kw= 'markuplines'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleSpecialCommandName7292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3168:2: kw= 'book'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleSpecialCommandName7311); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getBookKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3175:2: kw= 'bookpart'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleSpecialCommandName7330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getBookpartKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3182:2: kw= 'context'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleSpecialCommandName7349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getContextKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3189:2: kw= 'header'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleSpecialCommandName7368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getHeaderKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3196:2: kw= 'score'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleSpecialCommandName7387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getScoreKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3203:2: kw= 'paper'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleSpecialCommandName7406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getPaperKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3210:2: kw= 'midi'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleSpecialCommandName7425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getMidiKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3217:2: kw= 'layout'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleSpecialCommandName7444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getLayoutKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3224:2: kw= 'relative'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleSpecialCommandName7463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getRelativeKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3231:2: kw= 'transpose'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleSpecialCommandName7482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getTransposeKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3238:2: kw= 'chordmode'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleSpecialCommandName7501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getChordmodeKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3245:2: kw= 'drummode'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleSpecialCommandName7520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getDrummodeKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3252:2: kw= 'figuremode'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleSpecialCommandName7539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getFiguremodeKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3259:2: kw= 'lyricmode'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleSpecialCommandName7558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getLyricmodeKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3266:2: kw= 'notemode'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleSpecialCommandName7577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getNotemodeKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3273:2: kw= 'lyricsto'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleSpecialCommandName7596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getLyricstoKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3280:2: kw= 'new'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleSpecialCommandName7615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getNewKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3287:2: kw= 'with'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleSpecialCommandName7634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getWithKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3294:5: this_OtherName_24= ruleOtherName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandNameAccess().getOtherNameParserRuleCall_24()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleSpecialCommandName7662);
                    this_OtherName_24=ruleOtherName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OtherName_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialCommandName"


    // $ANTLR start "entryRuleScheme"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3312:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3316:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3317:2: iv_ruleScheme= ruleScheme EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeRule()); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme7713);
            iv_ruleScheme=ruleScheme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme7723); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleScheme"


    // $ANTLR start "ruleScheme"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3327:1: ruleScheme returns [EObject current=null] : ( (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3331:28: ( ( (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3332:1: ( (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3332:1: ( (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3332:2: (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3332:2: (otherlv_0= '#' | otherlv_1= '$' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==93) ) {
                alt37=1;
            }
            else if ( (LA37_0==94) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3332:4: otherlv_0= '#'
                    {
                    otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleScheme7765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSchemeAccess().getNumberSignKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3337:7: otherlv_1= '$'
                    {
                    otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleScheme7783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSchemeAccess().getDollarSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3341:2: ( (lv_value_2_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3342:1: (lv_value_2_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3342:1: (lv_value_2_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3343:3: lv_value_2_0= ruleSchemeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme7805);
            lv_value_2_0=ruleSchemeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSchemeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"SchemeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleScheme"


    // $ANTLR start "entryRuleSchemeExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3370:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3371:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3372:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression7845);
            iv_ruleSchemeExpression=ruleSchemeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression7855); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeExpression"


    // $ANTLR start "ruleSchemeExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3379:1: ruleSchemeExpression returns [EObject current=null] : ( ( ( (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' ) ) )* ( (lv_reference_1_0= '$' ) )? ( (lv_value_2_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_quotations_0_1=null;
        Token lv_quotations_0_2=null;
        Token lv_quotations_0_3=null;
        Token lv_quotations_0_4=null;
        Token lv_reference_1_0=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3382:28: ( ( ( ( (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' ) ) )* ( (lv_reference_1_0= '$' ) )? ( (lv_value_2_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3383:1: ( ( ( (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' ) ) )* ( (lv_reference_1_0= '$' ) )? ( (lv_value_2_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3383:1: ( ( ( (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' ) ) )* ( (lv_reference_1_0= '$' ) )? ( (lv_value_2_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3383:2: ( ( (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' ) ) )* ( (lv_reference_1_0= '$' ) )? ( (lv_value_2_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3383:2: ( ( (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=29 && LA39_0<=30)||(LA39_0>=95 && LA39_0<=96)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3384:1: ( (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' ) )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3384:1: ( (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' ) )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3385:1: (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3385:1: (lv_quotations_0_1= '\\'' | lv_quotations_0_2= '`' | lv_quotations_0_3= ',' | lv_quotations_0_4= '@' )
            	    int alt38=4;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case 95:
            	        {
            	        alt38=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt38=3;
            	        }
            	        break;
            	    case 96:
            	        {
            	        alt38=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt38) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3386:3: lv_quotations_0_1= '\\''
            	            {
            	            lv_quotations_0_1=(Token)match(input,29,FOLLOW_29_in_ruleSchemeExpression7900); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_quotations_0_1, grammarAccess.getSchemeExpressionAccess().getQuotationsApostropheKeyword_0_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
            	              	        }
            	                     		addWithLastConsumed(current, "quotations", lv_quotations_0_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3398:8: lv_quotations_0_2= '`'
            	            {
            	            lv_quotations_0_2=(Token)match(input,95,FOLLOW_95_in_ruleSchemeExpression7929); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_quotations_0_2, grammarAccess.getSchemeExpressionAccess().getQuotationsGraveAccentKeyword_0_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
            	              	        }
            	                     		addWithLastConsumed(current, "quotations", lv_quotations_0_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3410:8: lv_quotations_0_3= ','
            	            {
            	            lv_quotations_0_3=(Token)match(input,30,FOLLOW_30_in_ruleSchemeExpression7958); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_quotations_0_3, grammarAccess.getSchemeExpressionAccess().getQuotationsCommaKeyword_0_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
            	              	        }
            	                     		addWithLastConsumed(current, "quotations", lv_quotations_0_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3422:8: lv_quotations_0_4= '@'
            	            {
            	            lv_quotations_0_4=(Token)match(input,96,FOLLOW_96_in_ruleSchemeExpression7987); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_quotations_0_4, grammarAccess.getSchemeExpressionAccess().getQuotationsCommercialAtKeyword_0_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
            	              	        }
            	                     		addWithLastConsumed(current, "quotations", lv_quotations_0_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3437:3: ( (lv_reference_1_0= '$' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==94) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3438:1: (lv_reference_1_0= '$' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3438:1: (lv_reference_1_0= '$' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3439:3: lv_reference_1_0= '$'
                    {
                    lv_reference_1_0=(Token)match(input,94,FOLLOW_94_in_ruleSchemeExpression8022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_reference_1_0, grammarAccess.getSchemeExpressionAccess().getReferenceDollarSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "reference", true, "$");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3452:3: ( (lv_value_2_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3453:1: (lv_value_2_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3453:1: (lv_value_2_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3454:3: lv_value_2_0= ruleSchemeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression8057);
            lv_value_2_0=ruleSchemeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSchemeExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"SchemeValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeExpression"


    // $ANTLR start "entryRuleSchemeValue"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3478:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3479:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3480:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue8093);
            iv_ruleSchemeValue=ruleSchemeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue8103); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeValue"


    // $ANTLR start "ruleSchemeValue"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3487:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) ;
    public final EObject ruleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SchemeBoolean_0 = null;

        EObject this_SchemeList_1 = null;

        EObject this_SchemeBlock_2 = null;

        EObject this_SchemeCharacter_3 = null;

        EObject this_SchemeNumber_4 = null;

        EObject this_SchemeText_5 = null;

        EObject this_SchemeMarkupCommand_6 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3490:28: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3491:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3491:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            int alt41=7;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3492:2: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue8153);
                    this_SchemeBoolean_0=ruleSchemeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SchemeBoolean_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3505:2: this_SchemeList_1= ruleSchemeList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue8183);
                    this_SchemeList_1=ruleSchemeList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SchemeList_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3518:2: this_SchemeBlock_2= ruleSchemeBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue8213);
                    this_SchemeBlock_2=ruleSchemeBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SchemeBlock_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3531:2: this_SchemeCharacter_3= ruleSchemeCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue8243);
                    this_SchemeCharacter_3=ruleSchemeCharacter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SchemeCharacter_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3544:2: this_SchemeNumber_4= ruleSchemeNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_ruleSchemeValue8273);
                    this_SchemeNumber_4=ruleSchemeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SchemeNumber_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3557:2: this_SchemeText_5= ruleSchemeText
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue8303);
                    this_SchemeText_5=ruleSchemeText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SchemeText_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3570:2: this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue8333);
                    this_SchemeMarkupCommand_6=ruleSchemeMarkupCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SchemeMarkupCommand_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeValue"


    // $ANTLR start "entryRuleSchemeBoolean"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3589:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3590:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3591:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean8368);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean8378); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeBoolean"


    // $ANTLR start "ruleSchemeBoolean"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3598:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeBooleanValue ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3601:28: ( ( (lv_value_0_0= ruleSchemeBooleanValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3602:1: ( (lv_value_0_0= ruleSchemeBooleanValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3602:1: ( (lv_value_0_0= ruleSchemeBooleanValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3603:1: (lv_value_0_0= ruleSchemeBooleanValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3603:1: (lv_value_0_0= ruleSchemeBooleanValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3604:3: lv_value_0_0= ruleSchemeBooleanValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeBooleanAccess().getValueSchemeBooleanValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeBooleanValue_in_ruleSchemeBoolean8423);
            lv_value_0_0=ruleSchemeBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSchemeBooleanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"SchemeBooleanValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeBoolean"


    // $ANTLR start "entryRuleSchemeBooleanValue"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3628:1: entryRuleSchemeBooleanValue returns [String current=null] : iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF ;
    public final String entryRuleSchemeBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeBooleanValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3629:2: (iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3630:2: iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBooleanValue_in_entryRuleSchemeBooleanValue8459);
            iv_ruleSchemeBooleanValue=ruleSchemeBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeBooleanValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBooleanValue8470); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeBooleanValue"


    // $ANTLR start "ruleSchemeBooleanValue"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3637:1: ruleSchemeBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3640:28: ( (kw= '#' this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3641:1: (kw= '#' this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3641:1: (kw= '#' this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3642:2: kw= '#' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleSchemeBooleanValue8508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSchemeBooleanValueAccess().getNumberSignKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeBooleanValue8523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getSchemeBooleanValueAccess().getIDTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeBooleanValue"


    // $ANTLR start "entryRuleSchemeList"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3662:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3663:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3664:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeListRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList8568);
            iv_ruleSchemeList=ruleSchemeList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList8578); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeList"


    // $ANTLR start "ruleSchemeList"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3671:1: ruleSchemeList returns [EObject current=null] : ( () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')' ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        Token lv_vector_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3674:28: ( ( () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3675:1: ( () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3675:1: ( () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3675:2: () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3675:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3676:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSchemeListAccess().getSchemeListAction_0(),
                          current);
                  
            }

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3684:2: ( (lv_vector_1_0= '#' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==93) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3685:1: (lv_vector_1_0= '#' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3685:1: (lv_vector_1_0= '#' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3686:3: lv_vector_1_0= '#'
                    {
                    lv_vector_1_0=(Token)match(input,93,FOLLOW_93_in_ruleSchemeList8633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_vector_1_0, grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSchemeListRule());
                      	        }
                             		setWithLastConsumed(current, "vector", true, "#");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSchemeList8659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3703:1: ( (lv_expressions_3_0= ruleSchemeExpression ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_ANY_OTHER)||LA43_0==13||(LA43_0>=18 && LA43_0<=25)||LA43_0==27||(LA43_0>=29 && LA43_0<=30)||(LA43_0>=32 && LA43_0<=97)||(LA43_0>=99 && LA43_0<=102)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3704:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3704:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3705:3: lv_expressions_3_0= ruleSchemeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList8680);
            	    lv_expressions_3_0=ruleSchemeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSchemeListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_3_0, 
            	              		"SchemeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSchemeList8693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeList"


    // $ANTLR start "entryRuleSchemeBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3733:1: entryRuleSchemeBlock returns [EObject current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final EObject entryRuleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3734:2: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3735:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock8729);
            iv_ruleSchemeBlock=ruleSchemeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock8739); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeBlock"


    // $ANTLR start "ruleSchemeBlock"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3742:1: ruleSchemeBlock returns [EObject current=null] : (otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}' ) ;
    public final EObject ruleSchemeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3745:28: ( (otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3746:1: (otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3746:1: (otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3746:3: otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleSchemeBlock8776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3750:1: ( (lv_elements_1_0= ruleExpression ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_ANY_OTHER)||(LA44_0>=13 && LA44_0<=14)||LA44_0==16||(LA44_0>=18 && LA44_0<=94)||(LA44_0>=100 && LA44_0<=101)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3751:1: (lv_elements_1_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3751:1: (lv_elements_1_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3752:3: lv_elements_1_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSchemeBlockAccess().getElementsExpressionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSchemeBlock8797);
            	    lv_elements_1_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSchemeBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            otherlv_2=(Token)match(input,98,FOLLOW_98_in_ruleSchemeBlock8810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeBlock"


    // $ANTLR start "entryRuleSchemeCharacter"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3780:1: entryRuleSchemeCharacter returns [EObject current=null] : iv_ruleSchemeCharacter= ruleSchemeCharacter EOF ;
    public final EObject entryRuleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3781:2: (iv_ruleSchemeCharacter= ruleSchemeCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3782:2: iv_ruleSchemeCharacter= ruleSchemeCharacter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter8846);
            iv_ruleSchemeCharacter=ruleSchemeCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeCharacter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter8856); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeCharacter"


    // $ANTLR start "ruleSchemeCharacter"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3789:1: ruleSchemeCharacter returns [EObject current=null] : (otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) ;
    public final EObject ruleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_3=null;
        AntlrDatatypeRuleToken lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3792:28: ( (otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3793:1: (otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3793:1: (otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3793:3: otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleSchemeCharacter8893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3797:1: ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3798:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3798:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3799:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3799:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt45=1;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt45=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3800:3: lv_value_1_1= RULE_ID
                    {
                    lv_value_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeCharacter8912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_1, grammarAccess.getSchemeCharacterAccess().getValueIDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSchemeCharacterRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_1, 
                              		"ID");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3815:8: lv_value_1_2= ruleSpecialCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter8936);
                    lv_value_1_2=ruleSpecialCharacter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSchemeCharacterRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_2, 
                              		"SpecialCharacter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3830:8: lv_value_1_3= RULE_ANY_OTHER
                    {
                    lv_value_1_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter8951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_3, grammarAccess.getSchemeCharacterAccess().getValueANY_OTHERTerminalRuleCall_1_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSchemeCharacterRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_3, 
                              		"ANY_OTHER");
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeCharacter"


    // $ANTLR start "entryRuleSchemeText"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3856:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3857:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3858:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeTextRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText8995);
            iv_ruleSchemeText=ruleSchemeText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText9005); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeText"


    // $ANTLR start "ruleSchemeText"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3865:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeTextValue ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3868:28: ( ( (lv_value_0_0= ruleSchemeTextValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3869:1: ( (lv_value_0_0= ruleSchemeTextValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3869:1: ( (lv_value_0_0= ruleSchemeTextValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3870:1: (lv_value_0_0= ruleSchemeTextValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3870:1: (lv_value_0_0= ruleSchemeTextValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3871:3: lv_value_0_0= ruleSchemeTextValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeTextValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeTextValue_in_ruleSchemeText9050);
            lv_value_0_0=ruleSchemeTextValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSchemeTextRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"SchemeTextValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeText"


    // $ANTLR start "entryRuleSchemeTextValue"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3895:1: entryRuleSchemeTextValue returns [String current=null] : iv_ruleSchemeTextValue= ruleSchemeTextValue EOF ;
    public final String entryRuleSchemeTextValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3896:2: (iv_ruleSchemeTextValue= ruleSchemeTextValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3897:2: iv_ruleSchemeTextValue= ruleSchemeTextValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeTextValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextValue_in_entryRuleSchemeTextValue9086);
            iv_ruleSchemeTextValue=ruleSchemeTextValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeTextValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextValue9097); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeTextValue"


    // $ANTLR start "ruleSchemeTextValue"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3904:1: ruleSchemeTextValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SchemeTextValueSegment_0 = null;

        AntlrDatatypeRuleToken this_SchemeTextValueSegment_3 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3907:28: ( (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3908:1: (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3908:1: (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3909:5: this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSchemeTextValueAccess().getSchemeTextValueSegmentParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue9144);
            this_SchemeTextValueSegment_0=ruleSchemeTextValueSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SchemeTextValueSegment_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3919:1: (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3920:2: kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleSchemeTextValue9163); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSchemeTextValueAccess().getColonKeyword_1_0()); 
            	          
            	    }
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3925:1: (kw= ':' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==31) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3926:2: kw= ':'
            	            {
            	            kw=(Token)match(input,31,FOLLOW_31_in_ruleSchemeTextValue9177); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getSchemeTextValueAccess().getColonKeyword_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSchemeTextValueAccess().getSchemeTextValueSegmentParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue9201);
            	    this_SchemeTextValueSegment_3=ruleSchemeTextValueSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SchemeTextValueSegment_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeTextValue"


    // $ANTLR start "entryRuleSchemeTextValueSegment"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3950:1: entryRuleSchemeTextValueSegment returns [String current=null] : iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF ;
    public final String entryRuleSchemeTextValueSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextValueSegment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3951:2: (iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3952:2: iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeTextValueSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_entryRuleSchemeTextValueSegment9249);
            iv_ruleSchemeTextValueSegment=ruleSchemeTextValueSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeTextValueSegment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextValueSegment9260); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeTextValueSegment"


    // $ANTLR start "ruleSchemeTextValueSegment"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3959:1: ruleSchemeTextValueSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\\\\\' | kw= '=' | kw= '-' | this_SpecialCharacter_3= ruleSpecialCharacter | this_SchemeIdentifier_4= ruleSchemeIdentifier | this_STRING_5= RULE_STRING | this_INT_6= RULE_INT | this_ANY_OTHER_7= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextValueSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_5=null;
        Token this_INT_6=null;
        Token this_ANY_OTHER_7=null;
        AntlrDatatypeRuleToken this_SpecialCharacter_3 = null;

        AntlrDatatypeRuleToken this_SchemeIdentifier_4 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3962:28: ( (kw= '\\\\\\\\' | kw= '=' | kw= '-' | this_SpecialCharacter_3= ruleSpecialCharacter | this_SchemeIdentifier_4= ruleSchemeIdentifier | this_STRING_5= RULE_STRING | this_INT_6= RULE_INT | this_ANY_OTHER_7= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3963:1: (kw= '\\\\\\\\' | kw= '=' | kw= '-' | this_SpecialCharacter_3= ruleSpecialCharacter | this_SchemeIdentifier_4= ruleSchemeIdentifier | this_STRING_5= RULE_STRING | this_INT_6= RULE_INT | this_ANY_OTHER_7= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3963:1: (kw= '\\\\\\\\' | kw= '=' | kw= '-' | this_SpecialCharacter_3= ruleSpecialCharacter | this_SchemeIdentifier_4= ruleSchemeIdentifier | this_STRING_5= RULE_STRING | this_INT_6= RULE_INT | this_ANY_OTHER_7= RULE_ANY_OTHER )
            int alt48=8;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt48=1;
                }
                break;
            case 13:
                {
                alt48=2;
                }
                break;
            case 101:
                {
                alt48=3;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt48=4;
                }
                break;
            case RULE_ID:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt48=5;
                }
                break;
            case RULE_STRING:
                {
                alt48=6;
                }
                break;
            case RULE_INT:
                {
                alt48=7;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt48=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3964:2: kw= '\\\\\\\\'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleSchemeTextValueSegment9298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSchemeTextValueSegmentAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3971:2: kw= '='
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleSchemeTextValueSegment9317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSchemeTextValueSegmentAccess().getEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3978:2: kw= '-'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleSchemeTextValueSegment9336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSchemeTextValueSegmentAccess().getHyphenMinusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3985:5: this_SpecialCharacter_3= ruleSpecialCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSpecialCharacterParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextValueSegment9364);
                    this_SpecialCharacter_3=ruleSpecialCharacter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SpecialCharacter_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3997:5: this_SchemeIdentifier_4= ruleSchemeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSchemeIdentifierParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeIdentifier_in_ruleSchemeTextValueSegment9397);
                    this_SchemeIdentifier_4=ruleSchemeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SchemeIdentifier_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4008:10: this_STRING_5= RULE_STRING
                    {
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemeTextValueSegment9423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_5, grammarAccess.getSchemeTextValueSegmentAccess().getSTRINGTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4016:10: this_INT_6= RULE_INT
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeTextValueSegment9449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_6, grammarAccess.getSchemeTextValueSegmentAccess().getINTTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4024:10: this_ANY_OTHER_7= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_7=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextValueSegment9475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ANY_OTHER_7, grammarAccess.getSchemeTextValueSegmentAccess().getANY_OTHERTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeTextValueSegment"


    // $ANTLR start "entryRuleSchemeIdentifier"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4039:1: entryRuleSchemeIdentifier returns [String current=null] : iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF ;
    public final String entryRuleSchemeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeIdentifier = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4040:2: (iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4041:2: iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeIdentifier_in_entryRuleSchemeIdentifier9521);
            iv_ruleSchemeIdentifier=ruleSchemeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeIdentifier9532); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeIdentifier"


    // $ANTLR start "ruleSchemeIdentifier"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4048:1: ruleSchemeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Identifier_0= ruleIdentifier (kw= '-' this_Identifier_2= ruleIdentifier )* ) ;
    public final AntlrDatatypeRuleToken ruleSchemeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_0 = null;

        AntlrDatatypeRuleToken this_Identifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4051:28: ( (this_Identifier_0= ruleIdentifier (kw= '-' this_Identifier_2= ruleIdentifier )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4052:1: (this_Identifier_0= ruleIdentifier (kw= '-' this_Identifier_2= ruleIdentifier )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4052:1: (this_Identifier_0= ruleIdentifier (kw= '-' this_Identifier_2= ruleIdentifier )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4053:5: this_Identifier_0= ruleIdentifier (kw= '-' this_Identifier_2= ruleIdentifier )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSchemeIdentifierAccess().getIdentifierParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleSchemeIdentifier9579);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4063:1: (kw= '-' this_Identifier_2= ruleIdentifier )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4064:2: kw= '-' this_Identifier_2= ruleIdentifier
            	    {
            	    kw=(Token)match(input,101,FOLLOW_101_in_ruleSchemeIdentifier9598); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSchemeIdentifierAccess().getHyphenMinusKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSchemeIdentifierAccess().getIdentifierParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleIdentifier_in_ruleSchemeIdentifier9620);
            	    this_Identifier_2=ruleIdentifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Identifier_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeIdentifier"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4088:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4089:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4090:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier9668);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier9679); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4097:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_SpecialCommandName_1= ruleSpecialCommandName ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_SpecialCommandName_1 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4100:28: ( (this_ID_0= RULE_ID | this_SpecialCommandName_1= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4101:1: (this_ID_0= RULE_ID | this_SpecialCommandName_1= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4101:1: (this_ID_0= RULE_ID | this_SpecialCommandName_1= ruleSpecialCommandName )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=32 && LA50_0<=92)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4101:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier9719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4110:5: this_SpecialCommandName_1= ruleSpecialCommandName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentifierAccess().getSpecialCommandNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleIdentifier9752);
                    this_SpecialCommandName_1=ruleSpecialCommandName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SpecialCommandName_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleSchemeNumber"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4128:1: entryRuleSchemeNumber returns [EObject current=null] : iv_ruleSchemeNumber= ruleSchemeNumber EOF ;
    public final EObject entryRuleSchemeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4129:2: (iv_ruleSchemeNumber= ruleSchemeNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4130:2: iv_ruleSchemeNumber= ruleSchemeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber9797);
            iv_ruleSchemeNumber=ruleSchemeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber9807); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeNumber"


    // $ANTLR start "ruleSchemeNumber"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4137:1: ruleSchemeNumber returns [EObject current=null] : ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) ) ) ;
    public final EObject ruleSchemeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_radix_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4140:28: ( ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4141:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4141:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4141:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4141:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==93) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4142:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4142:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4143:3: lv_radix_0_0= ruleSchemeNumberRadix
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber9853);
                    lv_radix_0_0=ruleSchemeNumberRadix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSchemeNumberRule());
                      	        }
                             		set(
                             			current, 
                             			"radix",
                              		lv_radix_0_0, 
                              		"SchemeNumberRadix");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4159:3: ( (lv_value_1_0= ruleSignedInteger ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4160:1: (lv_value_1_0= ruleSignedInteger )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4160:1: (lv_value_1_0= ruleSignedInteger )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4161:3: lv_value_1_0= ruleSignedInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeNumberAccess().getValueSignedIntegerParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_ruleSchemeNumber9875);
            lv_value_1_0=ruleSignedInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSchemeNumberRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"SignedInteger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeNumber"


    // $ANTLR start "entryRuleSchemeNumberRadix"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4185:1: entryRuleSchemeNumberRadix returns [String current=null] : iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF ;
    public final String entryRuleSchemeNumberRadix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeNumberRadix = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4186:2: (iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4187:2: iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeNumberRadixRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix9912);
            iv_ruleSchemeNumberRadix=ruleSchemeNumberRadix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeNumberRadix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix9923); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeNumberRadix"


    // $ANTLR start "ruleSchemeNumberRadix"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4194:1: ruleSchemeNumberRadix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeNumberRadix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4197:28: ( (kw= '#' this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4198:1: (kw= '#' this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4198:1: (kw= '#' this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4199:2: kw= '#' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleSchemeNumberRadix9961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeNumberRadix9976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getSchemeNumberRadixAccess().getIDTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeNumberRadix"


    // $ANTLR start "entryRuleSignedInteger"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4219:1: entryRuleSignedInteger returns [String current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final String entryRuleSignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInteger = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4220:2: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4221:2: iv_ruleSignedInteger= ruleSignedInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger10022);
            iv_ruleSignedInteger=ruleSignedInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInteger10033); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInteger"


    // $ANTLR start "ruleSignedInteger"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4228:1: ruleSignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4231:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4232:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4232:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4232:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4232:2: (kw= '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==101) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4233:2: kw= '-'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleSignedInteger10072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInteger10089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInteger"


    // $ANTLR start "entryRuleSchemeMarkupCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4253:1: entryRuleSchemeMarkupCommand returns [EObject current=null] : iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF ;
    public final EObject entryRuleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeMarkupCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4254:2: (iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4255:2: iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeMarkupCommandRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand10134);
            iv_ruleSchemeMarkupCommand=ruleSchemeMarkupCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeMarkupCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand10144); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemeMarkupCommand"


    // $ANTLR start "ruleSchemeMarkupCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4262:1: ruleSchemeMarkupCommand returns [EObject current=null] : (otherlv_0= '#:' ( (lv_command_1_0= ruleSchemeIdentifier ) ) ) ;
    public final EObject ruleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_command_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4265:28: ( (otherlv_0= '#:' ( (lv_command_1_0= ruleSchemeIdentifier ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4266:1: (otherlv_0= '#:' ( (lv_command_1_0= ruleSchemeIdentifier ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4266:1: (otherlv_0= '#:' ( (lv_command_1_0= ruleSchemeIdentifier ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4266:3: otherlv_0= '#:' ( (lv_command_1_0= ruleSchemeIdentifier ) )
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleSchemeMarkupCommand10181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4270:1: ( (lv_command_1_0= ruleSchemeIdentifier ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4271:1: (lv_command_1_0= ruleSchemeIdentifier )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4271:1: (lv_command_1_0= ruleSchemeIdentifier )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4272:3: lv_command_1_0= ruleSchemeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeMarkupCommandAccess().getCommandSchemeIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeIdentifier_in_ruleSchemeMarkupCommand10202);
            lv_command_1_0=ruleSchemeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSchemeMarkupCommandRule());
              	        }
                     		set(
                     			current, 
                     			"command",
                      		lv_command_1_0, 
                      		"SchemeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemeMarkupCommand"

    // $ANTLR start synpred2_InternalLilyPond
    public final void synpred2_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:126:2: (this_Assignment_0= ruleAssignment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:126:2: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred2_InternalLilyPond232);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalLilyPond

    // $ANTLR start synpred6_InternalLilyPond
    public final void synpred6_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_Number_3 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:211:2: (this_Number_3= ruleNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:211:2: this_Number_3= ruleNumber
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNumber_in_synpred6_InternalLilyPond447);
        this_Number_3=ruleNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalLilyPond

    // $ANTLR start synpred21_InternalLilyPond
    public final void synpred21_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_PropertyAssignment_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:746:2: (this_PropertyAssignment_0= rulePropertyAssignment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:746:2: this_PropertyAssignment_0= rulePropertyAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred21_InternalLilyPond1738);
        this_PropertyAssignment_0=rulePropertyAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalLilyPond

    // $ANTLR start synpred25_InternalLilyPond
    public final void synpred25_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_Number_4 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:798:2: (this_Number_4= ruleNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:798:2: this_Number_4= ruleNumber
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNumber_in_synpred25_InternalLilyPond1858);
        this_Number_4=ruleNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalLilyPond

    // $ANTLR start synpred26_InternalLilyPond
    public final void synpred26_InternalLilyPond_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_command_1_1 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:850:3: (lv_command_1_1= ruleSchemeIdentifier )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:850:3: lv_command_1_1= ruleSchemeIdentifier
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandSchemeIdentifierParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleSchemeIdentifier_in_synpred26_InternalLilyPond1993);
        lv_command_1_1=ruleSchemeIdentifier();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalLilyPond

    // $ANTLR start synpred48_InternalLilyPond
    public final void synpred48_InternalLilyPond_fragment() throws RecognitionException {   
        EObject lv_command_1_1 = null;

        EObject lv_command_1_2 = null;

        EObject lv_command_1_3 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1659:1: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1659:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1659:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1660:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1660:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand )
        int alt53=3;
        switch ( input.LA(1) ) {
        case 93:
        case 94:
            {
            alt53=1;
            }
            break;
        case RULE_ID:
        case RULE_STRING:
        case RULE_INT:
        case RULE_ANY_OTHER:
        case 13:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 32:
        case 33:
        case 34:
        case 35:
        case 36:
        case 37:
        case 38:
        case 39:
        case 40:
        case 41:
        case 42:
        case 43:
        case 44:
        case 45:
        case 46:
        case 47:
        case 48:
        case 49:
        case 50:
        case 51:
        case 52:
        case 53:
        case 54:
        case 55:
        case 56:
        case 57:
        case 58:
        case 59:
        case 60:
        case 61:
        case 62:
        case 63:
        case 64:
        case 65:
        case 66:
        case 67:
        case 68:
        case 69:
        case 70:
        case 71:
        case 72:
        case 73:
        case 74:
        case 75:
        case 76:
        case 77:
        case 78:
        case 79:
        case 80:
        case 81:
        case 82:
        case 83:
        case 84:
        case 85:
        case 86:
        case 87:
        case 88:
        case 89:
        case 90:
        case 91:
        case 92:
        case 100:
        case 101:
            {
            alt53=2;
            }
            break;
        case 26:
            {
            alt53=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 53, 0, input);

            throw nvae;
        }

        switch (alt53) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1661:3: lv_command_1_1= ruleScheme
                {
                pushFollow(FOLLOW_ruleScheme_in_synpred48_InternalLilyPond3888);
                lv_command_1_1=ruleScheme();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1676:8: lv_command_1_2= ruleSchemeText
                {
                pushFollow(FOLLOW_ruleSchemeText_in_synpred48_InternalLilyPond3907);
                lv_command_1_2=ruleSchemeText();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1691:8: lv_command_1_3= ruleUnparsedCommand
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_2()); 
                  	    
                }
                pushFollow(FOLLOW_ruleUnparsedCommand_in_synpred48_InternalLilyPond3926);
                lv_command_1_3=ruleUnparsedCommand();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred48_InternalLilyPond

    // $ANTLR start synpred49_InternalLilyPond
    public final void synpred49_InternalLilyPond_fragment() throws RecognitionException {   
        EObject lv_block_2_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1710:1: ( (lv_block_2_0= ruleUnparsedBlock ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1710:1: (lv_block_2_0= ruleUnparsedBlock )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1710:1: (lv_block_2_0= ruleUnparsedBlock )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1711:3: lv_block_2_0= ruleUnparsedBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleUnparsedBlock_in_synpred49_InternalLilyPond3951);
        lv_block_2_0=ruleUnparsedBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred49_InternalLilyPond

    // $ANTLR start synpred55_InternalLilyPond
    public final void synpred55_InternalLilyPond_fragment() throws RecognitionException {   
        EObject lv_pitch_2_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1950:1: ( (lv_pitch_2_0= rulePitch ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1950:1: (lv_pitch_2_0= rulePitch )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1950:1: (lv_pitch_2_0= rulePitch )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1951:3: lv_pitch_2_0= rulePitch
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePitch_in_synpred55_InternalLilyPond4512);
        lv_pitch_2_0=rulePitch();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred55_InternalLilyPond

    // $ANTLR start synpred56_InternalLilyPond
    public final void synpred56_InternalLilyPond_fragment() throws RecognitionException {   
        Token lv_octaveCheck_1_0=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2025:1: ( (lv_octaveCheck_1_0= '=' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2025:1: (lv_octaveCheck_1_0= '=' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2025:1: (lv_octaveCheck_1_0= '=' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2026:3: lv_octaveCheck_1_0= '='
        {
        lv_octaveCheck_1_0=(Token)match(input,13,FOLLOW_13_in_synpred56_InternalLilyPond4645); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred56_InternalLilyPond

    // $ANTLR start synpred57_InternalLilyPond
    public final void synpred57_InternalLilyPond_fragment() throws RecognitionException {   
        EObject lv_octaveShift_2_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:1: ( (lv_octaveShift_2_0= ruleOctave ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:1: (lv_octaveShift_2_0= ruleOctave )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:1: (lv_octaveShift_2_0= ruleOctave )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2041:3: lv_octaveShift_2_0= ruleOctave
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOctave_in_synpred57_InternalLilyPond4680);
        lv_octaveShift_2_0=ruleOctave();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred57_InternalLilyPond

    // $ANTLR start synpred58_InternalLilyPond
    public final void synpred58_InternalLilyPond_fragment() throws RecognitionException {   
        Token lv_reminderAccidental_3_0=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2058:1: ( (lv_reminderAccidental_3_0= '!' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2058:1: (lv_reminderAccidental_3_0= '!' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2058:1: (lv_reminderAccidental_3_0= '!' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2059:3: lv_reminderAccidental_3_0= '!'
        {
        lv_reminderAccidental_3_0=(Token)match(input,18,FOLLOW_18_in_synpred58_InternalLilyPond4699); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred58_InternalLilyPond

    // $ANTLR start synpred59_InternalLilyPond
    public final void synpred59_InternalLilyPond_fragment() throws RecognitionException {   
        Token lv_cautionaryAccidental_4_0=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2073:1: ( (lv_cautionaryAccidental_4_0= '?' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2073:1: (lv_cautionaryAccidental_4_0= '?' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2073:1: (lv_cautionaryAccidental_4_0= '?' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2074:3: lv_cautionaryAccidental_4_0= '?'
        {
        lv_cautionaryAccidental_4_0=(Token)match(input,19,FOLLOW_19_in_synpred59_InternalLilyPond4731); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred59_InternalLilyPond

    // $ANTLR start synpred60_InternalLilyPond
    public final void synpred60_InternalLilyPond_fragment() throws RecognitionException {   
        Token lv_up_0_0=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2109:1: ( (lv_up_0_0= '\\'' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2109:1: (lv_up_0_0= '\\'' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2109:1: (lv_up_0_0= '\\'' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2110:3: lv_up_0_0= '\\''
        {
        lv_up_0_0=(Token)match(input,29,FOLLOW_29_in_synpred60_InternalLilyPond4834); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred60_InternalLilyPond

    // $ANTLR start synpred62_InternalLilyPond
    public final void synpred62_InternalLilyPond_fragment() throws RecognitionException {   
        Token lv_down_1_0=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2125:1: ( (lv_down_1_0= ',' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2125:1: (lv_down_1_0= ',' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2125:1: (lv_down_1_0= ',' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2126:3: lv_down_1_0= ','
        {
        lv_down_1_0=(Token)match(input,30,FOLLOW_30_in_synpred62_InternalLilyPond4872); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred62_InternalLilyPond

    // $ANTLR start synpred70_InternalLilyPond
    public final void synpred70_InternalLilyPond_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token lv_id_4_1=null;
        Token lv_id_4_2=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2509:4: (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2509:4: otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
        {
        otherlv_3=(Token)match(input,13,FOLLOW_13_in_synpred70_InternalLilyPond5684); if (state.failed) return ;
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2513:1: ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2514:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2514:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2515:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2515:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
        int alt55=2;
        int LA55_0 = input.LA(1);

        if ( (LA55_0==RULE_ID) ) {
            alt55=1;
        }
        else if ( (LA55_0==RULE_STRING) ) {
            alt55=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 55, 0, input);

            throw nvae;
        }
        switch (alt55) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2516:3: lv_id_4_1= RULE_ID
                {
                lv_id_4_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred70_InternalLilyPond5703); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2531:8: lv_id_4_2= RULE_STRING
                {
                lv_id_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred70_InternalLilyPond5723); if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred70_InternalLilyPond

    // $ANTLR start synpred71_InternalLilyPond
    public final void synpred71_InternalLilyPond_fragment() throws RecognitionException {   
        EObject lv_modification_5_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2550:1: ( (lv_modification_5_0= ruleContextModification ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2550:1: (lv_modification_5_0= ruleContextModification )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2550:1: (lv_modification_5_0= ruleContextModification )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2551:3: lv_modification_5_0= ruleContextModification
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleContextModification_in_synpred71_InternalLilyPond5754);
        lv_modification_5_0=ruleContextModification();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred71_InternalLilyPond

    // $ANTLR start synpred135_InternalLilyPond
    public final void synpred135_InternalLilyPond_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3287:2: (kw= 'with' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3287:2: kw= 'with'
        {
        kw=(Token)match(input,55,FOLLOW_55_in_synpred135_InternalLilyPond7634); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_InternalLilyPond

    // $ANTLR start synpred142_InternalLilyPond
    public final void synpred142_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_SchemeBoolean_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3492:2: (this_SchemeBoolean_0= ruleSchemeBoolean )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3492:2: this_SchemeBoolean_0= ruleSchemeBoolean
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred142_InternalLilyPond8153);
        this_SchemeBoolean_0=ruleSchemeBoolean();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_InternalLilyPond

    // $ANTLR start synpred146_InternalLilyPond
    public final void synpred146_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_SchemeNumber_4 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3544:2: (this_SchemeNumber_4= ruleSchemeNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3544:2: this_SchemeNumber_4= ruleSchemeNumber
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred146_InternalLilyPond8273);
        this_SchemeNumber_4=ruleSchemeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred146_InternalLilyPond

    // $ANTLR start synpred147_InternalLilyPond
    public final void synpred147_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_SchemeText_5 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3557:2: (this_SchemeText_5= ruleSchemeText )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3557:2: this_SchemeText_5= ruleSchemeText
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeText_in_synpred147_InternalLilyPond8303);
        this_SchemeText_5=ruleSchemeText();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred147_InternalLilyPond

    // $ANTLR start synpred154_InternalLilyPond
    public final void synpred154_InternalLilyPond_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_SchemeTextValueSegment_3 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3920:2: (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3920:2: kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment
        {
        kw=(Token)match(input,31,FOLLOW_31_in_synpred154_InternalLilyPond9163); if (state.failed) return ;
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3925:1: (kw= ':' )?
        int alt57=2;
        int LA57_0 = input.LA(1);

        if ( (LA57_0==31) ) {
            alt57=1;
        }
        switch (alt57) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3926:2: kw= ':'
                {
                kw=(Token)match(input,31,FOLLOW_31_in_synpred154_InternalLilyPond9177); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_synpred154_InternalLilyPond9201);
        this_SchemeTextValueSegment_3=ruleSchemeTextValueSegment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred154_InternalLilyPond

    // $ANTLR start synpred162_InternalLilyPond
    public final void synpred162_InternalLilyPond_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_2 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4064:2: (kw= '-' this_Identifier_2= ruleIdentifier )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4064:2: kw= '-' this_Identifier_2= ruleIdentifier
        {
        kw=(Token)match(input,101,FOLLOW_101_in_synpred162_InternalLilyPond9598); if (state.failed) return ;
        pushFollow(FOLLOW_ruleIdentifier_in_synpred162_InternalLilyPond9620);
        this_Identifier_2=ruleIdentifier();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred162_InternalLilyPond

    // Delegated rules

    public final boolean synpred147_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred147_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred162_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred162_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA2_eotS =
        "\130\uffff";
    static final String DFA2_eofS =
        "\130\uffff";
    static final String DFA2_minS =
        "\1\4\2\0\125\uffff";
    static final String DFA2_maxS =
        "\1\145\2\0\125\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\123\uffff\1\1";
    static final String DFA2_specialS =
        "\1\uffff\1\0\1\1\125\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\2\3\5\uffff\2\3\1\uffff\1\3\1\uffff\115\3\5\uffff\2"+
            "\3",
            "\1\uffff",
            "\1\uffff",
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
            return "125:1: (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\130\uffff";
    static final String DFA11_eofS =
        "\130\uffff";
    static final String DFA11_minS =
        "\1\4\76\0\4\uffff\1\0\24\uffff";
    static final String DFA11_maxS =
        "\1\145\76\0\4\uffff\1\0\24\uffff";
    static final String DFA11_acceptS =
        "\77\uffff\1\2\1\3\1\4\2\uffff\1\6\21\uffff\1\1\1\5";
    static final String DFA11_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
        "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\4\uffff\1\76"+
        "\24\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\104\1\103\1\104\5\uffff\1\104\1\100\3\uffff\10\104\1"+
            "\77\5\104\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\12\1"+
            "\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1"+
            "\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1"+
            "\75\1\76\2\101\5\uffff\2\104",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            return "745:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_18 = input.LA(1);

                         
                        int index11_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA11_22 = input.LA(1);

                         
                        int index11_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA11_23 = input.LA(1);

                         
                        int index11_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA11_24 = input.LA(1);

                         
                        int index11_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA11_25 = input.LA(1);

                         
                        int index11_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA11_26 = input.LA(1);

                         
                        int index11_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA11_27 = input.LA(1);

                         
                        int index11_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA11_28 = input.LA(1);

                         
                        int index11_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA11_29 = input.LA(1);

                         
                        int index11_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA11_30 = input.LA(1);

                         
                        int index11_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA11_31 = input.LA(1);

                         
                        int index11_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA11_32 = input.LA(1);

                         
                        int index11_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA11_33 = input.LA(1);

                         
                        int index11_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA11_34 = input.LA(1);

                         
                        int index11_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA11_35 = input.LA(1);

                         
                        int index11_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA11_36 = input.LA(1);

                         
                        int index11_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA11_37 = input.LA(1);

                         
                        int index11_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA11_38 = input.LA(1);

                         
                        int index11_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA11_39 = input.LA(1);

                         
                        int index11_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA11_40 = input.LA(1);

                         
                        int index11_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA11_41 = input.LA(1);

                         
                        int index11_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA11_42 = input.LA(1);

                         
                        int index11_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA11_43 = input.LA(1);

                         
                        int index11_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA11_44 = input.LA(1);

                         
                        int index11_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA11_45 = input.LA(1);

                         
                        int index11_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_45);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA11_46 = input.LA(1);

                         
                        int index11_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_46);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA11_47 = input.LA(1);

                         
                        int index11_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_47);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA11_48 = input.LA(1);

                         
                        int index11_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_48);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA11_49 = input.LA(1);

                         
                        int index11_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_49);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA11_50 = input.LA(1);

                         
                        int index11_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_50);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA11_51 = input.LA(1);

                         
                        int index11_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_51);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA11_52 = input.LA(1);

                         
                        int index11_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_52);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA11_53 = input.LA(1);

                         
                        int index11_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_53);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA11_54 = input.LA(1);

                         
                        int index11_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_54);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA11_55 = input.LA(1);

                         
                        int index11_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_55);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA11_56 = input.LA(1);

                         
                        int index11_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_56);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA11_57 = input.LA(1);

                         
                        int index11_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_57);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA11_58 = input.LA(1);

                         
                        int index11_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_58);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA11_59 = input.LA(1);

                         
                        int index11_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_59);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA11_60 = input.LA(1);

                         
                        int index11_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_60);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA11_61 = input.LA(1);

                         
                        int index11_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_61);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA11_62 = input.LA(1);

                         
                        int index11_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_62);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA11_67 = input.LA(1);

                         
                        int index11_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 68;}

                         
                        input.seek(index11_67);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\100\uffff";
    static final String DFA12_eofS =
        "\100\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\75\0\1\uffff";
    static final String DFA12_maxS =
        "\1\134\1\uffff\75\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\75\uffff\1\2";
    static final String DFA12_specialS =
        "\2\uffff\1\55\1\50\1\35\1\20\1\7\1\72\1\47\1\44\1\21\1\16\1\60\1"+
        "\65\1\51\1\23\1\6\1\12\1\67\1\42\1\22\1\36\1\13\1\66\1\52\1\4\1"+
        "\64\1\17\1\2\1\26\1\53\1\63\1\56\1\3\1\34\1\43\1\45\1\73\1\1\1\27"+
        "\1\31\1\46\1\57\1\0\1\15\1\32\1\71\1\54\1\37\1\25\1\11\1\70\1\62"+
        "\1\40\1\33\1\10\1\5\1\74\1\41\1\24\1\30\1\14\1\61\1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\33\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14\1"+
            "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1"+
            "\12\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1"+
            "\74\1\75\1\76",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "849:1: (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_43 = input.LA(1);

                         
                        int index12_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_43);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_38 = input.LA(1);

                         
                        int index12_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_38);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_28 = input.LA(1);

                         
                        int index12_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_28);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_33 = input.LA(1);

                         
                        int index12_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_33);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_25 = input.LA(1);

                         
                        int index12_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_25);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_56 = input.LA(1);

                         
                        int index12_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_56);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_55 = input.LA(1);

                         
                        int index12_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_55);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_50 = input.LA(1);

                         
                        int index12_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_50);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_17 = input.LA(1);

                         
                        int index12_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_17);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_22 = input.LA(1);

                         
                        int index12_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_22);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_61 = input.LA(1);

                         
                        int index12_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_61);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_44 = input.LA(1);

                         
                        int index12_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_44);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_27 = input.LA(1);

                         
                        int index12_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_27);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_20 = input.LA(1);

                         
                        int index12_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_15 = input.LA(1);

                         
                        int index12_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_15);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_59 = input.LA(1);

                         
                        int index12_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_59);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_49 = input.LA(1);

                         
                        int index12_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_49);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_29 = input.LA(1);

                         
                        int index12_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_29);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_39 = input.LA(1);

                         
                        int index12_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_39);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_60 = input.LA(1);

                         
                        int index12_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_60);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_40 = input.LA(1);

                         
                        int index12_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_40);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_45 = input.LA(1);

                         
                        int index12_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_45);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_54 = input.LA(1);

                         
                        int index12_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_54);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_34 = input.LA(1);

                         
                        int index12_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_34);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_21 = input.LA(1);

                         
                        int index12_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_21);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_48 = input.LA(1);

                         
                        int index12_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_48);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_53 = input.LA(1);

                         
                        int index12_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_53);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_58 = input.LA(1);

                         
                        int index12_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_58);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_19 = input.LA(1);

                         
                        int index12_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_19);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_35 = input.LA(1);

                         
                        int index12_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_35);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_36 = input.LA(1);

                         
                        int index12_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_36);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_41 = input.LA(1);

                         
                        int index12_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_41);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_14 = input.LA(1);

                         
                        int index12_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_14);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_24 = input.LA(1);

                         
                        int index12_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_24);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_30 = input.LA(1);

                         
                        int index12_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_30);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_47 = input.LA(1);

                         
                        int index12_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_47);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_32 = input.LA(1);

                         
                        int index12_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_32);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_42 = input.LA(1);

                         
                        int index12_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_42);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_62 = input.LA(1);

                         
                        int index12_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_62);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_52 = input.LA(1);

                         
                        int index12_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_52);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_31 = input.LA(1);

                         
                        int index12_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_31);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_26 = input.LA(1);

                         
                        int index12_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_26);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_23 = input.LA(1);

                         
                        int index12_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_23);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_18 = input.LA(1);

                         
                        int index12_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_18);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_51 = input.LA(1);

                         
                        int index12_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_51);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_46 = input.LA(1);

                         
                        int index12_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_46);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_37 = input.LA(1);

                         
                        int index12_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_37);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_57 = input.LA(1);

                         
                        int index12_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 1;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index12_57);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\22\uffff";
    static final String DFA14_eofS =
        "\22\uffff";
    static final String DFA14_minS =
        "\1\32\1\22\7\uffff\1\4\10\uffff";
    static final String DFA14_maxS =
        "\1\32\1\134\7\uffff\1\16\10\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\6\1\14\1\11\1\17\1\12\1\2\1\15\1\uffff\1\13\1\10\1\4"+
        "\1\3\1\7\1\1\1\5\1\16";
    static final String DFA14_specialS =
        "\22\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\10\5\1\uffff\2\5\3\uffff\1\17\1\7\1\15\1\14\1\20\1\2\4\16"+
            "\3\13\1\4\1\6\5\12\1\3\1\10\1\11\46\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\11\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1086:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther )";
        }
    }
    static final String DFA16_eotS =
        "\134\uffff";
    static final String DFA16_eofS =
        "\1\1\133\uffff";
    static final String DFA16_minS =
        "\1\4\2\uffff\3\0\1\uffff\114\0\11\uffff";
    static final String DFA16_maxS =
        "\1\145\2\uffff\3\0\1\uffff\114\0\11\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\2\131\uffff\1\1";
    static final String DFA16_specialS =
        "\3\uffff\1\0\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
        "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
        "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
        "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
        "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
        "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111"+
        "\1\112\1\113\1\114\1\115\1\116\11\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\3\1\4\1\11\1\122\5\uffff\1\13\4\1\1\15\1\16\1\17\1\20\1\21"+
            "\1\22\1\23\1\24\1\5\5\1\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1"+
            "\34\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1"+
            "\51\1\52\1\53\1\35\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1"+
            "\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1"+
            "\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1"+
            "\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\7\1\10\3\uffff"+
            "\1\1\1\uffff\1\12\1\14",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 1658:2: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleSchemeText | lv_command_1_3= ruleUnparsedCommand ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_11 = input.LA(1);

                         
                        int index16_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_12 = input.LA(1);

                         
                        int index16_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_14 = input.LA(1);

                         
                        int index16_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_15 = input.LA(1);

                         
                        int index16_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_16 = input.LA(1);

                         
                        int index16_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_17 = input.LA(1);

                         
                        int index16_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_17);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_18 = input.LA(1);

                         
                        int index16_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_18);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_19 = input.LA(1);

                         
                        int index16_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA16_20 = input.LA(1);

                         
                        int index16_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_20);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA16_21 = input.LA(1);

                         
                        int index16_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_21);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA16_22 = input.LA(1);

                         
                        int index16_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_22);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA16_23 = input.LA(1);

                         
                        int index16_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_23);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA16_24 = input.LA(1);

                         
                        int index16_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_24);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA16_25 = input.LA(1);

                         
                        int index16_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_25);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA16_26 = input.LA(1);

                         
                        int index16_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_26);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA16_27 = input.LA(1);

                         
                        int index16_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_27);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA16_28 = input.LA(1);

                         
                        int index16_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_28);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA16_29 = input.LA(1);

                         
                        int index16_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_29);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA16_30 = input.LA(1);

                         
                        int index16_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_30);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA16_31 = input.LA(1);

                         
                        int index16_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_31);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA16_32 = input.LA(1);

                         
                        int index16_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_32);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA16_33 = input.LA(1);

                         
                        int index16_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_33);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA16_34 = input.LA(1);

                         
                        int index16_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_34);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA16_35 = input.LA(1);

                         
                        int index16_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_35);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA16_36 = input.LA(1);

                         
                        int index16_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_36);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA16_37 = input.LA(1);

                         
                        int index16_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_37);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA16_38 = input.LA(1);

                         
                        int index16_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_38);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA16_39 = input.LA(1);

                         
                        int index16_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_39);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA16_40 = input.LA(1);

                         
                        int index16_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_40);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA16_41 = input.LA(1);

                         
                        int index16_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_41);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA16_42 = input.LA(1);

                         
                        int index16_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_42);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA16_43 = input.LA(1);

                         
                        int index16_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_43);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA16_44 = input.LA(1);

                         
                        int index16_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_44);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA16_45 = input.LA(1);

                         
                        int index16_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_45);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA16_46 = input.LA(1);

                         
                        int index16_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_46);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA16_47 = input.LA(1);

                         
                        int index16_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_47);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA16_48 = input.LA(1);

                         
                        int index16_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_48);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA16_49 = input.LA(1);

                         
                        int index16_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_49);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA16_50 = input.LA(1);

                         
                        int index16_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_50);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA16_51 = input.LA(1);

                         
                        int index16_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_51);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA16_52 = input.LA(1);

                         
                        int index16_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_52);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA16_53 = input.LA(1);

                         
                        int index16_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_53);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA16_54 = input.LA(1);

                         
                        int index16_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_54);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA16_55 = input.LA(1);

                         
                        int index16_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_55);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA16_56 = input.LA(1);

                         
                        int index16_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_56);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA16_57 = input.LA(1);

                         
                        int index16_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_57);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA16_58 = input.LA(1);

                         
                        int index16_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_58);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA16_59 = input.LA(1);

                         
                        int index16_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_59);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA16_60 = input.LA(1);

                         
                        int index16_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_60);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA16_61 = input.LA(1);

                         
                        int index16_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_61);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA16_62 = input.LA(1);

                         
                        int index16_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_62);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA16_63 = input.LA(1);

                         
                        int index16_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_63);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA16_64 = input.LA(1);

                         
                        int index16_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_64);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA16_65 = input.LA(1);

                         
                        int index16_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_65);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA16_66 = input.LA(1);

                         
                        int index16_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_66);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA16_67 = input.LA(1);

                         
                        int index16_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_67);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA16_68 = input.LA(1);

                         
                        int index16_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_68);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA16_69 = input.LA(1);

                         
                        int index16_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_69);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA16_70 = input.LA(1);

                         
                        int index16_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_70);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA16_71 = input.LA(1);

                         
                        int index16_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_71);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA16_72 = input.LA(1);

                         
                        int index16_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_72);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA16_73 = input.LA(1);

                         
                        int index16_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_73);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA16_74 = input.LA(1);

                         
                        int index16_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_74);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA16_75 = input.LA(1);

                         
                        int index16_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_75);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA16_76 = input.LA(1);

                         
                        int index16_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_76);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA16_77 = input.LA(1);

                         
                        int index16_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_77);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA16_78 = input.LA(1);

                         
                        int index16_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_78);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA16_79 = input.LA(1);

                         
                        int index16_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_79);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA16_80 = input.LA(1);

                         
                        int index16_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_80);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA16_81 = input.LA(1);

                         
                        int index16_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_81);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA16_82 = input.LA(1);

                         
                        int index16_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_82);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\134\uffff";
    static final String DFA17_eofS =
        "\1\2\133\uffff";
    static final String DFA17_minS =
        "\1\4\1\0\132\uffff";
    static final String DFA17_maxS =
        "\1\145\1\0\132\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\130\uffff\1\1";
    static final String DFA17_specialS =
        "\1\uffff\1\0\132\uffff}>";
    static final String[] DFA17_transitionS = {
            "\4\2\5\uffff\1\2\1\1\120\2\3\uffff\1\2\1\uffff\2\2",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1709:3: ( (lv_block_2_0= ruleUnparsedBlock ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\130\uffff";
    static final String DFA20_eofS =
        "\130\uffff";
    static final String DFA20_minS =
        "\1\4\1\0\126\uffff";
    static final String DFA20_maxS =
        "\1\145\1\0\126\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\124\uffff\1\1";
    static final String DFA20_specialS =
        "\1\uffff\1\0\126\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\3\2\5\uffff\2\2\1\uffff\1\2\1\uffff\115\2\5\uffff\2\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1949:2: ( (lv_pitch_2_0= rulePitch ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\131\uffff";
    static final String DFA21_eofS =
        "\1\2\130\uffff";
    static final String DFA21_minS =
        "\1\4\1\0\127\uffff";
    static final String DFA21_maxS =
        "\1\145\1\0\127\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\125\uffff\1\1";
    static final String DFA21_specialS =
        "\1\uffff\1\0\127\uffff}>";
    static final String[] DFA21_transitionS = {
            "\4\2\5\uffff\1\1\1\2\1\uffff\1\2\1\uffff\115\2\5\uffff\2\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "2024:2: ( (lv_octaveCheck_1_0= '=' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\131\uffff";
    static final String DFA22_eofS =
        "\1\3\130\uffff";
    static final String DFA22_minS =
        "\1\4\2\0\126\uffff";
    static final String DFA22_maxS =
        "\1\145\2\0\126\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\2\124\uffff\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\1\1\126\uffff}>";
    static final String[] DFA22_transitionS = {
            "\4\3\5\uffff\2\3\1\uffff\1\3\1\uffff\13\3\1\1\1\2\100\3\5\uffff"+
            "\2\3",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "2039:3: ( (lv_octaveShift_2_0= ruleOctave ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\131\uffff";
    static final String DFA23_eofS =
        "\1\2\130\uffff";
    static final String DFA23_minS =
        "\1\4\1\0\127\uffff";
    static final String DFA23_maxS =
        "\1\145\1\0\127\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\125\uffff\1\1";
    static final String DFA23_specialS =
        "\1\uffff\1\0\127\uffff}>";
    static final String[] DFA23_transitionS = {
            "\4\2\5\uffff\2\2\1\uffff\1\2\1\uffff\1\1\114\2\5\uffff\2\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "2057:3: ( (lv_reminderAccidental_3_0= '!' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\131\uffff";
    static final String DFA24_eofS =
        "\1\2\130\uffff";
    static final String DFA24_minS =
        "\1\4\1\0\127\uffff";
    static final String DFA24_maxS =
        "\1\145\1\0\127\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\125\uffff\1\1";
    static final String DFA24_specialS =
        "\1\uffff\1\0\127\uffff}>";
    static final String[] DFA24_transitionS = {
            "\4\2\5\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1\113\2\5\uffff\2"+
            "\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "2072:3: ( (lv_cautionaryAccidental_4_0= '?' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\131\uffff";
    static final String DFA25_eofS =
        "\1\1\130\uffff";
    static final String DFA25_minS =
        "\1\4\123\uffff\1\0\4\uffff";
    static final String DFA25_maxS =
        "\1\145\123\uffff\1\0\4\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\126\uffff\1\1";
    static final String DFA25_specialS =
        "\124\uffff\1\0\4\uffff}>";
    static final String[] DFA25_transitionS = {
            "\4\1\5\uffff\2\1\1\uffff\1\1\1\uffff\13\1\1\124\101\1\5\uffff"+
            "\2\1",
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
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2108:2: ( (lv_up_0_0= '\\'' ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_84 = input.LA(1);

                         
                        int index25_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_84);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\131\uffff";
    static final String DFA26_eofS =
        "\1\1\130\uffff";
    static final String DFA26_minS =
        "\1\4\124\uffff\1\0\3\uffff";
    static final String DFA26_maxS =
        "\1\145\124\uffff\1\0\3\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\126\uffff\1\1";
    static final String DFA26_specialS =
        "\125\uffff\1\0\3\uffff}>";
    static final String[] DFA26_transitionS = {
            "\4\1\5\uffff\2\1\1\uffff\1\1\1\uffff\14\1\1\125\100\1\5\uffff"+
            "\2\1",
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
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2124:6: ( (lv_down_1_0= ',' ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_85 = input.LA(1);

                         
                        int index26_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_85);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\130\uffff";
    static final String DFA32_eofS =
        "\130\uffff";
    static final String DFA32_minS =
        "\1\4\1\0\126\uffff";
    static final String DFA32_maxS =
        "\1\145\1\0\126\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\124\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\126\uffff}>";
    static final String[] DFA32_transitionS = {
            "\4\2\5\uffff\1\1\1\2\1\uffff\1\2\1\uffff\115\2\5\uffff\2\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2509:2: (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\130\uffff";
    static final String DFA33_eofS =
        "\130\uffff";
    static final String DFA33_minS =
        "\1\4\1\0\126\uffff";
    static final String DFA33_maxS =
        "\1\145\1\0\126\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\124\uffff\1\1";
    static final String DFA33_specialS =
        "\1\uffff\1\0\126\uffff}>";
    static final String[] DFA33_transitionS = {
            "\4\2\5\uffff\2\2\1\uffff\1\2\1\uffff\10\2\1\1\104\2\5\uffff"+
            "\2\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2549:4: ( (lv_modification_5_0= ruleContextModification ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\33\uffff";
    static final String DFA36_eofS =
        "\33\uffff";
    static final String DFA36_minS =
        "\1\40\27\uffff\1\0\2\uffff";
    static final String DFA36_maxS =
        "\1\134\27\uffff\1\0\2\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\uffff\1"+
        "\31\1\30";
    static final String DFA36_specialS =
        "\30\uffff\1\0\2\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\11\1\30\45\31",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "3125:1: (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_24 = input.LA(1);

                         
                        int index36_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalLilyPond()) ) {s = 26;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index36_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\14\uffff";
    static final String DFA41_eofS =
        "\14\uffff";
    static final String DFA41_minS =
        "\2\4\3\uffff\2\0\2\uffff\1\0\2\uffff";
    static final String DFA41_maxS =
        "\1\146\1\33\3\uffff\2\0\2\uffff\1\0\2\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\2\1\3\1\4\2\uffff\1\6\1\7\1\uffff\1\5\1\1";
    static final String DFA41_specialS =
        "\5\uffff\1\0\1\1\2\uffff\1\2\2\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\7\1\6\1\7\5\uffff\1\7\4\uffff\10\7\1\uffff\1\2\4\uffff\75"+
            "\7\1\1\3\uffff\1\3\1\uffff\1\4\1\7\1\5\1\10",
            "\1\11\26\uffff\1\2",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "3491:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalLilyPond()) ) {s = 10;}

                        else if ( (synpred147_InternalLilyPond()) ) {s = 7;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalLilyPond()) ) {s = 10;}

                        else if ( (synpred147_InternalLilyPond()) ) {s = 7;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_9 = input.LA(1);

                         
                        int index41_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred142_InternalLilyPond()) ) {s = 11;}

                        else if ( (synpred146_InternalLilyPond()) ) {s = 10;}

                         
                        input.seek(index41_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\121\uffff";
    static final String DFA47_eofS =
        "\1\1\1\uffff\1\1\114\uffff\1\1\1\uffff";
    static final String DFA47_minS =
        "\1\4\1\uffff\1\4\114\0\1\4\1\uffff";
    static final String DFA47_maxS =
        "\1\146\1\uffff\1\145\114\0\1\145\1\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\116\uffff\1\1";
    static final String DFA47_specialS =
        "\3\uffff\1\14\1\10\1\50\1\4\1\42\1\15\1\6\1\47\1\31\1\66\1\34\1"+
        "\105\1\113\1\53\1\111\1\26\1\52\1\67\1\32\1\41\1\3\1\61\1\25\1\107"+
        "\1\54\1\30\1\75\1\72\1\2\1\60\1\101\1\23\1\37\1\0\1\55\1\21\1\16"+
        "\1\63\1\44\1\77\1\20\1\104\1\51\1\5\1\110\1\62\1\74\1\11\1\46\1"+
        "\112\1\7\1\64\1\57\1\33\1\71\1\36\1\13\1\100\1\27\1\73\1\12\1\22"+
        "\1\103\1\1\1\56\1\43\1\35\1\70\1\45\1\24\1\106\1\40\1\17\1\102\1"+
        "\65\1\76\2\uffff}>";
    static final String[] DFA47_transitionS = {
            "\4\1\5\uffff\22\1\1\2\107\1",
            "",
            "\1\3\1\4\1\5\1\116\5\uffff\1\7\4\1\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\5\1\1\117\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
            "\1\30\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
            "\1\45\1\46\1\47\1\31\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\112\1\113\1\114\1\115\2\1\3\uffff\1\1\1"+
            "\uffff\1\6\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\3\1\4\1\5\1\116\5\uffff\1\7\4\1\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\6\1\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\31\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74"+
            "\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1"+
            "\107\1\110\1\111\1\112\1\113\1\114\1\115\2\1\3\uffff\1\1\1\uffff"+
            "\1\6\1\10",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "()* loopback of 3919:1: (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_36 = input.LA(1);

                         
                        int index47_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_36);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_66 = input.LA(1);

                         
                        int index47_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_66);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_31 = input.LA(1);

                         
                        int index47_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_31);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_23 = input.LA(1);

                         
                        int index47_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_46 = input.LA(1);

                         
                        int index47_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_46);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_9 = input.LA(1);

                         
                        int index47_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_53 = input.LA(1);

                         
                        int index47_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_53);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_4 = input.LA(1);

                         
                        int index47_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_4);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_50 = input.LA(1);

                         
                        int index47_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_50);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_63 = input.LA(1);

                         
                        int index47_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_63);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA47_59 = input.LA(1);

                         
                        int index47_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_59);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA47_3 = input.LA(1);

                         
                        int index47_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_3);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA47_8 = input.LA(1);

                         
                        int index47_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_8);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA47_39 = input.LA(1);

                         
                        int index47_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_39);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA47_75 = input.LA(1);

                         
                        int index47_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_75);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA47_43 = input.LA(1);

                         
                        int index47_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_43);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA47_38 = input.LA(1);

                         
                        int index47_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_38);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA47_64 = input.LA(1);

                         
                        int index47_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_64);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA47_34 = input.LA(1);

                         
                        int index47_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_34);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA47_72 = input.LA(1);

                         
                        int index47_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_72);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA47_25 = input.LA(1);

                         
                        int index47_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_25);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA47_18 = input.LA(1);

                         
                        int index47_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_18);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA47_61 = input.LA(1);

                         
                        int index47_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_61);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA47_28 = input.LA(1);

                         
                        int index47_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_28);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA47_11 = input.LA(1);

                         
                        int index47_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_11);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA47_21 = input.LA(1);

                         
                        int index47_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_21);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA47_56 = input.LA(1);

                         
                        int index47_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_56);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA47_13 = input.LA(1);

                         
                        int index47_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_13);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA47_69 = input.LA(1);

                         
                        int index47_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_69);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA47_58 = input.LA(1);

                         
                        int index47_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_58);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA47_35 = input.LA(1);

                         
                        int index47_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_35);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA47_74 = input.LA(1);

                         
                        int index47_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_74);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA47_22 = input.LA(1);

                         
                        int index47_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_22);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA47_7 = input.LA(1);

                         
                        int index47_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_7);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA47_68 = input.LA(1);

                         
                        int index47_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_68);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA47_41 = input.LA(1);

                         
                        int index47_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_41);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA47_71 = input.LA(1);

                         
                        int index47_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_71);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA47_51 = input.LA(1);

                         
                        int index47_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_51);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA47_10 = input.LA(1);

                         
                        int index47_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_10);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA47_5 = input.LA(1);

                         
                        int index47_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_5);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA47_45 = input.LA(1);

                         
                        int index47_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_45);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA47_19 = input.LA(1);

                         
                        int index47_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_19);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA47_16 = input.LA(1);

                         
                        int index47_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_16);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA47_27 = input.LA(1);

                         
                        int index47_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_27);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA47_37 = input.LA(1);

                         
                        int index47_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_37);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA47_67 = input.LA(1);

                         
                        int index47_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_67);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA47_55 = input.LA(1);

                         
                        int index47_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_55);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA47_32 = input.LA(1);

                         
                        int index47_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_32);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA47_24 = input.LA(1);

                         
                        int index47_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_24);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA47_48 = input.LA(1);

                         
                        int index47_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_48);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA47_40 = input.LA(1);

                         
                        int index47_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_40);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA47_54 = input.LA(1);

                         
                        int index47_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_54);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA47_77 = input.LA(1);

                         
                        int index47_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_77);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA47_12 = input.LA(1);

                         
                        int index47_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_12);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA47_20 = input.LA(1);

                         
                        int index47_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_20);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA47_70 = input.LA(1);

                         
                        int index47_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_70);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA47_57 = input.LA(1);

                         
                        int index47_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_57);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA47_30 = input.LA(1);

                         
                        int index47_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_30);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA47_62 = input.LA(1);

                         
                        int index47_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_62);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA47_49 = input.LA(1);

                         
                        int index47_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_49);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA47_29 = input.LA(1);

                         
                        int index47_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_29);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA47_78 = input.LA(1);

                         
                        int index47_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_78);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA47_42 = input.LA(1);

                         
                        int index47_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_42);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA47_60 = input.LA(1);

                         
                        int index47_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_60);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA47_33 = input.LA(1);

                         
                        int index47_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_33);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA47_76 = input.LA(1);

                         
                        int index47_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_76);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA47_65 = input.LA(1);

                         
                        int index47_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_65);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA47_44 = input.LA(1);

                         
                        int index47_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_44);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA47_14 = input.LA(1);

                         
                        int index47_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_14);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA47_73 = input.LA(1);

                         
                        int index47_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_73);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA47_26 = input.LA(1);

                         
                        int index47_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_26);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA47_47 = input.LA(1);

                         
                        int index47_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_47);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA47_17 = input.LA(1);

                         
                        int index47_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_17);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA47_52 = input.LA(1);

                         
                        int index47_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_52);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA47_15 = input.LA(1);

                         
                        int index47_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA49_eotS =
        "\102\uffff";
    static final String DFA49_eofS =
        "\1\1\1\uffff\1\1\77\uffff";
    static final String DFA49_minS =
        "\1\4\1\uffff\1\4\76\0\1\uffff";
    static final String DFA49_maxS =
        "\1\146\1\uffff\1\146\76\0\1\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\2\77\uffff\1\1";
    static final String DFA49_specialS =
        "\3\uffff\1\35\1\52\1\21\1\23\1\15\1\1\1\20\1\42\1\22\1\51\1\44\1"+
        "\54\1\40\1\14\1\50\1\34\1\30\1\17\1\61\1\46\1\73\1\10\1\13\1\31"+
        "\1\66\1\71\1\60\1\6\1\25\1\37\1\74\1\62\1\56\1\24\1\33\1\3\1\70"+
        "\1\63\1\53\1\75\1\7\1\26\1\27\1\55\1\4\1\5\1\65\1\64\1\43\1\2\1"+
        "\12\1\36\1\57\1\45\1\16\1\0\1\72\1\47\1\67\1\11\1\41\1\32\1\uffff}>";
    static final String[] DFA49_transitionS = {
            "\4\1\5\uffff\130\1\1\2\1\1",
            "",
            "\1\3\3\1\5\uffff\23\1\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1"+
            "\31\1\32\1\14\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1"+
            "\74\1\75\1\76\1\77\1\100\12\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "()* loopback of 4063:1: (kw= '-' this_Identifier_2= ruleIdentifier )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_58 = input.LA(1);

                         
                        int index49_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_58);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_8 = input.LA(1);

                         
                        int index49_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_52 = input.LA(1);

                         
                        int index49_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_52);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_38 = input.LA(1);

                         
                        int index49_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_38);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_47 = input.LA(1);

                         
                        int index49_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_47);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_48 = input.LA(1);

                         
                        int index49_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_48);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_30 = input.LA(1);

                         
                        int index49_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_30);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_43 = input.LA(1);

                         
                        int index49_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_43);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_24 = input.LA(1);

                         
                        int index49_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_24);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_62 = input.LA(1);

                         
                        int index49_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_62);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA49_53 = input.LA(1);

                         
                        int index49_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_53);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA49_25 = input.LA(1);

                         
                        int index49_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_25);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA49_16 = input.LA(1);

                         
                        int index49_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA49_7 = input.LA(1);

                         
                        int index49_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_7);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA49_57 = input.LA(1);

                         
                        int index49_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_57);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA49_20 = input.LA(1);

                         
                        int index49_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_20);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA49_9 = input.LA(1);

                         
                        int index49_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_9);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA49_5 = input.LA(1);

                         
                        int index49_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_5);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA49_11 = input.LA(1);

                         
                        int index49_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_11);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA49_6 = input.LA(1);

                         
                        int index49_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_6);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA49_36 = input.LA(1);

                         
                        int index49_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_36);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA49_31 = input.LA(1);

                         
                        int index49_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_31);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA49_44 = input.LA(1);

                         
                        int index49_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_44);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA49_45 = input.LA(1);

                         
                        int index49_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_45);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA49_19 = input.LA(1);

                         
                        int index49_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_19);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA49_26 = input.LA(1);

                         
                        int index49_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA49_64 = input.LA(1);

                         
                        int index49_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_64);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA49_37 = input.LA(1);

                         
                        int index49_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_37);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA49_18 = input.LA(1);

                         
                        int index49_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_18);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA49_3 = input.LA(1);

                         
                        int index49_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_3);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA49_54 = input.LA(1);

                         
                        int index49_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_54);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA49_32 = input.LA(1);

                         
                        int index49_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA49_15 = input.LA(1);

                         
                        int index49_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_15);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA49_63 = input.LA(1);

                         
                        int index49_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_63);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_10);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA49_51 = input.LA(1);

                         
                        int index49_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_51);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA49_13 = input.LA(1);

                         
                        int index49_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_13);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA49_56 = input.LA(1);

                         
                        int index49_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_56);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA49_22 = input.LA(1);

                         
                        int index49_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_22);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA49_60 = input.LA(1);

                         
                        int index49_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_60);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA49_17 = input.LA(1);

                         
                        int index49_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_17);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA49_12 = input.LA(1);

                         
                        int index49_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_12);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA49_4 = input.LA(1);

                         
                        int index49_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_4);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA49_41 = input.LA(1);

                         
                        int index49_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_41);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA49_14 = input.LA(1);

                         
                        int index49_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_14);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA49_46 = input.LA(1);

                         
                        int index49_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_46);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA49_35 = input.LA(1);

                         
                        int index49_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_35);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA49_55 = input.LA(1);

                         
                        int index49_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_55);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA49_29 = input.LA(1);

                         
                        int index49_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_29);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA49_21 = input.LA(1);

                         
                        int index49_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_21);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA49_34 = input.LA(1);

                         
                        int index49_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_34);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA49_40 = input.LA(1);

                         
                        int index49_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_40);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA49_50 = input.LA(1);

                         
                        int index49_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_50);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA49_49 = input.LA(1);

                         
                        int index49_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_49);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA49_27 = input.LA(1);

                         
                        int index49_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_27);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA49_61 = input.LA(1);

                         
                        int index49_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_61);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA49_39 = input.LA(1);

                         
                        int index49_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_39);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA49_28 = input.LA(1);

                         
                        int index49_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_28);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA49_59 = input.LA(1);

                         
                        int index49_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_59);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA49_23 = input.LA(1);

                         
                        int index49_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_23);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA49_33 = input.LA(1);

                         
                        int index49_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_33);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA49_42 = input.LA(1);

                         
                        int index49_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalLilyPond()) ) {s = 65;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_42);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLilyPond136 = new BitSet(new long[]{0xFFFFFFFFFFFD60F2L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_ruleExpression262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_entryRuleCommonExpression297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonExpression307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommonExpression357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCommonExpression387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleCommonExpression417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleCommonExpression447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleCommonExpression477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment566 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment586 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssignment606 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssignment673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_rulePropertyAssignment719 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePropertyAssignment731 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyAssignment752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlock848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_ruleBlock878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSimpleBlock972 = new BitSet(new long[]{0xFFFFFFFFFFFDE0F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleBlock993 = new BitSet(new long[]{0xFFFFFFFFFFFDE0F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_15_in_ruleSimpleBlock1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSimultaneousBlock1101 = new BitSet(new long[]{0xFFFFFFFFFFFF60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimultaneousBlock1122 = new BitSet(new long[]{0xFFFFFFFFFFFF60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_17_in_ruleSimultaneousBlock1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_ruleCommand1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleCommand1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringIndication_in_ruleCommand1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSpecialCharacter1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSpecialCharacter1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSpecialCharacter1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSpecialCharacter1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSpecialCharacter1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSpecialCharacter1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSpecialCharacter1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSpecialCharacter1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedBlock1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUnparsedBlock1608 = new BitSet(new long[]{0xFFFFFFFFFFFDE0F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock1629 = new BitSet(new long[]{0xFFFFFFFFFFFDE0F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_15_in_ruleUnparsedBlock1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedExpression1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_ruleUnparsedExpression1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleUnparsedExpression1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleUnparsedExpression1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleUnparsedExpression1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedCommand1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUnparsedCommand1970 = new BitSet(new long[]{0xFFFFFFFF00000010L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_ruleUnparsedCommand1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReference2098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleText2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleText2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleText2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleText2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleText2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleText2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSpecialCommand2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSpecialCommand2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileName_in_ruleSpecialCommand2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileLine_in_ruleSpecialCommand2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleSpecialCommand2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_ruleSpecialCommand2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockCommand_in_ruleSpecialCommand2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_ruleSpecialCommand2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_ruleSpecialCommand2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransposedMusic_in_ruleSpecialCommand2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeChange_in_ruleSpecialCommand2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusicWithLyrics_in_ruleSpecialCommand2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_ruleSpecialCommand2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDef_in_ruleSpecialCommand2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_ruleSpecialCommand2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude3004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInclude3051 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInclude3069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion3140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVersion3187 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVersion3205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileName_in_entryRuleSourceFileName3276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceFileName3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSourceFileName3323 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSourceFileName3341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSourceFileName3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileLine_in_entryRuleSourceFileLine3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceFileLine3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSourceFileLine3459 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSourceFileLine3477 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSourceFileLine3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup3548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkup3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMarkup3595 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMarkup3613 = new BitSet(new long[]{0xFFFFFFFF07FC60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkup3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines3683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupLines3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMarkupLines3730 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMarkupLines3748 = new BitSet(new long[]{0xFFFFFFFF07FC60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkupLines3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody3818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBody3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleMarkupBody3888 = new BitSet(new long[]{0xFFFFFFFF07FC60F2L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleMarkupBody3907 = new BitSet(new long[]{0xFFFFFFFF07FC60F2L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody3926 = new BitSet(new long[]{0xFFFFFFFF07FC60F2L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockCommand_in_entryRuleBlockCommand3988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockCommand3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBlockCommand4035 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_38_in_ruleBlockCommand4055 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_39_in_ruleBlockCommand4084 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_40_in_ruleBlockCommand4113 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_41_in_ruleBlockCommand4142 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlockCommand4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition4215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDefinition4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOutputDefinition4262 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleOutputDefinition4282 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_43_in_ruleOutputDefinition4311 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_44_in_ruleOutputDefinition4340 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleOutputDefinition4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic4413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeMusic4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelativeMusic4460 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleRelativeMusic4478 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_rulePitch_in_ruleRelativeMusic4512 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRelativeMusic4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_entryRulePitch4570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePitch4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePitch4622 = new BitSet(new long[]{0x00000000600C2002L});
    public static final BitSet FOLLOW_13_in_rulePitch4645 = new BitSet(new long[]{0x00000000600C0002L});
    public static final BitSet FOLLOW_ruleOctave_in_rulePitch4680 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_rulePitch4699 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePitch4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_entryRuleOctave4781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOctave4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOctave4834 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30_in_ruleOctave4872 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleTransposedMusic_in_entryRuleTransposedMusic4922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransposedMusic4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTransposedMusic4969 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTransposedMusic4987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePitch_in_ruleTransposedMusic5021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePitch_in_ruleTransposedMusic5042 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTransposedMusic5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeChange_in_entryRuleModeChange5099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModeChange5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleModeChange5146 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_47_in_ruleModeChange5166 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_48_in_ruleModeChange5195 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_49_in_ruleModeChange5224 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_50_in_ruleModeChange5253 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_51_in_ruleModeChange5282 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleModeChange5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusicWithLyrics_in_entryRuleMusicWithLyrics5355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMusicWithLyrics5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMusicWithLyrics5402 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleMusicWithLyrics5420 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMusicWithLyrics5452 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMusicWithLyrics5472 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMusicWithLyrics5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_entryRuleNewContext5537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewContext5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNewContext5584 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_ruleNewContext5604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_54_in_ruleNewContext5633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewContext5666 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleNewContext5684 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewContext5703 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNewContext5723 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleContextModification_in_ruleNewContext5754 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNewContext5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_entryRuleContextModification5812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextModification5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleContextModification5859 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleContextModification5871 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContextModification5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDef_in_entryRuleContextDef5928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDef5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleContextDef5975 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleContextDef5993 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContextDef6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringIndication_in_entryRuleStringIndication6063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringIndication6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStringIndication6110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringIndication6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_entryRuleOther6168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOther6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOther6215 = new BitSet(new long[]{0xFFFFFFFF1BFC0010L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleOther6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOther6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOther6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleOther6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_entryRuleOtherName6355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherName6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOtherName6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOtherName6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOtherName6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOtherName6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOtherName6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOtherName6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOtherName6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOtherName6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOtherName6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOtherName6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOtherName6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOtherName6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOtherName6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOtherName6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOtherName6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOtherName6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOtherName6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOtherName6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOtherName6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOtherName6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOtherName6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOtherName6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOtherName6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOtherName6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOtherName6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOtherName6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOtherName6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOtherName6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOtherName6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOtherName6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOtherName6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOtherName6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOtherName7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOtherName7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOtherName7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOtherName7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOtherName7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOtherName7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName7148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommandName7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSpecialCommandName7197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSpecialCommandName7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSpecialCommandName7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSpecialCommandName7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSpecialCommandName7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSpecialCommandName7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSpecialCommandName7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSpecialCommandName7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSpecialCommandName7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSpecialCommandName7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSpecialCommandName7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSpecialCommandName7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSpecialCommandName7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSpecialCommandName7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSpecialCommandName7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSpecialCommandName7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSpecialCommandName7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSpecialCommandName7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSpecialCommandName7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSpecialCommandName7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSpecialCommandName7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSpecialCommandName7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSpecialCommandName7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSpecialCommandName7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleSpecialCommandName7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme7713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleScheme7765 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_94_in_ruleScheme7783 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression7845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSchemeExpression7900 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_95_in_ruleSchemeExpression7929 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_30_in_ruleSchemeExpression7958 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_96_in_ruleSchemeExpression7987 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_94_in_ruleSchemeExpression8022 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue8093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue8183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_ruleSchemeValue8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean8368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean8378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBooleanValue_in_ruleSchemeBoolean8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBooleanValue_in_entryRuleSchemeBooleanValue8459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBooleanValue8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSchemeBooleanValue8508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeBooleanValue8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList8568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSchemeList8633 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSchemeList8659 = new BitSet(new long[]{0xFFFFFFFF7BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList8680 = new BitSet(new long[]{0xFFFFFFFF7BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_28_in_ruleSchemeList8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock8729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock8739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleSchemeBlock8776 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000347FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSchemeBlock8797 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000347FFFFFFFL});
    public static final BitSet FOLLOW_98_in_ruleSchemeBlock8810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter8846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleSchemeCharacter8893 = new BitSet(new long[]{0x0000000003FC0090L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeCharacter8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter8951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText8995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValue_in_ruleSchemeText9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValue_in_entryRuleSchemeTextValue9086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextValue9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue9144 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleSchemeTextValue9163 = new BitSet(new long[]{0xFFFFFFFF83FC20F0L,0x000000301FFFFFFFL});
    public static final BitSet FOLLOW_31_in_ruleSchemeTextValue9177 = new BitSet(new long[]{0xFFFFFFFF03FC20F0L,0x000000301FFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue9201 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_entryRuleSchemeTextValueSegment9249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextValueSegment9260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleSchemeTextValueSegment9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSchemeTextValueSegment9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleSchemeTextValueSegment9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextValueSegment9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_ruleSchemeTextValueSegment9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemeTextValueSegment9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeTextValueSegment9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextValueSegment9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_entryRuleSchemeIdentifier9521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeIdentifier9532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSchemeIdentifier9579 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleSchemeIdentifier9598 = new BitSet(new long[]{0xFFFFFFFF00000010L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSchemeIdentifier9620 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier9668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier9679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleIdentifier9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber9797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber9807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber9853 = new BitSet(new long[]{0x0000000000000040L,0x0000002020000000L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleSchemeNumber9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix9912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSchemeNumberRadix9961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeNumberRadix9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger10022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInteger10033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleSignedInteger10072 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInteger10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand10134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleSchemeMarkupCommand10181 = new BitSet(new long[]{0xFFFFFFFF00000010L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_ruleSchemeMarkupCommand10202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred2_InternalLilyPond232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_synpred6_InternalLilyPond447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred21_InternalLilyPond1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_synpred25_InternalLilyPond1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_synpred26_InternalLilyPond1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_synpred48_InternalLilyPond3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_synpred48_InternalLilyPond3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_synpred48_InternalLilyPond3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_synpred49_InternalLilyPond3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_synpred55_InternalLilyPond4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred56_InternalLilyPond4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_synpred57_InternalLilyPond4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred58_InternalLilyPond4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred59_InternalLilyPond4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred60_InternalLilyPond4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred62_InternalLilyPond4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred70_InternalLilyPond5684 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred70_InternalLilyPond5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred70_InternalLilyPond5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_synpred71_InternalLilyPond5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred135_InternalLilyPond7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred142_InternalLilyPond8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred146_InternalLilyPond8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_synpred147_InternalLilyPond8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred154_InternalLilyPond9163 = new BitSet(new long[]{0xFFFFFFFF83FC20F0L,0x000000301FFFFFFFL});
    public static final BitSet FOLLOW_31_in_synpred154_InternalLilyPond9177 = new BitSet(new long[]{0xFFFFFFFF03FC20F0L,0x000000301FFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_synpred154_InternalLilyPond9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_synpred162_InternalLilyPond9598 = new BitSet(new long[]{0xFFFFFFFF00000010L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_ruleIdentifier_in_synpred162_InternalLilyPond9620 = new BitSet(new long[]{0x0000000000000002L});

}