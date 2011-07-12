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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:82:1: ruleLilyPond returns [EObject current=null] : ( (lv_expressions_0_0= ruleToplevelExpression ) )* ;
    public final EObject ruleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:85:28: ( ( (lv_expressions_0_0= ruleToplevelExpression ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:86:1: ( (lv_expressions_0_0= ruleToplevelExpression ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:86:1: ( (lv_expressions_0_0= ruleToplevelExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=13 && LA1_0<=14)||LA1_0==16||(LA1_0>=18 && LA1_0<=94)||(LA1_0>=100 && LA1_0<=101)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:87:1: (lv_expressions_0_0= ruleToplevelExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:87:1: (lv_expressions_0_0= ruleToplevelExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:88:3: lv_expressions_0_0= ruleToplevelExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleToplevelExpression_in_ruleLilyPond136);
            	    lv_expressions_0_0=ruleToplevelExpression();

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
            	              		"ToplevelExpression");
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


    // $ANTLR start "entryRuleToplevelExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:112:1: entryRuleToplevelExpression returns [EObject current=null] : iv_ruleToplevelExpression= ruleToplevelExpression EOF ;
    public final EObject entryRuleToplevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToplevelExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:113:2: (iv_ruleToplevelExpression= ruleToplevelExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:114:2: iv_ruleToplevelExpression= ruleToplevelExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToplevelExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleToplevelExpression_in_entryRuleToplevelExpression172);
            iv_ruleToplevelExpression=ruleToplevelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToplevelExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToplevelExpression182); if (state.failed) return current;

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
    // $ANTLR end "entryRuleToplevelExpression"


    // $ANTLR start "ruleToplevelExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:121:1: ruleToplevelExpression returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression ) ;
    public final EObject ruleToplevelExpression() throws RecognitionException {
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
                       
                              newCompositeNode(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleToplevelExpression232);
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
                       
                              newCompositeNode(grammarAccess.getToplevelExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_ruleToplevelExpression262);
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
    // $ANTLR end "ruleToplevelExpression"


    // $ANTLR start "entryRuleExpression"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:158:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:159:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:160:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression297);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression307); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:167:1: ruleExpression returns [EObject current=null] : (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAssignment_0 = null;

        EObject this_CommonExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:170:28: ( (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:171:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:171:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:172:2: this_PropertyAssignment_0= rulePropertyAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_ruleExpression357);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:185:2: this_CommonExpression_1= ruleCommonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_ruleExpression387);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:204:1: entryRuleCommonExpression returns [EObject current=null] : iv_ruleCommonExpression= ruleCommonExpression EOF ;
    public final EObject entryRuleCommonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:205:2: (iv_ruleCommonExpression= ruleCommonExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:206:2: iv_ruleCommonExpression= ruleCommonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonExpression_in_entryRuleCommonExpression422);
            iv_ruleCommonExpression=ruleCommonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonExpression432); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:213:1: ruleCommonExpression returns [EObject current=null] : (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) ;
    public final EObject ruleCommonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Block_1 = null;

        EObject this_Scheme_2 = null;

        EObject this_Text_3 = null;

        EObject this_Number_4 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:216:28: ( (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:217:1: (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:217:1: (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 14:
            case 16:
                {
                alt4=2;
                }
                break;
            case 93:
            case 94:
                {
                alt4=3;
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
                alt4=4;
                }
                break;
            case RULE_INT:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred7_InternalLilyPond()) ) {
                    alt4=4;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:218:2: this_Command_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getCommandParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommand_in_ruleCommonExpression482);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:231:2: this_Block_1= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleCommonExpression512);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:244:2: this_Scheme_2= ruleScheme
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getSchemeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleCommonExpression542);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:257:2: this_Text_3= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleCommonExpression572);
                    this_Text_3=ruleText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Text_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:270:2: this_Number_4= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommonExpressionAccess().getNumberParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleCommonExpression602);
                    this_Number_4=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Number_4; 
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:289:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:290:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:291:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment637);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment647); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:298:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:301:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:302:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:302:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:302:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:302:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:303:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:303:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:304:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:304:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:305:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment691); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:320:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment711); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAssignment731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:342:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:343:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:343:1: (lv_value_2_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:344:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment752);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:368:1: entryRulePropertyAssignment returns [EObject current=null] : iv_rulePropertyAssignment= rulePropertyAssignment EOF ;
    public final EObject entryRulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssignment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:369:2: (iv_rulePropertyAssignment= rulePropertyAssignment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:370:2: iv_rulePropertyAssignment= rulePropertyAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAssignmentRule()); 
            }
            pushFollow(FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment788);
            iv_rulePropertyAssignment=rulePropertyAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAssignment798); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:377:1: rulePropertyAssignment returns [EObject current=null] : ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:380:28: ( ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:381:1: ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:381:1: ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:381:2: ( (lv_id_0_0= ruleSchemeIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:381:2: ( (lv_id_0_0= ruleSchemeIdentifier ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:382:1: (lv_id_0_0= ruleSchemeIdentifier )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:382:1: (lv_id_0_0= ruleSchemeIdentifier )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:383:3: lv_id_0_0= ruleSchemeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAssignmentAccess().getIdSchemeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeIdentifier_in_rulePropertyAssignment844);
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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_rulePropertyAssignment856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:403:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:404:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:404:1: (lv_value_2_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:405:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulePropertyAssignment877);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:429:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:430:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:431:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock913);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock923); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:438:1: ruleBlock returns [EObject current=null] : (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBlock_0 = null;

        EObject this_SimultaneousBlock_1 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:441:28: ( (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:442:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:442:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:443:2: this_SimpleBlock_0= ruleSimpleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlock973);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:456:2: this_SimultaneousBlock_1= ruleSimultaneousBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_ruleBlock1003);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:475:1: entryRuleSimpleBlock returns [EObject current=null] : iv_ruleSimpleBlock= ruleSimpleBlock EOF ;
    public final EObject entryRuleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:476:2: (iv_ruleSimpleBlock= ruleSimpleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:477:2: iv_ruleSimpleBlock= ruleSimpleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1038);
            iv_ruleSimpleBlock=ruleSimpleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock1048); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:484:1: ruleSimpleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleSimpleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:487:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:488:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:488:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:488:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:488:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:489:2: 
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSimpleBlock1097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:501:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_ANY_OTHER)||(LA7_0>=13 && LA7_0<=14)||LA7_0==16||(LA7_0>=18 && LA7_0<=94)||(LA7_0>=100 && LA7_0<=101)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:502:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:502:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:503:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimpleBlock1118);
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
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSimpleBlock1131); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:531:1: entryRuleSimultaneousBlock returns [EObject current=null] : iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF ;
    public final EObject entryRuleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneousBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:532:2: (iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:533:2: iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimultaneousBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1167);
            iv_ruleSimultaneousBlock=ruleSimultaneousBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimultaneousBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock1177); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:540:1: ruleSimultaneousBlock returns [EObject current=null] : ( () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>' ) ;
    public final EObject ruleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:543:28: ( ( () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:544:1: ( () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:544:1: ( () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:544:2: () otherlv_1= '<<' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '>>'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:544:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:545:2: 
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSimultaneousBlock1226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:557:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_ANY_OTHER)||(LA8_0>=13 && LA8_0<=14)||LA8_0==16||(LA8_0>=18 && LA8_0<=94)||(LA8_0>=100 && LA8_0<=101)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:558:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:558:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:559:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimultaneousBlock1247);
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
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSimultaneousBlock1260); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:587:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:588:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:589:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1296);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1306); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:596:1: ruleCommand returns [EObject current=null] : (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference | this_StringIndication_2= ruleStringIndication ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialCommand_0 = null;

        EObject this_Reference_1 = null;

        EObject this_StringIndication_2 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:599:28: ( (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference | this_StringIndication_2= ruleStringIndication ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:600:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference | this_StringIndication_2= ruleStringIndication )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:600:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference | this_StringIndication_2= ruleStringIndication )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
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
                    alt9=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt9=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:601:2: this_SpecialCommand_0= ruleSpecialCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommand_in_ruleCommand1356);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:614:2: this_Reference_1= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleCommand1386);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:627:2: this_StringIndication_2= ruleStringIndication
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getStringIndicationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringIndication_in_ruleCommand1416);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:646:1: entryRuleSpecialCharacter returns [String current=null] : iv_ruleSpecialCharacter= ruleSpecialCharacter EOF ;
    public final String entryRuleSpecialCharacter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:647:2: (iv_ruleSpecialCharacter= ruleSpecialCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:648:2: iv_ruleSpecialCharacter= ruleSpecialCharacter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1452);
            iv_ruleSpecialCharacter=ruleSpecialCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialCharacter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCharacter1463); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:655:1: ruleSpecialCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '?' | kw= '+' | kw= '<' | kw= '>' | kw= '[' | kw= ']' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:658:28: ( (kw= '!' | kw= '?' | kw= '+' | kw= '<' | kw= '>' | kw= '[' | kw= ']' | kw= '~' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:659:1: (kw= '!' | kw= '?' | kw= '+' | kw= '<' | kw= '>' | kw= '[' | kw= ']' | kw= '~' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:659:1: (kw= '!' | kw= '?' | kw= '+' | kw= '<' | kw= '>' | kw= '[' | kw= ']' | kw= '~' )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            case 23:
                {
                alt10=6;
                }
                break;
            case 24:
                {
                alt10=7;
                }
                break;
            case 25:
                {
                alt10=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:660:2: kw= '!'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleSpecialCharacter1501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:667:2: kw= '?'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSpecialCharacter1520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getQuestionMarkKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:674:2: kw= '+'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleSpecialCharacter1539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:681:2: kw= '<'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSpecialCharacter1558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:688:2: kw= '>'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSpecialCharacter1577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:695:2: kw= '['
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSpecialCharacter1596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:702:2: kw= ']'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleSpecialCharacter1615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:709:2: kw= '~'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleSpecialCharacter1634); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:722:1: entryRuleUnparsedBlock returns [EObject current=null] : iv_ruleUnparsedBlock= ruleUnparsedBlock EOF ;
    public final EObject entryRuleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:723:2: (iv_ruleUnparsedBlock= ruleUnparsedBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:724:2: iv_ruleUnparsedBlock= ruleUnparsedBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnparsedBlockRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1674);
            iv_ruleUnparsedBlock=ruleUnparsedBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnparsedBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedBlock1684); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:731:1: ruleUnparsedBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:734:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:735:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:735:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:735:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleUnparsedExpression ) )* otherlv_3= '}'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:735:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:736:2: 
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleUnparsedBlock1733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:748:1: ( (lv_expressions_2_0= ruleUnparsedExpression ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_ANY_OTHER)||(LA11_0>=13 && LA11_0<=14)||(LA11_0>=18 && LA11_0<=94)||(LA11_0>=100 && LA11_0<=101)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:749:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:749:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:750:3: lv_expressions_2_0= ruleUnparsedExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock1754);
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
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleUnparsedBlock1767); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:778:1: entryRuleUnparsedExpression returns [EObject current=null] : iv_ruleUnparsedExpression= ruleUnparsedExpression EOF ;
    public final EObject entryRuleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:779:2: (iv_ruleUnparsedExpression= ruleUnparsedExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:780:2: iv_ruleUnparsedExpression= ruleUnparsedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnparsedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1803);
            iv_ruleUnparsedExpression=ruleUnparsedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnparsedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedExpression1813); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:787:1: ruleUnparsedExpression returns [EObject current=null] : (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:790:28: ( (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:791:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:791:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText )
            int alt12=6;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:792:2: this_PropertyAssignment_0= rulePropertyAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_ruleUnparsedExpression1863);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:805:2: this_UnparsedCommand_1= ruleUnparsedCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedCommandParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression1893);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:818:2: this_UnparsedBlock_2= ruleUnparsedBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression1923);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:831:2: this_Scheme_3= ruleScheme
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getSchemeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleUnparsedExpression1953);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:844:2: this_Number_4= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getNumberParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleUnparsedExpression1983);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:857:2: this_Text_5= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleUnparsedExpression2013);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:876:1: entryRuleUnparsedCommand returns [EObject current=null] : iv_ruleUnparsedCommand= ruleUnparsedCommand EOF ;
    public final EObject entryRuleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:877:2: (iv_ruleUnparsedCommand= ruleUnparsedCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:878:2: iv_ruleUnparsedCommand= ruleUnparsedCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnparsedCommandRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand2048);
            iv_ruleUnparsedCommand=ruleUnparsedCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnparsedCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedCommand2058); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:885:1: ruleUnparsedCommand returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_command_1_1 = null;

        AntlrDatatypeRuleToken lv_command_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:888:28: ( (otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:889:1: (otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:889:1: (otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:889:3: otherlv_0= '\\\\' ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleUnparsedCommand2095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:893:1: ( ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:894:1: ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:894:1: ( (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:895:1: (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:895:1: (lv_command_1_1= ruleSchemeIdentifier | lv_command_1_2= ruleSpecialCommandName )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=32 && LA13_0<=92)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:896:3: lv_command_1_1= ruleSchemeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandSchemeIdentifierParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeIdentifier_in_ruleUnparsedCommand2118);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:911:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand2137);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:937:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:938:2: (iv_ruleReference= ruleReference EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:939:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2176);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2186); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:946:1: ruleReference returns [EObject current=null] : (otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:949:28: ( (otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:950:1: (otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:950:1: (otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:950:3: otherlv_0= '\\\\' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleReference2223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:954:1: ( (otherlv_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:955:1: (otherlv_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:955:1: (otherlv_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:956:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference2247); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:978:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:979:2: (iv_ruleText= ruleText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:980:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText2283);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2293); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:987:1: ruleText returns [EObject current=null] : ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) ) ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:990:28: ( ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:991:1: ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:991:1: ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:992:1: ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:992:1: ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:993:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:993:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= '(' | lv_value_0_3= ')' | lv_value_0_4= '\\'' | lv_value_0_5= ',' | lv_value_0_6= ':' )
            int alt14=6;
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
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
                }
                break;
            case 30:
                {
                alt14=5;
                }
                break;
            case 31:
                {
                alt14=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:994:3: lv_value_0_1= ruleSchemeTextValueSegment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextAccess().getValueSchemeTextValueSegmentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleText2340);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1009:8: lv_value_0_2= '('
                    {
                    lv_value_0_2=(Token)match(input,27,FOLLOW_27_in_ruleText2356); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1021:8: lv_value_0_3= ')'
                    {
                    lv_value_0_3=(Token)match(input,28,FOLLOW_28_in_ruleText2385); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1033:8: lv_value_0_4= '\\''
                    {
                    lv_value_0_4=(Token)match(input,29,FOLLOW_29_in_ruleText2414); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1045:8: lv_value_0_5= ','
                    {
                    lv_value_0_5=(Token)match(input,30,FOLLOW_30_in_ruleText2443); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1057:8: lv_value_0_6= ':'
                    {
                    lv_value_0_6=(Token)match(input,31,FOLLOW_31_in_ruleText2472); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1080:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1081:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1082:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2523);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2533); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1089:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1092:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1093:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1093:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1094:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1094:1: (lv_value_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1095:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2574); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1119:1: entryRuleSpecialCommand returns [EObject current=null] : iv_ruleSpecialCommand= ruleSpecialCommand EOF ;
    public final EObject entryRuleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1120:2: (iv_ruleSpecialCommand= ruleSpecialCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1121:2: iv_ruleSpecialCommand= ruleSpecialCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialCommandRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2614);
            iv_ruleSpecialCommand=ruleSpecialCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand2624); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1128:1: ruleSpecialCommand returns [EObject current=null] : (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1131:28: ( (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1132:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1132:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther )
            int alt15=15;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1133:2: this_Include_0= ruleInclude
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleSpecialCommand2674);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1146:2: this_Version_1= ruleVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleSpecialCommand2704);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1159:2: this_SourceFileName_2= ruleSourceFileName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getSourceFileNameParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSourceFileName_in_ruleSpecialCommand2734);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1172:2: this_SourceFileLine_3= ruleSourceFileLine
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getSourceFileLineParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSourceFileLine_in_ruleSpecialCommand2764);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1185:2: this_Markup_4= ruleMarkup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleSpecialCommand2794);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1198:2: this_MarkupLines_5= ruleMarkupLines
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_ruleSpecialCommand2824);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1211:2: this_BlockCommand_6= ruleBlockCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getBlockCommandParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockCommand_in_ruleSpecialCommand2854);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1224:2: this_OutputDefinition_7= ruleOutputDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getOutputDefinitionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputDefinition_in_ruleSpecialCommand2884);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1237:2: this_RelativeMusic_8= ruleRelativeMusic
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getRelativeMusicParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelativeMusic_in_ruleSpecialCommand2914);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1250:2: this_TransposedMusic_9= ruleTransposedMusic
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getTransposedMusicParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransposedMusic_in_ruleSpecialCommand2944);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1263:2: this_ModeChange_10= ruleModeChange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getModeChangeParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModeChange_in_ruleSpecialCommand2974);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1276:2: this_MusicWithLyrics_11= ruleMusicWithLyrics
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getMusicWithLyricsParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMusicWithLyrics_in_ruleSpecialCommand3004);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1289:2: this_NewContext_12= ruleNewContext
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getNewContextParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewContext_in_ruleSpecialCommand3034);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1302:2: this_ContextDef_13= ruleContextDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getContextDefParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextDef_in_ruleSpecialCommand3064);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1315:2: this_Other_14= ruleOther
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandAccess().getOtherParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOther_in_ruleSpecialCommand3094);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1334:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1335:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1336:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude3129);
            iv_ruleInclude=ruleInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude3139); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1343:1: ruleInclude returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_importURI_2_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1346:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1347:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1347:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1347:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'include' ) ) ( (lv_importURI_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleInclude3176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1351:1: ( (lv_keyword_1_0= 'include' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1352:1: (lv_keyword_1_0= 'include' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1352:1: (lv_keyword_1_0= 'include' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1353:3: lv_keyword_1_0= 'include'
            {
            lv_keyword_1_0=(Token)match(input,32,FOLLOW_32_in_ruleInclude3194); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1366:2: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1367:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1367:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1368:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude3224); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1392:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1393:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1394:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion3265);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion3275); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1401:1: ruleVersion returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_version_2_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1404:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1405:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1405:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1405:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'version' ) ) ( (lv_version_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleVersion3312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1409:1: ( (lv_keyword_1_0= 'version' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1410:1: (lv_keyword_1_0= 'version' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1410:1: (lv_keyword_1_0= 'version' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1411:3: lv_keyword_1_0= 'version'
            {
            lv_keyword_1_0=(Token)match(input,33,FOLLOW_33_in_ruleVersion3330); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1424:2: ( (lv_version_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1425:1: (lv_version_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1425:1: (lv_version_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1426:3: lv_version_2_0= RULE_STRING
            {
            lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion3360); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1450:1: entryRuleSourceFileName returns [EObject current=null] : iv_ruleSourceFileName= ruleSourceFileName EOF ;
    public final EObject entryRuleSourceFileName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFileName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1451:2: (iv_ruleSourceFileName= ruleSourceFileName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1452:2: iv_ruleSourceFileName= ruleSourceFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileNameRule()); 
            }
            pushFollow(FOLLOW_ruleSourceFileName_in_entryRuleSourceFileName3401);
            iv_ruleSourceFileName=ruleSourceFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFileName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceFileName3411); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1459:1: ruleSourceFileName returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceFileName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_filename_2_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1462:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1463:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1463:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1463:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefilename' ) ) ( (lv_filename_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSourceFileName3448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSourceFileNameAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1467:1: ( (lv_keyword_1_0= 'sourcefilename' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1468:1: (lv_keyword_1_0= 'sourcefilename' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1468:1: (lv_keyword_1_0= 'sourcefilename' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1469:3: lv_keyword_1_0= 'sourcefilename'
            {
            lv_keyword_1_0=(Token)match(input,34,FOLLOW_34_in_ruleSourceFileName3466); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1482:2: ( (lv_filename_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1483:1: (lv_filename_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1483:1: (lv_filename_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1484:3: lv_filename_2_0= RULE_STRING
            {
            lv_filename_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSourceFileName3496); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1508:1: entryRuleSourceFileLine returns [EObject current=null] : iv_ruleSourceFileLine= ruleSourceFileLine EOF ;
    public final EObject entryRuleSourceFileLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFileLine = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1509:2: (iv_ruleSourceFileLine= ruleSourceFileLine EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1510:2: iv_ruleSourceFileLine= ruleSourceFileLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileLineRule()); 
            }
            pushFollow(FOLLOW_ruleSourceFileLine_in_entryRuleSourceFileLine3537);
            iv_ruleSourceFileLine=ruleSourceFileLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFileLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceFileLine3547); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1517:1: ruleSourceFileLine returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSourceFileLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_line_2_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1520:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1521:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1521:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1521:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'sourcefileline' ) ) ( (lv_line_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSourceFileLine3584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSourceFileLineAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1525:1: ( (lv_keyword_1_0= 'sourcefileline' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1526:1: (lv_keyword_1_0= 'sourcefileline' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1526:1: (lv_keyword_1_0= 'sourcefileline' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1527:3: lv_keyword_1_0= 'sourcefileline'
            {
            lv_keyword_1_0=(Token)match(input,35,FOLLOW_35_in_ruleSourceFileLine3602); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1540:2: ( (lv_line_2_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:1: (lv_line_2_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:1: (lv_line_2_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1542:3: lv_line_2_0= RULE_INT
            {
            lv_line_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSourceFileLine3632); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1566:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1567:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1568:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupRule()); 
            }
            pushFollow(FOLLOW_ruleMarkup_in_entryRuleMarkup3673);
            iv_ruleMarkup=ruleMarkup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkup3683); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1575:1: ruleMarkup returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1578:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1579:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1579:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1579:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markup' ) ) ( (lv_body_2_0= ruleMarkupBody ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMarkup3720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1583:1: ( (lv_keyword_1_0= 'markup' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1584:1: (lv_keyword_1_0= 'markup' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1584:1: (lv_keyword_1_0= 'markup' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1585:3: lv_keyword_1_0= 'markup'
            {
            lv_keyword_1_0=(Token)match(input,36,FOLLOW_36_in_ruleMarkup3738); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1598:2: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1599:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1599:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1600:3: lv_body_2_0= ruleMarkupBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkup3772);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1624:1: entryRuleMarkupLines returns [EObject current=null] : iv_ruleMarkupLines= ruleMarkupLines EOF ;
    public final EObject entryRuleMarkupLines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupLines = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1625:2: (iv_ruleMarkupLines= ruleMarkupLines EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1626:2: iv_ruleMarkupLines= ruleMarkupLines EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupLinesRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines3808);
            iv_ruleMarkupLines=ruleMarkupLines();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkupLines; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupLines3818); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1633:1: ruleMarkupLines returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkupLines() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1636:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1637:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1637:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1637:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'markuplines' ) ) ( (lv_body_2_0= ruleMarkupBody ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMarkupLines3855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1641:1: ( (lv_keyword_1_0= 'markuplines' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1642:1: (lv_keyword_1_0= 'markuplines' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1642:1: (lv_keyword_1_0= 'markuplines' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1643:3: lv_keyword_1_0= 'markuplines'
            {
            lv_keyword_1_0=(Token)match(input,37,FOLLOW_37_in_ruleMarkupLines3873); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1656:2: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1657:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1657:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1658:3: lv_body_2_0= ruleMarkupBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkupLines3907);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1682:1: entryRuleMarkupBody returns [EObject current=null] : iv_ruleMarkupBody= ruleMarkupBody EOF ;
    public final EObject entryRuleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupBody = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1683:2: (iv_ruleMarkupBody= ruleMarkupBody EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1684:2: iv_ruleMarkupBody= ruleMarkupBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody3943);
            iv_ruleMarkupBody=ruleMarkupBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkupBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBody3953); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1691:1: ruleMarkupBody returns [EObject current=null] : ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) ;
    public final EObject ruleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject lv_command_1_1 = null;

        EObject lv_command_1_2 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1694:28: ( ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1695:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1695:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1695:2: () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1695:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1696:2: 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1704:2: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1705:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1705:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1706:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1706:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=93 && LA16_0<=94)) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==26) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1707:3: lv_command_1_1= ruleScheme
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandSchemeParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleScheme_in_ruleMarkupBody4013);
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
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1722:8: lv_command_1_2= ruleUnparsedCommand
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody4032);
            	            lv_command_1_2=ruleUnparsedCommand();

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
            	    break loop17;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1740:3: ( (lv_block_2_0= ruleUnparsedBlock ) )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1741:1: (lv_block_2_0= ruleUnparsedBlock )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1741:1: (lv_block_2_0= ruleUnparsedBlock )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1742:3: lv_block_2_0= ruleUnparsedBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody4057);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1766:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1767:2: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1768:2: iv_ruleBlockCommand= ruleBlockCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockCommandRule()); 
            }
            pushFollow(FOLLOW_ruleBlockCommand_in_entryRuleBlockCommand4094);
            iv_ruleBlockCommand=ruleBlockCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockCommand4104); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1775:1: ruleBlockCommand returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1778:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1779:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1779:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1779:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleBlockCommand4141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBlockCommandAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1783:1: ( ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1784:1: ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1784:1: ( (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1785:1: (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1785:1: (lv_keyword_1_1= 'book' | lv_keyword_1_2= 'bookpart' | lv_keyword_1_3= 'header' | lv_keyword_1_4= 'score' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1786:3: lv_keyword_1_1= 'book'
                    {
                    lv_keyword_1_1=(Token)match(input,38,FOLLOW_38_in_ruleBlockCommand4161); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1798:8: lv_keyword_1_2= 'bookpart'
                    {
                    lv_keyword_1_2=(Token)match(input,39,FOLLOW_39_in_ruleBlockCommand4190); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1810:8: lv_keyword_1_3= 'header'
                    {
                    lv_keyword_1_3=(Token)match(input,40,FOLLOW_40_in_ruleBlockCommand4219); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1822:8: lv_keyword_1_4= 'score'
                    {
                    lv_keyword_1_4=(Token)match(input,41,FOLLOW_41_in_ruleBlockCommand4248); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1837:2: ( (lv_block_2_0= ruleSimpleBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1838:1: (lv_block_2_0= ruleSimpleBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1838:1: (lv_block_2_0= ruleSimpleBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1839:3: lv_block_2_0= ruleSimpleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBlockCommandAccess().getBlockSimpleBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlockCommand4285);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1863:1: entryRuleOutputDefinition returns [EObject current=null] : iv_ruleOutputDefinition= ruleOutputDefinition EOF ;
    public final EObject entryRuleOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDefinition = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1864:2: (iv_ruleOutputDefinition= ruleOutputDefinition EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1865:2: iv_ruleOutputDefinition= ruleOutputDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition4321);
            iv_ruleOutputDefinition=ruleOutputDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDefinition4331); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1872:1: ruleOutputDefinition returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleOutputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1875:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1876:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1876:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1876:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleOutputDefinition4368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOutputDefinitionAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1880:1: ( ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1881:1: ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1881:1: ( (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1882:1: (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1882:1: (lv_keyword_1_1= 'paper' | lv_keyword_1_2= 'midi' | lv_keyword_1_3= 'layout' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt20=1;
                }
                break;
            case 43:
                {
                alt20=2;
                }
                break;
            case 44:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1883:3: lv_keyword_1_1= 'paper'
                    {
                    lv_keyword_1_1=(Token)match(input,42,FOLLOW_42_in_ruleOutputDefinition4388); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1895:8: lv_keyword_1_2= 'midi'
                    {
                    lv_keyword_1_2=(Token)match(input,43,FOLLOW_43_in_ruleOutputDefinition4417); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1907:8: lv_keyword_1_3= 'layout'
                    {
                    lv_keyword_1_3=(Token)match(input,44,FOLLOW_44_in_ruleOutputDefinition4446); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1922:2: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1923:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1923:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1924:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputDefinitionAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleOutputDefinition4483);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1948:1: entryRuleRelativeMusic returns [EObject current=null] : iv_ruleRelativeMusic= ruleRelativeMusic EOF ;
    public final EObject entryRuleRelativeMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1949:2: (iv_ruleRelativeMusic= ruleRelativeMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1950:2: iv_ruleRelativeMusic= ruleRelativeMusic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelativeMusicRule()); 
            }
            pushFollow(FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic4519);
            iv_ruleRelativeMusic=ruleRelativeMusic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelativeMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeMusic4529); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1957:1: ruleRelativeMusic returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) ) ;
    public final EObject ruleRelativeMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_pitch_2_0 = null;

        EObject lv_music_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1960:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1961:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1961:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1961:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'relative' ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleRelativeMusic4566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRelativeMusicAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1965:1: ( (lv_keyword_1_0= 'relative' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1966:1: (lv_keyword_1_0= 'relative' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1966:1: (lv_keyword_1_0= 'relative' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1967:3: lv_keyword_1_0= 'relative'
            {
            lv_keyword_1_0=(Token)match(input,45,FOLLOW_45_in_ruleRelativeMusic4584); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1980:2: ( (lv_pitch_2_0= rulePitch ) )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1981:1: (lv_pitch_2_0= rulePitch )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1981:1: (lv_pitch_2_0= rulePitch )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1982:3: lv_pitch_2_0= rulePitch
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePitch_in_ruleRelativeMusic4618);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1998:3: ( (lv_music_3_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1999:1: (lv_music_3_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1999:1: (lv_music_3_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2000:3: lv_music_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelativeMusicAccess().getMusicExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRelativeMusic4640);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2024:1: entryRulePitch returns [EObject current=null] : iv_rulePitch= rulePitch EOF ;
    public final EObject entryRulePitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePitch = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2025:2: (iv_rulePitch= rulePitch EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2026:2: iv_rulePitch= rulePitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPitchRule()); 
            }
            pushFollow(FOLLOW_rulePitch_in_entryRulePitch4676);
            iv_rulePitch=rulePitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePitch4686); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2033:1: rulePitch returns [EObject current=null] : ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )? ) ;
    public final EObject rulePitch() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token lv_octaveCheck_1_0=null;
        Token lv_reminderAccidental_3_0=null;
        Token lv_cautionaryAccidental_4_0=null;
        EObject lv_octaveShift_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2036:28: ( ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2037:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2037:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2037:2: ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= '=' ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= '!' ) )? ( (lv_cautionaryAccidental_4_0= '?' ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2037:2: ( (lv_base_0_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2038:1: (lv_base_0_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2038:1: (lv_base_0_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2039:3: lv_base_0_0= RULE_ID
            {
            lv_base_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePitch4728); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2055:2: ( (lv_octaveCheck_1_0= '=' ) )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2056:1: (lv_octaveCheck_1_0= '=' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2056:1: (lv_octaveCheck_1_0= '=' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2057:3: lv_octaveCheck_1_0= '='
                    {
                    lv_octaveCheck_1_0=(Token)match(input,13,FOLLOW_13_in_rulePitch4751); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2070:3: ( (lv_octaveShift_2_0= ruleOctave ) )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2071:1: (lv_octaveShift_2_0= ruleOctave )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2071:1: (lv_octaveShift_2_0= ruleOctave )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2072:3: lv_octaveShift_2_0= ruleOctave
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOctave_in_rulePitch4786);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2088:3: ( (lv_reminderAccidental_3_0= '!' ) )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2089:1: (lv_reminderAccidental_3_0= '!' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2089:1: (lv_reminderAccidental_3_0= '!' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2090:3: lv_reminderAccidental_3_0= '!'
                    {
                    lv_reminderAccidental_3_0=(Token)match(input,18,FOLLOW_18_in_rulePitch4805); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2103:3: ( (lv_cautionaryAccidental_4_0= '?' ) )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2104:1: (lv_cautionaryAccidental_4_0= '?' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2104:1: (lv_cautionaryAccidental_4_0= '?' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2105:3: lv_cautionaryAccidental_4_0= '?'
                    {
                    lv_cautionaryAccidental_4_0=(Token)match(input,19,FOLLOW_19_in_rulePitch4837); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2126:1: entryRuleOctave returns [EObject current=null] : iv_ruleOctave= ruleOctave EOF ;
    public final EObject entryRuleOctave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctave = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2127:2: (iv_ruleOctave= ruleOctave EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2128:2: iv_ruleOctave= ruleOctave EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOctaveRule()); 
            }
            pushFollow(FOLLOW_ruleOctave_in_entryRuleOctave4887);
            iv_ruleOctave=ruleOctave();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOctave; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOctave4897); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2135:1: ruleOctave returns [EObject current=null] : ( ( (lv_up_0_0= '\\'' ) )+ | ( (lv_down_1_0= ',' ) )+ ) ;
    public final EObject ruleOctave() throws RecognitionException {
        EObject current = null;

        Token lv_up_0_0=null;
        Token lv_down_1_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2138:28: ( ( ( (lv_up_0_0= '\\'' ) )+ | ( (lv_down_1_0= ',' ) )+ ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2139:1: ( ( (lv_up_0_0= '\\'' ) )+ | ( (lv_down_1_0= ',' ) )+ )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2139:1: ( ( (lv_up_0_0= '\\'' ) )+ | ( (lv_down_1_0= ',' ) )+ )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            else if ( (LA28_0==30) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2139:2: ( (lv_up_0_0= '\\'' ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2139:2: ( (lv_up_0_0= '\\'' ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        alt26 = dfa26.predict(input);
                        switch (alt26) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2140:1: (lv_up_0_0= '\\'' )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2140:1: (lv_up_0_0= '\\'' )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2141:3: lv_up_0_0= '\\''
                    	    {
                    	    lv_up_0_0=(Token)match(input,29,FOLLOW_29_in_ruleOctave4940); if (state.failed) return current;
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
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2155:6: ( (lv_down_1_0= ',' ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2155:6: ( (lv_down_1_0= ',' ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        alt27 = dfa27.predict(input);
                        switch (alt27) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:1: (lv_down_1_0= ',' )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:1: (lv_down_1_0= ',' )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2157:3: lv_down_1_0= ','
                    	    {
                    	    lv_down_1_0=(Token)match(input,30,FOLLOW_30_in_ruleOctave4978); if (state.failed) return current;
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
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2178:1: entryRuleTransposedMusic returns [EObject current=null] : iv_ruleTransposedMusic= ruleTransposedMusic EOF ;
    public final EObject entryRuleTransposedMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransposedMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2179:2: (iv_ruleTransposedMusic= ruleTransposedMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2180:2: iv_ruleTransposedMusic= ruleTransposedMusic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransposedMusicRule()); 
            }
            pushFollow(FOLLOW_ruleTransposedMusic_in_entryRuleTransposedMusic5028);
            iv_ruleTransposedMusic=ruleTransposedMusic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransposedMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransposedMusic5038); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2187:1: ruleTransposedMusic returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) ) ) ;
    public final EObject ruleTransposedMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_source_2_0 = null;

        EObject lv_target_3_0 = null;

        EObject lv_music_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2190:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2191:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2191:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2191:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'transpose' ) ) ( (lv_source_2_0= rulePitch ) ) ( (lv_target_3_0= rulePitch ) ) ( (lv_music_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTransposedMusic5075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransposedMusicAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2195:1: ( (lv_keyword_1_0= 'transpose' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2196:1: (lv_keyword_1_0= 'transpose' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2196:1: (lv_keyword_1_0= 'transpose' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2197:3: lv_keyword_1_0= 'transpose'
            {
            lv_keyword_1_0=(Token)match(input,46,FOLLOW_46_in_ruleTransposedMusic5093); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2210:2: ( (lv_source_2_0= rulePitch ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2211:1: (lv_source_2_0= rulePitch )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2211:1: (lv_source_2_0= rulePitch )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2212:3: lv_source_2_0= rulePitch
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransposedMusicAccess().getSourcePitchParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePitch_in_ruleTransposedMusic5127);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2228:2: ( (lv_target_3_0= rulePitch ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2229:1: (lv_target_3_0= rulePitch )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2229:1: (lv_target_3_0= rulePitch )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2230:3: lv_target_3_0= rulePitch
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransposedMusicAccess().getTargetPitchParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePitch_in_ruleTransposedMusic5148);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2246:2: ( (lv_music_4_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2247:1: (lv_music_4_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2247:1: (lv_music_4_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2248:3: lv_music_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransposedMusicAccess().getMusicExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTransposedMusic5169);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2272:1: entryRuleModeChange returns [EObject current=null] : iv_ruleModeChange= ruleModeChange EOF ;
    public final EObject entryRuleModeChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeChange = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2273:2: (iv_ruleModeChange= ruleModeChange EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2274:2: iv_ruleModeChange= ruleModeChange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModeChangeRule()); 
            }
            pushFollow(FOLLOW_ruleModeChange_in_entryRuleModeChange5205);
            iv_ruleModeChange=ruleModeChange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModeChange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModeChange5215); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2281:1: ruleModeChange returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) ) ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2284:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2285:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2285:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2285:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) ) ( (lv_music_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleModeChange5252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModeChangeAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2289:1: ( ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2290:1: ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2290:1: ( (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2291:1: (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2291:1: (lv_keyword_1_1= 'chordmode' | lv_keyword_1_2= 'drummode' | lv_keyword_1_3= 'figuremode' | lv_keyword_1_4= 'lyricmode' | lv_keyword_1_5= 'notemode' )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt29=1;
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            case 49:
                {
                alt29=3;
                }
                break;
            case 50:
                {
                alt29=4;
                }
                break;
            case 51:
                {
                alt29=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2292:3: lv_keyword_1_1= 'chordmode'
                    {
                    lv_keyword_1_1=(Token)match(input,47,FOLLOW_47_in_ruleModeChange5272); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2304:8: lv_keyword_1_2= 'drummode'
                    {
                    lv_keyword_1_2=(Token)match(input,48,FOLLOW_48_in_ruleModeChange5301); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2316:8: lv_keyword_1_3= 'figuremode'
                    {
                    lv_keyword_1_3=(Token)match(input,49,FOLLOW_49_in_ruleModeChange5330); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2328:8: lv_keyword_1_4= 'lyricmode'
                    {
                    lv_keyword_1_4=(Token)match(input,50,FOLLOW_50_in_ruleModeChange5359); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2340:8: lv_keyword_1_5= 'notemode'
                    {
                    lv_keyword_1_5=(Token)match(input,51,FOLLOW_51_in_ruleModeChange5388); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2355:2: ( (lv_music_2_0= ruleBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2356:1: (lv_music_2_0= ruleBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2356:1: (lv_music_2_0= ruleBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2357:3: lv_music_2_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModeChangeAccess().getMusicBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleModeChange5425);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2381:1: entryRuleMusicWithLyrics returns [EObject current=null] : iv_ruleMusicWithLyrics= ruleMusicWithLyrics EOF ;
    public final EObject entryRuleMusicWithLyrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicWithLyrics = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2382:2: (iv_ruleMusicWithLyrics= ruleMusicWithLyrics EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2383:2: iv_ruleMusicWithLyrics= ruleMusicWithLyrics EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMusicWithLyricsRule()); 
            }
            pushFollow(FOLLOW_ruleMusicWithLyrics_in_entryRuleMusicWithLyrics5461);
            iv_ruleMusicWithLyrics=ruleMusicWithLyrics();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMusicWithLyrics; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMusicWithLyrics5471); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2390:1: ruleMusicWithLyrics returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) ) ) ;
    public final EObject ruleMusicWithLyrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        Token lv_id_2_1=null;
        Token lv_id_2_2=null;
        EObject lv_lyrics_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2393:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2394:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2394:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2394:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'lyricsto' ) ) ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) ) ( (lv_lyrics_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMusicWithLyrics5508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMusicWithLyricsAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2398:1: ( (lv_keyword_1_0= 'lyricsto' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2399:1: (lv_keyword_1_0= 'lyricsto' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2399:1: (lv_keyword_1_0= 'lyricsto' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2400:3: lv_keyword_1_0= 'lyricsto'
            {
            lv_keyword_1_0=(Token)match(input,52,FOLLOW_52_in_ruleMusicWithLyrics5526); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2413:2: ( ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2414:1: ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2414:1: ( (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2415:1: (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2415:1: (lv_id_2_1= RULE_ID | lv_id_2_2= RULE_STRING )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STRING) ) {
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2416:3: lv_id_2_1= RULE_ID
                    {
                    lv_id_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMusicWithLyrics5558); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2431:8: lv_id_2_2= RULE_STRING
                    {
                    lv_id_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMusicWithLyrics5578); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2449:2: ( (lv_lyrics_3_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2450:1: (lv_lyrics_3_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2450:1: (lv_lyrics_3_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2451:3: lv_lyrics_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMusicWithLyricsAccess().getLyricsExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleMusicWithLyrics5607);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2475:1: entryRuleNewContext returns [EObject current=null] : iv_ruleNewContext= ruleNewContext EOF ;
    public final EObject entryRuleNewContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContext = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2476:2: (iv_ruleNewContext= ruleNewContext EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2477:2: iv_ruleNewContext= ruleNewContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewContextRule()); 
            }
            pushFollow(FOLLOW_ruleNewContext_in_entryRuleNewContext5643);
            iv_ruleNewContext=ruleNewContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewContext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewContext5653); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2484:1: ruleNewContext returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2487:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2488:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2488:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2488:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) ) ( (lv_context_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleNewContext5690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewContextAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2492:1: ( ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2493:1: ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2493:1: ( (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2494:1: (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2494:1: (lv_keyword_1_1= 'new' | lv_keyword_1_2= 'context' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            else if ( (LA31_0==54) ) {
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2495:3: lv_keyword_1_1= 'new'
                    {
                    lv_keyword_1_1=(Token)match(input,53,FOLLOW_53_in_ruleNewContext5710); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2507:8: lv_keyword_1_2= 'context'
                    {
                    lv_keyword_1_2=(Token)match(input,54,FOLLOW_54_in_ruleNewContext5739); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2522:2: ( (lv_context_2_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2523:1: (lv_context_2_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2523:1: (lv_context_2_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2524:3: lv_context_2_0= RULE_ID
            {
            lv_context_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewContext5772); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:2: (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:4: otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleNewContext5790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNewContextAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2544:1: ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2545:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2545:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2546:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2546:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_STRING) ) {
                        alt32=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2547:3: lv_id_4_1= RULE_ID
                            {
                            lv_id_4_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewContext5809); if (state.failed) return current;
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
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2562:8: lv_id_4_2= RULE_STRING
                            {
                            lv_id_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNewContext5829); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2580:4: ( (lv_modification_5_0= ruleContextModification ) )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2581:1: (lv_modification_5_0= ruleContextModification )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2581:1: (lv_modification_5_0= ruleContextModification )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2582:3: lv_modification_5_0= ruleContextModification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContextModification_in_ruleNewContext5860);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2598:3: ( (lv_music_6_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2599:1: (lv_music_6_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2599:1: (lv_music_6_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2600:3: lv_music_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewContextAccess().getMusicExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNewContext5882);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2624:1: entryRuleContextModification returns [EObject current=null] : iv_ruleContextModification= ruleContextModification EOF ;
    public final EObject entryRuleContextModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModification = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2625:2: (iv_ruleContextModification= ruleContextModification EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2626:2: iv_ruleContextModification= ruleContextModification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextModificationRule()); 
            }
            pushFollow(FOLLOW_ruleContextModification_in_entryRuleContextModification5918);
            iv_ruleContextModification=ruleContextModification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextModification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextModification5928); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2633:1: ruleContextModification returns [EObject current=null] : (otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleContextModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2636:28: ( (otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2637:1: (otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2637:1: (otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2637:3: otherlv_0= '\\\\' otherlv_1= 'with' ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleContextModification5965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContextModificationAccess().getReverseSolidusKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleContextModification5977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContextModificationAccess().getWithKeyword_1());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2645:1: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2646:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2646:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2647:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContextModificationAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContextModification5998);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2671:1: entryRuleContextDef returns [EObject current=null] : iv_ruleContextDef= ruleContextDef EOF ;
    public final EObject entryRuleContextDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDef = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2672:2: (iv_ruleContextDef= ruleContextDef EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2673:2: iv_ruleContextDef= ruleContextDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextDefRule()); 
            }
            pushFollow(FOLLOW_ruleContextDef_in_entryRuleContextDef6034);
            iv_ruleContextDef=ruleContextDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDef6044); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2680:1: ruleContextDef returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleContextDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_0=null;
        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2683:28: ( (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2684:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2684:1: (otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2684:3: otherlv_0= '\\\\' ( (lv_keyword_1_0= 'context' ) ) ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleContextDef6081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContextDefAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2688:1: ( (lv_keyword_1_0= 'context' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2689:1: (lv_keyword_1_0= 'context' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2689:1: (lv_keyword_1_0= 'context' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2690:3: lv_keyword_1_0= 'context'
            {
            lv_keyword_1_0=(Token)match(input,54,FOLLOW_54_in_ruleContextDef6099); if (state.failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2703:2: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2704:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2704:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2705:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContextDefAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContextDef6133);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2729:1: entryRuleStringIndication returns [EObject current=null] : iv_ruleStringIndication= ruleStringIndication EOF ;
    public final EObject entryRuleStringIndication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringIndication = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2730:2: (iv_ruleStringIndication= ruleStringIndication EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2731:2: iv_ruleStringIndication= ruleStringIndication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringIndicationRule()); 
            }
            pushFollow(FOLLOW_ruleStringIndication_in_entryRuleStringIndication6169);
            iv_ruleStringIndication=ruleStringIndication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringIndication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringIndication6179); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2738:1: ruleStringIndication returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) ) ) ;
    public final EObject ruleStringIndication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_1_0=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2741:28: ( (otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2742:1: (otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2742:1: (otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2742:3: otherlv_0= '\\\\' ( (lv_string_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleStringIndication6216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringIndicationAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2746:1: ( (lv_string_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2747:1: (lv_string_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2747:1: (lv_string_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2748:3: lv_string_1_0= RULE_INT
            {
            lv_string_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringIndication6233); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2772:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2773:2: (iv_ruleOther= ruleOther EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2774:2: iv_ruleOther= ruleOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOther_in_entryRuleOther6274);
            iv_ruleOther=ruleOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOther; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOther6284); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2781:1: ruleOther returns [EObject current=null] : (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        AntlrDatatypeRuleToken lv_keyword_1_1 = null;

        AntlrDatatypeRuleToken lv_keyword_1_4 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2784:28: ( (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2785:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2785:1: (otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2785:3: otherlv_0= '\\\\' ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleOther6321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOtherAccess().getReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2789:1: ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2790:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2790:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2791:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2791:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= '(' | lv_keyword_1_3= ')' | lv_keyword_1_4= ruleOtherName )
            int alt35=4;
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
                alt35=1;
                }
                break;
            case 27:
                {
                alt35=2;
                }
                break;
            case 28:
                {
                alt35=3;
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
                alt35=4;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2792:3: lv_keyword_1_1= ruleSpecialCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherAccess().getKeywordSpecialCharacterParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleOther6344);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2807:8: lv_keyword_1_2= '('
                    {
                    lv_keyword_1_2=(Token)match(input,27,FOLLOW_27_in_ruleOther6360); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2819:8: lv_keyword_1_3= ')'
                    {
                    lv_keyword_1_3=(Token)match(input,28,FOLLOW_28_in_ruleOther6389); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2831:8: lv_keyword_1_4= ruleOtherName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherAccess().getKeywordOtherNameParserRuleCall_1_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleOther6421);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2857:1: entryRuleOtherName returns [String current=null] : iv_ruleOtherName= ruleOtherName EOF ;
    public final String entryRuleOtherName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOtherName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2858:2: (iv_ruleOtherName= ruleOtherName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2859:2: iv_ruleOtherName= ruleOtherName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherNameRule()); 
            }
            pushFollow(FOLLOW_ruleOtherName_in_entryRuleOtherName6461);
            iv_ruleOtherName=ruleOtherName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherName6472); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2866:1: ruleOtherName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'accepts' | kw= 'addlyrics' | kw= 'alias' | kw= 'alternative' | kw= 'change' | kw= 'chords' | kw= 'consists' | kw= 'default' | kw= 'defaultchild' | kw= 'denies' | kw= 'description' | kw= 'drums' | kw= 'figures' | kw= 'grobdescriptions' | kw= 'key' | kw= 'lyrics' | kw= 'maininput' | kw= 'mark' | kw= 'name' | kw= 'objectid' | kw= 'octave' | kw= 'once' | kw= 'override' | kw= 'partial' | kw= 'remove' | kw= 'repeat' | kw= 'rest' | kw= 'revert' | kw= 'sequential' | kw= 'set' | kw= 'simultaneous' | kw= 'skip' | kw= 'tempo' | kw= 'time' | kw= 'times' | kw= 'type' | kw= 'unset' | kw= 'with' ) ;
    public final AntlrDatatypeRuleToken ruleOtherName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2869:28: ( (kw= 'accepts' | kw= 'addlyrics' | kw= 'alias' | kw= 'alternative' | kw= 'change' | kw= 'chords' | kw= 'consists' | kw= 'default' | kw= 'defaultchild' | kw= 'denies' | kw= 'description' | kw= 'drums' | kw= 'figures' | kw= 'grobdescriptions' | kw= 'key' | kw= 'lyrics' | kw= 'maininput' | kw= 'mark' | kw= 'name' | kw= 'objectid' | kw= 'octave' | kw= 'once' | kw= 'override' | kw= 'partial' | kw= 'remove' | kw= 'repeat' | kw= 'rest' | kw= 'revert' | kw= 'sequential' | kw= 'set' | kw= 'simultaneous' | kw= 'skip' | kw= 'tempo' | kw= 'time' | kw= 'times' | kw= 'type' | kw= 'unset' | kw= 'with' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2870:1: (kw= 'accepts' | kw= 'addlyrics' | kw= 'alias' | kw= 'alternative' | kw= 'change' | kw= 'chords' | kw= 'consists' | kw= 'default' | kw= 'defaultchild' | kw= 'denies' | kw= 'description' | kw= 'drums' | kw= 'figures' | kw= 'grobdescriptions' | kw= 'key' | kw= 'lyrics' | kw= 'maininput' | kw= 'mark' | kw= 'name' | kw= 'objectid' | kw= 'octave' | kw= 'once' | kw= 'override' | kw= 'partial' | kw= 'remove' | kw= 'repeat' | kw= 'rest' | kw= 'revert' | kw= 'sequential' | kw= 'set' | kw= 'simultaneous' | kw= 'skip' | kw= 'tempo' | kw= 'time' | kw= 'times' | kw= 'type' | kw= 'unset' | kw= 'with' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2870:1: (kw= 'accepts' | kw= 'addlyrics' | kw= 'alias' | kw= 'alternative' | kw= 'change' | kw= 'chords' | kw= 'consists' | kw= 'default' | kw= 'defaultchild' | kw= 'denies' | kw= 'description' | kw= 'drums' | kw= 'figures' | kw= 'grobdescriptions' | kw= 'key' | kw= 'lyrics' | kw= 'maininput' | kw= 'mark' | kw= 'name' | kw= 'objectid' | kw= 'octave' | kw= 'once' | kw= 'override' | kw= 'partial' | kw= 'remove' | kw= 'repeat' | kw= 'rest' | kw= 'revert' | kw= 'sequential' | kw= 'set' | kw= 'simultaneous' | kw= 'skip' | kw= 'tempo' | kw= 'time' | kw= 'times' | kw= 'type' | kw= 'unset' | kw= 'with' )
            int alt36=38;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt36=1;
                }
                break;
            case 57:
                {
                alt36=2;
                }
                break;
            case 58:
                {
                alt36=3;
                }
                break;
            case 59:
                {
                alt36=4;
                }
                break;
            case 60:
                {
                alt36=5;
                }
                break;
            case 61:
                {
                alt36=6;
                }
                break;
            case 62:
                {
                alt36=7;
                }
                break;
            case 63:
                {
                alt36=8;
                }
                break;
            case 64:
                {
                alt36=9;
                }
                break;
            case 65:
                {
                alt36=10;
                }
                break;
            case 66:
                {
                alt36=11;
                }
                break;
            case 67:
                {
                alt36=12;
                }
                break;
            case 68:
                {
                alt36=13;
                }
                break;
            case 69:
                {
                alt36=14;
                }
                break;
            case 70:
                {
                alt36=15;
                }
                break;
            case 71:
                {
                alt36=16;
                }
                break;
            case 72:
                {
                alt36=17;
                }
                break;
            case 73:
                {
                alt36=18;
                }
                break;
            case 74:
                {
                alt36=19;
                }
                break;
            case 75:
                {
                alt36=20;
                }
                break;
            case 76:
                {
                alt36=21;
                }
                break;
            case 77:
                {
                alt36=22;
                }
                break;
            case 78:
                {
                alt36=23;
                }
                break;
            case 79:
                {
                alt36=24;
                }
                break;
            case 80:
                {
                alt36=25;
                }
                break;
            case 81:
                {
                alt36=26;
                }
                break;
            case 82:
                {
                alt36=27;
                }
                break;
            case 83:
                {
                alt36=28;
                }
                break;
            case 84:
                {
                alt36=29;
                }
                break;
            case 85:
                {
                alt36=30;
                }
                break;
            case 86:
                {
                alt36=31;
                }
                break;
            case 87:
                {
                alt36=32;
                }
                break;
            case 88:
                {
                alt36=33;
                }
                break;
            case 89:
                {
                alt36=34;
                }
                break;
            case 90:
                {
                alt36=35;
                }
                break;
            case 91:
                {
                alt36=36;
                }
                break;
            case 92:
                {
                alt36=37;
                }
                break;
            case 55:
                {
                alt36=38;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2871:2: kw= 'accepts'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOtherName6510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getAcceptsKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2878:2: kw= 'addlyrics'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOtherName6529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2885:2: kw= 'alias'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOtherName6548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getAliasKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2892:2: kw= 'alternative'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOtherName6567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getAlternativeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2899:2: kw= 'change'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOtherName6586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getChangeKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2906:2: kw= 'chords'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleOtherName6605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getChordsKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2913:2: kw= 'consists'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOtherName6624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getConsistsKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2920:2: kw= 'default'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleOtherName6643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDefaultKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2927:2: kw= 'defaultchild'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleOtherName6662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDefaultchildKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2934:2: kw= 'denies'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleOtherName6681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDeniesKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2941:2: kw= 'description'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleOtherName6700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDescriptionKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2948:2: kw= 'drums'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleOtherName6719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getDrumsKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2955:2: kw= 'figures'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleOtherName6738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getFiguresKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2962:2: kw= 'grobdescriptions'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleOtherName6757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2969:2: kw= 'key'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleOtherName6776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getKeyKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2976:2: kw= 'lyrics'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleOtherName6795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getLyricsKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2983:2: kw= 'maininput'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleOtherName6814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getMaininputKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2990:2: kw= 'mark'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleOtherName6833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getMarkKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2997:2: kw= 'name'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleOtherName6852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getNameKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3004:2: kw= 'objectid'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleOtherName6871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getObjectidKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3011:2: kw= 'octave'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleOtherName6890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getOctaveKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3018:2: kw= 'once'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleOtherName6909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getOnceKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3025:2: kw= 'override'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleOtherName6928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getOverrideKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3032:2: kw= 'partial'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleOtherName6947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getPartialKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3039:2: kw= 'remove'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleOtherName6966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getRemoveKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3046:2: kw= 'repeat'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleOtherName6985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getRepeatKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3053:2: kw= 'rest'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleOtherName7004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getRestKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3060:2: kw= 'revert'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleOtherName7023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getRevertKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3067:2: kw= 'sequential'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleOtherName7042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getSequentialKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3074:2: kw= 'set'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleOtherName7061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getSetKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3081:2: kw= 'simultaneous'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleOtherName7080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getSimultaneousKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3088:2: kw= 'skip'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleOtherName7099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getSkipKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3095:2: kw= 'tempo'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleOtherName7118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getTempoKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3102:2: kw= 'time'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleOtherName7137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getTimeKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3109:2: kw= 'times'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleOtherName7156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getTimesKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3116:2: kw= 'type'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleOtherName7175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getTypeKeyword_35()); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3123:2: kw= 'unset'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleOtherName7194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOtherNameAccess().getUnsetKeyword_36()); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3130:2: kw= 'with'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOtherName7213); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3143:1: entryRuleSpecialCommandName returns [String current=null] : iv_ruleSpecialCommandName= ruleSpecialCommandName EOF ;
    public final String entryRuleSpecialCommandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCommandName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3144:2: (iv_ruleSpecialCommandName= ruleSpecialCommandName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3145:2: iv_ruleSpecialCommandName= ruleSpecialCommandName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialCommandNameRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName7254);
            iv_ruleSpecialCommandName=ruleSpecialCommandName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialCommandName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommandName7265); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3152:1: ruleSpecialCommandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCommandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OtherName_24 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3155:28: ( (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3156:1: (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3156:1: (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName )
            int alt37=25;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3157:2: kw= 'include'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleSpecialCommandName7303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3164:2: kw= 'version'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleSpecialCommandName7322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3171:2: kw= 'sourcefilename'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleSpecialCommandName7341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getSourcefilenameKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3178:2: kw= 'sourcefileline'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleSpecialCommandName7360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getSourcefilelineKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3185:2: kw= 'markup'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleSpecialCommandName7379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3192:2: kw= 'markuplines'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleSpecialCommandName7398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3199:2: kw= 'book'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleSpecialCommandName7417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getBookKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3206:2: kw= 'bookpart'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleSpecialCommandName7436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getBookpartKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3213:2: kw= 'context'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleSpecialCommandName7455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getContextKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3220:2: kw= 'header'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleSpecialCommandName7474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getHeaderKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3227:2: kw= 'score'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleSpecialCommandName7493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getScoreKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3234:2: kw= 'paper'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleSpecialCommandName7512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getPaperKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3241:2: kw= 'midi'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleSpecialCommandName7531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getMidiKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3248:2: kw= 'layout'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleSpecialCommandName7550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getLayoutKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3255:2: kw= 'relative'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleSpecialCommandName7569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getRelativeKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3262:2: kw= 'transpose'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleSpecialCommandName7588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getTransposeKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3269:2: kw= 'chordmode'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleSpecialCommandName7607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getChordmodeKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3276:2: kw= 'drummode'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleSpecialCommandName7626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getDrummodeKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3283:2: kw= 'figuremode'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleSpecialCommandName7645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getFiguremodeKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3290:2: kw= 'lyricmode'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleSpecialCommandName7664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getLyricmodeKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3297:2: kw= 'notemode'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleSpecialCommandName7683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getNotemodeKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3304:2: kw= 'lyricsto'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleSpecialCommandName7702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getLyricstoKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3311:2: kw= 'new'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleSpecialCommandName7721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getNewKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3318:2: kw= 'with'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleSpecialCommandName7740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSpecialCommandNameAccess().getWithKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3325:5: this_OtherName_24= ruleOtherName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecialCommandNameAccess().getOtherNameParserRuleCall_24()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleSpecialCommandName7768);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3343:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3347:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3348:2: iv_ruleScheme= ruleScheme EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeRule()); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme7819);
            iv_ruleScheme=ruleScheme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme7829); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3358:1: ruleScheme returns [EObject current=null] : ( (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3362:28: ( ( (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3363:1: ( (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3363:1: ( (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3363:2: (otherlv_0= '#' | otherlv_1= '$' ) ( (lv_value_2_0= ruleSchemeExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3363:2: (otherlv_0= '#' | otherlv_1= '$' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==93) ) {
                alt38=1;
            }
            else if ( (LA38_0==94) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3363:4: otherlv_0= '#'
                    {
                    otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleScheme7871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSchemeAccess().getNumberSignKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3368:7: otherlv_1= '$'
                    {
                    otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleScheme7889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSchemeAccess().getDollarSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3372:2: ( (lv_value_2_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3373:1: (lv_value_2_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3373:1: (lv_value_2_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3374:3: lv_value_2_0= ruleSchemeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme7911);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3401:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3402:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3403:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression7951);
            iv_ruleSchemeExpression=ruleSchemeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression7961); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3410:1: ruleSchemeExpression returns [EObject current=null] : ( ( (lv_reference_0_0= '$' ) )? ( ( (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' ) ) )* ( (lv_value_2_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_reference_0_0=null;
        Token lv_quotations_1_1=null;
        Token lv_quotations_1_2=null;
        Token lv_quotations_1_3=null;
        Token lv_quotations_1_4=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3413:28: ( ( ( (lv_reference_0_0= '$' ) )? ( ( (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' ) ) )* ( (lv_value_2_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3414:1: ( ( (lv_reference_0_0= '$' ) )? ( ( (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' ) ) )* ( (lv_value_2_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3414:1: ( ( (lv_reference_0_0= '$' ) )? ( ( (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' ) ) )* ( (lv_value_2_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3414:2: ( (lv_reference_0_0= '$' ) )? ( ( (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' ) ) )* ( (lv_value_2_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3414:2: ( (lv_reference_0_0= '$' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==94) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3415:1: (lv_reference_0_0= '$' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3415:1: (lv_reference_0_0= '$' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3416:3: lv_reference_0_0= '$'
                    {
                    lv_reference_0_0=(Token)match(input,94,FOLLOW_94_in_ruleSchemeExpression8004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_reference_0_0, grammarAccess.getSchemeExpressionAccess().getReferenceDollarSignKeyword_0_0());
                          
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3429:3: ( ( (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=29 && LA41_0<=30)||(LA41_0>=95 && LA41_0<=96)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3430:1: ( (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' ) )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3430:1: ( (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' ) )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3431:1: (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3431:1: (lv_quotations_1_1= '\\'' | lv_quotations_1_2= '`' | lv_quotations_1_3= ',' | lv_quotations_1_4= '@' )
            	    int alt40=4;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case 95:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt40=3;
            	        }
            	        break;
            	    case 96:
            	        {
            	        alt40=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3432:3: lv_quotations_1_1= '\\''
            	            {
            	            lv_quotations_1_1=(Token)match(input,29,FOLLOW_29_in_ruleSchemeExpression8038); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_quotations_1_1, grammarAccess.getSchemeExpressionAccess().getQuotationsApostropheKeyword_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
            	              	        }
            	                     		addWithLastConsumed(current, "quotations", lv_quotations_1_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3444:8: lv_quotations_1_2= '`'
            	            {
            	            lv_quotations_1_2=(Token)match(input,95,FOLLOW_95_in_ruleSchemeExpression8067); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_quotations_1_2, grammarAccess.getSchemeExpressionAccess().getQuotationsGraveAccentKeyword_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
            	              	        }
            	                     		addWithLastConsumed(current, "quotations", lv_quotations_1_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3456:8: lv_quotations_1_3= ','
            	            {
            	            lv_quotations_1_3=(Token)match(input,30,FOLLOW_30_in_ruleSchemeExpression8096); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_quotations_1_3, grammarAccess.getSchemeExpressionAccess().getQuotationsCommaKeyword_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
            	              	        }
            	                     		addWithLastConsumed(current, "quotations", lv_quotations_1_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3468:8: lv_quotations_1_4= '@'
            	            {
            	            lv_quotations_1_4=(Token)match(input,96,FOLLOW_96_in_ruleSchemeExpression8125); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_quotations_1_4, grammarAccess.getSchemeExpressionAccess().getQuotationsCommercialAtKeyword_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSchemeExpressionRule());
            	              	        }
            	                     		addWithLastConsumed(current, "quotations", lv_quotations_1_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3483:3: ( (lv_value_2_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3484:1: (lv_value_2_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3484:1: (lv_value_2_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3485:3: lv_value_2_0= ruleSchemeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression8163);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3509:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3510:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3511:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue8199);
            iv_ruleSchemeValue=ruleSchemeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue8209); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3518:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3521:28: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3522:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3522:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            int alt42=7;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3523:2: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue8259);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3536:2: this_SchemeList_1= ruleSchemeList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue8289);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3549:2: this_SchemeBlock_2= ruleSchemeBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue8319);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3562:2: this_SchemeCharacter_3= ruleSchemeCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue8349);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3575:2: this_SchemeNumber_4= ruleSchemeNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_ruleSchemeValue8379);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3588:2: this_SchemeText_5= ruleSchemeText
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue8409);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3601:2: this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue8439);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3620:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3621:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3622:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean8474);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean8484); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3629:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeBooleanValue ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3632:28: ( ( (lv_value_0_0= ruleSchemeBooleanValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3633:1: ( (lv_value_0_0= ruleSchemeBooleanValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3633:1: ( (lv_value_0_0= ruleSchemeBooleanValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3634:1: (lv_value_0_0= ruleSchemeBooleanValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3634:1: (lv_value_0_0= ruleSchemeBooleanValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3635:3: lv_value_0_0= ruleSchemeBooleanValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeBooleanAccess().getValueSchemeBooleanValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeBooleanValue_in_ruleSchemeBoolean8529);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3659:1: entryRuleSchemeBooleanValue returns [String current=null] : iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF ;
    public final String entryRuleSchemeBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeBooleanValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3660:2: (iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3661:2: iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBooleanValue_in_entryRuleSchemeBooleanValue8565);
            iv_ruleSchemeBooleanValue=ruleSchemeBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeBooleanValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBooleanValue8576); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3668:1: ruleSchemeBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3671:28: ( (kw= '#' this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3672:1: (kw= '#' this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3672:1: (kw= '#' this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3673:2: kw= '#' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleSchemeBooleanValue8614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSchemeBooleanValueAccess().getNumberSignKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeBooleanValue8629); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3693:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3694:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3695:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeListRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList8674);
            iv_ruleSchemeList=ruleSchemeList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList8684); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3702:1: ruleSchemeList returns [EObject current=null] : ( () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')' ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        Token lv_vector_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3705:28: ( ( () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3706:1: ( () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3706:1: ( () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3706:2: () ( (lv_vector_1_0= '#' ) )? otherlv_2= '(' ( (lv_expressions_3_0= ruleSchemeExpression ) )* otherlv_4= ')'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3706:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3707:2: 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3715:2: ( (lv_vector_1_0= '#' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==93) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3716:1: (lv_vector_1_0= '#' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3716:1: (lv_vector_1_0= '#' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3717:3: lv_vector_1_0= '#'
                    {
                    lv_vector_1_0=(Token)match(input,93,FOLLOW_93_in_ruleSchemeList8739); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSchemeList8765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3734:1: ( (lv_expressions_3_0= ruleSchemeExpression ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_ANY_OTHER)||LA44_0==13||(LA44_0>=18 && LA44_0<=25)||LA44_0==27||(LA44_0>=29 && LA44_0<=30)||(LA44_0>=32 && LA44_0<=97)||(LA44_0>=99 && LA44_0<=102)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3735:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3735:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3736:3: lv_expressions_3_0= ruleSchemeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList8786);
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
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSchemeList8799); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3764:1: entryRuleSchemeBlock returns [EObject current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final EObject entryRuleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3765:2: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3766:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock8835);
            iv_ruleSchemeBlock=ruleSchemeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock8845); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3773:1: ruleSchemeBlock returns [EObject current=null] : (otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}' ) ;
    public final EObject ruleSchemeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3776:28: ( (otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3777:1: (otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3777:1: (otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3777:3: otherlv_0= '#{' ( (lv_elements_1_0= ruleExpression ) )+ otherlv_2= '#}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleSchemeBlock8882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3781:1: ( (lv_elements_1_0= ruleExpression ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_ANY_OTHER)||(LA45_0>=13 && LA45_0<=14)||LA45_0==16||(LA45_0>=18 && LA45_0<=94)||(LA45_0>=100 && LA45_0<=101)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3782:1: (lv_elements_1_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3782:1: (lv_elements_1_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3783:3: lv_elements_1_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSchemeBlockAccess().getElementsExpressionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSchemeBlock8903);
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
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_2=(Token)match(input,98,FOLLOW_98_in_ruleSchemeBlock8916); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3811:1: entryRuleSchemeCharacter returns [EObject current=null] : iv_ruleSchemeCharacter= ruleSchemeCharacter EOF ;
    public final EObject entryRuleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3812:2: (iv_ruleSchemeCharacter= ruleSchemeCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3813:2: iv_ruleSchemeCharacter= ruleSchemeCharacter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter8952);
            iv_ruleSchemeCharacter=ruleSchemeCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeCharacter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter8962); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3820:1: ruleSchemeCharacter returns [EObject current=null] : (otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) ;
    public final EObject ruleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_3=null;
        AntlrDatatypeRuleToken lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3823:28: ( (otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3824:1: (otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3824:1: (otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3824:3: otherlv_0= '#\\\\' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleSchemeCharacter8999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3828:1: ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3829:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3829:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3830:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3830:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt46=1;
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
                alt46=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3831:3: lv_value_1_1= RULE_ID
                    {
                    lv_value_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeCharacter9018); if (state.failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3846:8: lv_value_1_2= ruleSpecialCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter9042);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3861:8: lv_value_1_3= RULE_ANY_OTHER
                    {
                    lv_value_1_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter9057); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3887:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3888:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3889:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeTextRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText9101);
            iv_ruleSchemeText=ruleSchemeText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText9111); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3896:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeTextValue ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3899:28: ( ( (lv_value_0_0= ruleSchemeTextValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3900:1: ( (lv_value_0_0= ruleSchemeTextValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3900:1: ( (lv_value_0_0= ruleSchemeTextValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3901:1: (lv_value_0_0= ruleSchemeTextValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3901:1: (lv_value_0_0= ruleSchemeTextValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3902:3: lv_value_0_0= ruleSchemeTextValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeTextValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeTextValue_in_ruleSchemeText9156);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3926:1: entryRuleSchemeTextValue returns [String current=null] : iv_ruleSchemeTextValue= ruleSchemeTextValue EOF ;
    public final String entryRuleSchemeTextValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3927:2: (iv_ruleSchemeTextValue= ruleSchemeTextValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3928:2: iv_ruleSchemeTextValue= ruleSchemeTextValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeTextValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextValue_in_entryRuleSchemeTextValue9192);
            iv_ruleSchemeTextValue=ruleSchemeTextValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeTextValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextValue9203); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3935:1: ruleSchemeTextValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SchemeTextValueSegment_0 = null;

        AntlrDatatypeRuleToken this_SchemeTextValueSegment_3 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3938:28: ( (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3939:1: (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3939:1: (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3940:5: this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSchemeTextValueAccess().getSchemeTextValueSegmentParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue9250);
            this_SchemeTextValueSegment_0=ruleSchemeTextValueSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SchemeTextValueSegment_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3950:1: (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*
            loop48:
            do {
                int alt48=2;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3951:2: kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleSchemeTextValue9269); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSchemeTextValueAccess().getColonKeyword_1_0()); 
            	          
            	    }
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3956:1: (kw= ':' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==31) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3957:2: kw= ':'
            	            {
            	            kw=(Token)match(input,31,FOLLOW_31_in_ruleSchemeTextValue9283); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue9307);
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
            	    break loop48;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3981:1: entryRuleSchemeTextValueSegment returns [String current=null] : iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF ;
    public final String entryRuleSchemeTextValueSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextValueSegment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3982:2: (iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3983:2: iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeTextValueSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_entryRuleSchemeTextValueSegment9355);
            iv_ruleSchemeTextValueSegment=ruleSchemeTextValueSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeTextValueSegment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextValueSegment9366); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3990:1: ruleSchemeTextValueSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\\\\\' | kw= '=' | kw= '-' | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextValueSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_6=null;
        Token this_INT_7=null;
        Token this_ANY_OTHER_8=null;
        AntlrDatatypeRuleToken this_SpecialCharacter_3 = null;

        AntlrDatatypeRuleToken this_SpecialCommandName_4 = null;

        AntlrDatatypeRuleToken this_SchemeIdentifier_5 = null;


         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3993:28: ( (kw= '\\\\\\\\' | kw= '=' | kw= '-' | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3994:1: (kw= '\\\\\\\\' | kw= '=' | kw= '-' | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3994:1: (kw= '\\\\\\\\' | kw= '=' | kw= '-' | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER )
            int alt49=9;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt49=1;
                }
                break;
            case 13:
                {
                alt49=2;
                }
                break;
            case 101:
                {
                alt49=3;
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
                alt49=4;
                }
                break;
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
                alt49=5;
                }
                break;
            case RULE_ID:
                {
                alt49=6;
                }
                break;
            case RULE_STRING:
                {
                alt49=7;
                }
                break;
            case RULE_INT:
                {
                alt49=8;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt49=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3995:2: kw= '\\\\\\\\'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleSchemeTextValueSegment9404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSchemeTextValueSegmentAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4002:2: kw= '='
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleSchemeTextValueSegment9423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSchemeTextValueSegmentAccess().getEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4009:2: kw= '-'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleSchemeTextValueSegment9442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSchemeTextValueSegmentAccess().getHyphenMinusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4016:5: this_SpecialCharacter_3= ruleSpecialCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSpecialCharacterParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextValueSegment9470);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4028:5: this_SpecialCommandName_4= ruleSpecialCommandName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSpecialCommandNameParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleSchemeTextValueSegment9503);
                    this_SpecialCommandName_4=ruleSpecialCommandName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SpecialCommandName_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4040:5: this_SchemeIdentifier_5= ruleSchemeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSchemeIdentifierParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeIdentifier_in_ruleSchemeTextValueSegment9536);
                    this_SchemeIdentifier_5=ruleSchemeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SchemeIdentifier_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4051:10: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemeTextValueSegment9562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_6, grammarAccess.getSchemeTextValueSegmentAccess().getSTRINGTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4059:10: this_INT_7= RULE_INT
                    {
                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeTextValueSegment9588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_7, grammarAccess.getSchemeTextValueSegmentAccess().getINTTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4067:10: this_ANY_OTHER_8= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_8=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextValueSegment9614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ANY_OTHER_8, grammarAccess.getSchemeTextValueSegmentAccess().getANY_OTHERTerminalRuleCall_8()); 
                          
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4082:1: entryRuleSchemeIdentifier returns [String current=null] : iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF ;
    public final String entryRuleSchemeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeIdentifier = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4086:2: (iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4087:2: iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeIdentifier_in_entryRuleSchemeIdentifier9666);
            iv_ruleSchemeIdentifier=ruleSchemeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeIdentifier9677); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSchemeIdentifier"


    // $ANTLR start "ruleSchemeIdentifier"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4097:1: ruleSchemeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSchemeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4101:28: ( (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4102:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4102:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4102:6: this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeIdentifier9721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getSchemeIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4109:1: (kw= '-' this_ID_2= RULE_ID )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==101) ) {
                    int LA50_2 = input.LA(2);

                    if ( (LA50_2==RULE_ID) ) {
                        int LA50_3 = input.LA(3);

                        if ( (synpred163_InternalLilyPond()) ) {
                            alt50=1;
                        }


                    }


                }


                switch (alt50) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4110:2: kw= '-' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,101,FOLLOW_101_in_ruleSchemeIdentifier9740); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSchemeIdentifierAccess().getHyphenMinusKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeIdentifier9755); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getSchemeIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSchemeIdentifier"


    // $ANTLR start "entryRuleSchemeNumber"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4133:1: entryRuleSchemeNumber returns [EObject current=null] : iv_ruleSchemeNumber= ruleSchemeNumber EOF ;
    public final EObject entryRuleSchemeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4137:2: (iv_ruleSchemeNumber= ruleSchemeNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4138:2: iv_ruleSchemeNumber= ruleSchemeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber9812);
            iv_ruleSchemeNumber=ruleSchemeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber9822); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSchemeNumber"


    // $ANTLR start "ruleSchemeNumber"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4148:1: ruleSchemeNumber returns [EObject current=null] : ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) ) ) ;
    public final EObject ruleSchemeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_radix_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4152:28: ( ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4153:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4153:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4153:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= ruleSignedInteger ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4153:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==93) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4154:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4154:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4155:3: lv_radix_0_0= ruleSchemeNumberRadix
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber9872);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4171:3: ( (lv_value_1_0= ruleSignedInteger ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4172:1: (lv_value_1_0= ruleSignedInteger )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4172:1: (lv_value_1_0= ruleSignedInteger )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4173:3: lv_value_1_0= ruleSignedInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchemeNumberAccess().getValueSignedIntegerParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_ruleSchemeNumber9894);
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSchemeNumber"


    // $ANTLR start "entryRuleSchemeNumberRadix"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4200:1: entryRuleSchemeNumberRadix returns [String current=null] : iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF ;
    public final String entryRuleSchemeNumberRadix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeNumberRadix = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4201:2: (iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4202:2: iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeNumberRadixRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix9935);
            iv_ruleSchemeNumberRadix=ruleSchemeNumberRadix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeNumberRadix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix9946); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4209:1: ruleSchemeNumberRadix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeNumberRadix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4212:28: ( (kw= '#' this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4213:1: (kw= '#' this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4213:1: (kw= '#' this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4214:2: kw= '#' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleSchemeNumberRadix9984); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeNumberRadix9999); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4234:1: entryRuleSignedInteger returns [String current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final String entryRuleSignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInteger = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4235:2: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4236:2: iv_ruleSignedInteger= ruleSignedInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger10045);
            iv_ruleSignedInteger=ruleSignedInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInteger10056); if (state.failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4243:1: ruleSignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4246:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4247:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4247:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4247:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4247:2: (kw= '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==101) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4248:2: kw= '-'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleSignedInteger10095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInteger10112); if (state.failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4268:1: entryRuleSchemeMarkupCommand returns [EObject current=null] : iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF ;
    public final EObject entryRuleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeMarkupCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4272:2: (iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4273:2: iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemeMarkupCommandRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand10163);
            iv_ruleSchemeMarkupCommand=ruleSchemeMarkupCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemeMarkupCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand10173); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSchemeMarkupCommand"


    // $ANTLR start "ruleSchemeMarkupCommand"
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4283:1: ruleSchemeMarkupCommand returns [EObject current=null] : (otherlv_0= '#:' ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_1=null;
        AntlrDatatypeRuleToken lv_command_1_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4287:28: ( (otherlv_0= '#:' ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4288:1: (otherlv_0= '#:' ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4288:1: (otherlv_0= '#:' ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4288:3: otherlv_0= '#:' ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleSchemeMarkupCommand10214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0());
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4292:1: ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4293:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4293:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4294:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4294:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=32 && LA53_0<=92)) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4295:3: lv_command_1_1= RULE_ID
                    {
                    lv_command_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeMarkupCommand10233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_command_1_1, grammarAccess.getSchemeMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSchemeMarkupCommandRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"command",
                              		lv_command_1_1, 
                              		"ID");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4310:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSchemeMarkupCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleSchemeMarkupCommand10257);
                    lv_command_1_2=ruleSpecialCommandName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSchemeMarkupCommandRule());
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

            	myHiddenTokenState.restore();

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

    // $ANTLR start synpred3_InternalLilyPond
    public final void synpred3_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_PropertyAssignment_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:172:2: (this_PropertyAssignment_0= rulePropertyAssignment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:172:2: this_PropertyAssignment_0= rulePropertyAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred3_InternalLilyPond357);
        this_PropertyAssignment_0=rulePropertyAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalLilyPond

    // $ANTLR start synpred7_InternalLilyPond
    public final void synpred7_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_Text_3 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:257:2: (this_Text_3= ruleText )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:257:2: this_Text_3= ruleText
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleText_in_synpred7_InternalLilyPond572);
        this_Text_3=ruleText();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalLilyPond

    // $ANTLR start synpred22_InternalLilyPond
    public final void synpred22_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_PropertyAssignment_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:792:2: (this_PropertyAssignment_0= rulePropertyAssignment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:792:2: this_PropertyAssignment_0= rulePropertyAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred22_InternalLilyPond1863);
        this_PropertyAssignment_0=rulePropertyAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalLilyPond

    // $ANTLR start synpred26_InternalLilyPond
    public final void synpred26_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_Number_4 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:844:2: (this_Number_4= ruleNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:844:2: this_Number_4= ruleNumber
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNumber_in_synpred26_InternalLilyPond1983);
        this_Number_4=ruleNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalLilyPond

    // $ANTLR start synpred48_InternalLilyPond
    public final void synpred48_InternalLilyPond_fragment() throws RecognitionException {   
        EObject lv_command_1_1 = null;

        EObject lv_command_1_2 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1705:1: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1705:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1705:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1706:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1706:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
        int alt54=2;
        int LA54_0 = input.LA(1);

        if ( ((LA54_0>=93 && LA54_0<=94)) ) {
            alt54=1;
        }
        else if ( (LA54_0==26) ) {
            alt54=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 54, 0, input);

            throw nvae;
        }
        switch (alt54) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1707:3: lv_command_1_1= ruleScheme
                {
                pushFollow(FOLLOW_ruleScheme_in_synpred48_InternalLilyPond4013);
                lv_command_1_1=ruleScheme();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1722:8: lv_command_1_2= ruleUnparsedCommand
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1()); 
                  	    
                }
                pushFollow(FOLLOW_ruleUnparsedCommand_in_synpred48_InternalLilyPond4032);
                lv_command_1_2=ruleUnparsedCommand();

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


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1741:1: ( (lv_block_2_0= ruleUnparsedBlock ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1741:1: (lv_block_2_0= ruleUnparsedBlock )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1741:1: (lv_block_2_0= ruleUnparsedBlock )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1742:3: lv_block_2_0= ruleUnparsedBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleUnparsedBlock_in_synpred49_InternalLilyPond4057);
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


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1981:1: ( (lv_pitch_2_0= rulePitch ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1981:1: (lv_pitch_2_0= rulePitch )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1981:1: (lv_pitch_2_0= rulePitch )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1982:3: lv_pitch_2_0= rulePitch
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePitch_in_synpred55_InternalLilyPond4618);
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

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2056:1: ( (lv_octaveCheck_1_0= '=' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2056:1: (lv_octaveCheck_1_0= '=' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2056:1: (lv_octaveCheck_1_0= '=' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2057:3: lv_octaveCheck_1_0= '='
        {
        lv_octaveCheck_1_0=(Token)match(input,13,FOLLOW_13_in_synpred56_InternalLilyPond4751); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred56_InternalLilyPond

    // $ANTLR start synpred57_InternalLilyPond
    public final void synpred57_InternalLilyPond_fragment() throws RecognitionException {   
        EObject lv_octaveShift_2_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2071:1: ( (lv_octaveShift_2_0= ruleOctave ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2071:1: (lv_octaveShift_2_0= ruleOctave )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2071:1: (lv_octaveShift_2_0= ruleOctave )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2072:3: lv_octaveShift_2_0= ruleOctave
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOctave_in_synpred57_InternalLilyPond4786);
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

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2089:1: ( (lv_reminderAccidental_3_0= '!' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2089:1: (lv_reminderAccidental_3_0= '!' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2089:1: (lv_reminderAccidental_3_0= '!' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2090:3: lv_reminderAccidental_3_0= '!'
        {
        lv_reminderAccidental_3_0=(Token)match(input,18,FOLLOW_18_in_synpred58_InternalLilyPond4805); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred58_InternalLilyPond

    // $ANTLR start synpred59_InternalLilyPond
    public final void synpred59_InternalLilyPond_fragment() throws RecognitionException {   
        Token lv_cautionaryAccidental_4_0=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2104:1: ( (lv_cautionaryAccidental_4_0= '?' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2104:1: (lv_cautionaryAccidental_4_0= '?' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2104:1: (lv_cautionaryAccidental_4_0= '?' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2105:3: lv_cautionaryAccidental_4_0= '?'
        {
        lv_cautionaryAccidental_4_0=(Token)match(input,19,FOLLOW_19_in_synpred59_InternalLilyPond4837); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred59_InternalLilyPond

    // $ANTLR start synpred60_InternalLilyPond
    public final void synpred60_InternalLilyPond_fragment() throws RecognitionException {   
        Token lv_up_0_0=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2140:1: ( (lv_up_0_0= '\\'' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2140:1: (lv_up_0_0= '\\'' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2140:1: (lv_up_0_0= '\\'' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2141:3: lv_up_0_0= '\\''
        {
        lv_up_0_0=(Token)match(input,29,FOLLOW_29_in_synpred60_InternalLilyPond4940); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred60_InternalLilyPond

    // $ANTLR start synpred62_InternalLilyPond
    public final void synpred62_InternalLilyPond_fragment() throws RecognitionException {   
        Token lv_down_1_0=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:1: ( (lv_down_1_0= ',' ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:1: (lv_down_1_0= ',' )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:1: (lv_down_1_0= ',' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2157:3: lv_down_1_0= ','
        {
        lv_down_1_0=(Token)match(input,30,FOLLOW_30_in_synpred62_InternalLilyPond4978); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred62_InternalLilyPond

    // $ANTLR start synpred70_InternalLilyPond
    public final void synpred70_InternalLilyPond_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token lv_id_4_1=null;
        Token lv_id_4_2=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:4: (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:4: otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
        {
        otherlv_3=(Token)match(input,13,FOLLOW_13_in_synpred70_InternalLilyPond5790); if (state.failed) return ;
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2544:1: ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2545:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2545:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2546:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2546:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
        int alt56=2;
        int LA56_0 = input.LA(1);

        if ( (LA56_0==RULE_ID) ) {
            alt56=1;
        }
        else if ( (LA56_0==RULE_STRING) ) {
            alt56=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 56, 0, input);

            throw nvae;
        }
        switch (alt56) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2547:3: lv_id_4_1= RULE_ID
                {
                lv_id_4_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred70_InternalLilyPond5809); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2562:8: lv_id_4_2= RULE_STRING
                {
                lv_id_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred70_InternalLilyPond5829); if (state.failed) return ;

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


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2581:1: ( (lv_modification_5_0= ruleContextModification ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2581:1: (lv_modification_5_0= ruleContextModification )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2581:1: (lv_modification_5_0= ruleContextModification )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2582:3: lv_modification_5_0= ruleContextModification
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleContextModification_in_synpred71_InternalLilyPond5860);
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

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3318:2: (kw= 'with' )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3318:2: kw= 'with'
        {
        kw=(Token)match(input,55,FOLLOW_55_in_synpred135_InternalLilyPond7740); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_InternalLilyPond

    // $ANTLR start synpred142_InternalLilyPond
    public final void synpred142_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_SchemeBoolean_0 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3523:2: (this_SchemeBoolean_0= ruleSchemeBoolean )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3523:2: this_SchemeBoolean_0= ruleSchemeBoolean
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred142_InternalLilyPond8259);
        this_SchemeBoolean_0=ruleSchemeBoolean();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_InternalLilyPond

    // $ANTLR start synpred146_InternalLilyPond
    public final void synpred146_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_SchemeNumber_4 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3575:2: (this_SchemeNumber_4= ruleSchemeNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3575:2: this_SchemeNumber_4= ruleSchemeNumber
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred146_InternalLilyPond8379);
        this_SchemeNumber_4=ruleSchemeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred146_InternalLilyPond

    // $ANTLR start synpred147_InternalLilyPond
    public final void synpred147_InternalLilyPond_fragment() throws RecognitionException {   
        EObject this_SchemeText_5 = null;


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3588:2: (this_SchemeText_5= ruleSchemeText )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3588:2: this_SchemeText_5= ruleSchemeText
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeText_in_synpred147_InternalLilyPond8409);
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


        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3951:2: (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3951:2: kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment
        {
        kw=(Token)match(input,31,FOLLOW_31_in_synpred154_InternalLilyPond9269); if (state.failed) return ;
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3956:1: (kw= ':' )?
        int alt58=2;
        int LA58_0 = input.LA(1);

        if ( (LA58_0==31) ) {
            alt58=1;
        }
        switch (alt58) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3957:2: kw= ':'
                {
                kw=(Token)match(input,31,FOLLOW_31_in_synpred154_InternalLilyPond9283); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_synpred154_InternalLilyPond9307);
        this_SchemeTextValueSegment_3=ruleSchemeTextValueSegment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred154_InternalLilyPond

    // $ANTLR start synpred163_InternalLilyPond
    public final void synpred163_InternalLilyPond_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_ID_2=null;

        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4110:2: (kw= '-' this_ID_2= RULE_ID )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4110:2: kw= '-' this_ID_2= RULE_ID
        {
        kw=(Token)match(input,101,FOLLOW_101_in_synpred163_InternalLilyPond9740); if (state.failed) return ;
        this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred163_InternalLilyPond9755); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_InternalLilyPond

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
    public final boolean synpred22_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalLilyPond_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLilyPond_fragment(); // can never throw exception
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
    public final boolean synpred7_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalLilyPond_fragment(); // can never throw exception
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
    public final boolean synpred163_InternalLilyPond() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred163_InternalLilyPond_fragment(); // can never throw exception
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
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA48 dfa48 = new DFA48(this);
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
    static final String DFA3_eotS =
        "\130\uffff";
    static final String DFA3_eofS =
        "\130\uffff";
    static final String DFA3_minS =
        "\1\4\1\0\126\uffff";
    static final String DFA3_maxS =
        "\1\145\1\0\126\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\124\uffff\1\1";
    static final String DFA3_specialS =
        "\1\uffff\1\0\126\uffff}>";
    static final String[] DFA3_transitionS = {
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "171:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\130\uffff";
    static final String DFA12_eofS =
        "\130\uffff";
    static final String DFA12_minS =
        "\1\4\1\0\4\uffff\1\0\121\uffff";
    static final String DFA12_maxS =
        "\1\145\1\0\4\uffff\1\0\121\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\2\uffff\1\6\116\uffff\1\1\1\5";
    static final String DFA12_specialS =
        "\1\uffff\1\0\4\uffff\1\1\121\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\7\1\6\1\7\5\uffff\1\7\1\3\3\uffff\10\7\1\2\102\7\2\4"+
            "\5\uffff\2\7",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "791:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Number_4= ruleNumber | this_Text_5= ruleText )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalLilyPond()) ) {s = 86;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index12_6);
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
    static final String DFA15_eotS =
        "\22\uffff";
    static final String DFA15_eofS =
        "\22\uffff";
    static final String DFA15_minS =
        "\1\32\1\22\7\uffff\1\4\10\uffff";
    static final String DFA15_maxS =
        "\1\32\1\134\7\uffff\1\16\10\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\7\1\2\1\6\1\11\1\14\1\1\1\15\1\uffff\1\10\1\3\1\12\1"+
        "\4\1\13\1\17\1\5\1\16";
    static final String DFA15_specialS =
        "\22\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\10\17\1\uffff\2\17\3\uffff\1\7\1\3\1\13\1\15\1\20\1\4\4\2"+
            "\3\12\1\5\1\14\5\16\1\6\1\10\1\11\46\17",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1132:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_SourceFileName_2= ruleSourceFileName | this_SourceFileLine_3= ruleSourceFileLine | this_Markup_4= ruleMarkup | this_MarkupLines_5= ruleMarkupLines | this_BlockCommand_6= ruleBlockCommand | this_OutputDefinition_7= ruleOutputDefinition | this_RelativeMusic_8= ruleRelativeMusic | this_TransposedMusic_9= ruleTransposedMusic | this_ModeChange_10= ruleModeChange | this_MusicWithLyrics_11= ruleMusicWithLyrics | this_NewContext_12= ruleNewContext | this_ContextDef_13= ruleContextDef | this_Other_14= ruleOther )";
        }
    }
    static final String DFA17_eotS =
        "\134\uffff";
    static final String DFA17_eofS =
        "\1\1\133\uffff";
    static final String DFA17_minS =
        "\1\4\4\uffff\1\0\1\uffff\2\0\123\uffff";
    static final String DFA17_maxS =
        "\1\145\4\uffff\1\0\1\uffff\2\0\123\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\131\uffff\1\1";
    static final String DFA17_specialS =
        "\5\uffff\1\0\1\uffff\1\1\1\2\123\uffff}>";
    static final String[] DFA17_transitionS = {
            "\4\1\5\uffff\15\1\1\5\102\1\1\7\1\10\3\uffff\1\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
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
            return "()* loopback of 1704:2: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_8);
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
    static final String DFA18_eotS =
        "\134\uffff";
    static final String DFA18_eofS =
        "\1\2\133\uffff";
    static final String DFA18_minS =
        "\1\4\1\0\132\uffff";
    static final String DFA18_maxS =
        "\1\145\1\0\132\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\130\uffff\1\1";
    static final String DFA18_specialS =
        "\1\uffff\1\0\132\uffff}>";
    static final String[] DFA18_transitionS = {
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1740:3: ( (lv_block_2_0= ruleUnparsedBlock ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalLilyPond()) ) {s = 91;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\130\uffff";
    static final String DFA21_eofS =
        "\130\uffff";
    static final String DFA21_minS =
        "\1\4\1\0\126\uffff";
    static final String DFA21_maxS =
        "\1\145\1\0\126\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\124\uffff\1\1";
    static final String DFA21_specialS =
        "\1\uffff\1\0\126\uffff}>";
    static final String[] DFA21_transitionS = {
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
            return "1980:2: ( (lv_pitch_2_0= rulePitch ) )?";
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
                        if ( (synpred55_InternalLilyPond()) ) {s = 87;}

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
        "\1\2\130\uffff";
    static final String DFA22_minS =
        "\1\4\1\0\127\uffff";
    static final String DFA22_maxS =
        "\1\145\1\0\127\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\125\uffff\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\127\uffff}>";
    static final String[] DFA22_transitionS = {
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
            return "2055:2: ( (lv_octaveCheck_1_0= '=' ) )?";
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
                        if ( (synpred56_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_1);
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
        "\1\3\130\uffff";
    static final String DFA23_minS =
        "\1\4\2\0\126\uffff";
    static final String DFA23_maxS =
        "\1\145\2\0\126\uffff";
    static final String DFA23_acceptS =
        "\3\uffff\1\2\124\uffff\1\1";
    static final String DFA23_specialS =
        "\1\uffff\1\0\1\1\126\uffff}>";
    static final String[] DFA23_transitionS = {
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
            return "2070:3: ( (lv_octaveShift_2_0= ruleOctave ) )?";
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
                        if ( (synpred57_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_2);
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
            return "2088:3: ( (lv_reminderAccidental_3_0= '!' ) )?";
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
                        if ( (synpred58_InternalLilyPond()) ) {s = 88;}

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
        "\1\2\130\uffff";
    static final String DFA25_minS =
        "\1\4\1\0\127\uffff";
    static final String DFA25_maxS =
        "\1\145\1\0\127\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\125\uffff\1\1";
    static final String DFA25_specialS =
        "\1\uffff\1\0\127\uffff}>";
    static final String[] DFA25_transitionS = {
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
            return "2103:3: ( (lv_cautionaryAccidental_4_0= '?' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_1);
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
        "\1\4\123\uffff\1\0\4\uffff";
    static final String DFA26_maxS =
        "\1\145\123\uffff\1\0\4\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\126\uffff\1\1";
    static final String DFA26_specialS =
        "\124\uffff\1\0\4\uffff}>";
    static final String[] DFA26_transitionS = {
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
            return "()+ loopback of 2139:2: ( (lv_up_0_0= '\\'' ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_84 = input.LA(1);

                         
                        int index26_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_84);
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
    static final String DFA27_eotS =
        "\131\uffff";
    static final String DFA27_eofS =
        "\1\1\130\uffff";
    static final String DFA27_minS =
        "\1\4\124\uffff\1\0\3\uffff";
    static final String DFA27_maxS =
        "\1\145\124\uffff\1\0\3\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\126\uffff\1\1";
    static final String DFA27_specialS =
        "\125\uffff\1\0\3\uffff}>";
    static final String[] DFA27_transitionS = {
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2155:6: ( (lv_down_1_0= ',' ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_85 = input.LA(1);

                         
                        int index27_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalLilyPond()) ) {s = 88;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_85);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
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
            return "2540:2: (otherlv_3= '=' ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )?";
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
                        if ( (synpred70_InternalLilyPond()) ) {s = 87;}

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
    static final String DFA34_eotS =
        "\130\uffff";
    static final String DFA34_eofS =
        "\130\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\126\uffff";
    static final String DFA34_maxS =
        "\1\145\1\0\126\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\124\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\126\uffff}>";
    static final String[] DFA34_transitionS = {
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2580:4: ( (lv_modification_5_0= ruleContextModification ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalLilyPond()) ) {s = 87;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\33\uffff";
    static final String DFA37_eofS =
        "\33\uffff";
    static final String DFA37_minS =
        "\1\40\27\uffff\1\0\2\uffff";
    static final String DFA37_maxS =
        "\1\134\27\uffff\1\0\2\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\uffff\1"+
        "\31\1\30";
    static final String DFA37_specialS =
        "\30\uffff\1\0\2\uffff}>";
    static final String[] DFA37_transitionS = {
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

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "3156:1: (kw= 'include' | kw= 'version' | kw= 'sourcefilename' | kw= 'sourcefileline' | kw= 'markup' | kw= 'markuplines' | kw= 'book' | kw= 'bookpart' | kw= 'context' | kw= 'header' | kw= 'score' | kw= 'paper' | kw= 'midi' | kw= 'layout' | kw= 'relative' | kw= 'transpose' | kw= 'chordmode' | kw= 'drummode' | kw= 'figuremode' | kw= 'lyricmode' | kw= 'notemode' | kw= 'lyricsto' | kw= 'new' | kw= 'with' | this_OtherName_24= ruleOtherName )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_24 = input.LA(1);

                         
                        int index37_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalLilyPond()) ) {s = 26;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index37_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\14\uffff";
    static final String DFA42_eofS =
        "\14\uffff";
    static final String DFA42_minS =
        "\2\4\3\uffff\2\0\2\uffff\1\0\2\uffff";
    static final String DFA42_maxS =
        "\1\146\1\33\3\uffff\2\0\2\uffff\1\0\2\uffff";
    static final String DFA42_acceptS =
        "\2\uffff\1\2\1\3\1\4\2\uffff\1\6\1\7\1\uffff\1\5\1\1";
    static final String DFA42_specialS =
        "\5\uffff\1\2\1\1\2\uffff\1\0\2\uffff}>";
    static final String[] DFA42_transitionS = {
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "3522:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeNumber_4= ruleSchemeNumber | this_SchemeText_5= ruleSchemeText | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred142_InternalLilyPond()) ) {s = 11;}

                        else if ( (synpred146_InternalLilyPond()) ) {s = 10;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalLilyPond()) ) {s = 10;}

                        else if ( (synpred147_InternalLilyPond()) ) {s = 7;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalLilyPond()) ) {s = 10;}

                        else if ( (synpred147_InternalLilyPond()) ) {s = 7;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\121\uffff";
    static final String DFA48_eofS =
        "\1\1\1\uffff\1\1\114\uffff\1\1\1\uffff";
    static final String DFA48_minS =
        "\1\4\1\uffff\1\4\114\0\1\4\1\uffff";
    static final String DFA48_maxS =
        "\1\146\1\uffff\1\145\114\0\1\145\1\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\2\116\uffff\1\1";
    static final String DFA48_specialS =
        "\3\uffff\1\53\1\0\1\72\1\33\1\35\1\54\1\5\1\77\1\26\1\13\1\47\1"+
        "\104\1\37\1\3\1\60\1\103\1\43\1\57\1\2\1\46\1\6\1\44\1\62\1\10\1"+
        "\65\1\32\1\112\1\21\1\74\1\31\1\75\1\36\1\113\1\16\1\66\1\4\1\22"+
        "\1\70\1\17\1\55\1\11\1\24\1\101\1\7\1\50\1\41\1\110\1\42\1\102\1"+
        "\51\1\107\1\25\1\71\1\20\1\56\1\12\1\63\1\64\1\15\1\61\1\1\1\73"+
        "\1\30\1\111\1\34\1\100\1\27\1\106\1\23\1\67\1\14\1\52\1\40\1\45"+
        "\1\105\1\76\2\uffff}>";
    static final String[] DFA48_transitionS = {
            "\4\1\5\uffff\22\1\1\2\107\1",
            "",
            "\1\3\1\114\1\115\1\116\5\uffff\1\5\4\1\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\5\1\1\117\1\17\1\20\1\21\1\22\1\23\1\24\1"+
            "\25\1\26\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1"+
            "\42\1\43\1\44\1\45\1\27\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1"+
            "\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1"+
            "\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\2\1\3\uffff\1"+
            "\1\1\uffff\1\4\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\3\1\114\1\115\1\116\5\uffff\1\5\4\1\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\6\1\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1"+
            "\26\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1"+
            "\43\1\44\1\45\1\27\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1"+
            "\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1"+
            "\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\112\1\113\2\1\3\uffff\1\1\1\uffff"+
            "\1\4\1\6",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "()* loopback of 3950:1: (kw= ':' (kw= ':' )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_4 = input.LA(1);

                         
                        int index48_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_63 = input.LA(1);

                         
                        int index48_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_63);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_21 = input.LA(1);

                         
                        int index48_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_16 = input.LA(1);

                         
                        int index48_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_38 = input.LA(1);

                         
                        int index48_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_38);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA48_9 = input.LA(1);

                         
                        int index48_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA48_23 = input.LA(1);

                         
                        int index48_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA48_46 = input.LA(1);

                         
                        int index48_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_46);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA48_26 = input.LA(1);

                         
                        int index48_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA48_43 = input.LA(1);

                         
                        int index48_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_43);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA48_58 = input.LA(1);

                         
                        int index48_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_58);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA48_12 = input.LA(1);

                         
                        int index48_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA48_73 = input.LA(1);

                         
                        int index48_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_73);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA48_61 = input.LA(1);

                         
                        int index48_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_61);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA48_36 = input.LA(1);

                         
                        int index48_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_36);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA48_41 = input.LA(1);

                         
                        int index48_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_41);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA48_56 = input.LA(1);

                         
                        int index48_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_56);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA48_30 = input.LA(1);

                         
                        int index48_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_30);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA48_39 = input.LA(1);

                         
                        int index48_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_39);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA48_71 = input.LA(1);

                         
                        int index48_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_71);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA48_44 = input.LA(1);

                         
                        int index48_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_44);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA48_54 = input.LA(1);

                         
                        int index48_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_54);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA48_11 = input.LA(1);

                         
                        int index48_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_11);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA48_69 = input.LA(1);

                         
                        int index48_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_69);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA48_65 = input.LA(1);

                         
                        int index48_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_65);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA48_32 = input.LA(1);

                         
                        int index48_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_32);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA48_28 = input.LA(1);

                         
                        int index48_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_28);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA48_6 = input.LA(1);

                         
                        int index48_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_6);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA48_67 = input.LA(1);

                         
                        int index48_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_67);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA48_7 = input.LA(1);

                         
                        int index48_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_7);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA48_34 = input.LA(1);

                         
                        int index48_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_34);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA48_15 = input.LA(1);

                         
                        int index48_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_15);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA48_75 = input.LA(1);

                         
                        int index48_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_75);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA48_48 = input.LA(1);

                         
                        int index48_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_48);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA48_50 = input.LA(1);

                         
                        int index48_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_50);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA48_19 = input.LA(1);

                         
                        int index48_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_19);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA48_24 = input.LA(1);

                         
                        int index48_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_24);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA48_76 = input.LA(1);

                         
                        int index48_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_76);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA48_22 = input.LA(1);

                         
                        int index48_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_22);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA48_13 = input.LA(1);

                         
                        int index48_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_13);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA48_47 = input.LA(1);

                         
                        int index48_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_47);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA48_52 = input.LA(1);

                         
                        int index48_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_52);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA48_74 = input.LA(1);

                         
                        int index48_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_74);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA48_3 = input.LA(1);

                         
                        int index48_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_3);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA48_8 = input.LA(1);

                         
                        int index48_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_8);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA48_42 = input.LA(1);

                         
                        int index48_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_42);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA48_57 = input.LA(1);

                         
                        int index48_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_57);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA48_20 = input.LA(1);

                         
                        int index48_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_20);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA48_17 = input.LA(1);

                         
                        int index48_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_17);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA48_62 = input.LA(1);

                         
                        int index48_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_62);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA48_25 = input.LA(1);

                         
                        int index48_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_25);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA48_59 = input.LA(1);

                         
                        int index48_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_59);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA48_60 = input.LA(1);

                         
                        int index48_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_60);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA48_27 = input.LA(1);

                         
                        int index48_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_27);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA48_37 = input.LA(1);

                         
                        int index48_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_37);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA48_72 = input.LA(1);

                         
                        int index48_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_72);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA48_40 = input.LA(1);

                         
                        int index48_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_40);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA48_55 = input.LA(1);

                         
                        int index48_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_55);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA48_5 = input.LA(1);

                         
                        int index48_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_5);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA48_64 = input.LA(1);

                         
                        int index48_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_64);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA48_31 = input.LA(1);

                         
                        int index48_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_31);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA48_33 = input.LA(1);

                         
                        int index48_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_33);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA48_78 = input.LA(1);

                         
                        int index48_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_78);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA48_10 = input.LA(1);

                         
                        int index48_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_10);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA48_68 = input.LA(1);

                         
                        int index48_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_68);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA48_45 = input.LA(1);

                         
                        int index48_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_45);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA48_51 = input.LA(1);

                         
                        int index48_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_51);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA48_18 = input.LA(1);

                         
                        int index48_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_18);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA48_14 = input.LA(1);

                         
                        int index48_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_14);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA48_77 = input.LA(1);

                         
                        int index48_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_77);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA48_70 = input.LA(1);

                         
                        int index48_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_70);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA48_53 = input.LA(1);

                         
                        int index48_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_53);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA48_49 = input.LA(1);

                         
                        int index48_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_49);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA48_66 = input.LA(1);

                         
                        int index48_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_66);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA48_29 = input.LA(1);

                         
                        int index48_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_29);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA48_35 = input.LA(1);

                         
                        int index48_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalLilyPond()) ) {s = 80;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_ruleLilyPond136 = new BitSet(new long[]{0xFFFFFFFFFFFD60F2L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_entryRuleToplevelExpression172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToplevelExpression182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleToplevelExpression232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_ruleToplevelExpression262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_ruleExpression357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_ruleExpression387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_entryRuleCommonExpression422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonExpression432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommonExpression482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCommonExpression512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleCommonExpression542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleCommonExpression572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleCommonExpression602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment691 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment711 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssignment731 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssignment798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_rulePropertyAssignment844 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePropertyAssignment856 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyAssignment877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlock973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_ruleBlock1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSimpleBlock1097 = new BitSet(new long[]{0xFFFFFFFFFFFDE0F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleBlock1118 = new BitSet(new long[]{0xFFFFFFFFFFFDE0F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_15_in_ruleSimpleBlock1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSimultaneousBlock1226 = new BitSet(new long[]{0xFFFFFFFFFFFF60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimultaneousBlock1247 = new BitSet(new long[]{0xFFFFFFFFFFFF60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_17_in_ruleSimultaneousBlock1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_ruleCommand1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleCommand1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringIndication_in_ruleCommand1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSpecialCharacter1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSpecialCharacter1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSpecialCharacter1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSpecialCharacter1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSpecialCharacter1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSpecialCharacter1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSpecialCharacter1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSpecialCharacter1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedBlock1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUnparsedBlock1733 = new BitSet(new long[]{0xFFFFFFFFFFFDE0F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock1754 = new BitSet(new long[]{0xFFFFFFFFFFFDE0F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_15_in_ruleUnparsedBlock1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedExpression1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_ruleUnparsedExpression1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleUnparsedExpression1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleUnparsedExpression1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleUnparsedExpression2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedCommand2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUnparsedCommand2095 = new BitSet(new long[]{0xFFFFFFFF00000010L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_ruleUnparsedCommand2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReference2223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleText2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleText2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleText2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleText2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleText2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleText2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSpecialCommand2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSpecialCommand2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileName_in_ruleSpecialCommand2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileLine_in_ruleSpecialCommand2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleSpecialCommand2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_ruleSpecialCommand2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockCommand_in_ruleSpecialCommand2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_ruleSpecialCommand2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_ruleSpecialCommand2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransposedMusic_in_ruleSpecialCommand2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeChange_in_ruleSpecialCommand2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusicWithLyrics_in_ruleSpecialCommand3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_ruleSpecialCommand3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDef_in_ruleSpecialCommand3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_ruleSpecialCommand3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude3129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInclude3176 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInclude3194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion3265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVersion3312 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVersion3330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileName_in_entryRuleSourceFileName3401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceFileName3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSourceFileName3448 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSourceFileName3466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSourceFileName3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileLine_in_entryRuleSourceFileLine3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceFileLine3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSourceFileLine3584 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSourceFileLine3602 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSourceFileLine3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup3673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkup3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMarkup3720 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMarkup3738 = new BitSet(new long[]{0x0000000004004000L,0x0000000060000000L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkup3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines3808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupLines3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMarkupLines3855 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMarkupLines3873 = new BitSet(new long[]{0x0000000004004000L,0x0000000060000000L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkupLines3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody3943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBody3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleMarkupBody4013 = new BitSet(new long[]{0x0000000004004002L,0x0000000060000000L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody4032 = new BitSet(new long[]{0x0000000004004002L,0x0000000060000000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockCommand_in_entryRuleBlockCommand4094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockCommand4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBlockCommand4141 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_38_in_ruleBlockCommand4161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_39_in_ruleBlockCommand4190 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_40_in_ruleBlockCommand4219 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_41_in_ruleBlockCommand4248 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlockCommand4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition4321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDefinition4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOutputDefinition4368 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleOutputDefinition4388 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_43_in_ruleOutputDefinition4417 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_44_in_ruleOutputDefinition4446 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleOutputDefinition4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeMusic4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelativeMusic4566 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleRelativeMusic4584 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_rulePitch_in_ruleRelativeMusic4618 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRelativeMusic4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_entryRulePitch4676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePitch4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePitch4728 = new BitSet(new long[]{0x00000000600C2002L});
    public static final BitSet FOLLOW_13_in_rulePitch4751 = new BitSet(new long[]{0x00000000600C0002L});
    public static final BitSet FOLLOW_ruleOctave_in_rulePitch4786 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_rulePitch4805 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePitch4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_entryRuleOctave4887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOctave4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOctave4940 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30_in_ruleOctave4978 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleTransposedMusic_in_entryRuleTransposedMusic5028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransposedMusic5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTransposedMusic5075 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTransposedMusic5093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePitch_in_ruleTransposedMusic5127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePitch_in_ruleTransposedMusic5148 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTransposedMusic5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeChange_in_entryRuleModeChange5205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModeChange5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleModeChange5252 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_47_in_ruleModeChange5272 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_48_in_ruleModeChange5301 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_49_in_ruleModeChange5330 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_50_in_ruleModeChange5359 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_51_in_ruleModeChange5388 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleModeChange5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusicWithLyrics_in_entryRuleMusicWithLyrics5461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMusicWithLyrics5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMusicWithLyrics5508 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleMusicWithLyrics5526 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMusicWithLyrics5558 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMusicWithLyrics5578 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMusicWithLyrics5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_entryRuleNewContext5643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewContext5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNewContext5690 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_ruleNewContext5710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_54_in_ruleNewContext5739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewContext5772 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_13_in_ruleNewContext5790 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewContext5809 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNewContext5829 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleContextModification_in_ruleNewContext5860 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNewContext5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_entryRuleContextModification5918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextModification5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleContextModification5965 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleContextModification5977 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContextModification5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDef_in_entryRuleContextDef6034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDef6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleContextDef6081 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleContextDef6099 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContextDef6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringIndication_in_entryRuleStringIndication6169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringIndication6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStringIndication6216 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringIndication6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_entryRuleOther6274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOther6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOther6321 = new BitSet(new long[]{0xFFFFFFFF1BFC0000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleOther6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOther6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOther6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleOther6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_entryRuleOtherName6461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherName6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOtherName6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOtherName6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOtherName6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOtherName6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOtherName6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOtherName6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOtherName6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOtherName6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOtherName6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOtherName6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOtherName6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOtherName6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOtherName6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOtherName6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOtherName6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOtherName6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOtherName6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOtherName6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOtherName6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOtherName6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOtherName6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOtherName6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOtherName6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOtherName6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOtherName6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOtherName6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOtherName7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOtherName7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOtherName7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOtherName7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOtherName7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOtherName7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOtherName7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOtherName7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOtherName7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOtherName7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOtherName7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOtherName7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName7254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommandName7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSpecialCommandName7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSpecialCommandName7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSpecialCommandName7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSpecialCommandName7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSpecialCommandName7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSpecialCommandName7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSpecialCommandName7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSpecialCommandName7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSpecialCommandName7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSpecialCommandName7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSpecialCommandName7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSpecialCommandName7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSpecialCommandName7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSpecialCommandName7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSpecialCommandName7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSpecialCommandName7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSpecialCommandName7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSpecialCommandName7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSpecialCommandName7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSpecialCommandName7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSpecialCommandName7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSpecialCommandName7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSpecialCommandName7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSpecialCommandName7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleSpecialCommandName7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme7819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleScheme7871 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_94_in_ruleScheme7889 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme7911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression7951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleSchemeExpression8004 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_29_in_ruleSchemeExpression8038 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_95_in_ruleSchemeExpression8067 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_30_in_ruleSchemeExpression8096 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_96_in_ruleSchemeExpression8125 = new BitSet(new long[]{0xFFFFFFFF6BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression8163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue8199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_ruleSchemeValue8379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean8474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBooleanValue_in_ruleSchemeBoolean8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBooleanValue_in_entryRuleSchemeBooleanValue8565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBooleanValue8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSchemeBooleanValue8614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeBooleanValue8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList8674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSchemeList8739 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSchemeList8765 = new BitSet(new long[]{0xFFFFFFFF7BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList8786 = new BitSet(new long[]{0xFFFFFFFF7BFC20F0L,0x0000007BFFFFFFFFL});
    public static final BitSet FOLLOW_28_in_ruleSchemeList8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock8835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleSchemeBlock8882 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000307FFFFFFFL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSchemeBlock8903 = new BitSet(new long[]{0xFFFFFFFFFFFD60F0L,0x000000347FFFFFFFL});
    public static final BitSet FOLLOW_98_in_ruleSchemeBlock8916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter8952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleSchemeCharacter8999 = new BitSet(new long[]{0x0000000003FC0090L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeCharacter9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText9101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValue_in_ruleSchemeText9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValue_in_entryRuleSchemeTextValue9192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextValue9203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue9250 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleSchemeTextValue9269 = new BitSet(new long[]{0xFFFFFFFF83FC20F0L,0x000000301FFFFFFFL});
    public static final BitSet FOLLOW_31_in_ruleSchemeTextValue9283 = new BitSet(new long[]{0xFFFFFFFF03FC20F0L,0x000000301FFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue9307 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_entryRuleSchemeTextValueSegment9355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextValueSegment9366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleSchemeTextValueSegment9404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSchemeTextValueSegment9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleSchemeTextValueSegment9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextValueSegment9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleSchemeTextValueSegment9503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_ruleSchemeTextValueSegment9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemeTextValueSegment9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeTextValueSegment9588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextValueSegment9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_entryRuleSchemeIdentifier9666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeIdentifier9677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeIdentifier9721 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleSchemeIdentifier9740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeIdentifier9755 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber9812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber9822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber9872 = new BitSet(new long[]{0x0000000000000040L,0x0000002020000000L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleSchemeNumber9894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix9935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix9946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleSchemeNumberRadix9984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeNumberRadix9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger10045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInteger10056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleSignedInteger10095 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInteger10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand10163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleSchemeMarkupCommand10214 = new BitSet(new long[]{0xFFFFFFFF00000010L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeMarkupCommand10233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleSchemeMarkupCommand10257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred2_InternalLilyPond232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred3_InternalLilyPond357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_synpred7_InternalLilyPond572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred22_InternalLilyPond1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_synpred26_InternalLilyPond1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_synpred48_InternalLilyPond4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_synpred48_InternalLilyPond4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_synpred49_InternalLilyPond4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_synpred55_InternalLilyPond4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred56_InternalLilyPond4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_synpred57_InternalLilyPond4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred58_InternalLilyPond4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred59_InternalLilyPond4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred60_InternalLilyPond4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred62_InternalLilyPond4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred70_InternalLilyPond5790 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred70_InternalLilyPond5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred70_InternalLilyPond5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_synpred71_InternalLilyPond5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred135_InternalLilyPond7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred142_InternalLilyPond8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred146_InternalLilyPond8379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_synpred147_InternalLilyPond8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred154_InternalLilyPond9269 = new BitSet(new long[]{0xFFFFFFFF83FC20F0L,0x000000301FFFFFFFL});
    public static final BitSet FOLLOW_31_in_synpred154_InternalLilyPond9283 = new BitSet(new long[]{0xFFFFFFFF03FC20F0L,0x000000301FFFFFFFL});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_synpred154_InternalLilyPond9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_synpred163_InternalLilyPond9740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred163_InternalLilyPond9755 = new BitSet(new long[]{0x0000000000000002L});

}