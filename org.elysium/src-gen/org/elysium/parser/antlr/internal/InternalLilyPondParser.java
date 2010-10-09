package org.elysium.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=35;
    public static final int RULE_SCHEME_SL_COMMENT=39;
    public static final int RULE_ANY_OTHER=41;
    public static final int KEYWORD_19=22;
    public static final int KEYWORD_1=4;
    public static final int KEYWORD_17=20;
    public static final int KEYWORD_18=21;
    public static final int KEYWORD_5=8;
    public static final int KEYWORD_15=18;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_16=19;
    public static final int KEYWORD_3=6;
    public static final int KEYWORD_13=16;
    public static final int KEYWORD_2=5;
    public static final int KEYWORD_14=17;
    public static final int KEYWORD_11=14;
    public static final int RULE_SL_COMMENT=37;
    public static final int EOF=-1;
    public static final int KEYWORD_12=15;
    public static final int KEYWORD_10=13;
    public static final int RULE_ML_COMMENT=38;
    public static final int RULE_STRING=33;
    public static final int KEYWORD_6=9;
    public static final int KEYWORD_7=10;
    public static final int KEYWORD_8=11;
    public static final int KEYWORD_9=12;
    public static final int KEYWORD_28=31;
    public static final int RULE_SCHEME_ML_COMMENT=40;
    public static final int KEYWORD_29=32;
    public static final int RULE_INT=34;
    public static final int KEYWORD_24=27;
    public static final int KEYWORD_25=28;
    public static final int KEYWORD_26=29;
    public static final int KEYWORD_27=30;
    public static final int RULE_WS=36;
    public static final int KEYWORD_20=23;
    public static final int KEYWORD_21=24;
    public static final int KEYWORD_22=25;
    public static final int KEYWORD_23=26;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[129+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

     	private LilyPondGrammarAccess grammarAccess;
     	
        public InternalLilyPondParser(TokenStream input, IAstFactory factory, LilyPondGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/elysium/parser/antlr/internal/InternalLilyPond.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LilyPond";	
       	} 
       	   	
       	@Override
       	protected LilyPondGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleLilyPond
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:77:1: entryRuleLilyPond returns [EObject current=null] : iv_ruleLilyPond= ruleLilyPond EOF ;
    public final EObject entryRuleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLilyPond = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:78:2: (iv_ruleLilyPond= ruleLilyPond EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:79:2: iv_ruleLilyPond= ruleLilyPond EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLilyPondRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLilyPond_in_entryRuleLilyPond73);
            iv_ruleLilyPond=ruleLilyPond();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLilyPond; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilyPond83); if (failed) return current;

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
    // $ANTLR end entryRuleLilyPond


    // $ANTLR start ruleLilyPond
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:86:1: ruleLilyPond returns [EObject current=null] : ( (lv_expressions_0_0= ruleToplevelExpression ) )* ;
    public final EObject ruleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:91:6: ( ( (lv_expressions_0_0= ruleToplevelExpression ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:92:1: ( (lv_expressions_0_0= ruleToplevelExpression ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:92:1: ( (lv_expressions_0_0= ruleToplevelExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_1 && LA1_0<=KEYWORD_2)||(LA1_0>=KEYWORD_4 && LA1_0<=KEYWORD_14)||LA1_0==KEYWORD_16||LA1_0==KEYWORD_18||LA1_0==KEYWORD_23||LA1_0==KEYWORD_25||(LA1_0>=KEYWORD_27 && LA1_0<=RULE_ID)||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:93:1: (lv_expressions_0_0= ruleToplevelExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:93:1: (lv_expressions_0_0= ruleToplevelExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:94:3: lv_expressions_0_0= ruleToplevelExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionParserRuleCall_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleToplevelExpression_in_ruleLilyPond128);
            	    lv_expressions_0_0=ruleToplevelExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getLilyPondRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_0_0, 
            	      	        		"ToplevelExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLilyPond


    // $ANTLR start entryRuleToplevelExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:124:1: entryRuleToplevelExpression returns [EObject current=null] : iv_ruleToplevelExpression= ruleToplevelExpression EOF ;
    public final EObject entryRuleToplevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToplevelExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:125:2: (iv_ruleToplevelExpression= ruleToplevelExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:126:2: iv_ruleToplevelExpression= ruleToplevelExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getToplevelExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleToplevelExpression_in_entryRuleToplevelExpression163);
            iv_ruleToplevelExpression=ruleToplevelExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleToplevelExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToplevelExpression173); if (failed) return current;

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
    // $ANTLR end entryRuleToplevelExpression


    // $ANTLR start ruleToplevelExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:133:1: ruleToplevelExpression returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression ) ;
    public final EObject ruleToplevelExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_CommonExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:138:6: ( (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:139:1: (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:139:1: (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred2()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("139:1: (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression )", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred2()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("139:1: (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression )", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_1:
            case KEYWORD_2:
            case KEYWORD_4:
            case KEYWORD_5:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_23:
            case KEYWORD_25:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt2=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("139:1: (this_Assignment_0= ruleAssignment | this_CommonExpression_1= ruleCommonExpression )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:140:2: this_Assignment_0= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleToplevelExpression223);
                    this_Assignment_0=ruleAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Assignment_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:153:2: this_CommonExpression_1= ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getCommonExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_ruleToplevelExpression253);
                    this_CommonExpression_1=ruleCommonExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_CommonExpression_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleToplevelExpression


    // $ANTLR start entryRuleExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:172:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:173:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:174:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression287);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression297); if (failed) return current;

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:181:1: ruleExpression returns [EObject current=null] : (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAssignment_0 = null;

        EObject this_CommonExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:186:6: ( (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:187:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:187:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred3()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("187:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression )", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA3_2 = input.LA(2);

                if ( (synpred3()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("187:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression )", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_1:
            case KEYWORD_2:
            case KEYWORD_4:
            case KEYWORD_5:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_23:
            case KEYWORD_25:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("187:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_CommonExpression_1= ruleCommonExpression )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:188:2: this_PropertyAssignment_0= rulePropertyAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_ruleExpression347);
                    this_PropertyAssignment_0=rulePropertyAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_PropertyAssignment_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:201:2: this_CommonExpression_1= ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommonExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_ruleExpression377);
                    this_CommonExpression_1=ruleCommonExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_CommonExpression_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleCommonExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:220:1: entryRuleCommonExpression returns [EObject current=null] : iv_ruleCommonExpression= ruleCommonExpression EOF ;
    public final EObject entryRuleCommonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:221:2: (iv_ruleCommonExpression= ruleCommonExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:222:2: iv_ruleCommonExpression= ruleCommonExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommonExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommonExpression_in_entryRuleCommonExpression411);
            iv_ruleCommonExpression=ruleCommonExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonExpression421); if (failed) return current;

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
    // $ANTLR end entryRuleCommonExpression


    // $ANTLR start ruleCommonExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:229:1: ruleCommonExpression returns [EObject current=null] : (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) ;
    public final EObject ruleCommonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Block_1 = null;

        EObject this_Scheme_2 = null;

        EObject this_Text_3 = null;

        EObject this_Number_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:234:6: ( (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:235:1: (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:235:1: (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            int alt4=5;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
                {
                alt4=1;
                }
                break;
            case KEYWORD_16:
            case KEYWORD_23:
                {
                alt4=2;
                }
                break;
            case KEYWORD_2:
                {
                alt4=3;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_4:
            case KEYWORD_5:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
            case KEYWORD_25:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt4=4;
                }
                break;
            case RULE_INT:
                {
                alt4=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("235:1: (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:236:2: this_Command_0= ruleCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommonExpressionAccess().getCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommand_in_ruleCommonExpression471);
                    this_Command_0=ruleCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Command_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:249:2: this_Block_1= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommonExpressionAccess().getBlockParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleCommonExpression501);
                    this_Block_1=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Block_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:262:2: this_Scheme_2= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommonExpressionAccess().getSchemeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleCommonExpression531);
                    this_Scheme_2=ruleScheme();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Scheme_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:275:2: this_Text_3= ruleText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleCommonExpression561);
                    this_Text_3=ruleText();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Text_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:288:2: this_Number_4= ruleNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommonExpressionAccess().getNumberParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleCommonExpression591);
                    this_Number_4=ruleNumber();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Number_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCommonExpression


    // $ANTLR start entryRuleAssignment
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:307:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:308:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:309:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment625);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment635); if (failed) return current;

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
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:316:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:321:6: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:323:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:323:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:324:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:324:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("324:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:325:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment679); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_0_1, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:346:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment699); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getAssignmentAccess().getNameSTRINGTerminalRuleCall_0_0_1(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_0_2, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }

            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleAssignment718); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:375:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:376:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:376:1: (lv_value_2_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:377:3: lv_value_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment739);
            lv_value_2_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRulePropertyAssignment
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:407:1: entryRulePropertyAssignment returns [EObject current=null] : iv_rulePropertyAssignment= rulePropertyAssignment EOF ;
    public final EObject entryRulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssignment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:408:2: (iv_rulePropertyAssignment= rulePropertyAssignment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:409:2: iv_rulePropertyAssignment= rulePropertyAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment774);
            iv_rulePropertyAssignment=rulePropertyAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAssignment784); if (failed) return current;

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
    // $ANTLR end entryRulePropertyAssignment


    // $ANTLR start rulePropertyAssignment
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:416:1: rulePropertyAssignment returns [EObject current=null] : ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:421:6: ( ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:2: ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_10 ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:2: ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:1: ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:1: ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:424:1: (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:424:1: (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("424:1: (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:425:3: lv_id_0_1= RULE_ID
                    {
                    lv_id_0_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyAssignment828); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getPropertyAssignmentAccess().getIdIDTerminalRuleCall_0_0_0(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPropertyAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_0_1, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:446:8: lv_id_0_2= RULE_STRING
                    {
                    lv_id_0_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyAssignment848); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getPropertyAssignmentAccess().getIdSTRINGTerminalRuleCall_0_0_1(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPropertyAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_0_2, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }

            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rulePropertyAssignment867); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:475:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:476:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:476:1: (lv_value_2_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:477:3: lv_value_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulePropertyAssignment888);
            lv_value_2_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPropertyAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePropertyAssignment


    // $ANTLR start entryRuleBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:507:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:508:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:509:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock923);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock933); if (failed) return current;

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
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:516:1: ruleBlock returns [EObject current=null] : (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBlock_0 = null;

        EObject this_SimultaneousBlock_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:521:6: ( (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:522:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:522:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_16) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_23) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("522:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:523:2: this_SimpleBlock_0= ruleSimpleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlock983);
                    this_SimpleBlock_0=ruleSimpleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SimpleBlock_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:536:2: this_SimultaneousBlock_1= ruleSimultaneousBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_ruleBlock1013);
                    this_SimultaneousBlock_1=ruleSimultaneousBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SimultaneousBlock_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleSimpleBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:555:1: entryRuleSimpleBlock returns [EObject current=null] : iv_ruleSimpleBlock= ruleSimpleBlock EOF ;
    public final EObject entryRuleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:556:2: (iv_ruleSimpleBlock= ruleSimpleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:557:2: iv_ruleSimpleBlock= ruleSimpleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1047);
            iv_ruleSimpleBlock=ruleSimpleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock1057); if (failed) return current;

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
    // $ANTLR end entryRuleSimpleBlock


    // $ANTLR start ruleSimpleBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:564:1: ruleSimpleBlock returns [EObject current=null] : ( () KEYWORD_16 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_17 ) ;
    public final EObject ruleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:569:6: ( ( () KEYWORD_16 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_17 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:1: ( () KEYWORD_16 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_17 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:1: ( () KEYWORD_16 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_17 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:2: () KEYWORD_16 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_17
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:571:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSimpleBlock1105); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:589:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=KEYWORD_1 && LA8_0<=KEYWORD_2)||(LA8_0>=KEYWORD_4 && LA8_0<=KEYWORD_14)||LA8_0==KEYWORD_16||LA8_0==KEYWORD_18||LA8_0==KEYWORD_23||LA8_0==KEYWORD_25||(LA8_0>=KEYWORD_27 && LA8_0<=RULE_ID)||LA8_0==RULE_ANY_OTHER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:590:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:590:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:591:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimpleBlock1126);
            	    lv_expressions_2_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSimpleBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_2_0, 
            	      	        		"Expression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleSimpleBlock1138); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSimpleBlock


    // $ANTLR start entryRuleSimultaneousBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:626:1: entryRuleSimultaneousBlock returns [EObject current=null] : iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF ;
    public final EObject entryRuleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneousBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:627:2: (iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:628:2: iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimultaneousBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1173);
            iv_ruleSimultaneousBlock=ruleSimultaneousBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimultaneousBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock1183); if (failed) return current;

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
    // $ANTLR end entryRuleSimultaneousBlock


    // $ANTLR start ruleSimultaneousBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:635:1: ruleSimultaneousBlock returns [EObject current=null] : ( () KEYWORD_23 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_24 ) ;
    public final EObject ruleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:640:6: ( ( () KEYWORD_23 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:1: ( () KEYWORD_23 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:1: ( () KEYWORD_23 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:2: () KEYWORD_23 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:642:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleSimultaneousBlock1231); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:660:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=KEYWORD_1 && LA9_0<=KEYWORD_2)||(LA9_0>=KEYWORD_4 && LA9_0<=KEYWORD_14)||LA9_0==KEYWORD_16||LA9_0==KEYWORD_18||LA9_0==KEYWORD_23||LA9_0==KEYWORD_25||(LA9_0>=KEYWORD_27 && LA9_0<=RULE_ID)||LA9_0==RULE_ANY_OTHER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:661:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:661:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:662:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimultaneousBlock1252);
            	    lv_expressions_2_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSimultaneousBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_2_0, 
            	      	        		"Expression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleSimultaneousBlock1264); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSimultaneousBlock


    // $ANTLR start entryRuleCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:697:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:698:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:699:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1299);
            iv_ruleCommand=ruleCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1309); if (failed) return current;

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
    // $ANTLR end entryRuleCommand


    // $ANTLR start ruleCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:706:1: ruleCommand returns [EObject current=null] : (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialCommand_0 = null;

        EObject this_Reference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:711:6: ( (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:712:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:712:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=KEYWORD_27 && LA10_0<=KEYWORD_29)) ) {
                alt10=1;
            }
            else if ( (LA10_0==KEYWORD_13) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("712:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:713:2: this_SpecialCommand_0= ruleSpecialCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommand_in_ruleCommand1359);
                    this_SpecialCommand_0=ruleSpecialCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SpecialCommand_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:726:2: this_Reference_1= ruleReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleCommand1389);
                    this_Reference_1=ruleReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Reference_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCommand


    // $ANTLR start entryRuleSpecialCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:745:1: entryRuleSpecialCommand returns [EObject current=null] : iv_ruleSpecialCommand= ruleSpecialCommand EOF ;
    public final EObject entryRuleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:746:2: (iv_ruleSpecialCommand= ruleSpecialCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:747:2: iv_ruleSpecialCommand= ruleSpecialCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand1423);
            iv_ruleSpecialCommand=ruleSpecialCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand1433); if (failed) return current;

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
    // $ANTLR end entryRuleSpecialCommand


    // $ANTLR start ruleSpecialCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:754:1: ruleSpecialCommand returns [EObject current=null] : (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup ) ;
    public final EObject ruleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Include_0 = null;

        EObject this_Version_1 = null;

        EObject this_Markup_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:759:6: ( (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:760:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:760:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup )
            int alt11=3;
            switch ( input.LA(1) ) {
            case KEYWORD_28:
                {
                alt11=1;
                }
                break;
            case KEYWORD_29:
                {
                alt11=2;
                }
                break;
            case KEYWORD_27:
                {
                alt11=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("760:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:761:2: this_Include_0= ruleInclude
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleSpecialCommand1483);
                    this_Include_0=ruleInclude();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Include_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:774:2: this_Version_1= ruleVersion
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleSpecialCommand1513);
                    this_Version_1=ruleVersion();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Version_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:787:2: this_Markup_2= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleSpecialCommand1543);
                    this_Markup_2=ruleMarkup();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Markup_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSpecialCommand


    // $ANTLR start entryRuleInclude
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:806:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:807:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:808:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1577);
            iv_ruleInclude=ruleInclude();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1587); if (failed) return current;

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
    // $ANTLR end entryRuleInclude


    // $ANTLR start ruleInclude
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:815:1: ruleInclude returns [EObject current=null] : ( ( (lv_keyword_0_0= KEYWORD_28 ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:820:6: ( ( ( (lv_keyword_0_0= KEYWORD_28 ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:821:1: ( ( (lv_keyword_0_0= KEYWORD_28 ) ) ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:821:1: ( ( (lv_keyword_0_0= KEYWORD_28 ) ) ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:821:2: ( (lv_keyword_0_0= KEYWORD_28 ) ) ( (lv_importURI_1_0= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:821:2: ( (lv_keyword_0_0= KEYWORD_28 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:822:1: (lv_keyword_0_0= KEYWORD_28 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:822:1: (lv_keyword_0_0= KEYWORD_28 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:823:3: lv_keyword_0_0= KEYWORD_28
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInclude1631); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeAccess().getKeywordIncludeKeyword_0_0(), "keyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIncludeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "keyword", lv_keyword_0_0, "\\include", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:843:2: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:844:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:844:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:845:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude1661); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIncludeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importURI",
              	        		lv_importURI_1_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInclude


    // $ANTLR start entryRuleVersion
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:875:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:876:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:877:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVersionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1701);
            iv_ruleVersion=ruleVersion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion1711); if (failed) return current;

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
    // $ANTLR end entryRuleVersion


    // $ANTLR start ruleVersion
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:884:1: ruleVersion returns [EObject current=null] : ( ( (lv_keyword_0_0= KEYWORD_29 ) ) ( (lv_version_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_version_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:889:6: ( ( ( (lv_keyword_0_0= KEYWORD_29 ) ) ( (lv_version_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:890:1: ( ( (lv_keyword_0_0= KEYWORD_29 ) ) ( (lv_version_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:890:1: ( ( (lv_keyword_0_0= KEYWORD_29 ) ) ( (lv_version_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:890:2: ( (lv_keyword_0_0= KEYWORD_29 ) ) ( (lv_version_1_0= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:890:2: ( (lv_keyword_0_0= KEYWORD_29 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:891:1: (lv_keyword_0_0= KEYWORD_29 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:891:1: (lv_keyword_0_0= KEYWORD_29 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:892:3: lv_keyword_0_0= KEYWORD_29
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleVersion1755); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVersionAccess().getKeywordVersionKeyword_0_0(), "keyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVersionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "keyword", lv_keyword_0_0, "\\version", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:912:2: ( (lv_version_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:913:1: (lv_version_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:913:1: (lv_version_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:914:3: lv_version_1_0= RULE_STRING
            {
            lv_version_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion1785); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_1_0(), "version"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVersionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"version",
              	        		lv_version_1_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleVersion


    // $ANTLR start entryRuleMarkup
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:944:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:945:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:946:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkup_in_entryRuleMarkup1825);
            iv_ruleMarkup=ruleMarkup();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkup1835); if (failed) return current;

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
    // $ANTLR end entryRuleMarkup


    // $ANTLR start ruleMarkup
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:953:1: ruleMarkup returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleMarkupKeyword ) ) ( (lv_block_1_0= ruleMarkupBlock ) ) ) ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_keyword_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:958:6: ( ( ( (lv_keyword_0_0= ruleMarkupKeyword ) ) ( (lv_block_1_0= ruleMarkupBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:959:1: ( ( (lv_keyword_0_0= ruleMarkupKeyword ) ) ( (lv_block_1_0= ruleMarkupBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:959:1: ( ( (lv_keyword_0_0= ruleMarkupKeyword ) ) ( (lv_block_1_0= ruleMarkupBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:959:2: ( (lv_keyword_0_0= ruleMarkupKeyword ) ) ( (lv_block_1_0= ruleMarkupBlock ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:959:2: ( (lv_keyword_0_0= ruleMarkupKeyword ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:960:1: (lv_keyword_0_0= ruleMarkupKeyword )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:960:1: (lv_keyword_0_0= ruleMarkupKeyword )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:961:3: lv_keyword_0_0= ruleMarkupKeyword
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkupAccess().getKeywordMarkupKeywordParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupKeyword_in_ruleMarkup1881);
            lv_keyword_0_0=ruleMarkupKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMarkupRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"keyword",
              	        		lv_keyword_0_0, 
              	        		"MarkupKeyword", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:983:2: ( (lv_block_1_0= ruleMarkupBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:984:1: (lv_block_1_0= ruleMarkupBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:984:1: (lv_block_1_0= ruleMarkupBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:985:3: lv_block_1_0= ruleMarkupBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkupAccess().getBlockMarkupBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBlock_in_ruleMarkup1902);
            lv_block_1_0=ruleMarkupBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMarkupRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_1_0, 
              	        		"MarkupBlock", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMarkup


    // $ANTLR start entryRuleMarkupKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1015:1: entryRuleMarkupKeyword returns [String current=null] : iv_ruleMarkupKeyword= ruleMarkupKeyword EOF ;
    public final String entryRuleMarkupKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMarkupKeyword = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1019:1: (iv_ruleMarkupKeyword= ruleMarkupKeyword EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1020:2: iv_ruleMarkupKeyword= ruleMarkupKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupKeyword_in_entryRuleMarkupKeyword1944);
            iv_ruleMarkupKeyword=ruleMarkupKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupKeyword.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupKeyword1955); if (failed) return current;

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
    // $ANTLR end entryRuleMarkupKeyword


    // $ANTLR start ruleMarkupKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1030:1: ruleMarkupKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_27 (kw= KEYWORD_26 )? ) ;
    public final AntlrDatatypeRuleToken ruleMarkupKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1036:6: ( (kw= KEYWORD_27 (kw= KEYWORD_26 )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1037:1: (kw= KEYWORD_27 (kw= KEYWORD_26 )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1037:1: (kw= KEYWORD_27 (kw= KEYWORD_26 )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1038:2: kw= KEYWORD_27 (kw= KEYWORD_26 )?
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleMarkupKeyword1997); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getMarkupKeywordAccess().getMarkupKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1043:1: (kw= KEYWORD_26 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1044:2: kw= KEYWORD_26
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleMarkupKeyword2011); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getMarkupKeywordAccess().getLinesKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMarkupKeyword


    // $ANTLR start entryRuleMarkupBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1060:1: entryRuleMarkupBlock returns [EObject current=null] : iv_ruleMarkupBlock= ruleMarkupBlock EOF ;
    public final EObject entryRuleMarkupBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1061:2: (iv_ruleMarkupBlock= ruleMarkupBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1062:2: iv_ruleMarkupBlock= ruleMarkupBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupBlock_in_entryRuleMarkupBlock2056);
            iv_ruleMarkupBlock=ruleMarkupBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBlock2066); if (failed) return current;

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
    // $ANTLR end entryRuleMarkupBlock


    // $ANTLR start ruleMarkupBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1069:1: ruleMarkupBlock returns [EObject current=null] : ( () KEYWORD_16 ( (lv_expressions_2_0= ruleMarkupExpression ) )* KEYWORD_17 ) ;
    public final EObject ruleMarkupBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1074:6: ( ( () KEYWORD_16 ( (lv_expressions_2_0= ruleMarkupExpression ) )* KEYWORD_17 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1075:1: ( () KEYWORD_16 ( (lv_expressions_2_0= ruleMarkupExpression ) )* KEYWORD_17 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1075:1: ( () KEYWORD_16 ( (lv_expressions_2_0= ruleMarkupExpression ) )* KEYWORD_17 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1075:2: () KEYWORD_16 ( (lv_expressions_2_0= ruleMarkupExpression ) )* KEYWORD_17
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1075:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1076:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getMarkupBlockAccess().getMarkupBlockAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getMarkupBlockAccess().getMarkupBlockAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleMarkupBlock2114); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1094:1: ( (lv_expressions_2_0= ruleMarkupExpression ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=KEYWORD_1 && LA13_0<=KEYWORD_2)||(LA13_0>=KEYWORD_4 && LA13_0<=KEYWORD_14)||LA13_0==KEYWORD_16||LA13_0==KEYWORD_18||LA13_0==KEYWORD_25||(LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==RULE_ANY_OTHER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1095:1: (lv_expressions_2_0= ruleMarkupExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1095:1: (lv_expressions_2_0= ruleMarkupExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1096:3: lv_expressions_2_0= ruleMarkupExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMarkupBlockAccess().getExpressionsMarkupExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMarkupExpression_in_ruleMarkupBlock2135);
            	    lv_expressions_2_0=ruleMarkupExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMarkupBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_2_0, 
            	      	        		"MarkupExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleMarkupBlock2147); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupBlockAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMarkupBlock


    // $ANTLR start entryRuleMarkupExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1131:1: entryRuleMarkupExpression returns [EObject current=null] : iv_ruleMarkupExpression= ruleMarkupExpression EOF ;
    public final EObject entryRuleMarkupExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1132:2: (iv_ruleMarkupExpression= ruleMarkupExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1133:2: iv_ruleMarkupExpression= ruleMarkupExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupExpression_in_entryRuleMarkupExpression2182);
            iv_ruleMarkupExpression=ruleMarkupExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupExpression2192); if (failed) return current;

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
    // $ANTLR end entryRuleMarkupExpression


    // $ANTLR start ruleMarkupExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1140:1: ruleMarkupExpression returns [EObject current=null] : (this_MarkupCommand_0= ruleMarkupCommand | this_MarkupBlock_1= ruleMarkupBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) ;
    public final EObject ruleMarkupExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MarkupCommand_0 = null;

        EObject this_MarkupBlock_1 = null;

        EObject this_Scheme_2 = null;

        EObject this_Text_3 = null;

        EObject this_Number_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1145:6: ( (this_MarkupCommand_0= ruleMarkupCommand | this_MarkupBlock_1= ruleMarkupBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1146:1: (this_MarkupCommand_0= ruleMarkupCommand | this_MarkupBlock_1= ruleMarkupBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1146:1: (this_MarkupCommand_0= ruleMarkupCommand | this_MarkupBlock_1= ruleMarkupBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            int alt14=5;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
                {
                alt14=1;
                }
                break;
            case KEYWORD_16:
                {
                alt14=2;
                }
                break;
            case KEYWORD_2:
                {
                alt14=3;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_4:
            case KEYWORD_5:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
            case KEYWORD_25:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt14=4;
                }
                break;
            case RULE_INT:
                {
                alt14=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1146:1: (this_MarkupCommand_0= ruleMarkupCommand | this_MarkupBlock_1= ruleMarkupBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1147:2: this_MarkupCommand_0= ruleMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMarkupExpressionAccess().getMarkupCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupCommand_in_ruleMarkupExpression2242);
                    this_MarkupCommand_0=ruleMarkupCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MarkupCommand_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1160:2: this_MarkupBlock_1= ruleMarkupBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMarkupExpressionAccess().getMarkupBlockParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupBlock_in_ruleMarkupExpression2272);
                    this_MarkupBlock_1=ruleMarkupBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MarkupBlock_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1173:2: this_Scheme_2= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMarkupExpressionAccess().getSchemeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleMarkupExpression2302);
                    this_Scheme_2=ruleScheme();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Scheme_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1186:2: this_Text_3= ruleText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMarkupExpressionAccess().getTextParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleMarkupExpression2332);
                    this_Text_3=ruleText();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Text_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1199:2: this_Number_4= ruleNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMarkupExpressionAccess().getNumberParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleMarkupExpression2362);
                    this_Number_4=ruleNumber();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Number_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMarkupExpression


    // $ANTLR start entryRuleMarkupCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1218:1: entryRuleMarkupCommand returns [EObject current=null] : iv_ruleMarkupCommand= ruleMarkupCommand EOF ;
    public final EObject entryRuleMarkupCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1222:2: (iv_ruleMarkupCommand= ruleMarkupCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1223:2: iv_ruleMarkupCommand= ruleMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupCommand_in_entryRuleMarkupCommand2402);
            iv_ruleMarkupCommand=ruleMarkupCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupCommand2412); if (failed) return current;

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
    // $ANTLR end entryRuleMarkupCommand


    // $ANTLR start ruleMarkupCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1233:1: ruleMarkupCommand returns [EObject current=null] : ( KEYWORD_13 ( (lv_command_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMarkupCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1239:6: ( ( KEYWORD_13 ( (lv_command_1_0= RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1240:1: ( KEYWORD_13 ( (lv_command_1_0= RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1240:1: ( KEYWORD_13 ( (lv_command_1_0= RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1241:2: KEYWORD_13 ( (lv_command_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleMarkupCommand2452); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupCommandAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1245:1: ( (lv_command_1_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1246:1: (lv_command_1_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1246:1: (lv_command_1_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1247:3: lv_command_1_0= RULE_ID
            {
            lv_command_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMarkupCommand2469); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0(), "command"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMarkupCommandRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"command",
              	        		lv_command_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMarkupCommand


    // $ANTLR start entryRuleReference
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1280:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1284:2: (iv_ruleReference= ruleReference EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1285:2: iv_ruleReference= ruleReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2519);
            iv_ruleReference=ruleReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2529); if (failed) return current;

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
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1295:1: ruleReference returns [EObject current=null] : ( KEYWORD_13 ( ( ruleReferenceName ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1301:6: ( ( KEYWORD_13 ( ( ruleReferenceName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1302:1: ( KEYWORD_13 ( ( ruleReferenceName ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1302:1: ( KEYWORD_13 ( ( ruleReferenceName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1303:2: KEYWORD_13 ( ( ruleReferenceName ) )
            {
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleReference2569); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1307:1: ( ( ruleReferenceName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1308:1: ( ruleReferenceName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1308:1: ( ruleReferenceName )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1309:3: ruleReferenceName
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleReferenceName_in_ruleReference2596);
            ruleReferenceName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleReferenceName
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1337:1: entryRuleReferenceName returns [String current=null] : iv_ruleReferenceName= ruleReferenceName EOF ;
    public final String entryRuleReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReferenceName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1338:1: (iv_ruleReferenceName= ruleReferenceName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1339:2: iv_ruleReferenceName= ruleReferenceName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferenceNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReferenceName_in_entryRuleReferenceName2636);
            iv_ruleReferenceName=ruleReferenceName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReferenceName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceName2647); if (failed) return current;

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
    // $ANTLR end entryRuleReferenceName


    // $ANTLR start ruleReferenceName
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1346:1: ruleReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= KEYWORD_5 | kw= KEYWORD_6 | this_SpecialCharacter_3= ruleSpecialCharacter ) ;
    public final AntlrDatatypeRuleToken ruleReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_SpecialCharacter_3 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1351:6: ( (this_ID_0= RULE_ID | kw= KEYWORD_5 | kw= KEYWORD_6 | this_SpecialCharacter_3= ruleSpecialCharacter ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1352:1: (this_ID_0= RULE_ID | kw= KEYWORD_5 | kw= KEYWORD_6 | this_SpecialCharacter_3= ruleSpecialCharacter )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1352:1: (this_ID_0= RULE_ID | kw= KEYWORD_5 | kw= KEYWORD_6 | this_SpecialCharacter_3= ruleSpecialCharacter )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case KEYWORD_5:
                {
                alt15=2;
                }
                break;
            case KEYWORD_6:
                {
                alt15=3;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
                {
                alt15=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1352:1: (this_ID_0= RULE_ID | kw= KEYWORD_5 | kw= KEYWORD_6 | this_SpecialCharacter_3= ruleSpecialCharacter )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1352:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceName2687); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getReferenceNameAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1361:2: kw= KEYWORD_5
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleReferenceName2711); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getReferenceNameAccess().getLeftParenthesisKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1368:2: kw= KEYWORD_6
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleReferenceName2730); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getReferenceNameAccess().getRightParenthesisKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1375:5: this_SpecialCharacter_3= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferenceNameAccess().getSpecialCharacterParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleReferenceName2758);
                    this_SpecialCharacter_3=ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_SpecialCharacter_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleReferenceName


    // $ANTLR start entryRuleSpecialCharacter
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1393:1: entryRuleSpecialCharacter returns [String current=null] : iv_ruleSpecialCharacter= ruleSpecialCharacter EOF ;
    public final String entryRuleSpecialCharacter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1394:1: (iv_ruleSpecialCharacter= ruleSpecialCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1395:2: iv_ruleSpecialCharacter= ruleSpecialCharacter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCharacterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter2803);
            iv_ruleSpecialCharacter=ruleSpecialCharacter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCharacter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCharacter2814); if (failed) return current;

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
    // $ANTLR end entryRuleSpecialCharacter


    // $ANTLR start ruleSpecialCharacter
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1402:1: ruleSpecialCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_9 | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_14 | kw= KEYWORD_18 ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1407:6: ( (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_9 | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_14 | kw= KEYWORD_18 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1408:1: (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_9 | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_14 | kw= KEYWORD_18 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1408:1: (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_9 | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_14 | kw= KEYWORD_18 )
            int alt16=7;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
                {
                alt16=1;
                }
                break;
            case KEYWORD_7:
                {
                alt16=2;
                }
                break;
            case KEYWORD_9:
                {
                alt16=3;
                }
                break;
            case KEYWORD_11:
                {
                alt16=4;
                }
                break;
            case KEYWORD_12:
                {
                alt16=5;
                }
                break;
            case KEYWORD_14:
                {
                alt16=6;
                }
                break;
            case KEYWORD_18:
                {
                alt16=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1408:1: (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_9 | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_14 | kw= KEYWORD_18 )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1409:2: kw= KEYWORD_1
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSpecialCharacter2852); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1416:2: kw= KEYWORD_7
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleSpecialCharacter2871); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1423:2: kw= KEYWORD_9
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleSpecialCharacter2890); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1430:2: kw= KEYWORD_11
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleSpecialCharacter2909); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1437:2: kw= KEYWORD_12
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleSpecialCharacter2928); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1444:2: kw= KEYWORD_14
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleSpecialCharacter2947); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1451:2: kw= KEYWORD_18
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleSpecialCharacter2966); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getTildeKeyword_6(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSpecialCharacter


    // $ANTLR start entryRuleText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1464:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1465:2: (iv_ruleText= ruleText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1466:2: iv_ruleText= ruleText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText3005);
            iv_ruleText=ruleText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText3015); if (failed) return current;

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
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1473:1: ruleText returns [EObject current=null] : ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        AntlrDatatypeRuleToken lv_value_0_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1478:6: ( ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1479:1: ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1479:1: ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1480:1: ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1480:1: ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1481:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1481:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 )
            int alt17=5;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
            case KEYWORD_25:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt17=1;
                }
                break;
            case KEYWORD_5:
                {
                alt17=2;
                }
                break;
            case KEYWORD_6:
                {
                alt17=3;
                }
                break;
            case KEYWORD_4:
                {
                alt17=4;
                }
                break;
            case KEYWORD_8:
                {
                alt17=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1481:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1482:3: lv_value_0_1= ruleSchemeTextLiterals
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeTextLiterals_in_ruleText3062);
                    lv_value_0_1=ruleSchemeTextLiterals();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_0_1, 
                      	        		"SchemeTextLiterals", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1503:8: lv_value_0_2= KEYWORD_5
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleText3079); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_0_2, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1522:8: lv_value_0_3= KEYWORD_6
                    {
                    lv_value_0_3=(Token)input.LT(1);
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleText3109); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_0_3, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:8: lv_value_0_4= KEYWORD_4
                    {
                    lv_value_0_4=(Token)input.LT(1);
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleText3139); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_0_4, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1560:8: lv_value_0_5= KEYWORD_8
                    {
                    lv_value_0_5=(Token)input.LT(1);
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleText3169); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueCommaKeyword_0_4(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_0_5, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleText


    // $ANTLR start entryRuleNumber
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1590:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1591:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1592:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber3219);
            iv_ruleNumber=ruleNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber3229); if (failed) return current;

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
    // $ANTLR end entryRuleNumber


    // $ANTLR start ruleNumber
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1599:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1604:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1605:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1605:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1606:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1606:1: (lv_value_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1607:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3270); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNumberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNumber


    // $ANTLR start entryRuleScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1637:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1641:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1642:2: iv_ruleScheme= ruleScheme EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme3315);
            iv_ruleScheme=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme3325); if (failed) return current;

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
    // $ANTLR end entryRuleScheme


    // $ANTLR start ruleScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1652:1: ruleScheme returns [EObject current=null] : ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1658:6: ( ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1659:1: ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1659:1: ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1660:2: KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) )
            {
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleScheme3365); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeAccess().getNumberSignKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1664:1: ( (lv_value_1_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1665:1: (lv_value_1_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1665:1: (lv_value_1_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1666:3: lv_value_1_0= ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme3386);
            lv_value_1_0=ruleSchemeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSchemeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_1_0, 
              	        		"SchemeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleScheme


    // $ANTLR start entryRuleSchemeExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1699:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1700:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1701:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression3425);
            iv_ruleSchemeExpression=ruleSchemeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression3435); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeExpression


    // $ANTLR start ruleSchemeExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1708:1: ruleSchemeExpression returns [EObject current=null] : ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) ) ( (lv_value_4_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_quoted_0_0=null;
        Token lv_quasiquoted_1_0=null;
        Token lv_unquoted_2_0=null;
        Token lv_variable_3_0=null;
        EObject lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1713:6: ( ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) ) ( (lv_value_4_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:1: ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) ) ( (lv_value_4_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:1: ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) ) ( (lv_value_4_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) ) ( (lv_value_4_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case KEYWORD_4:
                {
                alt21=1;
                }
                break;
            case KEYWORD_2:
                {
                int LA21_2 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                int LA21_3 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_21:
                {
                int LA21_4 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 4, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_20:
                {
                int LA21_5 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 5, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_25:
                {
                int LA21_6 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 6, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_10:
                {
                int LA21_7 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 7, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_1:
                {
                int LA21_8 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 8, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_7:
                {
                int LA21_9 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 9, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_9:
                {
                int LA21_10 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 10, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_11:
                {
                int LA21_11 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 11, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_12:
                {
                int LA21_12 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 12, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_14:
                {
                int LA21_13 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 13, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_18:
                {
                int LA21_14 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 14, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA21_15 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 15, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA21_16 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 16, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ANY_OTHER:
                {
                int LA21_17 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 17, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA21_18 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 18, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_19:
                {
                int LA21_19 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
                else if ( (synpred38()) ) {
                    alt21=2;
                }
                else if ( (synpred40()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 19, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_15:
                {
                alt21=2;
                }
                break;
            case KEYWORD_8:
                {
                alt21=3;
                }
                break;
            case KEYWORD_3:
                {
                alt21=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1714:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_15 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:3: ( (lv_quoted_0_0= KEYWORD_4 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:3: ( (lv_quoted_0_0= KEYWORD_4 ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==KEYWORD_4) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1715:1: (lv_quoted_0_0= KEYWORD_4 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1715:1: (lv_quoted_0_0= KEYWORD_4 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1716:3: lv_quoted_0_0= KEYWORD_4
                            {
                            lv_quoted_0_0=(Token)input.LT(1);
                            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSchemeExpression3480); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0(), "quoted"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "quoted", true, "\'", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1737:6: ( (lv_quasiquoted_1_0= KEYWORD_15 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1737:6: ( (lv_quasiquoted_1_0= KEYWORD_15 ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==KEYWORD_15) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1738:1: (lv_quasiquoted_1_0= KEYWORD_15 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1738:1: (lv_quasiquoted_1_0= KEYWORD_15 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1739:3: lv_quasiquoted_1_0= KEYWORD_15
                            {
                            lv_quasiquoted_1_0=(Token)input.LT(1);
                            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleSchemeExpression3519); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0(), "quasiquoted"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "quasiquoted", true, "`", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1760:6: ( (lv_unquoted_2_0= KEYWORD_8 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1760:6: ( (lv_unquoted_2_0= KEYWORD_8 ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KEYWORD_8) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1761:1: (lv_unquoted_2_0= KEYWORD_8 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1761:1: (lv_unquoted_2_0= KEYWORD_8 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1762:3: lv_unquoted_2_0= KEYWORD_8
                            {
                            lv_unquoted_2_0=(Token)input.LT(1);
                            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSchemeExpression3558); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0(), "unquoted"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "unquoted", true, ",", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1783:6: ( (lv_variable_3_0= KEYWORD_3 ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1783:6: ( (lv_variable_3_0= KEYWORD_3 ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1784:1: (lv_variable_3_0= KEYWORD_3 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1784:1: (lv_variable_3_0= KEYWORD_3 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1785:3: lv_variable_3_0= KEYWORD_3
                    {
                    lv_variable_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSchemeExpression3597); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0(), "variable"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "variable", true, "$", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1805:3: ( (lv_value_4_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1806:1: (lv_value_4_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1806:1: (lv_value_4_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1807:3: lv_value_4_0= ruleSchemeValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression3632);
            lv_value_4_0=ruleSchemeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_4_0, 
              	        		"SchemeValue", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeExpression


    // $ANTLR start entryRuleSchemeValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1837:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1838:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1839:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue3667);
            iv_ruleSchemeValue=ruleSchemeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue3677); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeValue


    // $ANTLR start ruleSchemeValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1846:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) ;
    public final EObject ruleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SchemeBoolean_0 = null;

        EObject this_SchemeList_1 = null;

        EObject this_SchemeBlock_2 = null;

        EObject this_SchemeCharacter_3 = null;

        EObject this_SchemeText_4 = null;

        EObject this_SchemeNumber_5 = null;

        EObject this_SchemeMarkupCommand_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1851:6: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1852:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1852:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            int alt22=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID) ) {
                    int LA22_8 = input.LA(3);

                    if ( (synpred41()) ) {
                        alt22=1;
                    }
                    else if ( (synpred46()) ) {
                        alt22=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1852:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 22, 8, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_1==KEYWORD_5) ) {
                    alt22=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1852:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                alt22=2;
                }
                break;
            case KEYWORD_21:
                {
                alt22=3;
                }
                break;
            case KEYWORD_20:
                {
                alt22=4;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
            case KEYWORD_25:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt22=5;
                }
                break;
            case RULE_INT:
                {
                alt22=6;
                }
                break;
            case KEYWORD_19:
                {
                alt22=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1852:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1853:2: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue3727);
                    this_SchemeBoolean_0=ruleSchemeBoolean();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeBoolean_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1866:2: this_SchemeList_1= ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue3757);
                    this_SchemeList_1=ruleSchemeList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeList_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1879:2: this_SchemeBlock_2= ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue3787);
                    this_SchemeBlock_2=ruleSchemeBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeBlock_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1892:2: this_SchemeCharacter_3= ruleSchemeCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue3817);
                    this_SchemeCharacter_3=ruleSchemeCharacter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeCharacter_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1905:2: this_SchemeText_4= ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue3847);
                    this_SchemeText_4=ruleSchemeText();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeText_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1918:2: this_SchemeNumber_5= ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_ruleSchemeValue3877);
                    this_SchemeNumber_5=ruleSchemeNumber();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeNumber_5;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1931:2: this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue3907);
                    this_SchemeMarkupCommand_6=ruleSchemeMarkupCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeMarkupCommand_6;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeValue


    // $ANTLR start entryRuleSchemeBoolean
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1950:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1951:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1952:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean3941);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean3951); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeBoolean


    // $ANTLR start ruleSchemeBoolean
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1959:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBOOL ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1964:6: ( ( (lv_value_0_0= ruleBOOL ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1965:1: ( (lv_value_0_0= ruleBOOL ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1965:1: ( (lv_value_0_0= ruleBOOL ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1966:1: (lv_value_0_0= ruleBOOL )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1966:1: (lv_value_0_0= ruleBOOL )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1967:3: lv_value_0_0= ruleBOOL
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeBooleanAccess().getValueBOOLParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOL_in_ruleSchemeBoolean3996);
            lv_value_0_0=ruleBOOL();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSchemeBooleanRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"BOOL", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeBoolean


    // $ANTLR start entryRuleSchemeList
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1997:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1998:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1999:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList4030);
            iv_ruleSchemeList=ruleSchemeList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList4040); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeList


    // $ANTLR start ruleSchemeList
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:1: ruleSchemeList returns [EObject current=null] : ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        Token lv_vector_1_0=null;
        EObject lv_expressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2011:6: ( ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2012:1: ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2012:1: ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2012:2: () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2012:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2013:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSchemeListAccess().getSchemeListAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSchemeListAccess().getSchemeListAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2026:2: ( (lv_vector_1_0= KEYWORD_2 ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_2) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2027:1: (lv_vector_1_0= KEYWORD_2 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2027:1: (lv_vector_1_0= KEYWORD_2 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2028:3: lv_vector_1_0= KEYWORD_2
                    {
                    lv_vector_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeList4096); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0(), "vector"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeListRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "vector", true, "#", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSchemeList4121); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2053:1: ( (lv_expressions_3_0= ruleSchemeExpression ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=KEYWORD_1 && LA24_0<=KEYWORD_5)||(LA24_0>=KEYWORD_7 && LA24_0<=KEYWORD_12)||(LA24_0>=KEYWORD_14 && LA24_0<=KEYWORD_15)||(LA24_0>=KEYWORD_18 && LA24_0<=KEYWORD_21)||LA24_0==KEYWORD_25||(LA24_0>=RULE_STRING && LA24_0<=RULE_ID)||LA24_0==RULE_ANY_OTHER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2054:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2054:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2055:3: lv_expressions_3_0= ruleSchemeExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList4142);
            	    lv_expressions_3_0=ruleSchemeExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSchemeListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_3_0, 
            	      	        		"SchemeExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleSchemeList4154); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeList


    // $ANTLR start entryRuleSchemeBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2090:1: entryRuleSchemeBlock returns [EObject current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final EObject entryRuleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2091:2: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2092:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock4189);
            iv_ruleSchemeBlock=ruleSchemeBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock4199); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeBlock


    // $ANTLR start ruleSchemeBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2099:1: ruleSchemeBlock returns [EObject current=null] : ( KEYWORD_21 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_22 ) ;
    public final EObject ruleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2104:6: ( ( KEYWORD_21 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_22 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2105:1: ( KEYWORD_21 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_22 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2105:1: ( KEYWORD_21 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_22 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2106:2: KEYWORD_21 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_22
            {
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleSchemeBlock4235); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2110:1: ( (lv_expressions_1_0= ruleExpression ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=KEYWORD_1 && LA25_0<=KEYWORD_2)||(LA25_0>=KEYWORD_4 && LA25_0<=KEYWORD_14)||LA25_0==KEYWORD_16||LA25_0==KEYWORD_18||LA25_0==KEYWORD_23||LA25_0==KEYWORD_25||(LA25_0>=KEYWORD_27 && LA25_0<=RULE_ID)||LA25_0==RULE_ANY_OTHER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2111:1: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2111:1: (lv_expressions_1_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2112:3: lv_expressions_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSchemeBlock4256);
            	    lv_expressions_1_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSchemeBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_1_0, 
            	      	        		"Expression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleSchemeBlock4268); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeBlock


    // $ANTLR start entryRuleSchemeCharacter
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2147:1: entryRuleSchemeCharacter returns [EObject current=null] : iv_ruleSchemeCharacter= ruleSchemeCharacter EOF ;
    public final EObject entryRuleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2148:2: (iv_ruleSchemeCharacter= ruleSchemeCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2149:2: iv_ruleSchemeCharacter= ruleSchemeCharacter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeCharacterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter4303);
            iv_ruleSchemeCharacter=ruleSchemeCharacter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeCharacter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter4313); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeCharacter


    // $ANTLR start ruleSchemeCharacter
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:1: ruleSchemeCharacter returns [EObject current=null] : ( KEYWORD_20 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) ;
    public final EObject ruleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_3=null;
        AntlrDatatypeRuleToken lv_value_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2161:6: ( ( KEYWORD_20 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2162:1: ( KEYWORD_20 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2162:1: ( KEYWORD_20 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2163:2: KEYWORD_20 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            {
            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleSchemeCharacter4349); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2167:1: ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2168:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2168:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2169:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2169:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt26=1;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
                {
                alt26=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt26=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2169:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2170:3: lv_value_1_1= RULE_ID
                    {
                    lv_value_1_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeCharacter4368); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSchemeCharacterAccess().getValueIDTerminalRuleCall_1_0_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeCharacterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_1_1, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2191:8: lv_value_1_2= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter4392);
                    lv_value_1_2=ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeCharacterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_1_2, 
                      	        		"SpecialCharacter", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2212:8: lv_value_1_3= RULE_ANY_OTHER
                    {
                    lv_value_1_3=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter4407); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSchemeCharacterAccess().getValueANY_OTHERTerminalRuleCall_1_0_2(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeCharacterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_1_3, 
                      	        		"ANY_OTHER", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeCharacter


    // $ANTLR start entryRuleSchemeText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2244:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2245:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2246:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText4450);
            iv_ruleSchemeText=ruleSchemeText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText4460); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeText


    // $ANTLR start ruleSchemeText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2253:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeTextLiterals ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2258:6: ( ( (lv_value_0_0= ruleSchemeTextLiterals ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2259:1: ( (lv_value_0_0= ruleSchemeTextLiterals ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2259:1: ( (lv_value_0_0= ruleSchemeTextLiterals ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: (lv_value_0_0= ruleSchemeTextLiterals )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: (lv_value_0_0= ruleSchemeTextLiterals )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2261:3: lv_value_0_0= ruleSchemeTextLiterals
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_ruleSchemeText4505);
            lv_value_0_0=ruleSchemeTextLiterals();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSchemeTextRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"SchemeTextLiterals", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeText


    // $ANTLR start entryRuleSchemeTextLiterals
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2291:1: entryRuleSchemeTextLiterals returns [String current=null] : iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF ;
    public final String entryRuleSchemeTextLiterals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextLiterals = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2292:1: (iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2293:2: iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextLiteralsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals4540);
            iv_ruleSchemeTextLiterals=ruleSchemeTextLiterals();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeTextLiterals.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiterals4551); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeTextLiterals


    // $ANTLR start ruleSchemeTextLiterals
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2300:1: ruleSchemeTextLiterals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_25 | kw= KEYWORD_10 | this_SpecialCharacter_2= ruleSpecialCharacter | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | this_ANY_OTHER_5= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextLiterals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_STRING_4=null;
        Token this_ANY_OTHER_5=null;
        AntlrDatatypeRuleToken this_SpecialCharacter_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2305:6: ( (kw= KEYWORD_25 | kw= KEYWORD_10 | this_SpecialCharacter_2= ruleSpecialCharacter | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | this_ANY_OTHER_5= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2306:1: (kw= KEYWORD_25 | kw= KEYWORD_10 | this_SpecialCharacter_2= ruleSpecialCharacter | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | this_ANY_OTHER_5= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2306:1: (kw= KEYWORD_25 | kw= KEYWORD_10 | this_SpecialCharacter_2= ruleSpecialCharacter | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | this_ANY_OTHER_5= RULE_ANY_OTHER )
            int alt27=6;
            switch ( input.LA(1) ) {
            case KEYWORD_25:
                {
                alt27=1;
                }
                break;
            case KEYWORD_10:
                {
                alt27=2;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
                {
                alt27=4;
                }
                break;
            case RULE_STRING:
                {
                alt27=5;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt27=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2306:1: (kw= KEYWORD_25 | kw= KEYWORD_10 | this_SpecialCharacter_2= ruleSpecialCharacter | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | this_ANY_OTHER_5= RULE_ANY_OTHER )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2307:2: kw= KEYWORD_25
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleSchemeTextLiterals4589); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2314:2: kw= KEYWORD_10
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleSchemeTextLiterals4608); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getEqualsSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2321:5: this_SpecialCharacter_2= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextLiteralsAccess().getSpecialCharacterParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextLiterals4636);
                    this_SpecialCharacter_2=ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_SpecialCharacter_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2332:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeTextLiterals4662); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2340:10: this_STRING_4= RULE_STRING
                    {
                    this_STRING_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemeTextLiterals4688); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2348:10: this_ANY_OTHER_5= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_5=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiterals4714); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_5);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_5(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeTextLiterals


    // $ANTLR start entryRuleSchemeNumber
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2363:1: entryRuleSchemeNumber returns [EObject current=null] : iv_ruleSchemeNumber= ruleSchemeNumber EOF ;
    public final EObject entryRuleSchemeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2367:2: (iv_ruleSchemeNumber= ruleSchemeNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2368:2: iv_ruleSchemeNumber= ruleSchemeNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber4764);
            iv_ruleSchemeNumber=ruleSchemeNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber4774); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeNumber


    // $ANTLR start ruleSchemeNumber
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2378:1: ruleSchemeNumber returns [EObject current=null] : ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSchemeNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_radix_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2384:6: ( ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2385:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2385:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2385:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2385:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_2) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2386:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2386:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2387:3: lv_radix_0_0= ruleSchemeNumberRadix
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber4824);
                    lv_radix_0_0=ruleSchemeNumberRadix();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeNumberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"radix",
                      	        		lv_radix_0_0, 
                      	        		"SchemeNumberRadix", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2409:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2410:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2410:1: (lv_value_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2411:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeNumber4842); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSchemeNumberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_1_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeNumber


    // $ANTLR start entryRuleSchemeNumberRadix
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2444:1: entryRuleSchemeNumberRadix returns [String current=null] : iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF ;
    public final String entryRuleSchemeNumberRadix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeNumberRadix = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2448:1: (iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2449:2: iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRadixRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix4893);
            iv_ruleSchemeNumberRadix=ruleSchemeNumberRadix();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumberRadix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix4904); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeNumberRadix


    // $ANTLR start ruleSchemeNumberRadix
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2459:1: ruleSchemeNumberRadix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeNumberRadix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2465:6: ( (kw= KEYWORD_2 this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2466:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2466:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2467:2: kw= KEYWORD_2 this_ID_1= RULE_ID
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeNumberRadix4946); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0(), null); 
                  
            }
            this_ID_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeNumberRadix4961); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getSchemeNumberRadixAccess().getIDTerminalRuleCall_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeNumberRadix


    // $ANTLR start entryRuleSchemeMarkupCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2490:1: entryRuleSchemeMarkupCommand returns [EObject current=null] : iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF ;
    public final EObject entryRuleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeMarkupCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2494:2: (iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2495:2: iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeMarkupCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand5015);
            iv_ruleSchemeMarkupCommand=ruleSchemeMarkupCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeMarkupCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand5025); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeMarkupCommand


    // $ANTLR start ruleSchemeMarkupCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2505:1: ruleSchemeMarkupCommand returns [EObject current=null] : ( KEYWORD_19 ( (lv_command_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2511:6: ( ( KEYWORD_19 ( (lv_command_1_0= RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2512:1: ( KEYWORD_19 ( (lv_command_1_0= RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2512:1: ( KEYWORD_19 ( (lv_command_1_0= RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2513:2: KEYWORD_19 ( (lv_command_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleSchemeMarkupCommand5065); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2517:1: ( (lv_command_1_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2518:1: (lv_command_1_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2518:1: (lv_command_1_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2519:3: lv_command_1_0= RULE_ID
            {
            lv_command_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeMarkupCommand5082); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSchemeMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0(), "command"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSchemeMarkupCommandRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"command",
              	        		lv_command_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSchemeMarkupCommand


    // $ANTLR start entryRuleBOOL
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2552:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2553:1: (iv_ruleBOOL= ruleBOOL EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2554:2: iv_ruleBOOL= ruleBOOL EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBOOLRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL5127);
            iv_ruleBOOL=ruleBOOL();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBOOL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL5138); if (failed) return current;

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
    // $ANTLR end entryRuleBOOL


    // $ANTLR start ruleBOOL
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2561:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2566:6: ( (kw= KEYWORD_2 this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2567:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2567:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2568:2: kw= KEYWORD_2 this_ID_1= RULE_ID
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBOOL5176); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getBOOLAccess().getNumberSignKeyword_0(), null); 
                  
            }
            this_ID_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBOOL5191); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getBOOLAccess().getIDTerminalRuleCall_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBOOL

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:140:2: ( ruleAssignment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:140:2: ruleAssignment
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred2223);
        ruleAssignment();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:188:2: ( rulePropertyAssignment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:188:2: rulePropertyAssignment
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred3347);
        rulePropertyAssignment();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:3: ( ( ( KEYWORD_4 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:3: ( ( KEYWORD_4 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:3: ( ( KEYWORD_4 ) )?
        int alt29=2;
        int LA29_0 = input.LA(1);

        if ( (LA29_0==KEYWORD_4) ) {
            alt29=1;
        }
        switch (alt29) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1715:1: ( KEYWORD_4 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1715:1: ( KEYWORD_4 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1716:3: KEYWORD_4
                {
                match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_synpred363480); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1737:6: ( ( ( KEYWORD_15 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1737:6: ( ( KEYWORD_15 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1737:6: ( ( KEYWORD_15 ) )?
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0==KEYWORD_15) ) {
            alt30=1;
        }
        switch (alt30) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1738:1: ( KEYWORD_15 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1738:1: ( KEYWORD_15 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1739:3: KEYWORD_15
                {
                match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_synpred383519); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1760:6: ( ( ( KEYWORD_8 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1760:6: ( ( KEYWORD_8 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1760:6: ( ( KEYWORD_8 ) )?
        int alt31=2;
        int LA31_0 = input.LA(1);

        if ( (LA31_0==KEYWORD_8) ) {
            alt31=1;
        }
        switch (alt31) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1761:1: ( KEYWORD_8 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1761:1: ( KEYWORD_8 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1762:3: KEYWORD_8
                {
                match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred403558); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1853:2: ( ruleSchemeBoolean )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1853:2: ruleSchemeBoolean
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred413727);
        ruleSchemeBoolean();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1918:2: ( ruleSchemeNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1918:2: ruleSchemeNumber
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred463877);
        ruleSchemeNumber();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred46

    public final boolean synpred46() {
        backtracking++;
        int start = input.mark();
        try {
            synpred46_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred40() {
        backtracking++;
        int start = input.mark();
        try {
            synpred40_fragment(); // can never throw exception
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
    public final boolean synpred41() {
        backtracking++;
        int start = input.mark();
        try {
            synpred41_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_ruleLilyPond128 = new BitSet(new long[]{0x0000020FD42BFFB2L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_entryRuleToplevelExpression163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToplevelExpression173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleToplevelExpression223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_ruleToplevelExpression253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_ruleExpression347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_ruleExpression377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_entryRuleCommonExpression411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonExpression421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommonExpression471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCommonExpression501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleCommonExpression531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleCommonExpression561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleCommonExpression591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment679 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment699 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleAssignment718 = new BitSet(new long[]{0x0000020FD42BFFB0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssignment784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyAssignment828 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyAssignment848 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rulePropertyAssignment867 = new BitSet(new long[]{0x0000020FD42BFFB0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyAssignment888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlock983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_ruleBlock1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSimpleBlock1105 = new BitSet(new long[]{0x0000020FD43BFFB0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleBlock1126 = new BitSet(new long[]{0x0000020FD43BFFB0L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleSimpleBlock1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleSimultaneousBlock1231 = new BitSet(new long[]{0x0000020FDC2BFFB0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimultaneousBlock1252 = new BitSet(new long[]{0x0000020FDC2BFFB0L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleSimultaneousBlock1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_ruleCommand1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleCommand1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand1423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSpecialCommand1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSpecialCommand1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleSpecialCommand1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInclude1631 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleVersion1755 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkup1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupKeyword_in_ruleMarkup1881 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_ruleMarkup1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupKeyword_in_entryRuleMarkupKeyword1944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupKeyword1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleMarkupKeyword1997 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleMarkupKeyword2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_entryRuleMarkupBlock2056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBlock2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleMarkupBlock2114 = new BitSet(new long[]{0x0000020E103BFFB0L});
    public static final BitSet FOLLOW_ruleMarkupExpression_in_ruleMarkupBlock2135 = new BitSet(new long[]{0x0000020E103BFFB0L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleMarkupBlock2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupExpression_in_entryRuleMarkupExpression2182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupExpression2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupCommand_in_ruleMarkupExpression2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_ruleMarkupExpression2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleMarkupExpression2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleMarkupExpression2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleMarkupExpression2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupCommand_in_entryRuleMarkupCommand2402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupCommand2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleMarkupCommand2452 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMarkupCommand2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleReference2569 = new BitSet(new long[]{0x000000080022D710L});
    public static final BitSet FOLLOW_ruleReferenceName_in_ruleReference2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceName_in_entryRuleReferenceName2636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceName2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceName2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleReferenceName2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleReferenceName2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleReferenceName2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter2803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSpecialCharacter2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleSpecialCharacter2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleSpecialCharacter2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleSpecialCharacter2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleSpecialCharacter2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleSpecialCharacter2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleSpecialCharacter2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText3005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_ruleText3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleText3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleText3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleText3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleText3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleScheme3365 = new BitSet(new long[]{0x0000020E11E6FDF0L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression3425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSchemeExpression3480 = new BitSet(new long[]{0x0000020E11E2F530L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleSchemeExpression3519 = new BitSet(new long[]{0x0000020E11E2F530L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSchemeExpression3558 = new BitSet(new long[]{0x0000020E11E2F530L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSchemeExpression3597 = new BitSet(new long[]{0x0000020E11E2F530L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue3667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_ruleSchemeValue3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean3941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleSchemeBoolean3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList4030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeList4096 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSchemeList4121 = new BitSet(new long[]{0x0000020E11E6FFF0L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList4142 = new BitSet(new long[]{0x0000020E11E6FFF0L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleSchemeList4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock4189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleSchemeBlock4235 = new BitSet(new long[]{0x0000020FD42BFFB0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSchemeBlock4256 = new BitSet(new long[]{0x0000020FD62BFFB0L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleSchemeBlock4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter4303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleSchemeCharacter4349 = new BitSet(new long[]{0x000002080022D410L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeCharacter4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText4450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_ruleSchemeText4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals4540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiterals4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleSchemeTextLiterals4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleSchemeTextLiterals4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextLiterals4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeTextLiterals4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemeTextLiterals4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiterals4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber4764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber4824 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeNumber4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix4893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeNumberRadix4946 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeNumberRadix4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand5015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleSchemeMarkupCommand5065 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeMarkupCommand5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL5127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBOOL5176 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBOOL5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_synpred363480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_synpred383519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred403558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred413727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred463877 = new BitSet(new long[]{0x0000000000000002L});

}