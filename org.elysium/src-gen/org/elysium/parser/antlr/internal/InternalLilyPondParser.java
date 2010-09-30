package org.elysium.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_75", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_79", "KEYWORD_80", "KEYWORD_81", "KEYWORD_82", "KEYWORD_83", "KEYWORD_84", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=91;
    public static final int RULE_ANY_OTHER=95;
    public static final int KEYWORD_56=59;
    public static final int KEYWORD_55=58;
    public static final int KEYWORD_54=57;
    public static final int KEYWORD_53=56;
    public static final int KEYWORD_52=55;
    public static final int KEYWORD_51=54;
    public static final int KEYWORD_50=53;
    public static final int EOF=-1;
    public static final int KEYWORD_59=62;
    public static final int KEYWORD_58=61;
    public static final int KEYWORD_57=60;
    public static final int KEYWORD_65=68;
    public static final int KEYWORD_64=67;
    public static final int KEYWORD_67=70;
    public static final int KEYWORD_66=69;
    public static final int KEYWORD_61=64;
    public static final int KEYWORD_60=63;
    public static final int KEYWORD_63=66;
    public static final int KEYWORD_62=65;
    public static final int KEYWORD_69=72;
    public static final int KEYWORD_68=71;
    public static final int KEYWORD_30=33;
    public static final int KEYWORD_34=37;
    public static final int KEYWORD_33=36;
    public static final int KEYWORD_32=35;
    public static final int KEYWORD_31=34;
    public static final int KEYWORD_38=41;
    public static final int KEYWORD_37=40;
    public static final int KEYWORD_36=39;
    public static final int KEYWORD_35=38;
    public static final int RULE_ML_COMMENT=94;
    public static final int KEYWORD_39=42;
    public static final int RULE_STRING=88;
    public static final int KEYWORD_41=44;
    public static final int KEYWORD_40=43;
    public static final int KEYWORD_43=46;
    public static final int KEYWORD_42=45;
    public static final int KEYWORD_45=48;
    public static final int KEYWORD_44=47;
    public static final int KEYWORD_47=50;
    public static final int KEYWORD_46=49;
    public static final int KEYWORD_49=52;
    public static final int KEYWORD_48=51;
    public static final int KEYWORD_19=22;
    public static final int RULE_BOOL=90;
    public static final int KEYWORD_17=20;
    public static final int KEYWORD_18=21;
    public static final int KEYWORD_15=18;
    public static final int KEYWORD_16=19;
    public static final int KEYWORD_13=16;
    public static final int KEYWORD_14=17;
    public static final int KEYWORD_11=14;
    public static final int KEYWORD_12=15;
    public static final int KEYWORD_10=13;
    public static final int KEYWORD_6=9;
    public static final int KEYWORD_7=10;
    public static final int KEYWORD_8=11;
    public static final int KEYWORD_9=12;
    public static final int KEYWORD_28=31;
    public static final int KEYWORD_29=32;
    public static final int RULE_INT=89;
    public static final int KEYWORD_24=27;
    public static final int KEYWORD_25=28;
    public static final int KEYWORD_26=29;
    public static final int KEYWORD_27=30;
    public static final int KEYWORD_20=23;
    public static final int KEYWORD_21=24;
    public static final int KEYWORD_22=25;
    public static final int KEYWORD_23=26;
    public static final int KEYWORD_79=82;
    public static final int KEYWORD_71=74;
    public static final int KEYWORD_72=75;
    public static final int KEYWORD_73=76;
    public static final int KEYWORD_74=77;
    public static final int KEYWORD_75=78;
    public static final int KEYWORD_76=79;
    public static final int KEYWORD_77=80;
    public static final int KEYWORD_78=81;
    public static final int KEYWORD_1=4;
    public static final int KEYWORD_5=8;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_3=6;
    public static final int KEYWORD_70=73;
    public static final int KEYWORD_2=5;
    public static final int RULE_SL_COMMENT=93;
    public static final int KEYWORD_84=87;
    public static final int KEYWORD_82=85;
    public static final int KEYWORD_83=86;
    public static final int KEYWORD_81=84;
    public static final int KEYWORD_80=83;
    public static final int RULE_WS=92;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[340+1];
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:78:1: entryRuleLilyPond returns [EObject current=null] : iv_ruleLilyPond= ruleLilyPond EOF ;
    public final EObject entryRuleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLilyPond = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:79:2: (iv_ruleLilyPond= ruleLilyPond EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:80:2: iv_ruleLilyPond= ruleLilyPond EOF
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:87:1: ruleLilyPond returns [EObject current=null] : ( (lv_expressions_0_0= ruleToplevelExpression ) )* ;
    public final EObject ruleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:92:6: ( ( (lv_expressions_0_0= ruleToplevelExpression ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:93:1: ( (lv_expressions_0_0= ruleToplevelExpression ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:93:1: ( (lv_expressions_0_0= ruleToplevelExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_2||LA1_0==KEYWORD_22||LA1_0==KEYWORD_29||LA1_0==KEYWORD_41||LA1_0==KEYWORD_43||LA1_0==KEYWORD_45||(LA1_0>=KEYWORD_54 && LA1_0<=KEYWORD_55)||(LA1_0>=KEYWORD_60 && LA1_0<=KEYWORD_62)||LA1_0==KEYWORD_64||LA1_0==KEYWORD_69||(LA1_0>=KEYWORD_71 && LA1_0<=KEYWORD_72)||(LA1_0>=KEYWORD_75 && LA1_0<=KEYWORD_76)||LA1_0==KEYWORD_79||(LA1_0>=KEYWORD_81 && LA1_0<=KEYWORD_83)||LA1_0==RULE_STRING||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:94:1: (lv_expressions_0_0= ruleToplevelExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:94:1: (lv_expressions_0_0= ruleToplevelExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:95:3: lv_expressions_0_0= ruleToplevelExpression
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:125:1: entryRuleToplevelExpression returns [EObject current=null] : iv_ruleToplevelExpression= ruleToplevelExpression EOF ;
    public final EObject entryRuleToplevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToplevelExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:126:2: (iv_ruleToplevelExpression= ruleToplevelExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:127:2: iv_ruleToplevelExpression= ruleToplevelExpression EOF
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:134:1: ruleToplevelExpression returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Scheme_1= ruleScheme | this_Header_2= ruleHeader | this_Book_3= ruleBook | this_BookPart_4= ruleBookPart | this_Score_5= ruleScore | this_CompositeMusic_6= ruleCompositeMusic | this_Markup_7= ruleMarkup | this_MarkupLines_8= ruleMarkupLines | this_OutputDefinition_9= ruleOutputDefinition | this_Version_10= ruleVersion | this_Include_11= ruleInclude | this_SourceFileName_12= ruleSourceFileName | this_SourceFileLine_13= ruleSourceFileLine ) ;
    public final EObject ruleToplevelExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_Scheme_1 = null;

        EObject this_Header_2 = null;

        EObject this_Book_3 = null;

        EObject this_BookPart_4 = null;

        EObject this_Score_5 = null;

        EObject this_CompositeMusic_6 = null;

        EObject this_Markup_7 = null;

        EObject this_MarkupLines_8 = null;

        EObject this_OutputDefinition_9 = null;

        EObject this_Version_10 = null;

        EObject this_Include_11 = null;

        EObject this_SourceFileName_12 = null;

        EObject this_SourceFileLine_13 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:139:6: ( (this_Assignment_0= ruleAssignment | this_Scheme_1= ruleScheme | this_Header_2= ruleHeader | this_Book_3= ruleBook | this_BookPart_4= ruleBookPart | this_Score_5= ruleScore | this_CompositeMusic_6= ruleCompositeMusic | this_Markup_7= ruleMarkup | this_MarkupLines_8= ruleMarkupLines | this_OutputDefinition_9= ruleOutputDefinition | this_Version_10= ruleVersion | this_Include_11= ruleInclude | this_SourceFileName_12= ruleSourceFileName | this_SourceFileLine_13= ruleSourceFileLine ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:140:1: (this_Assignment_0= ruleAssignment | this_Scheme_1= ruleScheme | this_Header_2= ruleHeader | this_Book_3= ruleBook | this_BookPart_4= ruleBookPart | this_Score_5= ruleScore | this_CompositeMusic_6= ruleCompositeMusic | this_Markup_7= ruleMarkup | this_MarkupLines_8= ruleMarkupLines | this_OutputDefinition_9= ruleOutputDefinition | this_Version_10= ruleVersion | this_Include_11= ruleInclude | this_SourceFileName_12= ruleSourceFileName | this_SourceFileLine_13= ruleSourceFileLine )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:140:1: (this_Assignment_0= ruleAssignment | this_Scheme_1= ruleScheme | this_Header_2= ruleHeader | this_Book_3= ruleBook | this_BookPart_4= ruleBookPart | this_Score_5= ruleScore | this_CompositeMusic_6= ruleCompositeMusic | this_Markup_7= ruleMarkup | this_MarkupLines_8= ruleMarkupLines | this_OutputDefinition_9= ruleOutputDefinition | this_Version_10= ruleVersion | this_Include_11= ruleInclude | this_SourceFileName_12= ruleSourceFileName | this_SourceFileLine_13= ruleSourceFileLine )
            int alt2=14;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case KEYWORD_2:
                {
                alt2=2;
                }
                break;
            case KEYWORD_60:
                {
                alt2=3;
                }
                break;
            case KEYWORD_43:
                {
                alt2=4;
                }
                break;
            case KEYWORD_72:
                {
                alt2=5;
                }
                break;
            case KEYWORD_55:
                {
                alt2=6;
                }
                break;
            case KEYWORD_22:
            case KEYWORD_29:
            case KEYWORD_41:
            case KEYWORD_64:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_81:
                {
                alt2=7;
                }
                break;
            case KEYWORD_62:
                {
                alt2=8;
                }
                break;
            case KEYWORD_79:
                {
                alt2=9;
                }
                break;
            case KEYWORD_45:
            case KEYWORD_54:
            case KEYWORD_61:
                {
                alt2=10;
                }
                break;
            case KEYWORD_71:
                {
                alt2=11;
                }
                break;
            case KEYWORD_69:
                {
                alt2=12;
                }
                break;
            case KEYWORD_83:
                {
                alt2=13;
                }
                break;
            case KEYWORD_82:
                {
                alt2=14;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("140:1: (this_Assignment_0= ruleAssignment | this_Scheme_1= ruleScheme | this_Header_2= ruleHeader | this_Book_3= ruleBook | this_BookPart_4= ruleBookPart | this_Score_5= ruleScore | this_CompositeMusic_6= ruleCompositeMusic | this_Markup_7= ruleMarkup | this_MarkupLines_8= ruleMarkupLines | this_OutputDefinition_9= ruleOutputDefinition | this_Version_10= ruleVersion | this_Include_11= ruleInclude | this_SourceFileName_12= ruleSourceFileName | this_SourceFileLine_13= ruleSourceFileLine )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:141:2: this_Assignment_0= ruleAssignment
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:154:2: this_Scheme_1= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getSchemeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleToplevelExpression253);
                    this_Scheme_1=ruleScheme();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Scheme_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:167:2: this_Header_2= ruleHeader
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getHeaderParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHeader_in_ruleToplevelExpression283);
                    this_Header_2=ruleHeader();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Header_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:180:2: this_Book_3= ruleBook
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getBookParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBook_in_ruleToplevelExpression313);
                    this_Book_3=ruleBook();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Book_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:193:2: this_BookPart_4= ruleBookPart
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getBookPartParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBookPart_in_ruleToplevelExpression343);
                    this_BookPart_4=ruleBookPart();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BookPart_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:206:2: this_Score_5= ruleScore
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getScoreParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScore_in_ruleToplevelExpression373);
                    this_Score_5=ruleScore();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Score_5;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:219:2: this_CompositeMusic_6= ruleCompositeMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getCompositeMusicParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeMusic_in_ruleToplevelExpression403);
                    this_CompositeMusic_6=ruleCompositeMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_CompositeMusic_6;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:232:2: this_Markup_7= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getMarkupParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleToplevelExpression433);
                    this_Markup_7=ruleMarkup();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Markup_7;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:245:2: this_MarkupLines_8= ruleMarkupLines
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getMarkupLinesParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_ruleToplevelExpression463);
                    this_MarkupLines_8=ruleMarkupLines();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MarkupLines_8;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:258:2: this_OutputDefinition_9= ruleOutputDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getOutputDefinitionParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputDefinition_in_ruleToplevelExpression493);
                    this_OutputDefinition_9=ruleOutputDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_OutputDefinition_9;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:271:2: this_Version_10= ruleVersion
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getVersionParserRuleCall_10(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleToplevelExpression523);
                    this_Version_10=ruleVersion();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Version_10;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:284:2: this_Include_11= ruleInclude
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getIncludeParserRuleCall_11(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleToplevelExpression553);
                    this_Include_11=ruleInclude();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Include_11;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:297:2: this_SourceFileName_12= ruleSourceFileName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getSourceFileNameParserRuleCall_12(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSourceFileName_in_ruleToplevelExpression583);
                    this_SourceFileName_12=ruleSourceFileName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SourceFileName_12;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:310:2: this_SourceFileLine_13= ruleSourceFileLine
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getToplevelExpressionAccess().getSourceFileLineParserRuleCall_13(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSourceFileLine_in_ruleToplevelExpression613);
                    this_SourceFileLine_13=ruleSourceFileLine();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SourceFileLine_13;
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


    // $ANTLR start entryRuleAssignment
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:329:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:330:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:331:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment647);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment657); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:338:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:343:6: ( ( ( (lv_name_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:344:1: ( ( (lv_name_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:344:1: ( ( (lv_name_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:344:2: ( (lv_name_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:344:2: ( (lv_name_0_0= ruleIdOrString ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:345:1: (lv_name_0_0= ruleIdOrString )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:345:1: (lv_name_0_0= ruleIdOrString )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:346:3: lv_name_0_0= ruleIdOrString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getNameIdOrStringParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrString_in_ruleAssignment703);
            lv_name_0_0=ruleIdOrString();
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
              	        		lv_name_0_0, 
              	        		"IdOrString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleAssignment714); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:373:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:374:1: (lv_value_2_0= ruleValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:374:1: (lv_value_2_0= ruleValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:375:3: lv_value_2_0= ruleValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment735);
            lv_value_2_0=ruleValue();
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
              	        		"Value", 
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


    // $ANTLR start entryRuleValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:405:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:406:2: (iv_ruleValue= ruleValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:407:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue770);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue780); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:414:1: ruleValue returns [EObject current=null] : (this_Score_0= ruleScore | this_Book_1= ruleBook | this_BookPart_2= ruleBookPart | this_OutputDefinition_3= ruleOutputDefinition | this_ContextDefinition_4= ruleContextDefinition | this_Music_5= ruleMusic | this_PostEvent_6= rulePostEvent | RULE_STRING | this_Scheme_8= ruleScheme | this_Markup_9= ruleMarkup | RULE_INT ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Score_0 = null;

        EObject this_Book_1 = null;

        EObject this_BookPart_2 = null;

        EObject this_OutputDefinition_3 = null;

        EObject this_ContextDefinition_4 = null;

        EObject this_Music_5 = null;

        EObject this_PostEvent_6 = null;

        EObject this_Scheme_8 = null;

        EObject this_Markup_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:419:6: ( (this_Score_0= ruleScore | this_Book_1= ruleBook | this_BookPart_2= ruleBookPart | this_OutputDefinition_3= ruleOutputDefinition | this_ContextDefinition_4= ruleContextDefinition | this_Music_5= ruleMusic | this_PostEvent_6= rulePostEvent | RULE_STRING | this_Scheme_8= ruleScheme | this_Markup_9= ruleMarkup | RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:420:1: (this_Score_0= ruleScore | this_Book_1= ruleBook | this_BookPart_2= ruleBookPart | this_OutputDefinition_3= ruleOutputDefinition | this_ContextDefinition_4= ruleContextDefinition | this_Music_5= ruleMusic | this_PostEvent_6= rulePostEvent | RULE_STRING | this_Scheme_8= ruleScheme | this_Markup_9= ruleMarkup | RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:420:1: (this_Score_0= ruleScore | this_Book_1= ruleBook | this_BookPart_2= ruleBookPart | this_OutputDefinition_3= ruleOutputDefinition | this_ContextDefinition_4= ruleContextDefinition | this_Music_5= ruleMusic | this_PostEvent_6= rulePostEvent | RULE_STRING | this_Scheme_8= ruleScheme | this_Markup_9= ruleMarkup | RULE_INT )
            int alt3=11;
            switch ( input.LA(1) ) {
            case KEYWORD_55:
                {
                alt3=1;
                }
                break;
            case KEYWORD_43:
                {
                alt3=2;
                }
                break;
            case KEYWORD_72:
                {
                alt3=3;
                }
                break;
            case KEYWORD_45:
            case KEYWORD_54:
            case KEYWORD_61:
                {
                alt3=4;
                }
                break;
            case KEYWORD_67:
                {
                alt3=5;
                }
                break;
            case KEYWORD_13:
            case KEYWORD_18:
            case KEYWORD_22:
            case KEYWORD_23:
            case KEYWORD_29:
            case KEYWORD_36:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_44:
            case KEYWORD_47:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_70:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_81:
            case RULE_ID:
                {
                alt3=6;
                }
                break;
            case KEYWORD_4:
            case KEYWORD_5:
            case KEYWORD_9:
            case KEYWORD_12:
            case KEYWORD_17:
            case KEYWORD_19:
            case KEYWORD_20:
            case KEYWORD_21:
            case KEYWORD_25:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
                {
                alt3=7;
                }
                break;
            case RULE_STRING:
                {
                alt3=8;
                }
                break;
            case KEYWORD_2:
                {
                alt3=9;
                }
                break;
            case KEYWORD_62:
                {
                alt3=10;
                }
                break;
            case RULE_INT:
                {
                alt3=11;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("420:1: (this_Score_0= ruleScore | this_Book_1= ruleBook | this_BookPart_2= ruleBookPart | this_OutputDefinition_3= ruleOutputDefinition | this_ContextDefinition_4= ruleContextDefinition | this_Music_5= ruleMusic | this_PostEvent_6= rulePostEvent | RULE_STRING | this_Scheme_8= ruleScheme | this_Markup_9= ruleMarkup | RULE_INT )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:421:2: this_Score_0= ruleScore
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getScoreParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScore_in_ruleValue830);
                    this_Score_0=ruleScore();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Score_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:434:2: this_Book_1= ruleBook
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getBookParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBook_in_ruleValue860);
                    this_Book_1=ruleBook();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Book_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:447:2: this_BookPart_2= ruleBookPart
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getBookPartParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBookPart_in_ruleValue890);
                    this_BookPart_2=ruleBookPart();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BookPart_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:460:2: this_OutputDefinition_3= ruleOutputDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getOutputDefinitionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputDefinition_in_ruleValue920);
                    this_OutputDefinition_3=ruleOutputDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_OutputDefinition_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:473:2: this_ContextDefinition_4= ruleContextDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getContextDefinitionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextDefinition_in_ruleValue950);
                    this_ContextDefinition_4=ruleContextDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ContextDefinition_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:486:2: this_Music_5= ruleMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getMusicParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMusic_in_ruleValue980);
                    this_Music_5=ruleMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Music_5;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:499:2: this_PostEvent_6= rulePostEvent
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getPostEventParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePostEvent_in_ruleValue1010);
                    this_PostEvent_6=rulePostEvent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_PostEvent_6;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:511:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue1024); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:517:2: this_Scheme_8= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getSchemeParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleValue1054);
                    this_Scheme_8=ruleScheme();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Scheme_8;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:530:2: this_Markup_9= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getMarkupParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleValue1084);
                    this_Markup_9=ruleMarkup();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Markup_9;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:542:6: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue1098); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getINTTerminalRuleCall_10(), null); 
                          
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
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:554:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:555:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:556:2: iv_ruleScheme= ruleScheme EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme1132);
            iv_ruleScheme=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme1142); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScheme


    // $ANTLR start ruleScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:563:1: ruleScheme returns [EObject current=null] : ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:568:6: ( ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:569:1: ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:569:1: ( KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:2: KEYWORD_2 ( (lv_value_1_0= ruleSchemeExpression ) )
            {
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleScheme1178); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeAccess().getNumberSignKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:574:1: ( (lv_value_1_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:575:1: (lv_value_1_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:575:1: (lv_value_1_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:576:3: lv_value_1_0= ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme1199);
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
        }
        return current;
    }
    // $ANTLR end ruleScheme


    // $ANTLR start entryRuleSchemeExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:606:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:607:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:608:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression1234);
            iv_ruleSchemeExpression=ruleSchemeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression1244); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:615:1: ruleSchemeExpression returns [EObject current=null] : ( ( (lv_quoted_0_0= KEYWORD_3 ) )? ( (lv_value_1_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_quoted_0_0=null;
        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:620:6: ( ( ( (lv_quoted_0_0= KEYWORD_3 ) )? ( (lv_value_1_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:621:1: ( ( (lv_quoted_0_0= KEYWORD_3 ) )? ( (lv_value_1_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:621:1: ( ( (lv_quoted_0_0= KEYWORD_3 ) )? ( (lv_value_1_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:621:2: ( (lv_quoted_0_0= KEYWORD_3 ) )? ( (lv_value_1_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:621:2: ( (lv_quoted_0_0= KEYWORD_3 ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_3) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:622:1: (lv_quoted_0_0= KEYWORD_3 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:622:1: (lv_quoted_0_0= KEYWORD_3 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:623:3: lv_quoted_0_0= KEYWORD_3
                    {
                    lv_quoted_0_0=(Token)input.LT(1);
                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSchemeExpression1288); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0(), "quoted"); 
                          
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:643:3: ( (lv_value_1_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:644:1: (lv_value_1_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:644:1: (lv_value_1_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:645:3: lv_value_1_0= ruleSchemeValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression1323);
            lv_value_1_0=ruleSchemeValue();
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
              	        		lv_value_1_0, 
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:675:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:676:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:677:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue1358);
            iv_ruleSchemeValue=ruleSchemeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue1368); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:684:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber ) ;
    public final EObject ruleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SchemeBoolean_0 = null;

        EObject this_SchemeList_1 = null;

        EObject this_SchemeText_3 = null;

        EObject this_SchemeNumber_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:6: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:690:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:690:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt5=1;
                }
                break;
            case KEYWORD_4:
                {
                alt5=2;
                }
                break;
            case KEYWORD_27:
                {
                alt5=3;
                }
                break;
            case KEYWORD_37:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt5=4;
                }
                break;
            case KEYWORD_26:
            case RULE_INT:
                {
                alt5=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("690:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:691:2: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue1418);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:704:2: this_SchemeList_1= ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue1448);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:717:2: ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue1472);
                    ruleSchemeBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:729:2: this_SchemeText_3= ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue1502);
                    this_SchemeText_3=ruleSchemeText();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeText_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:742:2: this_SchemeNumber_4= ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_ruleSchemeValue1532);
                    this_SchemeNumber_4=ruleSchemeNumber();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SchemeNumber_4;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:761:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:762:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:763:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1566);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean1576); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:770:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:775:6: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:776:1: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:776:1: ( (lv_value_0_0= RULE_BOOL ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:777:1: (lv_value_0_0= RULE_BOOL )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:777:1: (lv_value_0_0= RULE_BOOL )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:778:3: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleSchemeBoolean1617); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSchemeBooleanAccess().getValueBOOLTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSchemeBooleanRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"BOOL", 
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
    // $ANTLR end ruleSchemeBoolean


    // $ANTLR start entryRuleSchemeList
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:808:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:809:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:810:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList1656);
            iv_ruleSchemeList=ruleSchemeList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList1666); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:817:1: ruleSchemeList returns [EObject current=null] : ( () KEYWORD_4 ( (lv_expressions_2_0= ruleSchemeExpression ) )* KEYWORD_5 ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:822:6: ( ( () KEYWORD_4 ( (lv_expressions_2_0= ruleSchemeExpression ) )* KEYWORD_5 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:823:1: ( () KEYWORD_4 ( (lv_expressions_2_0= ruleSchemeExpression ) )* KEYWORD_5 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:823:1: ( () KEYWORD_4 ( (lv_expressions_2_0= ruleSchemeExpression ) )* KEYWORD_5 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:823:2: () KEYWORD_4 ( (lv_expressions_2_0= ruleSchemeExpression ) )* KEYWORD_5
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:823:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:824:2: 
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

            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSchemeList1714); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:842:1: ( (lv_expressions_2_0= ruleSchemeExpression ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=KEYWORD_3 && LA6_0<=KEYWORD_4)||(LA6_0>=KEYWORD_26 && LA6_0<=KEYWORD_27)||LA6_0==KEYWORD_37||(LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==RULE_ANY_OTHER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:843:1: (lv_expressions_2_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:843:1: (lv_expressions_2_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:844:3: lv_expressions_2_0= ruleSchemeExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList1735);
            	    lv_expressions_2_0=ruleSchemeExpression();
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
            	      	        		lv_expressions_2_0, 
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
            	    break loop6;
                }
            } while (true);

            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSchemeList1747); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:879:1: entryRuleSchemeBlock returns [String current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final String entryRuleSchemeBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:880:1: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:881:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1783);
            iv_ruleSchemeBlock=ruleSchemeBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBlock.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock1794); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:888:1: ruleSchemeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_27 kw= KEYWORD_28 ) ;
    public final AntlrDatatypeRuleToken ruleSchemeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:893:6: ( (kw= KEYWORD_27 kw= KEYWORD_28 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:894:1: (kw= KEYWORD_27 kw= KEYWORD_28 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:894:1: (kw= KEYWORD_27 kw= KEYWORD_28 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:895:2: kw= KEYWORD_27 kw= KEYWORD_28
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSchemeBlock1832); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleSchemeBlock1845); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_1(), null); 
                  
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


    // $ANTLR start entryRuleSchemeText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:914:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:915:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:916:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText1884);
            iv_ruleSchemeText=ruleSchemeText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText1894); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:923:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeTextLiterals ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:928:6: ( ( (lv_value_0_0= ruleSchemeTextLiterals ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:929:1: ( (lv_value_0_0= ruleSchemeTextLiterals ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:929:1: ( (lv_value_0_0= ruleSchemeTextLiterals ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:930:1: (lv_value_0_0= ruleSchemeTextLiterals )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:930:1: (lv_value_0_0= ruleSchemeTextLiterals )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:931:3: lv_value_0_0= ruleSchemeTextLiterals
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_ruleSchemeText1939);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:961:1: entryRuleSchemeTextLiterals returns [String current=null] : iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF ;
    public final String entryRuleSchemeTextLiterals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextLiterals = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:962:1: (iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:963:2: iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextLiteralsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals1974);
            iv_ruleSchemeTextLiterals=ruleSchemeTextLiterals();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeTextLiterals.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiterals1985); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:970:1: ruleSchemeTextLiterals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_37 | this_IdOrString_1= ruleIdOrString | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextLiterals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_IdOrString_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:975:6: ( (kw= KEYWORD_37 | this_IdOrString_1= ruleIdOrString | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:976:1: (kw= KEYWORD_37 | this_IdOrString_1= ruleIdOrString | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:976:1: (kw= KEYWORD_37 | this_IdOrString_1= ruleIdOrString | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt7=3;
            switch ( input.LA(1) ) {
            case KEYWORD_37:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt7=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("976:1: (kw= KEYWORD_37 | this_IdOrString_1= ruleIdOrString | this_ANY_OTHER_2= RULE_ANY_OTHER )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:977:2: kw= KEYWORD_37
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleSchemeTextLiterals2023); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:984:5: this_IdOrString_1= ruleIdOrString
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeTextLiteralsAccess().getIdOrStringParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdOrString_in_ruleSchemeTextLiterals2051);
                    this_IdOrString_1=ruleIdOrString();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_IdOrString_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:995:10: this_ANY_OTHER_2= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_2=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiterals2077); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_2(), null); 
                          
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1010:1: entryRuleSchemeNumber returns [EObject current=null] : iv_ruleSchemeNumber= ruleSchemeNumber EOF ;
    public final EObject entryRuleSchemeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1014:2: (iv_ruleSchemeNumber= ruleSchemeNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1015:2: iv_ruleSchemeNumber= ruleSchemeNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber2127);
            iv_ruleSchemeNumber=ruleSchemeNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber2137); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1025:1: ruleSchemeNumber returns [EObject current=null] : ( ( (lv_hexadecimal_0_0= KEYWORD_26 ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSchemeNumber() throws RecognitionException {
        EObject current = null;

        Token lv_hexadecimal_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1031:6: ( ( ( (lv_hexadecimal_0_0= KEYWORD_26 ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1032:1: ( ( (lv_hexadecimal_0_0= KEYWORD_26 ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1032:1: ( ( (lv_hexadecimal_0_0= KEYWORD_26 ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1032:2: ( (lv_hexadecimal_0_0= KEYWORD_26 ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1032:2: ( (lv_hexadecimal_0_0= KEYWORD_26 ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1033:1: (lv_hexadecimal_0_0= KEYWORD_26 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1033:1: (lv_hexadecimal_0_0= KEYWORD_26 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1034:3: lv_hexadecimal_0_0= KEYWORD_26
                    {
                    lv_hexadecimal_0_0=(Token)input.LT(1);
                    match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleSchemeNumber2185); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSchemeNumberAccess().getHexadecimalXKeyword_0_0(), "hexadecimal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSchemeNumberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "hexadecimal", true, "#x", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1054:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1055:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1055:1: (lv_value_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1056:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeNumber2216); if (failed) return current;
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


    // $ANTLR start entryRuleContextDefinition
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1089:1: entryRuleContextDefinition returns [EObject current=null] : iv_ruleContextDefinition= ruleContextDefinition EOF ;
    public final EObject entryRuleContextDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDefinition = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1090:2: (iv_ruleContextDefinition= ruleContextDefinition EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1091:2: iv_ruleContextDefinition= ruleContextDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextDefinition_in_entryRuleContextDefinition2260);
            iv_ruleContextDefinition=ruleContextDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDefinition2270); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextDefinition


    // $ANTLR start ruleContextDefinition
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1098:1: ruleContextDefinition returns [EObject current=null] : ( () KEYWORD_67 KEYWORD_22 ( (lv_elements_3_0= ruleContextDefinitionElement ) )* KEYWORD_24 ) ;
    public final EObject ruleContextDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1103:6: ( ( () KEYWORD_67 KEYWORD_22 ( (lv_elements_3_0= ruleContextDefinitionElement ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:1: ( () KEYWORD_67 KEYWORD_22 ( (lv_elements_3_0= ruleContextDefinitionElement ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:1: ( () KEYWORD_67 KEYWORD_22 ( (lv_elements_3_0= ruleContextDefinitionElement ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:2: () KEYWORD_67 KEYWORD_22 ( (lv_elements_3_0= ruleContextDefinitionElement ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1104:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1105:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getContextDefinitionAccess().getContextDefinitionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getContextDefinitionAccess().getContextDefinitionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleContextDefinition2318); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextDefinitionAccess().getContextKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleContextDefinition2329); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1128:1: ( (lv_elements_3_0= ruleContextDefinitionElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==KEYWORD_46||LA9_0==KEYWORD_51||LA9_0==KEYWORD_53||LA9_0==KEYWORD_57||LA9_0==KEYWORD_59||LA9_0==KEYWORD_63||(LA9_0>=KEYWORD_65 && LA9_0<=KEYWORD_66)||(LA9_0>=KEYWORD_73 && LA9_0<=KEYWORD_74)||LA9_0==KEYWORD_78||LA9_0==KEYWORD_80||LA9_0==KEYWORD_84||LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1129:1: (lv_elements_3_0= ruleContextDefinitionElement )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1129:1: (lv_elements_3_0= ruleContextDefinitionElement )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1130:3: lv_elements_3_0= ruleContextDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getContextDefinitionAccess().getElementsContextDefinitionElementParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContextDefinitionElement_in_ruleContextDefinition2350);
            	    lv_elements_3_0=ruleContextDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getContextDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"ContextDefinitionElement", 
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

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleContextDefinition2362); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextDefinitionAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleContextDefinition


    // $ANTLR start entryRuleContextDefinitionElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1165:1: entryRuleContextDefinitionElement returns [EObject current=null] : iv_ruleContextDefinitionElement= ruleContextDefinitionElement EOF ;
    public final EObject entryRuleContextDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDefinitionElement = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1166:2: (iv_ruleContextDefinitionElement= ruleContextDefinitionElement EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1167:2: iv_ruleContextDefinitionElement= ruleContextDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextDefinitionElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextDefinitionElement_in_entryRuleContextDefinitionElement2397);
            iv_ruleContextDefinitionElement=ruleContextDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextDefinitionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDefinitionElement2407); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextDefinitionElement


    // $ANTLR start ruleContextDefinitionElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1174:1: ruleContextDefinitionElement returns [EObject current=null] : (this_GrobDescriptions_0= ruleGrobDescriptions | this_ContextModifier_1= ruleContextModifier ) ;
    public final EObject ruleContextDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_GrobDescriptions_0 = null;

        EObject this_ContextModifier_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1179:6: ( (this_GrobDescriptions_0= ruleGrobDescriptions | this_ContextModifier_1= ruleContextModifier ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1180:1: (this_GrobDescriptions_0= ruleGrobDescriptions | this_ContextModifier_1= ruleContextModifier )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1180:1: (this_GrobDescriptions_0= ruleGrobDescriptions | this_ContextModifier_1= ruleContextModifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_84) ) {
                alt10=1;
            }
            else if ( (LA10_0==KEYWORD_46||LA10_0==KEYWORD_51||LA10_0==KEYWORD_53||LA10_0==KEYWORD_57||LA10_0==KEYWORD_59||LA10_0==KEYWORD_63||(LA10_0>=KEYWORD_65 && LA10_0<=KEYWORD_66)||(LA10_0>=KEYWORD_73 && LA10_0<=KEYWORD_74)||LA10_0==KEYWORD_78||LA10_0==KEYWORD_80||LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1180:1: (this_GrobDescriptions_0= ruleGrobDescriptions | this_ContextModifier_1= ruleContextModifier )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1181:2: this_GrobDescriptions_0= ruleGrobDescriptions
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContextDefinitionElementAccess().getGrobDescriptionsParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGrobDescriptions_in_ruleContextDefinitionElement2457);
                    this_GrobDescriptions_0=ruleGrobDescriptions();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_GrobDescriptions_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1194:2: this_ContextModifier_1= ruleContextModifier
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContextDefinitionElementAccess().getContextModifierParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextModifier_in_ruleContextDefinitionElement2487);
                    this_ContextModifier_1=ruleContextModifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ContextModifier_1;
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
    // $ANTLR end ruleContextDefinitionElement


    // $ANTLR start entryRuleGrobDescriptions
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1213:1: entryRuleGrobDescriptions returns [EObject current=null] : iv_ruleGrobDescriptions= ruleGrobDescriptions EOF ;
    public final EObject entryRuleGrobDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrobDescriptions = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1214:2: (iv_ruleGrobDescriptions= ruleGrobDescriptions EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1215:2: iv_ruleGrobDescriptions= ruleGrobDescriptions EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGrobDescriptionsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGrobDescriptions_in_entryRuleGrobDescriptions2521);
            iv_ruleGrobDescriptions=ruleGrobDescriptions();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGrobDescriptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrobDescriptions2531); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGrobDescriptions


    // $ANTLR start ruleGrobDescriptions
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1222:1: ruleGrobDescriptions returns [EObject current=null] : ( KEYWORD_84 ( (lv_value_1_0= ruleScheme ) ) ) ;
    public final EObject ruleGrobDescriptions() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1227:6: ( ( KEYWORD_84 ( (lv_value_1_0= ruleScheme ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1228:1: ( KEYWORD_84 ( (lv_value_1_0= ruleScheme ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1228:1: ( KEYWORD_84 ( (lv_value_1_0= ruleScheme ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1229:2: KEYWORD_84 ( (lv_value_1_0= ruleScheme ) )
            {
            match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleGrobDescriptions2567); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGrobDescriptionsAccess().getGrobdescriptionsKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1233:1: ( (lv_value_1_0= ruleScheme ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1234:1: (lv_value_1_0= ruleScheme )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1234:1: (lv_value_1_0= ruleScheme )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1235:3: lv_value_1_0= ruleScheme
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGrobDescriptionsAccess().getValueSchemeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScheme_in_ruleGrobDescriptions2588);
            lv_value_1_0=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getGrobDescriptionsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_1_0, 
              	        		"Scheme", 
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
    // $ANTLR end ruleGrobDescriptions


    // $ANTLR start entryRuleHeader
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1265:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1266:2: (iv_ruleHeader= ruleHeader EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1267:2: iv_ruleHeader= ruleHeader EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHeaderRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader2623);
            iv_ruleHeader=ruleHeader();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHeader; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader2633); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleHeader


    // $ANTLR start ruleHeader
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1274:1: ruleHeader returns [EObject current=null] : ( () KEYWORD_60 KEYWORD_22 ( (lv_assignments_3_0= rulePropertyAssignment ) )* KEYWORD_24 ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_assignments_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1279:6: ( ( () KEYWORD_60 KEYWORD_22 ( (lv_assignments_3_0= rulePropertyAssignment ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1280:1: ( () KEYWORD_60 KEYWORD_22 ( (lv_assignments_3_0= rulePropertyAssignment ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1280:1: ( () KEYWORD_60 KEYWORD_22 ( (lv_assignments_3_0= rulePropertyAssignment ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1280:2: () KEYWORD_60 KEYWORD_22 ( (lv_assignments_3_0= rulePropertyAssignment ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1280:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1281:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getHeaderAccess().getHeaderAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getHeaderAccess().getHeaderAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleHeader2681); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHeaderAccess().getHeaderKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleHeader2692); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1304:1: ( (lv_assignments_3_0= rulePropertyAssignment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1305:1: (lv_assignments_3_0= rulePropertyAssignment )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1305:1: (lv_assignments_3_0= rulePropertyAssignment )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1306:3: lv_assignments_3_0= rulePropertyAssignment
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getHeaderAccess().getAssignmentsPropertyAssignmentParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyAssignment_in_ruleHeader2713);
            	    lv_assignments_3_0=rulePropertyAssignment();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getHeaderRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"assignments",
            	      	        		lv_assignments_3_0, 
            	      	        		"PropertyAssignment", 
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

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleHeader2725); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleHeader


    // $ANTLR start entryRulePropertyAssignment
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1341:1: entryRulePropertyAssignment returns [EObject current=null] : iv_rulePropertyAssignment= rulePropertyAssignment EOF ;
    public final EObject entryRulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssignment = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1342:2: (iv_rulePropertyAssignment= rulePropertyAssignment EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1343:2: iv_rulePropertyAssignment= rulePropertyAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment2760);
            iv_rulePropertyAssignment=rulePropertyAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAssignment2770); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1350:1: rulePropertyAssignment returns [EObject current=null] : ( ( (lv_property_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject rulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_property_0_0 = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1355:6: ( ( ( (lv_property_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1356:1: ( ( (lv_property_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1356:1: ( ( (lv_property_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1356:2: ( (lv_property_0_0= ruleIdOrString ) ) KEYWORD_14 ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1356:2: ( (lv_property_0_0= ruleIdOrString ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1357:1: (lv_property_0_0= ruleIdOrString )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1357:1: (lv_property_0_0= ruleIdOrString )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1358:3: lv_property_0_0= ruleIdOrString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyAssignmentAccess().getPropertyIdOrStringParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrString_in_rulePropertyAssignment2816);
            lv_property_0_0=ruleIdOrString();
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
              	       			"property",
              	        		lv_property_0_0, 
              	        		"IdOrString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rulePropertyAssignment2827); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1385:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1386:1: (lv_value_2_0= ruleValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1386:1: (lv_value_2_0= ruleValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1387:3: lv_value_2_0= ruleValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyAssignmentAccess().getValueValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_rulePropertyAssignment2848);
            lv_value_2_0=ruleValue();
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
              	        		"Value", 
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


    // $ANTLR start entryRuleOutputDefinition
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1417:1: entryRuleOutputDefinition returns [EObject current=null] : iv_ruleOutputDefinition= ruleOutputDefinition EOF ;
    public final EObject entryRuleOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDefinition = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1418:2: (iv_ruleOutputDefinition= ruleOutputDefinition EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1419:2: iv_ruleOutputDefinition= ruleOutputDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition2883);
            iv_ruleOutputDefinition=ruleOutputDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDefinition2893); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1426:1: ruleOutputDefinition returns [EObject current=null] : (this_Paper_0= rulePaper | this_Midi_1= ruleMidi | this_Layout_2= ruleLayout ) ;
    public final EObject ruleOutputDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Paper_0 = null;

        EObject this_Midi_1 = null;

        EObject this_Layout_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1431:6: ( (this_Paper_0= rulePaper | this_Midi_1= ruleMidi | this_Layout_2= ruleLayout ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1432:1: (this_Paper_0= rulePaper | this_Midi_1= ruleMidi | this_Layout_2= ruleLayout )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1432:1: (this_Paper_0= rulePaper | this_Midi_1= ruleMidi | this_Layout_2= ruleLayout )
            int alt12=3;
            switch ( input.LA(1) ) {
            case KEYWORD_54:
                {
                alt12=1;
                }
                break;
            case KEYWORD_45:
                {
                alt12=2;
                }
                break;
            case KEYWORD_61:
                {
                alt12=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1432:1: (this_Paper_0= rulePaper | this_Midi_1= ruleMidi | this_Layout_2= ruleLayout )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1433:2: this_Paper_0= rulePaper
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOutputDefinitionAccess().getPaperParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePaper_in_ruleOutputDefinition2943);
                    this_Paper_0=rulePaper();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Paper_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1446:2: this_Midi_1= ruleMidi
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOutputDefinitionAccess().getMidiParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMidi_in_ruleOutputDefinition2973);
                    this_Midi_1=ruleMidi();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Midi_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1459:2: this_Layout_2= ruleLayout
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOutputDefinitionAccess().getLayoutParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLayout_in_ruleOutputDefinition3003);
                    this_Layout_2=ruleLayout();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Layout_2;
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
    // $ANTLR end ruleOutputDefinition


    // $ANTLR start entryRuleOutputDefinitionElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1478:1: entryRuleOutputDefinitionElement returns [EObject current=null] : iv_ruleOutputDefinitionElement= ruleOutputDefinitionElement EOF ;
    public final EObject entryRuleOutputDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDefinitionElement = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1479:2: (iv_ruleOutputDefinitionElement= ruleOutputDefinitionElement EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1480:2: iv_ruleOutputDefinitionElement= ruleOutputDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputDefinitionElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputDefinitionElement_in_entryRuleOutputDefinitionElement3037);
            iv_ruleOutputDefinitionElement=ruleOutputDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputDefinitionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputDefinitionElement3047); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOutputDefinitionElement


    // $ANTLR start ruleOutputDefinitionElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1487:1: ruleOutputDefinitionElement returns [EObject current=null] : (this_PropertyAssignment_0= rulePropertyAssignment | this_ContextDefinition_1= ruleContextDefinition ) ;
    public final EObject ruleOutputDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAssignment_0 = null;

        EObject this_ContextDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1492:6: ( (this_PropertyAssignment_0= rulePropertyAssignment | this_ContextDefinition_1= ruleContextDefinition ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1493:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_ContextDefinition_1= ruleContextDefinition )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1493:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_ContextDefinition_1= ruleContextDefinition )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==KEYWORD_67) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1493:1: (this_PropertyAssignment_0= rulePropertyAssignment | this_ContextDefinition_1= ruleContextDefinition )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1494:2: this_PropertyAssignment_0= rulePropertyAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOutputDefinitionElementAccess().getPropertyAssignmentParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_ruleOutputDefinitionElement3097);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1507:2: this_ContextDefinition_1= ruleContextDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOutputDefinitionElementAccess().getContextDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextDefinition_in_ruleOutputDefinitionElement3127);
                    this_ContextDefinition_1=ruleContextDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ContextDefinition_1;
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
    // $ANTLR end ruleOutputDefinitionElement


    // $ANTLR start entryRulePaper
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1526:1: entryRulePaper returns [EObject current=null] : iv_rulePaper= rulePaper EOF ;
    public final EObject entryRulePaper() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaper = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1527:2: (iv_rulePaper= rulePaper EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1528:2: iv_rulePaper= rulePaper EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPaperRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePaper_in_entryRulePaper3161);
            iv_rulePaper=rulePaper();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePaper; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePaper3171); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePaper


    // $ANTLR start rulePaper
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1535:1: rulePaper returns [EObject current=null] : ( () KEYWORD_54 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 ) ;
    public final EObject rulePaper() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1540:6: ( ( () KEYWORD_54 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:1: ( () KEYWORD_54 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:1: ( () KEYWORD_54 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:2: () KEYWORD_54 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1542:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPaperAccess().getPaperAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPaperAccess().getPaperAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rulePaper3219); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPaperAccess().getPaperKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rulePaper3230); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPaperAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1565:1: ( (lv_elements_3_0= ruleOutputDefinitionElement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==KEYWORD_67||LA14_0==RULE_STRING||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1566:1: (lv_elements_3_0= ruleOutputDefinitionElement )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1566:1: (lv_elements_3_0= ruleOutputDefinitionElement )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1567:3: lv_elements_3_0= ruleOutputDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPaperAccess().getElementsOutputDefinitionElementParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOutputDefinitionElement_in_rulePaper3251);
            	    lv_elements_3_0=ruleOutputDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPaperRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"OutputDefinitionElement", 
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
            	    break loop14;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rulePaper3263); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPaperAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end rulePaper


    // $ANTLR start entryRuleMidi
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1602:1: entryRuleMidi returns [EObject current=null] : iv_ruleMidi= ruleMidi EOF ;
    public final EObject entryRuleMidi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMidi = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1603:2: (iv_ruleMidi= ruleMidi EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1604:2: iv_ruleMidi= ruleMidi EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMidiRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMidi_in_entryRuleMidi3298);
            iv_ruleMidi=ruleMidi();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMidi; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMidi3308); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMidi


    // $ANTLR start ruleMidi
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1611:1: ruleMidi returns [EObject current=null] : ( () KEYWORD_45 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 ) ;
    public final EObject ruleMidi() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1616:6: ( ( () KEYWORD_45 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1617:1: ( () KEYWORD_45 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1617:1: ( () KEYWORD_45 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1617:2: () KEYWORD_45 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1617:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1618:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getMidiAccess().getMidiAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getMidiAccess().getMidiAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleMidi3356); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMidiAccess().getMidiKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleMidi3367); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMidiAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1641:1: ( (lv_elements_3_0= ruleOutputDefinitionElement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==KEYWORD_67||LA15_0==RULE_STRING||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1642:1: (lv_elements_3_0= ruleOutputDefinitionElement )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1642:1: (lv_elements_3_0= ruleOutputDefinitionElement )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1643:3: lv_elements_3_0= ruleOutputDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMidiAccess().getElementsOutputDefinitionElementParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOutputDefinitionElement_in_ruleMidi3388);
            	    lv_elements_3_0=ruleOutputDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMidiRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"OutputDefinitionElement", 
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
            	    break loop15;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMidi3400); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMidiAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleMidi


    // $ANTLR start entryRuleLayout
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1678:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1679:2: (iv_ruleLayout= ruleLayout EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1680:2: iv_ruleLayout= ruleLayout EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLayoutRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout3435);
            iv_ruleLayout=ruleLayout();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLayout; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout3445); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLayout


    // $ANTLR start ruleLayout
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1687:1: ruleLayout returns [EObject current=null] : ( () KEYWORD_61 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1692:6: ( ( () KEYWORD_61 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1693:1: ( () KEYWORD_61 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1693:1: ( () KEYWORD_61 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1693:2: () KEYWORD_61 KEYWORD_22 ( (lv_elements_3_0= ruleOutputDefinitionElement ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1693:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1694:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getLayoutAccess().getLayoutAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getLayoutAccess().getLayoutAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleLayout3493); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLayoutAccess().getLayoutKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleLayout3504); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1717:1: ( (lv_elements_3_0= ruleOutputDefinitionElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==KEYWORD_67||LA16_0==RULE_STRING||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1718:1: (lv_elements_3_0= ruleOutputDefinitionElement )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1718:1: (lv_elements_3_0= ruleOutputDefinitionElement )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1719:3: lv_elements_3_0= ruleOutputDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getLayoutAccess().getElementsOutputDefinitionElementParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOutputDefinitionElement_in_ruleLayout3525);
            	    lv_elements_3_0=ruleOutputDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getLayoutRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"OutputDefinitionElement", 
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
            	    break loop16;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleLayout3537); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleLayout


    // $ANTLR start entryRuleScore
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1754:1: entryRuleScore returns [EObject current=null] : iv_ruleScore= ruleScore EOF ;
    public final EObject entryRuleScore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScore = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1755:2: (iv_ruleScore= ruleScore EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1756:2: iv_ruleScore= ruleScore EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScoreRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScore_in_entryRuleScore3572);
            iv_ruleScore=ruleScore();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScore3582); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScore


    // $ANTLR start ruleScore
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1763:1: ruleScore returns [EObject current=null] : ( KEYWORD_55 KEYWORD_22 ( (lv_music_2_0= ruleMusic ) ) ( (lv_other_3_0= ruleScoreElement ) )* KEYWORD_24 ) ;
    public final EObject ruleScore() throws RecognitionException {
        EObject current = null;

        EObject lv_music_2_0 = null;

        EObject lv_other_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1768:6: ( ( KEYWORD_55 KEYWORD_22 ( (lv_music_2_0= ruleMusic ) ) ( (lv_other_3_0= ruleScoreElement ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1769:1: ( KEYWORD_55 KEYWORD_22 ( (lv_music_2_0= ruleMusic ) ) ( (lv_other_3_0= ruleScoreElement ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1769:1: ( KEYWORD_55 KEYWORD_22 ( (lv_music_2_0= ruleMusic ) ) ( (lv_other_3_0= ruleScoreElement ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1770:2: KEYWORD_55 KEYWORD_22 ( (lv_music_2_0= ruleMusic ) ) ( (lv_other_3_0= ruleScoreElement ) )* KEYWORD_24
            {
            match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleScore3618); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getScoreAccess().getScoreKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleScore3629); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getScoreAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1779:1: ( (lv_music_2_0= ruleMusic ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1780:1: (lv_music_2_0= ruleMusic )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1780:1: (lv_music_2_0= ruleMusic )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1781:3: lv_music_2_0= ruleMusic
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getScoreAccess().getMusicMusicParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMusic_in_ruleScore3650);
            lv_music_2_0=ruleMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getScoreRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"music",
              	        		lv_music_2_0, 
              	        		"Music", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1803:2: ( (lv_other_3_0= ruleScoreElement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==KEYWORD_13||LA17_0==KEYWORD_18||(LA17_0>=KEYWORD_22 && LA17_0<=KEYWORD_23)||LA17_0==KEYWORD_29||LA17_0==KEYWORD_36||(LA17_0>=KEYWORD_38 && LA17_0<=KEYWORD_42)||(LA17_0>=KEYWORD_44 && LA17_0<=KEYWORD_45)||LA17_0==KEYWORD_47||(LA17_0>=KEYWORD_49 && LA17_0<=KEYWORD_50)||LA17_0==KEYWORD_54||(LA17_0>=KEYWORD_56 && LA17_0<=KEYWORD_58)||(LA17_0>=KEYWORD_60 && LA17_0<=KEYWORD_61)||(LA17_0>=KEYWORD_64 && LA17_0<=KEYWORD_65)||LA17_0==KEYWORD_70||(LA17_0>=KEYWORD_74 && LA17_0<=KEYWORD_76)||LA17_0==KEYWORD_81||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1804:1: (lv_other_3_0= ruleScoreElement )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1804:1: (lv_other_3_0= ruleScoreElement )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1805:3: lv_other_3_0= ruleScoreElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getScoreAccess().getOtherScoreElementParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleScoreElement_in_ruleScore3671);
            	    lv_other_3_0=ruleScoreElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getScoreRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"other",
            	      	        		lv_other_3_0, 
            	      	        		"ScoreElement", 
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
            	    break loop17;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleScore3683); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getScoreAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleScore


    // $ANTLR start entryRuleScoreElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1840:1: entryRuleScoreElement returns [EObject current=null] : iv_ruleScoreElement= ruleScoreElement EOF ;
    public final EObject entryRuleScoreElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScoreElement = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1841:2: (iv_ruleScoreElement= ruleScoreElement EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1842:2: iv_ruleScoreElement= ruleScoreElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScoreElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScoreElement_in_entryRuleScoreElement3718);
            iv_ruleScoreElement=ruleScoreElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScoreElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScoreElement3728); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScoreElement


    // $ANTLR start ruleScoreElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1849:1: ruleScoreElement returns [EObject current=null] : (this_Music_0= ruleMusic | this_Header_1= ruleHeader | this_OutputDefinition_2= ruleOutputDefinition ) ;
    public final EObject ruleScoreElement() throws RecognitionException {
        EObject current = null;

        EObject this_Music_0 = null;

        EObject this_Header_1 = null;

        EObject this_OutputDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1854:6: ( (this_Music_0= ruleMusic | this_Header_1= ruleHeader | this_OutputDefinition_2= ruleOutputDefinition ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1855:1: (this_Music_0= ruleMusic | this_Header_1= ruleHeader | this_OutputDefinition_2= ruleOutputDefinition )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1855:1: (this_Music_0= ruleMusic | this_Header_1= ruleHeader | this_OutputDefinition_2= ruleOutputDefinition )
            int alt18=3;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
            case KEYWORD_18:
            case KEYWORD_22:
            case KEYWORD_23:
            case KEYWORD_29:
            case KEYWORD_36:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_44:
            case KEYWORD_47:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_70:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_81:
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case KEYWORD_60:
                {
                alt18=2;
                }
                break;
            case KEYWORD_45:
            case KEYWORD_54:
            case KEYWORD_61:
                {
                alt18=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1855:1: (this_Music_0= ruleMusic | this_Header_1= ruleHeader | this_OutputDefinition_2= ruleOutputDefinition )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1856:2: this_Music_0= ruleMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getScoreElementAccess().getMusicParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMusic_in_ruleScoreElement3778);
                    this_Music_0=ruleMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Music_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1869:2: this_Header_1= ruleHeader
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getScoreElementAccess().getHeaderParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHeader_in_ruleScoreElement3808);
                    this_Header_1=ruleHeader();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Header_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1882:2: this_OutputDefinition_2= ruleOutputDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getScoreElementAccess().getOutputDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputDefinition_in_ruleScoreElement3838);
                    this_OutputDefinition_2=ruleOutputDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_OutputDefinition_2;
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
    // $ANTLR end ruleScoreElement


    // $ANTLR start entryRuleBook
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1901:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1902:2: (iv_ruleBook= ruleBook EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1903:2: iv_ruleBook= ruleBook EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBookRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBook_in_entryRuleBook3872);
            iv_ruleBook=ruleBook();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBook; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBook3882); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBook


    // $ANTLR start ruleBook
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1910:1: ruleBook returns [EObject current=null] : ( () KEYWORD_43 KEYWORD_22 ( (lv_elements_3_0= ruleBookElement ) )* KEYWORD_24 ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1915:6: ( ( () KEYWORD_43 KEYWORD_22 ( (lv_elements_3_0= ruleBookElement ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1916:1: ( () KEYWORD_43 KEYWORD_22 ( (lv_elements_3_0= ruleBookElement ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1916:1: ( () KEYWORD_43 KEYWORD_22 ( (lv_elements_3_0= ruleBookElement ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1916:2: () KEYWORD_43 KEYWORD_22 ( (lv_elements_3_0= ruleBookElement ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1916:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1917:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBookAccess().getBookAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBookAccess().getBookAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBook3930); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBookAccess().getBookKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleBook3941); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1940:1: ( (lv_elements_3_0= ruleBookElement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==KEYWORD_22||LA19_0==KEYWORD_29||LA19_0==KEYWORD_41||(LA19_0>=KEYWORD_54 && LA19_0<=KEYWORD_55)||LA19_0==KEYWORD_60||LA19_0==KEYWORD_62||LA19_0==KEYWORD_64||LA19_0==KEYWORD_72||(LA19_0>=KEYWORD_75 && LA19_0<=KEYWORD_76)||LA19_0==KEYWORD_79||LA19_0==KEYWORD_81) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1941:1: (lv_elements_3_0= ruleBookElement )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1941:1: (lv_elements_3_0= ruleBookElement )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1942:3: lv_elements_3_0= ruleBookElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBookAccess().getElementsBookElementParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBookElement_in_ruleBook3962);
            	    lv_elements_3_0=ruleBookElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBookRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"BookElement", 
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
            	    break loop19;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleBook3974); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleBook


    // $ANTLR start entryRuleBookElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1977:1: entryRuleBookElement returns [EObject current=null] : iv_ruleBookElement= ruleBookElement EOF ;
    public final EObject entryRuleBookElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBookElement = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1978:2: (iv_ruleBookElement= ruleBookElement EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1979:2: iv_ruleBookElement= ruleBookElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBookElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBookElement_in_entryRuleBookElement4009);
            iv_ruleBookElement=ruleBookElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBookElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBookElement4019); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBookElement


    // $ANTLR start ruleBookElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1986:1: ruleBookElement returns [EObject current=null] : (this_BookPart_0= ruleBookPart | this_BookPartElement_1= ruleBookPartElement ) ;
    public final EObject ruleBookElement() throws RecognitionException {
        EObject current = null;

        EObject this_BookPart_0 = null;

        EObject this_BookPartElement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1991:6: ( (this_BookPart_0= ruleBookPart | this_BookPartElement_1= ruleBookPartElement ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1992:1: (this_BookPart_0= ruleBookPart | this_BookPartElement_1= ruleBookPartElement )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1992:1: (this_BookPart_0= ruleBookPart | this_BookPartElement_1= ruleBookPartElement )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_72) ) {
                alt20=1;
            }
            else if ( (LA20_0==KEYWORD_22||LA20_0==KEYWORD_29||LA20_0==KEYWORD_41||(LA20_0>=KEYWORD_54 && LA20_0<=KEYWORD_55)||LA20_0==KEYWORD_60||LA20_0==KEYWORD_62||LA20_0==KEYWORD_64||(LA20_0>=KEYWORD_75 && LA20_0<=KEYWORD_76)||LA20_0==KEYWORD_79||LA20_0==KEYWORD_81) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1992:1: (this_BookPart_0= ruleBookPart | this_BookPartElement_1= ruleBookPartElement )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1993:2: this_BookPart_0= ruleBookPart
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBookElementAccess().getBookPartParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBookPart_in_ruleBookElement4069);
                    this_BookPart_0=ruleBookPart();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BookPart_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2006:2: this_BookPartElement_1= ruleBookPartElement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBookElementAccess().getBookPartElementParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBookPartElement_in_ruleBookElement4099);
                    this_BookPartElement_1=ruleBookPartElement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BookPartElement_1;
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
    // $ANTLR end ruleBookElement


    // $ANTLR start entryRuleBookPart
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2025:1: entryRuleBookPart returns [EObject current=null] : iv_ruleBookPart= ruleBookPart EOF ;
    public final EObject entryRuleBookPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBookPart = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2026:2: (iv_ruleBookPart= ruleBookPart EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2027:2: iv_ruleBookPart= ruleBookPart EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBookPartRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBookPart_in_entryRuleBookPart4133);
            iv_ruleBookPart=ruleBookPart();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBookPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBookPart4143); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBookPart


    // $ANTLR start ruleBookPart
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2034:1: ruleBookPart returns [EObject current=null] : ( () KEYWORD_72 KEYWORD_22 ( (lv_elements_3_0= ruleBookPartElement ) )* KEYWORD_24 ) ;
    public final EObject ruleBookPart() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2039:6: ( ( () KEYWORD_72 KEYWORD_22 ( (lv_elements_3_0= ruleBookPartElement ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:1: ( () KEYWORD_72 KEYWORD_22 ( (lv_elements_3_0= ruleBookPartElement ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:1: ( () KEYWORD_72 KEYWORD_22 ( (lv_elements_3_0= ruleBookPartElement ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:2: () KEYWORD_72 KEYWORD_22 ( (lv_elements_3_0= ruleBookPartElement ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2040:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2041:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBookPartAccess().getBookPartAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBookPartAccess().getBookPartAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleBookPart4191); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBookPartAccess().getBookpartKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleBookPart4202); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBookPartAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2064:1: ( (lv_elements_3_0= ruleBookPartElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==KEYWORD_22||LA21_0==KEYWORD_29||LA21_0==KEYWORD_41||(LA21_0>=KEYWORD_54 && LA21_0<=KEYWORD_55)||LA21_0==KEYWORD_60||LA21_0==KEYWORD_62||LA21_0==KEYWORD_64||(LA21_0>=KEYWORD_75 && LA21_0<=KEYWORD_76)||LA21_0==KEYWORD_79||LA21_0==KEYWORD_81) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2065:1: (lv_elements_3_0= ruleBookPartElement )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2065:1: (lv_elements_3_0= ruleBookPartElement )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2066:3: lv_elements_3_0= ruleBookPartElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBookPartAccess().getElementsBookPartElementParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBookPartElement_in_ruleBookPart4223);
            	    lv_elements_3_0=ruleBookPartElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBookPartRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"BookPartElement", 
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
            	    break loop21;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleBookPart4235); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBookPartAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleBookPart


    // $ANTLR start entryRuleBookPartElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2101:1: entryRuleBookPartElement returns [EObject current=null] : iv_ruleBookPartElement= ruleBookPartElement EOF ;
    public final EObject entryRuleBookPartElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBookPartElement = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2102:2: (iv_ruleBookPartElement= ruleBookPartElement EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2103:2: iv_ruleBookPartElement= ruleBookPartElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBookPartElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBookPartElement_in_entryRuleBookPartElement4270);
            iv_ruleBookPartElement=ruleBookPartElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBookPartElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBookPartElement4280); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBookPartElement


    // $ANTLR start ruleBookPartElement
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2110:1: ruleBookPartElement returns [EObject current=null] : (this_Paper_0= rulePaper | this_Score_1= ruleScore | this_CompositeMusic_2= ruleCompositeMusic | this_Markup_3= ruleMarkup | this_MarkupLines_4= ruleMarkupLines | this_Header_5= ruleHeader ) ;
    public final EObject ruleBookPartElement() throws RecognitionException {
        EObject current = null;

        EObject this_Paper_0 = null;

        EObject this_Score_1 = null;

        EObject this_CompositeMusic_2 = null;

        EObject this_Markup_3 = null;

        EObject this_MarkupLines_4 = null;

        EObject this_Header_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2115:6: ( (this_Paper_0= rulePaper | this_Score_1= ruleScore | this_CompositeMusic_2= ruleCompositeMusic | this_Markup_3= ruleMarkup | this_MarkupLines_4= ruleMarkupLines | this_Header_5= ruleHeader ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2116:1: (this_Paper_0= rulePaper | this_Score_1= ruleScore | this_CompositeMusic_2= ruleCompositeMusic | this_Markup_3= ruleMarkup | this_MarkupLines_4= ruleMarkupLines | this_Header_5= ruleHeader )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2116:1: (this_Paper_0= rulePaper | this_Score_1= ruleScore | this_CompositeMusic_2= ruleCompositeMusic | this_Markup_3= ruleMarkup | this_MarkupLines_4= ruleMarkupLines | this_Header_5= ruleHeader )
            int alt22=6;
            switch ( input.LA(1) ) {
            case KEYWORD_54:
                {
                alt22=1;
                }
                break;
            case KEYWORD_55:
                {
                alt22=2;
                }
                break;
            case KEYWORD_22:
            case KEYWORD_29:
            case KEYWORD_41:
            case KEYWORD_64:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_81:
                {
                alt22=3;
                }
                break;
            case KEYWORD_62:
                {
                alt22=4;
                }
                break;
            case KEYWORD_79:
                {
                alt22=5;
                }
                break;
            case KEYWORD_60:
                {
                alt22=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2116:1: (this_Paper_0= rulePaper | this_Score_1= ruleScore | this_CompositeMusic_2= ruleCompositeMusic | this_Markup_3= ruleMarkup | this_MarkupLines_4= ruleMarkupLines | this_Header_5= ruleHeader )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2117:2: this_Paper_0= rulePaper
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBookPartElementAccess().getPaperParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePaper_in_ruleBookPartElement4330);
                    this_Paper_0=rulePaper();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Paper_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2130:2: this_Score_1= ruleScore
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBookPartElementAccess().getScoreParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScore_in_ruleBookPartElement4360);
                    this_Score_1=ruleScore();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Score_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2143:2: this_CompositeMusic_2= ruleCompositeMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBookPartElementAccess().getCompositeMusicParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeMusic_in_ruleBookPartElement4390);
                    this_CompositeMusic_2=ruleCompositeMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_CompositeMusic_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2156:2: this_Markup_3= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBookPartElementAccess().getMarkupParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleBookPartElement4420);
                    this_Markup_3=ruleMarkup();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Markup_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2169:2: this_MarkupLines_4= ruleMarkupLines
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBookPartElementAccess().getMarkupLinesParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_ruleBookPartElement4450);
                    this_MarkupLines_4=ruleMarkupLines();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MarkupLines_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2182:2: this_Header_5= ruleHeader
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBookPartElementAccess().getHeaderParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHeader_in_ruleBookPartElement4480);
                    this_Header_5=ruleHeader();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Header_5;
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
    // $ANTLR end ruleBookPartElement


    // $ANTLR start entryRuleMarkup
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2201:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2202:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2203:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkup_in_entryRuleMarkup4514);
            iv_ruleMarkup=ruleMarkup();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkup4524); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2210:1: ruleMarkup returns [EObject current=null] : ( () KEYWORD_62 KEYWORD_22 KEYWORD_24 ) ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2215:6: ( ( () KEYWORD_62 KEYWORD_22 KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:1: ( () KEYWORD_62 KEYWORD_22 KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:1: ( () KEYWORD_62 KEYWORD_22 KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:2: () KEYWORD_62 KEYWORD_22 KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2216:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2217:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getMarkupAccess().getMarkupAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getMarkupAccess().getMarkupAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMarkup4572); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupAccess().getMarkupKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleMarkup4583); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMarkup4594); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupAccess().getRightCurlyBracketKeyword_3(), null); 
                  
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2253:1: entryRuleMarkupLines returns [EObject current=null] : iv_ruleMarkupLines= ruleMarkupLines EOF ;
    public final EObject entryRuleMarkupLines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupLines = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2254:2: (iv_ruleMarkupLines= ruleMarkupLines EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2255:2: iv_ruleMarkupLines= ruleMarkupLines EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkupLinesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines4629);
            iv_ruleMarkupLines=ruleMarkupLines();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMarkupLines; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupLines4639); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2262:1: ruleMarkupLines returns [EObject current=null] : ( () KEYWORD_79 KEYWORD_22 KEYWORD_24 ) ;
    public final EObject ruleMarkupLines() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2267:6: ( ( () KEYWORD_79 KEYWORD_22 KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2268:1: ( () KEYWORD_79 KEYWORD_22 KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2268:1: ( () KEYWORD_79 KEYWORD_22 KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2268:2: () KEYWORD_79 KEYWORD_22 KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2268:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2269:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getMarkupLinesAccess().getMarkupLinesAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getMarkupLinesAccess().getMarkupLinesAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleMarkupLines4687); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupLinesAccess().getMarkuplinesKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleMarkupLines4698); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupLinesAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMarkupLines4709); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkupLinesAccess().getRightCurlyBracketKeyword_3(), null); 
                  
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


    // $ANTLR start entryRuleVersion
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2305:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2306:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2307:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVersionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion4744);
            iv_ruleVersion=ruleVersion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion4754); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2314:1: ruleVersion returns [EObject current=null] : ( KEYWORD_71 ( (lv_version_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2319:6: ( ( KEYWORD_71 ( (lv_version_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2320:1: ( KEYWORD_71 ( (lv_version_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2320:1: ( KEYWORD_71 ( (lv_version_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2321:2: KEYWORD_71 ( (lv_version_1_0= RULE_STRING ) )
            {
            match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleVersion4790); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVersionAccess().getVersionKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2325:1: ( (lv_version_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2326:1: (lv_version_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2326:1: (lv_version_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2327:3: lv_version_1_0= RULE_STRING
            {
            lv_version_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion4807); if (failed) return current;
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


    // $ANTLR start entryRuleInclude
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2357:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2358:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2359:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude4847);
            iv_ruleInclude=ruleInclude();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude4857); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2366:1: ruleInclude returns [EObject current=null] : ( KEYWORD_69 ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2371:6: ( ( KEYWORD_69 ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2372:1: ( KEYWORD_69 ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2372:1: ( KEYWORD_69 ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2373:2: KEYWORD_69 ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleInclude4893); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeAccess().getIncludeKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2377:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2378:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2378:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2379:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude4910); if (failed) return current;
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


    // $ANTLR start entryRuleSourceFileName
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2409:1: entryRuleSourceFileName returns [EObject current=null] : iv_ruleSourceFileName= ruleSourceFileName EOF ;
    public final EObject entryRuleSourceFileName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFileName = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2410:2: (iv_ruleSourceFileName= ruleSourceFileName EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2411:2: iv_ruleSourceFileName= ruleSourceFileName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSourceFileNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSourceFileName_in_entryRuleSourceFileName4950);
            iv_ruleSourceFileName=ruleSourceFileName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSourceFileName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceFileName4960); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSourceFileName


    // $ANTLR start ruleSourceFileName
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2418:1: ruleSourceFileName returns [EObject current=null] : ( KEYWORD_83 ( (lv_filename_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceFileName() throws RecognitionException {
        EObject current = null;

        Token lv_filename_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2423:6: ( ( KEYWORD_83 ( (lv_filename_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2424:1: ( KEYWORD_83 ( (lv_filename_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2424:1: ( KEYWORD_83 ( (lv_filename_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2425:2: KEYWORD_83 ( (lv_filename_1_0= RULE_STRING ) )
            {
            match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleSourceFileName4996); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSourceFileNameAccess().getSourcefilenameKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2429:1: ( (lv_filename_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2430:1: (lv_filename_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2430:1: (lv_filename_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2431:3: lv_filename_1_0= RULE_STRING
            {
            lv_filename_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSourceFileName5013); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSourceFileNameAccess().getFilenameSTRINGTerminalRuleCall_1_0(), "filename"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSourceFileNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"filename",
              	        		lv_filename_1_0, 
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
    // $ANTLR end ruleSourceFileName


    // $ANTLR start entryRuleSourceFileLine
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2461:1: entryRuleSourceFileLine returns [EObject current=null] : iv_ruleSourceFileLine= ruleSourceFileLine EOF ;
    public final EObject entryRuleSourceFileLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFileLine = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2462:2: (iv_ruleSourceFileLine= ruleSourceFileLine EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2463:2: iv_ruleSourceFileLine= ruleSourceFileLine EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSourceFileLineRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSourceFileLine_in_entryRuleSourceFileLine5053);
            iv_ruleSourceFileLine=ruleSourceFileLine();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSourceFileLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceFileLine5063); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSourceFileLine


    // $ANTLR start ruleSourceFileLine
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2470:1: ruleSourceFileLine returns [EObject current=null] : ( KEYWORD_82 ( (lv_line_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSourceFileLine() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2475:6: ( ( KEYWORD_82 ( (lv_line_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2476:1: ( KEYWORD_82 ( (lv_line_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2476:1: ( KEYWORD_82 ( (lv_line_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2477:2: KEYWORD_82 ( (lv_line_1_0= RULE_INT ) )
            {
            match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleSourceFileLine5099); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSourceFileLineAccess().getSourcefilelineKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2481:1: ( (lv_line_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2482:1: (lv_line_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2482:1: (lv_line_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2483:3: lv_line_1_0= RULE_INT
            {
            lv_line_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSourceFileLine5116); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSourceFileLineAccess().getLineINTTerminalRuleCall_1_0(), "line"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSourceFileLineRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"line",
              	        		lv_line_1_0, 
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
        }
        return current;
    }
    // $ANTLR end ruleSourceFileLine


    // $ANTLR start entryRuleMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2513:1: entryRuleMusic returns [EObject current=null] : iv_ruleMusic= ruleMusic EOF ;
    public final EObject entryRuleMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2514:2: (iv_ruleMusic= ruleMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2515:2: iv_ruleMusic= ruleMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMusic_in_entryRuleMusic5156);
            iv_ruleMusic=ruleMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMusic5166); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMusic


    // $ANTLR start ruleMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2522:1: ruleMusic returns [EObject current=null] : (this_SimpleMusic_0= ruleSimpleMusic | this_CompositeMusic_1= ruleCompositeMusic ) ;
    public final EObject ruleMusic() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleMusic_0 = null;

        EObject this_CompositeMusic_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2527:6: ( (this_SimpleMusic_0= ruleSimpleMusic | this_CompositeMusic_1= ruleCompositeMusic ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2528:1: (this_SimpleMusic_0= ruleSimpleMusic | this_CompositeMusic_1= ruleCompositeMusic )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2528:1: (this_SimpleMusic_0= ruleSimpleMusic | this_CompositeMusic_1= ruleCompositeMusic )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_13||LA23_0==KEYWORD_18||LA23_0==KEYWORD_23||LA23_0==KEYWORD_36||(LA23_0>=KEYWORD_38 && LA23_0<=KEYWORD_40)||LA23_0==KEYWORD_42||LA23_0==KEYWORD_44||LA23_0==KEYWORD_47||(LA23_0>=KEYWORD_49 && LA23_0<=KEYWORD_50)||(LA23_0>=KEYWORD_56 && LA23_0<=KEYWORD_58)||LA23_0==KEYWORD_65||LA23_0==KEYWORD_70||LA23_0==KEYWORD_74||LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==KEYWORD_22||LA23_0==KEYWORD_29||LA23_0==KEYWORD_41||LA23_0==KEYWORD_64||(LA23_0>=KEYWORD_75 && LA23_0<=KEYWORD_76)||LA23_0==KEYWORD_81) ) {
                alt23=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2528:1: (this_SimpleMusic_0= ruleSimpleMusic | this_CompositeMusic_1= ruleCompositeMusic )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2529:2: this_SimpleMusic_0= ruleSimpleMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMusicAccess().getSimpleMusicParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleMusic_in_ruleMusic5216);
                    this_SimpleMusic_0=ruleSimpleMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SimpleMusic_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2542:2: this_CompositeMusic_1= ruleCompositeMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMusicAccess().getCompositeMusicParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeMusic_in_ruleMusic5246);
                    this_CompositeMusic_1=ruleCompositeMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_CompositeMusic_1;
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
    // $ANTLR end ruleMusic


    // $ANTLR start entryRuleSimpleMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2561:1: entryRuleSimpleMusic returns [EObject current=null] : iv_ruleSimpleMusic= ruleSimpleMusic EOF ;
    public final EObject entryRuleSimpleMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2562:2: (iv_ruleSimpleMusic= ruleSimpleMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2563:2: iv_ruleSimpleMusic= ruleSimpleMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimpleMusic_in_entryRuleSimpleMusic5280);
            iv_ruleSimpleMusic=ruleSimpleMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMusic5290); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleMusic


    // $ANTLR start ruleSimpleMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2570:1: ruleSimpleMusic returns [EObject current=null] : (this_Event_0= ruleEvent | this_ContextChange_1= ruleContextChange | this_MusicPropertyDefinition_2= ruleMusicPropertyDefinition ) ;
    public final EObject ruleSimpleMusic() throws RecognitionException {
        EObject current = null;

        EObject this_Event_0 = null;

        EObject this_ContextChange_1 = null;

        EObject this_MusicPropertyDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2575:6: ( (this_Event_0= ruleEvent | this_ContextChange_1= ruleContextChange | this_MusicPropertyDefinition_2= ruleMusicPropertyDefinition ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2576:1: (this_Event_0= ruleEvent | this_ContextChange_1= ruleContextChange | this_MusicPropertyDefinition_2= ruleMusicPropertyDefinition )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2576:1: (this_Event_0= ruleEvent | this_ContextChange_1= ruleContextChange | this_MusicPropertyDefinition_2= ruleMusicPropertyDefinition )
            int alt24=3;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
            case KEYWORD_18:
            case KEYWORD_23:
            case KEYWORD_36:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_44:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_56:
            case KEYWORD_70:
            case RULE_ID:
                {
                alt24=1;
                }
                break;
            case KEYWORD_58:
                {
                alt24=2;
                }
                break;
            case KEYWORD_42:
            case KEYWORD_47:
            case KEYWORD_57:
            case KEYWORD_65:
            case KEYWORD_74:
                {
                alt24=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2576:1: (this_Event_0= ruleEvent | this_ContextChange_1= ruleContextChange | this_MusicPropertyDefinition_2= ruleMusicPropertyDefinition )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2577:2: this_Event_0= ruleEvent
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSimpleMusicAccess().getEventParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEvent_in_ruleSimpleMusic5340);
                    this_Event_0=ruleEvent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Event_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2590:2: this_ContextChange_1= ruleContextChange
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSimpleMusicAccess().getContextChangeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextChange_in_ruleSimpleMusic5370);
                    this_ContextChange_1=ruleContextChange();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ContextChange_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2603:2: this_MusicPropertyDefinition_2= ruleMusicPropertyDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSimpleMusicAccess().getMusicPropertyDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMusicPropertyDefinition_in_ruleSimpleMusic5400);
                    this_MusicPropertyDefinition_2=ruleMusicPropertyDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MusicPropertyDefinition_2;
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
    // $ANTLR end ruleSimpleMusic


    // $ANTLR start entryRuleEvent
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2622:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2623:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2624:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent5434);
            iv_ruleEvent=ruleEvent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent5444); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2631:1: ruleEvent returns [EObject current=null] : (this_Note_0= ruleNote | this_Rest_1= ruleRest | this_Chord_2= ruleChord | this_KeySignature_3= ruleKeySignature | this_TimeSignature_4= ruleTimeSignature | this_Tempo_5= ruleTempo | this_Partial_6= rulePartial | this_Mark_7= ruleMark | this_Skip_8= ruleSkip | this_Tie_9= ruleTie | this_BeamStart_10= ruleBeamStart | this_BeamEnd_11= ruleBeamEnd | this_BarCheck_12= ruleBarCheck | this_Reference_13= ruleReference ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_Note_0 = null;

        EObject this_Rest_1 = null;

        EObject this_Chord_2 = null;

        EObject this_KeySignature_3 = null;

        EObject this_TimeSignature_4 = null;

        EObject this_Tempo_5 = null;

        EObject this_Partial_6 = null;

        EObject this_Mark_7 = null;

        EObject this_Skip_8 = null;

        EObject this_Tie_9 = null;

        EObject this_BeamStart_10 = null;

        EObject this_BeamEnd_11 = null;

        EObject this_BarCheck_12 = null;

        EObject this_Reference_13 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2636:6: ( (this_Note_0= ruleNote | this_Rest_1= ruleRest | this_Chord_2= ruleChord | this_KeySignature_3= ruleKeySignature | this_TimeSignature_4= ruleTimeSignature | this_Tempo_5= ruleTempo | this_Partial_6= rulePartial | this_Mark_7= ruleMark | this_Skip_8= ruleSkip | this_Tie_9= ruleTie | this_BeamStart_10= ruleBeamStart | this_BeamEnd_11= ruleBeamEnd | this_BarCheck_12= ruleBarCheck | this_Reference_13= ruleReference ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2637:1: (this_Note_0= ruleNote | this_Rest_1= ruleRest | this_Chord_2= ruleChord | this_KeySignature_3= ruleKeySignature | this_TimeSignature_4= ruleTimeSignature | this_Tempo_5= ruleTempo | this_Partial_6= rulePartial | this_Mark_7= ruleMark | this_Skip_8= ruleSkip | this_Tie_9= ruleTie | this_BeamStart_10= ruleBeamStart | this_BeamEnd_11= ruleBeamEnd | this_BarCheck_12= ruleBarCheck | this_Reference_13= ruleReference )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2637:1: (this_Note_0= ruleNote | this_Rest_1= ruleRest | this_Chord_2= ruleChord | this_KeySignature_3= ruleKeySignature | this_TimeSignature_4= ruleTimeSignature | this_Tempo_5= ruleTempo | this_Partial_6= rulePartial | this_Mark_7= ruleMark | this_Skip_8= ruleSkip | this_Tie_9= ruleTie | this_BeamStart_10= ruleBeamStart | this_BeamEnd_11= ruleBeamEnd | this_BarCheck_12= ruleBarCheck | this_Reference_13= ruleReference )
            int alt25=14;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA25_1 = input.LA(2);

                if ( (synpred57()) ) {
                    alt25=1;
                }
                else if ( (synpred58()) ) {
                    alt25=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2637:1: (this_Note_0= ruleNote | this_Rest_1= ruleRest | this_Chord_2= ruleChord | this_KeySignature_3= ruleKeySignature | this_TimeSignature_4= ruleTimeSignature | this_Tempo_5= ruleTempo | this_Partial_6= rulePartial | this_Mark_7= ruleMark | this_Skip_8= ruleSkip | this_Tie_9= ruleTie | this_BeamStart_10= ruleBeamStart | this_BeamEnd_11= ruleBeamEnd | this_BarCheck_12= ruleBarCheck | this_Reference_13= ruleReference )", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_13:
                {
                alt25=3;
                }
                break;
            case KEYWORD_40:
                {
                alt25=4;
                }
                break;
            case KEYWORD_50:
                {
                alt25=5;
                }
                break;
            case KEYWORD_56:
                {
                alt25=6;
                }
                break;
            case KEYWORD_70:
                {
                alt25=7;
                }
                break;
            case KEYWORD_44:
                {
                alt25=8;
                }
                break;
            case KEYWORD_49:
                {
                alt25=9;
                }
                break;
            case KEYWORD_39:
                {
                alt25=10;
                }
                break;
            case KEYWORD_36:
                {
                alt25=11;
                }
                break;
            case KEYWORD_38:
                {
                alt25=12;
                }
                break;
            case KEYWORD_23:
                {
                alt25=13;
                }
                break;
            case KEYWORD_18:
                {
                alt25=14;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2637:1: (this_Note_0= ruleNote | this_Rest_1= ruleRest | this_Chord_2= ruleChord | this_KeySignature_3= ruleKeySignature | this_TimeSignature_4= ruleTimeSignature | this_Tempo_5= ruleTempo | this_Partial_6= rulePartial | this_Mark_7= ruleMark | this_Skip_8= ruleSkip | this_Tie_9= ruleTie | this_BeamStart_10= ruleBeamStart | this_BeamEnd_11= ruleBeamEnd | this_BarCheck_12= ruleBarCheck | this_Reference_13= ruleReference )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2638:2: this_Note_0= ruleNote
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getNoteParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNote_in_ruleEvent5494);
                    this_Note_0=ruleNote();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Note_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2651:2: this_Rest_1= ruleRest
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getRestParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRest_in_ruleEvent5524);
                    this_Rest_1=ruleRest();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Rest_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2664:2: this_Chord_2= ruleChord
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getChordParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleChord_in_ruleEvent5554);
                    this_Chord_2=ruleChord();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Chord_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2677:2: this_KeySignature_3= ruleKeySignature
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getKeySignatureParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeySignature_in_ruleEvent5584);
                    this_KeySignature_3=ruleKeySignature();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_KeySignature_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2690:2: this_TimeSignature_4= ruleTimeSignature
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getTimeSignatureParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeSignature_in_ruleEvent5614);
                    this_TimeSignature_4=ruleTimeSignature();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_TimeSignature_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2703:2: this_Tempo_5= ruleTempo
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getTempoParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTempo_in_ruleEvent5644);
                    this_Tempo_5=ruleTempo();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Tempo_5;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2716:2: this_Partial_6= rulePartial
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getPartialParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePartial_in_ruleEvent5674);
                    this_Partial_6=rulePartial();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Partial_6;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2729:2: this_Mark_7= ruleMark
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getMarkParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMark_in_ruleEvent5704);
                    this_Mark_7=ruleMark();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Mark_7;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2742:2: this_Skip_8= ruleSkip
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getSkipParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSkip_in_ruleEvent5734);
                    this_Skip_8=ruleSkip();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Skip_8;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2755:2: this_Tie_9= ruleTie
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getTieParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTie_in_ruleEvent5764);
                    this_Tie_9=ruleTie();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Tie_9;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2768:2: this_BeamStart_10= ruleBeamStart
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getBeamStartParserRuleCall_10(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBeamStart_in_ruleEvent5794);
                    this_BeamStart_10=ruleBeamStart();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BeamStart_10;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2781:2: this_BeamEnd_11= ruleBeamEnd
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getBeamEndParserRuleCall_11(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBeamEnd_in_ruleEvent5824);
                    this_BeamEnd_11=ruleBeamEnd();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BeamEnd_11;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2794:2: this_BarCheck_12= ruleBarCheck
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getBarCheckParserRuleCall_12(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBarCheck_in_ruleEvent5854);
                    this_BarCheck_12=ruleBarCheck();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BarCheck_12;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2807:2: this_Reference_13= ruleReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventAccess().getReferenceParserRuleCall_13(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleEvent5884);
                    this_Reference_13=ruleReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Reference_13;
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
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleNote
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2826:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2827:2: (iv_ruleNote= ruleNote EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2828:2: iv_ruleNote= ruleNote EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNoteRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote5918);
            iv_ruleNote=ruleNote();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNote; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote5928); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNote


    // $ANTLR start ruleNote
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2835:1: ruleNote returns [EObject current=null] : ( ( (lv_pitch_0_0= rulePitch ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_rest_2_0= KEYWORD_48 ) )? ( (lv_postEvents_3_0= rulePostEvent ) )* ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_rest_2_0=null;
        EObject lv_pitch_0_0 = null;

        EObject lv_duration_1_0 = null;

        EObject lv_postEvents_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2840:6: ( ( ( (lv_pitch_0_0= rulePitch ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_rest_2_0= KEYWORD_48 ) )? ( (lv_postEvents_3_0= rulePostEvent ) )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2841:1: ( ( (lv_pitch_0_0= rulePitch ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_rest_2_0= KEYWORD_48 ) )? ( (lv_postEvents_3_0= rulePostEvent ) )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2841:1: ( ( (lv_pitch_0_0= rulePitch ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_rest_2_0= KEYWORD_48 ) )? ( (lv_postEvents_3_0= rulePostEvent ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2841:2: ( (lv_pitch_0_0= rulePitch ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_rest_2_0= KEYWORD_48 ) )? ( (lv_postEvents_3_0= rulePostEvent ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2841:2: ( (lv_pitch_0_0= rulePitch ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2842:1: (lv_pitch_0_0= rulePitch )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2842:1: (lv_pitch_0_0= rulePitch )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2843:3: lv_pitch_0_0= rulePitch
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNoteAccess().getPitchPitchParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePitch_in_ruleNote5974);
            lv_pitch_0_0=rulePitch();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNoteRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pitch",
              	        		lv_pitch_0_0, 
              	        		"Pitch", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2865:2: ( (lv_duration_1_0= ruleDuration ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2866:1: (lv_duration_1_0= ruleDuration )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2866:1: (lv_duration_1_0= ruleDuration )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2867:3: lv_duration_1_0= ruleDuration
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNoteAccess().getDurationDurationParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDuration_in_ruleNote5995);
                    lv_duration_1_0=ruleDuration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNoteRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"duration",
                      	        		lv_duration_1_0, 
                      	        		"Duration", 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2889:3: ( (lv_rest_2_0= KEYWORD_48 ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_48) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2890:1: (lv_rest_2_0= KEYWORD_48 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2890:1: (lv_rest_2_0= KEYWORD_48 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2891:3: lv_rest_2_0= KEYWORD_48
                    {
                    lv_rest_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleNote6015); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNoteAccess().getRestRestKeyword_2_0(), "rest"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNoteRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "rest", true, "\\rest", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2911:3: ( (lv_postEvents_3_0= rulePostEvent ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=KEYWORD_4 && LA28_0<=KEYWORD_5)||LA28_0==KEYWORD_9||LA28_0==KEYWORD_12||LA28_0==KEYWORD_17||(LA28_0>=KEYWORD_19 && LA28_0<=KEYWORD_21)||LA28_0==KEYWORD_25||(LA28_0>=KEYWORD_31 && LA28_0<=KEYWORD_35)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2912:1: (lv_postEvents_3_0= rulePostEvent )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2912:1: (lv_postEvents_3_0= rulePostEvent )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2913:3: lv_postEvents_3_0= rulePostEvent
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getNoteAccess().getPostEventsPostEventParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePostEvent_in_ruleNote6050);
            	    lv_postEvents_3_0=rulePostEvent();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getNoteRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"postEvents",
            	      	        		lv_postEvents_3_0, 
            	      	        		"PostEvent", 
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
            	    break loop28;
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
        }
        return current;
    }
    // $ANTLR end ruleNote


    // $ANTLR start entryRulePitch
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2943:1: entryRulePitch returns [EObject current=null] : iv_rulePitch= rulePitch EOF ;
    public final EObject entryRulePitch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePitch = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2944:2: (iv_rulePitch= rulePitch EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2945:2: iv_rulePitch= rulePitch EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPitchRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePitch_in_entryRulePitch6086);
            iv_rulePitch=rulePitch();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePitch6096); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2952:1: rulePitch returns [EObject current=null] : ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_14 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_16 ) )? ) ;
    public final EObject rulePitch() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token lv_octaveCheck_1_0=null;
        Token lv_reminderAccidental_3_0=null;
        Token lv_cautionaryAccidental_4_0=null;
        EObject lv_octaveShift_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2957:6: ( ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_14 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_16 ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2958:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_14 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_16 ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2958:1: ( ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_14 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_16 ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2958:2: ( (lv_base_0_0= RULE_ID ) ) ( (lv_octaveCheck_1_0= KEYWORD_14 ) )? ( (lv_octaveShift_2_0= ruleOctave ) )? ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )? ( (lv_cautionaryAccidental_4_0= KEYWORD_16 ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2958:2: ( (lv_base_0_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2959:1: (lv_base_0_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2959:1: (lv_base_0_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2960:3: lv_base_0_0= RULE_ID
            {
            lv_base_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePitch6138); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2982:2: ( (lv_octaveCheck_1_0= KEYWORD_14 ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2983:1: (lv_octaveCheck_1_0= KEYWORD_14 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2983:1: (lv_octaveCheck_1_0= KEYWORD_14 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2984:3: lv_octaveCheck_1_0= KEYWORD_14
                    {
                    lv_octaveCheck_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rulePitch6162); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3004:3: ( (lv_octaveShift_2_0= ruleOctave ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_3||LA30_0==KEYWORD_8) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3005:1: (lv_octaveShift_2_0= ruleOctave )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3005:1: (lv_octaveShift_2_0= ruleOctave )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3006:3: lv_octaveShift_2_0= ruleOctave
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPitchAccess().getOctaveShiftOctaveParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOctave_in_rulePitch6197);
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3028:3: ( (lv_reminderAccidental_3_0= KEYWORD_1 ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3029:1: (lv_reminderAccidental_3_0= KEYWORD_1 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3029:1: (lv_reminderAccidental_3_0= KEYWORD_1 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3030:3: lv_reminderAccidental_3_0= KEYWORD_1
                    {
                    lv_reminderAccidental_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePitch6217); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3050:3: ( (lv_cautionaryAccidental_4_0= KEYWORD_16 ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3051:1: (lv_cautionaryAccidental_4_0= KEYWORD_16 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3051:1: (lv_cautionaryAccidental_4_0= KEYWORD_16 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3052:3: lv_cautionaryAccidental_4_0= KEYWORD_16
                    {
                    lv_cautionaryAccidental_4_0=(Token)input.LT(1);
                    match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rulePitch6250); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3080:1: entryRuleOctave returns [EObject current=null] : iv_ruleOctave= ruleOctave EOF ;
    public final EObject entryRuleOctave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctave = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3081:2: (iv_ruleOctave= ruleOctave EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3082:2: iv_ruleOctave= ruleOctave EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOctaveRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOctave_in_entryRuleOctave6299);
            iv_ruleOctave=ruleOctave();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOctave; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOctave6309); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3089:1: ruleOctave returns [EObject current=null] : ( ( (lv_up_0_0= KEYWORD_3 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ ) ;
    public final EObject ruleOctave() throws RecognitionException {
        EObject current = null;

        Token lv_up_0_0=null;
        Token lv_down_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3094:6: ( ( ( (lv_up_0_0= KEYWORD_3 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3095:1: ( ( (lv_up_0_0= KEYWORD_3 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3095:1: ( ( (lv_up_0_0= KEYWORD_3 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_3) ) {
                alt35=1;
            }
            else if ( (LA35_0==KEYWORD_8) ) {
                alt35=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3095:1: ( ( (lv_up_0_0= KEYWORD_3 ) )+ | ( (lv_down_1_0= KEYWORD_8 ) )+ )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3095:2: ( (lv_up_0_0= KEYWORD_3 ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3095:2: ( (lv_up_0_0= KEYWORD_3 ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==KEYWORD_3) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3096:1: (lv_up_0_0= KEYWORD_3 )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3096:1: (lv_up_0_0= KEYWORD_3 )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3097:3: lv_up_0_0= KEYWORD_3
                    	    {
                    	    lv_up_0_0=(Token)input.LT(1);
                    	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleOctave6353); if (failed) return current;
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
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3118:6: ( (lv_down_1_0= KEYWORD_8 ) )+
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3118:6: ( (lv_down_1_0= KEYWORD_8 ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==KEYWORD_8) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3119:1: (lv_down_1_0= KEYWORD_8 )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3119:1: (lv_down_1_0= KEYWORD_8 )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3120:3: lv_down_1_0= KEYWORD_8
                    	    {
                    	    lv_down_1_0=(Token)input.LT(1);
                    	    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOctave6392); if (failed) return current;
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
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
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


    // $ANTLR start entryRuleRest
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3148:1: entryRuleRest returns [EObject current=null] : iv_ruleRest= ruleRest EOF ;
    public final EObject entryRuleRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRest = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3149:2: (iv_ruleRest= ruleRest EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3150:2: iv_ruleRest= ruleRest EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRestRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRest_in_entryRuleRest6441);
            iv_ruleRest=ruleRest();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRest; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRest6451); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRest


    // $ANTLR start ruleRest
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3157:1: ruleRest returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_postEvents_2_0= rulePostEvent ) )* ) ;
    public final EObject ruleRest() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        EObject lv_duration_1_0 = null;

        EObject lv_postEvents_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3162:6: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_postEvents_2_0= rulePostEvent ) )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3163:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_postEvents_2_0= rulePostEvent ) )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3163:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_postEvents_2_0= rulePostEvent ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3163:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_duration_1_0= ruleDuration ) )? ( (lv_postEvents_2_0= rulePostEvent ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3163:2: ( (lv_type_0_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3164:1: (lv_type_0_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3164:1: (lv_type_0_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3165:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRest6493); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getRestAccess().getTypeIDTerminalRuleCall_0_0(), "type"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRestRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3187:2: ( (lv_duration_1_0= ruleDuration ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3188:1: (lv_duration_1_0= ruleDuration )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3188:1: (lv_duration_1_0= ruleDuration )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3189:3: lv_duration_1_0= ruleDuration
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRestAccess().getDurationDurationParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDuration_in_ruleRest6519);
                    lv_duration_1_0=ruleDuration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRestRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"duration",
                      	        		lv_duration_1_0, 
                      	        		"Duration", 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3211:3: ( (lv_postEvents_2_0= rulePostEvent ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=KEYWORD_4 && LA37_0<=KEYWORD_5)||LA37_0==KEYWORD_9||LA37_0==KEYWORD_12||LA37_0==KEYWORD_17||(LA37_0>=KEYWORD_19 && LA37_0<=KEYWORD_21)||LA37_0==KEYWORD_25||(LA37_0>=KEYWORD_31 && LA37_0<=KEYWORD_35)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3212:1: (lv_postEvents_2_0= rulePostEvent )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3212:1: (lv_postEvents_2_0= rulePostEvent )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3213:3: lv_postEvents_2_0= rulePostEvent
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRestAccess().getPostEventsPostEventParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePostEvent_in_ruleRest6541);
            	    lv_postEvents_2_0=rulePostEvent();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRestRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"postEvents",
            	      	        		lv_postEvents_2_0, 
            	      	        		"PostEvent", 
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
            	    break loop37;
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
        }
        return current;
    }
    // $ANTLR end ruleRest


    // $ANTLR start entryRuleChord
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3243:1: entryRuleChord returns [EObject current=null] : iv_ruleChord= ruleChord EOF ;
    public final EObject entryRuleChord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChord = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3244:2: (iv_ruleChord= ruleChord EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3245:2: iv_ruleChord= ruleChord EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getChordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord6577);
            iv_ruleChord=ruleChord();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleChord; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord6587); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleChord


    // $ANTLR start ruleChord
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3252:1: ruleChord returns [EObject current=null] : ( () KEYWORD_13 ( (lv_notes_2_0= ruleNote ) )* KEYWORD_15 ( (lv_duration_4_0= ruleDuration ) )? ( (lv_postEvents_5_0= rulePostEvent ) )* ) ;
    public final EObject ruleChord() throws RecognitionException {
        EObject current = null;

        EObject lv_notes_2_0 = null;

        EObject lv_duration_4_0 = null;

        EObject lv_postEvents_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3257:6: ( ( () KEYWORD_13 ( (lv_notes_2_0= ruleNote ) )* KEYWORD_15 ( (lv_duration_4_0= ruleDuration ) )? ( (lv_postEvents_5_0= rulePostEvent ) )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3258:1: ( () KEYWORD_13 ( (lv_notes_2_0= ruleNote ) )* KEYWORD_15 ( (lv_duration_4_0= ruleDuration ) )? ( (lv_postEvents_5_0= rulePostEvent ) )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3258:1: ( () KEYWORD_13 ( (lv_notes_2_0= ruleNote ) )* KEYWORD_15 ( (lv_duration_4_0= ruleDuration ) )? ( (lv_postEvents_5_0= rulePostEvent ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3258:2: () KEYWORD_13 ( (lv_notes_2_0= ruleNote ) )* KEYWORD_15 ( (lv_duration_4_0= ruleDuration ) )? ( (lv_postEvents_5_0= rulePostEvent ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3258:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3259:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getChordAccess().getChordAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getChordAccess().getChordAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleChord6635); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getChordAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3277:1: ( (lv_notes_2_0= ruleNote ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3278:1: (lv_notes_2_0= ruleNote )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3278:1: (lv_notes_2_0= ruleNote )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3279:3: lv_notes_2_0= ruleNote
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getChordAccess().getNotesNoteParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNote_in_ruleChord6656);
            	    lv_notes_2_0=ruleNote();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getChordRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"notes",
            	      	        		lv_notes_2_0, 
            	      	        		"Note", 
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
            	    break loop38;
                }
            } while (true);

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleChord6668); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getChordAccess().getGreaterThanSignKeyword_3(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3306:1: ( (lv_duration_4_0= ruleDuration ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3307:1: (lv_duration_4_0= ruleDuration )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3307:1: (lv_duration_4_0= ruleDuration )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3308:3: lv_duration_4_0= ruleDuration
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChordAccess().getDurationDurationParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDuration_in_ruleChord6689);
                    lv_duration_4_0=ruleDuration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChordRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"duration",
                      	        		lv_duration_4_0, 
                      	        		"Duration", 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3330:3: ( (lv_postEvents_5_0= rulePostEvent ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=KEYWORD_4 && LA40_0<=KEYWORD_5)||LA40_0==KEYWORD_9||LA40_0==KEYWORD_12||LA40_0==KEYWORD_17||(LA40_0>=KEYWORD_19 && LA40_0<=KEYWORD_21)||LA40_0==KEYWORD_25||(LA40_0>=KEYWORD_31 && LA40_0<=KEYWORD_35)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3331:1: (lv_postEvents_5_0= rulePostEvent )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3331:1: (lv_postEvents_5_0= rulePostEvent )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3332:3: lv_postEvents_5_0= rulePostEvent
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getChordAccess().getPostEventsPostEventParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePostEvent_in_ruleChord6711);
            	    lv_postEvents_5_0=rulePostEvent();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getChordRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"postEvents",
            	      	        		lv_postEvents_5_0, 
            	      	        		"PostEvent", 
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
            	    break loop40;
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
        }
        return current;
    }
    // $ANTLR end ruleChord


    // $ANTLR start entryRulePostEvent
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3362:1: entryRulePostEvent returns [EObject current=null] : iv_rulePostEvent= rulePostEvent EOF ;
    public final EObject entryRulePostEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostEvent = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3363:2: (iv_rulePostEvent= rulePostEvent EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3364:2: iv_rulePostEvent= rulePostEvent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPostEventRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePostEvent_in_entryRulePostEvent6747);
            iv_rulePostEvent=rulePostEvent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePostEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostEvent6757); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePostEvent


    // $ANTLR start rulePostEvent
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3371:1: rulePostEvent returns [EObject current=null] : ( ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) ) | ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) ) | ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) ) ) ;
    public final EObject rulePostEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_musicFunction_1_0 = null;

        Enumerator lv_direction_2_0 = null;

        EObject lv_event_3_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_event_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3376:6: ( ( ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) ) | ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) ) | ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3377:1: ( ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) ) | ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) ) | ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3377:1: ( ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) ) | ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) ) | ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case KEYWORD_9:
                {
                switch ( input.LA(2) ) {
                case KEYWORD_18:
                    {
                    alt42=1;
                    }
                    break;
                case KEYWORD_4:
                case KEYWORD_5:
                case KEYWORD_12:
                case KEYWORD_17:
                case KEYWORD_19:
                case KEYWORD_25:
                case KEYWORD_31:
                case KEYWORD_32:
                case KEYWORD_33:
                case KEYWORD_34:
                case KEYWORD_35:
                    {
                    alt42=3;
                    }
                    break;
                case KEYWORD_7:
                case KEYWORD_9:
                case KEYWORD_10:
                case KEYWORD_15:
                case KEYWORD_20:
                case KEYWORD_21:
                case KEYWORD_23:
                case KEYWORD_62:
                case RULE_STRING:
                case RULE_INT:
                    {
                    alt42=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3377:1: ( ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) ) | ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) ) | ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) ) )", 42, 1, input);

                    throw nvae;
                }

                }
                break;
            case KEYWORD_20:
                {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==KEYWORD_7||(LA42_2>=KEYWORD_9 && LA42_2<=KEYWORD_10)||LA42_2==KEYWORD_15||(LA42_2>=KEYWORD_20 && LA42_2<=KEYWORD_21)||LA42_2==KEYWORD_23||LA42_2==KEYWORD_62||(LA42_2>=RULE_STRING && LA42_2<=RULE_INT)) ) {
                    alt42=2;
                }
                else if ( ((LA42_2>=KEYWORD_4 && LA42_2<=KEYWORD_5)||LA42_2==KEYWORD_12||LA42_2==KEYWORD_17||LA42_2==KEYWORD_19||LA42_2==KEYWORD_25||(LA42_2>=KEYWORD_31 && LA42_2<=KEYWORD_35)) ) {
                    alt42=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3377:1: ( ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) ) | ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) ) | ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) ) )", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_21:
                {
                int LA42_3 = input.LA(2);

                if ( (LA42_3==KEYWORD_7||(LA42_3>=KEYWORD_9 && LA42_3<=KEYWORD_10)||LA42_3==KEYWORD_15||(LA42_3>=KEYWORD_20 && LA42_3<=KEYWORD_21)||LA42_3==KEYWORD_23||LA42_3==KEYWORD_62||(LA42_3>=RULE_STRING && LA42_3<=RULE_INT)) ) {
                    alt42=2;
                }
                else if ( ((LA42_3>=KEYWORD_4 && LA42_3<=KEYWORD_5)||LA42_3==KEYWORD_12||LA42_3==KEYWORD_17||LA42_3==KEYWORD_19||LA42_3==KEYWORD_25||(LA42_3>=KEYWORD_31 && LA42_3<=KEYWORD_35)) ) {
                    alt42=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3377:1: ( ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) ) | ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) ) | ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) ) )", 42, 3, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_4:
            case KEYWORD_5:
            case KEYWORD_12:
            case KEYWORD_17:
            case KEYWORD_19:
            case KEYWORD_25:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
                {
                alt42=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3377:1: ( ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) ) | ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) ) | ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) ) )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3377:2: ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3377:2: ( KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3378:2: KEYWORD_9 ( (lv_musicFunction_1_0= ruleReference ) )
                    {
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePostEvent6794); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPostEventAccess().getHyphenMinusKeyword_0_0(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3382:1: ( (lv_musicFunction_1_0= ruleReference ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3383:1: (lv_musicFunction_1_0= ruleReference )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3383:1: (lv_musicFunction_1_0= ruleReference )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3384:3: lv_musicFunction_1_0= ruleReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPostEventAccess().getMusicFunctionReferenceParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_rulePostEvent6815);
                    lv_musicFunction_1_0=ruleReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPostEventRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"musicFunction",
                      	        		lv_musicFunction_1_0, 
                      	        		"Reference", 
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
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3407:6: ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3407:6: ( ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3407:7: ( (lv_direction_2_0= ruleDirection ) ) ( (lv_event_3_0= ruleEventWithRequiredDirection ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3407:7: ( (lv_direction_2_0= ruleDirection ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3408:1: (lv_direction_2_0= ruleDirection )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3408:1: (lv_direction_2_0= ruleDirection )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3409:3: lv_direction_2_0= ruleDirection
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPostEventAccess().getDirectionDirectionEnumRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_rulePostEvent6844);
                    lv_direction_2_0=ruleDirection();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPostEventRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"direction",
                      	        		lv_direction_2_0, 
                      	        		"Direction", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3431:2: ( (lv_event_3_0= ruleEventWithRequiredDirection ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3432:1: (lv_event_3_0= ruleEventWithRequiredDirection )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3432:1: (lv_event_3_0= ruleEventWithRequiredDirection )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3433:3: lv_event_3_0= ruleEventWithRequiredDirection
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPostEventAccess().getEventEventWithRequiredDirectionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventWithRequiredDirection_in_rulePostEvent6865);
                    lv_event_3_0=ruleEventWithRequiredDirection();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPostEventRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"event",
                      	        		lv_event_3_0, 
                      	        		"EventWithRequiredDirection", 
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
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3456:6: ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3456:6: ( ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3456:7: ( (lv_direction_4_0= ruleDirection ) )? ( (lv_event_5_0= ruleEventWithOptionalDirection ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3456:7: ( (lv_direction_4_0= ruleDirection ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==KEYWORD_9||(LA41_0>=KEYWORD_20 && LA41_0<=KEYWORD_21)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3457:1: (lv_direction_4_0= ruleDirection )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3457:1: (lv_direction_4_0= ruleDirection )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3458:3: lv_direction_4_0= ruleDirection
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPostEventAccess().getDirectionDirectionEnumRuleCall_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDirection_in_rulePostEvent6894);
                            lv_direction_4_0=ruleDirection();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getPostEventRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"direction",
                              	        		lv_direction_4_0, 
                              	        		"Direction", 
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

                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3480:3: ( (lv_event_5_0= ruleEventWithOptionalDirection ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3481:1: (lv_event_5_0= ruleEventWithOptionalDirection )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3481:1: (lv_event_5_0= ruleEventWithOptionalDirection )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3482:3: lv_event_5_0= ruleEventWithOptionalDirection
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPostEventAccess().getEventEventWithOptionalDirectionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventWithOptionalDirection_in_rulePostEvent6916);
                    lv_event_5_0=ruleEventWithOptionalDirection();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPostEventRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"event",
                      	        		lv_event_5_0, 
                      	        		"EventWithOptionalDirection", 
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
    // $ANTLR end rulePostEvent


    // $ANTLR start entryRuleEventWithRequiredDirection
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3512:1: entryRuleEventWithRequiredDirection returns [EObject current=null] : iv_ruleEventWithRequiredDirection= ruleEventWithRequiredDirection EOF ;
    public final EObject entryRuleEventWithRequiredDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventWithRequiredDirection = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3513:2: (iv_ruleEventWithRequiredDirection= ruleEventWithRequiredDirection EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3514:2: iv_ruleEventWithRequiredDirection= ruleEventWithRequiredDirection EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEventWithRequiredDirectionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEventWithRequiredDirection_in_entryRuleEventWithRequiredDirection6952);
            iv_ruleEventWithRequiredDirection=ruleEventWithRequiredDirection();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEventWithRequiredDirection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventWithRequiredDirection6962); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEventWithRequiredDirection


    // $ANTLR start ruleEventWithRequiredDirection
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3521:1: ruleEventWithRequiredDirection returns [EObject current=null] : ( ( (lv_script_0_0= ruleScriptWithRequiredDirection ) ) | this_GenTextDef_1= ruleGenTextDef ) ;
    public final EObject ruleEventWithRequiredDirection() throws RecognitionException {
        EObject current = null;

        Enumerator lv_script_0_0 = null;

        EObject this_GenTextDef_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3526:6: ( ( ( (lv_script_0_0= ruleScriptWithRequiredDirection ) ) | this_GenTextDef_1= ruleGenTextDef ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3527:1: ( ( (lv_script_0_0= ruleScriptWithRequiredDirection ) ) | this_GenTextDef_1= ruleGenTextDef )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3527:1: ( ( (lv_script_0_0= ruleScriptWithRequiredDirection ) ) | this_GenTextDef_1= ruleGenTextDef )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_7||(LA43_0>=KEYWORD_9 && LA43_0<=KEYWORD_10)||LA43_0==KEYWORD_15||(LA43_0>=KEYWORD_20 && LA43_0<=KEYWORD_21)||LA43_0==KEYWORD_23) ) {
                alt43=1;
            }
            else if ( (LA43_0==KEYWORD_62||(LA43_0>=RULE_STRING && LA43_0<=RULE_INT)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3527:1: ( ( (lv_script_0_0= ruleScriptWithRequiredDirection ) ) | this_GenTextDef_1= ruleGenTextDef )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3527:2: ( (lv_script_0_0= ruleScriptWithRequiredDirection ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3527:2: ( (lv_script_0_0= ruleScriptWithRequiredDirection ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3528:1: (lv_script_0_0= ruleScriptWithRequiredDirection )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3528:1: (lv_script_0_0= ruleScriptWithRequiredDirection )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3529:3: lv_script_0_0= ruleScriptWithRequiredDirection
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEventWithRequiredDirectionAccess().getScriptScriptWithRequiredDirectionEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScriptWithRequiredDirection_in_ruleEventWithRequiredDirection7008);
                    lv_script_0_0=ruleScriptWithRequiredDirection();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEventWithRequiredDirectionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"script",
                      	        		lv_script_0_0, 
                      	        		"ScriptWithRequiredDirection", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3553:2: this_GenTextDef_1= ruleGenTextDef
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventWithRequiredDirectionAccess().getGenTextDefParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenTextDef_in_ruleEventWithRequiredDirection7039);
                    this_GenTextDef_1=ruleGenTextDef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_GenTextDef_1;
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
    // $ANTLR end ruleEventWithRequiredDirection


    // $ANTLR start entryRuleGenTextDef
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3572:1: entryRuleGenTextDef returns [EObject current=null] : iv_ruleGenTextDef= ruleGenTextDef EOF ;
    public final EObject entryRuleGenTextDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenTextDef = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3573:2: (iv_ruleGenTextDef= ruleGenTextDef EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3574:2: iv_ruleGenTextDef= ruleGenTextDef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGenTextDefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGenTextDef_in_entryRuleGenTextDef7073);
            iv_ruleGenTextDef=ruleGenTextDef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGenTextDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenTextDef7083); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGenTextDef


    // $ANTLR start ruleGenTextDef
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3581:1: ruleGenTextDef returns [EObject current=null] : (this_Markup_0= ruleMarkup | RULE_STRING | RULE_INT ) ;
    public final EObject ruleGenTextDef() throws RecognitionException {
        EObject current = null;

        EObject this_Markup_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3586:6: ( (this_Markup_0= ruleMarkup | RULE_STRING | RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3587:1: (this_Markup_0= ruleMarkup | RULE_STRING | RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3587:1: (this_Markup_0= ruleMarkup | RULE_STRING | RULE_INT )
            int alt44=3;
            switch ( input.LA(1) ) {
            case KEYWORD_62:
                {
                alt44=1;
                }
                break;
            case RULE_STRING:
                {
                alt44=2;
                }
                break;
            case RULE_INT:
                {
                alt44=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3587:1: (this_Markup_0= ruleMarkup | RULE_STRING | RULE_INT )", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3588:2: this_Markup_0= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGenTextDefAccess().getMarkupParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleGenTextDef7133);
                    this_Markup_0=ruleMarkup();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Markup_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3600:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenTextDef7147); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getGenTextDefAccess().getSTRINGTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3605:6: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGenTextDef7161); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getGenTextDefAccess().getINTTerminalRuleCall_2(), null); 
                          
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
    // $ANTLR end ruleGenTextDef


    // $ANTLR start entryRuleEventWithOptionalDirection
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3617:1: entryRuleEventWithOptionalDirection returns [EObject current=null] : iv_ruleEventWithOptionalDirection= ruleEventWithOptionalDirection EOF ;
    public final EObject entryRuleEventWithOptionalDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventWithOptionalDirection = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3618:2: (iv_ruleEventWithOptionalDirection= ruleEventWithOptionalDirection EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3619:2: iv_ruleEventWithOptionalDirection= ruleEventWithOptionalDirection EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEventWithOptionalDirectionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEventWithOptionalDirection_in_entryRuleEventWithOptionalDirection7195);
            iv_ruleEventWithOptionalDirection=ruleEventWithOptionalDirection();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEventWithOptionalDirection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventWithOptionalDirection7205); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEventWithOptionalDirection


    // $ANTLR start ruleEventWithOptionalDirection
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3626:1: ruleEventWithOptionalDirection returns [EObject current=null] : ( ( (lv_script_0_0= ruleScriptWithOptionalDirection ) ) | this_Tremolo_1= ruleTremolo ) ;
    public final EObject ruleEventWithOptionalDirection() throws RecognitionException {
        EObject current = null;

        Enumerator lv_script_0_0 = null;

        EObject this_Tremolo_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3631:6: ( ( ( (lv_script_0_0= ruleScriptWithOptionalDirection ) ) | this_Tremolo_1= ruleTremolo ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3632:1: ( ( (lv_script_0_0= ruleScriptWithOptionalDirection ) ) | this_Tremolo_1= ruleTremolo )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3632:1: ( ( (lv_script_0_0= ruleScriptWithOptionalDirection ) ) | this_Tremolo_1= ruleTremolo )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=KEYWORD_4 && LA45_0<=KEYWORD_5)||LA45_0==KEYWORD_17||LA45_0==KEYWORD_19||LA45_0==KEYWORD_25||(LA45_0>=KEYWORD_31 && LA45_0<=KEYWORD_35)) ) {
                alt45=1;
            }
            else if ( (LA45_0==KEYWORD_12) ) {
                alt45=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3632:1: ( ( (lv_script_0_0= ruleScriptWithOptionalDirection ) ) | this_Tremolo_1= ruleTremolo )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3632:2: ( (lv_script_0_0= ruleScriptWithOptionalDirection ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3632:2: ( (lv_script_0_0= ruleScriptWithOptionalDirection ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3633:1: (lv_script_0_0= ruleScriptWithOptionalDirection )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3633:1: (lv_script_0_0= ruleScriptWithOptionalDirection )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3634:3: lv_script_0_0= ruleScriptWithOptionalDirection
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEventWithOptionalDirectionAccess().getScriptScriptWithOptionalDirectionEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScriptWithOptionalDirection_in_ruleEventWithOptionalDirection7251);
                    lv_script_0_0=ruleScriptWithOptionalDirection();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEventWithOptionalDirectionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"script",
                      	        		lv_script_0_0, 
                      	        		"ScriptWithOptionalDirection", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3658:2: this_Tremolo_1= ruleTremolo
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEventWithOptionalDirectionAccess().getTremoloParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTremolo_in_ruleEventWithOptionalDirection7282);
                    this_Tremolo_1=ruleTremolo();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Tremolo_1;
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
    // $ANTLR end ruleEventWithOptionalDirection


    // $ANTLR start entryRuleTremolo
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3677:1: entryRuleTremolo returns [EObject current=null] : iv_ruleTremolo= ruleTremolo EOF ;
    public final EObject entryRuleTremolo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTremolo = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3678:2: (iv_ruleTremolo= ruleTremolo EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3679:2: iv_ruleTremolo= ruleTremolo EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTremoloRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTremolo_in_entryRuleTremolo7316);
            iv_ruleTremolo=ruleTremolo();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTremolo; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTremolo7326); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTremolo


    // $ANTLR start ruleTremolo
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3686:1: ruleTremolo returns [EObject current=null] : ( () KEYWORD_12 ( (lv_division_2_0= RULE_INT ) )? ) ;
    public final EObject ruleTremolo() throws RecognitionException {
        EObject current = null;

        Token lv_division_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3691:6: ( ( () KEYWORD_12 ( (lv_division_2_0= RULE_INT ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3692:1: ( () KEYWORD_12 ( (lv_division_2_0= RULE_INT ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3692:1: ( () KEYWORD_12 ( (lv_division_2_0= RULE_INT ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3692:2: () KEYWORD_12 ( (lv_division_2_0= RULE_INT ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3692:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3693:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getTremoloAccess().getTremoloAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getTremoloAccess().getTremoloAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleTremolo7374); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTremoloAccess().getColonKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3711:1: ( (lv_division_2_0= RULE_INT ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3712:1: (lv_division_2_0= RULE_INT )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3712:1: (lv_division_2_0= RULE_INT )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3713:3: lv_division_2_0= RULE_INT
                    {
                    lv_division_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTremolo7391); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTremoloAccess().getDivisionINTTerminalRuleCall_2_0(), "division"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTremoloRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"division",
                      	        		lv_division_2_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
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
    // $ANTLR end ruleTremolo


    // $ANTLR start entryRuleKeySignature
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3743:1: entryRuleKeySignature returns [EObject current=null] : iv_ruleKeySignature= ruleKeySignature EOF ;
    public final EObject entryRuleKeySignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeySignature = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3744:2: (iv_ruleKeySignature= ruleKeySignature EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3745:2: iv_ruleKeySignature= ruleKeySignature EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeySignatureRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleKeySignature_in_entryRuleKeySignature7432);
            iv_ruleKeySignature=ruleKeySignature();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeySignature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeySignature7442); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleKeySignature


    // $ANTLR start ruleKeySignature
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3752:1: ruleKeySignature returns [EObject current=null] : ( KEYWORD_40 ( ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) ) | ( (lv_default_3_0= KEYWORD_68 ) ) ) ) ;
    public final EObject ruleKeySignature() throws RecognitionException {
        EObject current = null;

        Token lv_tonic_1_0=null;
        Token lv_default_3_0=null;
        EObject lv_mode_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3757:6: ( ( KEYWORD_40 ( ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) ) | ( (lv_default_3_0= KEYWORD_68 ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3758:1: ( KEYWORD_40 ( ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) ) | ( (lv_default_3_0= KEYWORD_68 ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3758:1: ( KEYWORD_40 ( ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) ) | ( (lv_default_3_0= KEYWORD_68 ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3759:2: KEYWORD_40 ( ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) ) | ( (lv_default_3_0= KEYWORD_68 ) ) )
            {
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleKeySignature7478); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeySignatureAccess().getKeyKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3763:1: ( ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) ) | ( (lv_default_3_0= KEYWORD_68 ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==KEYWORD_68) ) {
                alt47=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3763:1: ( ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) ) | ( (lv_default_3_0= KEYWORD_68 ) ) )", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3763:2: ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3763:2: ( ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3763:3: ( (lv_tonic_1_0= RULE_ID ) ) ( (lv_mode_2_0= ruleReference ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3763:3: ( (lv_tonic_1_0= RULE_ID ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3764:1: (lv_tonic_1_0= RULE_ID )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3764:1: (lv_tonic_1_0= RULE_ID )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3765:3: lv_tonic_1_0= RULE_ID
                    {
                    lv_tonic_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeySignature7497); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getKeySignatureAccess().getTonicIDTerminalRuleCall_1_0_0_0(), "tonic"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getKeySignatureRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"tonic",
                      	        		lv_tonic_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3787:2: ( (lv_mode_2_0= ruleReference ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3788:1: (lv_mode_2_0= ruleReference )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3788:1: (lv_mode_2_0= ruleReference )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3789:3: lv_mode_2_0= ruleReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getKeySignatureAccess().getModeReferenceParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleKeySignature7523);
                    lv_mode_2_0=ruleReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getKeySignatureRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"mode",
                      	        		lv_mode_2_0, 
                      	        		"Reference", 
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
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3812:6: ( (lv_default_3_0= KEYWORD_68 ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3812:6: ( (lv_default_3_0= KEYWORD_68 ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3813:1: (lv_default_3_0= KEYWORD_68 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3813:1: (lv_default_3_0= KEYWORD_68 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3814:3: lv_default_3_0= KEYWORD_68
                    {
                    lv_default_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleKeySignature7549); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeySignatureAccess().getDefaultDefaultKeyword_1_1_0(), "default"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getKeySignatureRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "default", true, "\\default", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
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
    // $ANTLR end ruleKeySignature


    // $ANTLR start entryRuleTimeSignature
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3842:1: entryRuleTimeSignature returns [EObject current=null] : iv_ruleTimeSignature= ruleTimeSignature EOF ;
    public final EObject entryRuleTimeSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSignature = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3843:2: (iv_ruleTimeSignature= ruleTimeSignature EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3844:2: iv_ruleTimeSignature= ruleTimeSignature EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTimeSignatureRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTimeSignature_in_entryRuleTimeSignature7598);
            iv_ruleTimeSignature=ruleTimeSignature();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTimeSignature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeSignature7608); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTimeSignature


    // $ANTLR start ruleTimeSignature
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3851:1: ruleTimeSignature returns [EObject current=null] : ( KEYWORD_50 ( (lv_fraction_1_0= ruleFraction ) ) ) ;
    public final EObject ruleTimeSignature() throws RecognitionException {
        EObject current = null;

        EObject lv_fraction_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3856:6: ( ( KEYWORD_50 ( (lv_fraction_1_0= ruleFraction ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3857:1: ( KEYWORD_50 ( (lv_fraction_1_0= ruleFraction ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3857:1: ( KEYWORD_50 ( (lv_fraction_1_0= ruleFraction ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3858:2: KEYWORD_50 ( (lv_fraction_1_0= ruleFraction ) )
            {
            match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleTimeSignature7644); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTimeSignatureAccess().getTimeKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3862:1: ( (lv_fraction_1_0= ruleFraction ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3863:1: (lv_fraction_1_0= ruleFraction )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3863:1: (lv_fraction_1_0= ruleFraction )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3864:3: lv_fraction_1_0= ruleFraction
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTimeSignatureAccess().getFractionFractionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFraction_in_ruleTimeSignature7665);
            lv_fraction_1_0=ruleFraction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTimeSignatureRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"fraction",
              	        		lv_fraction_1_0, 
              	        		"Fraction", 
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
    // $ANTLR end ruleTimeSignature


    // $ANTLR start entryRuleTempo
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3894:1: entryRuleTempo returns [EObject current=null] : iv_ruleTempo= ruleTempo EOF ;
    public final EObject entryRuleTempo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempo = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3895:2: (iv_ruleTempo= ruleTempo EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3896:2: iv_ruleTempo= ruleTempo EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTempoRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTempo_in_entryRuleTempo7700);
            iv_ruleTempo=ruleTempo();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTempo; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTempo7710); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTempo


    // $ANTLR start ruleTempo
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3903:1: ruleTempo returns [EObject current=null] : ( KEYWORD_56 ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) ) ) ;
    public final EObject ruleTempo() throws RecognitionException {
        EObject current = null;

        EObject lv_label_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_label_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3908:6: ( ( KEYWORD_56 ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3909:1: ( KEYWORD_56 ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3909:1: ( KEYWORD_56 ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3910:2: KEYWORD_56 ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) )
            {
            match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleTempo7746); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTempoAccess().getTempoKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3914:1: ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) )
            int alt49=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==EOF||LA49_1==KEYWORD_2||LA49_1==KEYWORD_13||LA49_1==KEYWORD_18||(LA49_1>=KEYWORD_22 && LA49_1<=KEYWORD_24)||(LA49_1>=KEYWORD_29 && LA49_1<=KEYWORD_30)||LA49_1==KEYWORD_36||(LA49_1>=KEYWORD_38 && LA49_1<=KEYWORD_45)||LA49_1==KEYWORD_47||(LA49_1>=KEYWORD_49 && LA49_1<=KEYWORD_50)||(LA49_1>=KEYWORD_54 && LA49_1<=KEYWORD_58)||(LA49_1>=KEYWORD_60 && LA49_1<=KEYWORD_62)||(LA49_1>=KEYWORD_64 && LA49_1<=KEYWORD_65)||LA49_1==KEYWORD_67||(LA49_1>=KEYWORD_69 && LA49_1<=KEYWORD_72)||(LA49_1>=KEYWORD_74 && LA49_1<=KEYWORD_77)||LA49_1==KEYWORD_79||(LA49_1>=KEYWORD_81 && LA49_1<=KEYWORD_83)||LA49_1==RULE_STRING||LA49_1==RULE_ID) ) {
                    alt49=2;
                }
                else if ( (LA49_1==RULE_INT) ) {
                    alt49=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3914:1: ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) )", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_62:
                {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==KEYWORD_22) ) {
                    int LA49_5 = input.LA(3);

                    if ( (LA49_5==KEYWORD_24) ) {
                        int LA49_6 = input.LA(4);

                        if ( (LA49_6==EOF||LA49_6==KEYWORD_2||LA49_6==KEYWORD_13||LA49_6==KEYWORD_18||(LA49_6>=KEYWORD_22 && LA49_6<=KEYWORD_24)||(LA49_6>=KEYWORD_29 && LA49_6<=KEYWORD_30)||LA49_6==KEYWORD_36||(LA49_6>=KEYWORD_38 && LA49_6<=KEYWORD_45)||LA49_6==KEYWORD_47||(LA49_6>=KEYWORD_49 && LA49_6<=KEYWORD_50)||(LA49_6>=KEYWORD_54 && LA49_6<=KEYWORD_58)||(LA49_6>=KEYWORD_60 && LA49_6<=KEYWORD_62)||(LA49_6>=KEYWORD_64 && LA49_6<=KEYWORD_65)||LA49_6==KEYWORD_67||(LA49_6>=KEYWORD_69 && LA49_6<=KEYWORD_72)||(LA49_6>=KEYWORD_74 && LA49_6<=KEYWORD_77)||LA49_6==KEYWORD_79||(LA49_6>=KEYWORD_81 && LA49_6<=KEYWORD_83)||LA49_6==RULE_STRING||LA49_6==RULE_ID) ) {
                            alt49=2;
                        }
                        else if ( (LA49_6==RULE_INT) ) {
                            alt49=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3914:1: ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) )", 49, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3914:1: ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) )", 49, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3914:1: ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) )", 49, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt49=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3914:1: ( ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) ) | ( (lv_label_3_0= ruleTempoLabel ) ) )", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3914:2: ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3914:2: ( ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3914:3: ( (lv_label_1_0= ruleTempoLabel ) )? ( (lv_value_2_0= ruleTempoValue ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3914:3: ( (lv_label_1_0= ruleTempoLabel ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==KEYWORD_62||LA48_0==RULE_STRING) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3915:1: (lv_label_1_0= ruleTempoLabel )
                            {
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3915:1: (lv_label_1_0= ruleTempoLabel )
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3916:3: lv_label_1_0= ruleTempoLabel
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTempoAccess().getLabelTempoLabelParserRuleCall_1_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTempoLabel_in_ruleTempo7769);
                            lv_label_1_0=ruleTempoLabel();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTempoRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"label",
                              	        		lv_label_1_0, 
                              	        		"TempoLabel", 
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

                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3938:3: ( (lv_value_2_0= ruleTempoValue ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3939:1: (lv_value_2_0= ruleTempoValue )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3939:1: (lv_value_2_0= ruleTempoValue )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3940:3: lv_value_2_0= ruleTempoValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTempoAccess().getValueTempoValueParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTempoValue_in_ruleTempo7791);
                    lv_value_2_0=ruleTempoValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTempoRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_2_0, 
                      	        		"TempoValue", 
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
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3963:6: ( (lv_label_3_0= ruleTempoLabel ) )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3963:6: ( (lv_label_3_0= ruleTempoLabel ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3964:1: (lv_label_3_0= ruleTempoLabel )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3964:1: (lv_label_3_0= ruleTempoLabel )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3965:3: lv_label_3_0= ruleTempoLabel
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTempoAccess().getLabelTempoLabelParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTempoLabel_in_ruleTempo7819);
                    lv_label_3_0=ruleTempoLabel();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTempoRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"label",
                      	        		lv_label_3_0, 
                      	        		"TempoLabel", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
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
    // $ANTLR end ruleTempo


    // $ANTLR start entryRuleTempoLabel
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3995:1: entryRuleTempoLabel returns [EObject current=null] : iv_ruleTempoLabel= ruleTempoLabel EOF ;
    public final EObject entryRuleTempoLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempoLabel = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3996:2: (iv_ruleTempoLabel= ruleTempoLabel EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:3997:2: iv_ruleTempoLabel= ruleTempoLabel EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTempoLabelRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTempoLabel_in_entryRuleTempoLabel7855);
            iv_ruleTempoLabel=ruleTempoLabel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTempoLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTempoLabel7865); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTempoLabel


    // $ANTLR start ruleTempoLabel
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4004:1: ruleTempoLabel returns [EObject current=null] : ( RULE_STRING | this_Markup_1= ruleMarkup ) ;
    public final EObject ruleTempoLabel() throws RecognitionException {
        EObject current = null;

        EObject this_Markup_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4009:6: ( ( RULE_STRING | this_Markup_1= ruleMarkup ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4010:1: ( RULE_STRING | this_Markup_1= ruleMarkup )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4010:1: ( RULE_STRING | this_Markup_1= ruleMarkup )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            else if ( (LA50_0==KEYWORD_62) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4010:1: ( RULE_STRING | this_Markup_1= ruleMarkup )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4010:2: RULE_STRING
                    {
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTempoLabel7899); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTempoLabelAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4016:2: this_Markup_1= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTempoLabelAccess().getMarkupParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleTempoLabel7929);
                    this_Markup_1=ruleMarkup();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Markup_1;
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
    // $ANTLR end ruleTempoLabel


    // $ANTLR start entryRuleTempoValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4035:1: entryRuleTempoValue returns [EObject current=null] : iv_ruleTempoValue= ruleTempoValue EOF ;
    public final EObject entryRuleTempoValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempoValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4036:2: (iv_ruleTempoValue= ruleTempoValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4037:2: iv_ruleTempoValue= ruleTempoValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTempoValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTempoValue_in_entryRuleTempoValue7963);
            iv_ruleTempoValue=ruleTempoValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTempoValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTempoValue7973); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTempoValue


    // $ANTLR start ruleTempoValue
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4044:1: ruleTempoValue returns [EObject current=null] : ( ( (lv_duration_0_0= ruleDuration ) ) KEYWORD_14 ( (lv_bpm_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTempoValue() throws RecognitionException {
        EObject current = null;

        Token lv_bpm_2_0=null;
        EObject lv_duration_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4049:6: ( ( ( (lv_duration_0_0= ruleDuration ) ) KEYWORD_14 ( (lv_bpm_2_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4050:1: ( ( (lv_duration_0_0= ruleDuration ) ) KEYWORD_14 ( (lv_bpm_2_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4050:1: ( ( (lv_duration_0_0= ruleDuration ) ) KEYWORD_14 ( (lv_bpm_2_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4050:2: ( (lv_duration_0_0= ruleDuration ) ) KEYWORD_14 ( (lv_bpm_2_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4050:2: ( (lv_duration_0_0= ruleDuration ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4051:1: (lv_duration_0_0= ruleDuration )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4051:1: (lv_duration_0_0= ruleDuration )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4052:3: lv_duration_0_0= ruleDuration
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTempoValueAccess().getDurationDurationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDuration_in_ruleTempoValue8019);
            lv_duration_0_0=ruleDuration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTempoValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"duration",
              	        		lv_duration_0_0, 
              	        		"Duration", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleTempoValue8030); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTempoValueAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4079:1: ( (lv_bpm_2_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4080:1: (lv_bpm_2_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4080:1: (lv_bpm_2_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4081:3: lv_bpm_2_0= RULE_INT
            {
            lv_bpm_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTempoValue8047); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTempoValueAccess().getBpmINTTerminalRuleCall_2_0(), "bpm"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTempoValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"bpm",
              	        		lv_bpm_2_0, 
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
        }
        return current;
    }
    // $ANTLR end ruleTempoValue


    // $ANTLR start entryRulePartial
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4111:1: entryRulePartial returns [EObject current=null] : iv_rulePartial= rulePartial EOF ;
    public final EObject entryRulePartial() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartial = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4112:2: (iv_rulePartial= rulePartial EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4113:2: iv_rulePartial= rulePartial EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPartialRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePartial_in_entryRulePartial8087);
            iv_rulePartial=rulePartial();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePartial; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartial8097); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePartial


    // $ANTLR start rulePartial
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4120:1: rulePartial returns [EObject current=null] : ( () KEYWORD_70 ( (lv_duration_2_0= ruleDuration ) ) ) ;
    public final EObject rulePartial() throws RecognitionException {
        EObject current = null;

        EObject lv_duration_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4125:6: ( ( () KEYWORD_70 ( (lv_duration_2_0= ruleDuration ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4126:1: ( () KEYWORD_70 ( (lv_duration_2_0= ruleDuration ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4126:1: ( () KEYWORD_70 ( (lv_duration_2_0= ruleDuration ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4126:2: () KEYWORD_70 ( (lv_duration_2_0= ruleDuration ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4126:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4127:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPartialAccess().getPartialAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPartialAccess().getPartialAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_rulePartial8145); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPartialAccess().getPartialKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4145:1: ( (lv_duration_2_0= ruleDuration ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4146:1: (lv_duration_2_0= ruleDuration )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4146:1: (lv_duration_2_0= ruleDuration )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4147:3: lv_duration_2_0= ruleDuration
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPartialAccess().getDurationDurationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDuration_in_rulePartial8166);
            lv_duration_2_0=ruleDuration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPartialRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"duration",
              	        		lv_duration_2_0, 
              	        		"Duration", 
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
    // $ANTLR end rulePartial


    // $ANTLR start entryRuleMark
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4177:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4178:2: (iv_ruleMark= ruleMark EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4179:2: iv_ruleMark= ruleMark EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMarkRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMark_in_entryRuleMark8201);
            iv_ruleMark=ruleMark();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMark; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMark8211); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMark


    // $ANTLR start ruleMark
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4186:1: ruleMark returns [EObject current=null] : ( () KEYWORD_44 ( (lv_mark_2_0= ruleScalar ) ) ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        EObject lv_mark_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4191:6: ( ( () KEYWORD_44 ( (lv_mark_2_0= ruleScalar ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4192:1: ( () KEYWORD_44 ( (lv_mark_2_0= ruleScalar ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4192:1: ( () KEYWORD_44 ( (lv_mark_2_0= ruleScalar ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4192:2: () KEYWORD_44 ( (lv_mark_2_0= ruleScalar ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4192:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4193:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getMarkAccess().getMarkAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getMarkAccess().getMarkAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleMark8259); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMarkAccess().getMarkKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4211:1: ( (lv_mark_2_0= ruleScalar ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4212:1: (lv_mark_2_0= ruleScalar )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4212:1: (lv_mark_2_0= ruleScalar )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4213:3: lv_mark_2_0= ruleScalar
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMarkAccess().getMarkScalarParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScalar_in_ruleMark8280);
            lv_mark_2_0=ruleScalar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMarkRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"mark",
              	        		lv_mark_2_0, 
              	        		"Scalar", 
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
    // $ANTLR end ruleMark


    // $ANTLR start entryRuleSkip
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4243:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4244:2: (iv_ruleSkip= ruleSkip EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4245:2: iv_ruleSkip= ruleSkip EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSkipRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip8315);
            iv_ruleSkip=ruleSkip();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSkip; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip8325); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSkip


    // $ANTLR start ruleSkip
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4252:1: ruleSkip returns [EObject current=null] : ( KEYWORD_49 ( (lv_duration_1_0= ruleDuration ) ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        EObject lv_duration_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4257:6: ( ( KEYWORD_49 ( (lv_duration_1_0= ruleDuration ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4258:1: ( KEYWORD_49 ( (lv_duration_1_0= ruleDuration ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4258:1: ( KEYWORD_49 ( (lv_duration_1_0= ruleDuration ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4259:2: KEYWORD_49 ( (lv_duration_1_0= ruleDuration ) )
            {
            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleSkip8361); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSkipAccess().getSkipKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4263:1: ( (lv_duration_1_0= ruleDuration ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4264:1: (lv_duration_1_0= ruleDuration )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4264:1: (lv_duration_1_0= ruleDuration )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4265:3: lv_duration_1_0= ruleDuration
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSkipAccess().getDurationDurationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDuration_in_ruleSkip8382);
            lv_duration_1_0=ruleDuration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSkipRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"duration",
              	        		lv_duration_1_0, 
              	        		"Duration", 
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
    // $ANTLR end ruleSkip


    // $ANTLR start entryRuleTie
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4295:1: entryRuleTie returns [EObject current=null] : iv_ruleTie= ruleTie EOF ;
    public final EObject entryRuleTie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTie = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4296:2: (iv_ruleTie= ruleTie EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4297:2: iv_ruleTie= ruleTie EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTieRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTie_in_entryRuleTie8417);
            iv_ruleTie=ruleTie();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTie; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTie8427); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTie


    // $ANTLR start ruleTie
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4304:1: ruleTie returns [EObject current=null] : ( () KEYWORD_39 ) ;
    public final EObject ruleTie() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4309:6: ( ( () KEYWORD_39 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4310:1: ( () KEYWORD_39 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4310:1: ( () KEYWORD_39 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4310:2: () KEYWORD_39
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4310:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4311:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getTieAccess().getTieAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getTieAccess().getTieAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleTie8475); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTieAccess().getReverseSolidusTildeKeyword_1(), null); 
                  
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
    // $ANTLR end ruleTie


    // $ANTLR start entryRuleBeamStart
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4337:1: entryRuleBeamStart returns [EObject current=null] : iv_ruleBeamStart= ruleBeamStart EOF ;
    public final EObject entryRuleBeamStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeamStart = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4338:2: (iv_ruleBeamStart= ruleBeamStart EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4339:2: iv_ruleBeamStart= ruleBeamStart EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBeamStartRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBeamStart_in_entryRuleBeamStart8510);
            iv_ruleBeamStart=ruleBeamStart();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBeamStart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeamStart8520); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBeamStart


    // $ANTLR start ruleBeamStart
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4346:1: ruleBeamStart returns [EObject current=null] : ( () KEYWORD_36 ) ;
    public final EObject ruleBeamStart() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4351:6: ( ( () KEYWORD_36 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4352:1: ( () KEYWORD_36 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4352:1: ( () KEYWORD_36 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4352:2: () KEYWORD_36
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4352:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4353:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBeamStartAccess().getBeamStartAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBeamStartAccess().getBeamStartAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleBeamStart8568); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBeamStartAccess().getReverseSolidusLeftSquareBracketKeyword_1(), null); 
                  
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
    // $ANTLR end ruleBeamStart


    // $ANTLR start entryRuleBeamEnd
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4379:1: entryRuleBeamEnd returns [EObject current=null] : iv_ruleBeamEnd= ruleBeamEnd EOF ;
    public final EObject entryRuleBeamEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeamEnd = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4380:2: (iv_ruleBeamEnd= ruleBeamEnd EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4381:2: iv_ruleBeamEnd= ruleBeamEnd EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBeamEndRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBeamEnd_in_entryRuleBeamEnd8603);
            iv_ruleBeamEnd=ruleBeamEnd();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBeamEnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeamEnd8613); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBeamEnd


    // $ANTLR start ruleBeamEnd
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4388:1: ruleBeamEnd returns [EObject current=null] : ( () KEYWORD_38 ) ;
    public final EObject ruleBeamEnd() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4393:6: ( ( () KEYWORD_38 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4394:1: ( () KEYWORD_38 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4394:1: ( () KEYWORD_38 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4394:2: () KEYWORD_38
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4394:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4395:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBeamEndAccess().getBeamEndAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBeamEndAccess().getBeamEndAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleBeamEnd8661); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBeamEndAccess().getReverseSolidusRightSquareBracketKeyword_1(), null); 
                  
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
    // $ANTLR end ruleBeamEnd


    // $ANTLR start entryRuleBarCheck
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4421:1: entryRuleBarCheck returns [EObject current=null] : iv_ruleBarCheck= ruleBarCheck EOF ;
    public final EObject entryRuleBarCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarCheck = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4422:2: (iv_ruleBarCheck= ruleBarCheck EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4423:2: iv_ruleBarCheck= ruleBarCheck EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBarCheckRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBarCheck_in_entryRuleBarCheck8696);
            iv_ruleBarCheck=ruleBarCheck();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBarCheck; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBarCheck8706); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBarCheck


    // $ANTLR start ruleBarCheck
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4430:1: ruleBarCheck returns [EObject current=null] : ( () KEYWORD_23 ) ;
    public final EObject ruleBarCheck() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4435:6: ( ( () KEYWORD_23 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4436:1: ( () KEYWORD_23 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4436:1: ( () KEYWORD_23 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4436:2: () KEYWORD_23
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4436:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4437:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBarCheckAccess().getBarCheckAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBarCheckAccess().getBarCheckAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleBarCheck8754); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBarCheckAccess().getVerticalLineKeyword_1(), null); 
                  
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
    // $ANTLR end ruleBarCheck


    // $ANTLR start entryRuleReference
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4463:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4467:2: (iv_ruleReference= ruleReference EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4468:2: iv_ruleReference= ruleReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference8795);
            iv_ruleReference=ruleReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference8805); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4478:1: ruleReference returns [EObject current=null] : ( KEYWORD_18 ( ( RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4484:6: ( ( KEYWORD_18 ( ( RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4485:1: ( KEYWORD_18 ( ( RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4485:1: ( KEYWORD_18 ( ( RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4486:2: KEYWORD_18 ( ( RULE_ID ) )
            {
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleReference8845); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4490:1: ( ( RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4491:1: ( RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4491:1: ( RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4492:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference8867); if (failed) return current;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleCompositeMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4518:1: entryRuleCompositeMusic returns [EObject current=null] : iv_ruleCompositeMusic= ruleCompositeMusic EOF ;
    public final EObject entryRuleCompositeMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4519:2: (iv_ruleCompositeMusic= ruleCompositeMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4520:2: iv_ruleCompositeMusic= ruleCompositeMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeMusic_in_entryRuleCompositeMusic8906);
            iv_ruleCompositeMusic=ruleCompositeMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeMusic8916); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeMusic


    // $ANTLR start ruleCompositeMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4527:1: ruleCompositeMusic returns [EObject current=null] : (this_SequentialMusic_0= ruleSequentialMusic | this_SimultaneousMusic_1= ruleSimultaneousMusic | this_NewContext_2= ruleNewContext | this_RelativeMusic_3= ruleRelativeMusic | this_RepeatedMusic_4= ruleRepeatedMusic ) ;
    public final EObject ruleCompositeMusic() throws RecognitionException {
        EObject current = null;

        EObject this_SequentialMusic_0 = null;

        EObject this_SimultaneousMusic_1 = null;

        EObject this_NewContext_2 = null;

        EObject this_RelativeMusic_3 = null;

        EObject this_RepeatedMusic_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4532:6: ( (this_SequentialMusic_0= ruleSequentialMusic | this_SimultaneousMusic_1= ruleSimultaneousMusic | this_NewContext_2= ruleNewContext | this_RelativeMusic_3= ruleRelativeMusic | this_RepeatedMusic_4= ruleRepeatedMusic ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4533:1: (this_SequentialMusic_0= ruleSequentialMusic | this_SimultaneousMusic_1= ruleSimultaneousMusic | this_NewContext_2= ruleNewContext | this_RelativeMusic_3= ruleRelativeMusic | this_RepeatedMusic_4= ruleRepeatedMusic )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4533:1: (this_SequentialMusic_0= ruleSequentialMusic | this_SimultaneousMusic_1= ruleSimultaneousMusic | this_NewContext_2= ruleNewContext | this_RelativeMusic_3= ruleRelativeMusic | this_RepeatedMusic_4= ruleRepeatedMusic )
            int alt51=5;
            switch ( input.LA(1) ) {
            case KEYWORD_22:
            case KEYWORD_76:
                {
                alt51=1;
                }
                break;
            case KEYWORD_29:
            case KEYWORD_81:
                {
                alt51=2;
                }
                break;
            case KEYWORD_41:
                {
                alt51=3;
                }
                break;
            case KEYWORD_75:
                {
                alt51=4;
                }
                break;
            case KEYWORD_64:
                {
                alt51=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4533:1: (this_SequentialMusic_0= ruleSequentialMusic | this_SimultaneousMusic_1= ruleSimultaneousMusic | this_NewContext_2= ruleNewContext | this_RelativeMusic_3= ruleRelativeMusic | this_RepeatedMusic_4= ruleRepeatedMusic )", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4534:2: this_SequentialMusic_0= ruleSequentialMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeMusicAccess().getSequentialMusicParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSequentialMusic_in_ruleCompositeMusic8966);
                    this_SequentialMusic_0=ruleSequentialMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SequentialMusic_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4547:2: this_SimultaneousMusic_1= ruleSimultaneousMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeMusicAccess().getSimultaneousMusicParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimultaneousMusic_in_ruleCompositeMusic8996);
                    this_SimultaneousMusic_1=ruleSimultaneousMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SimultaneousMusic_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4560:2: this_NewContext_2= ruleNewContext
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeMusicAccess().getNewContextParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewContext_in_ruleCompositeMusic9026);
                    this_NewContext_2=ruleNewContext();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NewContext_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4573:2: this_RelativeMusic_3= ruleRelativeMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeMusicAccess().getRelativeMusicParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelativeMusic_in_ruleCompositeMusic9056);
                    this_RelativeMusic_3=ruleRelativeMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_RelativeMusic_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4586:2: this_RepeatedMusic_4= ruleRepeatedMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeMusicAccess().getRepeatedMusicParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRepeatedMusic_in_ruleCompositeMusic9086);
                    this_RepeatedMusic_4=ruleRepeatedMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_RepeatedMusic_4;
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
    // $ANTLR end ruleCompositeMusic


    // $ANTLR start entryRuleSequentialMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4605:1: entryRuleSequentialMusic returns [EObject current=null] : iv_ruleSequentialMusic= ruleSequentialMusic EOF ;
    public final EObject entryRuleSequentialMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequentialMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4606:2: (iv_ruleSequentialMusic= ruleSequentialMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4607:2: iv_ruleSequentialMusic= ruleSequentialMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSequentialMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSequentialMusic_in_entryRuleSequentialMusic9120);
            iv_ruleSequentialMusic=ruleSequentialMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSequentialMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequentialMusic9130); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSequentialMusic


    // $ANTLR start ruleSequentialMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4614:1: ruleSequentialMusic returns [EObject current=null] : ( () ( ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 ) ) ) ;
    public final EObject ruleSequentialMusic() throws RecognitionException {
        EObject current = null;

        EObject lv_music_3_0 = null;

        EObject lv_music_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4619:6: ( ( () ( ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4620:1: ( () ( ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4620:1: ( () ( ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4620:2: () ( ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4620:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4621:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSequentialMusicAccess().getSequentialMusicAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSequentialMusicAccess().getSequentialMusicAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4634:2: ( ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KEYWORD_76) ) {
                alt54=1;
            }
            else if ( (LA54_0==KEYWORD_22) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4634:2: ( ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4634:3: ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4634:3: ( KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4635:2: KEYWORD_76 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24
                    {
                    match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleSequentialMusic9180); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSequentialMusicAccess().getSequentialKeyword_1_0_0(), null); 
                          
                    }
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleSequentialMusic9191); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSequentialMusicAccess().getLeftCurlyBracketKeyword_1_0_1(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4644:1: ( (lv_music_3_0= ruleMusic ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==KEYWORD_13||LA52_0==KEYWORD_18||(LA52_0>=KEYWORD_22 && LA52_0<=KEYWORD_23)||LA52_0==KEYWORD_29||LA52_0==KEYWORD_36||(LA52_0>=KEYWORD_38 && LA52_0<=KEYWORD_42)||LA52_0==KEYWORD_44||LA52_0==KEYWORD_47||(LA52_0>=KEYWORD_49 && LA52_0<=KEYWORD_50)||(LA52_0>=KEYWORD_56 && LA52_0<=KEYWORD_58)||(LA52_0>=KEYWORD_64 && LA52_0<=KEYWORD_65)||LA52_0==KEYWORD_70||(LA52_0>=KEYWORD_74 && LA52_0<=KEYWORD_76)||LA52_0==KEYWORD_81||LA52_0==RULE_ID) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4645:1: (lv_music_3_0= ruleMusic )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4645:1: (lv_music_3_0= ruleMusic )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4646:3: lv_music_3_0= ruleMusic
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSequentialMusicAccess().getMusicMusicParserRuleCall_1_0_2_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMusic_in_ruleSequentialMusic9212);
                    	    lv_music_3_0=ruleMusic();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSequentialMusicRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"music",
                    	      	        		lv_music_3_0, 
                    	      	        		"Music", 
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
                    	    break loop52;
                        }
                    } while (true);

                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleSequentialMusic9224); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSequentialMusicAccess().getRightCurlyBracketKeyword_1_0_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4674:6: ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4674:6: ( KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4675:2: KEYWORD_22 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_24
                    {
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleSequentialMusic9243); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSequentialMusicAccess().getLeftCurlyBracketKeyword_1_1_0(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4679:1: ( (lv_music_6_0= ruleMusic ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==KEYWORD_13||LA53_0==KEYWORD_18||(LA53_0>=KEYWORD_22 && LA53_0<=KEYWORD_23)||LA53_0==KEYWORD_29||LA53_0==KEYWORD_36||(LA53_0>=KEYWORD_38 && LA53_0<=KEYWORD_42)||LA53_0==KEYWORD_44||LA53_0==KEYWORD_47||(LA53_0>=KEYWORD_49 && LA53_0<=KEYWORD_50)||(LA53_0>=KEYWORD_56 && LA53_0<=KEYWORD_58)||(LA53_0>=KEYWORD_64 && LA53_0<=KEYWORD_65)||LA53_0==KEYWORD_70||(LA53_0>=KEYWORD_74 && LA53_0<=KEYWORD_76)||LA53_0==KEYWORD_81||LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4680:1: (lv_music_6_0= ruleMusic )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4680:1: (lv_music_6_0= ruleMusic )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4681:3: lv_music_6_0= ruleMusic
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSequentialMusicAccess().getMusicMusicParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMusic_in_ruleSequentialMusic9264);
                    	    lv_music_6_0=ruleMusic();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSequentialMusicRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"music",
                    	      	        		lv_music_6_0, 
                    	      	        		"Music", 
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
                    	    break loop53;
                        }
                    } while (true);

                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleSequentialMusic9276); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSequentialMusicAccess().getRightCurlyBracketKeyword_1_1_2(), null); 
                          
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
    // $ANTLR end ruleSequentialMusic


    // $ANTLR start entryRuleSimultaneousMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4716:1: entryRuleSimultaneousMusic returns [EObject current=null] : iv_ruleSimultaneousMusic= ruleSimultaneousMusic EOF ;
    public final EObject entryRuleSimultaneousMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneousMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4717:2: (iv_ruleSimultaneousMusic= ruleSimultaneousMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4718:2: iv_ruleSimultaneousMusic= ruleSimultaneousMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimultaneousMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimultaneousMusic_in_entryRuleSimultaneousMusic9313);
            iv_ruleSimultaneousMusic=ruleSimultaneousMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimultaneousMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousMusic9323); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimultaneousMusic


    // $ANTLR start ruleSimultaneousMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4725:1: ruleSimultaneousMusic returns [EObject current=null] : ( () ( ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 ) ) ) ;
    public final EObject ruleSimultaneousMusic() throws RecognitionException {
        EObject current = null;

        EObject lv_music_3_0 = null;

        EObject lv_music_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4730:6: ( ( () ( ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4731:1: ( () ( ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4731:1: ( () ( ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4731:2: () ( ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4731:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4732:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSimultaneousMusicAccess().getSimultaneousMusicAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSimultaneousMusicAccess().getSimultaneousMusicAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4745:2: ( ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KEYWORD_81) ) {
                alt57=1;
            }
            else if ( (LA57_0==KEYWORD_29) ) {
                alt57=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4745:2: ( ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 ) | ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 ) )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4745:3: ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4745:3: ( KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4746:2: KEYWORD_81 KEYWORD_22 ( (lv_music_3_0= ruleMusic ) )* KEYWORD_24
                    {
                    match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleSimultaneousMusic9373); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSimultaneousMusicAccess().getSimultaneousKeyword_1_0_0(), null); 
                          
                    }
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleSimultaneousMusic9384); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSimultaneousMusicAccess().getLeftCurlyBracketKeyword_1_0_1(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4755:1: ( (lv_music_3_0= ruleMusic ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==KEYWORD_13||LA55_0==KEYWORD_18||(LA55_0>=KEYWORD_22 && LA55_0<=KEYWORD_23)||LA55_0==KEYWORD_29||LA55_0==KEYWORD_36||(LA55_0>=KEYWORD_38 && LA55_0<=KEYWORD_42)||LA55_0==KEYWORD_44||LA55_0==KEYWORD_47||(LA55_0>=KEYWORD_49 && LA55_0<=KEYWORD_50)||(LA55_0>=KEYWORD_56 && LA55_0<=KEYWORD_58)||(LA55_0>=KEYWORD_64 && LA55_0<=KEYWORD_65)||LA55_0==KEYWORD_70||(LA55_0>=KEYWORD_74 && LA55_0<=KEYWORD_76)||LA55_0==KEYWORD_81||LA55_0==RULE_ID) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4756:1: (lv_music_3_0= ruleMusic )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4756:1: (lv_music_3_0= ruleMusic )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4757:3: lv_music_3_0= ruleMusic
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSimultaneousMusicAccess().getMusicMusicParserRuleCall_1_0_2_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMusic_in_ruleSimultaneousMusic9405);
                    	    lv_music_3_0=ruleMusic();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSimultaneousMusicRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"music",
                    	      	        		lv_music_3_0, 
                    	      	        		"Music", 
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
                    	    break loop55;
                        }
                    } while (true);

                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleSimultaneousMusic9417); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSimultaneousMusicAccess().getRightCurlyBracketKeyword_1_0_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4785:6: ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4785:6: ( KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4786:2: KEYWORD_29 ( (lv_music_6_0= ruleMusic ) )* KEYWORD_30
                    {
                    match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSimultaneousMusic9436); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSimultaneousMusicAccess().getLessThanSignLessThanSignKeyword_1_1_0(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4790:1: ( (lv_music_6_0= ruleMusic ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==KEYWORD_13||LA56_0==KEYWORD_18||(LA56_0>=KEYWORD_22 && LA56_0<=KEYWORD_23)||LA56_0==KEYWORD_29||LA56_0==KEYWORD_36||(LA56_0>=KEYWORD_38 && LA56_0<=KEYWORD_42)||LA56_0==KEYWORD_44||LA56_0==KEYWORD_47||(LA56_0>=KEYWORD_49 && LA56_0<=KEYWORD_50)||(LA56_0>=KEYWORD_56 && LA56_0<=KEYWORD_58)||(LA56_0>=KEYWORD_64 && LA56_0<=KEYWORD_65)||LA56_0==KEYWORD_70||(LA56_0>=KEYWORD_74 && LA56_0<=KEYWORD_76)||LA56_0==KEYWORD_81||LA56_0==RULE_ID) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4791:1: (lv_music_6_0= ruleMusic )
                    	    {
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4791:1: (lv_music_6_0= ruleMusic )
                    	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4792:3: lv_music_6_0= ruleMusic
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSimultaneousMusicAccess().getMusicMusicParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMusic_in_ruleSimultaneousMusic9457);
                    	    lv_music_6_0=ruleMusic();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSimultaneousMusicRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"music",
                    	      	        		lv_music_6_0, 
                    	      	        		"Music", 
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
                    	    break loop56;
                        }
                    } while (true);

                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleSimultaneousMusic9469); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSimultaneousMusicAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_2(), null); 
                          
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
    // $ANTLR end ruleSimultaneousMusic


    // $ANTLR start entryRuleNewContext
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4827:1: entryRuleNewContext returns [EObject current=null] : iv_ruleNewContext= ruleNewContext EOF ;
    public final EObject entryRuleNewContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContext = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4828:2: (iv_ruleNewContext= ruleNewContext EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4829:2: iv_ruleNewContext= ruleNewContext EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNewContextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNewContext_in_entryRuleNewContext9506);
            iv_ruleNewContext=ruleNewContext();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNewContext; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewContext9516); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4836:1: ruleNewContext returns [EObject current=null] : ( KEYWORD_41 ( (lv_context_1_0= ruleIdOrString ) ) ( KEYWORD_14 ( (lv_id_3_0= ruleIdOrString ) ) )? ( (lv_modification_4_0= ruleContextModification ) )? ( (lv_music_5_0= ruleMusic ) ) ) ;
    public final EObject ruleNewContext() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_context_1_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_modification_4_0 = null;

        EObject lv_music_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4841:6: ( ( KEYWORD_41 ( (lv_context_1_0= ruleIdOrString ) ) ( KEYWORD_14 ( (lv_id_3_0= ruleIdOrString ) ) )? ( (lv_modification_4_0= ruleContextModification ) )? ( (lv_music_5_0= ruleMusic ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4842:1: ( KEYWORD_41 ( (lv_context_1_0= ruleIdOrString ) ) ( KEYWORD_14 ( (lv_id_3_0= ruleIdOrString ) ) )? ( (lv_modification_4_0= ruleContextModification ) )? ( (lv_music_5_0= ruleMusic ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4842:1: ( KEYWORD_41 ( (lv_context_1_0= ruleIdOrString ) ) ( KEYWORD_14 ( (lv_id_3_0= ruleIdOrString ) ) )? ( (lv_modification_4_0= ruleContextModification ) )? ( (lv_music_5_0= ruleMusic ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4843:2: KEYWORD_41 ( (lv_context_1_0= ruleIdOrString ) ) ( KEYWORD_14 ( (lv_id_3_0= ruleIdOrString ) ) )? ( (lv_modification_4_0= ruleContextModification ) )? ( (lv_music_5_0= ruleMusic ) )
            {
            match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleNewContext9552); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNewContextAccess().getNewKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4847:1: ( (lv_context_1_0= ruleIdOrString ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4848:1: (lv_context_1_0= ruleIdOrString )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4848:1: (lv_context_1_0= ruleIdOrString )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4849:3: lv_context_1_0= ruleIdOrString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getContextIdOrStringParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrString_in_ruleNewContext9573);
            lv_context_1_0=ruleIdOrString();
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
              	       			"context",
              	        		lv_context_1_0, 
              	        		"IdOrString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4871:2: ( KEYWORD_14 ( (lv_id_3_0= ruleIdOrString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==KEYWORD_14) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4872:2: KEYWORD_14 ( (lv_id_3_0= ruleIdOrString ) )
                    {
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleNewContext9585); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNewContextAccess().getEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4876:1: ( (lv_id_3_0= ruleIdOrString ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4877:1: (lv_id_3_0= ruleIdOrString )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4877:1: (lv_id_3_0= ruleIdOrString )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4878:3: lv_id_3_0= ruleIdOrString
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getIdIdOrStringParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdOrString_in_ruleNewContext9606);
                    lv_id_3_0=ruleIdOrString();
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
                      	       			"id",
                      	        		lv_id_3_0, 
                      	        		"IdOrString", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4900:4: ( (lv_modification_4_0= ruleContextModification ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KEYWORD_52) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4901:1: (lv_modification_4_0= ruleContextModification )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4901:1: (lv_modification_4_0= ruleContextModification )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4902:3: lv_modification_4_0= ruleContextModification
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getModificationContextModificationParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContextModification_in_ruleNewContext9629);
                    lv_modification_4_0=ruleContextModification();
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
                      	        		lv_modification_4_0, 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4924:3: ( (lv_music_5_0= ruleMusic ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4925:1: (lv_music_5_0= ruleMusic )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4925:1: (lv_music_5_0= ruleMusic )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4926:3: lv_music_5_0= ruleMusic
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNewContextAccess().getMusicMusicParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMusic_in_ruleNewContext9651);
            lv_music_5_0=ruleMusic();
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
              	        		lv_music_5_0, 
              	        		"Music", 
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4956:1: entryRuleContextModification returns [EObject current=null] : iv_ruleContextModification= ruleContextModification EOF ;
    public final EObject entryRuleContextModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModification = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4957:2: (iv_ruleContextModification= ruleContextModification EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4958:2: iv_ruleContextModification= ruleContextModification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextModificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextModification_in_entryRuleContextModification9686);
            iv_ruleContextModification=ruleContextModification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextModification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextModification9696); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4965:1: ruleContextModification returns [EObject current=null] : ( () KEYWORD_52 KEYWORD_22 ( (lv_modifiers_3_0= ruleContextModifier ) )* KEYWORD_24 ) ;
    public final EObject ruleContextModification() throws RecognitionException {
        EObject current = null;

        EObject lv_modifiers_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4970:6: ( ( () KEYWORD_52 KEYWORD_22 ( (lv_modifiers_3_0= ruleContextModifier ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4971:1: ( () KEYWORD_52 KEYWORD_22 ( (lv_modifiers_3_0= ruleContextModifier ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4971:1: ( () KEYWORD_52 KEYWORD_22 ( (lv_modifiers_3_0= ruleContextModifier ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4971:2: () KEYWORD_52 KEYWORD_22 ( (lv_modifiers_3_0= ruleContextModifier ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4971:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4972:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getContextModificationAccess().getContextModificationAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getContextModificationAccess().getContextModificationAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleContextModification9744); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextModificationAccess().getWithKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleContextModification9755); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextModificationAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4995:1: ( (lv_modifiers_3_0= ruleContextModifier ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==KEYWORD_46||LA60_0==KEYWORD_51||LA60_0==KEYWORD_53||LA60_0==KEYWORD_57||LA60_0==KEYWORD_59||LA60_0==KEYWORD_63||(LA60_0>=KEYWORD_65 && LA60_0<=KEYWORD_66)||(LA60_0>=KEYWORD_73 && LA60_0<=KEYWORD_74)||LA60_0==KEYWORD_78||LA60_0==KEYWORD_80||LA60_0==RULE_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4996:1: (lv_modifiers_3_0= ruleContextModifier )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4996:1: (lv_modifiers_3_0= ruleContextModifier )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4997:3: lv_modifiers_3_0= ruleContextModifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getContextModificationAccess().getModifiersContextModifierParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContextModifier_in_ruleContextModification9776);
            	    lv_modifiers_3_0=ruleContextModifier();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getContextModificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"modifiers",
            	      	        		lv_modifiers_3_0, 
            	      	        		"ContextModifier", 
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
            	    break loop60;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleContextModification9788); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextModificationAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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


    // $ANTLR start entryRuleContextModifier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5032:1: entryRuleContextModifier returns [EObject current=null] : iv_ruleContextModifier= ruleContextModifier EOF ;
    public final EObject entryRuleContextModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModifier = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5033:2: (iv_ruleContextModifier= ruleContextModifier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5034:2: iv_ruleContextModifier= ruleContextModifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextModifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextModifier_in_entryRuleContextModifier9823);
            iv_ruleContextModifier=ruleContextModifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextModifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextModifier9833); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextModifier


    // $ANTLR start ruleContextModifier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5041:1: ruleContextModifier returns [EObject current=null] : (this_PropertyOperation_0= rulePropertyOperation | this_ContextDefaultModifier_1= ruleContextDefaultModifier ) ;
    public final EObject ruleContextModifier() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyOperation_0 = null;

        EObject this_ContextDefaultModifier_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5046:6: ( (this_PropertyOperation_0= rulePropertyOperation | this_ContextDefaultModifier_1= ruleContextDefaultModifier ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5047:1: (this_PropertyOperation_0= rulePropertyOperation | this_ContextDefaultModifier_1= ruleContextDefaultModifier )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5047:1: (this_PropertyOperation_0= rulePropertyOperation | this_ContextDefaultModifier_1= ruleContextDefaultModifier )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==KEYWORD_57||LA61_0==KEYWORD_65||LA61_0==KEYWORD_74||LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==KEYWORD_46||LA61_0==KEYWORD_51||LA61_0==KEYWORD_53||LA61_0==KEYWORD_59||LA61_0==KEYWORD_63||LA61_0==KEYWORD_66||LA61_0==KEYWORD_73||LA61_0==KEYWORD_78||LA61_0==KEYWORD_80) ) {
                alt61=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5047:1: (this_PropertyOperation_0= rulePropertyOperation | this_ContextDefaultModifier_1= ruleContextDefaultModifier )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5048:2: this_PropertyOperation_0= rulePropertyOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContextModifierAccess().getPropertyOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyOperation_in_ruleContextModifier9883);
                    this_PropertyOperation_0=rulePropertyOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_PropertyOperation_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5061:2: this_ContextDefaultModifier_1= ruleContextDefaultModifier
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getContextModifierAccess().getContextDefaultModifierParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleContextDefaultModifier_in_ruleContextModifier9913);
                    this_ContextDefaultModifier_1=ruleContextDefaultModifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ContextDefaultModifier_1;
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
    // $ANTLR end ruleContextModifier


    // $ANTLR start entryRulePropertyOperation
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5080:1: entryRulePropertyOperation returns [EObject current=null] : iv_rulePropertyOperation= rulePropertyOperation EOF ;
    public final EObject entryRulePropertyOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyOperation = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5081:2: (iv_rulePropertyOperation= rulePropertyOperation EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5082:2: iv_rulePropertyOperation= rulePropertyOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyOperation_in_entryRulePropertyOperation9947);
            iv_rulePropertyOperation=rulePropertyOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyOperation9957); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePropertyOperation


    // $ANTLR start rulePropertyOperation
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5089:1: rulePropertyOperation returns [EObject current=null] : (this_SetProperty_0= ruleSetProperty | this_UnsetProperty_1= ruleUnsetProperty | this_OverrideProperty_2= ruleOverrideProperty | this_RevertProperty_3= ruleRevertProperty ) ;
    public final EObject rulePropertyOperation() throws RecognitionException {
        EObject current = null;

        EObject this_SetProperty_0 = null;

        EObject this_UnsetProperty_1 = null;

        EObject this_OverrideProperty_2 = null;

        EObject this_RevertProperty_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5094:6: ( (this_SetProperty_0= ruleSetProperty | this_UnsetProperty_1= ruleUnsetProperty | this_OverrideProperty_2= ruleOverrideProperty | this_RevertProperty_3= ruleRevertProperty ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5095:1: (this_SetProperty_0= ruleSetProperty | this_UnsetProperty_1= ruleUnsetProperty | this_OverrideProperty_2= ruleOverrideProperty | this_RevertProperty_3= ruleRevertProperty )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5095:1: (this_SetProperty_0= ruleSetProperty | this_UnsetProperty_1= ruleUnsetProperty | this_OverrideProperty_2= ruleOverrideProperty | this_RevertProperty_3= ruleRevertProperty )
            int alt62=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt62=1;
                }
                break;
            case KEYWORD_57:
                {
                alt62=2;
                }
                break;
            case KEYWORD_74:
                {
                alt62=3;
                }
                break;
            case KEYWORD_65:
                {
                alt62=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5095:1: (this_SetProperty_0= ruleSetProperty | this_UnsetProperty_1= ruleUnsetProperty | this_OverrideProperty_2= ruleOverrideProperty | this_RevertProperty_3= ruleRevertProperty )", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5096:2: this_SetProperty_0= ruleSetProperty
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPropertyOperationAccess().getSetPropertyParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetProperty_in_rulePropertyOperation10007);
                    this_SetProperty_0=ruleSetProperty();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SetProperty_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5109:2: this_UnsetProperty_1= ruleUnsetProperty
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPropertyOperationAccess().getUnsetPropertyParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnsetProperty_in_rulePropertyOperation10037);
                    this_UnsetProperty_1=ruleUnsetProperty();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UnsetProperty_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5122:2: this_OverrideProperty_2= ruleOverrideProperty
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPropertyOperationAccess().getOverridePropertyParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOverrideProperty_in_rulePropertyOperation10067);
                    this_OverrideProperty_2=ruleOverrideProperty();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_OverrideProperty_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5135:2: this_RevertProperty_3= ruleRevertProperty
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPropertyOperationAccess().getRevertPropertyParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRevertProperty_in_rulePropertyOperation10097);
                    this_RevertProperty_3=ruleRevertProperty();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_RevertProperty_3;
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
    // $ANTLR end rulePropertyOperation


    // $ANTLR start entryRuleSetProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5154:1: entryRuleSetProperty returns [EObject current=null] : iv_ruleSetProperty= ruleSetProperty EOF ;
    public final EObject entryRuleSetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetProperty = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5155:2: (iv_ruleSetProperty= ruleSetProperty EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5156:2: iv_ruleSetProperty= ruleSetProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSetPropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSetProperty_in_entryRuleSetProperty10131);
            iv_ruleSetProperty=ruleSetProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSetProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetProperty10141); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSetProperty


    // $ANTLR start ruleSetProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5163:1: ruleSetProperty returns [EObject current=null] : ( ( (lv_property_0_0= RULE_ID ) ) KEYWORD_14 ( (lv_value_2_0= ruleScalar ) ) ) ;
    public final EObject ruleSetProperty() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5168:6: ( ( ( (lv_property_0_0= RULE_ID ) ) KEYWORD_14 ( (lv_value_2_0= ruleScalar ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5169:1: ( ( (lv_property_0_0= RULE_ID ) ) KEYWORD_14 ( (lv_value_2_0= ruleScalar ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5169:1: ( ( (lv_property_0_0= RULE_ID ) ) KEYWORD_14 ( (lv_value_2_0= ruleScalar ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5169:2: ( (lv_property_0_0= RULE_ID ) ) KEYWORD_14 ( (lv_value_2_0= ruleScalar ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5169:2: ( (lv_property_0_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5170:1: (lv_property_0_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5170:1: (lv_property_0_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5171:3: lv_property_0_0= RULE_ID
            {
            lv_property_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetProperty10183); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSetPropertyAccess().getPropertyIDTerminalRuleCall_0_0(), "property"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSetPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"property",
              	        		lv_property_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleSetProperty10199); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSetPropertyAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5198:1: ( (lv_value_2_0= ruleScalar ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5199:1: (lv_value_2_0= ruleScalar )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5199:1: (lv_value_2_0= ruleScalar )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5200:3: lv_value_2_0= ruleScalar
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSetPropertyAccess().getValueScalarParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScalar_in_ruleSetProperty10220);
            lv_value_2_0=ruleScalar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSetPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"Scalar", 
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
    // $ANTLR end ruleSetProperty


    // $ANTLR start entryRuleScalar
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5230:1: entryRuleScalar returns [EObject current=null] : iv_ruleScalar= ruleScalar EOF ;
    public final EObject entryRuleScalar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalar = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5231:2: (iv_ruleScalar= ruleScalar EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5232:2: iv_ruleScalar= ruleScalar EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScalarRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScalar_in_entryRuleScalar10255);
            iv_ruleScalar=ruleScalar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScalar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalar10265); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScalar


    // $ANTLR start ruleScalar
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5239:1: ruleScalar returns [EObject current=null] : ( ruleIdOrString | RULE_INT | this_Scheme_2= ruleScheme | this_Markup_3= ruleMarkup ) ;
    public final EObject ruleScalar() throws RecognitionException {
        EObject current = null;

        EObject this_Scheme_2 = null;

        EObject this_Markup_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5244:6: ( ( ruleIdOrString | RULE_INT | this_Scheme_2= ruleScheme | this_Markup_3= ruleMarkup ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5245:1: ( ruleIdOrString | RULE_INT | this_Scheme_2= ruleScheme | this_Markup_3= ruleMarkup )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5245:1: ( ruleIdOrString | RULE_INT | this_Scheme_2= ruleScheme | this_Markup_3= ruleMarkup )
            int alt63=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt63=1;
                }
                break;
            case RULE_INT:
                {
                alt63=2;
                }
                break;
            case KEYWORD_2:
                {
                alt63=3;
                }
                break;
            case KEYWORD_62:
                {
                alt63=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5245:1: ( ruleIdOrString | RULE_INT | this_Scheme_2= ruleScheme | this_Markup_3= ruleMarkup )", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5246:2: ruleIdOrString
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getScalarAccess().getIdOrStringParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdOrString_in_ruleScalar10309);
                    ruleIdOrString();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5257:6: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScalar10323); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScalarAccess().getINTTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5263:2: this_Scheme_2= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getScalarAccess().getSchemeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleScalar10353);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5276:2: this_Markup_3= ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getScalarAccess().getMarkupParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_ruleScalar10383);
                    this_Markup_3=ruleMarkup();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Markup_3;
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
    // $ANTLR end ruleScalar


    // $ANTLR start entryRuleUnsetProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5295:1: entryRuleUnsetProperty returns [EObject current=null] : iv_ruleUnsetProperty= ruleUnsetProperty EOF ;
    public final EObject entryRuleUnsetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsetProperty = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5296:2: (iv_ruleUnsetProperty= ruleUnsetProperty EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5297:2: iv_ruleUnsetProperty= ruleUnsetProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnsetPropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnsetProperty_in_entryRuleUnsetProperty10417);
            iv_ruleUnsetProperty=ruleUnsetProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnsetProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnsetProperty10427); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnsetProperty


    // $ANTLR start ruleUnsetProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5304:1: ruleUnsetProperty returns [EObject current=null] : ( KEYWORD_57 ( (lv_property_1_0= ruleIdOrString ) ) ) ;
    public final EObject ruleUnsetProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_property_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5309:6: ( ( KEYWORD_57 ( (lv_property_1_0= ruleIdOrString ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5310:1: ( KEYWORD_57 ( (lv_property_1_0= ruleIdOrString ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5310:1: ( KEYWORD_57 ( (lv_property_1_0= ruleIdOrString ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5311:2: KEYWORD_57 ( (lv_property_1_0= ruleIdOrString ) )
            {
            match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleUnsetProperty10463); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnsetPropertyAccess().getUnsetKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5315:1: ( (lv_property_1_0= ruleIdOrString ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5316:1: (lv_property_1_0= ruleIdOrString )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5316:1: (lv_property_1_0= ruleIdOrString )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5317:3: lv_property_1_0= ruleIdOrString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnsetPropertyAccess().getPropertyIdOrStringParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrString_in_ruleUnsetProperty10484);
            lv_property_1_0=ruleIdOrString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnsetPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"property",
              	        		lv_property_1_0, 
              	        		"IdOrString", 
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
    // $ANTLR end ruleUnsetProperty


    // $ANTLR start entryRuleOverrideProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5347:1: entryRuleOverrideProperty returns [EObject current=null] : iv_ruleOverrideProperty= ruleOverrideProperty EOF ;
    public final EObject entryRuleOverrideProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideProperty = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5348:2: (iv_ruleOverrideProperty= ruleOverrideProperty EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5349:2: iv_ruleOverrideProperty= ruleOverrideProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOverridePropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOverrideProperty_in_entryRuleOverrideProperty10519);
            iv_ruleOverrideProperty=ruleOverrideProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOverrideProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverrideProperty10529); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOverrideProperty


    // $ANTLR start ruleOverrideProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5356:1: ruleOverrideProperty returns [EObject current=null] : ( KEYWORD_74 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScheme ) ) ) ;
    public final EObject ruleOverrideProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_property_1_0 = null;

        EObject lv_path_2_0 = null;

        EObject lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5361:6: ( ( KEYWORD_74 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScheme ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5362:1: ( KEYWORD_74 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScheme ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5362:1: ( KEYWORD_74 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScheme ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5363:2: KEYWORD_74 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScheme ) )
            {
            match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleOverrideProperty10565); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOverridePropertyAccess().getOverrideKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5367:1: ( (lv_property_1_0= ruleIdOrString ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5368:1: (lv_property_1_0= ruleIdOrString )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5368:1: (lv_property_1_0= ruleIdOrString )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5369:3: lv_property_1_0= ruleIdOrString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOverridePropertyAccess().getPropertyIdOrStringParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrString_in_ruleOverrideProperty10586);
            lv_property_1_0=ruleIdOrString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOverridePropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"property",
              	        		lv_property_1_0, 
              	        		"IdOrString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5391:2: ( (lv_path_2_0= ruleScheme ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5392:1: (lv_path_2_0= ruleScheme )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5392:1: (lv_path_2_0= ruleScheme )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5393:3: lv_path_2_0= ruleScheme
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOverridePropertyAccess().getPathSchemeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScheme_in_ruleOverrideProperty10607);
            lv_path_2_0=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOverridePropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"path",
              	        		lv_path_2_0, 
              	        		"Scheme", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleOverrideProperty10618); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOverridePropertyAccess().getEqualsSignKeyword_3(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5420:1: ( (lv_value_4_0= ruleScheme ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5421:1: (lv_value_4_0= ruleScheme )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5421:1: (lv_value_4_0= ruleScheme )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5422:3: lv_value_4_0= ruleScheme
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOverridePropertyAccess().getValueSchemeParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScheme_in_ruleOverrideProperty10639);
            lv_value_4_0=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOverridePropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_4_0, 
              	        		"Scheme", 
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
    // $ANTLR end ruleOverrideProperty


    // $ANTLR start entryRuleRevertProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5452:1: entryRuleRevertProperty returns [EObject current=null] : iv_ruleRevertProperty= ruleRevertProperty EOF ;
    public final EObject entryRuleRevertProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRevertProperty = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5453:2: (iv_ruleRevertProperty= ruleRevertProperty EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5454:2: iv_ruleRevertProperty= ruleRevertProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRevertPropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRevertProperty_in_entryRuleRevertProperty10674);
            iv_ruleRevertProperty=ruleRevertProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRevertProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRevertProperty10684); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRevertProperty


    // $ANTLR start ruleRevertProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5461:1: ruleRevertProperty returns [EObject current=null] : ( KEYWORD_65 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) ) ;
    public final EObject ruleRevertProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_property_1_0 = null;

        EObject lv_path_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5466:6: ( ( KEYWORD_65 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5467:1: ( KEYWORD_65 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5467:1: ( KEYWORD_65 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5468:2: KEYWORD_65 ( (lv_property_1_0= ruleIdOrString ) ) ( (lv_path_2_0= ruleScheme ) )
            {
            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleRevertProperty10720); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRevertPropertyAccess().getRevertKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5472:1: ( (lv_property_1_0= ruleIdOrString ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5473:1: (lv_property_1_0= ruleIdOrString )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5473:1: (lv_property_1_0= ruleIdOrString )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5474:3: lv_property_1_0= ruleIdOrString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRevertPropertyAccess().getPropertyIdOrStringParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrString_in_ruleRevertProperty10741);
            lv_property_1_0=ruleIdOrString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRevertPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"property",
              	        		lv_property_1_0, 
              	        		"IdOrString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5496:2: ( (lv_path_2_0= ruleScheme ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5497:1: (lv_path_2_0= ruleScheme )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5497:1: (lv_path_2_0= ruleScheme )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5498:3: lv_path_2_0= ruleScheme
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRevertPropertyAccess().getPathSchemeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScheme_in_ruleRevertProperty10762);
            lv_path_2_0=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRevertPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"path",
              	        		lv_path_2_0, 
              	        		"Scheme", 
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
    // $ANTLR end ruleRevertProperty


    // $ANTLR start entryRuleContextDefaultModifier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5528:1: entryRuleContextDefaultModifier returns [EObject current=null] : iv_ruleContextDefaultModifier= ruleContextDefaultModifier EOF ;
    public final EObject entryRuleContextDefaultModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDefaultModifier = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5529:2: (iv_ruleContextDefaultModifier= ruleContextDefaultModifier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5530:2: iv_ruleContextDefaultModifier= ruleContextDefaultModifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextDefaultModifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextDefaultModifier_in_entryRuleContextDefaultModifier10797);
            iv_ruleContextDefaultModifier=ruleContextDefaultModifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextDefaultModifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDefaultModifier10807); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextDefaultModifier


    // $ANTLR start ruleContextDefaultModifier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5537:1: ruleContextDefaultModifier returns [EObject current=null] : ( () ( (lv_type_1_0= ruleContextDefaultModifierType ) ) ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleContextDefaultModifier() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5542:6: ( ( () ( (lv_type_1_0= ruleContextDefaultModifierType ) ) ( (lv_value_2_0= RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5543:1: ( () ( (lv_type_1_0= ruleContextDefaultModifierType ) ) ( (lv_value_2_0= RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5543:1: ( () ( (lv_type_1_0= ruleContextDefaultModifierType ) ) ( (lv_value_2_0= RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5543:2: () ( (lv_type_1_0= ruleContextDefaultModifierType ) ) ( (lv_value_2_0= RULE_ID ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5543:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5544:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getContextDefaultModifierAccess().getContextDefaultModifierAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getContextDefaultModifierAccess().getContextDefaultModifierAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5557:2: ( (lv_type_1_0= ruleContextDefaultModifierType ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5558:1: (lv_type_1_0= ruleContextDefaultModifierType )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5558:1: (lv_type_1_0= ruleContextDefaultModifierType )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5559:3: lv_type_1_0= ruleContextDefaultModifierType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getContextDefaultModifierAccess().getTypeContextDefaultModifierTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleContextDefaultModifierType_in_ruleContextDefaultModifier10865);
            lv_type_1_0=ruleContextDefaultModifierType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getContextDefaultModifierRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"ContextDefaultModifierType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5581:2: ( (lv_value_2_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5582:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5582:1: (lv_value_2_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5583:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContextDefaultModifier10882); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getContextDefaultModifierAccess().getValueIDTerminalRuleCall_2_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getContextDefaultModifierRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
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
        }
        return current;
    }
    // $ANTLR end ruleContextDefaultModifier


    // $ANTLR start entryRuleContextDefaultModifierType
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5613:1: entryRuleContextDefaultModifierType returns [EObject current=null] : iv_ruleContextDefaultModifierType= ruleContextDefaultModifierType EOF ;
    public final EObject entryRuleContextDefaultModifierType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDefaultModifierType = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5614:2: (iv_ruleContextDefaultModifierType= ruleContextDefaultModifierType EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5615:2: iv_ruleContextDefaultModifierType= ruleContextDefaultModifierType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextDefaultModifierTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextDefaultModifierType_in_entryRuleContextDefaultModifierType10922);
            iv_ruleContextDefaultModifierType=ruleContextDefaultModifierType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextDefaultModifierType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextDefaultModifierType10932); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextDefaultModifierType


    // $ANTLR start ruleContextDefaultModifierType
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5622:1: ruleContextDefaultModifierType returns [EObject current=null] : ( () ( KEYWORD_73 | KEYWORD_63 | KEYWORD_66 | KEYWORD_80 | KEYWORD_59 | KEYWORD_53 | KEYWORD_51 | KEYWORD_78 | KEYWORD_46 ) ) ;
    public final EObject ruleContextDefaultModifierType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5627:6: ( ( () ( KEYWORD_73 | KEYWORD_63 | KEYWORD_66 | KEYWORD_80 | KEYWORD_59 | KEYWORD_53 | KEYWORD_51 | KEYWORD_78 | KEYWORD_46 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5628:1: ( () ( KEYWORD_73 | KEYWORD_63 | KEYWORD_66 | KEYWORD_80 | KEYWORD_59 | KEYWORD_53 | KEYWORD_51 | KEYWORD_78 | KEYWORD_46 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5628:1: ( () ( KEYWORD_73 | KEYWORD_63 | KEYWORD_66 | KEYWORD_80 | KEYWORD_59 | KEYWORD_53 | KEYWORD_51 | KEYWORD_78 | KEYWORD_46 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5628:2: () ( KEYWORD_73 | KEYWORD_63 | KEYWORD_66 | KEYWORD_80 | KEYWORD_59 | KEYWORD_53 | KEYWORD_51 | KEYWORD_78 | KEYWORD_46 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5628:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5629:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getContextDefaultModifierTypeAccess().getContextDefaultModifierTypeAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getContextDefaultModifierTypeAccess().getContextDefaultModifierTypeAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5642:2: ( KEYWORD_73 | KEYWORD_63 | KEYWORD_66 | KEYWORD_80 | KEYWORD_59 | KEYWORD_53 | KEYWORD_51 | KEYWORD_78 | KEYWORD_46 )
            int alt64=9;
            switch ( input.LA(1) ) {
            case KEYWORD_73:
                {
                alt64=1;
                }
                break;
            case KEYWORD_63:
                {
                alt64=2;
                }
                break;
            case KEYWORD_66:
                {
                alt64=3;
                }
                break;
            case KEYWORD_80:
                {
                alt64=4;
                }
                break;
            case KEYWORD_59:
                {
                alt64=5;
                }
                break;
            case KEYWORD_53:
                {
                alt64=6;
                }
                break;
            case KEYWORD_51:
                {
                alt64=7;
                }
                break;
            case KEYWORD_78:
                {
                alt64=8;
                }
                break;
            case KEYWORD_46:
                {
                alt64=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5642:2: ( KEYWORD_73 | KEYWORD_63 | KEYWORD_66 | KEYWORD_80 | KEYWORD_59 | KEYWORD_53 | KEYWORD_51 | KEYWORD_78 | KEYWORD_46 )", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5643:2: KEYWORD_73
                    {
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleContextDefaultModifierType10981); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getConsistsKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5649:2: KEYWORD_63
                    {
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleContextDefaultModifierType10998); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getRemoveKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5655:2: KEYWORD_66
                    {
                    match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleContextDefaultModifierType11015); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getAcceptsKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5661:2: KEYWORD_80
                    {
                    match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleContextDefaultModifierType11032); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getDefaultchildKeyword_1_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5667:2: KEYWORD_59
                    {
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleContextDefaultModifierType11049); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getDeniesKeyword_1_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5673:2: KEYWORD_53
                    {
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleContextDefaultModifierType11066); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getAliasKeyword_1_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5679:2: KEYWORD_51
                    {
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleContextDefaultModifierType11083); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getTypeKeyword_1_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5685:2: KEYWORD_78
                    {
                    match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleContextDefaultModifierType11100); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getDescriptionKeyword_1_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5691:2: KEYWORD_46
                    {
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleContextDefaultModifierType11117); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getContextDefaultModifierTypeAccess().getNameKeyword_1_8(), null); 
                          
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
    // $ANTLR end ruleContextDefaultModifierType


    // $ANTLR start entryRuleRelativeMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5703:1: entryRuleRelativeMusic returns [EObject current=null] : iv_ruleRelativeMusic= ruleRelativeMusic EOF ;
    public final EObject entryRuleRelativeMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5704:2: (iv_ruleRelativeMusic= ruleRelativeMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5705:2: iv_ruleRelativeMusic= ruleRelativeMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelativeMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic11153);
            iv_ruleRelativeMusic=ruleRelativeMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRelativeMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeMusic11163); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5712:1: ruleRelativeMusic returns [EObject current=null] : ( KEYWORD_75 ( (lv_pitch_1_0= rulePitch ) )? ( (lv_music_2_0= ruleCompositeMusic ) ) ) ;
    public final EObject ruleRelativeMusic() throws RecognitionException {
        EObject current = null;

        EObject lv_pitch_1_0 = null;

        EObject lv_music_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5717:6: ( ( KEYWORD_75 ( (lv_pitch_1_0= rulePitch ) )? ( (lv_music_2_0= ruleCompositeMusic ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5718:1: ( KEYWORD_75 ( (lv_pitch_1_0= rulePitch ) )? ( (lv_music_2_0= ruleCompositeMusic ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5718:1: ( KEYWORD_75 ( (lv_pitch_1_0= rulePitch ) )? ( (lv_music_2_0= ruleCompositeMusic ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5719:2: KEYWORD_75 ( (lv_pitch_1_0= rulePitch ) )? ( (lv_music_2_0= ruleCompositeMusic ) )
            {
            match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleRelativeMusic11199); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRelativeMusicAccess().getRelativeKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5723:1: ( (lv_pitch_1_0= rulePitch ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5724:1: (lv_pitch_1_0= rulePitch )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5724:1: (lv_pitch_1_0= rulePitch )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5725:3: lv_pitch_1_0= rulePitch
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRelativeMusicAccess().getPitchPitchParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePitch_in_ruleRelativeMusic11220);
                    lv_pitch_1_0=rulePitch();
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
                      	        		lv_pitch_1_0, 
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5747:3: ( (lv_music_2_0= ruleCompositeMusic ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5748:1: (lv_music_2_0= ruleCompositeMusic )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5748:1: (lv_music_2_0= ruleCompositeMusic )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5749:3: lv_music_2_0= ruleCompositeMusic
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRelativeMusicAccess().getMusicCompositeMusicParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeMusic_in_ruleRelativeMusic11242);
            lv_music_2_0=ruleCompositeMusic();
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
              	        		lv_music_2_0, 
              	        		"CompositeMusic", 
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


    // $ANTLR start entryRuleRepeatedMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5779:1: entryRuleRepeatedMusic returns [EObject current=null] : iv_ruleRepeatedMusic= ruleRepeatedMusic EOF ;
    public final EObject entryRuleRepeatedMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatedMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5780:2: (iv_ruleRepeatedMusic= ruleRepeatedMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5781:2: iv_ruleRepeatedMusic= ruleRepeatedMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRepeatedMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRepeatedMusic_in_entryRuleRepeatedMusic11277);
            iv_ruleRepeatedMusic=ruleRepeatedMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRepeatedMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeatedMusic11287); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRepeatedMusic


    // $ANTLR start ruleRepeatedMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5788:1: ruleRepeatedMusic returns [EObject current=null] : ( KEYWORD_64 ( (lv_type_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_INT ) ) ( (lv_music_3_0= ruleMusic ) ) ( (lv_alternative_4_0= ruleAlternativeMusic ) )? ) ;
    public final EObject ruleRepeatedMusic() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token lv_number_2_0=null;
        EObject lv_music_3_0 = null;

        EObject lv_alternative_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5793:6: ( ( KEYWORD_64 ( (lv_type_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_INT ) ) ( (lv_music_3_0= ruleMusic ) ) ( (lv_alternative_4_0= ruleAlternativeMusic ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5794:1: ( KEYWORD_64 ( (lv_type_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_INT ) ) ( (lv_music_3_0= ruleMusic ) ) ( (lv_alternative_4_0= ruleAlternativeMusic ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5794:1: ( KEYWORD_64 ( (lv_type_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_INT ) ) ( (lv_music_3_0= ruleMusic ) ) ( (lv_alternative_4_0= ruleAlternativeMusic ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5795:2: KEYWORD_64 ( (lv_type_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_INT ) ) ( (lv_music_3_0= ruleMusic ) ) ( (lv_alternative_4_0= ruleAlternativeMusic ) )?
            {
            match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleRepeatedMusic11323); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRepeatedMusicAccess().getRepeatKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5799:1: ( (lv_type_1_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5800:1: (lv_type_1_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5800:1: (lv_type_1_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5801:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepeatedMusic11340); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getRepeatedMusicAccess().getTypeIDTerminalRuleCall_1_0(), "type"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRepeatedMusicRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5823:2: ( (lv_number_2_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5824:1: (lv_number_2_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5824:1: (lv_number_2_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5825:3: lv_number_2_0= RULE_INT
            {
            lv_number_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatedMusic11362); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getRepeatedMusicAccess().getNumberINTTerminalRuleCall_2_0(), "number"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRepeatedMusicRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"number",
              	        		lv_number_2_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5847:2: ( (lv_music_3_0= ruleMusic ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5848:1: (lv_music_3_0= ruleMusic )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5848:1: (lv_music_3_0= ruleMusic )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5849:3: lv_music_3_0= ruleMusic
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRepeatedMusicAccess().getMusicMusicParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMusic_in_ruleRepeatedMusic11388);
            lv_music_3_0=ruleMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRepeatedMusicRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"music",
              	        		lv_music_3_0, 
              	        		"Music", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5871:2: ( (lv_alternative_4_0= ruleAlternativeMusic ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==KEYWORD_77) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred126()) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5872:1: (lv_alternative_4_0= ruleAlternativeMusic )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5872:1: (lv_alternative_4_0= ruleAlternativeMusic )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5873:3: lv_alternative_4_0= ruleAlternativeMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRepeatedMusicAccess().getAlternativeAlternativeMusicParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlternativeMusic_in_ruleRepeatedMusic11409);
                    lv_alternative_4_0=ruleAlternativeMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRepeatedMusicRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"alternative",
                      	        		lv_alternative_4_0, 
                      	        		"AlternativeMusic", 
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
    // $ANTLR end ruleRepeatedMusic


    // $ANTLR start entryRuleAlternativeMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5903:1: entryRuleAlternativeMusic returns [EObject current=null] : iv_ruleAlternativeMusic= ruleAlternativeMusic EOF ;
    public final EObject entryRuleAlternativeMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeMusic = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5904:2: (iv_ruleAlternativeMusic= ruleAlternativeMusic EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5905:2: iv_ruleAlternativeMusic= ruleAlternativeMusic EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAlternativeMusicRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAlternativeMusic_in_entryRuleAlternativeMusic11445);
            iv_ruleAlternativeMusic=ruleAlternativeMusic();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAlternativeMusic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeMusic11455); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAlternativeMusic


    // $ANTLR start ruleAlternativeMusic
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5912:1: ruleAlternativeMusic returns [EObject current=null] : ( () KEYWORD_77 KEYWORD_22 ( (lv_music_3_0= ruleMusicOrScheme ) )* KEYWORD_24 ) ;
    public final EObject ruleAlternativeMusic() throws RecognitionException {
        EObject current = null;

        EObject lv_music_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5917:6: ( ( () KEYWORD_77 KEYWORD_22 ( (lv_music_3_0= ruleMusicOrScheme ) )* KEYWORD_24 ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5918:1: ( () KEYWORD_77 KEYWORD_22 ( (lv_music_3_0= ruleMusicOrScheme ) )* KEYWORD_24 )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5918:1: ( () KEYWORD_77 KEYWORD_22 ( (lv_music_3_0= ruleMusicOrScheme ) )* KEYWORD_24 )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5918:2: () KEYWORD_77 KEYWORD_22 ( (lv_music_3_0= ruleMusicOrScheme ) )* KEYWORD_24
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5918:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5919:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getAlternativeMusicAccess().getAlternativeMusicAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getAlternativeMusicAccess().getAlternativeMusicAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleAlternativeMusic11503); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAlternativeMusicAccess().getAlternativeKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleAlternativeMusic11514); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAlternativeMusicAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5942:1: ( (lv_music_3_0= ruleMusicOrScheme ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==KEYWORD_2||LA67_0==KEYWORD_13||LA67_0==KEYWORD_18||(LA67_0>=KEYWORD_22 && LA67_0<=KEYWORD_23)||LA67_0==KEYWORD_29||LA67_0==KEYWORD_36||(LA67_0>=KEYWORD_38 && LA67_0<=KEYWORD_42)||LA67_0==KEYWORD_44||LA67_0==KEYWORD_47||(LA67_0>=KEYWORD_49 && LA67_0<=KEYWORD_50)||(LA67_0>=KEYWORD_56 && LA67_0<=KEYWORD_58)||(LA67_0>=KEYWORD_64 && LA67_0<=KEYWORD_65)||LA67_0==KEYWORD_70||(LA67_0>=KEYWORD_74 && LA67_0<=KEYWORD_76)||LA67_0==KEYWORD_81||LA67_0==RULE_ID) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5943:1: (lv_music_3_0= ruleMusicOrScheme )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5943:1: (lv_music_3_0= ruleMusicOrScheme )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5944:3: lv_music_3_0= ruleMusicOrScheme
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAlternativeMusicAccess().getMusicMusicOrSchemeParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMusicOrScheme_in_ruleAlternativeMusic11535);
            	    lv_music_3_0=ruleMusicOrScheme();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAlternativeMusicRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"music",
            	      	        		lv_music_3_0, 
            	      	        		"MusicOrScheme", 
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
            	    break loop67;
                }
            } while (true);

            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleAlternativeMusic11547); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAlternativeMusicAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleAlternativeMusic


    // $ANTLR start entryRuleMusicOrScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5979:1: entryRuleMusicOrScheme returns [EObject current=null] : iv_ruleMusicOrScheme= ruleMusicOrScheme EOF ;
    public final EObject entryRuleMusicOrScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicOrScheme = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5980:2: (iv_ruleMusicOrScheme= ruleMusicOrScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5981:2: iv_ruleMusicOrScheme= ruleMusicOrScheme EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMusicOrSchemeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMusicOrScheme_in_entryRuleMusicOrScheme11582);
            iv_ruleMusicOrScheme=ruleMusicOrScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMusicOrScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMusicOrScheme11592); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMusicOrScheme


    // $ANTLR start ruleMusicOrScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5988:1: ruleMusicOrScheme returns [EObject current=null] : (this_Music_0= ruleMusic | this_Scheme_1= ruleScheme ) ;
    public final EObject ruleMusicOrScheme() throws RecognitionException {
        EObject current = null;

        EObject this_Music_0 = null;

        EObject this_Scheme_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5993:6: ( (this_Music_0= ruleMusic | this_Scheme_1= ruleScheme ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5994:1: (this_Music_0= ruleMusic | this_Scheme_1= ruleScheme )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5994:1: (this_Music_0= ruleMusic | this_Scheme_1= ruleScheme )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==KEYWORD_13||LA68_0==KEYWORD_18||(LA68_0>=KEYWORD_22 && LA68_0<=KEYWORD_23)||LA68_0==KEYWORD_29||LA68_0==KEYWORD_36||(LA68_0>=KEYWORD_38 && LA68_0<=KEYWORD_42)||LA68_0==KEYWORD_44||LA68_0==KEYWORD_47||(LA68_0>=KEYWORD_49 && LA68_0<=KEYWORD_50)||(LA68_0>=KEYWORD_56 && LA68_0<=KEYWORD_58)||(LA68_0>=KEYWORD_64 && LA68_0<=KEYWORD_65)||LA68_0==KEYWORD_70||(LA68_0>=KEYWORD_74 && LA68_0<=KEYWORD_76)||LA68_0==KEYWORD_81||LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==KEYWORD_2) ) {
                alt68=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5994:1: (this_Music_0= ruleMusic | this_Scheme_1= ruleScheme )", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5995:2: this_Music_0= ruleMusic
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMusicOrSchemeAccess().getMusicParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMusic_in_ruleMusicOrScheme11642);
                    this_Music_0=ruleMusic();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Music_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6008:2: this_Scheme_1= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMusicOrSchemeAccess().getSchemeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleMusicOrScheme11672);
                    this_Scheme_1=ruleScheme();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Scheme_1;
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
    // $ANTLR end ruleMusicOrScheme


    // $ANTLR start entryRuleDuration
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6027:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6028:2: (iv_ruleDuration= ruleDuration EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6029:2: iv_ruleDuration= ruleDuration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDurationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDuration_in_entryRuleDuration11706);
            iv_ruleDuration=ruleDuration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDuration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuration11716); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDuration


    // $ANTLR start ruleDuration
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6036:1: ruleDuration returns [EObject current=null] : ( ( (lv_base_0_0= RULE_INT ) ) ( (lv_dots_1_0= KEYWORD_10 ) )* ( (lv_multipliers_2_0= ruleDurationMultiplier ) )* ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token lv_dots_1_0=null;
        EObject lv_multipliers_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6041:6: ( ( ( (lv_base_0_0= RULE_INT ) ) ( (lv_dots_1_0= KEYWORD_10 ) )* ( (lv_multipliers_2_0= ruleDurationMultiplier ) )* ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6042:1: ( ( (lv_base_0_0= RULE_INT ) ) ( (lv_dots_1_0= KEYWORD_10 ) )* ( (lv_multipliers_2_0= ruleDurationMultiplier ) )* )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6042:1: ( ( (lv_base_0_0= RULE_INT ) ) ( (lv_dots_1_0= KEYWORD_10 ) )* ( (lv_multipliers_2_0= ruleDurationMultiplier ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6042:2: ( (lv_base_0_0= RULE_INT ) ) ( (lv_dots_1_0= KEYWORD_10 ) )* ( (lv_multipliers_2_0= ruleDurationMultiplier ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6042:2: ( (lv_base_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6043:1: (lv_base_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6043:1: (lv_base_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6044:3: lv_base_0_0= RULE_INT
            {
            lv_base_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDuration11758); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getDurationAccess().getBaseINTTerminalRuleCall_0_0(), "base"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDurationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"base",
              	        		lv_base_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6066:2: ( (lv_dots_1_0= KEYWORD_10 ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==KEYWORD_10) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6067:1: (lv_dots_1_0= KEYWORD_10 )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6067:1: (lv_dots_1_0= KEYWORD_10 )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6068:3: lv_dots_1_0= KEYWORD_10
            	    {
            	    lv_dots_1_0=(Token)input.LT(1);
            	    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleDuration11782); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getDurationAccess().getDotsFullStopKeyword_1_0(), "dots"); 
            	          
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDurationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "dots", lv_dots_1_0, ".", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6088:3: ( (lv_multipliers_2_0= ruleDurationMultiplier ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==KEYWORD_6) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6089:1: (lv_multipliers_2_0= ruleDurationMultiplier )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6089:1: (lv_multipliers_2_0= ruleDurationMultiplier )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6090:3: lv_multipliers_2_0= ruleDurationMultiplier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDurationAccess().getMultipliersDurationMultiplierParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDurationMultiplier_in_ruleDuration11817);
            	    lv_multipliers_2_0=ruleDurationMultiplier();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDurationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"multipliers",
            	      	        		lv_multipliers_2_0, 
            	      	        		"DurationMultiplier", 
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
            	    break loop70;
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
        }
        return current;
    }
    // $ANTLR end ruleDuration


    // $ANTLR start entryRuleDurationMultiplier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6120:1: entryRuleDurationMultiplier returns [EObject current=null] : iv_ruleDurationMultiplier= ruleDurationMultiplier EOF ;
    public final EObject entryRuleDurationMultiplier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDurationMultiplier = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6121:2: (iv_ruleDurationMultiplier= ruleDurationMultiplier EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6122:2: iv_ruleDurationMultiplier= ruleDurationMultiplier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDurationMultiplierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDurationMultiplier_in_entryRuleDurationMultiplier11853);
            iv_ruleDurationMultiplier=ruleDurationMultiplier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDurationMultiplier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDurationMultiplier11863); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDurationMultiplier


    // $ANTLR start ruleDurationMultiplier
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6129:1: ruleDurationMultiplier returns [EObject current=null] : ( KEYWORD_6 this_FractionOrNumber_1= ruleFractionOrNumber ) ;
    public final EObject ruleDurationMultiplier() throws RecognitionException {
        EObject current = null;

        EObject this_FractionOrNumber_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6134:6: ( ( KEYWORD_6 this_FractionOrNumber_1= ruleFractionOrNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6135:1: ( KEYWORD_6 this_FractionOrNumber_1= ruleFractionOrNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6135:1: ( KEYWORD_6 this_FractionOrNumber_1= ruleFractionOrNumber )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6136:2: KEYWORD_6 this_FractionOrNumber_1= ruleFractionOrNumber
            {
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleDurationMultiplier11899); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDurationMultiplierAccess().getAsteriskKeyword_0(), null); 
                  
            }
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDurationMultiplierAccess().getFractionOrNumberParserRuleCall_1(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleFractionOrNumber_in_ruleDurationMultiplier11924);
            this_FractionOrNumber_1=ruleFractionOrNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

                      current = this_FractionOrNumber_1;
                      currentNode = currentNode.getParent();
                  
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
    // $ANTLR end ruleDurationMultiplier


    // $ANTLR start entryRuleFraction
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6160:1: entryRuleFraction returns [EObject current=null] : iv_ruleFraction= ruleFraction EOF ;
    public final EObject entryRuleFraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6164:2: (iv_ruleFraction= ruleFraction EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6165:2: iv_ruleFraction= ruleFraction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFractionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFraction_in_entryRuleFraction11964);
            iv_ruleFraction=ruleFraction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFraction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFraction11974); if (failed) return current;

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
    // $ANTLR end entryRuleFraction


    // $ANTLR start ruleFraction
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6175:1: ruleFraction returns [EObject current=null] : ( ( (lv_numerator_0_0= RULE_INT ) ) KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFraction() throws RecognitionException {
        EObject current = null;

        Token lv_numerator_0_0=null;
        Token lv_denominator_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6181:6: ( ( ( (lv_numerator_0_0= RULE_INT ) ) KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6182:1: ( ( (lv_numerator_0_0= RULE_INT ) ) KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6182:1: ( ( (lv_numerator_0_0= RULE_INT ) ) KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6182:2: ( (lv_numerator_0_0= RULE_INT ) ) KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6182:2: ( (lv_numerator_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6183:1: (lv_numerator_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6183:1: (lv_numerator_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6184:3: lv_numerator_0_0= RULE_INT
            {
            lv_numerator_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFraction12020); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFractionAccess().getNumeratorINTTerminalRuleCall_0_0(), "numerator"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFractionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"numerator",
              	        		lv_numerator_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleFraction12036); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFractionAccess().getSolidusKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6211:1: ( (lv_denominator_2_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6212:1: (lv_denominator_2_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6212:1: (lv_denominator_2_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6213:3: lv_denominator_2_0= RULE_INT
            {
            lv_denominator_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFraction12053); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFractionAccess().getDenominatorINTTerminalRuleCall_2_0(), "denominator"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFractionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"denominator",
              	        		lv_denominator_2_0, 
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
    // $ANTLR end ruleFraction


    // $ANTLR start entryRuleFractionOrNumber
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6246:1: entryRuleFractionOrNumber returns [EObject current=null] : iv_ruleFractionOrNumber= ruleFractionOrNumber EOF ;
    public final EObject entryRuleFractionOrNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFractionOrNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6250:2: (iv_ruleFractionOrNumber= ruleFractionOrNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6251:2: iv_ruleFractionOrNumber= ruleFractionOrNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFractionOrNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFractionOrNumber_in_entryRuleFractionOrNumber12103);
            iv_ruleFractionOrNumber=ruleFractionOrNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFractionOrNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFractionOrNumber12113); if (failed) return current;

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
    // $ANTLR end entryRuleFractionOrNumber


    // $ANTLR start ruleFractionOrNumber
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6261:1: ruleFractionOrNumber returns [EObject current=null] : ( ( (lv_numerator_0_0= RULE_INT ) ) ( KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleFractionOrNumber() throws RecognitionException {
        EObject current = null;

        Token lv_numerator_0_0=null;
        Token lv_denominator_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6267:6: ( ( ( (lv_numerator_0_0= RULE_INT ) ) ( KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) )? ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6268:1: ( ( (lv_numerator_0_0= RULE_INT ) ) ( KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) )? )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6268:1: ( ( (lv_numerator_0_0= RULE_INT ) ) ( KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6268:2: ( (lv_numerator_0_0= RULE_INT ) ) ( KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) )?
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6268:2: ( (lv_numerator_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6269:1: (lv_numerator_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6269:1: (lv_numerator_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6270:3: lv_numerator_0_0= RULE_INT
            {
            lv_numerator_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFractionOrNumber12159); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFractionOrNumberAccess().getNumeratorINTTerminalRuleCall_0_0(), "numerator"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFractionOrNumberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"numerator",
              	        		lv_numerator_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6292:2: ( KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==KEYWORD_11) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6293:2: KEYWORD_11 ( (lv_denominator_2_0= RULE_INT ) )
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleFractionOrNumber12176); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFractionOrNumberAccess().getSolidusKeyword_1_0(), null); 
                          
                    }
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6297:1: ( (lv_denominator_2_0= RULE_INT ) )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6298:1: (lv_denominator_2_0= RULE_INT )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6298:1: (lv_denominator_2_0= RULE_INT )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6299:3: lv_denominator_2_0= RULE_INT
                    {
                    lv_denominator_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFractionOrNumber12193); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getFractionOrNumberAccess().getDenominatorINTTerminalRuleCall_1_1_0(), "denominator"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFractionOrNumberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"denominator",
                      	        		lv_denominator_2_0, 
                      	        		"INT", 
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
    // $ANTLR end ruleFractionOrNumber


    // $ANTLR start entryRuleContextChange
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6332:1: entryRuleContextChange returns [EObject current=null] : iv_ruleContextChange= ruleContextChange EOF ;
    public final EObject entryRuleContextChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextChange = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6333:2: (iv_ruleContextChange= ruleContextChange EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6334:2: iv_ruleContextChange= ruleContextChange EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextChangeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextChange_in_entryRuleContextChange12239);
            iv_ruleContextChange=ruleContextChange();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextChange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextChange12249); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextChange


    // $ANTLR start ruleContextChange
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6341:1: ruleContextChange returns [EObject current=null] : ( KEYWORD_58 ( (lv_context_1_0= RULE_ID ) ) KEYWORD_14 ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleContextChange() throws RecognitionException {
        EObject current = null;

        Token lv_context_1_0=null;
        Token lv_id_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6346:6: ( ( KEYWORD_58 ( (lv_context_1_0= RULE_ID ) ) KEYWORD_14 ( (lv_id_3_0= RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6347:1: ( KEYWORD_58 ( (lv_context_1_0= RULE_ID ) ) KEYWORD_14 ( (lv_id_3_0= RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6347:1: ( KEYWORD_58 ( (lv_context_1_0= RULE_ID ) ) KEYWORD_14 ( (lv_id_3_0= RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6348:2: KEYWORD_58 ( (lv_context_1_0= RULE_ID ) ) KEYWORD_14 ( (lv_id_3_0= RULE_ID ) )
            {
            match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleContextChange12285); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextChangeAccess().getChangeKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6352:1: ( (lv_context_1_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6353:1: (lv_context_1_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6353:1: (lv_context_1_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6354:3: lv_context_1_0= RULE_ID
            {
            lv_context_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContextChange12302); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getContextChangeAccess().getContextIDTerminalRuleCall_1_0(), "context"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getContextChangeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"context",
              	        		lv_context_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleContextChange12318); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getContextChangeAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6381:1: ( (lv_id_3_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6382:1: (lv_id_3_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6382:1: (lv_id_3_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6383:3: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContextChange12335); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getContextChangeAccess().getIdIDTerminalRuleCall_3_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getContextChangeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_3_0, 
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
        }
        return current;
    }
    // $ANTLR end ruleContextChange


    // $ANTLR start entryRuleMusicPropertyDefinition
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6413:1: entryRuleMusicPropertyDefinition returns [EObject current=null] : iv_ruleMusicPropertyDefinition= ruleMusicPropertyDefinition EOF ;
    public final EObject entryRuleMusicPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicPropertyDefinition = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6414:2: (iv_ruleMusicPropertyDefinition= ruleMusicPropertyDefinition EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6415:2: iv_ruleMusicPropertyDefinition= ruleMusicPropertyDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMusicPropertyDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMusicPropertyDefinition_in_entryRuleMusicPropertyDefinition12375);
            iv_ruleMusicPropertyDefinition=ruleMusicPropertyDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMusicPropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMusicPropertyDefinition12385); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMusicPropertyDefinition


    // $ANTLR start ruleMusicPropertyDefinition
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6422:1: ruleMusicPropertyDefinition returns [EObject current=null] : ( ( (lv_once_0_0= KEYWORD_47 ) )? ( (lv_operation_1_0= ruleMusicPropertyOperation ) ) ) ;
    public final EObject ruleMusicPropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_once_0_0=null;
        EObject lv_operation_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6427:6: ( ( ( (lv_once_0_0= KEYWORD_47 ) )? ( (lv_operation_1_0= ruleMusicPropertyOperation ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6428:1: ( ( (lv_once_0_0= KEYWORD_47 ) )? ( (lv_operation_1_0= ruleMusicPropertyOperation ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6428:1: ( ( (lv_once_0_0= KEYWORD_47 ) )? ( (lv_operation_1_0= ruleMusicPropertyOperation ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6428:2: ( (lv_once_0_0= KEYWORD_47 ) )? ( (lv_operation_1_0= ruleMusicPropertyOperation ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6428:2: ( (lv_once_0_0= KEYWORD_47 ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==KEYWORD_47) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6429:1: (lv_once_0_0= KEYWORD_47 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6429:1: (lv_once_0_0= KEYWORD_47 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6430:3: lv_once_0_0= KEYWORD_47
                    {
                    lv_once_0_0=(Token)input.LT(1);
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleMusicPropertyDefinition12429); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMusicPropertyDefinitionAccess().getOnceOnceKeyword_0_0(), "once"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMusicPropertyDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "once", true, "\\once", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6450:3: ( (lv_operation_1_0= ruleMusicPropertyOperation ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6451:1: (lv_operation_1_0= ruleMusicPropertyOperation )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6451:1: (lv_operation_1_0= ruleMusicPropertyOperation )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6452:3: lv_operation_1_0= ruleMusicPropertyOperation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMusicPropertyDefinitionAccess().getOperationMusicPropertyOperationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMusicPropertyOperation_in_ruleMusicPropertyDefinition12464);
            lv_operation_1_0=ruleMusicPropertyOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMusicPropertyDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operation",
              	        		lv_operation_1_0, 
              	        		"MusicPropertyOperation", 
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
    // $ANTLR end ruleMusicPropertyDefinition


    // $ANTLR start entryRuleMusicPropertyOperation
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6482:1: entryRuleMusicPropertyOperation returns [EObject current=null] : iv_ruleMusicPropertyOperation= ruleMusicPropertyOperation EOF ;
    public final EObject entryRuleMusicPropertyOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicPropertyOperation = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6483:2: (iv_ruleMusicPropertyOperation= ruleMusicPropertyOperation EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6484:2: iv_ruleMusicPropertyOperation= ruleMusicPropertyOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMusicPropertyOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMusicPropertyOperation_in_entryRuleMusicPropertyOperation12499);
            iv_ruleMusicPropertyOperation=ruleMusicPropertyOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMusicPropertyOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMusicPropertyOperation12509); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMusicPropertyOperation


    // $ANTLR start ruleMusicPropertyOperation
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6491:1: ruleMusicPropertyOperation returns [EObject current=null] : (this_OverrideMusicProperty_0= ruleOverrideMusicProperty | this_RevertMusicProperty_1= ruleRevertMusicProperty | this_SetMusicProperty_2= ruleSetMusicProperty | this_UnsetMusicProperty_3= ruleUnsetMusicProperty ) ;
    public final EObject ruleMusicPropertyOperation() throws RecognitionException {
        EObject current = null;

        EObject this_OverrideMusicProperty_0 = null;

        EObject this_RevertMusicProperty_1 = null;

        EObject this_SetMusicProperty_2 = null;

        EObject this_UnsetMusicProperty_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6496:6: ( (this_OverrideMusicProperty_0= ruleOverrideMusicProperty | this_RevertMusicProperty_1= ruleRevertMusicProperty | this_SetMusicProperty_2= ruleSetMusicProperty | this_UnsetMusicProperty_3= ruleUnsetMusicProperty ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6497:1: (this_OverrideMusicProperty_0= ruleOverrideMusicProperty | this_RevertMusicProperty_1= ruleRevertMusicProperty | this_SetMusicProperty_2= ruleSetMusicProperty | this_UnsetMusicProperty_3= ruleUnsetMusicProperty )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6497:1: (this_OverrideMusicProperty_0= ruleOverrideMusicProperty | this_RevertMusicProperty_1= ruleRevertMusicProperty | this_SetMusicProperty_2= ruleSetMusicProperty | this_UnsetMusicProperty_3= ruleUnsetMusicProperty )
            int alt73=4;
            switch ( input.LA(1) ) {
            case KEYWORD_74:
                {
                alt73=1;
                }
                break;
            case KEYWORD_65:
                {
                alt73=2;
                }
                break;
            case KEYWORD_42:
                {
                alt73=3;
                }
                break;
            case KEYWORD_57:
                {
                alt73=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6497:1: (this_OverrideMusicProperty_0= ruleOverrideMusicProperty | this_RevertMusicProperty_1= ruleRevertMusicProperty | this_SetMusicProperty_2= ruleSetMusicProperty | this_UnsetMusicProperty_3= ruleUnsetMusicProperty )", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6498:2: this_OverrideMusicProperty_0= ruleOverrideMusicProperty
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMusicPropertyOperationAccess().getOverrideMusicPropertyParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOverrideMusicProperty_in_ruleMusicPropertyOperation12559);
                    this_OverrideMusicProperty_0=ruleOverrideMusicProperty();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_OverrideMusicProperty_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6511:2: this_RevertMusicProperty_1= ruleRevertMusicProperty
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMusicPropertyOperationAccess().getRevertMusicPropertyParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRevertMusicProperty_in_ruleMusicPropertyOperation12589);
                    this_RevertMusicProperty_1=ruleRevertMusicProperty();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_RevertMusicProperty_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6524:2: this_SetMusicProperty_2= ruleSetMusicProperty
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMusicPropertyOperationAccess().getSetMusicPropertyParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetMusicProperty_in_ruleMusicPropertyOperation12619);
                    this_SetMusicProperty_2=ruleSetMusicProperty();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SetMusicProperty_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6537:2: this_UnsetMusicProperty_3= ruleUnsetMusicProperty
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMusicPropertyOperationAccess().getUnsetMusicPropertyParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnsetMusicProperty_in_ruleMusicPropertyOperation12649);
                    this_UnsetMusicProperty_3=ruleUnsetMusicProperty();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UnsetMusicProperty_3;
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
    // $ANTLR end ruleMusicPropertyOperation


    // $ANTLR start entryRuleOverrideMusicProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6556:1: entryRuleOverrideMusicProperty returns [EObject current=null] : iv_ruleOverrideMusicProperty= ruleOverrideMusicProperty EOF ;
    public final EObject entryRuleOverrideMusicProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideMusicProperty = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6557:2: (iv_ruleOverrideMusicProperty= ruleOverrideMusicProperty EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6558:2: iv_ruleOverrideMusicProperty= ruleOverrideMusicProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOverrideMusicPropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOverrideMusicProperty_in_entryRuleOverrideMusicProperty12683);
            iv_ruleOverrideMusicProperty=ruleOverrideMusicProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOverrideMusicProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverrideMusicProperty12693); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOverrideMusicProperty


    // $ANTLR start ruleOverrideMusicProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6565:1: ruleOverrideMusicProperty returns [EObject current=null] : ( KEYWORD_74 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScalar ) ) ) ;
    public final EObject ruleOverrideMusicProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_object_1_0 = null;

        EObject lv_path_2_0 = null;

        EObject lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6570:6: ( ( KEYWORD_74 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScalar ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6571:1: ( KEYWORD_74 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScalar ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6571:1: ( KEYWORD_74 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScalar ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6572:2: KEYWORD_74 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) KEYWORD_14 ( (lv_value_4_0= ruleScalar ) )
            {
            match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleOverrideMusicProperty12729); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOverrideMusicPropertyAccess().getOverrideKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6576:1: ( (lv_object_1_0= ruleContextPropertySpecification ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6577:1: (lv_object_1_0= ruleContextPropertySpecification )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6577:1: (lv_object_1_0= ruleContextPropertySpecification )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6578:3: lv_object_1_0= ruleContextPropertySpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOverrideMusicPropertyAccess().getObjectContextPropertySpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleContextPropertySpecification_in_ruleOverrideMusicProperty12750);
            lv_object_1_0=ruleContextPropertySpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOverrideMusicPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"object",
              	        		lv_object_1_0, 
              	        		"ContextPropertySpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6600:2: ( (lv_path_2_0= ruleScheme ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6601:1: (lv_path_2_0= ruleScheme )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6601:1: (lv_path_2_0= ruleScheme )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6602:3: lv_path_2_0= ruleScheme
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOverrideMusicPropertyAccess().getPathSchemeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScheme_in_ruleOverrideMusicProperty12771);
            lv_path_2_0=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOverrideMusicPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"path",
              	        		lv_path_2_0, 
              	        		"Scheme", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleOverrideMusicProperty12782); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOverrideMusicPropertyAccess().getEqualsSignKeyword_3(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6629:1: ( (lv_value_4_0= ruleScalar ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6630:1: (lv_value_4_0= ruleScalar )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6630:1: (lv_value_4_0= ruleScalar )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6631:3: lv_value_4_0= ruleScalar
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOverrideMusicPropertyAccess().getValueScalarParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScalar_in_ruleOverrideMusicProperty12803);
            lv_value_4_0=ruleScalar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOverrideMusicPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_4_0, 
              	        		"Scalar", 
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
    // $ANTLR end ruleOverrideMusicProperty


    // $ANTLR start entryRuleRevertMusicProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6661:1: entryRuleRevertMusicProperty returns [EObject current=null] : iv_ruleRevertMusicProperty= ruleRevertMusicProperty EOF ;
    public final EObject entryRuleRevertMusicProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRevertMusicProperty = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6662:2: (iv_ruleRevertMusicProperty= ruleRevertMusicProperty EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6663:2: iv_ruleRevertMusicProperty= ruleRevertMusicProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRevertMusicPropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRevertMusicProperty_in_entryRuleRevertMusicProperty12838);
            iv_ruleRevertMusicProperty=ruleRevertMusicProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRevertMusicProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRevertMusicProperty12848); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRevertMusicProperty


    // $ANTLR start ruleRevertMusicProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6670:1: ruleRevertMusicProperty returns [EObject current=null] : ( KEYWORD_65 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) ) ;
    public final EObject ruleRevertMusicProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_object_1_0 = null;

        EObject lv_path_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6675:6: ( ( KEYWORD_65 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6676:1: ( KEYWORD_65 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6676:1: ( KEYWORD_65 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6677:2: KEYWORD_65 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ( (lv_path_2_0= ruleScheme ) )
            {
            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleRevertMusicProperty12884); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRevertMusicPropertyAccess().getRevertKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6681:1: ( (lv_object_1_0= ruleContextPropertySpecification ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6682:1: (lv_object_1_0= ruleContextPropertySpecification )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6682:1: (lv_object_1_0= ruleContextPropertySpecification )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6683:3: lv_object_1_0= ruleContextPropertySpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRevertMusicPropertyAccess().getObjectContextPropertySpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleContextPropertySpecification_in_ruleRevertMusicProperty12905);
            lv_object_1_0=ruleContextPropertySpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRevertMusicPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"object",
              	        		lv_object_1_0, 
              	        		"ContextPropertySpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6705:2: ( (lv_path_2_0= ruleScheme ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6706:1: (lv_path_2_0= ruleScheme )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6706:1: (lv_path_2_0= ruleScheme )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6707:3: lv_path_2_0= ruleScheme
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRevertMusicPropertyAccess().getPathSchemeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScheme_in_ruleRevertMusicProperty12926);
            lv_path_2_0=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRevertMusicPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"path",
              	        		lv_path_2_0, 
              	        		"Scheme", 
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
    // $ANTLR end ruleRevertMusicProperty


    // $ANTLR start entryRuleSetMusicProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6737:1: entryRuleSetMusicProperty returns [EObject current=null] : iv_ruleSetMusicProperty= ruleSetMusicProperty EOF ;
    public final EObject entryRuleSetMusicProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetMusicProperty = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6738:2: (iv_ruleSetMusicProperty= ruleSetMusicProperty EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6739:2: iv_ruleSetMusicProperty= ruleSetMusicProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSetMusicPropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSetMusicProperty_in_entryRuleSetMusicProperty12961);
            iv_ruleSetMusicProperty=ruleSetMusicProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSetMusicProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetMusicProperty12971); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSetMusicProperty


    // $ANTLR start ruleSetMusicProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6746:1: ruleSetMusicProperty returns [EObject current=null] : ( KEYWORD_42 ( (lv_object_1_0= ruleContextPropertySpecification ) ) KEYWORD_14 ( (lv_value_3_0= ruleScalar ) ) ) ;
    public final EObject ruleSetMusicProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_object_1_0 = null;

        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6751:6: ( ( KEYWORD_42 ( (lv_object_1_0= ruleContextPropertySpecification ) ) KEYWORD_14 ( (lv_value_3_0= ruleScalar ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6752:1: ( KEYWORD_42 ( (lv_object_1_0= ruleContextPropertySpecification ) ) KEYWORD_14 ( (lv_value_3_0= ruleScalar ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6752:1: ( KEYWORD_42 ( (lv_object_1_0= ruleContextPropertySpecification ) ) KEYWORD_14 ( (lv_value_3_0= ruleScalar ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6753:2: KEYWORD_42 ( (lv_object_1_0= ruleContextPropertySpecification ) ) KEYWORD_14 ( (lv_value_3_0= ruleScalar ) )
            {
            match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleSetMusicProperty13007); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSetMusicPropertyAccess().getSetKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6757:1: ( (lv_object_1_0= ruleContextPropertySpecification ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6758:1: (lv_object_1_0= ruleContextPropertySpecification )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6758:1: (lv_object_1_0= ruleContextPropertySpecification )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6759:3: lv_object_1_0= ruleContextPropertySpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSetMusicPropertyAccess().getObjectContextPropertySpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleContextPropertySpecification_in_ruleSetMusicProperty13028);
            lv_object_1_0=ruleContextPropertySpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSetMusicPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"object",
              	        		lv_object_1_0, 
              	        		"ContextPropertySpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleSetMusicProperty13039); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSetMusicPropertyAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6786:1: ( (lv_value_3_0= ruleScalar ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6787:1: (lv_value_3_0= ruleScalar )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6787:1: (lv_value_3_0= ruleScalar )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6788:3: lv_value_3_0= ruleScalar
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSetMusicPropertyAccess().getValueScalarParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScalar_in_ruleSetMusicProperty13060);
            lv_value_3_0=ruleScalar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSetMusicPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_3_0, 
              	        		"Scalar", 
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
    // $ANTLR end ruleSetMusicProperty


    // $ANTLR start entryRuleUnsetMusicProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6818:1: entryRuleUnsetMusicProperty returns [EObject current=null] : iv_ruleUnsetMusicProperty= ruleUnsetMusicProperty EOF ;
    public final EObject entryRuleUnsetMusicProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsetMusicProperty = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6819:2: (iv_ruleUnsetMusicProperty= ruleUnsetMusicProperty EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6820:2: iv_ruleUnsetMusicProperty= ruleUnsetMusicProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnsetMusicPropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnsetMusicProperty_in_entryRuleUnsetMusicProperty13095);
            iv_ruleUnsetMusicProperty=ruleUnsetMusicProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnsetMusicProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnsetMusicProperty13105); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnsetMusicProperty


    // $ANTLR start ruleUnsetMusicProperty
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6827:1: ruleUnsetMusicProperty returns [EObject current=null] : ( KEYWORD_57 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ) ;
    public final EObject ruleUnsetMusicProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_object_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6832:6: ( ( KEYWORD_57 ( (lv_object_1_0= ruleContextPropertySpecification ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6833:1: ( KEYWORD_57 ( (lv_object_1_0= ruleContextPropertySpecification ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6833:1: ( KEYWORD_57 ( (lv_object_1_0= ruleContextPropertySpecification ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6834:2: KEYWORD_57 ( (lv_object_1_0= ruleContextPropertySpecification ) )
            {
            match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleUnsetMusicProperty13141); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnsetMusicPropertyAccess().getUnsetKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6838:1: ( (lv_object_1_0= ruleContextPropertySpecification ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6839:1: (lv_object_1_0= ruleContextPropertySpecification )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6839:1: (lv_object_1_0= ruleContextPropertySpecification )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6840:3: lv_object_1_0= ruleContextPropertySpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnsetMusicPropertyAccess().getObjectContextPropertySpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleContextPropertySpecification_in_ruleUnsetMusicProperty13162);
            lv_object_1_0=ruleContextPropertySpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnsetMusicPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"object",
              	        		lv_object_1_0, 
              	        		"ContextPropertySpecification", 
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
    // $ANTLR end ruleUnsetMusicProperty


    // $ANTLR start entryRuleContextPropertySpecification
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6870:1: entryRuleContextPropertySpecification returns [String current=null] : iv_ruleContextPropertySpecification= ruleContextPropertySpecification EOF ;
    public final String entryRuleContextPropertySpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContextPropertySpecification = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6871:1: (iv_ruleContextPropertySpecification= ruleContextPropertySpecification EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6872:2: iv_ruleContextPropertySpecification= ruleContextPropertySpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getContextPropertySpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleContextPropertySpecification_in_entryRuleContextPropertySpecification13198);
            iv_ruleContextPropertySpecification=ruleContextPropertySpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleContextPropertySpecification.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextPropertySpecification13209); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContextPropertySpecification


    // $ANTLR start ruleContextPropertySpecification
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6879:1: ruleContextPropertySpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdOrString_0= ruleIdOrString (kw= KEYWORD_10 this_IdOrString_2= ruleIdOrString ) ) ;
    public final AntlrDatatypeRuleToken ruleContextPropertySpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdOrString_0 = null;

        AntlrDatatypeRuleToken this_IdOrString_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6884:6: ( (this_IdOrString_0= ruleIdOrString (kw= KEYWORD_10 this_IdOrString_2= ruleIdOrString ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6885:1: (this_IdOrString_0= ruleIdOrString (kw= KEYWORD_10 this_IdOrString_2= ruleIdOrString ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6885:1: (this_IdOrString_0= ruleIdOrString (kw= KEYWORD_10 this_IdOrString_2= ruleIdOrString ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6886:5: this_IdOrString_0= ruleIdOrString (kw= KEYWORD_10 this_IdOrString_2= ruleIdOrString )
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getContextPropertySpecificationAccess().getIdOrStringParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleIdOrString_in_ruleContextPropertySpecification13256);
            this_IdOrString_0=ruleIdOrString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_IdOrString_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6896:1: (kw= KEYWORD_10 this_IdOrString_2= ruleIdOrString )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6897:2: kw= KEYWORD_10 this_IdOrString_2= ruleIdOrString
            {
            kw=(Token)input.LT(1);
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleContextPropertySpecification13275); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getContextPropertySpecificationAccess().getFullStopKeyword_1_0(), null); 
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getContextPropertySpecificationAccess().getIdOrStringParserRuleCall_1_1(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleIdOrString_in_ruleContextPropertySpecification13297);
            this_IdOrString_2=ruleIdOrString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_IdOrString_2);
                  
            }
            if ( backtracking==0 ) {
               
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
    // $ANTLR end ruleContextPropertySpecification


    // $ANTLR start entryRuleIdOrString
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6921:1: entryRuleIdOrString returns [String current=null] : iv_ruleIdOrString= ruleIdOrString EOF ;
    public final String entryRuleIdOrString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrString = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6922:1: (iv_ruleIdOrString= ruleIdOrString EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6923:2: iv_ruleIdOrString= ruleIdOrString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIdOrStringRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIdOrString_in_entryRuleIdOrString13343);
            iv_ruleIdOrString=ruleIdOrString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIdOrString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrString13354); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIdOrString


    // $ANTLR start ruleIdOrString
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6930:1: ruleIdOrString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdOrString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6935:6: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6936:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6936:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_STRING) ) {
                alt74=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6936:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6936:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdOrString13394); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getIdOrStringAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6944:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdOrString13420); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getIdOrStringAccess().getSTRINGTerminalRuleCall_1(), null); 
                          
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
    // $ANTLR end ruleIdOrString


    // $ANTLR start ruleDirection
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6959:1: ruleDirection returns [Enumerator current=null] : ( ( KEYWORD_9 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6963:6: ( ( ( KEYWORD_9 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6964:1: ( ( KEYWORD_9 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6964:1: ( ( KEYWORD_9 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case KEYWORD_9:
                {
                alt75=1;
                }
                break;
            case KEYWORD_20:
                {
                alt75=2;
                }
                break;
            case KEYWORD_21:
                {
                alt75=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6964:1: ( ( KEYWORD_9 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6964:2: ( KEYWORD_9 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6964:2: ( KEYWORD_9 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6964:7: KEYWORD_9
                    {
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleDirection13480); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getDirectionAccess().getDefaultEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6970:6: ( KEYWORD_20 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6970:6: ( KEYWORD_20 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6970:11: KEYWORD_20
                    {
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleDirection13497); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6976:6: ( KEYWORD_21 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6976:6: ( KEYWORD_21 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6976:11: KEYWORD_21
                    {
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleDirection13514); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_2(), null); 
                          
                    }

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
    // $ANTLR end ruleDirection


    // $ANTLR start ruleScriptWithRequiredDirection
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6986:1: ruleScriptWithRequiredDirection returns [Enumerator current=null] : ( ( KEYWORD_20 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_23 ) | ( KEYWORD_15 ) | ( KEYWORD_10 ) | ( KEYWORD_21 ) ) ;
    public final Enumerator ruleScriptWithRequiredDirection() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6990:6: ( ( ( KEYWORD_20 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_23 ) | ( KEYWORD_15 ) | ( KEYWORD_10 ) | ( KEYWORD_21 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6991:1: ( ( KEYWORD_20 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_23 ) | ( KEYWORD_15 ) | ( KEYWORD_10 ) | ( KEYWORD_21 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6991:1: ( ( KEYWORD_20 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_23 ) | ( KEYWORD_15 ) | ( KEYWORD_10 ) | ( KEYWORD_21 ) )
            int alt76=7;
            switch ( input.LA(1) ) {
            case KEYWORD_20:
                {
                alt76=1;
                }
                break;
            case KEYWORD_7:
                {
                alt76=2;
                }
                break;
            case KEYWORD_9:
                {
                alt76=3;
                }
                break;
            case KEYWORD_23:
                {
                alt76=4;
                }
                break;
            case KEYWORD_15:
                {
                alt76=5;
                }
                break;
            case KEYWORD_10:
                {
                alt76=6;
                }
                break;
            case KEYWORD_21:
                {
                alt76=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6991:1: ( ( KEYWORD_20 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_23 ) | ( KEYWORD_15 ) | ( KEYWORD_10 ) | ( KEYWORD_21 ) )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6991:2: ( KEYWORD_20 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6991:2: ( KEYWORD_20 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6991:7: KEYWORD_20
                    {
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleScriptWithRequiredDirection13559); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithRequiredDirectionAccess().getMarcatoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithRequiredDirectionAccess().getMarcatoEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6997:6: ( KEYWORD_7 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6997:6: ( KEYWORD_7 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:6997:11: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleScriptWithRequiredDirection13576); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithRequiredDirectionAccess().getStoppedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithRequiredDirectionAccess().getStoppedEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7003:6: ( KEYWORD_9 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7003:6: ( KEYWORD_9 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7003:11: KEYWORD_9
                    {
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleScriptWithRequiredDirection13593); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithRequiredDirectionAccess().getTenutoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithRequiredDirectionAccess().getTenutoEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7009:6: ( KEYWORD_23 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7009:6: ( KEYWORD_23 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7009:11: KEYWORD_23
                    {
                    match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleScriptWithRequiredDirection13610); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithRequiredDirectionAccess().getStaccatissimoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithRequiredDirectionAccess().getStaccatissimoEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7015:6: ( KEYWORD_15 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7015:6: ( KEYWORD_15 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7015:11: KEYWORD_15
                    {
                    match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleScriptWithRequiredDirection13627); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithRequiredDirectionAccess().getAccentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithRequiredDirectionAccess().getAccentEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7021:6: ( KEYWORD_10 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7021:6: ( KEYWORD_10 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7021:11: KEYWORD_10
                    {
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleScriptWithRequiredDirection13644); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithRequiredDirectionAccess().getStaccatoEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithRequiredDirectionAccess().getStaccatoEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7027:6: ( KEYWORD_21 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7027:6: ( KEYWORD_21 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7027:11: KEYWORD_21
                    {
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleScriptWithRequiredDirection13661); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithRequiredDirectionAccess().getPortatoEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithRequiredDirectionAccess().getPortatoEnumLiteralDeclaration_6(), null); 
                          
                    }

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
    // $ANTLR end ruleScriptWithRequiredDirection


    // $ANTLR start ruleScriptWithOptionalDirection
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7037:1: ruleScriptWithOptionalDirection returns [Enumerator current=null] : ( ( KEYWORD_17 ) | ( KEYWORD_19 ) | ( KEYWORD_25 ) | ( KEYWORD_4 ) | ( KEYWORD_5 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_35 ) | ( KEYWORD_34 ) | ( KEYWORD_31 ) ) ;
    public final Enumerator ruleScriptWithOptionalDirection() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7041:6: ( ( ( KEYWORD_17 ) | ( KEYWORD_19 ) | ( KEYWORD_25 ) | ( KEYWORD_4 ) | ( KEYWORD_5 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_35 ) | ( KEYWORD_34 ) | ( KEYWORD_31 ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7042:1: ( ( KEYWORD_17 ) | ( KEYWORD_19 ) | ( KEYWORD_25 ) | ( KEYWORD_4 ) | ( KEYWORD_5 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_35 ) | ( KEYWORD_34 ) | ( KEYWORD_31 ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7042:1: ( ( KEYWORD_17 ) | ( KEYWORD_19 ) | ( KEYWORD_25 ) | ( KEYWORD_4 ) | ( KEYWORD_5 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_35 ) | ( KEYWORD_34 ) | ( KEYWORD_31 ) )
            int alt77=10;
            switch ( input.LA(1) ) {
            case KEYWORD_17:
                {
                alt77=1;
                }
                break;
            case KEYWORD_19:
                {
                alt77=2;
                }
                break;
            case KEYWORD_25:
                {
                alt77=3;
                }
                break;
            case KEYWORD_4:
                {
                alt77=4;
                }
                break;
            case KEYWORD_5:
                {
                alt77=5;
                }
                break;
            case KEYWORD_32:
                {
                alt77=6;
                }
                break;
            case KEYWORD_33:
                {
                alt77=7;
                }
                break;
            case KEYWORD_35:
                {
                alt77=8;
                }
                break;
            case KEYWORD_34:
                {
                alt77=9;
                }
                break;
            case KEYWORD_31:
                {
                alt77=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("7042:1: ( ( KEYWORD_17 ) | ( KEYWORD_19 ) | ( KEYWORD_25 ) | ( KEYWORD_4 ) | ( KEYWORD_5 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_35 ) | ( KEYWORD_34 ) | ( KEYWORD_31 ) )", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7042:2: ( KEYWORD_17 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7042:2: ( KEYWORD_17 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7042:7: KEYWORD_17
                    {
                    match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleScriptWithOptionalDirection13706); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getBeamStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getBeamStartEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7048:6: ( KEYWORD_19 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7048:6: ( KEYWORD_19 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7048:11: KEYWORD_19
                    {
                    match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleScriptWithOptionalDirection13723); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getBeamEndEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getBeamEndEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7054:6: ( KEYWORD_25 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7054:6: ( KEYWORD_25 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7054:11: KEYWORD_25
                    {
                    match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleScriptWithOptionalDirection13740); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getTieEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getTieEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7060:6: ( KEYWORD_4 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7060:6: ( KEYWORD_4 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7060:11: KEYWORD_4
                    {
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleScriptWithOptionalDirection13757); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getSlurStartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getSlurStartEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7066:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7066:6: ( KEYWORD_5 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7066:11: KEYWORD_5
                    {
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleScriptWithOptionalDirection13774); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getSlurEndEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getSlurEndEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7072:6: ( KEYWORD_32 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7072:6: ( KEYWORD_32 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7072:11: KEYWORD_32
                    {
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleScriptWithOptionalDirection13791); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getPhrasingSlurStartEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getPhrasingSlurStartEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7078:6: ( KEYWORD_33 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7078:6: ( KEYWORD_33 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7078:11: KEYWORD_33
                    {
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleScriptWithOptionalDirection13808); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getPhrasingSlurEndEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getPhrasingSlurEndEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7084:6: ( KEYWORD_35 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7084:6: ( KEYWORD_35 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7084:11: KEYWORD_35
                    {
                    match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleScriptWithOptionalDirection13825); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getDiminuendoEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getDiminuendoEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7090:6: ( KEYWORD_34 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7090:6: ( KEYWORD_34 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7090:11: KEYWORD_34
                    {
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleScriptWithOptionalDirection13842); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getCrescendoEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getCrescendoEnumLiteralDeclaration_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7096:6: ( KEYWORD_31 )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7096:6: ( KEYWORD_31 )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:7096:11: KEYWORD_31
                    {
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleScriptWithOptionalDirection13859); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getScriptWithOptionalDirectionAccess().getDynamicChangeEndEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getScriptWithOptionalDirectionAccess().getDynamicChangeEndEnumLiteralDeclaration_9(), null); 
                          
                    }

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
    // $ANTLR end ruleScriptWithOptionalDirection

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2638:2: ( ruleNote )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2638:2: ruleNote
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNote_in_synpred575494);
        ruleNote();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2651:2: ( ruleRest )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:2651:2: ruleRest
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleRest_in_synpred585524);
        ruleRest();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred126
    public final void synpred126_fragment() throws RecognitionException {   
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5872:1: ( ( ruleAlternativeMusic ) )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5872:1: ( ruleAlternativeMusic )
        {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5872:1: ( ruleAlternativeMusic )
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:5873:3: ruleAlternativeMusic
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRepeatedMusicAccess().getAlternativeAlternativeMusicParserRuleCall_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAlternativeMusic_in_synpred12611409);
        ruleAlternativeMusic();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred126

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


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_ruleLilyPond128 = new BitSet(new long[]{0x8601500102000022L,0x000000000974CD0BL});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_entryRuleToplevelExpression163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToplevelExpression173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleToplevelExpression223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleToplevelExpression253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleToplevelExpression283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBook_in_ruleToplevelExpression313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBookPart_in_ruleToplevelExpression343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScore_in_ruleToplevelExpression373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeMusic_in_ruleToplevelExpression403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleToplevelExpression433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_ruleToplevelExpression463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_ruleToplevelExpression493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleToplevelExpression523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleToplevelExpression553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileName_in_ruleToplevelExpression583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileLine_in_ruleToplevelExpression613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleAssignment703 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleAssignment714 = new BitSet(new long[]{0x3E35FEFD17F191A0L,0x000000000B10EA5BL});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScore_in_ruleValue830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBook_in_ruleValue860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBookPart_in_ruleValue890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_ruleValue920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDefinition_in_ruleValue950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleValue980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostEvent_in_ruleValue1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleValue1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleValue1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleScheme1178 = new BitSet(new long[]{0x00000100600000C0L,0x000000008F000000L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSchemeExpression1288 = new BitSet(new long[]{0x0000010060000080L,0x000000008F000000L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue1358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_ruleSchemeValue1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleSchemeBoolean1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList1656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSchemeList1714 = new BitSet(new long[]{0x00000100600001C0L,0x000000008F000000L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList1735 = new BitSet(new long[]{0x00000100600001C0L,0x000000008F000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSchemeList1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSchemeBlock1832 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleSchemeBlock1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText1884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_ruleSchemeText1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals1974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiterals1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleSchemeTextLiterals2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleSchemeTextLiterals2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiterals2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber2127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleSchemeNumber2185 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeNumber2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDefinition_in_entryRuleContextDefinition2260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDefinition2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleContextDefinition2318 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleContextDefinition2329 = new BitSet(new long[]{0x5142000008000000L,0x00000000088A3034L});
    public static final BitSet FOLLOW_ruleContextDefinitionElement_in_ruleContextDefinition2350 = new BitSet(new long[]{0x5142000008000000L,0x00000000088A3034L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleContextDefinition2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDefinitionElement_in_entryRuleContextDefinitionElement2397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDefinitionElement2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrobDescriptions_in_ruleContextDefinitionElement2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModifier_in_ruleContextDefinitionElement2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrobDescriptions_in_entryRuleGrobDescriptions2521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrobDescriptions2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleGrobDescriptions2567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleGrobDescriptions2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader2623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleHeader2681 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleHeader2692 = new BitSet(new long[]{0x0000000008000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_ruleHeader2713 = new BitSet(new long[]{0x0000000008000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleHeader2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssignment2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrString_in_rulePropertyAssignment2816 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rulePropertyAssignment2827 = new BitSet(new long[]{0x3E35FEFD17F191A0L,0x000000000B10EA5BL});
    public static final BitSet FOLLOW_ruleValue_in_rulePropertyAssignment2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_entryRuleOutputDefinition2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDefinition2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePaper_in_ruleOutputDefinition2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMidi_in_ruleOutputDefinition2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleOutputDefinition3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinitionElement_in_entryRuleOutputDefinitionElement3037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputDefinitionElement3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_ruleOutputDefinitionElement3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDefinition_in_ruleOutputDefinitionElement3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePaper_in_entryRulePaper3161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePaper3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rulePaper3219 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rulePaper3230 = new BitSet(new long[]{0x0000000008000000L,0x0000000009000040L});
    public static final BitSet FOLLOW_ruleOutputDefinitionElement_in_rulePaper3251 = new BitSet(new long[]{0x0000000008000000L,0x0000000009000040L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rulePaper3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMidi_in_entryRuleMidi3298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMidi3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleMidi3356 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleMidi3367 = new BitSet(new long[]{0x0000000008000000L,0x0000000009000040L});
    public static final BitSet FOLLOW_ruleOutputDefinitionElement_in_ruleMidi3388 = new BitSet(new long[]{0x0000000008000000L,0x0000000009000040L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMidi3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout3435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleLayout3493 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleLayout3504 = new BitSet(new long[]{0x0000000008000000L,0x0000000009000040L});
    public static final BitSet FOLLOW_ruleOutputDefinitionElement_in_ruleLayout3525 = new BitSet(new long[]{0x0000000008000000L,0x0000000009000040L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleLayout3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScore_in_entryRuleScore3572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScore3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleScore3618 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleScore3629 = new BitSet(new long[]{0x3834BE8106210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleScore3650 = new BitSet(new long[]{0xBA35BE810E210000L,0x000000000810E219L});
    public static final BitSet FOLLOW_ruleScoreElement_in_ruleScore3671 = new BitSet(new long[]{0xBA35BE810E210000L,0x000000000810E219L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleScore3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScoreElement_in_entryRuleScoreElement3718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScoreElement3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleScoreElement3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleScoreElement3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputDefinition_in_ruleScoreElement3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBook_in_entryRuleBook3872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBook3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBook3930 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleBook3941 = new BitSet(new long[]{0x860010010A000000L,0x000000000014C80AL});
    public static final BitSet FOLLOW_ruleBookElement_in_ruleBook3962 = new BitSet(new long[]{0x860010010A000000L,0x000000000014C80AL});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleBook3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBookElement_in_entryRuleBookElement4009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBookElement4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBookPart_in_ruleBookElement4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBookPartElement_in_ruleBookElement4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBookPart_in_entryRuleBookPart4133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBookPart4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleBookPart4191 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleBookPart4202 = new BitSet(new long[]{0x860010010A000000L,0x000000000014C00AL});
    public static final BitSet FOLLOW_ruleBookPartElement_in_ruleBookPart4223 = new BitSet(new long[]{0x860010010A000000L,0x000000000014C00AL});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleBookPart4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBookPartElement_in_entryRuleBookPartElement4270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBookPartElement4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePaper_in_ruleBookPartElement4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScore_in_ruleBookPartElement4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeMusic_in_ruleBookPartElement4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleBookPartElement4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_ruleBookPartElement4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleBookPartElement4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup4514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkup4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMarkup4572 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleMarkup4583 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMarkup4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines4629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupLines4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleMarkupLines4687 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleMarkupLines4698 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMarkupLines4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion4744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleVersion4790 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude4847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleInclude4893 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileName_in_entryRuleSourceFileName4950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceFileName4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleSourceFileName4996 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSourceFileName5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceFileLine_in_entryRuleSourceFileLine5053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceFileLine5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleSourceFileLine5099 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSourceFileLine5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusic_in_entryRuleMusic5156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMusic5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMusic_in_ruleMusic5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeMusic_in_ruleMusic5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMusic_in_entryRuleSimpleMusic5280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMusic5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleSimpleMusic5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextChange_in_ruleSimpleMusic5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusicPropertyDefinition_in_ruleSimpleMusic5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent5434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleEvent5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRest_in_ruleEvent5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_ruleEvent5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeySignature_in_ruleEvent5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeSignature_in_ruleEvent5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempo_in_ruleEvent5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartial_in_ruleEvent5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMark_in_ruleEvent5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_ruleEvent5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTie_in_ruleEvent5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeamStart_in_ruleEvent5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeamEnd_in_ruleEvent5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarCheck_in_ruleEvent5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEvent5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote5918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePitch_in_ruleNote5974 = new BitSet(new long[]{0x0008007C11D09182L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleDuration_in_ruleNote5995 = new BitSet(new long[]{0x0008007C11D09182L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleNote6015 = new BitSet(new long[]{0x0000007C11D09182L});
    public static final BitSet FOLLOW_rulePostEvent_in_ruleNote6050 = new BitSet(new long[]{0x0000007C11D09182L});
    public static final BitSet FOLLOW_rulePitch_in_entryRulePitch6086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePitch6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePitch6138 = new BitSet(new long[]{0x00000000000A0852L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rulePitch6162 = new BitSet(new long[]{0x0000000000080852L});
    public static final BitSet FOLLOW_ruleOctave_in_rulePitch6197 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePitch6217 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rulePitch6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctave_in_entryRuleOctave6299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOctave6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleOctave6353 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOctave6392 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRest_in_entryRuleRest6441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRest6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRest6493 = new BitSet(new long[]{0x0000007C11D09182L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleDuration_in_ruleRest6519 = new BitSet(new long[]{0x0000007C11D09182L});
    public static final BitSet FOLLOW_rulePostEvent_in_ruleRest6541 = new BitSet(new long[]{0x0000007C11D09182L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord6577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleChord6635 = new BitSet(new long[]{0x0000000000040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChord6656 = new BitSet(new long[]{0x0000000000040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleChord6668 = new BitSet(new long[]{0x0000007C11D09182L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleDuration_in_ruleChord6689 = new BitSet(new long[]{0x0000007C11D09182L});
    public static final BitSet FOLLOW_rulePostEvent_in_ruleChord6711 = new BitSet(new long[]{0x0000007C11D09182L});
    public static final BitSet FOLLOW_rulePostEvent_in_entryRulePostEvent6747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostEvent6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePostEvent6794 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleReference_in_rulePostEvent6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rulePostEvent6844 = new BitSet(new long[]{0x0000000005843400L,0x0000000003000002L});
    public static final BitSet FOLLOW_ruleEventWithRequiredDirection_in_rulePostEvent6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rulePostEvent6894 = new BitSet(new long[]{0x0000007C10508180L});
    public static final BitSet FOLLOW_ruleEventWithOptionalDirection_in_rulePostEvent6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventWithRequiredDirection_in_entryRuleEventWithRequiredDirection6952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventWithRequiredDirection6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptWithRequiredDirection_in_ruleEventWithRequiredDirection7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenTextDef_in_ruleEventWithRequiredDirection7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenTextDef_in_entryRuleGenTextDef7073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenTextDef7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleGenTextDef7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenTextDef7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGenTextDef7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventWithOptionalDirection_in_entryRuleEventWithOptionalDirection7195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventWithOptionalDirection7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptWithOptionalDirection_in_ruleEventWithOptionalDirection7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTremolo_in_ruleEventWithOptionalDirection7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTremolo_in_entryRuleTremolo7316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTremolo7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleTremolo7374 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTremolo7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeySignature_in_entryRuleKeySignature7432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeySignature7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleKeySignature7478 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeySignature7497 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleReference_in_ruleKeySignature7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleKeySignature7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeSignature_in_entryRuleTimeSignature7598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeSignature7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleTimeSignature7644 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleFraction_in_ruleTimeSignature7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempo_in_entryRuleTempo7700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTempo7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleTempo7746 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000002L});
    public static final BitSet FOLLOW_ruleTempoLabel_in_ruleTempo7769 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleTempoValue_in_ruleTempo7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempoLabel_in_ruleTempo7819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempoLabel_in_entryRuleTempoLabel7855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTempoLabel7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTempoLabel7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleTempoLabel7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempoValue_in_entryRuleTempoValue7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTempoValue7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_in_ruleTempoValue8019 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleTempoValue8030 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTempoValue8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartial_in_entryRulePartial8087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartial8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_rulePartial8145 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleDuration_in_rulePartial8166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMark_in_entryRuleMark8201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMark8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleMark8259 = new BitSet(new long[]{0x0000000000000020L,0x000000000B000002L});
    public static final BitSet FOLLOW_ruleScalar_in_ruleMark8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip8315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleSkip8361 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleDuration_in_ruleSkip8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTie_in_entryRuleTie8417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTie8427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleTie8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeamStart_in_entryRuleBeamStart8510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeamStart8520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleBeamStart8568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeamEnd_in_entryRuleBeamEnd8603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeamEnd8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleBeamEnd8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarCheck_in_entryRuleBarCheck8696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBarCheck8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleBarCheck8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference8795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference8805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleReference8845 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeMusic_in_entryRuleCompositeMusic8906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeMusic8916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequentialMusic_in_ruleCompositeMusic8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousMusic_in_ruleCompositeMusic8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_ruleCompositeMusic9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_ruleCompositeMusic9056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatedMusic_in_ruleCompositeMusic9086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequentialMusic_in_entryRuleSequentialMusic9120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequentialMusic9130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleSequentialMusic9180 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleSequentialMusic9191 = new BitSet(new long[]{0x3834BE810E210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleSequentialMusic9212 = new BitSet(new long[]{0x3834BE810E210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleSequentialMusic9224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleSequentialMusic9243 = new BitSet(new long[]{0x3834BE810E210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleSequentialMusic9264 = new BitSet(new long[]{0x3834BE810E210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleSequentialMusic9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousMusic_in_entryRuleSimultaneousMusic9313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousMusic9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleSimultaneousMusic9373 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleSimultaneousMusic9384 = new BitSet(new long[]{0x3834BE810E210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleSimultaneousMusic9405 = new BitSet(new long[]{0x3834BE810E210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleSimultaneousMusic9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSimultaneousMusic9436 = new BitSet(new long[]{0x3834BE8306210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleSimultaneousMusic9457 = new BitSet(new long[]{0x3834BE8306210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleSimultaneousMusic9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewContext_in_entryRuleNewContext9506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewContext9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleNewContext9552 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleNewContext9573 = new BitSet(new long[]{0x38B4BE8106230000L,0x000000000810E218L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleNewContext9585 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleNewContext9606 = new BitSet(new long[]{0x38B4BE8106210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleContextModification_in_ruleNewContext9629 = new BitSet(new long[]{0x3834BE8106210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleNewContext9651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModification_in_entryRuleContextModification9686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextModification9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleContextModification9744 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleContextModification9755 = new BitSet(new long[]{0x5142000008000000L,0x00000000080A3034L});
    public static final BitSet FOLLOW_ruleContextModifier_in_ruleContextModification9776 = new BitSet(new long[]{0x5142000008000000L,0x00000000080A3034L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleContextModification9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextModifier_in_entryRuleContextModifier9823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextModifier9833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyOperation_in_ruleContextModifier9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDefaultModifier_in_ruleContextModifier9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyOperation_in_entryRulePropertyOperation9947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyOperation9957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetProperty_in_rulePropertyOperation10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsetProperty_in_rulePropertyOperation10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideProperty_in_rulePropertyOperation10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevertProperty_in_rulePropertyOperation10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetProperty_in_entryRuleSetProperty10131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetProperty10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetProperty10183 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleSetProperty10199 = new BitSet(new long[]{0x0000000000000020L,0x000000000B000002L});
    public static final BitSet FOLLOW_ruleScalar_in_ruleSetProperty10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalar_in_entryRuleScalar10255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalar10265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleScalar10309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScalar10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleScalar10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_ruleScalar10383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsetProperty_in_entryRuleUnsetProperty10417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnsetProperty10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleUnsetProperty10463 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleUnsetProperty10484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideProperty_in_entryRuleOverrideProperty10519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverrideProperty10529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleOverrideProperty10565 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleOverrideProperty10586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleOverrideProperty10607 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleOverrideProperty10618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleOverrideProperty10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevertProperty_in_entryRuleRevertProperty10674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRevertProperty10684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleRevertProperty10720 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleRevertProperty10741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleRevertProperty10762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDefaultModifier_in_entryRuleContextDefaultModifier10797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDefaultModifier10807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDefaultModifierType_in_ruleContextDefaultModifier10865 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContextDefaultModifier10882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextDefaultModifierType_in_entryRuleContextDefaultModifierType10922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextDefaultModifierType10932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleContextDefaultModifierType10981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleContextDefaultModifierType10998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleContextDefaultModifierType11015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleContextDefaultModifierType11032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleContextDefaultModifierType11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleContextDefaultModifierType11066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleContextDefaultModifierType11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleContextDefaultModifierType11100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleContextDefaultModifierType11117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeMusic_in_entryRuleRelativeMusic11153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeMusic11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleRelativeMusic11199 = new BitSet(new long[]{0x0000100102000000L,0x000000000810C008L});
    public static final BitSet FOLLOW_rulePitch_in_ruleRelativeMusic11220 = new BitSet(new long[]{0x0000100102000000L,0x000000000010C008L});
    public static final BitSet FOLLOW_ruleCompositeMusic_in_ruleRelativeMusic11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatedMusic_in_entryRuleRepeatedMusic11277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeatedMusic11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleRepeatedMusic11323 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepeatedMusic11340 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatedMusic11362 = new BitSet(new long[]{0x3834BE8106210000L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleRepeatedMusic11388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAlternativeMusic_in_ruleRepeatedMusic11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeMusic_in_entryRuleAlternativeMusic11445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeMusic11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleAlternativeMusic11503 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleAlternativeMusic11514 = new BitSet(new long[]{0x3834BE810E210020L,0x000000000810E218L});
    public static final BitSet FOLLOW_ruleMusicOrScheme_in_ruleAlternativeMusic11535 = new BitSet(new long[]{0x3834BE810E210020L,0x000000000810E218L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleAlternativeMusic11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusicOrScheme_in_entryRuleMusicOrScheme11582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMusicOrScheme11592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusic_in_ruleMusicOrScheme11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleMusicOrScheme11672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_in_entryRuleDuration11706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuration11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDuration11758 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleDuration11782 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_ruleDurationMultiplier_in_ruleDuration11817 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleDurationMultiplier_in_entryRuleDurationMultiplier11853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDurationMultiplier11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleDurationMultiplier11899 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleFractionOrNumber_in_ruleDurationMultiplier11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFraction_in_entryRuleFraction11964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFraction11974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFraction12020 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleFraction12036 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFraction12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFractionOrNumber_in_entryRuleFractionOrNumber12103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFractionOrNumber12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFractionOrNumber12159 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleFractionOrNumber12176 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFractionOrNumber12193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextChange_in_entryRuleContextChange12239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextChange12249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleContextChange12285 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContextChange12302 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleContextChange12318 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContextChange12335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusicPropertyDefinition_in_entryRuleMusicPropertyDefinition12375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMusicPropertyDefinition12385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleMusicPropertyDefinition12429 = new BitSet(new long[]{0x1000200000000000L,0x0000000000002010L});
    public static final BitSet FOLLOW_ruleMusicPropertyOperation_in_ruleMusicPropertyDefinition12464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMusicPropertyOperation_in_entryRuleMusicPropertyOperation12499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMusicPropertyOperation12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideMusicProperty_in_ruleMusicPropertyOperation12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevertMusicProperty_in_ruleMusicPropertyOperation12589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetMusicProperty_in_ruleMusicPropertyOperation12619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsetMusicProperty_in_ruleMusicPropertyOperation12649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideMusicProperty_in_entryRuleOverrideMusicProperty12683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverrideMusicProperty12693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleOverrideMusicProperty12729 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleContextPropertySpecification_in_ruleOverrideMusicProperty12750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleOverrideMusicProperty12771 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleOverrideMusicProperty12782 = new BitSet(new long[]{0x0000000000000020L,0x000000000B000002L});
    public static final BitSet FOLLOW_ruleScalar_in_ruleOverrideMusicProperty12803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevertMusicProperty_in_entryRuleRevertMusicProperty12838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRevertMusicProperty12848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleRevertMusicProperty12884 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleContextPropertySpecification_in_ruleRevertMusicProperty12905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleRevertMusicProperty12926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetMusicProperty_in_entryRuleSetMusicProperty12961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetMusicProperty12971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleSetMusicProperty13007 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleContextPropertySpecification_in_ruleSetMusicProperty13028 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleSetMusicProperty13039 = new BitSet(new long[]{0x0000000000000020L,0x000000000B000002L});
    public static final BitSet FOLLOW_ruleScalar_in_ruleSetMusicProperty13060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnsetMusicProperty_in_entryRuleUnsetMusicProperty13095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnsetMusicProperty13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleUnsetMusicProperty13141 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleContextPropertySpecification_in_ruleUnsetMusicProperty13162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextPropertySpecification_in_entryRuleContextPropertySpecification13198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextPropertySpecification13209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleContextPropertySpecification13256 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleContextPropertySpecification13275 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_ruleIdOrString_in_ruleContextPropertySpecification13297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrString_in_entryRuleIdOrString13343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrString13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdOrString13394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdOrString13420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleDirection13480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleDirection13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleDirection13514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleScriptWithRequiredDirection13559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleScriptWithRequiredDirection13576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleScriptWithRequiredDirection13593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleScriptWithRequiredDirection13610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleScriptWithRequiredDirection13627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleScriptWithRequiredDirection13644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleScriptWithRequiredDirection13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleScriptWithOptionalDirection13706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleScriptWithOptionalDirection13723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleScriptWithOptionalDirection13740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleScriptWithOptionalDirection13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleScriptWithOptionalDirection13774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleScriptWithOptionalDirection13791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleScriptWithOptionalDirection13808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleScriptWithOptionalDirection13825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleScriptWithOptionalDirection13842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleScriptWithOptionalDirection13859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_synpred575494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRest_in_synpred585524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeMusic_in_synpred12611409 = new BitSet(new long[]{0x0000000000000002L});

}