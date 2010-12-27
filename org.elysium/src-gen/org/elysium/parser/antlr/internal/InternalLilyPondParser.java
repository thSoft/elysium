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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_90", "KEYWORD_88", "KEYWORD_89", "KEYWORD_86", "KEYWORD_87", "KEYWORD_83", "KEYWORD_84", "KEYWORD_85", "KEYWORD_81", "KEYWORD_82", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_79", "KEYWORD_80", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_75", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_67", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_ID=96;
    public static final int RULE_SCHEME_SL_COMMENT=100;
    public static final int RULE_ANY_OTHER=102;
    public static final int KEYWORD_56=40;
    public static final int KEYWORD_55=39;
    public static final int KEYWORD_54=38;
    public static final int KEYWORD_53=37;
    public static final int KEYWORD_52=36;
    public static final int KEYWORD_51=35;
    public static final int KEYWORD_50=34;
    public static final int EOF=-1;
    public static final int KEYWORD_59=43;
    public static final int KEYWORD_58=42;
    public static final int KEYWORD_57=41;
    public static final int KEYWORD_65=31;
    public static final int RULE_SCHEME_ML_COMMENT=101;
    public static final int KEYWORD_64=30;
    public static final int KEYWORD_67=33;
    public static final int KEYWORD_66=32;
    public static final int KEYWORD_61=27;
    public static final int KEYWORD_60=44;
    public static final int KEYWORD_63=29;
    public static final int KEYWORD_62=28;
    public static final int KEYWORD_69=20;
    public static final int KEYWORD_68=19;
    public static final int KEYWORD_30=62;
    public static final int KEYWORD_34=53;
    public static final int KEYWORD_33=52;
    public static final int KEYWORD_32=64;
    public static final int KEYWORD_31=63;
    public static final int KEYWORD_38=57;
    public static final int KEYWORD_37=56;
    public static final int KEYWORD_36=55;
    public static final int KEYWORD_35=54;
    public static final int RULE_ML_COMMENT=99;
    public static final int KEYWORD_39=58;
    public static final int RULE_STRING=94;
    public static final int KEYWORD_41=60;
    public static final int KEYWORD_40=59;
    public static final int KEYWORD_43=45;
    public static final int KEYWORD_42=61;
    public static final int KEYWORD_45=47;
    public static final int KEYWORD_44=46;
    public static final int KEYWORD_47=49;
    public static final int KEYWORD_46=48;
    public static final int KEYWORD_49=51;
    public static final int KEYWORD_48=50;
    public static final int KEYWORD_90=4;
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
    public static final int KEYWORD_28=70;
    public static final int KEYWORD_29=71;
    public static final int RULE_INT=95;
    public static final int KEYWORD_24=66;
    public static final int KEYWORD_25=67;
    public static final int KEYWORD_26=68;
    public static final int KEYWORD_27=69;
    public static final int KEYWORD_20=91;
    public static final int KEYWORD_21=92;
    public static final int KEYWORD_22=93;
    public static final int KEYWORD_23=65;
    public static final int KEYWORD_79=17;
    public static final int KEYWORD_71=22;
    public static final int KEYWORD_72=23;
    public static final int KEYWORD_73=24;
    public static final int KEYWORD_74=25;
    public static final int KEYWORD_75=26;
    public static final int KEYWORD_76=14;
    public static final int KEYWORD_77=15;
    public static final int KEYWORD_78=16;
    public static final int KEYWORD_1=72;
    public static final int KEYWORD_5=76;
    public static final int KEYWORD_4=75;
    public static final int KEYWORD_70=21;
    public static final int KEYWORD_3=74;
    public static final int KEYWORD_2=73;
    public static final int RULE_SL_COMMENT=98;
    public static final int Tokens=103;
    public static final int KEYWORD_84=10;
    public static final int KEYWORD_85=11;
    public static final int KEYWORD_82=13;
    public static final int KEYWORD_83=9;
    public static final int KEYWORD_88=5;
    public static final int KEYWORD_89=6;
    public static final int KEYWORD_86=7;
    public static final int KEYWORD_87=8;
    public static final int KEYWORD_81=12;
    public static final int KEYWORD_80=18;
    public static final int RULE_WS=97;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[259+1];
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

                if ( ((LA1_0>=KEYWORD_90 && LA1_0<=KEYWORD_32)||LA1_0==KEYWORD_27||(LA1_0>=KEYWORD_29 && LA1_0<=KEYWORD_14)||(LA1_0>=KEYWORD_16 && LA1_0<=KEYWORD_18)||LA1_0==KEYWORD_20||(LA1_0>=KEYWORD_22 && LA1_0<=RULE_ID)||LA1_0==RULE_ANY_OTHER) ) {
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
            case KEYWORD_90:
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_27:
            case KEYWORD_29:
            case KEYWORD_1:
            case KEYWORD_2:
            case KEYWORD_3:
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
            case KEYWORD_17:
            case KEYWORD_18:
            case KEYWORD_20:
            case KEYWORD_22:
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
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
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
            else if ( ((LA3_0>=KEYWORD_90 && LA3_0<=KEYWORD_32)||LA3_0==KEYWORD_27||(LA3_0>=KEYWORD_29 && LA3_0<=KEYWORD_14)||(LA3_0>=KEYWORD_16 && LA3_0<=KEYWORD_18)||LA3_0==KEYWORD_20||(LA3_0>=KEYWORD_22 && LA3_0<=RULE_INT)||LA3_0==RULE_ANY_OTHER) ) {
                alt3=2;
            }
            else {
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
            case KEYWORD_17:
                {
                alt4=1;
                }
                break;
            case KEYWORD_27:
            case KEYWORD_20:
                {
                alt4=2;
                }
                break;
            case KEYWORD_2:
            case KEYWORD_3:
                {
                alt4=3;
                }
                break;
            case KEYWORD_90:
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_29:
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
            case KEYWORD_18:
            case KEYWORD_22:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt4=4;
                }
                break;
            case RULE_INT:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred7()) ) {
                    alt4=4;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("235:1: (this_Command_0= ruleCommand | this_Block_1= ruleBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )", 4, 5, input);

                    throw nvae;
                }
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:316:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:321:6: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:322:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) )
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

            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleAssignment718); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:416:1: rulePropertyAssignment returns [EObject current=null] : ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:421:6: ( ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( ( (lv_id_0_0= ruleSchemeIdentifier ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:2: ( (lv_id_0_0= ruleSchemeIdentifier ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:2: ( (lv_id_0_0= ruleSchemeIdentifier ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:1: (lv_id_0_0= ruleSchemeIdentifier )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:1: (lv_id_0_0= ruleSchemeIdentifier )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:424:3: lv_id_0_0= ruleSchemeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyAssignmentAccess().getIdSchemeIdentifierParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeIdentifier_in_rulePropertyAssignment830);
            lv_id_0_0=ruleSchemeIdentifier();
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
              	        		lv_id_0_0, 
              	        		"SchemeIdentifier", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rulePropertyAssignment841); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:451:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:452:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:452:1: (lv_value_2_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:453:3: lv_value_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulePropertyAssignment862);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:483:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:484:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:485:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock897);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock907); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:492:1: ruleBlock returns [EObject current=null] : (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBlock_0 = null;

        EObject this_SimultaneousBlock_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:497:6: ( (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:498:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:498:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_20) ) {
                alt6=1;
            }
            else if ( (LA6_0==KEYWORD_27) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("498:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:499:2: this_SimpleBlock_0= ruleSimpleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlock957);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:512:2: this_SimultaneousBlock_1= ruleSimultaneousBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_ruleBlock987);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:531:1: entryRuleSimpleBlock returns [EObject current=null] : iv_ruleSimpleBlock= ruleSimpleBlock EOF ;
    public final EObject entryRuleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:532:2: (iv_ruleSimpleBlock= ruleSimpleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:533:2: iv_ruleSimpleBlock= ruleSimpleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1021);
            iv_ruleSimpleBlock=ruleSimpleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock1031); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:540:1: ruleSimpleBlock returns [EObject current=null] : ( () KEYWORD_20 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_21 ) ;
    public final EObject ruleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:545:6: ( ( () KEYWORD_20 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_21 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:546:1: ( () KEYWORD_20 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_21 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:546:1: ( () KEYWORD_20 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_21 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:546:2: () KEYWORD_20 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_21
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:546:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:547:2: 
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

            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleSimpleBlock1079); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:565:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=KEYWORD_90 && LA7_0<=KEYWORD_32)||LA7_0==KEYWORD_27||(LA7_0>=KEYWORD_29 && LA7_0<=KEYWORD_14)||(LA7_0>=KEYWORD_16 && LA7_0<=KEYWORD_18)||LA7_0==KEYWORD_20||(LA7_0>=KEYWORD_22 && LA7_0<=RULE_ID)||LA7_0==RULE_ANY_OTHER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:566:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:566:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:567:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimpleBlock1100);
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
            	    break loop7;
                }
            } while (true);

            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleSimpleBlock1112); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:602:1: entryRuleSimultaneousBlock returns [EObject current=null] : iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF ;
    public final EObject entryRuleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneousBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:603:2: (iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:604:2: iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimultaneousBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1147);
            iv_ruleSimultaneousBlock=ruleSimultaneousBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimultaneousBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock1157); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:611:1: ruleSimultaneousBlock returns [EObject current=null] : ( () KEYWORD_27 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_28 ) ;
    public final EObject ruleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:616:6: ( ( () KEYWORD_27 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_28 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:617:1: ( () KEYWORD_27 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_28 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:617:1: ( () KEYWORD_27 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_28 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:617:2: () KEYWORD_27 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_28
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:617:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:618:2: 
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

            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSimultaneousBlock1205); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:636:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=KEYWORD_90 && LA8_0<=KEYWORD_32)||LA8_0==KEYWORD_27||(LA8_0>=KEYWORD_29 && LA8_0<=KEYWORD_14)||(LA8_0>=KEYWORD_16 && LA8_0<=KEYWORD_18)||LA8_0==KEYWORD_20||(LA8_0>=KEYWORD_22 && LA8_0<=RULE_ID)||LA8_0==RULE_ANY_OTHER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:637:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:637:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:638:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimultaneousBlock1226);
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
            	    break loop8;
                }
            } while (true);

            match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleSimultaneousBlock1238); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:673:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:674:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:675:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1273);
            iv_ruleCommand=ruleCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1283); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:682:1: ruleCommand returns [EObject current=null] : (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialCommand_0 = null;

        EObject this_Reference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:687:6: ( (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:688:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:688:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_17) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=KEYWORD_90 && LA9_1<=KEYWORD_32)||LA9_1==KEYWORD_1||(LA9_1>=KEYWORD_5 && LA9_1<=KEYWORD_7)||LA9_1==KEYWORD_11||(LA9_1>=KEYWORD_13 && LA9_1<=KEYWORD_14)||LA9_1==KEYWORD_16||LA9_1==KEYWORD_18||LA9_1==KEYWORD_22) ) {
                    alt9=1;
                }
                else if ( (LA9_1==RULE_ID) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("688:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference )", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("688:1: (this_SpecialCommand_0= ruleSpecialCommand | this_Reference_1= ruleReference )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:2: this_SpecialCommand_0= ruleSpecialCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommand_in_ruleCommand1333);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:702:2: this_Reference_1= ruleReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleCommand1363);
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


    // $ANTLR start entryRuleSpecialCharacter
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:721:1: entryRuleSpecialCharacter returns [String current=null] : iv_ruleSpecialCharacter= ruleSpecialCharacter EOF ;
    public final String entryRuleSpecialCharacter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:722:1: (iv_ruleSpecialCharacter= ruleSpecialCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:723:2: iv_ruleSpecialCharacter= ruleSpecialCharacter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCharacterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1398);
            iv_ruleSpecialCharacter=ruleSpecialCharacter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCharacter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCharacter1409); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:730:1: ruleSpecialCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_16 | kw= KEYWORD_18 | kw= KEYWORD_22 ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:735:6: ( (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_16 | kw= KEYWORD_18 | kw= KEYWORD_22 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:736:1: (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_16 | kw= KEYWORD_18 | kw= KEYWORD_22 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:736:1: (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_16 | kw= KEYWORD_18 | kw= KEYWORD_22 )
            int alt10=8;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
                {
                alt10=1;
                }
                break;
            case KEYWORD_14:
                {
                alt10=2;
                }
                break;
            case KEYWORD_7:
                {
                alt10=3;
                }
                break;
            case KEYWORD_11:
                {
                alt10=4;
                }
                break;
            case KEYWORD_13:
                {
                alt10=5;
                }
                break;
            case KEYWORD_16:
                {
                alt10=6;
                }
                break;
            case KEYWORD_18:
                {
                alt10=7;
                }
                break;
            case KEYWORD_22:
                {
                alt10=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("736:1: (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_16 | kw= KEYWORD_18 | kw= KEYWORD_22 )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:737:2: kw= KEYWORD_1
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSpecialCharacter1447); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:744:2: kw= KEYWORD_14
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleSpecialCharacter1466); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getQuestionMarkKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:751:2: kw= KEYWORD_7
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleSpecialCharacter1485); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:758:2: kw= KEYWORD_11
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleSpecialCharacter1504); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:765:2: kw= KEYWORD_13
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleSpecialCharacter1523); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:772:2: kw= KEYWORD_16
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSpecialCharacter1542); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:779:2: kw= KEYWORD_18
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleSpecialCharacter1561); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:786:2: kw= KEYWORD_22
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleSpecialCharacter1580); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getTildeKeyword_7(), null); 
                          
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:799:1: entryRuleUnparsedBlock returns [EObject current=null] : iv_ruleUnparsedBlock= ruleUnparsedBlock EOF ;
    public final EObject entryRuleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:800:2: (iv_ruleUnparsedBlock= ruleUnparsedBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:801:2: iv_ruleUnparsedBlock= ruleUnparsedBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1619);
            iv_ruleUnparsedBlock=ruleUnparsedBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedBlock1629); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:808:1: ruleUnparsedBlock returns [EObject current=null] : ( () KEYWORD_20 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_21 ) ;
    public final EObject ruleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:813:6: ( ( () KEYWORD_20 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_21 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:814:1: ( () KEYWORD_20 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_21 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:814:1: ( () KEYWORD_20 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_21 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:814:2: () KEYWORD_20 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_21
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:814:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:815:2: 
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

            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleUnparsedBlock1677); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:833:1: ( (lv_expressions_2_0= ruleUnparsedExpression ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=KEYWORD_90 && LA11_0<=KEYWORD_32)||(LA11_0>=KEYWORD_29 && LA11_0<=KEYWORD_14)||(LA11_0>=KEYWORD_16 && LA11_0<=KEYWORD_18)||LA11_0==KEYWORD_20||(LA11_0>=KEYWORD_22 && LA11_0<=RULE_ID)||LA11_0==RULE_ANY_OTHER) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:834:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:834:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:835:3: lv_expressions_2_0= ruleUnparsedExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock1698);
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
            	    break loop11;
                }
            } while (true);

            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleUnparsedBlock1710); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:870:1: entryRuleUnparsedExpression returns [EObject current=null] : iv_ruleUnparsedExpression= ruleUnparsedExpression EOF ;
    public final EObject entryRuleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:871:2: (iv_ruleUnparsedExpression= ruleUnparsedExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:872:2: iv_ruleUnparsedExpression= ruleUnparsedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1745);
            iv_ruleUnparsedExpression=ruleUnparsedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedExpression1755); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:879:1: ruleUnparsedExpression returns [EObject current=null] : (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Text_4= ruleText | this_Number_5= ruleNumber ) ;
    public final EObject ruleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAssignment_0 = null;

        EObject this_UnparsedCommand_1 = null;

        EObject this_UnparsedBlock_2 = null;

        EObject this_Scheme_3 = null;

        EObject this_Text_4 = null;

        EObject this_Number_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:884:6: ( (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Text_4= ruleText | this_Number_5= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:885:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Text_4= ruleText | this_Number_5= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:885:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Text_4= ruleText | this_Number_5= ruleNumber )
            int alt12=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred21()) ) {
                    alt12=1;
                }
                else if ( (synpred25()) ) {
                    alt12=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("885:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Text_4= ruleText | this_Number_5= ruleNumber )", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_17:
                {
                alt12=2;
                }
                break;
            case KEYWORD_20:
                {
                alt12=3;
                }
                break;
            case KEYWORD_2:
            case KEYWORD_3:
                {
                alt12=4;
                }
                break;
            case KEYWORD_90:
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_29:
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
            case KEYWORD_18:
            case KEYWORD_22:
            case RULE_STRING:
            case RULE_ANY_OTHER:
                {
                alt12=5;
                }
                break;
            case RULE_INT:
                {
                int LA12_79 = input.LA(2);

                if ( (synpred25()) ) {
                    alt12=5;
                }
                else if ( (true) ) {
                    alt12=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("885:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Text_4= ruleText | this_Number_5= ruleNumber )", 12, 79, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("885:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_UnparsedCommand_1= ruleUnparsedCommand | this_UnparsedBlock_2= ruleUnparsedBlock | this_Scheme_3= ruleScheme | this_Text_4= ruleText | this_Number_5= ruleNumber )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:886:2: this_PropertyAssignment_0= rulePropertyAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getPropertyAssignmentParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_ruleUnparsedExpression1805);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:899:2: this_UnparsedCommand_1= ruleUnparsedCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedCommandParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression1835);
                    this_UnparsedCommand_1=ruleUnparsedCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UnparsedCommand_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:912:2: this_UnparsedBlock_2= ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedBlockParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression1865);
                    this_UnparsedBlock_2=ruleUnparsedBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UnparsedBlock_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:925:2: this_Scheme_3= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getSchemeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleUnparsedExpression1895);
                    this_Scheme_3=ruleScheme();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Scheme_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:938:2: this_Text_4= ruleText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleUnparsedExpression1925);
                    this_Text_4=ruleText();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Text_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:951:2: this_Number_5= ruleNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getNumberParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleUnparsedExpression1955);
                    this_Number_5=ruleNumber();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Number_5;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:970:1: entryRuleUnparsedCommand returns [EObject current=null] : iv_ruleUnparsedCommand= ruleUnparsedCommand EOF ;
    public final EObject entryRuleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:971:2: (iv_ruleUnparsedCommand= ruleUnparsedCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:972:2: iv_ruleUnparsedCommand= ruleUnparsedCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand1989);
            iv_ruleUnparsedCommand=ruleUnparsedCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedCommand1999); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:979:1: ruleUnparsedCommand returns [EObject current=null] : ( KEYWORD_17 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_1_1=null;
        AntlrDatatypeRuleToken lv_command_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:984:6: ( ( KEYWORD_17 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:985:1: ( KEYWORD_17 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:985:1: ( KEYWORD_17 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:986:2: KEYWORD_17 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleUnparsedCommand2035); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:990:1: ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:991:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:991:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:992:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:992:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=KEYWORD_90 && LA13_0<=KEYWORD_32)) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("992:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:993:3: lv_command_1_1= RULE_ID
                    {
                    lv_command_1_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnparsedCommand2054); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getUnparsedCommandAccess().getCommandIDTerminalRuleCall_1_0_0(), "command"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnparsedCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"command",
                      	        		lv_command_1_1, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1014:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand2078);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1046:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1047:2: (iv_ruleReference= ruleReference EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1048:2: iv_ruleReference= ruleReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2116);
            iv_ruleReference=ruleReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2126); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1055:1: ruleReference returns [EObject current=null] : ( KEYWORD_17 ( ( RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1060:6: ( ( KEYWORD_17 ( ( RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1061:1: ( KEYWORD_17 ( ( RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1061:1: ( KEYWORD_17 ( ( RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1062:2: KEYWORD_17 ( ( RULE_ID ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleReference2162); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1066:1: ( ( RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1067:1: ( RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1067:1: ( RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1068:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference2184); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0(), "assignment"); 
              	
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1091:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1092:2: (iv_ruleText= ruleText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1093:2: iv_ruleText= ruleText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText2219);
            iv_ruleText=ruleText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2229); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1100:1: ruleText returns [EObject current=null] : ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1105:6: ( ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1106:1: ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1106:1: ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1107:1: ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1107:1: ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1108:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1108:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )
            int alt14=6;
            switch ( input.LA(1) ) {
            case KEYWORD_90:
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_29:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_22:
            case RULE_STRING:
            case RULE_INT:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt14=1;
                }
                break;
            case KEYWORD_5:
                {
                alt14=2;
                }
                break;
            case KEYWORD_6:
                {
                alt14=3;
                }
                break;
            case KEYWORD_4:
                {
                alt14=4;
                }
                break;
            case KEYWORD_8:
                {
                alt14=5;
                }
                break;
            case KEYWORD_10:
                {
                alt14=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1108:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1109:3: lv_value_0_1= ruleSchemeTextValueSegment
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTextAccess().getValueSchemeTextValueSegmentParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleText2276);
                    lv_value_0_1=ruleSchemeTextValueSegment();
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
                      	        		"SchemeTextValueSegment", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1130:8: lv_value_0_2= KEYWORD_5
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleText2293); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1149:8: lv_value_0_3= KEYWORD_6
                    {
                    lv_value_0_3=(Token)input.LT(1);
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleText2323); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1168:8: lv_value_0_4= KEYWORD_4
                    {
                    lv_value_0_4=(Token)input.LT(1);
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleText2353); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1187:8: lv_value_0_5= KEYWORD_8
                    {
                    lv_value_0_5=(Token)input.LT(1);
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleText2383); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1206:8: lv_value_0_6= KEYWORD_10
                    {
                    lv_value_0_6=(Token)input.LT(1);
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleText2413); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1236:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1237:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1238:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2463);
            iv_ruleNumber=ruleNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2473); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1245:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1250:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1251:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1251:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1252:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1252:1: (lv_value_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1253:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2514); if (failed) return current;
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


    // $ANTLR start entryRuleSpecialCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1283:1: entryRuleSpecialCommand returns [EObject current=null] : iv_ruleSpecialCommand= ruleSpecialCommand EOF ;
    public final EObject entryRuleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1284:2: (iv_ruleSpecialCommand= ruleSpecialCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1285:2: iv_ruleSpecialCommand= ruleSpecialCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2553);
            iv_ruleSpecialCommand=ruleSpecialCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand2563); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1292:1: ruleSpecialCommand returns [EObject current=null] : (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_ModeChange_7= ruleModeChange | this_NewContext_8= ruleNewContext | this_ContextDef_9= ruleContextDef | this_Other_10= ruleOther ) ;
    public final EObject ruleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Include_0 = null;

        EObject this_Version_1 = null;

        EObject this_Markup_2 = null;

        EObject this_MarkupLines_3 = null;

        EObject this_BlockCommand_4 = null;

        EObject this_OutputDefinition_5 = null;

        EObject this_RelativeMusic_6 = null;

        EObject this_ModeChange_7 = null;

        EObject this_NewContext_8 = null;

        EObject this_ContextDef_9 = null;

        EObject this_Other_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1297:6: ( (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_ModeChange_7= ruleModeChange | this_NewContext_8= ruleNewContext | this_ContextDef_9= ruleContextDef | this_Other_10= ruleOther ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1298:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_ModeChange_7= ruleModeChange | this_NewContext_8= ruleNewContext | this_ContextDef_9= ruleContextDef | this_Other_10= ruleOther )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1298:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_ModeChange_7= ruleModeChange | this_NewContext_8= ruleNewContext | this_ContextDef_9= ruleContextDef | this_Other_10= ruleOther )
            int alt15=11;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_17) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_65:
                    {
                    alt15=1;
                    }
                    break;
                case KEYWORD_85:
                    {
                    alt15=4;
                    }
                    break;
                case KEYWORD_62:
                    {
                    int LA15_4 = input.LA(3);

                    if ( (LA15_4==KEYWORD_20) ) {
                        alt15=10;
                    }
                    else if ( (LA15_4==RULE_ID) ) {
                        alt15=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1298:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_ModeChange_7= ruleModeChange | this_NewContext_8= ruleNewContext | this_ContextDef_9= ruleContextDef | this_Other_10= ruleOther )", 15, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case KEYWORD_75:
                    {
                    alt15=7;
                    }
                    break;
                case KEYWORD_56:
                    {
                    alt15=3;
                    }
                    break;
                case KEYWORD_67:
                    {
                    alt15=2;
                    }
                    break;
                case KEYWORD_54:
                case KEYWORD_45:
                case KEYWORD_35:
                    {
                    alt15=6;
                    }
                    break;
                case KEYWORD_31:
                    {
                    alt15=9;
                    }
                    break;
                case KEYWORD_68:
                case KEYWORD_53:
                case KEYWORD_46:
                case KEYWORD_33:
                    {
                    alt15=5;
                    }
                    break;
                case KEYWORD_81:
                case KEYWORD_77:
                case KEYWORD_78:
                case KEYWORD_70:
                case KEYWORD_72:
                    {
                    alt15=8;
                    }
                    break;
                case KEYWORD_90:
                case KEYWORD_88:
                case KEYWORD_89:
                case KEYWORD_86:
                case KEYWORD_87:
                case KEYWORD_83:
                case KEYWORD_84:
                case KEYWORD_82:
                case KEYWORD_76:
                case KEYWORD_79:
                case KEYWORD_80:
                case KEYWORD_69:
                case KEYWORD_71:
                case KEYWORD_73:
                case KEYWORD_74:
                case KEYWORD_61:
                case KEYWORD_63:
                case KEYWORD_64:
                case KEYWORD_66:
                case KEYWORD_50:
                case KEYWORD_51:
                case KEYWORD_52:
                case KEYWORD_55:
                case KEYWORD_57:
                case KEYWORD_58:
                case KEYWORD_59:
                case KEYWORD_60:
                case KEYWORD_43:
                case KEYWORD_44:
                case KEYWORD_47:
                case KEYWORD_48:
                case KEYWORD_49:
                case KEYWORD_34:
                case KEYWORD_36:
                case KEYWORD_37:
                case KEYWORD_38:
                case KEYWORD_39:
                case KEYWORD_40:
                case KEYWORD_41:
                case KEYWORD_42:
                case KEYWORD_30:
                case KEYWORD_32:
                case KEYWORD_1:
                case KEYWORD_5:
                case KEYWORD_6:
                case KEYWORD_7:
                case KEYWORD_11:
                case KEYWORD_13:
                case KEYWORD_14:
                case KEYWORD_16:
                case KEYWORD_18:
                case KEYWORD_22:
                    {
                    alt15=11;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1298:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_ModeChange_7= ruleModeChange | this_NewContext_8= ruleNewContext | this_ContextDef_9= ruleContextDef | this_Other_10= ruleOther )", 15, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1298:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_ModeChange_7= ruleModeChange | this_NewContext_8= ruleNewContext | this_ContextDef_9= ruleContextDef | this_Other_10= ruleOther )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1299:2: this_Include_0= ruleInclude
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleSpecialCommand2613);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1312:2: this_Version_1= ruleVersion
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleSpecialCommand2643);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1325:2: this_Markup_2= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleSpecialCommand2673);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1338:2: this_MarkupLines_3= ruleMarkupLines
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_ruleSpecialCommand2703);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1351:2: this_BlockCommand_4= ruleBlockCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getBlockCommandParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockCommand_in_ruleSpecialCommand2733);
                    this_BlockCommand_4=ruleBlockCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BlockCommand_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1364:2: this_OutputDefinition_5= ruleOutputDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getOutputDefinitionParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputDefinition_in_ruleSpecialCommand2763);
                    this_OutputDefinition_5=ruleOutputDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_OutputDefinition_5;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1377:2: this_RelativeMusic_6= ruleRelativeMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getRelativeMusicParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelativeMusic_in_ruleSpecialCommand2793);
                    this_RelativeMusic_6=ruleRelativeMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_RelativeMusic_6;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1390:2: this_ModeChange_7= ruleModeChange
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getModeChangeParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleModeChange_in_ruleSpecialCommand2823);
                    this_ModeChange_7=ruleModeChange();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ModeChange_7;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1403:2: this_NewContext_8= ruleNewContext
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getNewContextParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewContext_in_ruleSpecialCommand2853);
                    this_NewContext_8=ruleNewContext();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NewContext_8;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1416:2: this_ContextDef_9= ruleContextDef
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getContextDefParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextDef_in_ruleSpecialCommand2883);
                    this_ContextDef_9=ruleContextDef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ContextDef_9;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1429:2: this_Other_10= ruleOther
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getOtherParserRuleCall_10(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOther_in_ruleSpecialCommand2913);
                    this_Other_10=ruleOther();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Other_10;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1448:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1449:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1450:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude2947);
            iv_ruleInclude=ruleInclude();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude2957); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1457:1: ruleInclude returns [EObject current=null] : ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_65 ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        Token lv_importURI_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1462:6: ( ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_65 ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1463:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_65 ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1463:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_65 ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1464:2: KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_65 ) ) ( (lv_importURI_2_0= RULE_STRING ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleInclude2993); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1468:1: ( (lv_keyword_1_0= KEYWORD_65 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1469:1: (lv_keyword_1_0= KEYWORD_65 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1469:1: (lv_keyword_1_0= KEYWORD_65 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1470:3: lv_keyword_1_0= KEYWORD_65
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleInclude3012); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeAccess().getKeywordIncludeKeyword_1_0(), "keyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIncludeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "keyword", lv_keyword_1_0, "include", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1490:2: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1491:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1491:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1492:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude3042); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1522:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1523:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1524:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVersionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion3082);
            iv_ruleVersion=ruleVersion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion3092); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1531:1: ruleVersion returns [EObject current=null] : ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_67 ) ) ( (lv_version_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        Token lv_version_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1536:6: ( ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_67 ) ) ( (lv_version_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1537:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_67 ) ) ( (lv_version_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1537:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_67 ) ) ( (lv_version_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1538:2: KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_67 ) ) ( (lv_version_2_0= RULE_STRING ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleVersion3128); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVersionAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1542:1: ( (lv_keyword_1_0= KEYWORD_67 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1543:1: (lv_keyword_1_0= KEYWORD_67 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1543:1: (lv_keyword_1_0= KEYWORD_67 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1544:3: lv_keyword_1_0= KEYWORD_67
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleVersion3147); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVersionAccess().getKeywordVersionKeyword_1_0(), "keyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVersionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "keyword", lv_keyword_1_0, "version", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1564:2: ( (lv_version_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1565:1: (lv_version_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1565:1: (lv_version_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1566:3: lv_version_2_0= RULE_STRING
            {
            lv_version_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion3177); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1596:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1597:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1598:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkup_in_entryRuleMarkup3217);
            iv_ruleMarkup=ruleMarkup();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkup3227); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1605:1: ruleMarkup returns [EObject current=null] : ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_56 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        EObject lv_body_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1610:6: ( ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_56 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1611:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_56 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1611:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_56 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1612:2: KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_56 ) ) ( (lv_body_2_0= ruleMarkupBody ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleMarkup3263); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1616:1: ( (lv_keyword_1_0= KEYWORD_56 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1617:1: (lv_keyword_1_0= KEYWORD_56 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1617:1: (lv_keyword_1_0= KEYWORD_56 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1618:3: lv_keyword_1_0= KEYWORD_56
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleMarkup3282); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupAccess().getKeywordMarkupKeyword_1_0(), "keyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMarkupRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "keyword", lv_keyword_1_0, "markup", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1638:2: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1639:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1639:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1640:3: lv_body_2_0= ruleMarkupBody
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkup3316);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1670:1: entryRuleMarkupLines returns [EObject current=null] : iv_ruleMarkupLines= ruleMarkupLines EOF ;
    public final EObject entryRuleMarkupLines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupLines = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1671:2: (iv_ruleMarkupLines= ruleMarkupLines EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1672:2: iv_ruleMarkupLines= ruleMarkupLines EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupLinesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines3351);
            iv_ruleMarkupLines=ruleMarkupLines();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupLines; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupLines3361); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1679:1: ruleMarkupLines returns [EObject current=null] : ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_85 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkupLines() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        EObject lv_body_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1684:6: ( ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_85 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1685:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_85 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1685:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_85 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1686:2: KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_85 ) ) ( (lv_body_2_0= ruleMarkupBody ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleMarkupLines3397); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1690:1: ( (lv_keyword_1_0= KEYWORD_85 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1691:1: (lv_keyword_1_0= KEYWORD_85 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1691:1: (lv_keyword_1_0= KEYWORD_85 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1692:3: lv_keyword_1_0= KEYWORD_85
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_ruleMarkupLines3416); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupLinesAccess().getKeywordMarkuplinesKeyword_1_0(), "keyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMarkupLinesRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "keyword", lv_keyword_1_0, "markuplines", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1712:2: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1713:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1713:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1714:3: lv_body_2_0= ruleMarkupBody
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkupLines3450);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1744:1: entryRuleMarkupBody returns [EObject current=null] : iv_ruleMarkupBody= ruleMarkupBody EOF ;
    public final EObject entryRuleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupBody = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1745:2: (iv_ruleMarkupBody= ruleMarkupBody EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1746:2: iv_ruleMarkupBody= ruleMarkupBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupBodyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody3485);
            iv_ruleMarkupBody=ruleMarkupBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBody3495); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1753:1: ruleMarkupBody returns [EObject current=null] : ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) ;
    public final EObject ruleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject lv_command_1_1 = null;

        EObject lv_command_1_2 = null;

        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1758:6: ( ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1759:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1759:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1759:2: () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1759:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1760:2: 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1773:2: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case KEYWORD_17:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case KEYWORD_2:
                    {
                    int LA17_7 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case KEYWORD_3:
                    {
                    int LA17_8 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1774:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1774:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1775:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1775:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=KEYWORD_2 && LA16_0<=KEYWORD_3)) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==KEYWORD_17) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1775:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1776:3: lv_command_1_1= ruleScheme
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandSchemeParserRuleCall_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleScheme_in_ruleMarkupBody3555);
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
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1797:8: lv_command_1_2= ruleUnparsedCommand
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody3574);
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
            	    break loop17;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1821:3: ( (lv_block_2_0= ruleUnparsedBlock ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_20) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred44()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1822:1: (lv_block_2_0= ruleUnparsedBlock )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1822:1: (lv_block_2_0= ruleUnparsedBlock )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1823:3: lv_block_2_0= ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody3599);
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


    // $ANTLR start entryRuleBlockCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1853:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1854:2: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1855:2: iv_ruleBlockCommand= ruleBlockCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockCommand_in_entryRuleBlockCommand3635);
            iv_ruleBlockCommand=ruleBlockCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockCommand3645); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlockCommand


    // $ANTLR start ruleBlockCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1862:1: ruleBlockCommand returns [EObject current=null] : ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) ) ;
    public final EObject ruleBlockCommand() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        Token lv_keyword_1_4=null;
        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1867:6: ( ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1868:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1868:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1869:2: KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleBlockCommand3681); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlockCommandAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1873:1: ( ( (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1874:1: ( (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1874:1: ( (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1875:1: (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1875:1: (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 )
            int alt19=4;
            switch ( input.LA(1) ) {
            case KEYWORD_33:
                {
                alt19=1;
                }
                break;
            case KEYWORD_68:
                {
                alt19=2;
                }
                break;
            case KEYWORD_53:
                {
                alt19=3;
                }
                break;
            case KEYWORD_46:
                {
                alt19=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1875:1: (lv_keyword_1_1= KEYWORD_33 | lv_keyword_1_2= KEYWORD_68 | lv_keyword_1_3= KEYWORD_53 | lv_keyword_1_4= KEYWORD_46 )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1876:3: lv_keyword_1_1= KEYWORD_33
                    {
                    lv_keyword_1_1=(Token)input.LT(1);
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleBlockCommand3702); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockCommandAccess().getKeywordBookKeyword_1_0_0(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBlockCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1895:8: lv_keyword_1_2= KEYWORD_68
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleBlockCommand3732); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockCommandAccess().getKeywordBookpartKeyword_1_0_1(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBlockCommandRule().getType().getClassifier());
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1914:8: lv_keyword_1_3= KEYWORD_53
                    {
                    lv_keyword_1_3=(Token)input.LT(1);
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleBlockCommand3762); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockCommandAccess().getKeywordHeaderKeyword_1_0_2(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBlockCommandRule().getType().getClassifier());
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1933:8: lv_keyword_1_4= KEYWORD_46
                    {
                    lv_keyword_1_4=(Token)input.LT(1);
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleBlockCommand3792); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockCommandAccess().getKeywordScoreKeyword_1_0_3(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBlockCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_4, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1955:2: ( (lv_block_2_0= ruleSimpleBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1956:1: (lv_block_2_0= ruleSimpleBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1956:1: (lv_block_2_0= ruleSimpleBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1957:3: lv_block_2_0= ruleSimpleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockCommandAccess().getBlockSimpleBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlockCommand3829);
            lv_block_2_0=ruleSimpleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBlockCommandRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_2_0, 
              	        		"SimpleBlock", 
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
    // $ANTLR end ruleBlockCommand


    // $ANTLR start entryRuleOutputDefinition
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1987:1: entryRuleOutputDefinition returns [EObject current=null] : iv_ruleOutputDefinition= ruleOutputDefinition EOF ;
    public final EObject entryRuleOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDefinition = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1988:2: (iv_ruleOutputDefinition= ruleOutputDefinition EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1989:2: iv_ruleOutputDefinition= ruleOutputDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition3864);
            iv_ruleOutputDefinition=ruleOutputDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDefinition3874); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOutputDefinition


    // $ANTLR start ruleOutputDefinition
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1996:1: ruleOutputDefinition returns [EObject current=null] : ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleOutputDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2001:6: ( ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2002:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2002:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2003:2: KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleOutputDefinition3910); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputDefinitionAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2007:1: ( ( (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2008:1: ( (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2008:1: ( (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2009:1: (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2009:1: (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 )
            int alt20=3;
            switch ( input.LA(1) ) {
            case KEYWORD_45:
                {
                alt20=1;
                }
                break;
            case KEYWORD_35:
                {
                alt20=2;
                }
                break;
            case KEYWORD_54:
                {
                alt20=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2009:1: (lv_keyword_1_1= KEYWORD_45 | lv_keyword_1_2= KEYWORD_35 | lv_keyword_1_3= KEYWORD_54 )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2010:3: lv_keyword_1_1= KEYWORD_45
                    {
                    lv_keyword_1_1=(Token)input.LT(1);
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleOutputDefinition3931); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOutputDefinitionAccess().getKeywordPaperKeyword_1_0_0(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOutputDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2029:8: lv_keyword_1_2= KEYWORD_35
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleOutputDefinition3961); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOutputDefinitionAccess().getKeywordMidiKeyword_1_0_1(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOutputDefinitionRule().getType().getClassifier());
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2048:8: lv_keyword_1_3= KEYWORD_54
                    {
                    lv_keyword_1_3=(Token)input.LT(1);
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleOutputDefinition3991); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOutputDefinitionAccess().getKeywordLayoutKeyword_1_0_2(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOutputDefinitionRule().getType().getClassifier());
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

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2070:2: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2071:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2071:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2072:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOutputDefinitionAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleOutputDefinition4028);
            lv_block_2_0=ruleUnparsedBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputDefinitionRule().getType().getClassifier());
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
    // $ANTLR end ruleOutputDefinition


    // $ANTLR start entryRuleRelativeMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2102:1: entryRuleRelativeMusic returns [EObject current=null] : iv_ruleRelativeMusic= ruleRelativeMusic EOF ;
    public final EObject entryRuleRelativeMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2103:2: (iv_ruleRelativeMusic= ruleRelativeMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2104:2: iv_ruleRelativeMusic= ruleRelativeMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelativeMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic4063);
            iv_ruleRelativeMusic=ruleRelativeMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRelativeMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeMusic4073); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelativeMusic


    // $ANTLR start ruleRelativeMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2111:1: ruleRelativeMusic returns [EObject current=null] : ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_75 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) ) ;
    public final EObject ruleRelativeMusic() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        EObject lv_pitch_2_0 = null;

        EObject lv_music_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2116:6: ( ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_75 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2117:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_75 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2117:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_75 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2118:2: KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_75 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleRelativeMusic4109); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRelativeMusicAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2122:1: ( (lv_keyword_1_0= KEYWORD_75 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2123:1: (lv_keyword_1_0= KEYWORD_75 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2123:1: (lv_keyword_1_0= KEYWORD_75 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2124:3: lv_keyword_1_0= KEYWORD_75
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleRelativeMusic4128); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRelativeMusicAccess().getKeywordRelativeKeyword_1_0(), "keyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRelativeMusicRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "keyword", lv_keyword_1_0, "relative", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2144:2: ( (lv_pitch_2_0= rulePitch ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred50()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2145:1: (lv_pitch_2_0= rulePitch )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2145:1: (lv_pitch_2_0= rulePitch )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2146:3: lv_pitch_2_0= rulePitch
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePitch_in_ruleRelativeMusic4162);
                    lv_pitch_2_0=rulePitch();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRelativeMusicRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"pitch",
                      	        		lv_pitch_2_0, 
                      	        		"Pitch", 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2168:3: ( (lv_music_3_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2169:1: (lv_music_3_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2169:1: (lv_music_3_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2170:3: lv_music_3_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRelativeMusicAccess().getMusicExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRelativeMusic4184);
            lv_music_3_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRelativeMusicRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"music",
              	        		lv_music_3_0, 
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
    // $ANTLR end ruleRelativeMusic


    // $ANTLR start entryRulePitch
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2200:1: entryRulePitch returns [EObject current=null] : iv_rulePitch= rulePitch EOF ;
    public final EObject entryRulePitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePitch = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2201:2: (iv_rulePitch= rulePitch EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2202:2: iv_rulePitch= rulePitch EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPitchRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePitch_in_entryRulePitch4219);
            iv_rulePitch=rulePitch();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePitch4229); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePitch


    // $ANTLR start rulePitch
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2209:1: rulePitch returns [EObject current=null] : ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )? ) ;
    public final EObject rulePitch() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token lv_octaveCheck_1_0=null;
        Token lv_reminderAccidental_3_0=null;
        Token lv_cautionaryAccidental_4_0=null;
        EObject lv_octaveShift_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2214:6: ( ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2215:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2215:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2215:2: ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2215:2: ( (lv_base_0_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:1: (lv_base_0_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:1: (lv_base_0_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2217:3: lv_base_0_0= RULE_ID
            {
            lv_base_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePitch4271); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getPitchAccess().getBaseIDTerminalRuleCall_0_0(), "base"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPitchRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"base",
              	        		lv_base_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2239:2: ( (lv_octaveCheck_1_0= KEYWORD_12 ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_12) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred51()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2240:1: (lv_octaveCheck_1_0= KEYWORD_12 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2240:1: (lv_octaveCheck_1_0= KEYWORD_12 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2241:3: lv_octaveCheck_1_0= KEYWORD_12
                    {
                    lv_octaveCheck_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rulePitch4295); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPitchAccess().getOctaveCheckEqualsSignKeyword_1_0(), "octaveCheck"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPitchRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "octaveCheck", true, "=", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2261:3: ( (lv_octaveShift_2_0= ruleOctave ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_4) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred52()) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==KEYWORD_8) ) {
                int LA23_2 = input.LA(2);

                if ( (synpred52()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2262:1: (lv_octaveShift_2_0= ruleOctave )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2262:1: (lv_octaveShift_2_0= ruleOctave )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2263:3: lv_octaveShift_2_0= ruleOctave
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOctave_in_rulePitch4330);
                    lv_octaveShift_2_0=ruleOctave();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPitchRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"octaveShift",
                      	        		lv_octaveShift_2_0, 
                      	        		"Octave", 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2285:3: ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_1) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred53()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2286:1: (lv_reminderAccidental_3_0= KEYWORD_1 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2286:1: (lv_reminderAccidental_3_0= KEYWORD_1 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2287:3: lv_reminderAccidental_3_0= KEYWORD_1
                    {
                    lv_reminderAccidental_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePitch4350); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPitchAccess().getReminderAccidentalExclamationMarkKeyword_3_0(), "reminderAccidental"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPitchRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "reminderAccidental", true, "!", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2307:3: ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_14) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred54()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2308:1: (lv_cautionaryAccidental_4_0= KEYWORD_14 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2308:1: (lv_cautionaryAccidental_4_0= KEYWORD_14 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2309:3: lv_cautionaryAccidental_4_0= KEYWORD_14
                    {
                    lv_cautionaryAccidental_4_0=(Token)input.LT(1);
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rulePitch4383); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPitchAccess().getCautionaryAccidentalQuestionMarkKeyword_4_0(), "cautionaryAccidental"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPitchRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "cautionaryAccidental", true, "?", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
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
    // $ANTLR end rulePitch


    // $ANTLR start entryRuleOctave
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2337:1: entryRuleOctave returns [EObject current=null] : iv_ruleOctave= ruleOctave EOF ;
    public final EObject entryRuleOctave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctave = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2338:2: (iv_ruleOctave= ruleOctave EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2339:2: iv_ruleOctave= ruleOctave EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOctaveRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOctave_in_entryRuleOctave4432);
            iv_ruleOctave=ruleOctave();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOctave; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOctave4442); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOctave


    // $ANTLR start ruleOctave
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2346:1: ruleOctave returns [EObject current=null] : ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ ) ;
    public final EObject ruleOctave() throws RecognitionException {
        EObject current = null;

        Token lv_up_0_0=null;
        Token lv_down_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2351:6: ( ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2352:1: ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2352:1: ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_4) ) {
                alt28=1;
            }
            else if ( (LA28_0==KEYWORD_8) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2352:1: ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2352:2: ( (lv_up_0_0= KEYWORD_4 ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2352:2: ( (lv_up_0_0= KEYWORD_4 ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==KEYWORD_4) ) {
                            int LA26_84 = input.LA(2);

                            if ( (synpred55()) ) {
                                alt26=1;
                            }


                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2353:1: (lv_up_0_0= KEYWORD_4 )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2353:1: (lv_up_0_0= KEYWORD_4 )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2354:3: lv_up_0_0= KEYWORD_4
                    	    {
                    	    lv_up_0_0=(Token)input.LT(1);
                    	    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleOctave4486); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOctaveAccess().getUpApostropheKeyword_0_0(), "up"); 
                    	          
                    	    }
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOctaveRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "up", lv_up_0_0, "\'", lastConsumedNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2375:6: ( (lv_down_1_0= KEYWORD_8 ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2375:6: ( (lv_down_1_0= KEYWORD_8 ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==KEYWORD_8) ) {
                            int LA27_85 = input.LA(2);

                            if ( (synpred57()) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2376:1: (lv_down_1_0= KEYWORD_8 )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2376:1: (lv_down_1_0= KEYWORD_8 )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2377:3: lv_down_1_0= KEYWORD_8
                    	    {
                    	    lv_down_1_0=(Token)input.LT(1);
                    	    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOctave4525); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOctaveAccess().getDownCommaKeyword_1_0(), "down"); 
                    	          
                    	    }
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOctaveRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "down", lv_down_1_0, ",", lastConsumedNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (backtracking>0) {failed=true; return current;}
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
    // $ANTLR end ruleOctave


    // $ANTLR start entryRuleModeChange
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2405:1: entryRuleModeChange returns [EObject current=null] : iv_ruleModeChange= ruleModeChange EOF ;
    public final EObject entryRuleModeChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeChange = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2406:2: (iv_ruleModeChange= ruleModeChange EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2407:2: iv_ruleModeChange= ruleModeChange EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModeChangeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModeChange_in_entryRuleModeChange4574);
            iv_ruleModeChange=ruleModeChange();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModeChange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModeChange4584); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModeChange


    // $ANTLR start ruleModeChange
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2414:1: ruleModeChange returns [EObject current=null] : ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 ) ) ) ( (lv_music_2_0= ruleBlock ) ) ) ;
    public final EObject ruleModeChange() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        Token lv_keyword_1_4=null;
        Token lv_keyword_1_5=null;
        EObject lv_music_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2419:6: ( ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 ) ) ) ( (lv_music_2_0= ruleBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2420:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 ) ) ) ( (lv_music_2_0= ruleBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2420:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 ) ) ) ( (lv_music_2_0= ruleBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2421:2: KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 ) ) ) ( (lv_music_2_0= ruleBlock ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleModeChange4620); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModeChangeAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2425:1: ( ( (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2426:1: ( (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2426:1: ( (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2427:1: (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2427:1: (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 )
            int alt29=5;
            switch ( input.LA(1) ) {
            case KEYWORD_77:
                {
                alt29=1;
                }
                break;
            case KEYWORD_70:
                {
                alt29=2;
                }
                break;
            case KEYWORD_81:
                {
                alt29=3;
                }
                break;
            case KEYWORD_78:
                {
                alt29=4;
                }
                break;
            case KEYWORD_72:
                {
                alt29=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2427:1: (lv_keyword_1_1= KEYWORD_77 | lv_keyword_1_2= KEYWORD_70 | lv_keyword_1_3= KEYWORD_81 | lv_keyword_1_4= KEYWORD_78 | lv_keyword_1_5= KEYWORD_72 )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2428:3: lv_keyword_1_1= KEYWORD_77
                    {
                    lv_keyword_1_1=(Token)input.LT(1);
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleModeChange4641); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModeChangeAccess().getKeywordChordmodeKeyword_1_0_0(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModeChangeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2447:8: lv_keyword_1_2= KEYWORD_70
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleModeChange4671); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModeChangeAccess().getKeywordDrummodeKeyword_1_0_1(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModeChangeRule().getType().getClassifier());
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2466:8: lv_keyword_1_3= KEYWORD_81
                    {
                    lv_keyword_1_3=(Token)input.LT(1);
                    match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleModeChange4701); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModeChangeAccess().getKeywordFiguremodeKeyword_1_0_2(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModeChangeRule().getType().getClassifier());
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2485:8: lv_keyword_1_4= KEYWORD_78
                    {
                    lv_keyword_1_4=(Token)input.LT(1);
                    match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleModeChange4731); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModeChangeAccess().getKeywordLyricmodeKeyword_1_0_3(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModeChangeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_4, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2504:8: lv_keyword_1_5= KEYWORD_72
                    {
                    lv_keyword_1_5=(Token)input.LT(1);
                    match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleModeChange4761); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModeChangeAccess().getKeywordNotemodeKeyword_1_0_4(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModeChangeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_5, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2526:2: ( (lv_music_2_0= ruleBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2527:1: (lv_music_2_0= ruleBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2527:1: (lv_music_2_0= ruleBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2528:3: lv_music_2_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModeChangeAccess().getMusicBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleModeChange4798);
            lv_music_2_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModeChangeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"music",
              	        		lv_music_2_0, 
              	        		"Block", 
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
    // $ANTLR end ruleModeChange


    // $ANTLR start entryRuleNewContext
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2558:1: entryRuleNewContext returns [EObject current=null] : iv_ruleNewContext= ruleNewContext EOF ;
    public final EObject entryRuleNewContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContext = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2559:2: (iv_ruleNewContext= ruleNewContext EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2560:2: iv_ruleNewContext= ruleNewContext EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNewContextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNewContext_in_entryRuleNewContext4833);
            iv_ruleNewContext=ruleNewContext();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNewContext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewContext4843); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNewContext


    // $ANTLR start ruleNewContext
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2567:1: ruleNewContext returns [EObject current=null] : ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) ) ;
    public final EObject ruleNewContext() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_context_2_0=null;
        Token lv_id_4_1=null;
        Token lv_id_4_2=null;
        EObject lv_modification_5_0 = null;

        EObject lv_music_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2572:6: ( ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2573:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2573:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2574:2: KEYWORD_17 ( ( (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleNewContext4879); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNewContextAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2578:1: ( ( (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2579:1: ( (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2579:1: ( (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2580:1: (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2580:1: (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_31) ) {
                alt30=1;
            }
            else if ( (LA30_0==KEYWORD_62) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2580:1: (lv_keyword_1_1= KEYWORD_31 | lv_keyword_1_2= KEYWORD_62 )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2581:3: lv_keyword_1_1= KEYWORD_31
                    {
                    lv_keyword_1_1=(Token)input.LT(1);
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleNewContext4900); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNewContextAccess().getKeywordNewKeyword_1_0_0(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNewContextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "keyword", lv_keyword_1_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2600:8: lv_keyword_1_2= KEYWORD_62
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleNewContext4930); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNewContextAccess().getKeywordContextKeyword_1_0_1(), "keyword"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNewContextRule().getType().getClassifier());
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

            }


            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2622:2: ( (lv_context_2_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2623:1: (lv_context_2_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2623:1: (lv_context_2_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2624:3: lv_context_2_0= RULE_ID
            {
            lv_context_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewContext4963); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNewContextAccess().getContextIDTerminalRuleCall_2_0(), "context"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNewContextRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"context",
              	        		lv_context_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2646:2: ( KEYWORD_12 ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_12) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred64()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2647:2: KEYWORD_12 ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
                    {
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleNewContext4980); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNewContextAccess().getEqualsSignKeyword_3_0(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2651:1: ( ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2652:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2652:1: ( (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2653:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2653:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_STRING) ) {
                        alt31=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2653:1: (lv_id_4_1= RULE_ID | lv_id_4_2= RULE_STRING )", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2654:3: lv_id_4_1= RULE_ID
                            {
                            lv_id_4_1=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewContext4999); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getNewContextAccess().getIdIDTerminalRuleCall_3_1_0_0(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getNewContextRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_4_1, 
                              	        		"ID", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2675:8: lv_id_4_2= RULE_STRING
                            {
                            lv_id_4_2=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNewContext5019); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getNewContextAccess().getIdSTRINGTerminalRuleCall_3_1_0_1(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getNewContextRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_4_2, 
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


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2699:4: ( (lv_modification_5_0= ruleContextModification ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_17) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred65()) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2700:1: (lv_modification_5_0= ruleContextModification )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2700:1: (lv_modification_5_0= ruleContextModification )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2701:3: lv_modification_5_0= ruleContextModification
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContextModification_in_ruleNewContext5050);
                    lv_modification_5_0=ruleContextModification();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNewContextRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"modification",
                      	        		lv_modification_5_0, 
                      	        		"ContextModification", 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2723:3: ( (lv_music_6_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2724:1: (lv_music_6_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2724:1: (lv_music_6_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2725:3: lv_music_6_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getMusicExpressionParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNewContext5072);
            lv_music_6_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNewContextRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"music",
              	        		lv_music_6_0, 
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
    // $ANTLR end ruleNewContext


    // $ANTLR start entryRuleContextModification
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2755:1: entryRuleContextModification returns [EObject current=null] : iv_ruleContextModification= ruleContextModification EOF ;
    public final EObject entryRuleContextModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModification = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2756:2: (iv_ruleContextModification= ruleContextModification EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2757:2: iv_ruleContextModification= ruleContextModification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextModificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextModification_in_entryRuleContextModification5107);
            iv_ruleContextModification=ruleContextModification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextModification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextModification5117); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextModification


    // $ANTLR start ruleContextModification
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2764:1: ruleContextModification returns [EObject current=null] : ( KEYWORD_17 KEYWORD_42 ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleContextModification() throws RecognitionException {
        EObject current = null;

        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2769:6: ( ( KEYWORD_17 KEYWORD_42 ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2770:1: ( KEYWORD_17 KEYWORD_42 ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2770:1: ( KEYWORD_17 KEYWORD_42 ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2771:2: KEYWORD_17 KEYWORD_42 ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleContextModification5153); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextModificationAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleContextModification5164); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextModificationAccess().getWithKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2780:1: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2781:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2781:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2782:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getContextModificationAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContextModification5185);
            lv_block_2_0=ruleUnparsedBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getContextModificationRule().getType().getClassifier());
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
    // $ANTLR end ruleContextModification


    // $ANTLR start entryRuleContextDef
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2812:1: entryRuleContextDef returns [EObject current=null] : iv_ruleContextDef= ruleContextDef EOF ;
    public final EObject entryRuleContextDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDef = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2813:2: (iv_ruleContextDef= ruleContextDef EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2814:2: iv_ruleContextDef= ruleContextDef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextDefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextDef_in_entryRuleContextDef5220);
            iv_ruleContextDef=ruleContextDef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDef5230); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextDef


    // $ANTLR start ruleContextDef
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2821:1: ruleContextDef returns [EObject current=null] : ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_62 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleContextDef() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2826:6: ( ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_62 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2827:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_62 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2827:1: ( KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_62 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2828:2: KEYWORD_17 ( (lv_keyword_1_0= KEYWORD_62 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleContextDef5266); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextDefAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2832:1: ( (lv_keyword_1_0= KEYWORD_62 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2833:1: (lv_keyword_1_0= KEYWORD_62 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2833:1: (lv_keyword_1_0= KEYWORD_62 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2834:3: lv_keyword_1_0= KEYWORD_62
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleContextDef5285); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextDefAccess().getKeywordContextKeyword_1_0(), "keyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getContextDefRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "keyword", lv_keyword_1_0, "context", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2854:2: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2855:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2855:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2856:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getContextDefAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContextDef5319);
            lv_block_2_0=ruleUnparsedBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getContextDefRule().getType().getClassifier());
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
    // $ANTLR end ruleContextDef


    // $ANTLR start entryRuleOther
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2886:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2887:2: (iv_ruleOther= ruleOther EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2888:2: iv_ruleOther= ruleOther EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOtherRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOther_in_entryRuleOther5354);
            iv_ruleOther=ruleOther();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOther; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOther5364); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2895:1: ruleOther returns [EObject current=null] : ( KEYWORD_17 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        AntlrDatatypeRuleToken lv_keyword_1_1 = null;

        AntlrDatatypeRuleToken lv_keyword_1_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2900:6: ( ( KEYWORD_17 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2901:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2901:1: ( KEYWORD_17 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2902:2: KEYWORD_17 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) )
            {
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleOther5400); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOtherAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2906:1: ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2907:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2907:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2908:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2908:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )
            int alt34=4;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_22:
                {
                alt34=1;
                }
                break;
            case KEYWORD_5:
                {
                alt34=2;
                }
                break;
            case KEYWORD_6:
                {
                alt34=3;
                }
                break;
            case KEYWORD_90:
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_82:
            case KEYWORD_76:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_69:
            case KEYWORD_71:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_61:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_66:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_55:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_34:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_32:
                {
                alt34=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2908:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2909:3: lv_keyword_1_1= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOtherAccess().getKeywordSpecialCharacterParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleOther5423);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2930:8: lv_keyword_1_2= KEYWORD_5
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleOther5440); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2949:8: lv_keyword_1_3= KEYWORD_6
                    {
                    lv_keyword_1_3=(Token)input.LT(1);
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleOther5470); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2968:8: lv_keyword_1_4= ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOtherAccess().getKeywordOtherNameParserRuleCall_1_0_3(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleOther5502);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3000:1: entryRuleOtherName returns [String current=null] : iv_ruleOtherName= ruleOtherName EOF ;
    public final String entryRuleOtherName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOtherName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3001:1: (iv_ruleOtherName= ruleOtherName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3002:2: iv_ruleOtherName= ruleOtherName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOtherNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOtherName_in_entryRuleOtherName5541);
            iv_ruleOtherName=ruleOtherName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOtherName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherName5552); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3009:1: ruleOtherName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_61 | kw= KEYWORD_76 | kw= KEYWORD_43 | kw= KEYWORD_83 | kw= KEYWORD_50 | kw= KEYWORD_51 | kw= KEYWORD_69 | kw= KEYWORD_63 | kw= KEYWORD_86 | kw= KEYWORD_52 | kw= KEYWORD_84 | kw= KEYWORD_44 | kw= KEYWORD_64 | kw= KEYWORD_90 | kw= KEYWORD_30 | kw= KEYWORD_55 | kw= KEYWORD_71 | kw= KEYWORD_79 | kw= KEYWORD_34 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_57 | kw= KEYWORD_37 | kw= KEYWORD_74 | kw= KEYWORD_66 | kw= KEYWORD_58 | kw= KEYWORD_59 | kw= KEYWORD_38 | kw= KEYWORD_60 | kw= KEYWORD_82 | kw= KEYWORD_32 | kw= KEYWORD_87 | kw= KEYWORD_39 | kw= KEYWORD_88 | kw= KEYWORD_89 | kw= KEYWORD_47 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_80 | kw= KEYWORD_41 | kw= KEYWORD_49 | kw= KEYWORD_42 ) ;
    public final AntlrDatatypeRuleToken ruleOtherName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3014:6: ( (kw= KEYWORD_61 | kw= KEYWORD_76 | kw= KEYWORD_43 | kw= KEYWORD_83 | kw= KEYWORD_50 | kw= KEYWORD_51 | kw= KEYWORD_69 | kw= KEYWORD_63 | kw= KEYWORD_86 | kw= KEYWORD_52 | kw= KEYWORD_84 | kw= KEYWORD_44 | kw= KEYWORD_64 | kw= KEYWORD_90 | kw= KEYWORD_30 | kw= KEYWORD_55 | kw= KEYWORD_71 | kw= KEYWORD_79 | kw= KEYWORD_34 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_57 | kw= KEYWORD_37 | kw= KEYWORD_74 | kw= KEYWORD_66 | kw= KEYWORD_58 | kw= KEYWORD_59 | kw= KEYWORD_38 | kw= KEYWORD_60 | kw= KEYWORD_82 | kw= KEYWORD_32 | kw= KEYWORD_87 | kw= KEYWORD_39 | kw= KEYWORD_88 | kw= KEYWORD_89 | kw= KEYWORD_47 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_80 | kw= KEYWORD_41 | kw= KEYWORD_49 | kw= KEYWORD_42 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3015:1: (kw= KEYWORD_61 | kw= KEYWORD_76 | kw= KEYWORD_43 | kw= KEYWORD_83 | kw= KEYWORD_50 | kw= KEYWORD_51 | kw= KEYWORD_69 | kw= KEYWORD_63 | kw= KEYWORD_86 | kw= KEYWORD_52 | kw= KEYWORD_84 | kw= KEYWORD_44 | kw= KEYWORD_64 | kw= KEYWORD_90 | kw= KEYWORD_30 | kw= KEYWORD_55 | kw= KEYWORD_71 | kw= KEYWORD_79 | kw= KEYWORD_34 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_57 | kw= KEYWORD_37 | kw= KEYWORD_74 | kw= KEYWORD_66 | kw= KEYWORD_58 | kw= KEYWORD_59 | kw= KEYWORD_38 | kw= KEYWORD_60 | kw= KEYWORD_82 | kw= KEYWORD_32 | kw= KEYWORD_87 | kw= KEYWORD_39 | kw= KEYWORD_88 | kw= KEYWORD_89 | kw= KEYWORD_47 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_80 | kw= KEYWORD_41 | kw= KEYWORD_49 | kw= KEYWORD_42 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3015:1: (kw= KEYWORD_61 | kw= KEYWORD_76 | kw= KEYWORD_43 | kw= KEYWORD_83 | kw= KEYWORD_50 | kw= KEYWORD_51 | kw= KEYWORD_69 | kw= KEYWORD_63 | kw= KEYWORD_86 | kw= KEYWORD_52 | kw= KEYWORD_84 | kw= KEYWORD_44 | kw= KEYWORD_64 | kw= KEYWORD_90 | kw= KEYWORD_30 | kw= KEYWORD_55 | kw= KEYWORD_71 | kw= KEYWORD_79 | kw= KEYWORD_34 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_57 | kw= KEYWORD_37 | kw= KEYWORD_74 | kw= KEYWORD_66 | kw= KEYWORD_58 | kw= KEYWORD_59 | kw= KEYWORD_38 | kw= KEYWORD_60 | kw= KEYWORD_82 | kw= KEYWORD_32 | kw= KEYWORD_87 | kw= KEYWORD_39 | kw= KEYWORD_88 | kw= KEYWORD_89 | kw= KEYWORD_47 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_80 | kw= KEYWORD_41 | kw= KEYWORD_49 | kw= KEYWORD_42 )
            int alt35=42;
            switch ( input.LA(1) ) {
            case KEYWORD_61:
                {
                alt35=1;
                }
                break;
            case KEYWORD_76:
                {
                alt35=2;
                }
                break;
            case KEYWORD_43:
                {
                alt35=3;
                }
                break;
            case KEYWORD_83:
                {
                alt35=4;
                }
                break;
            case KEYWORD_50:
                {
                alt35=5;
                }
                break;
            case KEYWORD_51:
                {
                alt35=6;
                }
                break;
            case KEYWORD_69:
                {
                alt35=7;
                }
                break;
            case KEYWORD_63:
                {
                alt35=8;
                }
                break;
            case KEYWORD_86:
                {
                alt35=9;
                }
                break;
            case KEYWORD_52:
                {
                alt35=10;
                }
                break;
            case KEYWORD_84:
                {
                alt35=11;
                }
                break;
            case KEYWORD_44:
                {
                alt35=12;
                }
                break;
            case KEYWORD_64:
                {
                alt35=13;
                }
                break;
            case KEYWORD_90:
                {
                alt35=14;
                }
                break;
            case KEYWORD_30:
                {
                alt35=15;
                }
                break;
            case KEYWORD_55:
                {
                alt35=16;
                }
                break;
            case KEYWORD_71:
                {
                alt35=17;
                }
                break;
            case KEYWORD_79:
                {
                alt35=18;
                }
                break;
            case KEYWORD_34:
                {
                alt35=19;
                }
                break;
            case KEYWORD_36:
                {
                alt35=20;
                }
                break;
            case KEYWORD_73:
                {
                alt35=21;
                }
                break;
            case KEYWORD_57:
                {
                alt35=22;
                }
                break;
            case KEYWORD_37:
                {
                alt35=23;
                }
                break;
            case KEYWORD_74:
                {
                alt35=24;
                }
                break;
            case KEYWORD_66:
                {
                alt35=25;
                }
                break;
            case KEYWORD_58:
                {
                alt35=26;
                }
                break;
            case KEYWORD_59:
                {
                alt35=27;
                }
                break;
            case KEYWORD_38:
                {
                alt35=28;
                }
                break;
            case KEYWORD_60:
                {
                alt35=29;
                }
                break;
            case KEYWORD_82:
                {
                alt35=30;
                }
                break;
            case KEYWORD_32:
                {
                alt35=31;
                }
                break;
            case KEYWORD_87:
                {
                alt35=32;
                }
                break;
            case KEYWORD_39:
                {
                alt35=33;
                }
                break;
            case KEYWORD_88:
                {
                alt35=34;
                }
                break;
            case KEYWORD_89:
                {
                alt35=35;
                }
                break;
            case KEYWORD_47:
                {
                alt35=36;
                }
                break;
            case KEYWORD_40:
                {
                alt35=37;
                }
                break;
            case KEYWORD_48:
                {
                alt35=38;
                }
                break;
            case KEYWORD_80:
                {
                alt35=39;
                }
                break;
            case KEYWORD_41:
                {
                alt35=40;
                }
                break;
            case KEYWORD_49:
                {
                alt35=41;
                }
                break;
            case KEYWORD_42:
                {
                alt35=42;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3015:1: (kw= KEYWORD_61 | kw= KEYWORD_76 | kw= KEYWORD_43 | kw= KEYWORD_83 | kw= KEYWORD_50 | kw= KEYWORD_51 | kw= KEYWORD_69 | kw= KEYWORD_63 | kw= KEYWORD_86 | kw= KEYWORD_52 | kw= KEYWORD_84 | kw= KEYWORD_44 | kw= KEYWORD_64 | kw= KEYWORD_90 | kw= KEYWORD_30 | kw= KEYWORD_55 | kw= KEYWORD_71 | kw= KEYWORD_79 | kw= KEYWORD_34 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_57 | kw= KEYWORD_37 | kw= KEYWORD_74 | kw= KEYWORD_66 | kw= KEYWORD_58 | kw= KEYWORD_59 | kw= KEYWORD_38 | kw= KEYWORD_60 | kw= KEYWORD_82 | kw= KEYWORD_32 | kw= KEYWORD_87 | kw= KEYWORD_39 | kw= KEYWORD_88 | kw= KEYWORD_89 | kw= KEYWORD_47 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_80 | kw= KEYWORD_41 | kw= KEYWORD_49 | kw= KEYWORD_42 )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3016:2: kw= KEYWORD_61
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleOtherName5590); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3023:2: kw= KEYWORD_76
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleOtherName5609); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3030:2: kw= KEYWORD_43
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleOtherName5628); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAliasKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3037:2: kw= KEYWORD_83
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleOtherName5647); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3044:2: kw= KEYWORD_50
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleOtherName5666); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getChangeKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3051:2: kw= KEYWORD_51
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleOtherName5685); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getChordsKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3058:2: kw= KEYWORD_69
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleOtherName5704); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getConsistsKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3065:2: kw= KEYWORD_63
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleOtherName5723); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDefaultKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3072:2: kw= KEYWORD_86
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_ruleOtherName5742); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3079:2: kw= KEYWORD_52
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleOtherName5761); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDeniesKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3086:2: kw= KEYWORD_84
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleOtherName5780); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDescriptionKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3093:2: kw= KEYWORD_44
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOtherName5799); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDrumsKeyword_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3100:2: kw= KEYWORD_64
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleOtherName5818); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getFiguresKeyword_12(), null); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3107:2: kw= KEYWORD_90
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_90,FOLLOW_KEYWORD_90_in_ruleOtherName5837); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3114:2: kw= KEYWORD_30
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleOtherName5856); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getKeyKeyword_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3121:2: kw= KEYWORD_55
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleOtherName5875); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLyricsKeyword_15(), null); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3128:2: kw= KEYWORD_71
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleOtherName5894); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLyricstoKeyword_16(), null); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3135:2: kw= KEYWORD_79
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleOtherName5913); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getMaininputKeyword_17(), null); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3142:2: kw= KEYWORD_34
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleOtherName5932); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getMarkKeyword_18(), null); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3149:2: kw= KEYWORD_36
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleOtherName5951); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getNameKeyword_19(), null); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3156:2: kw= KEYWORD_73
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleOtherName5970); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getObjectidKeyword_20(), null); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3163:2: kw= KEYWORD_57
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleOtherName5989); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOctaveKeyword_21(), null); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3170:2: kw= KEYWORD_37
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleOtherName6008); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOnceKeyword_22(), null); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3177:2: kw= KEYWORD_74
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleOtherName6027); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOverrideKeyword_23(), null); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3184:2: kw= KEYWORD_66
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleOtherName6046); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getPartialKeyword_24(), null); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3191:2: kw= KEYWORD_58
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleOtherName6065); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRemoveKeyword_25(), null); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3198:2: kw= KEYWORD_59
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleOtherName6084); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRepeatKeyword_26(), null); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3205:2: kw= KEYWORD_38
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleOtherName6103); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRestKeyword_27(), null); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3212:2: kw= KEYWORD_60
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleOtherName6122); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRevertKeyword_28(), null); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3219:2: kw= KEYWORD_82
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleOtherName6141); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSequentialKeyword_29(), null); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3226:2: kw= KEYWORD_32
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleOtherName6160); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSetKeyword_30(), null); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3233:2: kw= KEYWORD_87
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_ruleOtherName6179); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_31(), null); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3240:2: kw= KEYWORD_39
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleOtherName6198); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSkipKeyword_32(), null); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3247:2: kw= KEYWORD_88
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_ruleOtherName6217); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_33(), null); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3254:2: kw= KEYWORD_89
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_89,FOLLOW_KEYWORD_89_in_ruleOtherName6236); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_34(), null); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3261:2: kw= KEYWORD_47
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleOtherName6255); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTempoKeyword_35(), null); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3268:2: kw= KEYWORD_40
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleOtherName6274); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTimeKeyword_36(), null); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3275:2: kw= KEYWORD_48
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleOtherName6293); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTimesKeyword_37(), null); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3282:2: kw= KEYWORD_80
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleOtherName6312); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTransposeKeyword_38(), null); 
                          
                    }

                    }
                    break;
                case 40 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3289:2: kw= KEYWORD_41
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleOtherName6331); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTypeKeyword_39(), null); 
                          
                    }

                    }
                    break;
                case 41 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3296:2: kw= KEYWORD_49
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleOtherName6350); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getUnsetKeyword_40(), null); 
                          
                    }

                    }
                    break;
                case 42 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3303:2: kw= KEYWORD_42
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleOtherName6369); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getWithKeyword_41(), null); 
                          
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3316:1: entryRuleSpecialCommandName returns [String current=null] : iv_ruleSpecialCommandName= ruleSpecialCommandName EOF ;
    public final String entryRuleSpecialCommandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCommandName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3317:1: (iv_ruleSpecialCommandName= ruleSpecialCommandName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3318:2: iv_ruleSpecialCommandName= ruleSpecialCommandName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCommandNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName6409);
            iv_ruleSpecialCommandName=ruleSpecialCommandName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCommandName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommandName6420); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3325:1: ruleSpecialCommandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_65 | kw= KEYWORD_67 | kw= KEYWORD_56 | kw= KEYWORD_85 | kw= KEYWORD_33 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_45 | kw= KEYWORD_35 | kw= KEYWORD_54 | kw= KEYWORD_75 | kw= KEYWORD_77 | kw= KEYWORD_70 | kw= KEYWORD_81 | kw= KEYWORD_78 | kw= KEYWORD_72 | kw= KEYWORD_31 | kw= KEYWORD_42 | this_OtherName_20= ruleOtherName ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCommandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OtherName_20 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3330:6: ( (kw= KEYWORD_65 | kw= KEYWORD_67 | kw= KEYWORD_56 | kw= KEYWORD_85 | kw= KEYWORD_33 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_45 | kw= KEYWORD_35 | kw= KEYWORD_54 | kw= KEYWORD_75 | kw= KEYWORD_77 | kw= KEYWORD_70 | kw= KEYWORD_81 | kw= KEYWORD_78 | kw= KEYWORD_72 | kw= KEYWORD_31 | kw= KEYWORD_42 | this_OtherName_20= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3331:1: (kw= KEYWORD_65 | kw= KEYWORD_67 | kw= KEYWORD_56 | kw= KEYWORD_85 | kw= KEYWORD_33 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_45 | kw= KEYWORD_35 | kw= KEYWORD_54 | kw= KEYWORD_75 | kw= KEYWORD_77 | kw= KEYWORD_70 | kw= KEYWORD_81 | kw= KEYWORD_78 | kw= KEYWORD_72 | kw= KEYWORD_31 | kw= KEYWORD_42 | this_OtherName_20= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3331:1: (kw= KEYWORD_65 | kw= KEYWORD_67 | kw= KEYWORD_56 | kw= KEYWORD_85 | kw= KEYWORD_33 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_45 | kw= KEYWORD_35 | kw= KEYWORD_54 | kw= KEYWORD_75 | kw= KEYWORD_77 | kw= KEYWORD_70 | kw= KEYWORD_81 | kw= KEYWORD_78 | kw= KEYWORD_72 | kw= KEYWORD_31 | kw= KEYWORD_42 | this_OtherName_20= ruleOtherName )
            int alt36=21;
            switch ( input.LA(1) ) {
            case KEYWORD_65:
                {
                alt36=1;
                }
                break;
            case KEYWORD_67:
                {
                alt36=2;
                }
                break;
            case KEYWORD_56:
                {
                alt36=3;
                }
                break;
            case KEYWORD_85:
                {
                alt36=4;
                }
                break;
            case KEYWORD_33:
                {
                alt36=5;
                }
                break;
            case KEYWORD_68:
                {
                alt36=6;
                }
                break;
            case KEYWORD_62:
                {
                alt36=7;
                }
                break;
            case KEYWORD_53:
                {
                alt36=8;
                }
                break;
            case KEYWORD_46:
                {
                alt36=9;
                }
                break;
            case KEYWORD_45:
                {
                alt36=10;
                }
                break;
            case KEYWORD_35:
                {
                alt36=11;
                }
                break;
            case KEYWORD_54:
                {
                alt36=12;
                }
                break;
            case KEYWORD_75:
                {
                alt36=13;
                }
                break;
            case KEYWORD_77:
                {
                alt36=14;
                }
                break;
            case KEYWORD_70:
                {
                alt36=15;
                }
                break;
            case KEYWORD_81:
                {
                alt36=16;
                }
                break;
            case KEYWORD_78:
                {
                alt36=17;
                }
                break;
            case KEYWORD_72:
                {
                alt36=18;
                }
                break;
            case KEYWORD_31:
                {
                alt36=19;
                }
                break;
            case KEYWORD_42:
                {
                int LA36_20 = input.LA(2);

                if ( (synpred129()) ) {
                    alt36=20;
                }
                else if ( (true) ) {
                    alt36=21;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3331:1: (kw= KEYWORD_65 | kw= KEYWORD_67 | kw= KEYWORD_56 | kw= KEYWORD_85 | kw= KEYWORD_33 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_45 | kw= KEYWORD_35 | kw= KEYWORD_54 | kw= KEYWORD_75 | kw= KEYWORD_77 | kw= KEYWORD_70 | kw= KEYWORD_81 | kw= KEYWORD_78 | kw= KEYWORD_72 | kw= KEYWORD_31 | kw= KEYWORD_42 | this_OtherName_20= ruleOtherName )", 36, 20, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_90:
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_82:
            case KEYWORD_76:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_69:
            case KEYWORD_71:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_61:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_66:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_55:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_34:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_30:
            case KEYWORD_32:
                {
                alt36=21;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3331:1: (kw= KEYWORD_65 | kw= KEYWORD_67 | kw= KEYWORD_56 | kw= KEYWORD_85 | kw= KEYWORD_33 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_45 | kw= KEYWORD_35 | kw= KEYWORD_54 | kw= KEYWORD_75 | kw= KEYWORD_77 | kw= KEYWORD_70 | kw= KEYWORD_81 | kw= KEYWORD_78 | kw= KEYWORD_72 | kw= KEYWORD_31 | kw= KEYWORD_42 | this_OtherName_20= ruleOtherName )", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3332:2: kw= KEYWORD_65
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleSpecialCommandName6458); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3339:2: kw= KEYWORD_67
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleSpecialCommandName6477); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3346:2: kw= KEYWORD_56
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleSpecialCommandName6496); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3353:2: kw= KEYWORD_85
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_ruleSpecialCommandName6515); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3360:2: kw= KEYWORD_33
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleSpecialCommandName6534); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getBookKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3367:2: kw= KEYWORD_68
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleSpecialCommandName6553); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getBookpartKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3374:2: kw= KEYWORD_62
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSpecialCommandName6572); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3381:2: kw= KEYWORD_53
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleSpecialCommandName6591); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getHeaderKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3388:2: kw= KEYWORD_46
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleSpecialCommandName6610); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getScoreKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3395:2: kw= KEYWORD_45
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleSpecialCommandName6629); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getPaperKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3402:2: kw= KEYWORD_35
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleSpecialCommandName6648); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getMidiKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3409:2: kw= KEYWORD_54
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleSpecialCommandName6667); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getLayoutKeyword_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3416:2: kw= KEYWORD_75
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleSpecialCommandName6686); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getRelativeKeyword_12(), null); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3423:2: kw= KEYWORD_77
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleSpecialCommandName6705); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getChordmodeKeyword_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3430:2: kw= KEYWORD_70
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleSpecialCommandName6724); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getDrummodeKeyword_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3437:2: kw= KEYWORD_81
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleSpecialCommandName6743); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getFiguremodeKeyword_15(), null); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3444:2: kw= KEYWORD_78
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleSpecialCommandName6762); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getLyricmodeKeyword_16(), null); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3451:2: kw= KEYWORD_72
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleSpecialCommandName6781); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getNotemodeKeyword_17(), null); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3458:2: kw= KEYWORD_31
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleSpecialCommandName6800); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getNewKeyword_18(), null); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3465:2: kw= KEYWORD_42
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleSpecialCommandName6819); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getWithKeyword_19(), null); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3472:5: this_OtherName_20= ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandNameAccess().getOtherNameParserRuleCall_20(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleSpecialCommandName6847);
                    this_OtherName_20=ruleOtherName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_OtherName_20);
                          
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


    // $ANTLR start entryRuleScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3490:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3494:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3495:2: iv_ruleScheme= ruleScheme EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme6897);
            iv_ruleScheme=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme6907); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3505:1: ruleScheme returns [EObject current=null] : ( ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3511:6: ( ( ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3512:1: ( ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3512:1: ( ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3512:2: ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3512:2: ( KEYWORD_2 | KEYWORD_3 )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_2) ) {
                alt37=1;
            }
            else if ( (LA37_0==KEYWORD_3) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3512:2: ( KEYWORD_2 | KEYWORD_3 )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3513:2: KEYWORD_2
                    {
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleScheme6948); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeAccess().getNumberSignKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3519:2: KEYWORD_3
                    {
                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleScheme6965); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeAccess().getDollarSignKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3523:2: ( (lv_value_2_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3524:1: (lv_value_2_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3524:1: (lv_value_2_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3525:3: lv_value_2_0= ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme6987);
            lv_value_2_0=ruleSchemeExpression();
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
              	        		lv_value_2_0, 
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3558:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3559:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3560:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression7026);
            iv_ruleSchemeExpression=ruleSchemeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression7036); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3567:1: ruleSchemeExpression returns [EObject current=null] : ( ( (lv_reference_0_0= KEYWORD_3 ) )? ( ( (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 ) ) )* ( (lv_value_2_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_reference_0_0=null;
        Token lv_quotations_1_1=null;
        Token lv_quotations_1_2=null;
        Token lv_quotations_1_3=null;
        Token lv_quotations_1_4=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3572:6: ( ( ( (lv_reference_0_0= KEYWORD_3 ) )? ( ( (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 ) ) )* ( (lv_value_2_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3573:1: ( ( (lv_reference_0_0= KEYWORD_3 ) )? ( ( (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 ) ) )* ( (lv_value_2_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3573:1: ( ( (lv_reference_0_0= KEYWORD_3 ) )? ( ( (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 ) ) )* ( (lv_value_2_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3573:2: ( (lv_reference_0_0= KEYWORD_3 ) )? ( ( (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 ) ) )* ( (lv_value_2_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3573:2: ( (lv_reference_0_0= KEYWORD_3 ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_3) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3574:1: (lv_reference_0_0= KEYWORD_3 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3574:1: (lv_reference_0_0= KEYWORD_3 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3575:3: lv_reference_0_0= KEYWORD_3
                    {
                    lv_reference_0_0=(Token)input.LT(1);
                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSchemeExpression7080); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeExpressionAccess().getReferenceDollarSignKeyword_0_0(), "reference"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "reference", true, "$", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3595:3: ( ( (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==KEYWORD_4||LA40_0==KEYWORD_8||LA40_0==KEYWORD_15||LA40_0==KEYWORD_19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3596:1: ( (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 ) )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3596:1: ( (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 ) )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3597:1: (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3597:1: (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 )
            	    int alt39=4;
            	    switch ( input.LA(1) ) {
            	    case KEYWORD_4:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case KEYWORD_19:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case KEYWORD_8:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case KEYWORD_15:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("3597:1: (lv_quotations_1_1= KEYWORD_4 | lv_quotations_1_2= KEYWORD_19 | lv_quotations_1_3= KEYWORD_8 | lv_quotations_1_4= KEYWORD_15 )", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3598:3: lv_quotations_1_1= KEYWORD_4
            	            {
            	            lv_quotations_1_1=(Token)input.LT(1);
            	            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSchemeExpression7115); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getSchemeExpressionAccess().getQuotationsApostropheKeyword_1_0_0(), "quotations"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "quotations", lv_quotations_1_1, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3617:8: lv_quotations_1_2= KEYWORD_19
            	            {
            	            lv_quotations_1_2=(Token)input.LT(1);
            	            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleSchemeExpression7145); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getSchemeExpressionAccess().getQuotationsGraveAccentKeyword_1_0_1(), "quotations"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "quotations", lv_quotations_1_2, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3636:8: lv_quotations_1_3= KEYWORD_8
            	            {
            	            lv_quotations_1_3=(Token)input.LT(1);
            	            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSchemeExpression7175); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getSchemeExpressionAccess().getQuotationsCommaKeyword_1_0_2(), "quotations"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "quotations", lv_quotations_1_3, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3655:8: lv_quotations_1_4= KEYWORD_15
            	            {
            	            lv_quotations_1_4=(Token)input.LT(1);
            	            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleSchemeExpression7205); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getSchemeExpressionAccess().getQuotationsCommercialAtKeyword_1_0_3(), "quotations"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getSchemeExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "quotations", lv_quotations_1_4, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3677:3: ( (lv_value_2_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3678:1: (lv_value_2_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3678:1: (lv_value_2_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3679:3: lv_value_2_0= ruleSchemeValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression7243);
            lv_value_2_0=ruleSchemeValue();
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
              	        		lv_value_2_0, 
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3709:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3710:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3711:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue7278);
            iv_ruleSchemeValue=ruleSchemeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue7288); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3718:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3723:6: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3724:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3724:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            int alt41=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_ID) ) {
                    int LA41_8 = input.LA(3);

                    if ( (synpred136()) ) {
                        alt41=1;
                    }
                    else if ( (synpred141()) ) {
                        alt41=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3724:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 41, 8, input);

                        throw nvae;
                    }
                }
                else if ( (LA41_1==KEYWORD_5) ) {
                    alt41=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3724:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                alt41=2;
                }
                break;
            case KEYWORD_25:
                {
                alt41=3;
                }
                break;
            case KEYWORD_24:
                {
                alt41=4;
                }
                break;
            case KEYWORD_90:
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_29:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_22:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt41=5;
                }
                break;
            case RULE_INT:
                {
                int LA41_6 = input.LA(2);

                if ( (synpred140()) ) {
                    alt41=5;
                }
                else if ( (synpred141()) ) {
                    alt41=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3724:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 41, 6, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_23:
                {
                alt41=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3724:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3725:2: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue7338);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3738:2: this_SchemeList_1= ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue7368);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3751:2: this_SchemeBlock_2= ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue7398);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3764:2: this_SchemeCharacter_3= ruleSchemeCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue7428);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3777:2: this_SchemeText_4= ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue7458);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3790:2: this_SchemeNumber_5= ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_ruleSchemeValue7488);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3803:2: this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue7518);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3822:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3823:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3824:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean7552);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean7562); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3831:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeBooleanValue ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3836:6: ( ( (lv_value_0_0= ruleSchemeBooleanValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3837:1: ( (lv_value_0_0= ruleSchemeBooleanValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3837:1: ( (lv_value_0_0= ruleSchemeBooleanValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3838:1: (lv_value_0_0= ruleSchemeBooleanValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3838:1: (lv_value_0_0= ruleSchemeBooleanValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3839:3: lv_value_0_0= ruleSchemeBooleanValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeBooleanAccess().getValueSchemeBooleanValueParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeBooleanValue_in_ruleSchemeBoolean7607);
            lv_value_0_0=ruleSchemeBooleanValue();
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
              	        		"SchemeBooleanValue", 
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


    // $ANTLR start entryRuleSchemeBooleanValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3869:1: entryRuleSchemeBooleanValue returns [String current=null] : iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF ;
    public final String entryRuleSchemeBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeBooleanValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3870:1: (iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3871:2: iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBooleanValue_in_entryRuleSchemeBooleanValue7642);
            iv_ruleSchemeBooleanValue=ruleSchemeBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBooleanValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBooleanValue7653); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSchemeBooleanValue


    // $ANTLR start ruleSchemeBooleanValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3878:1: ruleSchemeBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3883:6: ( (kw= KEYWORD_2 this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3884:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3884:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3885:2: kw= KEYWORD_2 this_ID_1= RULE_ID
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeBooleanValue7691); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getSchemeBooleanValueAccess().getNumberSignKeyword_0(), null); 
                  
            }
            this_ID_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeBooleanValue7706); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getSchemeBooleanValueAccess().getIDTerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleSchemeBooleanValue


    // $ANTLR start entryRuleSchemeList
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3905:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3906:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3907:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList7750);
            iv_ruleSchemeList=ruleSchemeList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList7760); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3914:1: ruleSchemeList returns [EObject current=null] : ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        Token lv_vector_1_0=null;
        EObject lv_expressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3919:6: ( ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3920:1: ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3920:1: ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3920:2: () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3920:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3921:2: 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3934:2: ( (lv_vector_1_0= KEYWORD_2 ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KEYWORD_2) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3935:1: (lv_vector_1_0= KEYWORD_2 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3935:1: (lv_vector_1_0= KEYWORD_2 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3936:3: lv_vector_1_0= KEYWORD_2
                    {
                    lv_vector_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeList7816); if (failed) return current;
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

            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSchemeList7841); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3961:1: ( (lv_expressions_3_0= ruleSchemeExpression ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=KEYWORD_90 && LA43_0<=KEYWORD_25)||(LA43_0>=KEYWORD_29 && LA43_0<=KEYWORD_5)||(LA43_0>=KEYWORD_7 && LA43_0<=KEYWORD_9)||(LA43_0>=KEYWORD_11 && LA43_0<=KEYWORD_16)||(LA43_0>=KEYWORD_18 && LA43_0<=KEYWORD_19)||(LA43_0>=KEYWORD_22 && LA43_0<=RULE_ID)||LA43_0==RULE_ANY_OTHER) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3962:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3962:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3963:3: lv_expressions_3_0= ruleSchemeExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList7862);
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
            	    break loop43;
                }
            } while (true);

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleSchemeList7874); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3998:1: entryRuleSchemeBlock returns [EObject current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final EObject entryRuleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3999:2: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4000:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock7909);
            iv_ruleSchemeBlock=ruleSchemeBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock7919); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4007:1: ruleSchemeBlock returns [EObject current=null] : ( KEYWORD_25 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_26 ) ;
    public final EObject ruleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4012:6: ( ( KEYWORD_25 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_26 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4013:1: ( KEYWORD_25 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_26 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4013:1: ( KEYWORD_25 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_26 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4014:2: KEYWORD_25 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_26
            {
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleSchemeBlock7955); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4018:1: ( (lv_elements_1_0= ruleExpression ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=KEYWORD_90 && LA44_0<=KEYWORD_32)||LA44_0==KEYWORD_27||(LA44_0>=KEYWORD_29 && LA44_0<=KEYWORD_14)||(LA44_0>=KEYWORD_16 && LA44_0<=KEYWORD_18)||LA44_0==KEYWORD_20||(LA44_0>=KEYWORD_22 && LA44_0<=RULE_ID)||LA44_0==RULE_ANY_OTHER) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4019:1: (lv_elements_1_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4019:1: (lv_elements_1_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4020:3: lv_elements_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeBlockAccess().getElementsExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSchemeBlock7976);
            	    lv_elements_1_0=ruleExpression();
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
            	      	       			"elements",
            	      	        		lv_elements_1_0, 
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
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleSchemeBlock7988); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4055:1: entryRuleSchemeCharacter returns [EObject current=null] : iv_ruleSchemeCharacter= ruleSchemeCharacter EOF ;
    public final EObject entryRuleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4056:2: (iv_ruleSchemeCharacter= ruleSchemeCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4057:2: iv_ruleSchemeCharacter= ruleSchemeCharacter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeCharacterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter8023);
            iv_ruleSchemeCharacter=ruleSchemeCharacter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeCharacter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter8033); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4064:1: ruleSchemeCharacter returns [EObject current=null] : ( KEYWORD_24 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) ;
    public final EObject ruleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_3=null;
        AntlrDatatypeRuleToken lv_value_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4069:6: ( ( KEYWORD_24 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4070:1: ( KEYWORD_24 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4070:1: ( KEYWORD_24 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4071:2: KEYWORD_24 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            {
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleSchemeCharacter8069); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4075:1: ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4076:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4076:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4077:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4077:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt45=1;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_22:
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4077:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4078:3: lv_value_1_1= RULE_ID
                    {
                    lv_value_1_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeCharacter8088); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4099:8: lv_value_1_2= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter8112);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4120:8: lv_value_1_3= RULE_ANY_OTHER
                    {
                    lv_value_1_3=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter8127); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4152:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4153:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4154:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText8170);
            iv_ruleSchemeText=ruleSchemeText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText8180); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4161:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeTextValue ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4166:6: ( ( (lv_value_0_0= ruleSchemeTextValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4167:1: ( (lv_value_0_0= ruleSchemeTextValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4167:1: ( (lv_value_0_0= ruleSchemeTextValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4168:1: (lv_value_0_0= ruleSchemeTextValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4168:1: (lv_value_0_0= ruleSchemeTextValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4169:3: lv_value_0_0= ruleSchemeTextValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeTextValueParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeTextValue_in_ruleSchemeText8225);
            lv_value_0_0=ruleSchemeTextValue();
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
              	        		"SchemeTextValue", 
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


    // $ANTLR start entryRuleSchemeTextValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4199:1: entryRuleSchemeTextValue returns [String current=null] : iv_ruleSchemeTextValue= ruleSchemeTextValue EOF ;
    public final String entryRuleSchemeTextValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4203:1: (iv_ruleSchemeTextValue= ruleSchemeTextValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4204:2: iv_ruleSchemeTextValue= ruleSchemeTextValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeTextValue_in_entryRuleSchemeTextValue8266);
            iv_ruleSchemeTextValue=ruleSchemeTextValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeTextValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextValue8277); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeTextValue


    // $ANTLR start ruleSchemeTextValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4214:1: ruleSchemeTextValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SchemeTextValueSegment_0 = null;

        AntlrDatatypeRuleToken this_SchemeTextValueSegment_3 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4220:6: ( (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4221:1: (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4221:1: (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4222:5: this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSchemeTextValueAccess().getSchemeTextValueSegmentParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue8328);
            this_SchemeTextValueSegment_0=ruleSchemeTextValueSegment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_SchemeTextValueSegment_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4232:1: (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==KEYWORD_10) ) {
                    switch ( input.LA(2) ) {
                    case RULE_ID:
                        {
                        int LA47_3 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_29:
                        {
                        int LA47_4 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_12:
                        {
                        int LA47_5 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_9:
                        {
                        int LA47_6 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_1:
                        {
                        int LA47_7 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_14:
                        {
                        int LA47_8 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_7:
                        {
                        int LA47_9 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_11:
                        {
                        int LA47_10 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_13:
                        {
                        int LA47_11 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_16:
                        {
                        int LA47_12 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_18:
                        {
                        int LA47_13 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_22:
                        {
                        int LA47_14 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_65:
                        {
                        int LA47_15 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_67:
                        {
                        int LA47_16 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_56:
                        {
                        int LA47_17 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_85:
                        {
                        int LA47_18 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_33:
                        {
                        int LA47_19 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_68:
                        {
                        int LA47_20 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_62:
                        {
                        int LA47_21 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_53:
                        {
                        int LA47_22 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_46:
                        {
                        int LA47_23 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_45:
                        {
                        int LA47_24 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_35:
                        {
                        int LA47_25 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_54:
                        {
                        int LA47_26 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_75:
                        {
                        int LA47_27 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_77:
                        {
                        int LA47_28 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_70:
                        {
                        int LA47_29 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_81:
                        {
                        int LA47_30 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_78:
                        {
                        int LA47_31 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_72:
                        {
                        int LA47_32 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_31:
                        {
                        int LA47_33 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_42:
                        {
                        int LA47_34 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_61:
                        {
                        int LA47_35 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_76:
                        {
                        int LA47_36 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_43:
                        {
                        int LA47_37 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_83:
                        {
                        int LA47_38 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_50:
                        {
                        int LA47_39 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_51:
                        {
                        int LA47_40 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_69:
                        {
                        int LA47_41 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_63:
                        {
                        int LA47_42 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_86:
                        {
                        int LA47_43 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_52:
                        {
                        int LA47_44 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_84:
                        {
                        int LA47_45 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_44:
                        {
                        int LA47_46 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_64:
                        {
                        int LA47_47 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_90:
                        {
                        int LA47_48 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_30:
                        {
                        int LA47_49 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_55:
                        {
                        int LA47_50 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_71:
                        {
                        int LA47_51 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_79:
                        {
                        int LA47_52 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_34:
                        {
                        int LA47_53 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_36:
                        {
                        int LA47_54 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_73:
                        {
                        int LA47_55 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_57:
                        {
                        int LA47_56 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_37:
                        {
                        int LA47_57 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_74:
                        {
                        int LA47_58 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_66:
                        {
                        int LA47_59 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_58:
                        {
                        int LA47_60 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_59:
                        {
                        int LA47_61 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_38:
                        {
                        int LA47_62 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_60:
                        {
                        int LA47_63 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_82:
                        {
                        int LA47_64 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_32:
                        {
                        int LA47_65 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_87:
                        {
                        int LA47_66 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_39:
                        {
                        int LA47_67 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_88:
                        {
                        int LA47_68 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_89:
                        {
                        int LA47_69 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_47:
                        {
                        int LA47_70 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_40:
                        {
                        int LA47_71 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_48:
                        {
                        int LA47_72 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_80:
                        {
                        int LA47_73 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_41:
                        {
                        int LA47_74 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_49:
                        {
                        int LA47_75 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA47_76 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case RULE_INT:
                        {
                        int LA47_77 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case RULE_ANY_OTHER:
                        {
                        int LA47_78 = input.LA(3);

                        if ( (synpred148()) ) {
                            alt47=1;
                        }


                        }
                        break;
                    case KEYWORD_10:
                        {
                        switch ( input.LA(3) ) {
                        case KEYWORD_29:
                            {
                            int LA47_4 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_12:
                            {
                            int LA47_5 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_9:
                            {
                            int LA47_6 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_1:
                            {
                            int LA47_7 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_14:
                            {
                            int LA47_8 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_7:
                            {
                            int LA47_9 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_11:
                            {
                            int LA47_10 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_13:
                            {
                            int LA47_11 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_16:
                            {
                            int LA47_12 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_18:
                            {
                            int LA47_13 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_22:
                            {
                            int LA47_14 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_65:
                            {
                            int LA47_15 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_67:
                            {
                            int LA47_16 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_56:
                            {
                            int LA47_17 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_85:
                            {
                            int LA47_18 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_33:
                            {
                            int LA47_19 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_68:
                            {
                            int LA47_20 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_62:
                            {
                            int LA47_21 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_53:
                            {
                            int LA47_22 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_46:
                            {
                            int LA47_23 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_45:
                            {
                            int LA47_24 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_35:
                            {
                            int LA47_25 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_54:
                            {
                            int LA47_26 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_75:
                            {
                            int LA47_27 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_77:
                            {
                            int LA47_28 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_70:
                            {
                            int LA47_29 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_81:
                            {
                            int LA47_30 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_78:
                            {
                            int LA47_31 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_72:
                            {
                            int LA47_32 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_31:
                            {
                            int LA47_33 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_42:
                            {
                            int LA47_34 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_61:
                            {
                            int LA47_35 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_76:
                            {
                            int LA47_36 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_43:
                            {
                            int LA47_37 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_83:
                            {
                            int LA47_38 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_50:
                            {
                            int LA47_39 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_51:
                            {
                            int LA47_40 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_69:
                            {
                            int LA47_41 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_63:
                            {
                            int LA47_42 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_86:
                            {
                            int LA47_43 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_52:
                            {
                            int LA47_44 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_84:
                            {
                            int LA47_45 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_44:
                            {
                            int LA47_46 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_64:
                            {
                            int LA47_47 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_90:
                            {
                            int LA47_48 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_30:
                            {
                            int LA47_49 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_55:
                            {
                            int LA47_50 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_71:
                            {
                            int LA47_51 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_79:
                            {
                            int LA47_52 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_34:
                            {
                            int LA47_53 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_36:
                            {
                            int LA47_54 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_73:
                            {
                            int LA47_55 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_57:
                            {
                            int LA47_56 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_37:
                            {
                            int LA47_57 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_74:
                            {
                            int LA47_58 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_66:
                            {
                            int LA47_59 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_58:
                            {
                            int LA47_60 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_59:
                            {
                            int LA47_61 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_38:
                            {
                            int LA47_62 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_60:
                            {
                            int LA47_63 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_82:
                            {
                            int LA47_64 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_32:
                            {
                            int LA47_65 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_87:
                            {
                            int LA47_66 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_39:
                            {
                            int LA47_67 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_88:
                            {
                            int LA47_68 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_89:
                            {
                            int LA47_69 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_47:
                            {
                            int LA47_70 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_40:
                            {
                            int LA47_71 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_48:
                            {
                            int LA47_72 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_80:
                            {
                            int LA47_73 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_41:
                            {
                            int LA47_74 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case KEYWORD_49:
                            {
                            int LA47_75 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA47_3 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA47_76 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case RULE_INT:
                            {
                            int LA47_77 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case RULE_ANY_OTHER:
                            {
                            int LA47_78 = input.LA(4);

                            if ( (synpred148()) ) {
                                alt47=1;
                            }


                            }
                            break;

                        }

                        }
                        break;

                    }

                }


                switch (alt47) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4233:2: kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleSchemeTextValue8347); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getSchemeTextValueAccess().getColonKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4238:1: (kw= KEYWORD_10 )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==KEYWORD_10) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4239:2: kw= KEYWORD_10
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleSchemeTextValue8361); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getSchemeTextValueAccess().getColonKeyword_1_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    if ( backtracking==0 ) {
            	       
            	              currentNode=createCompositeNode(grammarAccess.getSchemeTextValueAccess().getSchemeTextValueSegmentParserRuleCall_1_2(), currentNode); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue8385);
            	    this_SchemeTextValueSegment_3=ruleSchemeTextValueSegment();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_SchemeTextValueSegment_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode = currentNode.getParent();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end ruleSchemeTextValue


    // $ANTLR start entryRuleSchemeTextValueSegment
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4266:1: entryRuleSchemeTextValueSegment returns [String current=null] : iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF ;
    public final String entryRuleSchemeTextValueSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextValueSegment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4267:1: (iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4268:2: iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextValueSegmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_entryRuleSchemeTextValueSegment8436);
            iv_ruleSchemeTextValueSegment=ruleSchemeTextValueSegment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeTextValueSegment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextValueSegment8447); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSchemeTextValueSegment


    // $ANTLR start ruleSchemeTextValueSegment
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4275:1: ruleSchemeTextValueSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_29 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextValueSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_6=null;
        Token this_INT_7=null;
        Token this_ANY_OTHER_8=null;
        AntlrDatatypeRuleToken this_SpecialCharacter_3 = null;

        AntlrDatatypeRuleToken this_SpecialCommandName_4 = null;

        AntlrDatatypeRuleToken this_SchemeIdentifier_5 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4280:6: ( (kw= KEYWORD_29 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4281:1: (kw= KEYWORD_29 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4281:1: (kw= KEYWORD_29 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER )
            int alt48=9;
            switch ( input.LA(1) ) {
            case KEYWORD_29:
                {
                alt48=1;
                }
                break;
            case KEYWORD_12:
                {
                alt48=2;
                }
                break;
            case KEYWORD_9:
                {
                alt48=3;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_22:
                {
                alt48=4;
                }
                break;
            case KEYWORD_90:
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
                {
                alt48=5;
                }
                break;
            case RULE_ID:
                {
                alt48=6;
                }
                break;
            case RULE_STRING:
                {
                alt48=7;
                }
                break;
            case RULE_INT:
                {
                alt48=8;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt48=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4281:1: (kw= KEYWORD_29 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER )", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4282:2: kw= KEYWORD_29
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSchemeTextValueSegment8485); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getReverseSolidusReverseSolidusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4289:2: kw= KEYWORD_12
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleSchemeTextValueSegment8504); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getEqualsSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4296:2: kw= KEYWORD_9
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleSchemeTextValueSegment8523); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getHyphenMinusKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4303:5: this_SpecialCharacter_3= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSpecialCharacterParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextValueSegment8551);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4315:5: this_SpecialCommandName_4= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSpecialCommandNameParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleSchemeTextValueSegment8584);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4327:5: this_SchemeIdentifier_5= ruleSchemeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSchemeIdentifierParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeIdentifier_in_ruleSchemeTextValueSegment8617);
                    this_SchemeIdentifier_5=ruleSchemeIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_SchemeIdentifier_5);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4338:10: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemeTextValueSegment8643); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_6);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getSTRINGTerminalRuleCall_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4346:10: this_INT_7= RULE_INT
                    {
                    this_INT_7=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeTextValueSegment8669); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getINTTerminalRuleCall_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4354:10: this_ANY_OTHER_8= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_8=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextValueSegment8695); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_8);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getANY_OTHERTerminalRuleCall_8(), null); 
                          
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
    // $ANTLR end ruleSchemeTextValueSegment


    // $ANTLR start entryRuleSchemeIdentifier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4369:1: entryRuleSchemeIdentifier returns [String current=null] : iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF ;
    public final String entryRuleSchemeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeIdentifier = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4373:1: (iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4374:2: iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeIdentifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeIdentifier_in_entryRuleSchemeIdentifier8746);
            iv_ruleSchemeIdentifier=ruleSchemeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeIdentifier8757); if (failed) return current;

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
    // $ANTLR end entryRuleSchemeIdentifier


    // $ANTLR start ruleSchemeIdentifier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4384:1: ruleSchemeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSchemeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4390:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4391:1: (this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4391:1: (this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4391:6: this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeIdentifier8801); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getSchemeIdentifierAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4398:1: (kw= KEYWORD_9 this_ID_2= RULE_ID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==KEYWORD_9) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==RULE_ID) ) {
                        int LA49_3 = input.LA(3);

                        if ( (synpred157()) ) {
                            alt49=1;
                        }


                    }


                }


                switch (alt49) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4399:2: kw= KEYWORD_9 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleSchemeIdentifier8820); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getSchemeIdentifierAccess().getHyphenMinusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeIdentifier8835); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getSchemeIdentifierAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // $ANTLR end ruleSchemeIdentifier


    // $ANTLR start entryRuleSchemeNumber
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4422:1: entryRuleSchemeNumber returns [EObject current=null] : iv_ruleSchemeNumber= ruleSchemeNumber EOF ;
    public final EObject entryRuleSchemeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4426:2: (iv_ruleSchemeNumber= ruleSchemeNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4427:2: iv_ruleSchemeNumber= ruleSchemeNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber8891);
            iv_ruleSchemeNumber=ruleSchemeNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber8901); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4437:1: ruleSchemeNumber returns [EObject current=null] : ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSchemeNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_radix_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4443:6: ( ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4444:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4444:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4444:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4444:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_2) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4445:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4445:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4446:3: lv_radix_0_0= ruleSchemeNumberRadix
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber8951);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4468:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4469:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4469:1: (lv_value_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4470:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeNumber8969); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4503:1: entryRuleSchemeNumberRadix returns [String current=null] : iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF ;
    public final String entryRuleSchemeNumberRadix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeNumberRadix = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4504:1: (iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4505:2: iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRadixRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix9014);
            iv_ruleSchemeNumberRadix=ruleSchemeNumberRadix();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumberRadix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix9025); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4512:1: ruleSchemeNumberRadix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeNumberRadix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4517:6: ( (kw= KEYWORD_2 this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4518:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4518:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4519:2: kw= KEYWORD_2 this_ID_1= RULE_ID
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeNumberRadix9063); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0(), null); 
                  
            }
            this_ID_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeNumberRadix9078); if (failed) return current;
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
        }
        return current;
    }
    // $ANTLR end ruleSchemeNumberRadix


    // $ANTLR start entryRuleSchemeMarkupCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4539:1: entryRuleSchemeMarkupCommand returns [EObject current=null] : iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF ;
    public final EObject entryRuleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeMarkupCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4543:2: (iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4544:2: iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeMarkupCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand9128);
            iv_ruleSchemeMarkupCommand=ruleSchemeMarkupCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeMarkupCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand9138); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4554:1: ruleSchemeMarkupCommand returns [EObject current=null] : ( KEYWORD_23 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_1_1=null;
        AntlrDatatypeRuleToken lv_command_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4560:6: ( ( KEYWORD_23 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4561:1: ( KEYWORD_23 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4561:1: ( KEYWORD_23 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4562:2: KEYWORD_23 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleSchemeMarkupCommand9178); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4566:1: ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4567:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4567:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4568:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4568:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=KEYWORD_90 && LA51_0<=KEYWORD_32)) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4568:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4569:3: lv_command_1_1= RULE_ID
                    {
                    lv_command_1_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeMarkupCommand9197); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSchemeMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0_0(), "command"); 
                      		
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
                      	        		lv_command_1_1, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4590:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeMarkupCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleSchemeMarkupCommand9221);
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

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:275:2: ( ruleText )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:275:2: ruleText
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleText_in_synpred7561);
        ruleText();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:886:2: ( rulePropertyAssignment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:886:2: rulePropertyAssignment
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred211805);
        rulePropertyAssignment();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:938:2: ( ruleText )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:938:2: ruleText
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleText_in_synpred251925);
        ruleText();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1774:1: ( ( ( ruleScheme | ruleUnparsedCommand ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1774:1: ( ( ruleScheme | ruleUnparsedCommand ) )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1774:1: ( ( ruleScheme | ruleUnparsedCommand ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1775:1: ( ruleScheme | ruleUnparsedCommand )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1775:1: ( ruleScheme | ruleUnparsedCommand )
        int alt52=2;
        int LA52_0 = input.LA(1);

        if ( ((LA52_0>=KEYWORD_2 && LA52_0<=KEYWORD_3)) ) {
            alt52=1;
        }
        else if ( (LA52_0==KEYWORD_17) ) {
            alt52=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1775:1: ( ruleScheme | ruleUnparsedCommand )", 52, 0, input);

            throw nvae;
        }
        switch (alt52) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1776:3: ruleScheme
                {
                pushFollow(FOLLOW_ruleScheme_in_synpred433555);
                ruleScheme();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1797:8: ruleUnparsedCommand
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleUnparsedCommand_in_synpred433574);
                ruleUnparsedCommand();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1822:1: ( ( ruleUnparsedBlock ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1822:1: ( ruleUnparsedBlock )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1822:1: ( ruleUnparsedBlock )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1823:3: ruleUnparsedBlock
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleUnparsedBlock_in_synpred443599);
        ruleUnparsedBlock();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2145:1: ( ( rulePitch ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2145:1: ( rulePitch )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2145:1: ( rulePitch )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2146:3: rulePitch
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulePitch_in_synpred504162);
        rulePitch();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2240:1: ( ( KEYWORD_12 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2240:1: ( KEYWORD_12 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2240:1: ( KEYWORD_12 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2241:3: KEYWORD_12
        {
        match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_synpred514295); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2262:1: ( ( ruleOctave ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2262:1: ( ruleOctave )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2262:1: ( ruleOctave )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2263:3: ruleOctave
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleOctave_in_synpred524330);
        ruleOctave();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2286:1: ( ( KEYWORD_1 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2286:1: ( KEYWORD_1 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2286:1: ( KEYWORD_1 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2287:3: KEYWORD_1
        {
        match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_synpred534350); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2308:1: ( ( KEYWORD_14 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2308:1: ( KEYWORD_14 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2308:1: ( KEYWORD_14 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2309:3: KEYWORD_14
        {
        match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_synpred544383); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2353:1: ( ( KEYWORD_4 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2353:1: ( KEYWORD_4 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2353:1: ( KEYWORD_4 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2354:3: KEYWORD_4
        {
        match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_synpred554486); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2376:1: ( ( KEYWORD_8 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2376:1: ( KEYWORD_8 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2376:1: ( KEYWORD_8 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2377:3: KEYWORD_8
        {
        match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred574525); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred64
    public final void synpred64_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2647:2: ( KEYWORD_12 ( ( ( RULE_ID | RULE_STRING ) ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2647:2: KEYWORD_12 ( ( ( RULE_ID | RULE_STRING ) ) )
        {
        match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_synpred644980); if (failed) return ;
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2651:1: ( ( ( RULE_ID | RULE_STRING ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2652:1: ( ( RULE_ID | RULE_STRING ) )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2652:1: ( ( RULE_ID | RULE_STRING ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2653:1: ( RULE_ID | RULE_STRING )
        {
        if ( input.LA(1)==RULE_STRING||input.LA(1)==RULE_ID ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred644993);    throw mse;
        }


        }


        }


        }
    }
    // $ANTLR end synpred64

    // $ANTLR start synpred65
    public final void synpred65_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2700:1: ( ( ruleContextModification ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2700:1: ( ruleContextModification )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2700:1: ( ruleContextModification )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2701:3: ruleContextModification
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleContextModification_in_synpred655050);
        ruleContextModification();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred65

    // $ANTLR start synpred129
    public final void synpred129_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3465:2: ( KEYWORD_42 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3465:2: KEYWORD_42
        {
        match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_synpred1296819); if (failed) return ;

        }
    }
    // $ANTLR end synpred129

    // $ANTLR start synpred136
    public final void synpred136_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3725:2: ( ruleSchemeBoolean )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3725:2: ruleSchemeBoolean
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred1367338);
        ruleSchemeBoolean();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred136

    // $ANTLR start synpred140
    public final void synpred140_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3777:2: ( ruleSchemeText )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3777:2: ruleSchemeText
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeText_in_synpred1407458);
        ruleSchemeText();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred140

    // $ANTLR start synpred141
    public final void synpred141_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3790:2: ( ruleSchemeNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3790:2: ruleSchemeNumber
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred1417488);
        ruleSchemeNumber();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred141

    // $ANTLR start synpred148
    public final void synpred148_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4233:2: ( KEYWORD_10 ( KEYWORD_10 )? ruleSchemeTextValueSegment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4233:2: KEYWORD_10 ( KEYWORD_10 )? ruleSchemeTextValueSegment
        {
        match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_synpred1488347); if (failed) return ;
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4238:1: ( KEYWORD_10 )?
        int alt54=2;
        int LA54_0 = input.LA(1);

        if ( (LA54_0==KEYWORD_10) ) {
            alt54=1;
        }
        switch (alt54) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4239:2: KEYWORD_10
                {
                match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_synpred1488361); if (failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_synpred1488385);
        ruleSchemeTextValueSegment();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred148

    // $ANTLR start synpred157
    public final void synpred157_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4399:2: ( KEYWORD_9 RULE_ID )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4399:2: KEYWORD_9 RULE_ID
        {
        match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_synpred1578820); if (failed) return ;
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1578835); if (failed) return ;

        }
    }
    // $ANTLR end synpred157

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred136() {
        backtracking++;
        int start = input.mark();
        try {
            synpred136_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred129() {
        backtracking++;
        int start = input.mark();
        try {
            synpred129_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred148() {
        backtracking++;
        int start = input.mark();
        try {
            synpred148_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred57() {
        backtracking++;
        int start = input.mark();
        try {
            synpred57_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred65() {
        backtracking++;
        int start = input.mark();
        try {
            synpred65_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred55() {
        backtracking++;
        int start = input.mark();
        try {
            synpred55_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred54() {
        backtracking++;
        int start = input.mark();
        try {
            synpred54_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred53() {
        backtracking++;
        int start = input.mark();
        try {
            synpred53_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred52() {
        backtracking++;
        int start = input.mark();
        try {
            synpred52_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred64() {
        backtracking++;
        int start = input.mark();
        try {
            synpred64_fragment(); // can never throw exception
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
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred140() {
        backtracking++;
        int start = input.mark();
        try {
            synpred140_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred141() {
        backtracking++;
        int start = input.mark();
        try {
            synpred141_fragment(); // can never throw exception
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
    public final boolean synpred157() {
        backtracking++;
        int start = input.mark();
        try {
            synpred157_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleToplevelExpression_in_ruleLilyPond128 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000041EBBFFFA1L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleAssignment718 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssignment784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_rulePropertyAssignment830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rulePropertyAssignment841 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyAssignment862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlock957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_ruleBlock987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleSimpleBlock1079 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041FBBFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleBlock1100 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041FBBFFFA1L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleSimpleBlock1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSimultaneousBlock1205 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFE1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimultaneousBlock1226 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFE1L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleSimultaneousBlock1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_ruleCommand1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleCommand1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSpecialCharacter1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleSpecialCharacter1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleSpecialCharacter1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleSpecialCharacter1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleSpecialCharacter1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSpecialCharacter1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleSpecialCharacter1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleSpecialCharacter1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedBlock1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleUnparsedBlock1677 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041FBBFFF81L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock1698 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041FBBFFF81L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleUnparsedBlock1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedExpression1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_ruleUnparsedExpression1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleUnparsedExpression1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleUnparsedExpression1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleUnparsedExpression1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedCommand1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleUnparsedCommand2035 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000100000001L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnparsedCommand2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleReference2162 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleText2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleText2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleText2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleText2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleText2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleText2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSpecialCommand2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSpecialCommand2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleSpecialCommand2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_ruleSpecialCommand2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockCommand_in_ruleSpecialCommand2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_ruleSpecialCommand2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_ruleSpecialCommand2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeChange_in_ruleSpecialCommand2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_ruleSpecialCommand2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDef_in_ruleSpecialCommand2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_ruleSpecialCommand2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude2947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleInclude2993 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleInclude3012 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion3082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleVersion3128 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleVersion3147 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup3217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkup3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleMarkup3263 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleMarkup3282 = new BitSet(new long[]{0x0000000000000002L,0x0000000009000600L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkup3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines3351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupLines3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleMarkupLines3397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_85_in_ruleMarkupLines3416 = new BitSet(new long[]{0x0000000000000002L,0x0000000009000600L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkupLines3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody3485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBody3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleMarkupBody3555 = new BitSet(new long[]{0x0000000000000002L,0x0000000009000600L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody3574 = new BitSet(new long[]{0x0000000000000002L,0x0000000009000600L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockCommand_in_entryRuleBlockCommand3635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockCommand3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleBlockCommand3681 = new BitSet(new long[]{0x0011002000080000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleBlockCommand3702 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleBlockCommand3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleBlockCommand3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleBlockCommand3792 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlockCommand3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition3864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDefinition3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleOutputDefinition3910 = new BitSet(new long[]{0x0040804000000000L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleOutputDefinition3931 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleOutputDefinition3961 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleOutputDefinition3991 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleOutputDefinition4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic4063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeMusic4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleRelativeMusic4109 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleRelativeMusic4128 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_rulePitch_in_ruleRelativeMusic4162 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRelativeMusic4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_entryRulePitch4219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePitch4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePitch4271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000288900L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rulePitch4295 = new BitSet(new long[]{0x0000000000000002L,0x0000000000208900L});
    public static final BitSet FOLLOW_ruleOctave_in_rulePitch4330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200100L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePitch4350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rulePitch4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_entryRuleOctave4432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOctave4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleOctave4486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOctave4525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleModeChange_in_entryRuleModeChange4574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModeChange4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleModeChange4620 = new BitSet(new long[]{0x0000000000A19000L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleModeChange4641 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000020L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleModeChange4671 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000020L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleModeChange4701 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000020L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleModeChange4731 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000020L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleModeChange4761 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000020L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleModeChange4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_entryRuleNewContext4833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewContext4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleNewContext4879 = new BitSet(new long[]{0x8000000010000000L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleNewContext4900 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleNewContext4930 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewContext4963 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleNewContext4980 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewContext4999 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNewContext5019 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_ruleContextModification_in_ruleNewContext5050 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNewContext5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_entryRuleContextModification5107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextModification5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleContextModification5153 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleContextModification5164 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContextModification5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDef_in_entryRuleContextDef5220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDef5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleContextDef5266 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleContextDef5285 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContextDef5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_entryRuleOther5354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOther5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleOther5400 = new BitSet(new long[]{0x7FAE7E9D6B5667F0L,0x0000000022B47101L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleOther5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleOther5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleOther5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleOther5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_entryRuleOtherName5541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherName5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleOtherName5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleOtherName5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleOtherName5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleOtherName5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleOtherName5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleOtherName5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleOtherName5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleOtherName5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_ruleOtherName5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleOtherName5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleOtherName5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOtherName5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleOtherName5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_90_in_ruleOtherName5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleOtherName5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleOtherName5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleOtherName5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleOtherName5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleOtherName5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleOtherName5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleOtherName5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleOtherName5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleOtherName6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleOtherName6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleOtherName6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleOtherName6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleOtherName6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleOtherName6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleOtherName6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleOtherName6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleOtherName6160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_ruleOtherName6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleOtherName6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_ruleOtherName6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_89_in_ruleOtherName6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleOtherName6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleOtherName6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleOtherName6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleOtherName6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleOtherName6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleOtherName6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleOtherName6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName6409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommandName6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleSpecialCommandName6458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleSpecialCommandName6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleSpecialCommandName6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_ruleSpecialCommandName6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleSpecialCommandName6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleSpecialCommandName6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSpecialCommandName6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleSpecialCommandName6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleSpecialCommandName6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleSpecialCommandName6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleSpecialCommandName6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleSpecialCommandName6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleSpecialCommandName6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleSpecialCommandName6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleSpecialCommandName6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleSpecialCommandName6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleSpecialCommandName6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleSpecialCommandName6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleSpecialCommandName6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleSpecialCommandName6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleSpecialCommandName6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme6897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleScheme6948 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDDF8FL});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleScheme6965 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDDF8FL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression7026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSchemeExpression7080 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDDB8FL});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSchemeExpression7115 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDDB8FL});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleSchemeExpression7145 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDDB8FL});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSchemeExpression7175 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDDB8FL});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleSchemeExpression7205 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDDB8FL});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue7278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue7458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_ruleSchemeValue7488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean7552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBooleanValue_in_ruleSchemeBoolean7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBooleanValue_in_entryRuleSchemeBooleanValue7642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBooleanValue7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeBooleanValue7691 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeBooleanValue7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList7750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeList7816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSchemeList7841 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDFF8FL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList7862 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E6FDFF8FL});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleSchemeList7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock7909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleSchemeBlock7955 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSchemeBlock7976 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041EBBFFFB1L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleSchemeBlock7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter8023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleSchemeCharacter8069 = new BitSet(new long[]{0x0000000000000000L,0x0000004122B44100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeCharacter8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText8170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValue_in_ruleSchemeText8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValue_in_entryRuleSchemeTextValue8266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextValue8277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue8328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleSchemeTextValue8347 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E2BF4181L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleSchemeTextValue8361 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E2BD4181L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue8385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_entryRuleSchemeTextValueSegment8436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextValueSegment8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSchemeTextValueSegment8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleSchemeTextValueSegment8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleSchemeTextValueSegment8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextValueSegment8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleSchemeTextValueSegment8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_ruleSchemeTextValueSegment8617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemeTextValueSegment8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeTextValueSegment8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextValueSegment8695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_entryRuleSchemeIdentifier8746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeIdentifier8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeIdentifier8801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleSchemeIdentifier8820 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeIdentifier8835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber8891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber8951 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeNumber8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix9014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix9025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeNumberRadix9063 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeNumberRadix9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand9128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleSchemeMarkupCommand9178 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000100000001L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeMarkupCommand9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleSchemeMarkupCommand9221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_synpred7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred211805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_synpred251925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_synpred433555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_synpred433574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_synpred443599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_synpred504162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_synpred514295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_synpred524330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_synpred534350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_synpred544383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_synpred554486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred574525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_synpred644980 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
    public static final BitSet FOLLOW_set_in_synpred644993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_synpred655050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_synpred1296819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred1367338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_synpred1407458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred1417488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_synpred1488347 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E2BF4181L});
    public static final BitSet FOLLOW_KEYWORD_10_in_synpred1488361 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000041E2BD4181L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_synpred1488385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_synpred1578820 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1578835 = new BitSet(new long[]{0x0000000000000002L});

}