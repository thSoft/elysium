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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_89", "KEYWORD_87", "KEYWORD_88", "KEYWORD_85", "KEYWORD_86", "KEYWORD_82", "KEYWORD_83", "KEYWORD_84", "KEYWORD_80", "KEYWORD_81", "KEYWORD_75", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_79", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_ID=95;
    public static final int RULE_SCHEME_SL_COMMENT=99;
    public static final int RULE_ANY_OTHER=101;
    public static final int KEYWORD_56=41;
    public static final int KEYWORD_55=40;
    public static final int KEYWORD_54=39;
    public static final int KEYWORD_53=38;
    public static final int KEYWORD_52=37;
    public static final int KEYWORD_51=36;
    public static final int KEYWORD_50=35;
    public static final int EOF=-1;
    public static final int KEYWORD_59=44;
    public static final int KEYWORD_58=43;
    public static final int KEYWORD_57=42;
    public static final int KEYWORD_65=32;
    public static final int RULE_SCHEME_ML_COMMENT=100;
    public static final int KEYWORD_64=31;
    public static final int KEYWORD_67=19;
    public static final int KEYWORD_66=33;
    public static final int KEYWORD_61=28;
    public static final int KEYWORD_60=27;
    public static final int KEYWORD_63=30;
    public static final int KEYWORD_62=29;
    public static final int KEYWORD_69=21;
    public static final int KEYWORD_68=20;
    public static final int KEYWORD_30=63;
    public static final int KEYWORD_34=54;
    public static final int KEYWORD_33=53;
    public static final int KEYWORD_32=52;
    public static final int KEYWORD_31=64;
    public static final int KEYWORD_38=58;
    public static final int KEYWORD_37=57;
    public static final int KEYWORD_36=56;
    public static final int KEYWORD_35=55;
    public static final int RULE_ML_COMMENT=98;
    public static final int KEYWORD_39=59;
    public static final int RULE_STRING=93;
    public static final int KEYWORD_41=61;
    public static final int KEYWORD_40=60;
    public static final int KEYWORD_43=46;
    public static final int KEYWORD_42=45;
    public static final int KEYWORD_45=48;
    public static final int KEYWORD_44=47;
    public static final int KEYWORD_47=50;
    public static final int KEYWORD_46=49;
    public static final int KEYWORD_49=34;
    public static final int KEYWORD_48=51;
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
    public static final int KEYWORD_28=71;
    public static final int KEYWORD_29=62;
    public static final int RULE_INT=94;
    public static final int KEYWORD_24=67;
    public static final int KEYWORD_25=68;
    public static final int KEYWORD_26=69;
    public static final int KEYWORD_27=70;
    public static final int KEYWORD_20=91;
    public static final int KEYWORD_21=92;
    public static final int KEYWORD_22=65;
    public static final int KEYWORD_23=66;
    public static final int KEYWORD_79=18;
    public static final int KEYWORD_71=23;
    public static final int KEYWORD_72=24;
    public static final int KEYWORD_73=25;
    public static final int KEYWORD_74=26;
    public static final int KEYWORD_75=14;
    public static final int KEYWORD_76=15;
    public static final int KEYWORD_77=16;
    public static final int KEYWORD_78=17;
    public static final int KEYWORD_1=72;
    public static final int KEYWORD_5=76;
    public static final int KEYWORD_4=75;
    public static final int KEYWORD_70=22;
    public static final int KEYWORD_3=74;
    public static final int KEYWORD_2=73;
    public static final int Tokens=102;
    public static final int RULE_SL_COMMENT=97;
    public static final int KEYWORD_84=11;
    public static final int KEYWORD_85=7;
    public static final int KEYWORD_82=9;
    public static final int KEYWORD_83=10;
    public static final int KEYWORD_88=6;
    public static final int KEYWORD_89=4;
    public static final int KEYWORD_86=8;
    public static final int KEYWORD_87=5;
    public static final int KEYWORD_81=13;
    public static final int KEYWORD_80=12;
    public static final int RULE_WS=96;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[254+1];
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

                if ( ((LA1_0>=KEYWORD_89 && LA1_0<=KEYWORD_31)||LA1_0==KEYWORD_26||(LA1_0>=KEYWORD_28 && LA1_0<=KEYWORD_17)||LA1_0==KEYWORD_19||(LA1_0>=KEYWORD_21 && LA1_0<=RULE_ID)||LA1_0==RULE_ANY_OTHER) ) {
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
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_26:
            case KEYWORD_28:
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
            case KEYWORD_15:
            case KEYWORD_16:
            case KEYWORD_17:
            case KEYWORD_19:
            case KEYWORD_21:
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
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_26:
            case KEYWORD_28:
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
            case KEYWORD_15:
            case KEYWORD_16:
            case KEYWORD_17:
            case KEYWORD_19:
            case KEYWORD_21:
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
            case KEYWORD_16:
                {
                alt4=1;
                }
                break;
            case KEYWORD_26:
            case KEYWORD_19:
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
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_28:
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
            case KEYWORD_15:
            case KEYWORD_17:
            case KEYWORD_21:
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:416:1: rulePropertyAssignment returns [EObject current=null] : ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:421:6: ( ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:2: ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) KEYWORD_12 ( (lv_value_2_0= ruleExpression ) )
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

            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rulePropertyAssignment867); if (failed) return current;
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

            if ( (LA7_0==KEYWORD_19) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_26) ) {
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:564:1: ruleSimpleBlock returns [EObject current=null] : ( () KEYWORD_19 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_20 ) ;
    public final EObject ruleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:569:6: ( ( () KEYWORD_19 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_20 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:1: ( () KEYWORD_19 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_20 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:1: ( () KEYWORD_19 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_20 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:2: () KEYWORD_19 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_20
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

            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleSimpleBlock1105); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:589:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=KEYWORD_89 && LA8_0<=KEYWORD_31)||LA8_0==KEYWORD_26||(LA8_0>=KEYWORD_28 && LA8_0<=KEYWORD_17)||LA8_0==KEYWORD_19||(LA8_0>=KEYWORD_21 && LA8_0<=RULE_ID)||LA8_0==RULE_ANY_OTHER) ) {
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

            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleSimpleBlock1138); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:635:1: ruleSimultaneousBlock returns [EObject current=null] : ( () KEYWORD_26 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_27 ) ;
    public final EObject ruleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:640:6: ( ( () KEYWORD_26 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_27 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:1: ( () KEYWORD_26 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_27 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:1: ( () KEYWORD_26 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_27 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:641:2: () KEYWORD_26 ( (lv_expressions_2_0= ruleExpression ) )* KEYWORD_27
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

            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleSimultaneousBlock1231); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:660:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=KEYWORD_89 && LA9_0<=KEYWORD_31)||LA9_0==KEYWORD_26||(LA9_0>=KEYWORD_28 && LA9_0<=KEYWORD_17)||LA9_0==KEYWORD_19||(LA9_0>=KEYWORD_21 && LA9_0<=RULE_ID)||LA9_0==RULE_ANY_OTHER) ) {
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

            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSimultaneousBlock1264); if (failed) return current;
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

            if ( (LA10_0==KEYWORD_16) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=KEYWORD_89 && LA10_1<=KEYWORD_31)||LA10_1==KEYWORD_1||(LA10_1>=KEYWORD_5 && LA10_1<=KEYWORD_7)||LA10_1==KEYWORD_11||(LA10_1>=KEYWORD_13 && LA10_1<=KEYWORD_15)||LA10_1==KEYWORD_17||LA10_1==KEYWORD_21) ) {
                    alt10=1;
                }
                else if ( (LA10_1==RULE_ID) ) {
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


    // $ANTLR start entryRuleSpecialCharacter
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:745:1: entryRuleSpecialCharacter returns [String current=null] : iv_ruleSpecialCharacter= ruleSpecialCharacter EOF ;
    public final String entryRuleSpecialCharacter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:746:1: (iv_ruleSpecialCharacter= ruleSpecialCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:747:2: iv_ruleSpecialCharacter= ruleSpecialCharacter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCharacterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1424);
            iv_ruleSpecialCharacter=ruleSpecialCharacter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCharacter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCharacter1435); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:754:1: ruleSpecialCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_15 | kw= KEYWORD_17 | kw= KEYWORD_21 ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:759:6: ( (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_15 | kw= KEYWORD_17 | kw= KEYWORD_21 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:760:1: (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_15 | kw= KEYWORD_17 | kw= KEYWORD_21 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:760:1: (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_15 | kw= KEYWORD_17 | kw= KEYWORD_21 )
            int alt11=8;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
                {
                alt11=1;
                }
                break;
            case KEYWORD_14:
                {
                alt11=2;
                }
                break;
            case KEYWORD_7:
                {
                alt11=3;
                }
                break;
            case KEYWORD_11:
                {
                alt11=4;
                }
                break;
            case KEYWORD_13:
                {
                alt11=5;
                }
                break;
            case KEYWORD_15:
                {
                alt11=6;
                }
                break;
            case KEYWORD_17:
                {
                alt11=7;
                }
                break;
            case KEYWORD_21:
                {
                alt11=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("760:1: (kw= KEYWORD_1 | kw= KEYWORD_14 | kw= KEYWORD_7 | kw= KEYWORD_11 | kw= KEYWORD_13 | kw= KEYWORD_15 | kw= KEYWORD_17 | kw= KEYWORD_21 )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:761:2: kw= KEYWORD_1
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSpecialCharacter1473); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:768:2: kw= KEYWORD_14
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleSpecialCharacter1492); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getQuestionMarkKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:775:2: kw= KEYWORD_7
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleSpecialCharacter1511); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:782:2: kw= KEYWORD_11
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleSpecialCharacter1530); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:789:2: kw= KEYWORD_13
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleSpecialCharacter1549); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:796:2: kw= KEYWORD_15
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleSpecialCharacter1568); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:803:2: kw= KEYWORD_17
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleSpecialCharacter1587); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:810:2: kw= KEYWORD_21
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleSpecialCharacter1606); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:823:1: entryRuleUnparsedBlock returns [EObject current=null] : iv_ruleUnparsedBlock= ruleUnparsedBlock EOF ;
    public final EObject entryRuleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:824:2: (iv_ruleUnparsedBlock= ruleUnparsedBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:825:2: iv_ruleUnparsedBlock= ruleUnparsedBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1645);
            iv_ruleUnparsedBlock=ruleUnparsedBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedBlock1655); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:832:1: ruleUnparsedBlock returns [EObject current=null] : ( () KEYWORD_19 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_20 ) ;
    public final EObject ruleUnparsedBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:837:6: ( ( () KEYWORD_19 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_20 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:838:1: ( () KEYWORD_19 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_20 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:838:1: ( () KEYWORD_19 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_20 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:838:2: () KEYWORD_19 ( (lv_expressions_2_0= ruleUnparsedExpression ) )* KEYWORD_20
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:838:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:839:2: 
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

            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleUnparsedBlock1703); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:857:1: ( (lv_expressions_2_0= ruleUnparsedExpression ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=KEYWORD_89 && LA12_0<=KEYWORD_31)||(LA12_0>=KEYWORD_28 && LA12_0<=KEYWORD_17)||LA12_0==KEYWORD_19||(LA12_0>=KEYWORD_21 && LA12_0<=RULE_ID)||LA12_0==RULE_ANY_OTHER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:858:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:858:1: (lv_expressions_2_0= ruleUnparsedExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:859:3: lv_expressions_2_0= ruleUnparsedExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock1724);
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
            	    break loop12;
                }
            } while (true);

            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleUnparsedBlock1736); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:894:1: entryRuleUnparsedExpression returns [EObject current=null] : iv_ruleUnparsedExpression= ruleUnparsedExpression EOF ;
    public final EObject entryRuleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:895:2: (iv_ruleUnparsedExpression= ruleUnparsedExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:896:2: iv_ruleUnparsedExpression= ruleUnparsedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1771);
            iv_ruleUnparsedExpression=ruleUnparsedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedExpression1781); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:903:1: ruleUnparsedExpression returns [EObject current=null] : (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) ;
    public final EObject ruleUnparsedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnparsedCommand_0 = null;

        EObject this_UnparsedBlock_1 = null;

        EObject this_Scheme_2 = null;

        EObject this_Text_3 = null;

        EObject this_Number_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:908:6: ( (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:909:1: (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:909:1: (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )
            int alt13=5;
            switch ( input.LA(1) ) {
            case KEYWORD_16:
                {
                alt13=1;
                }
                break;
            case KEYWORD_19:
                {
                alt13=2;
                }
                break;
            case KEYWORD_2:
            case KEYWORD_3:
                {
                alt13=3;
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_28:
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
            case KEYWORD_15:
            case KEYWORD_17:
            case KEYWORD_21:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt13=4;
                }
                break;
            case RULE_INT:
                {
                int LA13_5 = input.LA(2);

                if ( (synpred25()) ) {
                    alt13=4;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("909:1: (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("909:1: (this_UnparsedCommand_0= ruleUnparsedCommand | this_UnparsedBlock_1= ruleUnparsedBlock | this_Scheme_2= ruleScheme | this_Text_3= ruleText | this_Number_4= ruleNumber )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:910:2: this_UnparsedCommand_0= ruleUnparsedCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression1831);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:923:2: this_UnparsedBlock_1= ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getUnparsedBlockParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression1861);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:936:2: this_Scheme_2= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getSchemeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleUnparsedExpression1891);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:949:2: this_Text_3= ruleText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleUnparsedExpression1921);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:962:2: this_Number_4= ruleNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnparsedExpressionAccess().getNumberParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleUnparsedExpression1951);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:981:1: entryRuleUnparsedCommand returns [EObject current=null] : iv_ruleUnparsedCommand= ruleUnparsedCommand EOF ;
    public final EObject entryRuleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnparsedCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:982:2: (iv_ruleUnparsedCommand= ruleUnparsedCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:983:2: iv_ruleUnparsedCommand= ruleUnparsedCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnparsedCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand1985);
            iv_ruleUnparsedCommand=ruleUnparsedCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnparsedCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedCommand1995); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:990:1: ruleUnparsedCommand returns [EObject current=null] : ( KEYWORD_16 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleUnparsedCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_1_1=null;
        AntlrDatatypeRuleToken lv_command_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:995:6: ( ( KEYWORD_16 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:996:1: ( KEYWORD_16 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:996:1: ( KEYWORD_16 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:997:2: KEYWORD_16 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleUnparsedCommand2031); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1001:1: ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1002:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1002:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1003:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1003:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=KEYWORD_89 && LA14_0<=KEYWORD_31)) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1003:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1004:3: lv_command_1_1= RULE_ID
                    {
                    lv_command_1_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnparsedCommand2050); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1025:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnparsedCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand2074);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1057:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1058:2: (iv_ruleReference= ruleReference EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1059:2: iv_ruleReference= ruleReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2112);
            iv_ruleReference=ruleReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2122); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1066:1: ruleReference returns [EObject current=null] : ( KEYWORD_16 ( ( RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1071:6: ( ( KEYWORD_16 ( ( RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1072:1: ( KEYWORD_16 ( ( RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1072:1: ( KEYWORD_16 ( ( RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1073:2: KEYWORD_16 ( ( RULE_ID ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleReference2158); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1077:1: ( ( RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1078:1: ( RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1078:1: ( RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1079:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference2180); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1102:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1103:2: (iv_ruleText= ruleText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:2: iv_ruleText= ruleText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText2215);
            iv_ruleText=ruleText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2225); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1111:1: ruleText returns [EObject current=null] : ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1116:6: ( ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1117:1: ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1117:1: ( ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1118:1: ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1118:1: ( (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1119:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1119:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )
            int alt15=6;
            switch ( input.LA(1) ) {
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_28:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_15:
            case KEYWORD_17:
            case KEYWORD_21:
            case RULE_STRING:
            case RULE_INT:
            case RULE_ID:
            case RULE_ANY_OTHER:
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
            case KEYWORD_4:
                {
                alt15=4;
                }
                break;
            case KEYWORD_8:
                {
                alt15=5;
                }
                break;
            case KEYWORD_10:
                {
                alt15=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1119:1: (lv_value_0_1= ruleSchemeTextValueSegment | lv_value_0_2= KEYWORD_5 | lv_value_0_3= KEYWORD_6 | lv_value_0_4= KEYWORD_4 | lv_value_0_5= KEYWORD_8 | lv_value_0_6= KEYWORD_10 )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1120:3: lv_value_0_1= ruleSchemeTextValueSegment
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTextAccess().getValueSchemeTextValueSegmentParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleText2272);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1141:8: lv_value_0_2= KEYWORD_5
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleText2289); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1160:8: lv_value_0_3= KEYWORD_6
                    {
                    lv_value_0_3=(Token)input.LT(1);
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleText2319); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1179:8: lv_value_0_4= KEYWORD_4
                    {
                    lv_value_0_4=(Token)input.LT(1);
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleText2349); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1198:8: lv_value_0_5= KEYWORD_8
                    {
                    lv_value_0_5=(Token)input.LT(1);
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleText2379); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1217:8: lv_value_0_6= KEYWORD_10
                    {
                    lv_value_0_6=(Token)input.LT(1);
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleText2409); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1247:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1248:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1249:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2459);
            iv_ruleNumber=ruleNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2469); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1256:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1261:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1262:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1262:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1263:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1263:1: (lv_value_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1264:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2510); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1294:1: entryRuleSpecialCommand returns [EObject current=null] : iv_ruleSpecialCommand= ruleSpecialCommand EOF ;
    public final EObject entryRuleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1295:2: (iv_ruleSpecialCommand= ruleSpecialCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1296:2: iv_ruleSpecialCommand= ruleSpecialCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2549);
            iv_ruleSpecialCommand=ruleSpecialCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand2559); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1303:1: ruleSpecialCommand returns [EObject current=null] : (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_NewContext_7= ruleNewContext | this_ContextDef_8= ruleContextDef | this_Other_9= ruleOther ) ;
    public final EObject ruleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Include_0 = null;

        EObject this_Version_1 = null;

        EObject this_Markup_2 = null;

        EObject this_MarkupLines_3 = null;

        EObject this_BlockCommand_4 = null;

        EObject this_OutputDefinition_5 = null;

        EObject this_RelativeMusic_6 = null;

        EObject this_NewContext_7 = null;

        EObject this_ContextDef_8 = null;

        EObject this_Other_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1308:6: ( (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_NewContext_7= ruleNewContext | this_ContextDef_8= ruleContextDef | this_Other_9= ruleOther ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1309:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_NewContext_7= ruleNewContext | this_ContextDef_8= ruleContextDef | this_Other_9= ruleOther )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1309:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_NewContext_7= ruleNewContext | this_ContextDef_8= ruleContextDef | this_Other_9= ruleOther )
            int alt16=10;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_16) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_66:
                    {
                    alt16=2;
                    }
                    break;
                case KEYWORD_64:
                    {
                    alt16=1;
                    }
                    break;
                case KEYWORD_74:
                    {
                    alt16=7;
                    }
                    break;
                case KEYWORD_84:
                    {
                    alt16=4;
                    }
                    break;
                case KEYWORD_55:
                    {
                    alt16=3;
                    }
                    break;
                case KEYWORD_61:
                    {
                    int LA16_7 = input.LA(3);

                    if ( (LA16_7==KEYWORD_19) ) {
                        alt16=9;
                    }
                    else if ( (LA16_7==RULE_ID) ) {
                        alt16=8;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1309:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_NewContext_7= ruleNewContext | this_ContextDef_8= ruleContextDef | this_Other_9= ruleOther )", 16, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case KEYWORD_67:
                case KEYWORD_52:
                case KEYWORD_45:
                case KEYWORD_32:
                    {
                    alt16=5;
                    }
                    break;
                case KEYWORD_53:
                case KEYWORD_44:
                case KEYWORD_34:
                    {
                    alt16=6;
                    }
                    break;
                case KEYWORD_89:
                case KEYWORD_87:
                case KEYWORD_88:
                case KEYWORD_85:
                case KEYWORD_86:
                case KEYWORD_82:
                case KEYWORD_83:
                case KEYWORD_80:
                case KEYWORD_81:
                case KEYWORD_75:
                case KEYWORD_76:
                case KEYWORD_77:
                case KEYWORD_78:
                case KEYWORD_79:
                case KEYWORD_68:
                case KEYWORD_69:
                case KEYWORD_70:
                case KEYWORD_71:
                case KEYWORD_72:
                case KEYWORD_73:
                case KEYWORD_60:
                case KEYWORD_62:
                case KEYWORD_63:
                case KEYWORD_65:
                case KEYWORD_49:
                case KEYWORD_50:
                case KEYWORD_51:
                case KEYWORD_54:
                case KEYWORD_56:
                case KEYWORD_57:
                case KEYWORD_58:
                case KEYWORD_59:
                case KEYWORD_42:
                case KEYWORD_43:
                case KEYWORD_46:
                case KEYWORD_47:
                case KEYWORD_48:
                case KEYWORD_33:
                case KEYWORD_35:
                case KEYWORD_36:
                case KEYWORD_37:
                case KEYWORD_38:
                case KEYWORD_39:
                case KEYWORD_40:
                case KEYWORD_41:
                case KEYWORD_29:
                case KEYWORD_31:
                case KEYWORD_1:
                case KEYWORD_5:
                case KEYWORD_6:
                case KEYWORD_7:
                case KEYWORD_11:
                case KEYWORD_13:
                case KEYWORD_14:
                case KEYWORD_15:
                case KEYWORD_17:
                case KEYWORD_21:
                    {
                    alt16=10;
                    }
                    break;
                case KEYWORD_30:
                    {
                    alt16=8;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1309:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_NewContext_7= ruleNewContext | this_ContextDef_8= ruleContextDef | this_Other_9= ruleOther )", 16, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1309:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion | this_Markup_2= ruleMarkup | this_MarkupLines_3= ruleMarkupLines | this_BlockCommand_4= ruleBlockCommand | this_OutputDefinition_5= ruleOutputDefinition | this_RelativeMusic_6= ruleRelativeMusic | this_NewContext_7= ruleNewContext | this_ContextDef_8= ruleContextDef | this_Other_9= ruleOther )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1310:2: this_Include_0= ruleInclude
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleSpecialCommand2609);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1323:2: this_Version_1= ruleVersion
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleSpecialCommand2639);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1336:2: this_Markup_2= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleSpecialCommand2669);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1349:2: this_MarkupLines_3= ruleMarkupLines
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_ruleSpecialCommand2699);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1362:2: this_BlockCommand_4= ruleBlockCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getBlockCommandParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockCommand_in_ruleSpecialCommand2729);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1375:2: this_OutputDefinition_5= ruleOutputDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getOutputDefinitionParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputDefinition_in_ruleSpecialCommand2759);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1388:2: this_RelativeMusic_6= ruleRelativeMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getRelativeMusicParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelativeMusic_in_ruleSpecialCommand2789);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1401:2: this_NewContext_7= ruleNewContext
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getNewContextParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewContext_in_ruleSpecialCommand2819);
                    this_NewContext_7=ruleNewContext();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NewContext_7;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1414:2: this_ContextDef_8= ruleContextDef
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getContextDefParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextDef_in_ruleSpecialCommand2849);
                    this_ContextDef_8=ruleContextDef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ContextDef_8;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1427:2: this_Other_9= ruleOther
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getOtherParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOther_in_ruleSpecialCommand2879);
                    this_Other_9=ruleOther();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Other_9;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1446:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1447:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1448:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude2913);
            iv_ruleInclude=ruleInclude();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude2923); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1455:1: ruleInclude returns [EObject current=null] : ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_64 ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        Token lv_importURI_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1460:6: ( ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_64 ) ) ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1461:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_64 ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1461:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_64 ) ) ( (lv_importURI_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1462:2: KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_64 ) ) ( (lv_importURI_2_0= RULE_STRING ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleInclude2959); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1466:1: ( (lv_keyword_1_0= KEYWORD_64 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1467:1: (lv_keyword_1_0= KEYWORD_64 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1467:1: (lv_keyword_1_0= KEYWORD_64 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1468:3: lv_keyword_1_0= KEYWORD_64
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleInclude2978); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1488:2: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1489:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1489:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1490:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude3008); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1520:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1521:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1522:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVersionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion3048);
            iv_ruleVersion=ruleVersion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion3058); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1529:1: ruleVersion returns [EObject current=null] : ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_66 ) ) ( (lv_version_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        Token lv_version_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1534:6: ( ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_66 ) ) ( (lv_version_2_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1535:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_66 ) ) ( (lv_version_2_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1535:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_66 ) ) ( (lv_version_2_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1536:2: KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_66 ) ) ( (lv_version_2_0= RULE_STRING ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleVersion3094); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVersionAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1540:1: ( (lv_keyword_1_0= KEYWORD_66 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:1: (lv_keyword_1_0= KEYWORD_66 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:1: (lv_keyword_1_0= KEYWORD_66 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1542:3: lv_keyword_1_0= KEYWORD_66
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleVersion3113); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1562:2: ( (lv_version_2_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1563:1: (lv_version_2_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1563:1: (lv_version_2_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1564:3: lv_version_2_0= RULE_STRING
            {
            lv_version_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion3143); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1594:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1595:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1596:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkup_in_entryRuleMarkup3183);
            iv_ruleMarkup=ruleMarkup();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkup3193); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1603:1: ruleMarkup returns [EObject current=null] : ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_55 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        EObject lv_body_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1608:6: ( ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_55 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1609:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_55 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1609:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_55 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1610:2: KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_55 ) ) ( (lv_body_2_0= ruleMarkupBody ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleMarkup3229); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1614:1: ( (lv_keyword_1_0= KEYWORD_55 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1615:1: (lv_keyword_1_0= KEYWORD_55 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1615:1: (lv_keyword_1_0= KEYWORD_55 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1616:3: lv_keyword_1_0= KEYWORD_55
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleMarkup3248); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1636:2: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1637:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1637:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1638:3: lv_body_2_0= ruleMarkupBody
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkup3282);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1668:1: entryRuleMarkupLines returns [EObject current=null] : iv_ruleMarkupLines= ruleMarkupLines EOF ;
    public final EObject entryRuleMarkupLines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupLines = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1669:2: (iv_ruleMarkupLines= ruleMarkupLines EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1670:2: iv_ruleMarkupLines= ruleMarkupLines EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupLinesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines3317);
            iv_ruleMarkupLines=ruleMarkupLines();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupLines; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupLines3327); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1677:1: ruleMarkupLines returns [EObject current=null] : ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_84 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) ;
    public final EObject ruleMarkupLines() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        EObject lv_body_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1682:6: ( ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_84 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1683:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_84 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1683:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_84 ) ) ( (lv_body_2_0= ruleMarkupBody ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1684:2: KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_84 ) ) ( (lv_body_2_0= ruleMarkupBody ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleMarkupLines3363); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1688:1: ( (lv_keyword_1_0= KEYWORD_84 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1689:1: (lv_keyword_1_0= KEYWORD_84 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1689:1: (lv_keyword_1_0= KEYWORD_84 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1690:3: lv_keyword_1_0= KEYWORD_84
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleMarkupLines3382); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1710:2: ( (lv_body_2_0= ruleMarkupBody ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1711:1: (lv_body_2_0= ruleMarkupBody )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1711:1: (lv_body_2_0= ruleMarkupBody )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1712:3: lv_body_2_0= ruleMarkupBody
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_ruleMarkupLines3416);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1742:1: entryRuleMarkupBody returns [EObject current=null] : iv_ruleMarkupBody= ruleMarkupBody EOF ;
    public final EObject entryRuleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupBody = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1743:2: (iv_ruleMarkupBody= ruleMarkupBody EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1744:2: iv_ruleMarkupBody= ruleMarkupBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupBodyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody3451);
            iv_ruleMarkupBody=ruleMarkupBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBody3461); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1751:1: ruleMarkupBody returns [EObject current=null] : ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) ;
    public final EObject ruleMarkupBody() throws RecognitionException {
        EObject current = null;

        EObject lv_command_1_1 = null;

        EObject lv_command_1_2 = null;

        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1756:6: ( ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1757:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1757:1: ( () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1757:2: () ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )* ( (lv_block_2_0= ruleUnparsedBlock ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1757:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1758:2: 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1771:2: ( ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case KEYWORD_16:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred42()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case KEYWORD_2:
                    {
                    int LA18_7 = input.LA(2);

                    if ( (synpred42()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case KEYWORD_3:
                    {
                    int LA18_8 = input.LA(2);

                    if ( (synpred42()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1772:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1772:1: ( (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand ) )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1773:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1773:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( ((LA17_0>=KEYWORD_2 && LA17_0<=KEYWORD_3)) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==KEYWORD_16) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1773:1: (lv_command_1_1= ruleScheme | lv_command_1_2= ruleUnparsedCommand )", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1774:3: lv_command_1_1= ruleScheme
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandSchemeParserRuleCall_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleScheme_in_ruleMarkupBody3521);
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
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1795:8: lv_command_1_2= ruleUnparsedCommand
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody3540);
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
            	    break loop18;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1819:3: ( (lv_block_2_0= ruleUnparsedBlock ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_19) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred43()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1820:1: (lv_block_2_0= ruleUnparsedBlock )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1820:1: (lv_block_2_0= ruleUnparsedBlock )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1821:3: lv_block_2_0= ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody3565);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1851:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1852:2: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1853:2: iv_ruleBlockCommand= ruleBlockCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockCommand_in_entryRuleBlockCommand3601);
            iv_ruleBlockCommand=ruleBlockCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockCommand3611); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1860:1: ruleBlockCommand returns [EObject current=null] : ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) ) ;
    public final EObject ruleBlockCommand() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        Token lv_keyword_1_4=null;
        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1865:6: ( ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1866:1: ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1866:1: ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1867:2: KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 ) ) ) ( (lv_block_2_0= ruleSimpleBlock ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleBlockCommand3647); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlockCommandAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1871:1: ( ( (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1872:1: ( (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1872:1: ( (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1873:1: (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1873:1: (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 )
            int alt20=4;
            switch ( input.LA(1) ) {
            case KEYWORD_32:
                {
                alt20=1;
                }
                break;
            case KEYWORD_67:
                {
                alt20=2;
                }
                break;
            case KEYWORD_52:
                {
                alt20=3;
                }
                break;
            case KEYWORD_45:
                {
                alt20=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1873:1: (lv_keyword_1_1= KEYWORD_32 | lv_keyword_1_2= KEYWORD_67 | lv_keyword_1_3= KEYWORD_52 | lv_keyword_1_4= KEYWORD_45 )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1874:3: lv_keyword_1_1= KEYWORD_32
                    {
                    lv_keyword_1_1=(Token)input.LT(1);
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleBlockCommand3668); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1893:8: lv_keyword_1_2= KEYWORD_67
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleBlockCommand3698); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1912:8: lv_keyword_1_3= KEYWORD_52
                    {
                    lv_keyword_1_3=(Token)input.LT(1);
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleBlockCommand3728); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1931:8: lv_keyword_1_4= KEYWORD_45
                    {
                    lv_keyword_1_4=(Token)input.LT(1);
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleBlockCommand3758); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1953:2: ( (lv_block_2_0= ruleSimpleBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1954:1: (lv_block_2_0= ruleSimpleBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1954:1: (lv_block_2_0= ruleSimpleBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1955:3: lv_block_2_0= ruleSimpleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockCommandAccess().getBlockSimpleBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlockCommand3795);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1985:1: entryRuleOutputDefinition returns [EObject current=null] : iv_ruleOutputDefinition= ruleOutputDefinition EOF ;
    public final EObject entryRuleOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDefinition = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1986:2: (iv_ruleOutputDefinition= ruleOutputDefinition EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1987:2: iv_ruleOutputDefinition= ruleOutputDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition3830);
            iv_ruleOutputDefinition=ruleOutputDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDefinition3840); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1994:1: ruleOutputDefinition returns [EObject current=null] : ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleOutputDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1999:6: ( ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2000:1: ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2000:1: ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2001:2: KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 ) ) ) ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleOutputDefinition3876); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputDefinitionAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2005:1: ( ( (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:1: ( (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:1: ( (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2007:1: (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2007:1: (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 )
            int alt21=3;
            switch ( input.LA(1) ) {
            case KEYWORD_44:
                {
                alt21=1;
                }
                break;
            case KEYWORD_34:
                {
                alt21=2;
                }
                break;
            case KEYWORD_53:
                {
                alt21=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2007:1: (lv_keyword_1_1= KEYWORD_44 | lv_keyword_1_2= KEYWORD_34 | lv_keyword_1_3= KEYWORD_53 )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2008:3: lv_keyword_1_1= KEYWORD_44
                    {
                    lv_keyword_1_1=(Token)input.LT(1);
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOutputDefinition3897); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2027:8: lv_keyword_1_2= KEYWORD_34
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleOutputDefinition3927); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2046:8: lv_keyword_1_3= KEYWORD_53
                    {
                    lv_keyword_1_3=(Token)input.LT(1);
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleOutputDefinition3957); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2068:2: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2069:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2069:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2070:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOutputDefinitionAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleOutputDefinition3994);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2100:1: entryRuleRelativeMusic returns [EObject current=null] : iv_ruleRelativeMusic= ruleRelativeMusic EOF ;
    public final EObject entryRuleRelativeMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2101:2: (iv_ruleRelativeMusic= ruleRelativeMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2102:2: iv_ruleRelativeMusic= ruleRelativeMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelativeMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic4029);
            iv_ruleRelativeMusic=ruleRelativeMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRelativeMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeMusic4039); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2109:1: ruleRelativeMusic returns [EObject current=null] : ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_74 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) ) ;
    public final EObject ruleRelativeMusic() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        EObject lv_pitch_2_0 = null;

        EObject lv_music_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2114:6: ( ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_74 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2115:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_74 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2115:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_74 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2116:2: KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_74 ) ) ( (lv_pitch_2_0= rulePitch ) )? ( (lv_music_3_0= ruleExpression ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleRelativeMusic4075); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRelativeMusicAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2120:1: ( (lv_keyword_1_0= KEYWORD_74 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2121:1: (lv_keyword_1_0= KEYWORD_74 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2121:1: (lv_keyword_1_0= KEYWORD_74 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2122:3: lv_keyword_1_0= KEYWORD_74
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleRelativeMusic4094); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2142:2: ( (lv_pitch_2_0= rulePitch ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred49()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2143:1: (lv_pitch_2_0= rulePitch )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2143:1: (lv_pitch_2_0= rulePitch )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2144:3: lv_pitch_2_0= rulePitch
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePitch_in_ruleRelativeMusic4128);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2166:3: ( (lv_music_3_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2167:1: (lv_music_3_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2167:1: (lv_music_3_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2168:3: lv_music_3_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRelativeMusicAccess().getMusicExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRelativeMusic4150);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2198:1: entryRulePitch returns [EObject current=null] : iv_rulePitch= rulePitch EOF ;
    public final EObject entryRulePitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePitch = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2199:2: (iv_rulePitch= rulePitch EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2200:2: iv_rulePitch= rulePitch EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPitchRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePitch_in_entryRulePitch4185);
            iv_rulePitch=rulePitch();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePitch4195); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2207:1: rulePitch returns [EObject current=null] : ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )? ) ;
    public final EObject rulePitch() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token lv_octaveCheck_1_0=null;
        Token lv_reminderAccidental_3_0=null;
        Token lv_cautionaryAccidental_4_0=null;
        EObject lv_octaveShift_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2212:6: ( ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2213:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2213:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2213:2: ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_12 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2213:2: ( (lv_base_0_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2214:1: (lv_base_0_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2214:1: (lv_base_0_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2215:3: lv_base_0_0= RULE_ID
            {
            lv_base_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePitch4237); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2237:2: ( (lv_octaveCheck_1_0= KEYWORD_12 ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_12) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred50()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2238:1: (lv_octaveCheck_1_0= KEYWORD_12 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2238:1: (lv_octaveCheck_1_0= KEYWORD_12 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2239:3: lv_octaveCheck_1_0= KEYWORD_12
                    {
                    lv_octaveCheck_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rulePitch4261); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2259:3: ( (lv_octaveShift_2_0= ruleOctave ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_4) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred51()) ) {
                    alt24=1;
                }
            }
            else if ( (LA24_0==KEYWORD_8) ) {
                int LA24_2 = input.LA(2);

                if ( (synpred51()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: (lv_octaveShift_2_0= ruleOctave )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: (lv_octaveShift_2_0= ruleOctave )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2261:3: lv_octaveShift_2_0= ruleOctave
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOctave_in_rulePitch4296);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2283:3: ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_1) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred52()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2284:1: (lv_reminderAccidental_3_0= KEYWORD_1 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2284:1: (lv_reminderAccidental_3_0= KEYWORD_1 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2285:3: lv_reminderAccidental_3_0= KEYWORD_1
                    {
                    lv_reminderAccidental_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePitch4316); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2305:3: ( (lv_cautionaryAccidental_4_0= KEYWORD_14 ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_14) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred53()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2306:1: (lv_cautionaryAccidental_4_0= KEYWORD_14 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2306:1: (lv_cautionaryAccidental_4_0= KEYWORD_14 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2307:3: lv_cautionaryAccidental_4_0= KEYWORD_14
                    {
                    lv_cautionaryAccidental_4_0=(Token)input.LT(1);
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rulePitch4349); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2335:1: entryRuleOctave returns [EObject current=null] : iv_ruleOctave= ruleOctave EOF ;
    public final EObject entryRuleOctave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctave = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2336:2: (iv_ruleOctave= ruleOctave EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2337:2: iv_ruleOctave= ruleOctave EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOctaveRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOctave_in_entryRuleOctave4398);
            iv_ruleOctave=ruleOctave();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOctave; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOctave4408); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2344:1: ruleOctave returns [EObject current=null] : ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ ) ;
    public final EObject ruleOctave() throws RecognitionException {
        EObject current = null;

        Token lv_up_0_0=null;
        Token lv_down_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2349:6: ( ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2350:1: ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2350:1: ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_4) ) {
                alt29=1;
            }
            else if ( (LA29_0==KEYWORD_8) ) {
                alt29=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2350:1: ( ( (lv_up_0_0= KEYWORD_4 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2350:2: ( (lv_up_0_0= KEYWORD_4 ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2350:2: ( (lv_up_0_0= KEYWORD_4 ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==KEYWORD_4) ) {
                            int LA27_84 = input.LA(2);

                            if ( (synpred54()) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2351:1: (lv_up_0_0= KEYWORD_4 )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2351:1: (lv_up_0_0= KEYWORD_4 )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2352:3: lv_up_0_0= KEYWORD_4
                    	    {
                    	    lv_up_0_0=(Token)input.LT(1);
                    	    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleOctave4452); if (failed) return current;
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
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2373:6: ( (lv_down_1_0= KEYWORD_8 ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2373:6: ( (lv_down_1_0= KEYWORD_8 ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==KEYWORD_8) ) {
                            int LA28_85 = input.LA(2);

                            if ( (synpred56()) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2374:1: (lv_down_1_0= KEYWORD_8 )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2374:1: (lv_down_1_0= KEYWORD_8 )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2375:3: lv_down_1_0= KEYWORD_8
                    	    {
                    	    lv_down_1_0=(Token)input.LT(1);
                    	    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOctave4491); if (failed) return current;
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
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
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


    // $ANTLR start entryRuleNewContext
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2403:1: entryRuleNewContext returns [EObject current=null] : iv_ruleNewContext= ruleNewContext EOF ;
    public final EObject entryRuleNewContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContext = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2404:2: (iv_ruleNewContext= ruleNewContext EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2405:2: iv_ruleNewContext= ruleNewContext EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNewContextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNewContext_in_entryRuleNewContext4540);
            iv_ruleNewContext=ruleNewContext();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNewContext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewContext4550); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2412:1: ruleNewContext returns [EObject current=null] : ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( (lv_id_4_0= RULE_ID ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) ) ;
    public final EObject ruleNewContext() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;
        Token lv_context_2_0=null;
        Token lv_id_4_0=null;
        EObject lv_modification_5_0 = null;

        EObject lv_music_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2417:6: ( ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( (lv_id_4_0= RULE_ID ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2418:1: ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( (lv_id_4_0= RULE_ID ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2418:1: ( KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( (lv_id_4_0= RULE_ID ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2419:2: KEYWORD_16 ( ( (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 ) ) ) ( (lv_context_2_0= RULE_ID ) ) ( KEYWORD_12 ( (lv_id_4_0= RULE_ID ) ) )? ( (lv_modification_5_0= ruleContextModification ) )? ( (lv_music_6_0= ruleExpression ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleNewContext4586); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNewContextAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2423:1: ( ( (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2424:1: ( (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2424:1: ( (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2425:1: (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2425:1: (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_30) ) {
                alt30=1;
            }
            else if ( (LA30_0==KEYWORD_61) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2425:1: (lv_keyword_1_1= KEYWORD_30 | lv_keyword_1_2= KEYWORD_61 )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2426:3: lv_keyword_1_1= KEYWORD_30
                    {
                    lv_keyword_1_1=(Token)input.LT(1);
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleNewContext4607); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2445:8: lv_keyword_1_2= KEYWORD_61
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleNewContext4637); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2467:2: ( (lv_context_2_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2468:1: (lv_context_2_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2468:1: (lv_context_2_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2469:3: lv_context_2_0= RULE_ID
            {
            lv_context_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewContext4670); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2491:2: ( KEYWORD_12 ( (lv_id_4_0= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_12) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred58()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2492:2: KEYWORD_12 ( (lv_id_4_0= RULE_ID ) )
                    {
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleNewContext4687); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNewContextAccess().getEqualsSignKeyword_3_0(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2496:1: ( (lv_id_4_0= RULE_ID ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2497:1: (lv_id_4_0= RULE_ID )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2497:1: (lv_id_4_0= RULE_ID )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2498:3: lv_id_4_0= RULE_ID
                    {
                    lv_id_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewContext4704); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getNewContextAccess().getIdIDTerminalRuleCall_3_1_0(), "id"); 
                      		
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
                      	        		lv_id_4_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2520:4: ( (lv_modification_5_0= ruleContextModification ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_16) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred59()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2521:1: (lv_modification_5_0= ruleContextModification )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2521:1: (lv_modification_5_0= ruleContextModification )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2522:3: lv_modification_5_0= ruleContextModification
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContextModification_in_ruleNewContext4732);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2544:3: ( (lv_music_6_0= ruleExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2545:1: (lv_music_6_0= ruleExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2545:1: (lv_music_6_0= ruleExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2546:3: lv_music_6_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getMusicExpressionParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNewContext4754);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2576:1: entryRuleContextModification returns [EObject current=null] : iv_ruleContextModification= ruleContextModification EOF ;
    public final EObject entryRuleContextModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModification = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2577:2: (iv_ruleContextModification= ruleContextModification EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2578:2: iv_ruleContextModification= ruleContextModification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextModificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextModification_in_entryRuleContextModification4789);
            iv_ruleContextModification=ruleContextModification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextModification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextModification4799); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2585:1: ruleContextModification returns [EObject current=null] : ( KEYWORD_16 KEYWORD_41 ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleContextModification() throws RecognitionException {
        EObject current = null;

        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2590:6: ( ( KEYWORD_16 KEYWORD_41 ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2591:1: ( KEYWORD_16 KEYWORD_41 ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2591:1: ( KEYWORD_16 KEYWORD_41 ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2592:2: KEYWORD_16 KEYWORD_41 ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleContextModification4835); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextModificationAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleContextModification4846); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextModificationAccess().getWithKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2601:1: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2602:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2602:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2603:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getContextModificationAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContextModification4867);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2633:1: entryRuleContextDef returns [EObject current=null] : iv_ruleContextDef= ruleContextDef EOF ;
    public final EObject entryRuleContextDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDef = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2634:2: (iv_ruleContextDef= ruleContextDef EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2635:2: iv_ruleContextDef= ruleContextDef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextDefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextDef_in_entryRuleContextDef4902);
            iv_ruleContextDef=ruleContextDef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDef4912); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2642:1: ruleContextDef returns [EObject current=null] : ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_61 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) ;
    public final EObject ruleContextDef() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        EObject lv_block_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2647:6: ( ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_61 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2648:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_61 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2648:1: ( KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_61 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2649:2: KEYWORD_16 ( (lv_keyword_1_0= KEYWORD_61 ) ) ( (lv_block_2_0= ruleUnparsedBlock ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleContextDef4948); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextDefAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2653:1: ( (lv_keyword_1_0= KEYWORD_61 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2654:1: (lv_keyword_1_0= KEYWORD_61 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2654:1: (lv_keyword_1_0= KEYWORD_61 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2655:3: lv_keyword_1_0= KEYWORD_61
            {
            lv_keyword_1_0=(Token)input.LT(1);
            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleContextDef4967); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2675:2: ( (lv_block_2_0= ruleUnparsedBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2676:1: (lv_block_2_0= ruleUnparsedBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2676:1: (lv_block_2_0= ruleUnparsedBlock )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2677:3: lv_block_2_0= ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getContextDefAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_ruleContextDef5001);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2707:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2708:2: (iv_ruleOther= ruleOther EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2709:2: iv_ruleOther= ruleOther EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOtherRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOther_in_entryRuleOther5036);
            iv_ruleOther=ruleOther();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOther; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOther5046); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2716:1: ruleOther returns [EObject current=null] : ( KEYWORD_16 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_2=null;
        Token lv_keyword_1_3=null;
        AntlrDatatypeRuleToken lv_keyword_1_1 = null;

        AntlrDatatypeRuleToken lv_keyword_1_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2721:6: ( ( KEYWORD_16 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2722:1: ( KEYWORD_16 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2722:1: ( KEYWORD_16 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2723:2: KEYWORD_16 ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) )
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleOther5082); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOtherAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2727:1: ( ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2728:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2728:1: ( (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2729:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2729:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )
            int alt33=4;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_15:
            case KEYWORD_17:
            case KEYWORD_21:
                {
                alt33=1;
                }
                break;
            case KEYWORD_5:
                {
                alt33=2;
                }
                break;
            case KEYWORD_6:
                {
                alt33=3;
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_60:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_65:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_54:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_33:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_31:
                {
                alt33=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2729:1: (lv_keyword_1_1= ruleSpecialCharacter | lv_keyword_1_2= KEYWORD_5 | lv_keyword_1_3= KEYWORD_6 | lv_keyword_1_4= ruleOtherName )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2730:3: lv_keyword_1_1= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOtherAccess().getKeywordSpecialCharacterParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleOther5105);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2751:8: lv_keyword_1_2= KEYWORD_5
                    {
                    lv_keyword_1_2=(Token)input.LT(1);
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleOther5122); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2770:8: lv_keyword_1_3= KEYWORD_6
                    {
                    lv_keyword_1_3=(Token)input.LT(1);
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleOther5152); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2789:8: lv_keyword_1_4= ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOtherAccess().getKeywordOtherNameParserRuleCall_1_0_3(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleOther5184);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2821:1: entryRuleOtherName returns [String current=null] : iv_ruleOtherName= ruleOtherName EOF ;
    public final String entryRuleOtherName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOtherName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2822:1: (iv_ruleOtherName= ruleOtherName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2823:2: iv_ruleOtherName= ruleOtherName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOtherNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOtherName_in_entryRuleOtherName5223);
            iv_ruleOtherName=ruleOtherName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOtherName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherName5234); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2830:1: ruleOtherName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_60 | kw= KEYWORD_75 | kw= KEYWORD_42 | kw= KEYWORD_82 | kw= KEYWORD_49 | kw= KEYWORD_76 | kw= KEYWORD_50 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_85 | kw= KEYWORD_51 | kw= KEYWORD_83 | kw= KEYWORD_69 | kw= KEYWORD_43 | kw= KEYWORD_80 | kw= KEYWORD_63 | kw= KEYWORD_89 | kw= KEYWORD_29 | kw= KEYWORD_77 | kw= KEYWORD_54 | kw= KEYWORD_70 | kw= KEYWORD_78 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_71 | kw= KEYWORD_72 | kw= KEYWORD_56 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_65 | kw= KEYWORD_57 | kw= KEYWORD_58 | kw= KEYWORD_37 | kw= KEYWORD_59 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_86 | kw= KEYWORD_38 | kw= KEYWORD_87 | kw= KEYWORD_88 | kw= KEYWORD_46 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_79 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_41 ) ;
    public final AntlrDatatypeRuleToken ruleOtherName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2835:6: ( (kw= KEYWORD_60 | kw= KEYWORD_75 | kw= KEYWORD_42 | kw= KEYWORD_82 | kw= KEYWORD_49 | kw= KEYWORD_76 | kw= KEYWORD_50 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_85 | kw= KEYWORD_51 | kw= KEYWORD_83 | kw= KEYWORD_69 | kw= KEYWORD_43 | kw= KEYWORD_80 | kw= KEYWORD_63 | kw= KEYWORD_89 | kw= KEYWORD_29 | kw= KEYWORD_77 | kw= KEYWORD_54 | kw= KEYWORD_70 | kw= KEYWORD_78 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_71 | kw= KEYWORD_72 | kw= KEYWORD_56 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_65 | kw= KEYWORD_57 | kw= KEYWORD_58 | kw= KEYWORD_37 | kw= KEYWORD_59 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_86 | kw= KEYWORD_38 | kw= KEYWORD_87 | kw= KEYWORD_88 | kw= KEYWORD_46 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_79 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_41 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2836:1: (kw= KEYWORD_60 | kw= KEYWORD_75 | kw= KEYWORD_42 | kw= KEYWORD_82 | kw= KEYWORD_49 | kw= KEYWORD_76 | kw= KEYWORD_50 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_85 | kw= KEYWORD_51 | kw= KEYWORD_83 | kw= KEYWORD_69 | kw= KEYWORD_43 | kw= KEYWORD_80 | kw= KEYWORD_63 | kw= KEYWORD_89 | kw= KEYWORD_29 | kw= KEYWORD_77 | kw= KEYWORD_54 | kw= KEYWORD_70 | kw= KEYWORD_78 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_71 | kw= KEYWORD_72 | kw= KEYWORD_56 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_65 | kw= KEYWORD_57 | kw= KEYWORD_58 | kw= KEYWORD_37 | kw= KEYWORD_59 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_86 | kw= KEYWORD_38 | kw= KEYWORD_87 | kw= KEYWORD_88 | kw= KEYWORD_46 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_79 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_41 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2836:1: (kw= KEYWORD_60 | kw= KEYWORD_75 | kw= KEYWORD_42 | kw= KEYWORD_82 | kw= KEYWORD_49 | kw= KEYWORD_76 | kw= KEYWORD_50 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_85 | kw= KEYWORD_51 | kw= KEYWORD_83 | kw= KEYWORD_69 | kw= KEYWORD_43 | kw= KEYWORD_80 | kw= KEYWORD_63 | kw= KEYWORD_89 | kw= KEYWORD_29 | kw= KEYWORD_77 | kw= KEYWORD_54 | kw= KEYWORD_70 | kw= KEYWORD_78 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_71 | kw= KEYWORD_72 | kw= KEYWORD_56 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_65 | kw= KEYWORD_57 | kw= KEYWORD_58 | kw= KEYWORD_37 | kw= KEYWORD_59 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_86 | kw= KEYWORD_38 | kw= KEYWORD_87 | kw= KEYWORD_88 | kw= KEYWORD_46 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_79 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_41 )
            int alt34=47;
            switch ( input.LA(1) ) {
            case KEYWORD_60:
                {
                alt34=1;
                }
                break;
            case KEYWORD_75:
                {
                alt34=2;
                }
                break;
            case KEYWORD_42:
                {
                alt34=3;
                }
                break;
            case KEYWORD_82:
                {
                alt34=4;
                }
                break;
            case KEYWORD_49:
                {
                alt34=5;
                }
                break;
            case KEYWORD_76:
                {
                alt34=6;
                }
                break;
            case KEYWORD_50:
                {
                alt34=7;
                }
                break;
            case KEYWORD_68:
                {
                alt34=8;
                }
                break;
            case KEYWORD_62:
                {
                alt34=9;
                }
                break;
            case KEYWORD_85:
                {
                alt34=10;
                }
                break;
            case KEYWORD_51:
                {
                alt34=11;
                }
                break;
            case KEYWORD_83:
                {
                alt34=12;
                }
                break;
            case KEYWORD_69:
                {
                alt34=13;
                }
                break;
            case KEYWORD_43:
                {
                alt34=14;
                }
                break;
            case KEYWORD_80:
                {
                alt34=15;
                }
                break;
            case KEYWORD_63:
                {
                alt34=16;
                }
                break;
            case KEYWORD_89:
                {
                alt34=17;
                }
                break;
            case KEYWORD_29:
                {
                alt34=18;
                }
                break;
            case KEYWORD_77:
                {
                alt34=19;
                }
                break;
            case KEYWORD_54:
                {
                alt34=20;
                }
                break;
            case KEYWORD_70:
                {
                alt34=21;
                }
                break;
            case KEYWORD_78:
                {
                alt34=22;
                }
                break;
            case KEYWORD_33:
                {
                alt34=23;
                }
                break;
            case KEYWORD_35:
                {
                alt34=24;
                }
                break;
            case KEYWORD_71:
                {
                alt34=25;
                }
                break;
            case KEYWORD_72:
                {
                alt34=26;
                }
                break;
            case KEYWORD_56:
                {
                alt34=27;
                }
                break;
            case KEYWORD_36:
                {
                alt34=28;
                }
                break;
            case KEYWORD_73:
                {
                alt34=29;
                }
                break;
            case KEYWORD_65:
                {
                alt34=30;
                }
                break;
            case KEYWORD_57:
                {
                alt34=31;
                }
                break;
            case KEYWORD_58:
                {
                alt34=32;
                }
                break;
            case KEYWORD_37:
                {
                alt34=33;
                }
                break;
            case KEYWORD_59:
                {
                alt34=34;
                }
                break;
            case KEYWORD_81:
                {
                alt34=35;
                }
                break;
            case KEYWORD_31:
                {
                alt34=36;
                }
                break;
            case KEYWORD_86:
                {
                alt34=37;
                }
                break;
            case KEYWORD_38:
                {
                alt34=38;
                }
                break;
            case KEYWORD_87:
                {
                alt34=39;
                }
                break;
            case KEYWORD_88:
                {
                alt34=40;
                }
                break;
            case KEYWORD_46:
                {
                alt34=41;
                }
                break;
            case KEYWORD_39:
                {
                alt34=42;
                }
                break;
            case KEYWORD_47:
                {
                alt34=43;
                }
                break;
            case KEYWORD_79:
                {
                alt34=44;
                }
                break;
            case KEYWORD_40:
                {
                alt34=45;
                }
                break;
            case KEYWORD_48:
                {
                alt34=46;
                }
                break;
            case KEYWORD_41:
                {
                alt34=47;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2836:1: (kw= KEYWORD_60 | kw= KEYWORD_75 | kw= KEYWORD_42 | kw= KEYWORD_82 | kw= KEYWORD_49 | kw= KEYWORD_76 | kw= KEYWORD_50 | kw= KEYWORD_68 | kw= KEYWORD_62 | kw= KEYWORD_85 | kw= KEYWORD_51 | kw= KEYWORD_83 | kw= KEYWORD_69 | kw= KEYWORD_43 | kw= KEYWORD_80 | kw= KEYWORD_63 | kw= KEYWORD_89 | kw= KEYWORD_29 | kw= KEYWORD_77 | kw= KEYWORD_54 | kw= KEYWORD_70 | kw= KEYWORD_78 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_71 | kw= KEYWORD_72 | kw= KEYWORD_56 | kw= KEYWORD_36 | kw= KEYWORD_73 | kw= KEYWORD_65 | kw= KEYWORD_57 | kw= KEYWORD_58 | kw= KEYWORD_37 | kw= KEYWORD_59 | kw= KEYWORD_81 | kw= KEYWORD_31 | kw= KEYWORD_86 | kw= KEYWORD_38 | kw= KEYWORD_87 | kw= KEYWORD_88 | kw= KEYWORD_46 | kw= KEYWORD_39 | kw= KEYWORD_47 | kw= KEYWORD_79 | kw= KEYWORD_40 | kw= KEYWORD_48 | kw= KEYWORD_41 )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2837:2: kw= KEYWORD_60
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleOtherName5272); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2844:2: kw= KEYWORD_75
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleOtherName5291); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2851:2: kw= KEYWORD_42
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleOtherName5310); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAliasKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2858:2: kw= KEYWORD_82
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleOtherName5329); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2865:2: kw= KEYWORD_49
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleOtherName5348); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getChangeKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2872:2: kw= KEYWORD_76
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleOtherName5367); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getChordmodeKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2879:2: kw= KEYWORD_50
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleOtherName5386); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getChordsKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2886:2: kw= KEYWORD_68
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleOtherName5405); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getConsistsKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2893:2: kw= KEYWORD_62
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleOtherName5424); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDefaultKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2900:2: kw= KEYWORD_85
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_ruleOtherName5443); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2907:2: kw= KEYWORD_51
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleOtherName5462); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDeniesKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2914:2: kw= KEYWORD_83
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleOtherName5481); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDescriptionKeyword_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2921:2: kw= KEYWORD_69
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleOtherName5500); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDrummodeKeyword_12(), null); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2928:2: kw= KEYWORD_43
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleOtherName5519); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getDrumsKeyword_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2935:2: kw= KEYWORD_80
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleOtherName5538); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getFiguremodeKeyword_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2942:2: kw= KEYWORD_63
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleOtherName5557); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getFiguresKeyword_15(), null); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2949:2: kw= KEYWORD_89
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_89,FOLLOW_KEYWORD_89_in_ruleOtherName5576); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_16(), null); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2956:2: kw= KEYWORD_29
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleOtherName5595); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getKeyKeyword_17(), null); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2963:2: kw= KEYWORD_77
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleOtherName5614); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLyricmodeKeyword_18(), null); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2970:2: kw= KEYWORD_54
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleOtherName5633); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLyricsKeyword_19(), null); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2977:2: kw= KEYWORD_70
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleOtherName5652); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getLyricstoKeyword_20(), null); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2984:2: kw= KEYWORD_78
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleOtherName5671); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getMaininputKeyword_21(), null); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2991:2: kw= KEYWORD_33
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleOtherName5690); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getMarkKeyword_22(), null); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2998:2: kw= KEYWORD_35
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleOtherName5709); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getNameKeyword_23(), null); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3005:2: kw= KEYWORD_71
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleOtherName5728); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getNotemodeKeyword_24(), null); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3012:2: kw= KEYWORD_72
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleOtherName5747); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getObjectidKeyword_25(), null); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3019:2: kw= KEYWORD_56
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleOtherName5766); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOctaveKeyword_26(), null); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3026:2: kw= KEYWORD_36
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleOtherName5785); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOnceKeyword_27(), null); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3033:2: kw= KEYWORD_73
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleOtherName5804); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getOverrideKeyword_28(), null); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3040:2: kw= KEYWORD_65
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleOtherName5823); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getPartialKeyword_29(), null); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3047:2: kw= KEYWORD_57
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleOtherName5842); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRemoveKeyword_30(), null); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3054:2: kw= KEYWORD_58
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleOtherName5861); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRepeatKeyword_31(), null); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3061:2: kw= KEYWORD_37
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleOtherName5880); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRestKeyword_32(), null); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3068:2: kw= KEYWORD_59
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleOtherName5899); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getRevertKeyword_33(), null); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3075:2: kw= KEYWORD_81
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleOtherName5918); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSequentialKeyword_34(), null); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3082:2: kw= KEYWORD_31
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleOtherName5937); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSetKeyword_35(), null); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3089:2: kw= KEYWORD_86
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_ruleOtherName5956); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_36(), null); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3096:2: kw= KEYWORD_38
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleOtherName5975); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSkipKeyword_37(), null); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3103:2: kw= KEYWORD_87
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_ruleOtherName5994); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_38(), null); 
                          
                    }

                    }
                    break;
                case 40 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3110:2: kw= KEYWORD_88
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_ruleOtherName6013); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_39(), null); 
                          
                    }

                    }
                    break;
                case 41 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3117:2: kw= KEYWORD_46
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleOtherName6032); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTempoKeyword_40(), null); 
                          
                    }

                    }
                    break;
                case 42 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3124:2: kw= KEYWORD_39
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleOtherName6051); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTimeKeyword_41(), null); 
                          
                    }

                    }
                    break;
                case 43 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3131:2: kw= KEYWORD_47
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleOtherName6070); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTimesKeyword_42(), null); 
                          
                    }

                    }
                    break;
                case 44 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3138:2: kw= KEYWORD_79
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleOtherName6089); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTransposeKeyword_43(), null); 
                          
                    }

                    }
                    break;
                case 45 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3145:2: kw= KEYWORD_40
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleOtherName6108); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getTypeKeyword_44(), null); 
                          
                    }

                    }
                    break;
                case 46 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3152:2: kw= KEYWORD_48
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleOtherName6127); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getUnsetKeyword_45(), null); 
                          
                    }

                    }
                    break;
                case 47 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3159:2: kw= KEYWORD_41
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleOtherName6146); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getOtherNameAccess().getWithKeyword_46(), null); 
                          
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3172:1: entryRuleSpecialCommandName returns [String current=null] : iv_ruleSpecialCommandName= ruleSpecialCommandName EOF ;
    public final String entryRuleSpecialCommandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCommandName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3173:1: (iv_ruleSpecialCommandName= ruleSpecialCommandName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3174:2: iv_ruleSpecialCommandName= ruleSpecialCommandName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecialCommandNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName6186);
            iv_ruleSpecialCommandName=ruleSpecialCommandName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecialCommandName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommandName6197); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3181:1: ruleSpecialCommandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_64 | kw= KEYWORD_66 | kw= KEYWORD_55 | kw= KEYWORD_84 | kw= KEYWORD_32 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_52 | kw= KEYWORD_45 | kw= KEYWORD_44 | kw= KEYWORD_34 | kw= KEYWORD_53 | kw= KEYWORD_74 | kw= KEYWORD_30 | kw= KEYWORD_41 | this_OtherName_15= ruleOtherName ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCommandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OtherName_15 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3186:6: ( (kw= KEYWORD_64 | kw= KEYWORD_66 | kw= KEYWORD_55 | kw= KEYWORD_84 | kw= KEYWORD_32 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_52 | kw= KEYWORD_45 | kw= KEYWORD_44 | kw= KEYWORD_34 | kw= KEYWORD_53 | kw= KEYWORD_74 | kw= KEYWORD_30 | kw= KEYWORD_41 | this_OtherName_15= ruleOtherName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3187:1: (kw= KEYWORD_64 | kw= KEYWORD_66 | kw= KEYWORD_55 | kw= KEYWORD_84 | kw= KEYWORD_32 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_52 | kw= KEYWORD_45 | kw= KEYWORD_44 | kw= KEYWORD_34 | kw= KEYWORD_53 | kw= KEYWORD_74 | kw= KEYWORD_30 | kw= KEYWORD_41 | this_OtherName_15= ruleOtherName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3187:1: (kw= KEYWORD_64 | kw= KEYWORD_66 | kw= KEYWORD_55 | kw= KEYWORD_84 | kw= KEYWORD_32 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_52 | kw= KEYWORD_45 | kw= KEYWORD_44 | kw= KEYWORD_34 | kw= KEYWORD_53 | kw= KEYWORD_74 | kw= KEYWORD_30 | kw= KEYWORD_41 | this_OtherName_15= ruleOtherName )
            int alt35=16;
            switch ( input.LA(1) ) {
            case KEYWORD_64:
                {
                alt35=1;
                }
                break;
            case KEYWORD_66:
                {
                alt35=2;
                }
                break;
            case KEYWORD_55:
                {
                alt35=3;
                }
                break;
            case KEYWORD_84:
                {
                alt35=4;
                }
                break;
            case KEYWORD_32:
                {
                alt35=5;
                }
                break;
            case KEYWORD_67:
                {
                alt35=6;
                }
                break;
            case KEYWORD_61:
                {
                alt35=7;
                }
                break;
            case KEYWORD_52:
                {
                alt35=8;
                }
                break;
            case KEYWORD_45:
                {
                alt35=9;
                }
                break;
            case KEYWORD_44:
                {
                alt35=10;
                }
                break;
            case KEYWORD_34:
                {
                alt35=11;
                }
                break;
            case KEYWORD_53:
                {
                alt35=12;
                }
                break;
            case KEYWORD_74:
                {
                alt35=13;
                }
                break;
            case KEYWORD_30:
                {
                alt35=14;
                }
                break;
            case KEYWORD_41:
                {
                int LA35_15 = input.LA(2);

                if ( (synpred123()) ) {
                    alt35=15;
                }
                else if ( (true) ) {
                    alt35=16;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3187:1: (kw= KEYWORD_64 | kw= KEYWORD_66 | kw= KEYWORD_55 | kw= KEYWORD_84 | kw= KEYWORD_32 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_52 | kw= KEYWORD_45 | kw= KEYWORD_44 | kw= KEYWORD_34 | kw= KEYWORD_53 | kw= KEYWORD_74 | kw= KEYWORD_30 | kw= KEYWORD_41 | this_OtherName_15= ruleOtherName )", 35, 15, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_60:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_65:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_54:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_33:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_29:
            case KEYWORD_31:
                {
                alt35=16;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3187:1: (kw= KEYWORD_64 | kw= KEYWORD_66 | kw= KEYWORD_55 | kw= KEYWORD_84 | kw= KEYWORD_32 | kw= KEYWORD_67 | kw= KEYWORD_61 | kw= KEYWORD_52 | kw= KEYWORD_45 | kw= KEYWORD_44 | kw= KEYWORD_34 | kw= KEYWORD_53 | kw= KEYWORD_74 | kw= KEYWORD_30 | kw= KEYWORD_41 | this_OtherName_15= ruleOtherName )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3188:2: kw= KEYWORD_64
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleSpecialCommandName6235); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3195:2: kw= KEYWORD_66
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleSpecialCommandName6254); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3202:2: kw= KEYWORD_55
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleSpecialCommandName6273); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3209:2: kw= KEYWORD_84
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleSpecialCommandName6292); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3216:2: kw= KEYWORD_32
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleSpecialCommandName6311); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getBookKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3223:2: kw= KEYWORD_67
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleSpecialCommandName6330); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getBookpartKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3230:2: kw= KEYWORD_61
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleSpecialCommandName6349); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3237:2: kw= KEYWORD_52
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleSpecialCommandName6368); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getHeaderKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3244:2: kw= KEYWORD_45
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleSpecialCommandName6387); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getScoreKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3251:2: kw= KEYWORD_44
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleSpecialCommandName6406); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getPaperKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3258:2: kw= KEYWORD_34
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleSpecialCommandName6425); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getMidiKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3265:2: kw= KEYWORD_53
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleSpecialCommandName6444); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getLayoutKeyword_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3272:2: kw= KEYWORD_74
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleSpecialCommandName6463); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getRelativeKeyword_12(), null); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3279:2: kw= KEYWORD_30
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleSpecialCommandName6482); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getNewKeyword_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3286:2: kw= KEYWORD_41
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleSpecialCommandName6501); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSpecialCommandNameAccess().getWithKeyword_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3293:5: this_OtherName_15= ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSpecialCommandNameAccess().getOtherNameParserRuleCall_15(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_ruleSpecialCommandName6529);
                    this_OtherName_15=ruleOtherName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_OtherName_15);
                          
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3311:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3315:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3316:2: iv_ruleScheme= ruleScheme EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme6579);
            iv_ruleScheme=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme6589); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3326:1: ruleScheme returns [EObject current=null] : ( ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3332:6: ( ( ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3333:1: ( ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3333:1: ( ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3333:2: ( KEYWORD_2 | KEYWORD_3 ) ( (lv_value_2_0= ruleSchemeExpression ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3333:2: ( KEYWORD_2 | KEYWORD_3 )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_2) ) {
                alt36=1;
            }
            else if ( (LA36_0==KEYWORD_3) ) {
                alt36=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3333:2: ( KEYWORD_2 | KEYWORD_3 )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3334:2: KEYWORD_2
                    {
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleScheme6630); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeAccess().getNumberSignKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3340:2: KEYWORD_3
                    {
                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleScheme6647); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeAccess().getDollarSignKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3344:2: ( (lv_value_2_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3345:1: (lv_value_2_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3345:1: (lv_value_2_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3346:3: lv_value_2_0= ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme6669);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3379:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3380:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3381:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression6708);
            iv_ruleSchemeExpression=ruleSchemeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression6718); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3388:1: ruleSchemeExpression returns [EObject current=null] : ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_18 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_reference_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_quoted_0_0=null;
        Token lv_quasiquoted_1_0=null;
        Token lv_unquoted_2_0=null;
        Token lv_reference_3_0=null;
        EObject lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3393:6: ( ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_18 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_reference_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:1: ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_18 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_reference_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:1: ( ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_18 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_reference_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_18 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_reference_3_0= KEYWORD_3 ) )? )? ( (lv_value_4_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:2: ( ( (lv_quoted_0_0= KEYWORD_4 ) )? | ( (lv_quasiquoted_1_0= KEYWORD_18 ) )? | ( (lv_unquoted_2_0= KEYWORD_8 ) )? | ( (lv_reference_3_0= KEYWORD_3 ) )? )?
            int alt41=5;
            switch ( input.LA(1) ) {
                case KEYWORD_4:
                    {
                    alt41=1;
                    }
                    break;
                case KEYWORD_2:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_5:
                    {
                    int LA41_3 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_24:
                    {
                    int LA41_4 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_23:
                    {
                    int LA41_5 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_28:
                    {
                    int LA41_6 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_12:
                    {
                    int LA41_7 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_9:
                    {
                    int LA41_8 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_1:
                    {
                    int LA41_9 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_14:
                    {
                    int LA41_10 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_7:
                    {
                    int LA41_11 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_11:
                    {
                    int LA41_12 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_13:
                    {
                    int LA41_13 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_15:
                    {
                    int LA41_14 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_17:
                    {
                    int LA41_15 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_21:
                    {
                    int LA41_16 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_64:
                    {
                    int LA41_17 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_66:
                    {
                    int LA41_18 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_55:
                    {
                    int LA41_19 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_84:
                    {
                    int LA41_20 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_32:
                    {
                    int LA41_21 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_67:
                    {
                    int LA41_22 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_61:
                    {
                    int LA41_23 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_52:
                    {
                    int LA41_24 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_45:
                    {
                    int LA41_25 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_44:
                    {
                    int LA41_26 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_34:
                    {
                    int LA41_27 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_53:
                    {
                    int LA41_28 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_74:
                    {
                    int LA41_29 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_30:
                    {
                    int LA41_30 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_41:
                    {
                    int LA41_31 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_60:
                    {
                    int LA41_32 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_75:
                    {
                    int LA41_33 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_42:
                    {
                    int LA41_34 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_82:
                    {
                    int LA41_35 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_49:
                    {
                    int LA41_36 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_76:
                    {
                    int LA41_37 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_50:
                    {
                    int LA41_38 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_68:
                    {
                    int LA41_39 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_62:
                    {
                    int LA41_40 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_85:
                    {
                    int LA41_41 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_51:
                    {
                    int LA41_42 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_83:
                    {
                    int LA41_43 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_69:
                    {
                    int LA41_44 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_43:
                    {
                    int LA41_45 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_80:
                    {
                    int LA41_46 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_63:
                    {
                    int LA41_47 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_89:
                    {
                    int LA41_48 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_29:
                    {
                    int LA41_49 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_77:
                    {
                    int LA41_50 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_54:
                    {
                    int LA41_51 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_70:
                    {
                    int LA41_52 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_78:
                    {
                    int LA41_53 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_33:
                    {
                    int LA41_54 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_35:
                    {
                    int LA41_55 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_71:
                    {
                    int LA41_56 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_72:
                    {
                    int LA41_57 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_56:
                    {
                    int LA41_58 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_36:
                    {
                    int LA41_59 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_73:
                    {
                    int LA41_60 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_65:
                    {
                    int LA41_61 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_57:
                    {
                    int LA41_62 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_58:
                    {
                    int LA41_63 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_37:
                    {
                    int LA41_64 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_59:
                    {
                    int LA41_65 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_81:
                    {
                    int LA41_66 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_31:
                    {
                    int LA41_67 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_86:
                    {
                    int LA41_68 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_38:
                    {
                    int LA41_69 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_87:
                    {
                    int LA41_70 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_88:
                    {
                    int LA41_71 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_46:
                    {
                    int LA41_72 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_39:
                    {
                    int LA41_73 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_47:
                    {
                    int LA41_74 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_79:
                    {
                    int LA41_75 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_40:
                    {
                    int LA41_76 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_48:
                    {
                    int LA41_77 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA41_78 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA41_79 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA41_80 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    int LA41_81 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_22:
                    {
                    int LA41_82 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt41=1;
                    }
                    else if ( (synpred128()) ) {
                        alt41=2;
                    }
                    else if ( (synpred130()) ) {
                        alt41=3;
                    }
                    else if ( (synpred132()) ) {
                        alt41=4;
                    }
                    }
                    break;
                case KEYWORD_18:
                    {
                    alt41=2;
                    }
                    break;
                case KEYWORD_8:
                    {
                    alt41=3;
                    }
                    break;
                case KEYWORD_3:
                    {
                    alt41=4;
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:3: ( (lv_quoted_0_0= KEYWORD_4 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:3: ( (lv_quoted_0_0= KEYWORD_4 ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==KEYWORD_4) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3395:1: (lv_quoted_0_0= KEYWORD_4 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3395:1: (lv_quoted_0_0= KEYWORD_4 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3396:3: lv_quoted_0_0= KEYWORD_4
                            {
                            lv_quoted_0_0=(Token)input.LT(1);
                            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSchemeExpression6763); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3417:6: ( (lv_quasiquoted_1_0= KEYWORD_18 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3417:6: ( (lv_quasiquoted_1_0= KEYWORD_18 ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==KEYWORD_18) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3418:1: (lv_quasiquoted_1_0= KEYWORD_18 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3418:1: (lv_quasiquoted_1_0= KEYWORD_18 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3419:3: lv_quasiquoted_1_0= KEYWORD_18
                            {
                            lv_quasiquoted_1_0=(Token)input.LT(1);
                            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleSchemeExpression6802); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3440:6: ( (lv_unquoted_2_0= KEYWORD_8 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3440:6: ( (lv_unquoted_2_0= KEYWORD_8 ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==KEYWORD_8) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3441:1: (lv_unquoted_2_0= KEYWORD_8 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3441:1: (lv_unquoted_2_0= KEYWORD_8 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3442:3: lv_unquoted_2_0= KEYWORD_8
                            {
                            lv_unquoted_2_0=(Token)input.LT(1);
                            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSchemeExpression6841); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3463:6: ( (lv_reference_3_0= KEYWORD_3 ) )?
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3463:6: ( (lv_reference_3_0= KEYWORD_3 ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==KEYWORD_3) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3464:1: (lv_reference_3_0= KEYWORD_3 )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3464:1: (lv_reference_3_0= KEYWORD_3 )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3465:3: lv_reference_3_0= KEYWORD_3
                            {
                            lv_reference_3_0=(Token)input.LT(1);
                            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSchemeExpression6880); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSchemeExpressionAccess().getReferenceDollarSignKeyword_0_3_0(), "reference"); 
                                  
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


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3485:5: ( (lv_value_4_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3486:1: (lv_value_4_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3486:1: (lv_value_4_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3487:3: lv_value_4_0= ruleSchemeValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression6917);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3517:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3518:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3519:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue6952);
            iv_ruleSchemeValue=ruleSchemeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue6962); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3526:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3531:6: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3532:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3532:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )
            int alt42=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_ID) ) {
                    int LA42_8 = input.LA(3);

                    if ( (synpred133()) ) {
                        alt42=1;
                    }
                    else if ( (synpred138()) ) {
                        alt42=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3532:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 42, 8, input);

                        throw nvae;
                    }
                }
                else if ( (LA42_1==KEYWORD_5) ) {
                    alt42=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3532:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                alt42=2;
                }
                break;
            case KEYWORD_24:
                {
                alt42=3;
                }
                break;
            case KEYWORD_23:
                {
                alt42=4;
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_28:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_15:
            case KEYWORD_17:
            case KEYWORD_21:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt42=5;
                }
                break;
            case RULE_INT:
                {
                int LA42_6 = input.LA(2);

                if ( (synpred137()) ) {
                    alt42=5;
                }
                else if ( (synpred138()) ) {
                    alt42=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3532:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 42, 6, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_22:
                {
                alt42=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3532:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeCharacter_3= ruleSchemeCharacter | this_SchemeText_4= ruleSchemeText | this_SchemeNumber_5= ruleSchemeNumber | this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3533:2: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue7012);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3546:2: this_SchemeList_1= ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue7042);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3559:2: this_SchemeBlock_2= ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue7072);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3572:2: this_SchemeCharacter_3= ruleSchemeCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue7102);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3585:2: this_SchemeText_4= ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue7132);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3598:2: this_SchemeNumber_5= ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_ruleSchemeValue7162);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3611:2: this_SchemeMarkupCommand_6= ruleSchemeMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue7192);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3630:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3631:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3632:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean7226);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean7236); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3639:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeBooleanValue ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3644:6: ( ( (lv_value_0_0= ruleSchemeBooleanValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3645:1: ( (lv_value_0_0= ruleSchemeBooleanValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3645:1: ( (lv_value_0_0= ruleSchemeBooleanValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3646:1: (lv_value_0_0= ruleSchemeBooleanValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3646:1: (lv_value_0_0= ruleSchemeBooleanValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3647:3: lv_value_0_0= ruleSchemeBooleanValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeBooleanAccess().getValueSchemeBooleanValueParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeBooleanValue_in_ruleSchemeBoolean7281);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3677:1: entryRuleSchemeBooleanValue returns [String current=null] : iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF ;
    public final String entryRuleSchemeBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeBooleanValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3678:1: (iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3679:2: iv_ruleSchemeBooleanValue= ruleSchemeBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBooleanValue_in_entryRuleSchemeBooleanValue7316);
            iv_ruleSchemeBooleanValue=ruleSchemeBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBooleanValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBooleanValue7327); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3686:1: ruleSchemeBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3691:6: ( (kw= KEYWORD_2 this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3692:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3692:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3693:2: kw= KEYWORD_2 this_ID_1= RULE_ID
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeBooleanValue7365); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getSchemeBooleanValueAccess().getNumberSignKeyword_0(), null); 
                  
            }
            this_ID_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeBooleanValue7380); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3713:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3714:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3715:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList7424);
            iv_ruleSchemeList=ruleSchemeList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList7434); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3722:1: ruleSchemeList returns [EObject current=null] : ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        Token lv_vector_1_0=null;
        EObject lv_expressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3727:6: ( ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3728:1: ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3728:1: ( () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3728:2: () ( (lv_vector_1_0= KEYWORD_2 ) )? KEYWORD_5 ( (lv_expressions_3_0= ruleSchemeExpression ) )* KEYWORD_6
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3728:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3729:2: 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3742:2: ( (lv_vector_1_0= KEYWORD_2 ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_2) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3743:1: (lv_vector_1_0= KEYWORD_2 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3743:1: (lv_vector_1_0= KEYWORD_2 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3744:3: lv_vector_1_0= KEYWORD_2
                    {
                    lv_vector_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeList7490); if (failed) return current;
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

            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSchemeList7515); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3769:1: ( (lv_expressions_3_0= ruleSchemeExpression ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=KEYWORD_89 && LA44_0<=KEYWORD_24)||(LA44_0>=KEYWORD_28 && LA44_0<=KEYWORD_5)||(LA44_0>=KEYWORD_7 && LA44_0<=KEYWORD_9)||(LA44_0>=KEYWORD_11 && LA44_0<=KEYWORD_15)||(LA44_0>=KEYWORD_17 && LA44_0<=KEYWORD_18)||(LA44_0>=KEYWORD_21 && LA44_0<=RULE_ID)||LA44_0==RULE_ANY_OTHER) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3770:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3770:1: (lv_expressions_3_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3771:3: lv_expressions_3_0= ruleSchemeExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList7536);
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
            	    break loop44;
                }
            } while (true);

            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleSchemeList7548); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3806:1: entryRuleSchemeBlock returns [EObject current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final EObject entryRuleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3807:2: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3808:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock7583);
            iv_ruleSchemeBlock=ruleSchemeBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock7593); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3815:1: ruleSchemeBlock returns [EObject current=null] : ( KEYWORD_24 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_25 ) ;
    public final EObject ruleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3820:6: ( ( KEYWORD_24 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_25 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3821:1: ( KEYWORD_24 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_25 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3821:1: ( KEYWORD_24 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_25 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3822:2: KEYWORD_24 ( (lv_elements_1_0= ruleExpression ) )+ KEYWORD_25
            {
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleSchemeBlock7629); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3826:1: ( (lv_elements_1_0= ruleExpression ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=KEYWORD_89 && LA45_0<=KEYWORD_31)||LA45_0==KEYWORD_26||(LA45_0>=KEYWORD_28 && LA45_0<=KEYWORD_17)||LA45_0==KEYWORD_19||(LA45_0>=KEYWORD_21 && LA45_0<=RULE_ID)||LA45_0==RULE_ANY_OTHER) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3827:1: (lv_elements_1_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3827:1: (lv_elements_1_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3828:3: lv_elements_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeBlockAccess().getElementsExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSchemeBlock7650);
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
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleSchemeBlock7662); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3863:1: entryRuleSchemeCharacter returns [EObject current=null] : iv_ruleSchemeCharacter= ruleSchemeCharacter EOF ;
    public final EObject entryRuleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeCharacter = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3864:2: (iv_ruleSchemeCharacter= ruleSchemeCharacter EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3865:2: iv_ruleSchemeCharacter= ruleSchemeCharacter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeCharacterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter7697);
            iv_ruleSchemeCharacter=ruleSchemeCharacter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeCharacter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter7707); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3872:1: ruleSchemeCharacter returns [EObject current=null] : ( KEYWORD_23 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) ;
    public final EObject ruleSchemeCharacter() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_3=null;
        AntlrDatatypeRuleToken lv_value_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3877:6: ( ( KEYWORD_23 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3878:1: ( KEYWORD_23 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3878:1: ( KEYWORD_23 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3879:2: KEYWORD_23 ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            {
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleSchemeCharacter7743); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3883:1: ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3884:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3884:1: ( (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3885:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3885:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt46=1;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_15:
            case KEYWORD_17:
            case KEYWORD_21:
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3885:1: (lv_value_1_1= RULE_ID | lv_value_1_2= ruleSpecialCharacter | lv_value_1_3= RULE_ANY_OTHER )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3886:3: lv_value_1_1= RULE_ID
                    {
                    lv_value_1_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeCharacter7762); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3907:8: lv_value_1_2= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter7786);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3928:8: lv_value_1_3= RULE_ANY_OTHER
                    {
                    lv_value_1_3=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter7801); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3960:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3961:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3962:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText7844);
            iv_ruleSchemeText=ruleSchemeText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText7854); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3969:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeTextValue ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3974:6: ( ( (lv_value_0_0= ruleSchemeTextValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3975:1: ( (lv_value_0_0= ruleSchemeTextValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3975:1: ( (lv_value_0_0= ruleSchemeTextValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3976:1: (lv_value_0_0= ruleSchemeTextValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3976:1: (lv_value_0_0= ruleSchemeTextValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3977:3: lv_value_0_0= ruleSchemeTextValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeTextValueParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeTextValue_in_ruleSchemeText7899);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4007:1: entryRuleSchemeTextValue returns [String current=null] : iv_ruleSchemeTextValue= ruleSchemeTextValue EOF ;
    public final String entryRuleSchemeTextValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4011:1: (iv_ruleSchemeTextValue= ruleSchemeTextValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4012:2: iv_ruleSchemeTextValue= ruleSchemeTextValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeTextValue_in_entryRuleSchemeTextValue7940);
            iv_ruleSchemeTextValue=ruleSchemeTextValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeTextValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextValue7951); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4022:1: ruleSchemeTextValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SchemeTextValueSegment_0 = null;

        AntlrDatatypeRuleToken this_SchemeTextValueSegment_3 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4028:6: ( (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4029:1: (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4029:1: (this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4030:5: this_SchemeTextValueSegment_0= ruleSchemeTextValueSegment (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSchemeTextValueAccess().getSchemeTextValueSegmentParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue8002);
            this_SchemeTextValueSegment_0=ruleSchemeTextValueSegment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_SchemeTextValueSegment_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4040:1: (kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==KEYWORD_10) ) {
                    switch ( input.LA(2) ) {
                    case KEYWORD_28:
                        {
                        int LA48_3 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_12:
                        {
                        int LA48_4 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_9:
                        {
                        int LA48_5 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_1:
                        {
                        int LA48_6 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_14:
                        {
                        int LA48_7 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_7:
                        {
                        int LA48_8 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_11:
                        {
                        int LA48_9 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_13:
                        {
                        int LA48_10 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_15:
                        {
                        int LA48_11 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_17:
                        {
                        int LA48_12 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_21:
                        {
                        int LA48_13 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_64:
                        {
                        int LA48_14 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_66:
                        {
                        int LA48_15 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_55:
                        {
                        int LA48_16 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_84:
                        {
                        int LA48_17 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_32:
                        {
                        int LA48_18 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_67:
                        {
                        int LA48_19 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_61:
                        {
                        int LA48_20 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_52:
                        {
                        int LA48_21 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_45:
                        {
                        int LA48_22 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_44:
                        {
                        int LA48_23 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_34:
                        {
                        int LA48_24 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_53:
                        {
                        int LA48_25 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_74:
                        {
                        int LA48_26 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_30:
                        {
                        int LA48_27 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_41:
                        {
                        int LA48_28 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_60:
                        {
                        int LA48_29 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_75:
                        {
                        int LA48_30 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_42:
                        {
                        int LA48_31 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_82:
                        {
                        int LA48_32 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_49:
                        {
                        int LA48_33 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_76:
                        {
                        int LA48_34 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_50:
                        {
                        int LA48_35 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_68:
                        {
                        int LA48_36 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_62:
                        {
                        int LA48_37 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_85:
                        {
                        int LA48_38 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_51:
                        {
                        int LA48_39 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_83:
                        {
                        int LA48_40 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_69:
                        {
                        int LA48_41 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_43:
                        {
                        int LA48_42 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_80:
                        {
                        int LA48_43 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_63:
                        {
                        int LA48_44 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_89:
                        {
                        int LA48_45 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_29:
                        {
                        int LA48_46 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_77:
                        {
                        int LA48_47 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_54:
                        {
                        int LA48_48 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_70:
                        {
                        int LA48_49 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_78:
                        {
                        int LA48_50 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_33:
                        {
                        int LA48_51 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_35:
                        {
                        int LA48_52 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_71:
                        {
                        int LA48_53 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_72:
                        {
                        int LA48_54 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_56:
                        {
                        int LA48_55 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_36:
                        {
                        int LA48_56 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_73:
                        {
                        int LA48_57 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_65:
                        {
                        int LA48_58 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_57:
                        {
                        int LA48_59 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_58:
                        {
                        int LA48_60 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_37:
                        {
                        int LA48_61 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_59:
                        {
                        int LA48_62 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_81:
                        {
                        int LA48_63 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_31:
                        {
                        int LA48_64 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_86:
                        {
                        int LA48_65 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_38:
                        {
                        int LA48_66 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_87:
                        {
                        int LA48_67 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_88:
                        {
                        int LA48_68 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_46:
                        {
                        int LA48_69 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_39:
                        {
                        int LA48_70 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_47:
                        {
                        int LA48_71 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_79:
                        {
                        int LA48_72 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_40:
                        {
                        int LA48_73 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_48:
                        {
                        int LA48_74 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case RULE_ID:
                        {
                        int LA48_75 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA48_76 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case RULE_INT:
                        {
                        int LA48_77 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case RULE_ANY_OTHER:
                        {
                        int LA48_78 = input.LA(3);

                        if ( (synpred145()) ) {
                            alt48=1;
                        }


                        }
                        break;
                    case KEYWORD_10:
                        {
                        switch ( input.LA(3) ) {
                        case KEYWORD_28:
                            {
                            int LA48_3 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_12:
                            {
                            int LA48_4 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_9:
                            {
                            int LA48_5 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_1:
                            {
                            int LA48_6 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_14:
                            {
                            int LA48_7 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_7:
                            {
                            int LA48_8 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_11:
                            {
                            int LA48_9 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_13:
                            {
                            int LA48_10 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_15:
                            {
                            int LA48_11 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_17:
                            {
                            int LA48_12 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_21:
                            {
                            int LA48_13 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_64:
                            {
                            int LA48_14 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_66:
                            {
                            int LA48_15 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_55:
                            {
                            int LA48_16 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_84:
                            {
                            int LA48_17 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_32:
                            {
                            int LA48_18 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_67:
                            {
                            int LA48_19 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_61:
                            {
                            int LA48_20 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_52:
                            {
                            int LA48_21 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_45:
                            {
                            int LA48_22 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_44:
                            {
                            int LA48_23 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_34:
                            {
                            int LA48_24 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_53:
                            {
                            int LA48_25 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_74:
                            {
                            int LA48_26 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_30:
                            {
                            int LA48_27 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_41:
                            {
                            int LA48_28 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_60:
                            {
                            int LA48_29 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_75:
                            {
                            int LA48_30 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_42:
                            {
                            int LA48_31 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_82:
                            {
                            int LA48_32 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_49:
                            {
                            int LA48_33 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_76:
                            {
                            int LA48_34 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_50:
                            {
                            int LA48_35 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_68:
                            {
                            int LA48_36 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_62:
                            {
                            int LA48_37 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_85:
                            {
                            int LA48_38 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_51:
                            {
                            int LA48_39 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_83:
                            {
                            int LA48_40 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_69:
                            {
                            int LA48_41 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_43:
                            {
                            int LA48_42 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_80:
                            {
                            int LA48_43 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_63:
                            {
                            int LA48_44 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_89:
                            {
                            int LA48_45 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_29:
                            {
                            int LA48_46 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_77:
                            {
                            int LA48_47 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_54:
                            {
                            int LA48_48 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_70:
                            {
                            int LA48_49 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_78:
                            {
                            int LA48_50 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_33:
                            {
                            int LA48_51 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_35:
                            {
                            int LA48_52 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_71:
                            {
                            int LA48_53 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_72:
                            {
                            int LA48_54 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_56:
                            {
                            int LA48_55 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_36:
                            {
                            int LA48_56 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_73:
                            {
                            int LA48_57 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_65:
                            {
                            int LA48_58 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_57:
                            {
                            int LA48_59 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_58:
                            {
                            int LA48_60 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_37:
                            {
                            int LA48_61 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_59:
                            {
                            int LA48_62 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_81:
                            {
                            int LA48_63 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_31:
                            {
                            int LA48_64 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_86:
                            {
                            int LA48_65 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_38:
                            {
                            int LA48_66 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_87:
                            {
                            int LA48_67 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_88:
                            {
                            int LA48_68 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_46:
                            {
                            int LA48_69 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_39:
                            {
                            int LA48_70 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_47:
                            {
                            int LA48_71 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_79:
                            {
                            int LA48_72 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_40:
                            {
                            int LA48_73 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case KEYWORD_48:
                            {
                            int LA48_74 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA48_75 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA48_76 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case RULE_INT:
                            {
                            int LA48_77 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;
                        case RULE_ANY_OTHER:
                            {
                            int LA48_78 = input.LA(4);

                            if ( (synpred145()) ) {
                                alt48=1;
                            }


                            }
                            break;

                        }

                        }
                        break;

                    }

                }


                switch (alt48) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4041:2: kw= KEYWORD_10 (kw= KEYWORD_10 )? this_SchemeTextValueSegment_3= ruleSchemeTextValueSegment
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleSchemeTextValue8021); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getSchemeTextValueAccess().getColonKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4046:1: (kw= KEYWORD_10 )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==KEYWORD_10) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4047:2: kw= KEYWORD_10
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleSchemeTextValue8035); if (failed) return current;
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
            	    pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue8059);
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
            	    break loop48;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4074:1: entryRuleSchemeTextValueSegment returns [String current=null] : iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF ;
    public final String entryRuleSchemeTextValueSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextValueSegment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4075:1: (iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4076:2: iv_ruleSchemeTextValueSegment= ruleSchemeTextValueSegment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextValueSegmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_entryRuleSchemeTextValueSegment8110);
            iv_ruleSchemeTextValueSegment=ruleSchemeTextValueSegment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeTextValueSegment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextValueSegment8121); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4083:1: ruleSchemeTextValueSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_28 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER ) ;
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
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4088:6: ( (kw= KEYWORD_28 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4089:1: (kw= KEYWORD_28 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4089:1: (kw= KEYWORD_28 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER )
            int alt49=9;
            switch ( input.LA(1) ) {
            case KEYWORD_28:
                {
                alt49=1;
                }
                break;
            case KEYWORD_12:
                {
                alt49=2;
                }
                break;
            case KEYWORD_9:
                {
                alt49=3;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_15:
            case KEYWORD_17:
            case KEYWORD_21:
                {
                alt49=4;
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4089:1: (kw= KEYWORD_28 | kw= KEYWORD_12 | kw= KEYWORD_9 | this_SpecialCharacter_3= ruleSpecialCharacter | this_SpecialCommandName_4= ruleSpecialCommandName | this_SchemeIdentifier_5= ruleSchemeIdentifier | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT | this_ANY_OTHER_8= RULE_ANY_OTHER )", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4090:2: kw= KEYWORD_28
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleSchemeTextValueSegment8159); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getReverseSolidusReverseSolidusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4097:2: kw= KEYWORD_12
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleSchemeTextValueSegment8178); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getEqualsSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4104:2: kw= KEYWORD_9
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleSchemeTextValueSegment8197); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getHyphenMinusKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4111:5: this_SpecialCharacter_3= ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSpecialCharacterParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextValueSegment8225);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4123:5: this_SpecialCommandName_4= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSpecialCommandNameParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleSchemeTextValueSegment8258);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4135:5: this_SchemeIdentifier_5= ruleSchemeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextValueSegmentAccess().getSchemeIdentifierParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeIdentifier_in_ruleSchemeTextValueSegment8291);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4146:10: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemeTextValueSegment8317); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_6);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getSTRINGTerminalRuleCall_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4154:10: this_INT_7= RULE_INT
                    {
                    this_INT_7=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeTextValueSegment8343); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextValueSegmentAccess().getINTTerminalRuleCall_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4162:10: this_ANY_OTHER_8= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_8=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextValueSegment8369); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4177:1: entryRuleSchemeIdentifier returns [String current=null] : iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF ;
    public final String entryRuleSchemeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeIdentifier = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4181:1: (iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4182:2: iv_ruleSchemeIdentifier= ruleSchemeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeIdentifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeIdentifier_in_entryRuleSchemeIdentifier8420);
            iv_ruleSchemeIdentifier=ruleSchemeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeIdentifier8431); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4192:1: ruleSchemeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSchemeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4198:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4199:1: (this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4199:1: (this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4199:6: this_ID_0= RULE_ID (kw= KEYWORD_9 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeIdentifier8475); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getSchemeIdentifierAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4206:1: (kw= KEYWORD_9 this_ID_2= RULE_ID )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==KEYWORD_9) ) {
                    int LA50_2 = input.LA(2);

                    if ( (LA50_2==RULE_ID) ) {
                        int LA50_3 = input.LA(3);

                        if ( (synpred154()) ) {
                            alt50=1;
                        }


                    }


                }


                switch (alt50) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4207:2: kw= KEYWORD_9 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleSchemeIdentifier8494); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getSchemeIdentifierAccess().getHyphenMinusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeIdentifier8509); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getSchemeIdentifierAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4230:1: entryRuleSchemeNumber returns [EObject current=null] : iv_ruleSchemeNumber= ruleSchemeNumber EOF ;
    public final EObject entryRuleSchemeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4234:2: (iv_ruleSchemeNumber= ruleSchemeNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4235:2: iv_ruleSchemeNumber= ruleSchemeNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber8565);
            iv_ruleSchemeNumber=ruleSchemeNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber8575); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4245:1: ruleSchemeNumber returns [EObject current=null] : ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSchemeNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_radix_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4251:6: ( ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4252:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4252:1: ( ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4252:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4252:2: ( (lv_radix_0_0= ruleSchemeNumberRadix ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_2) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4253:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4253:1: (lv_radix_0_0= ruleSchemeNumberRadix )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4254:3: lv_radix_0_0= ruleSchemeNumberRadix
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber8625);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4276:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4277:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4277:1: (lv_value_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4278:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeNumber8643); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4311:1: entryRuleSchemeNumberRadix returns [String current=null] : iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF ;
    public final String entryRuleSchemeNumberRadix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeNumberRadix = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4312:1: (iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4313:2: iv_ruleSchemeNumberRadix= ruleSchemeNumberRadix EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRadixRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix8688);
            iv_ruleSchemeNumberRadix=ruleSchemeNumberRadix();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumberRadix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix8699); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4320:1: ruleSchemeNumberRadix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSchemeNumberRadix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4325:6: ( (kw= KEYWORD_2 this_ID_1= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4326:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4326:1: (kw= KEYWORD_2 this_ID_1= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4327:2: kw= KEYWORD_2 this_ID_1= RULE_ID
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSchemeNumberRadix8737); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0(), null); 
                  
            }
            this_ID_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeNumberRadix8752); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4347:1: entryRuleSchemeMarkupCommand returns [EObject current=null] : iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF ;
    public final EObject entryRuleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeMarkupCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4351:2: (iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4352:2: iv_ruleSchemeMarkupCommand= ruleSchemeMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeMarkupCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand8802);
            iv_ruleSchemeMarkupCommand=ruleSchemeMarkupCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeMarkupCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand8812); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4362:1: ruleSchemeMarkupCommand returns [EObject current=null] : ( KEYWORD_22 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) ;
    public final EObject ruleSchemeMarkupCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_1_1=null;
        AntlrDatatypeRuleToken lv_command_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4368:6: ( ( KEYWORD_22 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4369:1: ( KEYWORD_22 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4369:1: ( KEYWORD_22 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4370:2: KEYWORD_22 ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            {
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleSchemeMarkupCommand8852); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4374:1: ( ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4375:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4375:1: ( (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4376:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4376:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=KEYWORD_89 && LA52_0<=KEYWORD_31)) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4376:1: (lv_command_1_1= RULE_ID | lv_command_1_2= ruleSpecialCommandName )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4377:3: lv_command_1_1= RULE_ID
                    {
                    lv_command_1_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeMarkupCommand8871); if (failed) return current;
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4398:8: lv_command_1_2= ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSchemeMarkupCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_ruleSchemeMarkupCommand8895);
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

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:949:2: ( ruleText )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:949:2: ruleText
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleText_in_synpred251921);
        ruleText();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1772:1: ( ( ( ruleScheme | ruleUnparsedCommand ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1772:1: ( ( ruleScheme | ruleUnparsedCommand ) )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1772:1: ( ( ruleScheme | ruleUnparsedCommand ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1773:1: ( ruleScheme | ruleUnparsedCommand )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1773:1: ( ruleScheme | ruleUnparsedCommand )
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( ((LA53_0>=KEYWORD_2 && LA53_0<=KEYWORD_3)) ) {
            alt53=1;
        }
        else if ( (LA53_0==KEYWORD_16) ) {
            alt53=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1773:1: ( ruleScheme | ruleUnparsedCommand )", 53, 0, input);

            throw nvae;
        }
        switch (alt53) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1774:3: ruleScheme
                {
                pushFollow(FOLLOW_ruleScheme_in_synpred423521);
                ruleScheme();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1795:8: ruleUnparsedCommand
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleUnparsedCommand_in_synpred423540);
                ruleUnparsedCommand();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1820:1: ( ( ruleUnparsedBlock ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1820:1: ( ruleUnparsedBlock )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1820:1: ( ruleUnparsedBlock )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1821:3: ruleUnparsedBlock
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleUnparsedBlock_in_synpred433565);
        ruleUnparsedBlock();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2143:1: ( ( rulePitch ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2143:1: ( rulePitch )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2143:1: ( rulePitch )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2144:3: rulePitch
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulePitch_in_synpred494128);
        rulePitch();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2238:1: ( ( KEYWORD_12 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2238:1: ( KEYWORD_12 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2238:1: ( KEYWORD_12 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2239:3: KEYWORD_12
        {
        match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_synpred504261); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: ( ( ruleOctave ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: ( ruleOctave )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2260:1: ( ruleOctave )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2261:3: ruleOctave
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleOctave_in_synpred514296);
        ruleOctave();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2284:1: ( ( KEYWORD_1 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2284:1: ( KEYWORD_1 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2284:1: ( KEYWORD_1 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2285:3: KEYWORD_1
        {
        match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_synpred524316); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2306:1: ( ( KEYWORD_14 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2306:1: ( KEYWORD_14 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2306:1: ( KEYWORD_14 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2307:3: KEYWORD_14
        {
        match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_synpred534349); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2351:1: ( ( KEYWORD_4 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2351:1: ( KEYWORD_4 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2351:1: ( KEYWORD_4 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2352:3: KEYWORD_4
        {
        match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_synpred544452); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2374:1: ( ( KEYWORD_8 ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2374:1: ( KEYWORD_8 )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2374:1: ( KEYWORD_8 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2375:3: KEYWORD_8
        {
        match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred564491); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred56

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2492:2: ( KEYWORD_12 ( ( RULE_ID ) ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2492:2: KEYWORD_12 ( ( RULE_ID ) )
        {
        match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_synpred584687); if (failed) return ;
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2496:1: ( ( RULE_ID ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2497:1: ( RULE_ID )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2497:1: ( RULE_ID )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2498:3: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred584704); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2521:1: ( ( ruleContextModification ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2521:1: ( ruleContextModification )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2521:1: ( ruleContextModification )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2522:3: ruleContextModification
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleContextModification_in_synpred594732);
        ruleContextModification();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred123
    public final void synpred123_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3286:2: ( KEYWORD_41 )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3286:2: KEYWORD_41
        {
        match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_synpred1236501); if (failed) return ;

        }
    }
    // $ANTLR end synpred123

    // $ANTLR start synpred126
    public final void synpred126_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:3: ( ( ( KEYWORD_4 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:3: ( ( KEYWORD_4 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3394:3: ( ( KEYWORD_4 ) )?
        int alt55=2;
        int LA55_0 = input.LA(1);

        if ( (LA55_0==KEYWORD_4) ) {
            alt55=1;
        }
        switch (alt55) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3395:1: ( KEYWORD_4 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3395:1: ( KEYWORD_4 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3396:3: KEYWORD_4
                {
                match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_synpred1266763); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred126

    // $ANTLR start synpred128
    public final void synpred128_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3417:6: ( ( ( KEYWORD_18 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3417:6: ( ( KEYWORD_18 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3417:6: ( ( KEYWORD_18 ) )?
        int alt56=2;
        int LA56_0 = input.LA(1);

        if ( (LA56_0==KEYWORD_18) ) {
            alt56=1;
        }
        switch (alt56) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3418:1: ( KEYWORD_18 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3418:1: ( KEYWORD_18 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3419:3: KEYWORD_18
                {
                match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_synpred1286802); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred128

    // $ANTLR start synpred130
    public final void synpred130_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3440:6: ( ( ( KEYWORD_8 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3440:6: ( ( KEYWORD_8 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3440:6: ( ( KEYWORD_8 ) )?
        int alt57=2;
        int LA57_0 = input.LA(1);

        if ( (LA57_0==KEYWORD_8) ) {
            alt57=1;
        }
        switch (alt57) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3441:1: ( KEYWORD_8 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3441:1: ( KEYWORD_8 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3442:3: KEYWORD_8
                {
                match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred1306841); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred130

    // $ANTLR start synpred132
    public final void synpred132_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3463:6: ( ( ( KEYWORD_3 ) )? )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3463:6: ( ( KEYWORD_3 ) )?
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3463:6: ( ( KEYWORD_3 ) )?
        int alt58=2;
        int LA58_0 = input.LA(1);

        if ( (LA58_0==KEYWORD_3) ) {
            alt58=1;
        }
        switch (alt58) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3464:1: ( KEYWORD_3 )
                {
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3464:1: ( KEYWORD_3 )
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3465:3: KEYWORD_3
                {
                match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_synpred1326880); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred132

    // $ANTLR start synpred133
    public final void synpred133_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3533:2: ( ruleSchemeBoolean )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3533:2: ruleSchemeBoolean
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred1337012);
        ruleSchemeBoolean();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred133

    // $ANTLR start synpred137
    public final void synpred137_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3585:2: ( ruleSchemeText )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3585:2: ruleSchemeText
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeText_in_synpred1377132);
        ruleSchemeText();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred137

    // $ANTLR start synpred138
    public final void synpred138_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3598:2: ( ruleSchemeNumber )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3598:2: ruleSchemeNumber
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred1387162);
        ruleSchemeNumber();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred138

    // $ANTLR start synpred145
    public final void synpred145_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4041:2: ( KEYWORD_10 ( KEYWORD_10 )? ruleSchemeTextValueSegment )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4041:2: KEYWORD_10 ( KEYWORD_10 )? ruleSchemeTextValueSegment
        {
        match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_synpred1458021); if (failed) return ;
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4046:1: ( KEYWORD_10 )?
        int alt59=2;
        int LA59_0 = input.LA(1);

        if ( (LA59_0==KEYWORD_10) ) {
            alt59=1;
        }
        switch (alt59) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4047:2: KEYWORD_10
                {
                match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_synpred1458035); if (failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_ruleSchemeTextValueSegment_in_synpred1458059);
        ruleSchemeTextValueSegment();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred145

    // $ANTLR start synpred154
    public final void synpred154_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4207:2: ( KEYWORD_9 RULE_ID )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4207:2: KEYWORD_9 RULE_ID
        {
        match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_synpred1548494); if (failed) return ;
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1548509); if (failed) return ;

        }
    }
    // $ANTLR end synpred154

    public final boolean synpred126() {
        backtracking++;
        int start = input.mark();
        try {
            synpred126_fragment(); // can never throw exception
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
    public final boolean synpred145() {
        backtracking++;
        int start = input.mark();
        try {
            synpred145_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred128() {
        backtracking++;
        int start = input.mark();
        try {
            synpred128_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred123() {
        backtracking++;
        int start = input.mark();
        try {
            synpred123_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred49() {
        backtracking++;
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
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
    public final boolean synpred59() {
        backtracking++;
        int start = input.mark();
        try {
            synpred59_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred133() {
        backtracking++;
        int start = input.mark();
        try {
            synpred133_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred58() {
        backtracking++;
        int start = input.mark();
        try {
            synpred58_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred56() {
        backtracking++;
        int start = input.mark();
        try {
            synpred56_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred137() {
        backtracking++;
        int start = input.mark();
        try {
            synpred137_fragment(); // can never throw exception
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
    public final boolean synpred138() {
        backtracking++;
        int start = input.mark();
        try {
            synpred138_fragment(); // can never throw exception
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
    public final boolean synpred130() {
        backtracking++;
        int start = input.mark();
        try {
            synpred130_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred154() {
        backtracking++;
        int start = input.mark();
        try {
            synpred154_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleToplevelExpression_in_ruleLilyPond128 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000020F5FFFFA1L});
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
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleAssignment718 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssignment784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyAssignment828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyAssignment848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rulePropertyAssignment867 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyAssignment888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlock983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_ruleBlock1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleSimpleBlock1105 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020FDFFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleBlock1126 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020FDFFFFA1L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleSimpleBlock1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleSimultaneousBlock1231 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFE1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimultaneousBlock1252 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFE1L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSimultaneousBlock1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_ruleCommand1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleCommand1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSpecialCharacter1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleSpecialCharacter1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleSpecialCharacter1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleSpecialCharacter1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleSpecialCharacter1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleSpecialCharacter1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleSpecialCharacter1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleSpecialCharacter1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedBlock1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleUnparsedBlock1703 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020FDFFFF81L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_ruleUnparsedBlock1724 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020FDFFFF81L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleUnparsedBlock1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedExpression1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleUnparsedExpression1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleUnparsedExpression1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleUnparsedExpression1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleUnparsedExpression1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleUnparsedExpression1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand1985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedCommand1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleUnparsedCommand2031 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000080000001L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnparsedCommand2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleUnparsedCommand2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleReference2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleText2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleText2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleText2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleText2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleText2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleText2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSpecialCommand2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSpecialCommand2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleSpecialCommand2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_ruleSpecialCommand2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockCommand_in_ruleSpecialCommand2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_ruleSpecialCommand2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_ruleSpecialCommand2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_ruleSpecialCommand2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDef_in_ruleSpecialCommand2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_ruleSpecialCommand2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude2913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleInclude2959 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleInclude2978 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion3048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleVersion3094 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleVersion3113 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup3183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkup3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleMarkup3229 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleMarkup3248 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800600L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkup3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines3317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupLines3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleMarkupLines3363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleMarkupLines3382 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800600L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_ruleMarkupLines3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody3451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBody3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleMarkupBody3521 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800600L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_ruleMarkupBody3540 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800600L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleMarkupBody3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockCommand_in_entryRuleBlockCommand3601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockCommand3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleBlockCommand3647 = new BitSet(new long[]{0x0011002000080000L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleBlockCommand3668 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleBlockCommand3698 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleBlockCommand3728 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleBlockCommand3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlockCommand3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition3830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDefinition3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleOutputDefinition3876 = new BitSet(new long[]{0x0040804000000000L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOutputDefinition3897 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleOutputDefinition3927 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleOutputDefinition3957 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleOutputDefinition3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic4029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeMusic4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleRelativeMusic4075 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleRelativeMusic4094 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFA1L});
    public static final BitSet FOLLOW_rulePitch_in_ruleRelativeMusic4128 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRelativeMusic4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_entryRulePitch4185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePitch4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePitch4237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000288900L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rulePitch4261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000208900L});
    public static final BitSet FOLLOW_ruleOctave_in_rulePitch4296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200100L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePitch4316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rulePitch4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_entryRuleOctave4398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOctave4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleOctave4452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOctave4491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleNewContext_in_entryRuleNewContext4540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewContext4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleNewContext4586 = new BitSet(new long[]{0x8000000010000000L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleNewContext4607 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleNewContext4637 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewContext4670 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFA1L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleNewContext4687 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewContext4704 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFA1L});
    public static final BitSet FOLLOW_ruleContextModification_in_ruleNewContext4732 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNewContext4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_entryRuleContextModification4789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextModification4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleContextModification4835 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleContextModification4846 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContextModification4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDef_in_entryRuleContextDef4902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDef4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleContextDef4948 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleContextDef4967 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_ruleContextDef5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_entryRuleOther5036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOther5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleOther5082 = new BitSet(new long[]{0x7FAE7E9D6BF7F7F0L,0x0000000011747101L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleOther5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleOther5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleOther5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleOther5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_entryRuleOtherName5223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherName5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleOtherName5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleOtherName5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleOtherName5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleOtherName5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleOtherName5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleOtherName5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleOtherName5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleOtherName5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleOtherName5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_ruleOtherName5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleOtherName5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleOtherName5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleOtherName5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleOtherName5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleOtherName5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleOtherName5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_89_in_ruleOtherName5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleOtherName5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleOtherName5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleOtherName5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleOtherName5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleOtherName5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleOtherName5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleOtherName5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleOtherName5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleOtherName5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleOtherName5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleOtherName5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleOtherName5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleOtherName5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleOtherName5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleOtherName5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleOtherName5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleOtherName5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleOtherName5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleOtherName5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_ruleOtherName5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleOtherName5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_ruleOtherName5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_ruleOtherName6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleOtherName6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleOtherName6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleOtherName6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleOtherName6089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleOtherName6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleOtherName6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleOtherName6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName6186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommandName6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleSpecialCommandName6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleSpecialCommandName6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleSpecialCommandName6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleSpecialCommandName6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleSpecialCommandName6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleSpecialCommandName6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleSpecialCommandName6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleSpecialCommandName6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleSpecialCommandName6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleSpecialCommandName6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleSpecialCommandName6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleSpecialCommandName6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleSpecialCommandName6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleSpecialCommandName6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleSpecialCommandName6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_ruleSpecialCommandName6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme6579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleScheme6630 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F37DDF8FL});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleScheme6647 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F37DDF8FL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression6708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSchemeExpression6763 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17D538FL});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleSchemeExpression6802 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17D538FL});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSchemeExpression6841 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17D538FL});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSchemeExpression6880 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17D538FL});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue6952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_ruleSchemeValue7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_ruleSchemeValue7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_ruleSchemeValue7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean7226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBooleanValue_in_ruleSchemeBoolean7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBooleanValue_in_entryRuleSchemeBooleanValue7316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBooleanValue7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeBooleanValue7365 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeBooleanValue7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList7424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeList7490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSchemeList7515 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F37DFF8FL});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList7536 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F37DFF8FL});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleSchemeList7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock7583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleSchemeBlock7629 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFA1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSchemeBlock7650 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFFFB1L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleSchemeBlock7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter7697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleSchemeCharacter7743 = new BitSet(new long[]{0x0000000000000000L,0x0000002091744100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeCharacter7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeCharacter7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeCharacter7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText7844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValue_in_ruleSchemeText7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValue_in_entryRuleSchemeTextValue7940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextValue7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue8002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleSchemeTextValue8021 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17F4181L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleSchemeTextValue8035 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17D4181L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_ruleSchemeTextValue8059 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_entryRuleSchemeTextValueSegment8110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextValueSegment8121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleSchemeTextValueSegment8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleSchemeTextValueSegment8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleSchemeTextValueSegment8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_ruleSchemeTextValueSegment8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleSchemeTextValueSegment8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_ruleSchemeTextValueSegment8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemeTextValueSegment8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeTextValueSegment8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextValueSegment8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeIdentifier_in_entryRuleSchemeIdentifier8420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeIdentifier8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeIdentifier8475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleSchemeIdentifier8494 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeIdentifier8509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber8565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_ruleSchemeNumber8625 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeNumber8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix8688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSchemeNumberRadix8737 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeNumberRadix8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand8802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand8812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleSchemeMarkupCommand8852 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000080000001L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeMarkupCommand8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_ruleSchemeMarkupCommand8895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_synpred7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_synpred251921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_synpred423521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_synpred423540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_synpred433565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_synpred494128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_synpred504261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_synpred514296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_synpred524316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_synpred534349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_synpred544452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred564491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_synpred584687 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred584704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_synpred594732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_synpred1236501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_synpred1266763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_synpred1286802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred1306841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_synpred1326880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred1337012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_synpred1377132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred1387162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_synpred1458021 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17F4181L});
    public static final BitSet FOLLOW_KEYWORD_10_in_synpred1458035 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17D4181L});
    public static final BitSet FOLLOW_ruleSchemeTextValueSegment_in_synpred1458059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_synpred1548494 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1548509 = new BitSet(new long[]{0x0000000000000002L});

}