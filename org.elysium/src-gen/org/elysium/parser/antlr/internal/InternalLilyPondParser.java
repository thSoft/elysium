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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_88", "KEYWORD_86", "KEYWORD_87", "KEYWORD_84", "KEYWORD_85", "KEYWORD_81", "KEYWORD_82", "KEYWORD_83", "KEYWORD_79", "KEYWORD_80", "KEYWORD_74", "KEYWORD_75", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "RULE_STRING", "RULE_INT", "RULE_ALPHA", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_SCHEME_SL_COMMENT=98;
    public static final int RULE_ANY_OTHER=100;
    public static final int KEYWORD_56=42;
    public static final int KEYWORD_55=41;
    public static final int KEYWORD_54=40;
    public static final int KEYWORD_53=39;
    public static final int KEYWORD_52=38;
    public static final int KEYWORD_51=37;
    public static final int KEYWORD_50=36;
    public static final int EOF=-1;
    public static final int KEYWORD_59=27;
    public static final int KEYWORD_58=44;
    public static final int KEYWORD_57=43;
    public static final int KEYWORD_65=33;
    public static final int RULE_SCHEME_ML_COMMENT=99;
    public static final int KEYWORD_64=32;
    public static final int KEYWORD_67=20;
    public static final int KEYWORD_66=19;
    public static final int KEYWORD_61=29;
    public static final int KEYWORD_60=28;
    public static final int KEYWORD_63=31;
    public static final int KEYWORD_62=30;
    public static final int KEYWORD_69=22;
    public static final int KEYWORD_68=21;
    public static final int KEYWORD_30=64;
    public static final int KEYWORD_34=55;
    public static final int KEYWORD_33=54;
    public static final int KEYWORD_32=53;
    public static final int KEYWORD_31=52;
    public static final int KEYWORD_38=59;
    public static final int KEYWORD_37=58;
    public static final int KEYWORD_36=57;
    public static final int KEYWORD_35=56;
    public static final int RULE_ML_COMMENT=97;
    public static final int KEYWORD_39=60;
    public static final int RULE_STRING=92;
    public static final int KEYWORD_41=45;
    public static final int KEYWORD_40=61;
    public static final int KEYWORD_43=47;
    public static final int KEYWORD_42=46;
    public static final int KEYWORD_45=49;
    public static final int KEYWORD_44=48;
    public static final int KEYWORD_47=51;
    public static final int KEYWORD_46=50;
    public static final int KEYWORD_49=35;
    public static final int KEYWORD_48=34;
    public static final int KEYWORD_19=90;
    public static final int KEYWORD_17=88;
    public static final int KEYWORD_18=89;
    public static final int KEYWORD_15=86;
    public static final int KEYWORD_16=87;
    public static final int KEYWORD_13=84;
    public static final int KEYWORD_14=85;
    public static final int KEYWORD_11=82;
    public static final int KEYWORD_12=83;
    public static final int KEYWORD_10=81;
    public static final int KEYWORD_6=77;
    public static final int KEYWORD_7=78;
    public static final int KEYWORD_8=79;
    public static final int KEYWORD_9=80;
    public static final int KEYWORD_28=62;
    public static final int KEYWORD_29=63;
    public static final int RULE_INT=93;
    public static final int KEYWORD_24=68;
    public static final int KEYWORD_25=69;
    public static final int KEYWORD_26=70;
    public static final int KEYWORD_27=71;
    public static final int KEYWORD_20=91;
    public static final int KEYWORD_21=65;
    public static final int KEYWORD_22=66;
    public static final int KEYWORD_23=67;
    public static final int KEYWORD_79=12;
    public static final int KEYWORD_71=24;
    public static final int KEYWORD_72=25;
    public static final int KEYWORD_73=26;
    public static final int KEYWORD_74=14;
    public static final int KEYWORD_75=15;
    public static final int KEYWORD_76=16;
    public static final int KEYWORD_77=17;
    public static final int KEYWORD_78=18;
    public static final int KEYWORD_1=72;
    public static final int KEYWORD_5=76;
    public static final int KEYWORD_4=75;
    public static final int RULE_ALPHA=94;
    public static final int KEYWORD_70=23;
    public static final int KEYWORD_3=74;
    public static final int KEYWORD_2=73;
    public static final int Tokens=101;
    public static final int RULE_SL_COMMENT=96;
    public static final int KEYWORD_84=7;
    public static final int KEYWORD_85=8;
    public static final int KEYWORD_82=10;
    public static final int KEYWORD_83=11;
    public static final int KEYWORD_88=4;
    public static final int KEYWORD_86=5;
    public static final int KEYWORD_87=6;
    public static final int KEYWORD_81=9;
    public static final int KEYWORD_80=13;
    public static final int RULE_WS=95;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[216+1];
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

                if ( ((LA1_0>=KEYWORD_88 && LA1_0<=KEYWORD_30)||LA1_0==KEYWORD_25||(LA1_0>=KEYWORD_27 && LA1_0<=KEYWORD_2)||(LA1_0>=KEYWORD_4 && LA1_0<=KEYWORD_16)||LA1_0==KEYWORD_18||(LA1_0>=KEYWORD_20 && LA1_0<=RULE_ALPHA)||LA1_0==RULE_ANY_OTHER) ) {
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
            case RULE_ALPHA:
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
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_25:
            case KEYWORD_27:
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
            case KEYWORD_15:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_20:
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
            case RULE_ALPHA:
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
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_25:
            case KEYWORD_27:
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
            case KEYWORD_15:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_20:
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
            case KEYWORD_15:
                {
                alt4=1;
                }
                break;
            case KEYWORD_25:
            case KEYWORD_18:
                {
                alt4=2;
                }
                break;
            case KEYWORD_2:
                {
                alt4=3;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_27:
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
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
            case RULE_STRING:
            case RULE_ALPHA:
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:316:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_2=null;
        AntlrDatatypeRuleToken lv_name_0_1 = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:321:6: ( ( ( ( (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:1: ( ( ( (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:1: ( ( ( (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:2: ( ( (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:2: ( ( (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:323:1: ( (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:323:1: ( (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:324:1: (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:324:1: (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ALPHA) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("324:1: (lv_name_0_1= ruleIdentifier | lv_name_0_2= RULE_STRING )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:325:3: lv_name_0_1= ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getNameIdentifierParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleAssignment683);
                    lv_name_0_1=ruleIdentifier();
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
                      	       			"name",
                      	        		lv_name_0_1, 
                      	        		"Identifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:346:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment698); if (failed) return current;
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

            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleAssignment717); if (failed) return current;
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
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment738);
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
            pushFollow(FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment773);
            iv_rulePropertyAssignment=rulePropertyAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAssignment783); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:416:1: rulePropertyAssignment returns [EObject current=null] : ( ( ( (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_2=null;
        AntlrDatatypeRuleToken lv_id_0_1 = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:421:6: ( ( ( ( (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( ( ( (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( ( ( (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:2: ( ( (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:2: ( ( (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:1: ( (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:1: ( (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:424:1: (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:424:1: (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ALPHA) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("424:1: (lv_id_0_1= ruleIdentifier | lv_id_0_2= RULE_STRING )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:425:3: lv_id_0_1= ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPropertyAssignmentAccess().getIdIdentifierParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rulePropertyAssignment831);
                    lv_id_0_1=ruleIdentifier();
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
                      	       			"id",
                      	        		lv_id_0_1, 
                      	        		"Identifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:446:8: lv_id_0_2= RULE_STRING
                    {
                    lv_id_0_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyAssignment846); if (failed) return current;
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

            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rulePropertyAssignment865); if (failed) return current;
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
            pushFollow(FOLLOW_ruleExpression_in_rulePropertyAssignment886);
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
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock921);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock931); if (failed) return current;

            }

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

            if ( (LA7_0==KEYWORD_18) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_25) ) {
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
                    pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlock981);
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
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_ruleBlock1011);
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
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1045);
            iv_ruleSimpleBlock=ruleSimpleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock1055); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:564:1: ruleSimpleBlock returns [EObject current=null] : ( () KEYWORD_18 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_19 ) ;
    public final EObject ruleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:569:6: ( ( () KEYWORD_18 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_19 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:1: ( () KEYWORD_18 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_19 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:1: ( () KEYWORD_18 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_19 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:2: () KEYWORD_18 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_19
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

            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleSimpleBlock1103); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:589:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=KEYWORD_88 && LA8_0<=KEYWORD_30)||LA8_0==KEYWORD_25||(LA8_0>=KEYWORD_27 && LA8_0<=KEYWORD_2)||(LA8_0>=KEYWORD_4 && LA8_0<=KEYWORD_16)||LA8_0==KEYWORD_18||(LA8_0>=KEYWORD_20 && LA8_0<=RULE_ALPHA)||LA8_0==RULE_ANY_OTHER) ) {
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
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimpleBlock1124);
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

            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleSimpleBlock1136); if (failed) return current;
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
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1171);
            iv_ruleSimultaneousBlock=ruleSimultaneousBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimultaneousBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock1181); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:635:1: ruleSimultaneousBlock returns [EObject current=null] : ( () KEYWORD_25 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_26 ) ;
    public final EObject ruleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:640:6: ( ( () KEYWORD_25 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_26 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:1: ( () KEYWORD_25 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_26 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:1: ( () KEYWORD_25 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_26 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:2: () KEYWORD_25 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_26
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

            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleSimultaneousBlock1229); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:660:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=KEYWORD_88 && LA9_0<=KEYWORD_30)||LA9_0==KEYWORD_25||(LA9_0>=KEYWORD_27 && LA9_0<=KEYWORD_2)||(LA9_0>=KEYWORD_4 && LA9_0<=KEYWORD_16)||LA9_0==KEYWORD_18||(LA9_0>=KEYWORD_20 && LA9_0<=RULE_ALPHA)||LA9_0==RULE_ANY_OTHER) ) {
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
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimultaneousBlock1250);
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

            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleSimultaneousBlock1262); if (failed) return current;
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
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1297);
            iv_ruleCommand=ruleCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1307); if (failed) return current;

            }

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

            if ( (LA10_0==KEYWORD_15) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=KEYWORD_88 && LA10_1<=KEYWORD_30)||LA10_1==KEYWORD_1||(LA10_1>=KEYWORD_5 && LA10_1<=KEYWORD_7)||LA10_1==KEYWORD_11||(LA10_1>=KEYWORD_13 && LA10_1<=KEYWORD_14)||LA10_1==KEYWORD_16||LA10_1==KEYWORD_20) ) {
                    alt10=1;
                }
                else if ( (LA10_1==RULE_ALPHA) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("712:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference )", 10, 1, input);

                    throw nvae;
                }
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
                    pushFollow(FOLLOW_ruleSpecialCommand_in_ruleCommand1357);
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
                    pushFollow(FOLLOW_ruleReference_in_ruleCommand1387);
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
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand1421);
            iv_ruleSpecialCommand=ruleSpecialCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand1431); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:754:1: ruleSpecialCommand returns [EObject current=null] : (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_Context_4= ruleContext | this_Other_5= ruleOther ) ;
    public final EObject ruleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Include_0 = null;

        EObject this_Version_1 = null;

        EObject this_Markup_2 = null;

        EObject this_MarkupLines_3 = null;

        EObject this_Context_4 = null;

        EObject this_Other_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:759:6: ( (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_Context_4= ruleContext | this_Other_5= ruleOther ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:760:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_Context_4= ruleContext | this_Other_5= ruleOther )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:760:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_Context_4= ruleContext | this_Other_5= ruleOther )
            int alt11=6;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_15) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_65:
                    {
                    alt11=2;
                    }
                    break;
                case KEYWORD_83:
                    {
                    alt11=4;
                    }
                    break;
                case KEYWORD_63:
                    {
                    alt11=1;
                    }
                    break;
                case KEYWORD_60:
                    {
                    alt11=5;
                    }
                    break;
                case KEYWORD_54:
                    {
                    alt11=3;
                    }
                    break;
                case KEYWORD_88:
                case KEYWORD_86:
                case KEYWORD_87:
                case KEYWORD_84:
                case KEYWORD_85:
                case KEYWORD_81:
                case KEYWORD_82:
                case KEYWORD_79:
                case KEYWORD_80:
                case KEYWORD_74:
                case KEYWORD_75:
                case KEYWORD_76:
                case KEYWORD_77:
                case KEYWORD_78:
                case KEYWORD_66:
                case KEYWORD_67:
                case KEYWORD_68:
                case KEYWORD_69:
                case KEYWORD_70:
                case KEYWORD_71:
                case KEYWORD_72:
                case KEYWORD_73:
                case KEYWORD_59:
                case KEYWORD_61:
                case KEYWORD_62:
                case KEYWORD_64:
                case KEYWORD_48:
                case KEYWORD_49:
                case KEYWORD_50:
                case KEYWORD_51:
                case KEYWORD_52:
                case KEYWORD_53:
                case KEYWORD_55:
                case KEYWORD_56:
                case KEYWORD_57:
                case KEYWORD_58:
                case KEYWORD_41:
                case KEYWORD_42:
                case KEYWORD_43:
                case KEYWORD_44:
                case KEYWORD_45:
                case KEYWORD_46:
                case KEYWORD_47:
                case KEYWORD_31:
                case KEYWORD_32:
                case KEYWORD_33:
                case KEYWORD_34:
                case KEYWORD_35:
                case KEYWORD_36:
                case KEYWORD_37:
                case KEYWORD_38:
                case KEYWORD_39:
                case KEYWORD_40:
                case KEYWORD_28:
                case KEYWORD_29:
                case KEYWORD_30:
                case KEYWORD_1:
                case KEYWORD_5:
                case KEYWORD_6:
                case KEYWORD_7:
                case KEYWORD_11:
                case KEYWORD_13:
                case KEYWORD_14:
                case KEYWORD_16:
                case KEYWORD_20:
                    {
                    alt11=6;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("760:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_Context_4= ruleContext | this_Other_5= ruleOther )", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("760:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_Context_4= ruleContext | this_Other_5= ruleOther )", 11, 0, input);

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
                    pushFollow(FOLLOW_ruleInclude_in_ruleSpecialCommand1481);
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
                    pushFollow(FOLLOW_ruleVersion_in_ruleSpecialCommand1511);
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
                    pushFollow(FOLLOW_ruleMarkup_in_ruleSpecialCommand1541);
                    this_Markup_2=ruleMarkup();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Markup_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:800:2: this_MarkupLines_3= ruleMarkupLines
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_ruleSpecialCommand1571);
                    this_MarkupLines_3=ruleMarkupLines();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MarkupLines_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:813:2: this_Context_4= ruleContext
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getContextParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleContext_in_ruleSpecialCommand1601);
                    this_Context_4=ruleContext();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Context_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:826:2: this_Other_5= ruleOther
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getOtherParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOther_in_ruleSpecialCommand1631);
                    this_Other_5=ruleOther();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Other_5;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:845:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:846:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:847:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1665);
            iv_ruleInclude=ruleInclude();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1675); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:854:1: ruleInclude returns [EObject current=null] : ( KEYWORD_15 KEYWORD_63 ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:859:6: ( ( KEYWORD_15 KEYWORD_63 ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:860:1: ( KEYWORD_15 KEYWORD_63 ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:860:1: ( KEYWORD_15 KEYWORD_63 ( (lv_importURI_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:861:2: KEYWORD_15 KEYWORD_63 ( (lv_importURI_2_0= RULE_STRING ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleInclude1711); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleInclude1722); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeAccess().getIncludeKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:870:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:871:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:871:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:872:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude1739); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0(), "importURI"); 
              		
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
              	        		lv_importURI_2_0, 
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:902:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:903:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:904:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVersionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1779);
            iv_ruleVersion=ruleVersion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion1789); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:911:1: ruleVersion returns [EObject current=null] : ( KEYWORD_15 KEYWORD_65 ( (lv_version_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:916:6: ( ( KEYWORD_15 KEYWORD_65 ( (lv_version_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:917:1: ( KEYWORD_15 KEYWORD_65 ( (lv_version_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:917:1: ( KEYWORD_15 KEYWORD_65 ( (lv_version_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:918:2: KEYWORD_15 KEYWORD_65 ( (lv_version_2_0= RULE_STRING ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleVersion1825); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVersionAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleVersion1836); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVersionAccess().getVersionKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:927:1: ( (lv_version_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:928:1: (lv_version_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:928:1: (lv_version_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:929:3: lv_version_2_0= RULE_STRING
            {
            lv_version_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion1853); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_2_0(), "version"); 
              		
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
              	        		lv_version_2_0, 
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:959:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:960:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:961:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkup_in_entryRuleMarkup1893);
            iv_ruleMarkup=ruleMarkup();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkup1903); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:968:1: ruleMarkup returns [EObject current=null] : ( KEYWORD_15 KEYWORD_54 ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_body_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:973:6: ( ( KEYWORD_15 KEYWORD_54 ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:974:1: ( KEYWORD_15 KEYWORD_54 ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:974:1: ( KEYWORD_15 KEYWORD_54 ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:975:2: KEYWORD_15 KEYWORD_54 ( (lv_body_2_0= ruleMarkupBody ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleMarkup1939); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleMarkup1950); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupAccess().getMarkupKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:984:1: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:985:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:985:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:986:3: lv_body_2_0= ruleMarkupBody
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkup1971);
            lv_body_2_0=ruleMarkupBody();
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
              	       			"body",
              	        		lv_body_2_0, 
              	        		"MarkupBody", 
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


    // $ANTLR start entryRuleMarkupLines
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1016:1: entryRuleMarkupLines returns [EObject current=null] : iv_ruleMarkupLines= ruleMarkupLines EOF ;
    public final EObject entryRuleMarkupLines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupLines = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1017:2: (iv_ruleMarkupLines= ruleMarkupLines EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1018:2: iv_ruleMarkupLines= ruleMarkupLines EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupLinesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines2006);
            iv_ruleMarkupLines=ruleMarkupLines();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupLines; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupLines2016); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMarkupLines


    // $ANTLR start ruleMarkupLines
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1025:1: ruleMarkupLines returns [EObject current=null] : ( KEYWORD_15 KEYWORD_83 ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkupLines() throws RecognitionException {
        EObject current = null;

        EObject lv_body_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1030:6: ( ( KEYWORD_15 KEYWORD_83 ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1031:1: ( KEYWORD_15 KEYWORD_83 ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1031:1: ( KEYWORD_15 KEYWORD_83 ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1032:2: KEYWORD_15 KEYWORD_83 ( (lv_body_2_0= ruleMarkupBody ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleMarkupLines2052); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleMarkupLines2063); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupLinesAccess().getMarkuplinesKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1041:1: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1042:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1042:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1043:3: lv_body_2_0= ruleMarkupBody
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkupLines2084);
            lv_body_2_0=ruleMarkupBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMarkupLinesRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"body",
              	        		lv_body_2_0, 
              	        		"MarkupBody", 
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
    // $ANTLR end ruleMarkupLines


    // $ANTLR start entryRuleMarkupBody
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1073:1: entryRuleMarkupBody returns [EObject current=null] : iv_ruleMarkupBody= ruleMarkupBody EOF ;
    public final EObject entryRuleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupBody = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1074:2: (iv_ruleMarkupBody= ruleMarkupBody EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1075:2: iv_ruleMarkupBody= ruleMarkupBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupBodyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody2119);
            iv_ruleMarkupBody=ruleMarkupBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBody2129); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMarkupBody


    // $ANTLR start ruleMarkupBody
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1082:1: ruleMarkupBody returns [EObject current=null] : ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) ;
    public final EObject ruleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject lv_command_1_1 = null;

        EObject lv_command_1_2 = null;

        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1087:6: ( ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1088:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1088:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1088:2: () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1088:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1089:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getMarkupBodyAccess().getMarkupBodyAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getMarkupBodyAccess().getMarkupBodyAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1102:2: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==KEYWORD_15) ) {
                    int LA13_5 = input.LA(2);

                    if ( (synpred20()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==KEYWORD_2) ) {
                    int LA13_7 = input.LA(2);

                    if ( (synpred20()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1103:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1103:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==KEYWORD_2) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==KEYWORD_15) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1104:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1105:3: lv_command_1_1= ruleScheme
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandSchemeParserRuleCall_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleScheme_in_ruleMarkupBody2189);
            	            lv_command_1_1=ruleScheme();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getMarkupBodyRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"command",
            	              	        		lv_command_1_1, 
            	              	        		"Scheme", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1126:8: lv_command_1_2= ruleUnparsedCommand
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody2208);
            	            lv_command_1_2=ruleUnparsedCommand();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getMarkupBodyRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"command",
            	              	        		lv_command_1_2, 
            	              	        		"UnparsedCommand", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1150:3: ( (lv_block_2_0= ruleUnparsedBlock ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_18) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred21()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1151:1: (lv_block_2_0= ruleUnparsedBlock )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1151:1: (lv_block_2_0= ruleUnparsedBlock )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1152:3: lv_block_2_0= ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody2233);
                    lv_block_2_0=ruleUnparsedBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMarkupBodyRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_2_0, 
                      	        		"UnparsedBlock", 
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
    // $ANTLR end ruleMarkupBody


    // $ANTLR start entryRuleContext
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1182:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1183:2: (iv_ruleContext= ruleContext EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1184:2: iv_ruleContext= ruleContext EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext2269);
            iv_ruleContext=ruleContext();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext2279); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContext


    // $ANTLR start ruleContext
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1191:1: ruleContext returns [EObject current=null] : ( () KEYWORD_15 KEYWORD_60 ( (lv_block_3_0= ruleUnparsedBlock ) )? ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        EObject lv_block_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1196:6: ( ( () KEYWORD_15 KEYWORD_60 ( (lv_block_3_0= ruleUnparsedBlock ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1197:1: ( () KEYWORD_15 KEYWORD_60 ( (lv_block_3_0= ruleUnparsedBlock ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1197:1: ( () KEYWORD_15 KEYWORD_60 ( (lv_block_3_0= ruleUnparsedBlock ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1197:2: () KEYWORD_15 KEYWORD_60 ( (lv_block_3_0= ruleUnparsedBlock ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1197:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1198:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getContextAccess().getContextAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getContextAccess().getContextAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleContext2327); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextAccess().getReverseSolidusKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleContext2338); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextAccess().getContextKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1221:1: ( (lv_block_3_0= ruleUnparsedBlock ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_18) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred22()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1222:1: (lv_block_3_0= ruleUnparsedBlock )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1222:1: (lv_block_3_0= ruleUnparsedBlock )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1223:3: lv_block_3_0= ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getContextAccess().getBlockUnparsedBlockParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContext2359);
                    lv_block_3_0=ruleUnparsedBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getContextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_3_0, 
                      	        		"UnparsedBlock", 
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
    // $ANTLR end ruleContext


    // $ANTLR start entryRuleOther
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1253:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1254:2: (iv_ruleOther= ruleOther EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1255:2: iv_ruleOther= ruleOther EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOtherRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOther_in_entryRuleOther2395);
            iv_ruleOther=ruleOther();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOther; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOther2405); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOther


    // $ANTLR start ruleOther
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1262:1: ruleOther returns [EObject current=null] : ( KEYWORD_15 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        AntlrDatatypeRuleToken lv_keyword_1_1 = null;

        AntlrDatatypeRuleToken lv_keyword_1_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1267:6: ( ( KEYWORD_15 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1268:1: ( KEYWORD_15 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1268:1: ( KEYWORD_15 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1269:2: KEYWORD_15 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleOther2441); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOtherAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1273:1: ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1274:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1274:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1275:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1275:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )
            int alt16=4;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
                {
                alt16=1;
                }
                break;
            case KEYWORD_5:
                {
                alt16=2;
                }
                break;
            case KEYWORD_6:
                {
                alt16=3;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_64:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
                {
                alt16=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1275:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1276:3: lv_keyword_1_1= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOtherAccess().getKeywordSpecialCharacterParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleOther2464);
                    lv_keyword_1_1=ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOtherRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"keyword",
                      	        		lv_keyword_1_1, 
                      	        		"SpecialCharacter", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1297:8: lv_keyword_1_2= KEYWORD_5
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleOther2481); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOtherAccess().getKeywordLeftParenthesisKeyword_1_0_1(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOtherRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_2, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1316:8: lv_keyword_1_3= KEYWORD_6
                    {
                    lv_keyword_1_3=(Token)input.LT(1);
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleOther2511); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOtherAccess().getKeywordRightParenthesisKeyword_1_0_2(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOtherRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_3, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1335:8: lv_keyword_1_4= ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOtherAccess().getKeywordOtherNameParserRuleCall_1_0_3(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleOther2543);
                    lv_keyword_1_4=ruleOtherName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOtherRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"keyword",
                      	        		lv_keyword_1_4, 
                      	        		"OtherName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
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
    // $ANTLR end ruleOther


    // $ANTLR start entryRuleOtherName
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1367:1: entryRuleOtherName returns [String current=null] : iv_ruleOtherName= ruleOtherName EOF ;
    public final String entryRuleOtherName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOtherName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1368:1: (iv_ruleOtherName= ruleOtherName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1369:2: iv_ruleOtherName= ruleOtherName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOtherNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOtherName_in_entryRuleOtherName2582);
            iv_ruleOtherName=ruleOtherName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOtherName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherName2593); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOtherName


    // $ANTLR start ruleOtherName
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1376:1: ruleOtherName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_59 | kw= KEYWORD_74 | kw= KEYWORD_41 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_66 | kw= KEYWORD_48 | kw= KEYWORD_75 | kw= KEYWORD_49 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_84 | kw= KEYWORD_50 | kw= KEYWORD_82 | kw= KEYWORD_68 | kw= KEYWORD_42 | kw= KEYWORD_79 | kw= KEYWORD_62 | kw= KEYWORD_88 | kw= KEYWORD_51 | kw= KEYWORD_28 | kw= KEYWORD_52 | kw= KEYWORD_76 | kw= KEYWORD_53 | kw= KEYWORD_69 | kw= KEYWORD_77 | kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 | kw= KEYWORD_29 | kw= KEYWORD_70 | kw= KEYWORD_71 | kw= KEYWORD_55 | kw= KEYWORD_35 | kw= KEYWORD_72 | kw= KEYWORD_43 | kw= KEYWORD_64 | kw= KEYWORD_73 | kw= KEYWORD_56 | kw= KEYWORD_57 | kw= KEYWORD_36 | kw= KEYWORD_58 | kw= KEYWORD_44 | kw= KEYWORD_80 | kw= KEYWORD_30 | kw= KEYWORD_85 | kw= KEYWORD_37 | kw= KEYWORD_86 | kw= KEYWORD_87 | kw= KEYWORD_45 | kw= KEYWORD_38 | kw= KEYWORD_46 | kw= KEYWORD_78 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_40 ) ;
    public final AntlrDatatypeRuleToken ruleOtherName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1381:6: ( (kw= KEYWORD_59 | kw= KEYWORD_74 | kw= KEYWORD_41 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_66 | kw= KEYWORD_48 | kw= KEYWORD_75 | kw= KEYWORD_49 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_84 | kw= KEYWORD_50 | kw= KEYWORD_82 | kw= KEYWORD_68 | kw= KEYWORD_42 | kw= KEYWORD_79 | kw= KEYWORD_62 | kw= KEYWORD_88 | kw= KEYWORD_51 | kw= KEYWORD_28 | kw= KEYWORD_52 | kw= KEYWORD_76 | kw= KEYWORD_53 | kw= KEYWORD_69 | kw= KEYWORD_77 | kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 | kw= KEYWORD_29 | kw= KEYWORD_70 | kw= KEYWORD_71 | kw= KEYWORD_55 | kw= KEYWORD_35 | kw= KEYWORD_72 | kw= KEYWORD_43 | kw= KEYWORD_64 | kw= KEYWORD_73 | kw= KEYWORD_56 | kw= KEYWORD_57 | kw= KEYWORD_36 | kw= KEYWORD_58 | kw= KEYWORD_44 | kw= KEYWORD_80 | kw= KEYWORD_30 | kw= KEYWORD_85 | kw= KEYWORD_37 | kw= KEYWORD_86 | kw= KEYWORD_87 | kw= KEYWORD_45 | kw= KEYWORD_38 | kw= KEYWORD_46 | kw= KEYWORD_78 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_40 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1382:1: (kw= KEYWORD_59 | kw= KEYWORD_74 | kw= KEYWORD_41 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_66 | kw= KEYWORD_48 | kw= KEYWORD_75 | kw= KEYWORD_49 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_84 | kw= KEYWORD_50 | kw= KEYWORD_82 | kw= KEYWORD_68 | kw= KEYWORD_42 | kw= KEYWORD_79 | kw= KEYWORD_62 | kw= KEYWORD_88 | kw= KEYWORD_51 | kw= KEYWORD_28 | kw= KEYWORD_52 | kw= KEYWORD_76 | kw= KEYWORD_53 | kw= KEYWORD_69 | kw= KEYWORD_77 | kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 | kw= KEYWORD_29 | kw= KEYWORD_70 | kw= KEYWORD_71 | kw= KEYWORD_55 | kw= KEYWORD_35 | kw= KEYWORD_72 | kw= KEYWORD_43 | kw= KEYWORD_64 | kw= KEYWORD_73 | kw= KEYWORD_56 | kw= KEYWORD_57 | kw= KEYWORD_36 | kw= KEYWORD_58 | kw= KEYWORD_44 | kw= KEYWORD_80 | kw= KEYWORD_30 | kw= KEYWORD_85 | kw= KEYWORD_37 | kw= KEYWORD_86 | kw= KEYWORD_87 | kw= KEYWORD_45 | kw= KEYWORD_38 | kw= KEYWORD_46 | kw= KEYWORD_78 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_40 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1382:1: (kw= KEYWORD_59 | kw= KEYWORD_74 | kw= KEYWORD_41 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_66 | kw= KEYWORD_48 | kw= KEYWORD_75 | kw= KEYWORD_49 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_84 | kw= KEYWORD_50 | kw= KEYWORD_82 | kw= KEYWORD_68 | kw= KEYWORD_42 | kw= KEYWORD_79 | kw= KEYWORD_62 | kw= KEYWORD_88 | kw= KEYWORD_51 | kw= KEYWORD_28 | kw= KEYWORD_52 | kw= KEYWORD_76 | kw= KEYWORD_53 | kw= KEYWORD_69 | kw= KEYWORD_77 | kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 | kw= KEYWORD_29 | kw= KEYWORD_70 | kw= KEYWORD_71 | kw= KEYWORD_55 | kw= KEYWORD_35 | kw= KEYWORD_72 | kw= KEYWORD_43 | kw= KEYWORD_64 | kw= KEYWORD_73 | kw= KEYWORD_56 | kw= KEYWORD_57 | kw= KEYWORD_36 | kw= KEYWORD_58 | kw= KEYWORD_44 | kw= KEYWORD_80 | kw= KEYWORD_30 | kw= KEYWORD_85 | kw= KEYWORD_37 | kw= KEYWORD_86 | kw= KEYWORD_87 | kw= KEYWORD_45 | kw= KEYWORD_38 | kw= KEYWORD_46 | kw= KEYWORD_78 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_40 )
            int alt17=56;
            switch ( input.LA(1) ) {
            case KEYWORD_59:
                {
                alt17=1;
                }
                break;
            case KEYWORD_74:
                {
                alt17=2;
                }
                break;
            case KEYWORD_41:
                {
                alt17=3;
                }
                break;
            case KEYWORD_81:
                {
                alt17=4;
                }
                break;
            case KEYWORD_31:
                {
                alt17=5;
                }
                break;
            case KEYWORD_66:
                {
                alt17=6;
                }
                break;
            case KEYWORD_48:
                {
                alt17=7;
                }
                break;
            case KEYWORD_75:
                {
                alt17=8;
                }
                break;
            case KEYWORD_49:
                {
                alt17=9;
                }
                break;
            case KEYWORD_67:
                {
                alt17=10;
                }
                break;
            case KEYWORD_61:
                {
                alt17=11;
                }
                break;
            case KEYWORD_84:
                {
                alt17=12;
                }
                break;
            case KEYWORD_50:
                {
                alt17=13;
                }
                break;
            case KEYWORD_82:
                {
                alt17=14;
                }
                break;
            case KEYWORD_68:
                {
                alt17=15;
                }
                break;
            case KEYWORD_42:
                {
                alt17=16;
                }
                break;
            case KEYWORD_79:
                {
                alt17=17;
                }
                break;
            case KEYWORD_62:
                {
                alt17=18;
                }
                break;
            case KEYWORD_88:
                {
                alt17=19;
                }
                break;
            case KEYWORD_51:
                {
                alt17=20;
                }
                break;
            case KEYWORD_28:
                {
                alt17=21;
                }
                break;
            case KEYWORD_52:
                {
                alt17=22;
                }
                break;
            case KEYWORD_76:
                {
                alt17=23;
                }
                break;
            case KEYWORD_53:
                {
                alt17=24;
                }
                break;
            case KEYWORD_69:
                {
                alt17=25;
                }
                break;
            case KEYWORD_77:
                {
                alt17=26;
                }
                break;
            case KEYWORD_32:
                {
                alt17=27;
                }
                break;
            case KEYWORD_33:
                {
                alt17=28;
                }
                break;
            case KEYWORD_34:
                {
                alt17=29;
                }
                break;
            case KEYWORD_29:
                {
                alt17=30;
                }
                break;
            case KEYWORD_70:
                {
                alt17=31;
                }
                break;
            case KEYWORD_71:
                {
                alt17=32;
                }
                break;
            case KEYWORD_55:
                {
                alt17=33;
                }
                break;
            case KEYWORD_35:
                {
                alt17=34;
                }
                break;
            case KEYWORD_72:
                {
                alt17=35;
                }
                break;
            case KEYWORD_43:
                {
                alt17=36;
                }
                break;
            case KEYWORD_64:
                {
                alt17=37;
                }
                break;
            case KEYWORD_73:
                {
                alt17=38;
                }
                break;
            case KEYWORD_56:
                {
                alt17=39;
                }
                break;
            case KEYWORD_57:
                {
                alt17=40;
                }
                break;
            case KEYWORD_36:
                {
                alt17=41;
                }
                break;
            case KEYWORD_58:
                {
                alt17=42;
                }
                break;
            case KEYWORD_44:
                {
                alt17=43;
                }
                break;
            case KEYWORD_80:
                {
                alt17=44;
                }
                break;
            case KEYWORD_30:
                {
                alt17=45;
                }
                break;
            case KEYWORD_85:
                {
                alt17=46;
                }
                break;
            case KEYWORD_37:
                {
                alt17=47;
                }
                break;
            case KEYWORD_86:
                {
                alt17=48;
                }
                break;
            case KEYWORD_87:
                {
                alt17=49;
                }
                break;
            case KEYWORD_45:
                {
                alt17=50;
                }
                break;
            case KEYWORD_38:
                {
                alt17=51;
                }
                break;
            case KEYWORD_46:
                {
                alt17=52;
                }
                break;
            case KEYWORD_78:
                {
                alt17=53;
                }
                break;
            case KEYWORD_39:
                {
                alt17=54;
                }
                break;
            case KEYWORD_47:
                {
                alt17=55;
                }
                break;
            case KEYWORD_40:
                {
                alt17=56;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1382:1: (kw= KEYWORD_59 | kw= KEYWORD_74 | kw= KEYWORD_41 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_66 | kw= KEYWORD_48 | kw= KEYWORD_75 | kw= KEYWORD_49 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_84 | kw= KEYWORD_50 | kw= KEYWORD_82 | kw= KEYWORD_68 | kw= KEYWORD_42 | kw= KEYWORD_79 | kw= KEYWORD_62 | kw= KEYWORD_88 | kw= KEYWORD_51 | kw= KEYWORD_28 | kw= KEYWORD_52 | kw= KEYWORD_76 | kw= KEYWORD_53 | kw= KEYWORD_69 | kw= KEYWORD_77 | kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 | kw= KEYWORD_29 | kw= KEYWORD_70 | kw= KEYWORD_71 | kw= KEYWORD_55 | kw= KEYWORD_35 | kw= KEYWORD_72 | kw= KEYWORD_43 | kw= KEYWORD_64 | kw= KEYWORD_73 | kw= KEYWORD_56 | kw= KEYWORD_57 | kw= KEYWORD_36 | kw= KEYWORD_58 | kw= KEYWORD_44 | kw= KEYWORD_80 | kw= KEYWORD_30 | kw= KEYWORD_85 | kw= KEYWORD_37 | kw= KEYWORD_86 | kw= KEYWORD_87 | kw= KEYWORD_45 | kw= KEYWORD_38 | kw= KEYWORD_46 | kw= KEYWORD_78 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_40 )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1383:2: kw= KEYWORD_59
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleOtherName2631); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1390:2: kw= KEYWORD_74
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleOtherName2650); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1397:2: kw= KEYWORD_41
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleOtherName2669); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAliasKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1404:2: kw= KEYWORD_81
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleOtherName2688); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1411:2: kw= KEYWORD_31
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleOtherName2707); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getBookKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1418:2: kw= KEYWORD_66
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleOtherName2726); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getBookpartKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1425:2: kw= KEYWORD_48
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleOtherName2745); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getChangeKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1432:2: kw= KEYWORD_75
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleOtherName2764); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getChordmodeKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1439:2: kw= KEYWORD_49
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleOtherName2783); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getChordsKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1446:2: kw= KEYWORD_67
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleOtherName2802); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getConsistsKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1453:2: kw= KEYWORD_61
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleOtherName2821); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDefaultKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1460:2: kw= KEYWORD_84
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleOtherName2840); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1467:2: kw= KEYWORD_50
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleOtherName2859); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDeniesKeyword_12(), null); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1474:2: kw= KEYWORD_82
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleOtherName2878); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDescriptionKeyword_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1481:2: kw= KEYWORD_68
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleOtherName2897); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDrummodeKeyword_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1488:2: kw= KEYWORD_42
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleOtherName2916); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDrumsKeyword_15(), null); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1495:2: kw= KEYWORD_79
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleOtherName2935); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getFiguremodeKeyword_16(), null); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1502:2: kw= KEYWORD_62
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleOtherName2954); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getFiguresKeyword_17(), null); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1509:2: kw= KEYWORD_88
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_ruleOtherName2973); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_18(), null); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1516:2: kw= KEYWORD_51
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleOtherName2992); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getHeaderKeyword_19(), null); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1523:2: kw= KEYWORD_28
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleOtherName3011); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getKeyKeyword_20(), null); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1530:2: kw= KEYWORD_52
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleOtherName3030); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLayoutKeyword_21(), null); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1537:2: kw= KEYWORD_76
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleOtherName3049); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLyricmodeKeyword_22(), null); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1544:2: kw= KEYWORD_53
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleOtherName3068); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLyricsKeyword_23(), null); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1551:2: kw= KEYWORD_69
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleOtherName3087); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLyricstoKeyword_24(), null); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1558:2: kw= KEYWORD_77
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleOtherName3106); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getMaininputKeyword_25(), null); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1565:2: kw= KEYWORD_32
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleOtherName3125); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getMarkKeyword_26(), null); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1572:2: kw= KEYWORD_33
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleOtherName3144); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getMidiKeyword_27(), null); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1579:2: kw= KEYWORD_34
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleOtherName3163); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getNameKeyword_28(), null); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1586:2: kw= KEYWORD_29
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleOtherName3182); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getNewKeyword_29(), null); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1593:2: kw= KEYWORD_70
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleOtherName3201); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getNotemodeKeyword_30(), null); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1600:2: kw= KEYWORD_71
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleOtherName3220); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getObjectidKeyword_31(), null); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1607:2: kw= KEYWORD_55
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleOtherName3239); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOctaveKeyword_32(), null); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1614:2: kw= KEYWORD_35
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleOtherName3258); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOnceKeyword_33(), null); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1621:2: kw= KEYWORD_72
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleOtherName3277); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOverrideKeyword_34(), null); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1628:2: kw= KEYWORD_43
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleOtherName3296); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getPaperKeyword_35(), null); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1635:2: kw= KEYWORD_64
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleOtherName3315); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getPartialKeyword_36(), null); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1642:2: kw= KEYWORD_73
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleOtherName3334); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRelativeKeyword_37(), null); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1649:2: kw= KEYWORD_56
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleOtherName3353); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRemoveKeyword_38(), null); 
                          
                    }

                    }
                    break;
                case 40 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1656:2: kw= KEYWORD_57
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleOtherName3372); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRepeatKeyword_39(), null); 
                          
                    }

                    }
                    break;
                case 41 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1663:2: kw= KEYWORD_36
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleOtherName3391); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRestKeyword_40(), null); 
                          
                    }

                    }
                    break;
                case 42 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1670:2: kw= KEYWORD_58
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleOtherName3410); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRevertKeyword_41(), null); 
                          
                    }

                    }
                    break;
                case 43 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1677:2: kw= KEYWORD_44
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOtherName3429); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getScoreKeyword_42(), null); 
                          
                    }

                    }
                    break;
                case 44 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1684:2: kw= KEYWORD_80
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleOtherName3448); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSequentialKeyword_43(), null); 
                          
                    }

                    }
                    break;
                case 45 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1691:2: kw= KEYWORD_30
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleOtherName3467); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSetKeyword_44(), null); 
                          
                    }

                    }
                    break;
                case 46 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1698:2: kw= KEYWORD_85
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_ruleOtherName3486); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_45(), null); 
                          
                    }

                    }
                    break;
                case 47 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1705:2: kw= KEYWORD_37
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleOtherName3505); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSkipKeyword_46(), null); 
                          
                    }

                    }
                    break;
                case 48 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1712:2: kw= KEYWORD_86
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_ruleOtherName3524); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_47(), null); 
                          
                    }

                    }
                    break;
                case 49 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1719:2: kw= KEYWORD_87
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_ruleOtherName3543); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_48(), null); 
                          
                    }

                    }
                    break;
                case 50 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1726:2: kw= KEYWORD_45
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleOtherName3562); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTempoKeyword_49(), null); 
                          
                    }

                    }
                    break;
                case 51 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1733:2: kw= KEYWORD_38
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleOtherName3581); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTimeKeyword_50(), null); 
                          
                    }

                    }
                    break;
                case 52 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1740:2: kw= KEYWORD_46
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleOtherName3600); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTimesKeyword_51(), null); 
                          
                    }

                    }
                    break;
                case 53 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1747:2: kw= KEYWORD_78
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleOtherName3619); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTransposeKeyword_52(), null); 
                          
                    }

                    }
                    break;
                case 54 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1754:2: kw= KEYWORD_39
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleOtherName3638); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTypeKeyword_53(), null); 
                          
                    }

                    }
                    break;
                case 55 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1761:2: kw= KEYWORD_47
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleOtherName3657); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getUnsetKeyword_54(), null); 
                          
                    }

                    }
                    break;
                case 56 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1768:2: kw= KEYWORD_40
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleOtherName3676); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getWithKeyword_55(), null); 
                          
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
    // $ANTLR end ruleOtherName


    // $ANTLR start entryRuleSpecialCommandName
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1781:1: entryRuleSpecialCommandName returns [String current=null] : iv_ruleSpecialCommandName= ruleSpecialCommandName EOF ;
    public final String entryRuleSpecialCommandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCommandName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1782:1: (iv_ruleSpecialCommandName= ruleSpecialCommandName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1783:2: iv_ruleSpecialCommandName= ruleSpecialCommandName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCommandNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName3716);
            iv_ruleSpecialCommandName=ruleSpecialCommandName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCommandName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommandName3727); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSpecialCommandName


    // $ANTLR start ruleSpecialCommandName
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1790:1: ruleSpecialCommandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_63 | kw= KEYWORD_65 | kw= KEYWORD_54 | kw= KEYWORD_83 | kw= KEYWORD_60 | this_OtherName_5= ruleOtherName ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCommandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OtherName_5 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1795:6: ( (kw= KEYWORD_63 | kw= KEYWORD_65 | kw= KEYWORD_54 | kw= KEYWORD_83 | kw= KEYWORD_60 | this_OtherName_5= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1796:1: (kw= KEYWORD_63 | kw= KEYWORD_65 | kw= KEYWORD_54 | kw= KEYWORD_83 | kw= KEYWORD_60 | this_OtherName_5= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1796:1: (kw= KEYWORD_63 | kw= KEYWORD_65 | kw= KEYWORD_54 | kw= KEYWORD_83 | kw= KEYWORD_60 | this_OtherName_5= ruleOtherName )
            int alt18=6;
            switch ( input.LA(1) ) {
            case KEYWORD_63:
                {
                alt18=1;
                }
                break;
            case KEYWORD_65:
                {
                alt18=2;
                }
                break;
            case KEYWORD_54:
                {
                alt18=3;
                }
                break;
            case KEYWORD_83:
                {
                alt18=4;
                }
                break;
            case KEYWORD_60:
                {
                alt18=5;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_64:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
                {
                alt18=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1796:1: (kw= KEYWORD_63 | kw= KEYWORD_65 | kw= KEYWORD_54 | kw= KEYWORD_83 | kw= KEYWORD_60 | this_OtherName_5= ruleOtherName )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1797:2: kw= KEYWORD_63
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleSpecialCommandName3765); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1804:2: kw= KEYWORD_65
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleSpecialCommandName3784); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1811:2: kw= KEYWORD_54
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleSpecialCommandName3803); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1818:2: kw= KEYWORD_83
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleSpecialCommandName3822); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1825:2: kw= KEYWORD_60
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleSpecialCommandName3841); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1832:5: this_OtherName_5= ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandNameAccess().getOtherNameParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleSpecialCommandName3869);
                    this_OtherName_5=ruleOtherName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_OtherName_5);
                          
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
    // $ANTLR end ruleSpecialCommandName


    // $ANTLR start entryRuleSpecialCharacter
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1850:1: entryRuleSpecialCharacter returns [String current=null] : iv_ruleSpecialCharacter= ruleSpecialCharacter EOF ;
    public final String entryRuleSpecialCharacter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1851:1: (iv_ruleSpecialCharacter= ruleSpecialCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1852:2: iv_ruleSpecialCharacter= ruleSpecialCharacter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCharacterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter3914);
            iv_ruleSpecialCharacter=ruleSpecialCharacter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCharacter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCharacter3925); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1859:1: ruleSpecialCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_14 | kw= KEYWORD_16 | kw= KEYWORD_20 ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1864:6: ( (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_14 | kw= KEYWORD_16 | kw= KEYWORD_20 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1865:1: (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_14 | kw= KEYWORD_16 | kw= KEYWORD_20 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1865:1: (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_14 | kw= KEYWORD_16 | kw= KEYWORD_20 )
            int alt19=7;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
                {
                alt19=1;
                }
                break;
            case KEYWORD_7:
                {
                alt19=2;
                }
                break;
            case KEYWORD_11:
                {
                alt19=3;
                }
                break;
            case KEYWORD_13:
                {
                alt19=4;
                }
                break;
            case KEYWORD_14:
                {
                alt19=5;
                }
                break;
            case KEYWORD_16:
                {
                alt19=6;
                }
                break;
            case KEYWORD_20:
                {
                alt19=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1865:1: (kw= KEYWORD_1 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_14 | kw= KEYWORD_16 | kw= KEYWORD_20 )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1866:2: kw= KEYWORD_1
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSpecialCharacter3963); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1873:2: kw= KEYWORD_7
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleSpecialCharacter3982); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1880:2: kw= KEYWORD_11
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleSpecialCharacter4001); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1887:2: kw= KEYWORD_13
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleSpecialCharacter4020); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1894:2: kw= KEYWORD_14
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleSpecialCharacter4039); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1901:2: kw= KEYWORD_16
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSpecialCharacter4058); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1908:2: kw= KEYWORD_20
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleSpecialCharacter4077); if (failed) return current;
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


    // $ANTLR start entryRuleUnparsedBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1921:1: entryRuleUnparsedBlock returns [EObject current=null] : iv_ruleUnparsedBlock= ruleUnparsedBlock EOF ;
    public final EObject entryRuleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1922:2: (iv_ruleUnparsedBlock= ruleUnparsedBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1923:2: iv_ruleUnparsedBlock= ruleUnparsedBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock4116);
            iv_ruleUnparsedBlock=ruleUnparsedBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedBlock4126); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnparsedBlock


    // $ANTLR start ruleUnparsedBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1930:1: ruleUnparsedBlock returns [EObject current=null] : ( () KEYWORD_18 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_19 ) ;
    public final EObject ruleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1935:6: ( ( () KEYWORD_18 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_19 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1936:1: ( () KEYWORD_18 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_19 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1936:1: ( () KEYWORD_18 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_19 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1936:2: () KEYWORD_18 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_19
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1936:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1937:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getUnparsedBlockAccess().getUnparsedBlockAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getUnparsedBlockAccess().getUnparsedBlockAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleUnparsedBlock4174); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1955:1: ( (lv_expressions_2_0= ruleUnparsedExpression ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=KEYWORD_88 && LA20_0<=KEYWORD_30)||(LA20_0>=KEYWORD_27 && LA20_0<=KEYWORD_2)||(LA20_0>=KEYWORD_4 && LA20_0<=KEYWORD_16)||LA20_0==KEYWORD_18||(LA20_0>=KEYWORD_20 && LA20_0<=RULE_ALPHA)||LA20_0==RULE_ANY_OTHER) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1956:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1956:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1957:3: lv_expressions_2_0= ruleUnparsedExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock4195);
            	    lv_expressions_2_0=ruleUnparsedExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getUnparsedBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_2_0, 
            	      	        		"UnparsedExpression", 
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
            	    break loop20;
                }
            } while (true);

            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleUnparsedBlock4207); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnparsedBlockAccess().getRightCurlyBracketKeyword_3(), null); 
                  
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
    // $ANTLR end ruleUnparsedBlock


    // $ANTLR start entryRuleUnparsedExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1992:1: entryRuleUnparsedExpression returns [EObject current=null] : iv_ruleUnparsedExpression= ruleUnparsedExpression EOF ;
    public final EObject entryRuleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1993:2: (iv_ruleUnparsedExpression= ruleUnparsedExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1994:2: iv_ruleUnparsedExpression= ruleUnparsedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression4242);
            iv_ruleUnparsedExpression=ruleUnparsedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedExpression4252); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnparsedExpression


    // $ANTLR start ruleUnparsedExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2001:1: ruleUnparsedExpression returns [EObject current=null] : (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) ;
    public final EObject ruleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnparsedCommand_0 = null;

        EObject this_UnparsedBlock_1 = null;

        EObject this_Scheme_2 = null;

        EObject this_Text_3 = null;

        EObject this_Number_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:6: ( (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2007:1: (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2007:1: (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            int alt21=5;
            switch ( input.LA(1) ) {
            case KEYWORD_15:
                {
                alt21=1;
                }
                break;
            case KEYWORD_18:
                {
                alt21=2;
                }
                break;
            case KEYWORD_2:
                {
                alt21=3;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_27:
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
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
            case RULE_STRING:
            case RULE_ALPHA:
            case RULE_ANY_OTHER:
                {
                alt21=4;
                }
                break;
            case RULE_INT:
                {
                alt21=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2007:1: (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2008:2: this_UnparsedCommand_0= ruleUnparsedCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression4302);
                    this_UnparsedCommand_0=ruleUnparsedCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UnparsedCommand_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2021:2: this_UnparsedBlock_1= ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedBlockParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression4332);
                    this_UnparsedBlock_1=ruleUnparsedBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UnparsedBlock_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2034:2: this_Scheme_2= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getSchemeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleUnparsedExpression4362);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2047:2: this_Text_3= ruleText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleUnparsedExpression4392);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2060:2: this_Number_4= ruleNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getNumberParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleUnparsedExpression4422);
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
    // $ANTLR end ruleUnparsedExpression


    // $ANTLR start entryRuleUnparsedCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2079:1: entryRuleUnparsedCommand returns [EObject current=null] : iv_ruleUnparsedCommand= ruleUnparsedCommand EOF ;
    public final EObject entryRuleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2080:2: (iv_ruleUnparsedCommand= ruleUnparsedCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2081:2: iv_ruleUnparsedCommand= ruleUnparsedCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand4456);
            iv_ruleUnparsedCommand=ruleUnparsedCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedCommand4466); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnparsedCommand


    // $ANTLR start ruleUnparsedCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2088:1: ruleUnparsedCommand returns [EObject current=null] : ( KEYWORD_15 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_command_1_1 = null;

        AntlrDatatypeRuleToken lv_command_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2093:6: ( ( KEYWORD_15 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2094:1: ( KEYWORD_15 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2094:1: ( KEYWORD_15 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2095:2: KEYWORD_15 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleUnparsedCommand4502); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2099:1: ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2100:1: ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2100:1: ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2101:1: (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2101:1: (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ALPHA) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=KEYWORD_88 && LA22_0<=KEYWORD_30)) ) {
                alt22=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2101:1: (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2102:3: lv_command_1_1= ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandIdentifierParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleUnparsedCommand4525);
                    lv_command_1_1=ruleIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnparsedCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"command",
                      	        		lv_command_1_1, 
                      	        		"Identifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2123:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand4544);
                    lv_command_1_2=ruleSpecialCommandName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnparsedCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"command",
                      	        		lv_command_1_2, 
                      	        		"SpecialCommandName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
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
    // $ANTLR end ruleUnparsedCommand


    // $ANTLR start entryRuleReference
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2155:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:2: (iv_ruleReference= ruleReference EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2157:2: iv_ruleReference= ruleReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference4582);
            iv_ruleReference=ruleReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference4592); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2164:1: ruleReference returns [EObject current=null] : ( KEYWORD_15 ( ( ruleIdentifier ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2169:6: ( ( KEYWORD_15 ( ( ruleIdentifier ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2170:1: ( KEYWORD_15 ( ( ruleIdentifier ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2170:1: ( KEYWORD_15 ( ( ruleIdentifier ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2171:2: KEYWORD_15 ( ( ruleIdentifier ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleReference4628); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2175:1: ( ( ruleIdentifier ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2176:1: ( ruleIdentifier )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2176:1: ( ruleIdentifier )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2177:3: ruleIdentifier
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
            pushFollow(FOLLOW_ruleIdentifier_in_ruleReference4655);
            ruleIdentifier();
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
        }
        return current;
    }
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2202:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2203:2: (iv_ruleText= ruleText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2204:2: iv_ruleText= ruleText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText4690);
            iv_ruleText=ruleText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText4700); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2211:1: ruleText returns [EObject current=null] : ( ( (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        AntlrDatatypeRuleToken lv_value_0_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:6: ( ( ( (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2217:1: ( ( (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2217:1: ( ( (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2218:1: ( (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2218:1: ( (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2219:1: (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2219:1: (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )
            int alt23=6;
            switch ( input.LA(1) ) {
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_27:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
            case RULE_STRING:
            case RULE_ALPHA:
            case RULE_ANY_OTHER:
                {
                alt23=1;
                }
                break;
            case KEYWORD_5:
                {
                alt23=2;
                }
                break;
            case KEYWORD_6:
                {
                alt23=3;
                }
                break;
            case KEYWORD_4:
                {
                alt23=4;
                }
                break;
            case KEYWORD_8:
                {
                alt23=5;
                }
                break;
            case KEYWORD_10:
                {
                alt23=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2219:1: (lv_value_0_1= ruleSchemeTextLiteral | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2220:3: lv_value_0_1= ruleSchemeTextLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTextAccess().getValueSchemeTextLiteralParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeTextLiteral_in_ruleText4747);
                    lv_value_0_1=ruleSchemeTextLiteral();
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
                      	        		"SchemeTextLiteral", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2241:8: lv_value_0_2= KEYWORD_5
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleText4764); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:8: lv_value_0_3= KEYWORD_6
                    {
                    lv_value_0_3=(Token)input.LT(1);
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleText4794); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2279:8: lv_value_0_4= KEYWORD_4
                    {
                    lv_value_0_4=(Token)input.LT(1);
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleText4824); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2298:8: lv_value_0_5= KEYWORD_8
                    {
                    lv_value_0_5=(Token)input.LT(1);
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleText4854); if (failed) return current;
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
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2317:8: lv_value_0_6= KEYWORD_10
                    {
                    lv_value_0_6=(Token)input.LT(1);
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleText4884); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueColonKeyword_0_5(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_0_6, null, lastConsumedNode);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2347:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2348:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2349:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber4934);
            iv_ruleNumber=ruleNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber4944); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2356:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2361:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2362:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2362:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2363:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2363:1: (lv_value_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2364:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber4985); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2394:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2398:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2399:2: iv_ruleScheme= ruleScheme EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme5030);
            iv_ruleScheme=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme5040); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2409:1: ruleScheme returns [EObject current=null] : ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2415:6: ( ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2416:1: ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2416:1: ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2417:2: KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) )
            {
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleScheme5080); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeAccess().getNumberSignKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2421:1: ( (lv_value_1_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2422:1: (lv_value_1_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2422:1: (lv_value_1_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2423:3: lv_value_1_0= ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme5101);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2456:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2457:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2458:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression5140);
            iv_ruleSchemeExpression=ruleSchemeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression5150); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2465:1: ruleSchemeExpression returns [EObject current=null] : ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_17 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_quoted_0_0=null;
        Token lv_quasiquoted_1_0=null;
        Token lv_unquoted_2_0=null;
        Token lv_variable_3_0=null;
        EObject lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2470:6: ( ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_17 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:1: ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_17 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:1: ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_17 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_17 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_17 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_variable_3_0= KEYWORD_3 ) )? )?
            int alt28=5;
            switch ( input.LA(1) ) {
                case KEYWORD_4:
                    {
                    alt28=1;
                    }
                    break;
                case KEYWORD_2:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_5:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_23:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_22:
                    {
                    int LA28_5 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_27:
                    {
                    int LA28_6 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_12:
                    {
                    int LA28_7 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_9:
                    {
                    int LA28_8 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_1:
                    {
                    int LA28_9 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_7:
                    {
                    int LA28_10 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_11:
                    {
                    int LA28_11 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_13:
                    {
                    int LA28_12 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_14:
                    {
                    int LA28_13 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_16:
                    {
                    int LA28_14 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_20:
                    {
                    int LA28_15 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_63:
                    {
                    int LA28_16 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_65:
                    {
                    int LA28_17 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_54:
                    {
                    int LA28_18 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_83:
                    {
                    int LA28_19 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_60:
                    {
                    int LA28_20 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_59:
                    {
                    int LA28_21 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_74:
                    {
                    int LA28_22 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_41:
                    {
                    int LA28_23 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_81:
                    {
                    int LA28_24 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_31:
                    {
                    int LA28_25 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_66:
                    {
                    int LA28_26 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_48:
                    {
                    int LA28_27 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_75:
                    {
                    int LA28_28 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_49:
                    {
                    int LA28_29 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_67:
                    {
                    int LA28_30 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_61:
                    {
                    int LA28_31 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_84:
                    {
                    int LA28_32 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_50:
                    {
                    int LA28_33 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_82:
                    {
                    int LA28_34 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_68:
                    {
                    int LA28_35 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_42:
                    {
                    int LA28_36 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_79:
                    {
                    int LA28_37 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_62:
                    {
                    int LA28_38 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_88:
                    {
                    int LA28_39 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_51:
                    {
                    int LA28_40 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_28:
                    {
                    int LA28_41 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_52:
                    {
                    int LA28_42 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_76:
                    {
                    int LA28_43 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_53:
                    {
                    int LA28_44 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_69:
                    {
                    int LA28_45 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_77:
                    {
                    int LA28_46 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_32:
                    {
                    int LA28_47 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_33:
                    {
                    int LA28_48 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_34:
                    {
                    int LA28_49 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_29:
                    {
                    int LA28_50 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_70:
                    {
                    int LA28_51 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_71:
                    {
                    int LA28_52 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_55:
                    {
                    int LA28_53 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_35:
                    {
                    int LA28_54 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_72:
                    {
                    int LA28_55 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_43:
                    {
                    int LA28_56 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_64:
                    {
                    int LA28_57 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_73:
                    {
                    int LA28_58 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_56:
                    {
                    int LA28_59 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_57:
                    {
                    int LA28_60 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_36:
                    {
                    int LA28_61 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_58:
                    {
                    int LA28_62 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_44:
                    {
                    int LA28_63 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_80:
                    {
                    int LA28_64 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_30:
                    {
                    int LA28_65 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_85:
                    {
                    int LA28_66 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_37:
                    {
                    int LA28_67 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_86:
                    {
                    int LA28_68 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_87:
                    {
                    int LA28_69 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_45:
                    {
                    int LA28_70 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_38:
                    {
                    int LA28_71 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_46:
                    {
                    int LA28_72 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_78:
                    {
                    int LA28_73 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_39:
                    {
                    int LA28_74 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_47:
                    {
                    int LA28_75 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_40:
                    {
                    int LA28_76 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case RULE_ALPHA:
                    {
                    int LA28_77 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA28_78 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    int LA28_79 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA28_80 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_21:
                    {
                    int LA28_81 = input.LA(2);

                    if ( (synpred104()) ) {
                        alt28=1;
                    }
                    else if ( (synpred106()) ) {
                        alt28=2;
                    }
                    else if ( (synpred108()) ) {
                        alt28=3;
                    }
                    else if ( (synpred110()) ) {
                        alt28=4;
                    }
                    }
                    break;
                case KEYWORD_17:
                    {
                    alt28=2;
                    }
                    break;
                case KEYWORD_8:
                    {
                    alt28=3;
                    }
                    break;
                case KEYWORD_3:
                    {
                    alt28=4;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:3: ( (lv_quoted_0_0= KEYWORD_4 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:3: ( (lv_quoted_0_0= KEYWORD_4 ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==KEYWORD_4) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2472:1: (lv_quoted_0_0= KEYWORD_4 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2472:1: (lv_quoted_0_0= KEYWORD_4 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2473:3: lv_quoted_0_0= KEYWORD_4
                            {
                            lv_quoted_0_0=(Token)input.LT(1);
                            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSchemeExpression5195); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2494:6: ( (lv_quasiquoted_1_0= KEYWORD_17 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2494:6: ( (lv_quasiquoted_1_0= KEYWORD_17 ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==KEYWORD_17) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2495:1: (lv_quasiquoted_1_0= KEYWORD_17 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2495:1: (lv_quasiquoted_1_0= KEYWORD_17 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2496:3: lv_quasiquoted_1_0= KEYWORD_17
                            {
                            lv_quasiquoted_1_0=(Token)input.LT(1);
                            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleSchemeExpression5234); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2517:6: ( (lv_unquoted_2_0= KEYWORD_8 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2517:6: ( (lv_unquoted_2_0= KEYWORD_8 ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==KEYWORD_8) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2518:1: (lv_unquoted_2_0= KEYWORD_8 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2518:1: (lv_unquoted_2_0= KEYWORD_8 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2519:3: lv_unquoted_2_0= KEYWORD_8
                            {
                            lv_unquoted_2_0=(Token)input.LT(1);
                            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSchemeExpression5273); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:6: ( (lv_variable_3_0= KEYWORD_3 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:6: ( (lv_variable_3_0= KEYWORD_3 ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==KEYWORD_3) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2541:1: (lv_variable_3_0= KEYWORD_3 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2541:1: (lv_variable_3_0= KEYWORD_3 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2542:3: lv_variable_3_0= KEYWORD_3
                            {
                            lv_variable_3_0=(Token)input.LT(1);
                            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSchemeExpression5312); if (failed) return current;
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
                            break;

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2562:5: ( (lv_value_4_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2563:1: (lv_value_4_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2563:1: (lv_value_4_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2564:3: lv_value_4_0= ruleSchemeValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression5349);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2594:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2595:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2596:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue5384);
            iv_ruleSchemeValue=ruleSchemeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue5394); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2603:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2608:6: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2609:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2609:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            int alt29=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_ALPHA) ) {
                    int LA29_8 = input.LA(3);

                    if ( (synpred111()) ) {
                        alt29=1;
                    }
                    else if ( (synpred116()) ) {
                        alt29=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2609:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 29, 8, input);

                        throw nvae;
                    }
                }
                else if ( (LA29_1==KEYWORD_5) ) {
                    alt29=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2609:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 29, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                alt29=2;
                }
                break;
            case KEYWORD_23:
                {
                alt29=3;
                }
                break;
            case KEYWORD_22:
                {
                alt29=4;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_27:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
            case RULE_STRING:
            case RULE_ALPHA:
            case RULE_ANY_OTHER:
                {
                alt29=5;
                }
                break;
            case RULE_INT:
                {
                alt29=6;
                }
                break;
            case KEYWORD_21:
                {
                alt29=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2609:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2610:2: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue5444);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2623:2: this_SchemeList_1= ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue5474);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2636:2: this_SchemeBlock_2= ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue5504);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2649:2: this_SchemeCharacter_3= ruleSchemeCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue5534);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2662:2: this_SchemeText_4= ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue5564);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2675:2: this_SchemeNumber_5= ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_ruleSchemeValue5594);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2688:2: this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue5624);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2707:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2708:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2709:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean5658);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean5668); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2716:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBoolean ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2721:6: ( ( (lv_value_0_0= ruleBoolean ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2722:1: ( (lv_value_0_0= ruleBoolean ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2722:1: ( (lv_value_0_0= ruleBoolean ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2723:1: (lv_value_0_0= ruleBoolean )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2723:1: (lv_value_0_0= ruleBoolean )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2724:3: lv_value_0_0= ruleBoolean
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeBooleanAccess().getValueBooleanParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBoolean_in_ruleSchemeBoolean5713);
            lv_value_0_0=ruleBoolean();
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
              	        		"Boolean", 
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2754:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2755:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2756:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList5747);
            iv_ruleSchemeList=ruleSchemeList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList5757); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2763:1: ruleSchemeList returns [EObject current=null] : ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        Token lv_vector_1_0=null;
        EObject lv_expressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2768:6: ( ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2769:1: ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2769:1: ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2769:2: () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2769:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2770:2: 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2783:2: ( (lv_vector_1_0= KEYWORD_2 ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_2) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2784:1: (lv_vector_1_0= KEYWORD_2 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2784:1: (lv_vector_1_0= KEYWORD_2 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2785:3: lv_vector_1_0= KEYWORD_2
                    {
                    lv_vector_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeList5813); if (failed) return current;
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

            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSchemeList5838); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2810:1: ( (lv_expressions_3_0= ruleSchemeExpression ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=KEYWORD_88 && LA31_0<=KEYWORD_23)||(LA31_0>=KEYWORD_27 && LA31_0<=KEYWORD_5)||(LA31_0>=KEYWORD_7 && LA31_0<=KEYWORD_9)||(LA31_0>=KEYWORD_11 && LA31_0<=KEYWORD_14)||(LA31_0>=KEYWORD_16 && LA31_0<=KEYWORD_17)||(LA31_0>=KEYWORD_20 && LA31_0<=RULE_ALPHA)||LA31_0==RULE_ANY_OTHER) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2811:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2811:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2812:3: lv_expressions_3_0= ruleSchemeExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList5859);
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
            	    break loop31;
                }
            } while (true);

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleSchemeList5871); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2847:1: entryRuleSchemeBlock returns [EObject current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final EObject entryRuleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2848:2: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2849:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock5906);
            iv_ruleSchemeBlock=ruleSchemeBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock5916); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2856:1: ruleSchemeBlock returns [EObject current=null] : ( KEYWORD_23 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_24 ) ;
    public final EObject ruleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2861:6: ( ( KEYWORD_23 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2862:1: ( KEYWORD_23 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2862:1: ( KEYWORD_23 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2863:2: KEYWORD_23 ( (lv_expressions_1_0= ruleExpression ) )+ KEYWORD_24
            {
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleSchemeBlock5952); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2867:1: ( (lv_expressions_1_0= ruleExpression ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=KEYWORD_88 && LA32_0<=KEYWORD_30)||LA32_0==KEYWORD_25||(LA32_0>=KEYWORD_27 && LA32_0<=KEYWORD_2)||(LA32_0>=KEYWORD_4 && LA32_0<=KEYWORD_16)||LA32_0==KEYWORD_18||(LA32_0>=KEYWORD_20 && LA32_0<=RULE_ALPHA)||LA32_0==RULE_ANY_OTHER) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2868:1: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2868:1: (lv_expressions_1_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2869:3: lv_expressions_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSchemeBlock5973);
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
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleSchemeBlock5985); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2904:1: entryRuleSchemeCharacter returns [EObject current=null] : iv_ruleSchemeCharacter= ruleSchemeCharacter EOF ;
    public final EObject entryRuleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2905:2: (iv_ruleSchemeCharacter= ruleSchemeCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2906:2: iv_ruleSchemeCharacter= ruleSchemeCharacter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeCharacterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter6020);
            iv_ruleSchemeCharacter=ruleSchemeCharacter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeCharacter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter6030); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2913:1: ruleSchemeCharacter returns [EObject current=null] : ( KEYWORD_22 ( ( (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) ;
    public final EObject ruleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_3=null;
        AntlrDatatypeRuleToken lv_value_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2918:6: ( ( KEYWORD_22 ( ( (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2919:1: ( KEYWORD_22 ( ( (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2919:1: ( KEYWORD_22 ( ( (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2920:2: KEYWORD_22 ( ( (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            {
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleSchemeCharacter6066); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2924:1: ( ( (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2925:1: ( (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2925:1: ( (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2926:1: (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2926:1: (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt33=1;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
                {
                alt33=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt33=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2926:1: (lv_value_1_1= RULE_ALPHA | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2927:3: lv_value_1_1= RULE_ALPHA
                    {
                    lv_value_1_1=(Token)input.LT(1);
                    match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_ruleSchemeCharacter6085); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSchemeCharacterAccess().getValueALPHATerminalRuleCall_1_0_0(), "value"); 
                      		
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
                      	        		"ALPHA", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2948:8: lv_value_1_2= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter6109);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2969:8: lv_value_1_3= RULE_ANY_OTHER
                    {
                    lv_value_1_3=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter6124); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3001:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3002:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3003:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText6167);
            iv_ruleSchemeText=ruleSchemeText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText6177); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3010:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeId ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3015:6: ( ( (lv_value_0_0= ruleSchemeId ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3016:1: ( (lv_value_0_0= ruleSchemeId ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3016:1: ( (lv_value_0_0= ruleSchemeId ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3017:1: (lv_value_0_0= ruleSchemeId )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3017:1: (lv_value_0_0= ruleSchemeId )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3018:3: lv_value_0_0= ruleSchemeId
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeIdParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeId_in_ruleSchemeText6222);
            lv_value_0_0=ruleSchemeId();
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
              	        		"SchemeId", 
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


    // $ANTLR start entryRuleSchemeId
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3048:1: entryRuleSchemeId returns [String current=null] : iv_ruleSchemeId= ruleSchemeId EOF ;
    public final String entryRuleSchemeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeId = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3052:1: (iv_ruleSchemeId= ruleSchemeId EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3053:2: iv_ruleSchemeId= ruleSchemeId EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeIdRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeId_in_entryRuleSchemeId6263);
            iv_ruleSchemeId=ruleSchemeId();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeId6274); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeId


    // $ANTLR start ruleSchemeId
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3063:1: ruleSchemeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SchemeTextLiteral_0= ruleSchemeTextLiteral (kw= KEYWORD_10 this_SchemeTextLiteral_2= ruleSchemeTextLiteral )? ) ;
    public final AntlrDatatypeRuleToken ruleSchemeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SchemeTextLiteral_0 = null;

        AntlrDatatypeRuleToken this_SchemeTextLiteral_2 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3069:6: ( (this_SchemeTextLiteral_0= ruleSchemeTextLiteral (kw= KEYWORD_10 this_SchemeTextLiteral_2= ruleSchemeTextLiteral )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3070:1: (this_SchemeTextLiteral_0= ruleSchemeTextLiteral (kw= KEYWORD_10 this_SchemeTextLiteral_2= ruleSchemeTextLiteral )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3070:1: (this_SchemeTextLiteral_0= ruleSchemeTextLiteral (kw= KEYWORD_10 this_SchemeTextLiteral_2= ruleSchemeTextLiteral )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3071:5: this_SchemeTextLiteral_0= ruleSchemeTextLiteral (kw= KEYWORD_10 this_SchemeTextLiteral_2= ruleSchemeTextLiteral )?
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_ruleSchemeId6325);
            this_SchemeTextLiteral_0=ruleSchemeTextLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_SchemeTextLiteral_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3081:1: (kw= KEYWORD_10 this_SchemeTextLiteral_2= ruleSchemeTextLiteral )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_10) ) {
                switch ( input.LA(2) ) {
                    case RULE_ALPHA:
                        {
                        int LA34_3 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA34_4 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_27:
                        {
                        int LA34_5 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_12:
                        {
                        int LA34_6 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_9:
                        {
                        int LA34_7 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_1:
                        {
                        int LA34_8 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_7:
                        {
                        int LA34_9 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_11:
                        {
                        int LA34_10 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_13:
                        {
                        int LA34_11 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_14:
                        {
                        int LA34_12 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_16:
                        {
                        int LA34_13 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_20:
                        {
                        int LA34_14 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_63:
                        {
                        int LA34_15 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_65:
                        {
                        int LA34_16 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_54:
                        {
                        int LA34_17 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_83:
                        {
                        int LA34_18 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_60:
                        {
                        int LA34_19 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_59:
                        {
                        int LA34_20 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_74:
                        {
                        int LA34_21 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_41:
                        {
                        int LA34_22 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_81:
                        {
                        int LA34_23 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_31:
                        {
                        int LA34_24 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_66:
                        {
                        int LA34_25 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_48:
                        {
                        int LA34_26 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_75:
                        {
                        int LA34_27 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_49:
                        {
                        int LA34_28 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_67:
                        {
                        int LA34_29 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_61:
                        {
                        int LA34_30 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_84:
                        {
                        int LA34_31 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_50:
                        {
                        int LA34_32 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_82:
                        {
                        int LA34_33 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_68:
                        {
                        int LA34_34 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_42:
                        {
                        int LA34_35 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_79:
                        {
                        int LA34_36 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_62:
                        {
                        int LA34_37 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_88:
                        {
                        int LA34_38 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_51:
                        {
                        int LA34_39 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_28:
                        {
                        int LA34_40 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_52:
                        {
                        int LA34_41 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_76:
                        {
                        int LA34_42 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_53:
                        {
                        int LA34_43 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_69:
                        {
                        int LA34_44 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_77:
                        {
                        int LA34_45 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_32:
                        {
                        int LA34_46 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_33:
                        {
                        int LA34_47 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_34:
                        {
                        int LA34_48 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_29:
                        {
                        int LA34_49 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_70:
                        {
                        int LA34_50 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_71:
                        {
                        int LA34_51 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_55:
                        {
                        int LA34_52 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_35:
                        {
                        int LA34_53 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_72:
                        {
                        int LA34_54 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_43:
                        {
                        int LA34_55 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_64:
                        {
                        int LA34_56 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_73:
                        {
                        int LA34_57 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_56:
                        {
                        int LA34_58 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_57:
                        {
                        int LA34_59 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_36:
                        {
                        int LA34_60 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_58:
                        {
                        int LA34_61 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_44:
                        {
                        int LA34_62 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_80:
                        {
                        int LA34_63 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_30:
                        {
                        int LA34_64 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_85:
                        {
                        int LA34_65 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_37:
                        {
                        int LA34_66 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_86:
                        {
                        int LA34_67 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_87:
                        {
                        int LA34_68 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_45:
                        {
                        int LA34_69 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_38:
                        {
                        int LA34_70 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_46:
                        {
                        int LA34_71 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_78:
                        {
                        int LA34_72 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_39:
                        {
                        int LA34_73 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_47:
                        {
                        int LA34_74 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case KEYWORD_40:
                        {
                        int LA34_75 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case RULE_ANY_OTHER:
                        {
                        int LA34_76 = input.LA(3);

                        if ( (synpred122()) ) {
                            alt34=1;
                        }
                        }
                        break;
                }

            }
            switch (alt34) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3082:2: kw= KEYWORD_10 this_SchemeTextLiteral_2= ruleSchemeTextLiteral
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleSchemeId6344); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeIdAccess().getColonKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeTextLiteral_in_ruleSchemeId6366);
                    this_SchemeTextLiteral_2=ruleSchemeTextLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_SchemeTextLiteral_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
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
    // $ANTLR end ruleSchemeId


    // $ANTLR start entryRuleSchemeTextLiteral
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3109:1: entryRuleSchemeTextLiteral returns [String current=null] : iv_ruleSchemeTextLiteral= ruleSchemeTextLiteral EOF ;
    public final String entryRuleSchemeTextLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextLiteral = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3110:1: (iv_ruleSchemeTextLiteral= ruleSchemeTextLiteral EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3111:2: iv_ruleSchemeTextLiteral= ruleSchemeTextLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_entryRuleSchemeTextLiteral6417);
            iv_ruleSchemeTextLiteral=ruleSchemeTextLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeTextLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiteral6428); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSchemeTextLiteral


    // $ANTLR start ruleSchemeTextLiteral
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3118:1: ruleSchemeTextLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_27 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_Identifier_5= ruleIdentifier | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_6=null;
        Token this_ANY_OTHER_7=null;
        AntlrDatatypeRuleToken this_SpecialCharacter_3 = null;

        AntlrDatatypeRuleToken this_SpecialCommandName_4 = null;

        AntlrDatatypeRuleToken this_Identifier_5 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3123:6: ( (kw= KEYWORD_27 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_Identifier_5= ruleIdentifier | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3124:1: (kw= KEYWORD_27 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_Identifier_5= ruleIdentifier | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3124:1: (kw= KEYWORD_27 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_Identifier_5= ruleIdentifier | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER )
            int alt35=8;
            switch ( input.LA(1) ) {
            case KEYWORD_27:
                {
                alt35=1;
                }
                break;
            case KEYWORD_12:
                {
                alt35=2;
                }
                break;
            case KEYWORD_9:
                {
                alt35=3;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
                {
                alt35=4;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
                {
                alt35=5;
                }
                break;
            case RULE_ALPHA:
                {
                alt35=6;
                }
                break;
            case RULE_STRING:
                {
                alt35=7;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt35=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3124:1: (kw= KEYWORD_27 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_Identifier_5= ruleIdentifier | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3125:2: kw= KEYWORD_27
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSchemeTextLiteral6466); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextLiteralAccess().getReverseSolidusReverseSolidusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3132:2: kw= KEYWORD_12
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleSchemeTextLiteral6485); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextLiteralAccess().getEqualsSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3139:2: kw= KEYWORD_9
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleSchemeTextLiteral6504); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextLiteralAccess().getHyphenMinusKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3146:5: this_SpecialCharacter_3= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextLiteralAccess().getSpecialCharacterParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextLiteral6532);
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
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3158:5: this_SpecialCommandName_4= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextLiteralAccess().getSpecialCommandNameParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleSchemeTextLiteral6565);
                    this_SpecialCommandName_4=ruleSpecialCommandName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_SpecialCommandName_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3170:5: this_Identifier_5= ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextLiteralAccess().getIdentifierParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSchemeTextLiteral6598);
                    this_Identifier_5=ruleIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_Identifier_5);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3181:10: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemeTextLiteral6624); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_6);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralAccess().getSTRINGTerminalRuleCall_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3189:10: this_ANY_OTHER_7= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_7=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiteral6650); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_7);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralAccess().getANY_OTHERTerminalRuleCall_7(), null); 
                          
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
    // $ANTLR end ruleSchemeTextLiteral


    // $ANTLR start entryRuleSchemeNumber
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3204:1: entryRuleSchemeNumber returns [EObject current=null] : iv_ruleSchemeNumber= ruleSchemeNumber EOF ;
    public final EObject entryRuleSchemeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3208:2: (iv_ruleSchemeNumber= ruleSchemeNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3209:2: iv_ruleSchemeNumber= ruleSchemeNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber6700);
            iv_ruleSchemeNumber=ruleSchemeNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber6710); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3219:1: ruleSchemeNumber returns [EObject current=null] : ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSchemeNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_radix_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3225:6: ( ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3226:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3226:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3226:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3226:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_2) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3227:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3227:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3228:3: lv_radix_0_0= ruleSchemeNumberRadix
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber6760);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3250:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3251:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3251:1: (lv_value_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3252:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeNumber6778); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3285:1: entryRuleSchemeNumberRadix returns [String current=null] : iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF ;
    public final String entryRuleSchemeNumberRadix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeNumberRadix = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3286:1: (iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3287:2: iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRadixRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix6823);
            iv_ruleSchemeNumberRadix=ruleSchemeNumberRadix();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumberRadix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix6834); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSchemeNumberRadix


    // $ANTLR start ruleSchemeNumberRadix
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3294:1: ruleSchemeNumberRadix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA ) ;
    public final AntlrDatatypeRuleToken ruleSchemeNumberRadix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ALPHA_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3299:6: ( (kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3300:1: (kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3300:1: (kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3301:2: kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeNumberRadix6872); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0(), null); 
                  
            }
            this_ALPHA_1=(Token)input.LT(1);
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_ruleSchemeNumberRadix6887); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ALPHA_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getSchemeNumberRadixAccess().getALPHATerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleSchemeNumberRadix


    // $ANTLR start entryRuleSchemeMarkupCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3321:1: entryRuleSchemeMarkupCommand returns [EObject current=null] : iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF ;
    public final EObject entryRuleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeMarkupCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3325:2: (iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3326:2: iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeMarkupCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand6937);
            iv_ruleSchemeMarkupCommand=ruleSchemeMarkupCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeMarkupCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand6947); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3336:1: ruleSchemeMarkupCommand returns [EObject current=null] : ( KEYWORD_21 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_command_1_1 = null;

        AntlrDatatypeRuleToken lv_command_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3342:6: ( ( KEYWORD_21 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3343:1: ( KEYWORD_21 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3343:1: ( KEYWORD_21 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3344:2: KEYWORD_21 ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleSchemeMarkupCommand6987); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3348:1: ( ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3349:1: ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3349:1: ( (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3350:1: (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3350:1: (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ALPHA) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=KEYWORD_88 && LA37_0<=KEYWORD_30)) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3350:1: (lv_command_1_1= ruleIdentifier | lv_command_1_2= ruleSpecialCommandName )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3351:3: lv_command_1_1= ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeMarkupCommandAccess().getCommandIdentifierParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSchemeMarkupCommand7010);
                    lv_command_1_1=ruleIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeMarkupCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"command",
                      	        		lv_command_1_1, 
                      	        		"Identifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3372:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeMarkupCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleSchemeMarkupCommand7029);
                    lv_command_1_2=ruleSpecialCommandName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeMarkupCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"command",
                      	        		lv_command_1_2, 
                      	        		"SpecialCommandName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleSchemeMarkupCommand


    // $ANTLR start entryRuleIdentifier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3407:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3411:1: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3412:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIdentifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier7078);
            iv_ruleIdentifier=ruleIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier7089); if (failed) return current;

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
    // $ANTLR end entryRuleIdentifier


    // $ANTLR start ruleIdentifier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3422:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHA_0= RULE_ALPHA (kw= KEYWORD_9 this_ALPHA_2= RULE_ALPHA )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHA_0=null;
        Token kw=null;
        Token this_ALPHA_2=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3428:6: ( (this_ALPHA_0= RULE_ALPHA (kw= KEYWORD_9 this_ALPHA_2= RULE_ALPHA )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3429:1: (this_ALPHA_0= RULE_ALPHA (kw= KEYWORD_9 this_ALPHA_2= RULE_ALPHA )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3429:1: (this_ALPHA_0= RULE_ALPHA (kw= KEYWORD_9 this_ALPHA_2= RULE_ALPHA )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3429:6: this_ALPHA_0= RULE_ALPHA (kw= KEYWORD_9 this_ALPHA_2= RULE_ALPHA )*
            {
            this_ALPHA_0=(Token)input.LT(1);
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_ruleIdentifier7133); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ALPHA_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3436:1: (kw= KEYWORD_9 this_ALPHA_2= RULE_ALPHA )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==KEYWORD_9) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_ALPHA) ) {
                        int LA38_3 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3437:2: kw= KEYWORD_9 this_ALPHA_2= RULE_ALPHA
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleIdentifier7152); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getIdentifierAccess().getHyphenMinusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ALPHA_2=(Token)input.LT(1);
            	    match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_ruleIdentifier7167); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ALPHA_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


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
    // $ANTLR end ruleIdentifier


    // $ANTLR start entryRuleBoolean
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3460:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3461:1: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3462:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean7218);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean7229); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3469:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ALPHA_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3474:6: ( (kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3475:1: (kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3475:1: (kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3476:2: kw= KEYWORD_2 this_ALPHA_1= RULE_ALPHA
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBoolean7267); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getBooleanAccess().getNumberSignKeyword_0(), null); 
                  
            }
            this_ALPHA_1=(Token)input.LT(1);
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_ruleBoolean7282); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ALPHA_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getBooleanAccess().getALPHATerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleBoolean

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

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1103:1: ( ( ( ruleScheme | ruleUnparsedCommand ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1103:1: ( ( ruleScheme | ruleUnparsedCommand ) )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1103:1: ( ( ruleScheme | ruleUnparsedCommand ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:1: ( ruleScheme | ruleUnparsedCommand )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:1: ( ruleScheme | ruleUnparsedCommand )
        int alt39=2;
        int LA39_0 = input.LA(1);

        if ( (LA39_0==KEYWORD_2) ) {
            alt39=1;
        }
        else if ( (LA39_0==KEYWORD_15) ) {
            alt39=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1104:1: ( ruleScheme | ruleUnparsedCommand )", 39, 0, input);

            throw nvae;
        }
        switch (alt39) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1105:3: ruleScheme
                {
                pushFollow(FOLLOW_ruleScheme_in_synpred202189);
                ruleScheme();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1126:8: ruleUnparsedCommand
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleUnparsedCommand_in_synpred202208);
                ruleUnparsedCommand();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1151:1: ( ( ruleUnparsedBlock ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1151:1: ( ruleUnparsedBlock )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1151:1: ( ruleUnparsedBlock )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1152:3: ruleUnparsedBlock
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleUnparsedBlock_in_synpred212233);
        ruleUnparsedBlock();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1222:1: ( ( ruleUnparsedBlock ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1222:1: ( ruleUnparsedBlock )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1222:1: ( ruleUnparsedBlock )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1223:3: ruleUnparsedBlock
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getContextAccess().getBlockUnparsedBlockParserRuleCall_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleUnparsedBlock_in_synpred222359);
        ruleUnparsedBlock();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:3: ( ( ( KEYWORD_4 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:3: ( ( KEYWORD_4 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2471:3: ( ( KEYWORD_4 ) )?
        int alt40=2;
        int LA40_0 = input.LA(1);

        if ( (LA40_0==KEYWORD_4) ) {
            alt40=1;
        }
        switch (alt40) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2472:1: ( KEYWORD_4 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2472:1: ( KEYWORD_4 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2473:3: KEYWORD_4
                {
                match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_synpred1045195); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred106
    public final void synpred106_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2494:6: ( ( ( KEYWORD_17 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2494:6: ( ( KEYWORD_17 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2494:6: ( ( KEYWORD_17 ) )?
        int alt41=2;
        int LA41_0 = input.LA(1);

        if ( (LA41_0==KEYWORD_17) ) {
            alt41=1;
        }
        switch (alt41) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2495:1: ( KEYWORD_17 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2495:1: ( KEYWORD_17 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2496:3: KEYWORD_17
                {
                match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_synpred1065234); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred106

    // $ANTLR start synpred108
    public final void synpred108_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2517:6: ( ( ( KEYWORD_8 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2517:6: ( ( KEYWORD_8 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2517:6: ( ( KEYWORD_8 ) )?
        int alt42=2;
        int LA42_0 = input.LA(1);

        if ( (LA42_0==KEYWORD_8) ) {
            alt42=1;
        }
        switch (alt42) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2518:1: ( KEYWORD_8 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2518:1: ( KEYWORD_8 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2519:3: KEYWORD_8
                {
                match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred1085273); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred108

    // $ANTLR start synpred110
    public final void synpred110_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:6: ( ( ( KEYWORD_3 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:6: ( ( KEYWORD_3 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2540:6: ( ( KEYWORD_3 ) )?
        int alt43=2;
        int LA43_0 = input.LA(1);

        if ( (LA43_0==KEYWORD_3) ) {
            alt43=1;
        }
        switch (alt43) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2541:1: ( KEYWORD_3 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2541:1: ( KEYWORD_3 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2542:3: KEYWORD_3
                {
                match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_synpred1105312); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred110

    // $ANTLR start synpred111
    public final void synpred111_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2610:2: ( ruleSchemeBoolean )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2610:2: ruleSchemeBoolean
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred1115444);
        ruleSchemeBoolean();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred111

    // $ANTLR start synpred116
    public final void synpred116_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2675:2: ( ruleSchemeNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2675:2: ruleSchemeNumber
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred1165594);
        ruleSchemeNumber();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred116

    // $ANTLR start synpred122
    public final void synpred122_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3082:2: ( KEYWORD_10 ruleSchemeTextLiteral )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3082:2: KEYWORD_10 ruleSchemeTextLiteral
        {
        match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_synpred1226344); if (failed) return ;
        pushFollow(FOLLOW_ruleSchemeTextLiteral_in_synpred1226366);
        ruleSchemeTextLiteral();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred122

    // $ANTLR start synpred132
    public final void synpred132_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3437:2: ( KEYWORD_9 RULE_ALPHA )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3437:2: KEYWORD_9 RULE_ALPHA
        {
        match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_synpred1327152); if (failed) return ;
        match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_synpred1327167); if (failed) return ;

        }
    }
    // $ANTLR end synpred132

    public final boolean synpred116() {
        backtracking++;
        int start = input.mark();
        try {
            synpred116_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred122() {
        backtracking++;
        int start = input.mark();
        try {
            synpred122_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred111() {
        backtracking++;
        int start = input.mark();
        try {
            synpred111_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred110() {
        backtracking++;
        int start = input.mark();
        try {
            synpred110_fragment(); // can never throw exception
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
    public final boolean synpred104() {
        backtracking++;
        int start = input.mark();
        try {
            synpred104_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred132() {
        backtracking++;
        int start = input.mark();
        try {
            synpred132_fragment(); // can never throw exception
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
    public final boolean synpred106() {
        backtracking++;
        int start = input.mark();
        try {
            synpred106_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred108() {
        backtracking++;
        int start = input.mark();
        try {
            synpred108_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
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


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_ruleLilyPond128 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000107AFFFBA1L});
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
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAssignment683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleAssignment717 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssignment783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePropertyAssignment831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyAssignment846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rulePropertyAssignment865 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyAssignment886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlock981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_ruleBlock1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleSimpleBlock1103 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107EFFFBA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleBlock1124 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107EFFFBA1L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleSimpleBlock1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleSimultaneousBlock1229 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBE1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimultaneousBlock1250 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBE1L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleSimultaneousBlock1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_ruleCommand1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleCommand1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSpecialCommand1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSpecialCommand1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleSpecialCommand1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_ruleSpecialCommand1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_ruleSpecialCommand1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_ruleSpecialCommand1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleInclude1711 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleInclude1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleVersion1825 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleVersion1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkup1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleMarkup1939 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleMarkup1950 = new BitSet(new long[]{0x0000000000000002L,0x0000000002400200L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkup1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines2006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupLines2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleMarkupLines2052 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleMarkupLines2063 = new BitSet(new long[]{0x0000000000000002L,0x0000000002400200L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkupLines2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBody2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleMarkupBody2189 = new BitSet(new long[]{0x0000000000000002L,0x0000000002400200L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody2208 = new BitSet(new long[]{0x0000000000000002L,0x0000000002400200L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext2269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleContext2327 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleContext2338 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContext2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_entryRuleOther2395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOther2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleOther2441 = new BitSet(new long[]{0xFFFFFEFD6FFFF7F0L,0x0000000008B47101L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleOther2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleOther2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleOther2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleOther2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_entryRuleOtherName2582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherName2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleOtherName2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleOtherName2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleOtherName2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleOtherName2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleOtherName2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleOtherName2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleOtherName2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleOtherName2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleOtherName2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleOtherName2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleOtherName2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleOtherName2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleOtherName2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleOtherName2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleOtherName2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleOtherName2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleOtherName2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleOtherName2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_ruleOtherName2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleOtherName2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleOtherName3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleOtherName3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleOtherName3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleOtherName3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleOtherName3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleOtherName3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleOtherName3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleOtherName3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleOtherName3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleOtherName3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleOtherName3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleOtherName3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleOtherName3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleOtherName3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleOtherName3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleOtherName3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleOtherName3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleOtherName3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleOtherName3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleOtherName3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleOtherName3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleOtherName3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOtherName3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleOtherName3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleOtherName3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_ruleOtherName3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleOtherName3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_ruleOtherName3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_ruleOtherName3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleOtherName3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleOtherName3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleOtherName3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleOtherName3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleOtherName3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleOtherName3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleOtherName3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName3716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommandName3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleSpecialCommandName3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleSpecialCommandName3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleSpecialCommandName3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleSpecialCommandName3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleSpecialCommandName3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleSpecialCommandName3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter3914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSpecialCharacter3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleSpecialCharacter3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleSpecialCharacter4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleSpecialCharacter4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleSpecialCharacter4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSpecialCharacter4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleSpecialCharacter4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock4116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedBlock4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleUnparsedBlock4174 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107EFFFB81L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock4195 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107EFFFB81L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleUnparsedBlock4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression4242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedExpression4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleUnparsedExpression4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleUnparsedExpression4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleUnparsedExpression4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand4456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedCommand4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleUnparsedCommand4502 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000040000001L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleUnparsedCommand4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference4582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleReference4628 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleReference4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText4690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_ruleText4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleText4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleText4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleText4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleText4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleText4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber4934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme5030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleScheme5080 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001079BDDF8FL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression5140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSchemeExpression5195 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001078BD538FL});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleSchemeExpression5234 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001078BD538FL});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSchemeExpression5273 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001078BD538FL});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSchemeExpression5312 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001078BD538FL});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue5384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_ruleSchemeValue5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean5658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleSchemeBoolean5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList5747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeList5813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSchemeList5838 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001079BDFF8FL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList5859 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001079BDFF8FL});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleSchemeList5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock5906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleSchemeBlock5952 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSchemeBlock5973 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBB1L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleSchemeBlock5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter6020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleSchemeCharacter6066 = new BitSet(new long[]{0x0000000000000000L,0x0000001048B44100L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_ruleSchemeCharacter6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText6167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeId_in_ruleSchemeText6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeId_in_entryRuleSchemeId6263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeId6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_ruleSchemeId6325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleSchemeId6344 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001058BD4181L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_ruleSchemeId6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_entryRuleSchemeTextLiteral6417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiteral6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSchemeTextLiteral6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleSchemeTextLiteral6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleSchemeTextLiteral6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextLiteral6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleSchemeTextLiteral6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSchemeTextLiteral6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemeTextLiteral6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiteral6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber6700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber6760 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeNumber6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix6823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeNumberRadix6872 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_ruleSchemeNumberRadix6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand6937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleSchemeMarkupCommand6987 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000040000001L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSchemeMarkupCommand7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleSchemeMarkupCommand7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier7078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_ruleIdentifier7133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleIdentifier7152 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_ruleIdentifier7167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean7218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBoolean7267 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_ruleBoolean7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_synpred202189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_synpred202208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_synpred212233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_synpred222359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_synpred1045195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_synpred1065234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred1085273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_synpred1105312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred1115444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred1165594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_synpred1226344 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001058BD4181L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_synpred1226366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_synpred1327152 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_synpred1327167 = new BitSet(new long[]{0x0000000000000002L});

}