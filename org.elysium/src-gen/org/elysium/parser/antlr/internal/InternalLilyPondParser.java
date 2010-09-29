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

@SuppressWarnings("all")
public class InternalLilyPondParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_INT", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "'{'", "'}'", "'<<'", "'>>'", "'#'", "'\\''", "'('", "')'", "'#{'", "'#}'", "'\\\\\\\\'", "'#x'", "'\\\\'", "'include'", "'version'", "','"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_BOOL=4;
    public static final int RULE_INT=8;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g"; }



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
             currentNode = createCompositeNode(grammarAccess.getLilyPondRule(), currentNode); 
            pushFollow(FOLLOW_ruleLilyPond_in_entryRuleLilyPond75);
            iv_ruleLilyPond=ruleLilyPond();
            _fsp--;

             current =iv_ruleLilyPond; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilyPond85); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:86:1: ruleLilyPond returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpression ) )* ;
    public final EObject ruleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:91:6: ( ( (lv_expressions_0_0= ruleExpression ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:92:1: ( (lv_expressions_0_0= ruleExpression ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:92:1: ( (lv_expressions_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==12||LA1_0==14||(LA1_0>=16 && LA1_0<=19)||LA1_0==22||LA1_0==24||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:93:1: (lv_expressions_0_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:93:1: (lv_expressions_0_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:94:3: lv_expressions_0_0= ruleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLilyPondAccess().getExpressionsExpressionParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleLilyPond130);
            	    lv_expressions_0_0=ruleExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLilyPondRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"expressions",
            	    	        		lv_expressions_0_0, 
            	    	        		"Expression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:124:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:125:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:126:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression166);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression176); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:133:1: ruleExpression returns [EObject current=null] : (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_Scheme_1 = null;

        EObject this_Command_2 = null;

        EObject this_Text_3 = null;

        EObject this_Number_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:138:6: ( (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:139:1: (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:139:1: (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
            case 14:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 17:
            case 18:
            case 19:
            case 22:
            case 27:
                {
                alt2=4;
                }
                break;
            case RULE_INT:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("139:1: (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:140:5: this_Block_0= ruleBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBlockParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleExpression223);
                    this_Block_0=ruleBlock();
                    _fsp--;

                     
                            current = this_Block_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:150:5: this_Scheme_1= ruleScheme
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getSchemeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleScheme_in_ruleExpression250);
                    this_Scheme_1=ruleScheme();
                    _fsp--;

                     
                            current = this_Scheme_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:160:5: this_Command_2= ruleCommand
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommandParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCommand_in_ruleExpression277);
                    this_Command_2=ruleCommand();
                    _fsp--;

                     
                            current = this_Command_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:170:5: this_Text_3= ruleText
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTextParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleExpression304);
                    this_Text_3=ruleText();
                    _fsp--;

                     
                            current = this_Text_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:180:5: this_Number_4= ruleNumber
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getNumberParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleExpression331);
                    this_Number_4=ruleNumber();
                    _fsp--;

                     
                            current = this_Number_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:196:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:197:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:198:2: iv_ruleBlock= ruleBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock366);
            iv_ruleBlock=ruleBlock();
            _fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock376); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:205:1: ruleBlock returns [EObject current=null] : (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBlock_0 = null;

        EObject this_SimultaneousBlock_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:210:6: ( (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:211:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:211:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("211:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:212:5: this_SimpleBlock_0= ruleSimpleBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlock423);
                    this_SimpleBlock_0=ruleSimpleBlock();
                    _fsp--;

                     
                            current = this_SimpleBlock_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:222:5: this_SimultaneousBlock_1= ruleSimultaneousBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_ruleBlock450);
                    this_SimultaneousBlock_1=ruleSimultaneousBlock();
                    _fsp--;

                     
                            current = this_SimultaneousBlock_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:238:1: entryRuleSimpleBlock returns [EObject current=null] : iv_ruleSimpleBlock= ruleSimpleBlock EOF ;
    public final EObject entryRuleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:239:2: (iv_ruleSimpleBlock= ruleSimpleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:240:2: iv_ruleSimpleBlock= ruleSimpleBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock485);
            iv_ruleSimpleBlock=ruleSimpleBlock();
            _fsp--;

             current =iv_ruleSimpleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock495); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:247:1: ruleSimpleBlock returns [EObject current=null] : ( () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}' ) ;
    public final EObject ruleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:252:6: ( ( () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:253:1: ( () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:253:1: ( () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:253:2: () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:253:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:254:5: 
            {
             
                    temp=factory.create(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,12,FOLLOW_12_in_ruleSimpleBlock539); 

                    createLeafNode(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:268:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||LA4_0==12||LA4_0==14||(LA4_0>=16 && LA4_0<=19)||LA4_0==22||LA4_0==24||LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:269:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:269:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:270:3: lv_expressions_2_0= ruleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimpleBlock560);
            	    lv_expressions_2_0=ruleExpression();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleSimpleBlock571); 

                    createLeafNode(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:304:1: entryRuleSimultaneousBlock returns [EObject current=null] : iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF ;
    public final EObject entryRuleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneousBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:305:2: (iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:306:2: iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimultaneousBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock607);
            iv_ruleSimultaneousBlock=ruleSimultaneousBlock();
            _fsp--;

             current =iv_ruleSimultaneousBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock617); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:313:1: ruleSimultaneousBlock returns [EObject current=null] : ( () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>' ) ;
    public final EObject ruleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:318:6: ( ( () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:319:1: ( () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:319:1: ( () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:319:2: () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:319:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:320:5: 
            {
             
                    temp=factory.create(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,14,FOLLOW_14_in_ruleSimultaneousBlock661); 

                    createLeafNode(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1(), null); 
                
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:334:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==12||LA5_0==14||(LA5_0>=16 && LA5_0<=19)||LA5_0==22||LA5_0==24||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:335:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:335:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:336:3: lv_expressions_2_0= ruleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimultaneousBlock682);
            	    lv_expressions_2_0=ruleExpression();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleSimultaneousBlock693); 

                    createLeafNode(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:370:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:371:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:372:2: iv_ruleScheme= ruleScheme EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeRule(), currentNode); 
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme729);
            iv_ruleScheme=ruleScheme();
            _fsp--;

             current =iv_ruleScheme; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme739); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:379:1: ruleScheme returns [EObject current=null] : ( '#' ( (lv_value_1_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:384:6: ( ( '#' ( (lv_value_1_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:385:1: ( '#' ( (lv_value_1_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:385:1: ( '#' ( (lv_value_1_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:385:3: '#' ( (lv_value_1_0= ruleSchemeExpression ) )
            {
            match(input,16,FOLLOW_16_in_ruleScheme774); 

                    createLeafNode(grammarAccess.getSchemeAccess().getNumberSignKeyword_0(), null); 
                
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:389:1: ( (lv_value_1_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:390:1: (lv_value_1_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:390:1: (lv_value_1_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:391:3: lv_value_1_0= ruleSchemeExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme795);
            lv_value_1_0=ruleSchemeExpression();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:421:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression831);
            iv_ruleSchemeExpression=ruleSchemeExpression();
            _fsp--;

             current =iv_ruleSchemeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression841); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:430:1: ruleSchemeExpression returns [EObject current=null] : ( ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_quoted_0_0=null;
        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:435:6: ( ( ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:436:1: ( ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:436:1: ( ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:436:2: ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:436:2: ( (lv_quoted_0_0= '\\'' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:437:1: (lv_quoted_0_0= '\\'' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:437:1: (lv_quoted_0_0= '\\'' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:438:3: lv_quoted_0_0= '\\''
                    {
                    lv_quoted_0_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleSchemeExpression884); 

                            createLeafNode(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0(), "quoted"); 
                        

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
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:457:3: ( (lv_value_1_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:458:1: (lv_value_1_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:458:1: (lv_value_1_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:459:3: lv_value_1_0= ruleSchemeValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression919);
            lv_value_1_0=ruleSchemeValue();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:489:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:490:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:491:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue955);
            iv_ruleSchemeValue=ruleSchemeValue();
            _fsp--;

             current =iv_ruleSchemeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue965); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:498:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber ) ;
    public final EObject ruleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SchemeBoolean_0 = null;

        EObject this_SchemeList_1 = null;

        EObject this_SchemeBlock_2 = null;

        EObject this_SchemeText_3 = null;

        EObject this_SchemeNumber_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:503:6: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:504:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:504:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 22:
                {
                alt7=4;
                }
                break;
            case RULE_INT:
            case 23:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("504:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_SchemeNumber_4= ruleSchemeNumber )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:505:5: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue1012);
                    this_SchemeBoolean_0=ruleSchemeBoolean();
                    _fsp--;

                     
                            current = this_SchemeBoolean_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:515:5: this_SchemeList_1= ruleSchemeList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue1039);
                    this_SchemeList_1=ruleSchemeList();
                    _fsp--;

                     
                            current = this_SchemeList_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:525:5: this_SchemeBlock_2= ruleSchemeBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue1066);
                    this_SchemeBlock_2=ruleSchemeBlock();
                    _fsp--;

                     
                            current = this_SchemeBlock_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:535:5: this_SchemeText_3= ruleSchemeText
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue1093);
                    this_SchemeText_3=ruleSchemeText();
                    _fsp--;

                     
                            current = this_SchemeText_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:545:5: this_SchemeNumber_4= ruleSchemeNumber
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSchemeNumber_in_ruleSchemeValue1120);
                    this_SchemeNumber_4=ruleSchemeNumber();
                    _fsp--;

                     
                            current = this_SchemeNumber_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:561:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:562:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:563:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeBooleanRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1155);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();
            _fsp--;

             current =iv_ruleSchemeBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean1165); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:570:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:575:6: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:576:1: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:576:1: ( (lv_value_0_0= RULE_BOOL ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:577:1: (lv_value_0_0= RULE_BOOL )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:577:1: (lv_value_0_0= RULE_BOOL )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:578:3: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleSchemeBoolean1206); 

            			createLeafNode(grammarAccess.getSchemeBooleanAccess().getValueBOOLTerminalRuleCall_0(), "value"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:608:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:609:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:610:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeListRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList1246);
            iv_ruleSchemeList=ruleSchemeList();
            _fsp--;

             current =iv_ruleSchemeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList1256); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:617:1: ruleSchemeList returns [EObject current=null] : ( () '(' ( (lv_expressions_2_0= ruleSchemeExpression ) )* ')' ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:622:6: ( ( () '(' ( (lv_expressions_2_0= ruleSchemeExpression ) )* ')' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:623:1: ( () '(' ( (lv_expressions_2_0= ruleSchemeExpression ) )* ')' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:623:1: ( () '(' ( (lv_expressions_2_0= ruleSchemeExpression ) )* ')' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:623:2: () '(' ( (lv_expressions_2_0= ruleSchemeExpression ) )* ')'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:623:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:624:5: 
            {
             
                    temp=factory.create(grammarAccess.getSchemeListAccess().getSchemeListAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSchemeListAccess().getSchemeListAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,18,FOLLOW_18_in_ruleSchemeList1300); 

                    createLeafNode(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:638:1: ( (lv_expressions_2_0= ruleSchemeExpression ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_BOOL && LA8_0<=RULE_INT)||(LA8_0>=17 && LA8_0<=18)||LA8_0==20||(LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:639:1: (lv_expressions_2_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:639:1: (lv_expressions_2_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:640:3: lv_expressions_2_0= ruleSchemeExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList1321);
            	    lv_expressions_2_0=ruleSchemeExpression();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleSchemeList1332); 

                    createLeafNode(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:674:1: entryRuleSchemeBlock returns [EObject current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final EObject entryRuleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:675:2: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:676:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1368);
            iv_ruleSchemeBlock=ruleSchemeBlock();
            _fsp--;

             current =iv_ruleSchemeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock1378); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:683:1: ruleSchemeBlock returns [EObject current=null] : ( '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}' ) ;
    public final EObject ruleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:688:6: ( ( '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:1: ( '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:1: ( '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:689:3: '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}'
            {
            match(input,20,FOLLOW_20_in_ruleSchemeBlock1413); 

                    createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0(), null); 
                
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:693:1: ( (lv_expressions_1_0= ruleExpression ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)||LA9_0==12||LA9_0==14||(LA9_0>=16 && LA9_0<=19)||LA9_0==22||LA9_0==24||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:694:1: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:694:1: (lv_expressions_1_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:695:3: lv_expressions_1_0= ruleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSchemeBlock1434);
            	    lv_expressions_1_0=ruleExpression();
            	    _fsp--;


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
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match(input,21,FOLLOW_21_in_ruleSchemeBlock1445); 

                    createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:729:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:730:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:731:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText1481);
            iv_ruleSchemeText=ruleSchemeText();
            _fsp--;

             current =iv_ruleSchemeText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText1491); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:738:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeTextLiterals ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:743:6: ( ( (lv_value_0_0= ruleSchemeTextLiterals ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:744:1: ( (lv_value_0_0= ruleSchemeTextLiterals ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:744:1: ( (lv_value_0_0= ruleSchemeTextLiterals ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:745:1: (lv_value_0_0= ruleSchemeTextLiterals )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:745:1: (lv_value_0_0= ruleSchemeTextLiterals )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:746:3: lv_value_0_0= ruleSchemeTextLiterals
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_ruleSchemeText1536);
            lv_value_0_0=ruleSchemeTextLiterals();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:776:1: entryRuleSchemeTextLiterals returns [String current=null] : iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF ;
    public final String entryRuleSchemeTextLiterals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextLiterals = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:777:2: (iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:778:2: iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeTextLiteralsRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals1572);
            iv_ruleSchemeTextLiterals=ruleSchemeTextLiterals();
            _fsp--;

             current =iv_ruleSchemeTextLiterals.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiterals1583); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:785:1: ruleSchemeTextLiterals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextLiterals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token this_ANY_OTHER_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:790:6: ( (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:791:1: (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:791:1: (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("791:1: (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:792:2: kw= '\\\\\\\\'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleSchemeTextLiterals1621); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:798:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeTextLiterals1642); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:806:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemeTextLiterals1668); 

                    		current.merge(this_STRING_2);
                        
                     
                        createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:814:10: this_ANY_OTHER_3= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_3=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiterals1694); 

                    		current.merge(this_ANY_OTHER_3);
                        
                     
                        createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:829:1: entryRuleSchemeNumber returns [EObject current=null] : iv_ruleSchemeNumber= ruleSchemeNumber EOF ;
    public final EObject entryRuleSchemeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:833:2: (iv_ruleSchemeNumber= ruleSchemeNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:834:2: iv_ruleSchemeNumber= ruleSchemeNumber EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSchemeNumberRule(), currentNode); 
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber1745);
            iv_ruleSchemeNumber=ruleSchemeNumber();
            _fsp--;

             current =iv_ruleSchemeNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber1755); 

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:844:1: ruleSchemeNumber returns [EObject current=null] : ( ( (lv_hexadecimal_0_0= '#x' ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSchemeNumber() throws RecognitionException {
        EObject current = null;

        Token lv_hexadecimal_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:850:6: ( ( ( (lv_hexadecimal_0_0= '#x' ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:851:1: ( ( (lv_hexadecimal_0_0= '#x' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:851:1: ( ( (lv_hexadecimal_0_0= '#x' ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:851:2: ( (lv_hexadecimal_0_0= '#x' ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:851:2: ( (lv_hexadecimal_0_0= '#x' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:852:1: (lv_hexadecimal_0_0= '#x' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:852:1: (lv_hexadecimal_0_0= '#x' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:853:3: lv_hexadecimal_0_0= '#x'
                    {
                    lv_hexadecimal_0_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleSchemeNumber1802); 

                            createLeafNode(grammarAccess.getSchemeNumberAccess().getHexadecimalXKeyword_0_0(), "hexadecimal"); 
                        

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
                    break;

            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:872:3: ( (lv_value_1_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:873:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:873:1: (lv_value_1_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:874:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSchemeNumber1833); 

            			createLeafNode(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0(), "value"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:907:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:908:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:909:2: iv_ruleCommand= ruleCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1878);
            iv_ruleCommand=ruleCommand();
            _fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1888); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:916:1: ruleCommand returns [EObject current=null] : (this_ArbitraryCommand_0= ruleArbitraryCommand | this_SpecialCommand_1= ruleSpecialCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_ArbitraryCommand_0 = null;

        EObject this_SpecialCommand_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:921:6: ( (this_ArbitraryCommand_0= ruleArbitraryCommand | this_SpecialCommand_1= ruleSpecialCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:922:1: (this_ArbitraryCommand_0= ruleArbitraryCommand | this_SpecialCommand_1= ruleSpecialCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:922:1: (this_ArbitraryCommand_0= ruleArbitraryCommand | this_SpecialCommand_1= ruleSpecialCommand )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=25 && LA12_1<=26)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==RULE_ID||LA12_1==RULE_ANY_OTHER||(LA12_1>=18 && LA12_1<=19)) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("922:1: (this_ArbitraryCommand_0= ruleArbitraryCommand | this_SpecialCommand_1= ruleSpecialCommand )", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("922:1: (this_ArbitraryCommand_0= ruleArbitraryCommand | this_SpecialCommand_1= ruleSpecialCommand )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:923:5: this_ArbitraryCommand_0= ruleArbitraryCommand
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getArbitraryCommandParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArbitraryCommand_in_ruleCommand1935);
                    this_ArbitraryCommand_0=ruleArbitraryCommand();
                    _fsp--;

                     
                            current = this_ArbitraryCommand_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:933:5: this_SpecialCommand_1= ruleSpecialCommand
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSpecialCommand_in_ruleCommand1962);
                    this_SpecialCommand_1=ruleSpecialCommand();
                    _fsp--;

                     
                            current = this_SpecialCommand_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleArbitraryCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:949:1: entryRuleArbitraryCommand returns [EObject current=null] : iv_ruleArbitraryCommand= ruleArbitraryCommand EOF ;
    public final EObject entryRuleArbitraryCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArbitraryCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:950:2: (iv_ruleArbitraryCommand= ruleArbitraryCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:951:2: iv_ruleArbitraryCommand= ruleArbitraryCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArbitraryCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleArbitraryCommand_in_entryRuleArbitraryCommand1997);
            iv_ruleArbitraryCommand=ruleArbitraryCommand();
            _fsp--;

             current =iv_ruleArbitraryCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryCommand2007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArbitraryCommand


    // $ANTLR start ruleArbitraryCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:958:1: ruleArbitraryCommand returns [EObject current=null] : ( (lv_keyword_0_0= ruleArbitraryCommandKeyword ) ) ;
    public final EObject ruleArbitraryCommand() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_keyword_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:963:6: ( ( (lv_keyword_0_0= ruleArbitraryCommandKeyword ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:964:1: ( (lv_keyword_0_0= ruleArbitraryCommandKeyword ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:964:1: ( (lv_keyword_0_0= ruleArbitraryCommandKeyword ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:965:1: (lv_keyword_0_0= ruleArbitraryCommandKeyword )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:965:1: (lv_keyword_0_0= ruleArbitraryCommandKeyword )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:966:3: lv_keyword_0_0= ruleArbitraryCommandKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArbitraryCommandAccess().getKeywordArbitraryCommandKeywordParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArbitraryCommandKeyword_in_ruleArbitraryCommand2052);
            lv_keyword_0_0=ruleArbitraryCommandKeyword();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArbitraryCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"ArbitraryCommandKeyword", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArbitraryCommand


    // $ANTLR start entryRuleArbitraryCommandKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:996:1: entryRuleArbitraryCommandKeyword returns [String current=null] : iv_ruleArbitraryCommandKeyword= ruleArbitraryCommandKeyword EOF ;
    public final String entryRuleArbitraryCommandKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArbitraryCommandKeyword = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1000:2: (iv_ruleArbitraryCommandKeyword= ruleArbitraryCommandKeyword EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1001:2: iv_ruleArbitraryCommandKeyword= ruleArbitraryCommandKeyword EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArbitraryCommandKeywordRule(), currentNode); 
            pushFollow(FOLLOW_ruleArbitraryCommandKeyword_in_entryRuleArbitraryCommandKeyword2094);
            iv_ruleArbitraryCommandKeyword=ruleArbitraryCommandKeyword();
            _fsp--;

             current =iv_ruleArbitraryCommandKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryCommandKeyword2105); 

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
    // $ANTLR end entryRuleArbitraryCommandKeyword


    // $ANTLR start ruleArbitraryCommandKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1011:1: ruleArbitraryCommandKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' (this_ID_1= RULE_ID | kw= '(' | kw= ')' | this_ANY_OTHER_4= RULE_ANY_OTHER ) ) ;
    public final AntlrDatatypeRuleToken ruleArbitraryCommandKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ANY_OTHER_4=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1017:6: ( (kw= '\\\\' (this_ID_1= RULE_ID | kw= '(' | kw= ')' | this_ANY_OTHER_4= RULE_ANY_OTHER ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1018:1: (kw= '\\\\' (this_ID_1= RULE_ID | kw= '(' | kw= ')' | this_ANY_OTHER_4= RULE_ANY_OTHER ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1018:1: (kw= '\\\\' (this_ID_1= RULE_ID | kw= '(' | kw= ')' | this_ANY_OTHER_4= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1019:2: kw= '\\\\' (this_ID_1= RULE_ID | kw= '(' | kw= ')' | this_ANY_OTHER_4= RULE_ANY_OTHER )
            {
            kw=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleArbitraryCommandKeyword2147); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getArbitraryCommandKeywordAccess().getReverseSolidusKeyword_0(), null); 
                
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1024:1: (this_ID_1= RULE_ID | kw= '(' | kw= ')' | this_ANY_OTHER_4= RULE_ANY_OTHER )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 18:
                {
                alt13=2;
                }
                break;
            case 19:
                {
                alt13=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1024:1: (this_ID_1= RULE_ID | kw= '(' | kw= ')' | this_ANY_OTHER_4= RULE_ANY_OTHER )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1024:6: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArbitraryCommandKeyword2163); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getArbitraryCommandKeywordAccess().getIDTerminalRuleCall_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1033:2: kw= '('
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleArbitraryCommandKeyword2187); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getArbitraryCommandKeywordAccess().getLeftParenthesisKeyword_1_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1040:2: kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleArbitraryCommandKeyword2206); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getArbitraryCommandKeywordAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1046:10: this_ANY_OTHER_4= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_4=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleArbitraryCommandKeyword2227); 

                    		current.merge(this_ANY_OTHER_4);
                        
                     
                        createLeafNode(grammarAccess.getArbitraryCommandKeywordAccess().getANY_OTHERTerminalRuleCall_1_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // $ANTLR end ruleArbitraryCommandKeyword


    // $ANTLR start entryRuleSpecialCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1064:1: entryRuleSpecialCommand returns [EObject current=null] : iv_ruleSpecialCommand= ruleSpecialCommand EOF ;
    public final EObject entryRuleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1065:2: (iv_ruleSpecialCommand= ruleSpecialCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1066:2: iv_ruleSpecialCommand= ruleSpecialCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecialCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2277);
            iv_ruleSpecialCommand=ruleSpecialCommand();
            _fsp--;

             current =iv_ruleSpecialCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand2287); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1073:1: ruleSpecialCommand returns [EObject current=null] : (this_Include_0= ruleInclude | this_Version_1= ruleVersion ) ;
    public final EObject ruleSpecialCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Include_0 = null;

        EObject this_Version_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1078:6: ( (this_Include_0= ruleInclude | this_Version_1= ruleVersion ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1079:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1079:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==25) ) {
                    alt14=1;
                }
                else if ( (LA14_1==26) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1079:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion )", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1079:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1080:5: this_Include_0= ruleInclude
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInclude_in_ruleSpecialCommand2334);
                    this_Include_0=ruleInclude();
                    _fsp--;

                     
                            current = this_Include_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1090:5: this_Version_1= ruleVersion
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVersion_in_ruleSpecialCommand2361);
                    this_Version_1=ruleVersion();
                    _fsp--;

                     
                            current = this_Version_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1106:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1107:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1108:2: iv_ruleInclude= ruleInclude EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude2396);
            iv_ruleInclude=ruleInclude();
            _fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude2406); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1115:1: ruleInclude returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1120:6: ( ( ( (lv_keyword_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1121:1: ( ( (lv_keyword_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1121:1: ( ( (lv_keyword_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1121:2: ( (lv_keyword_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1121:2: ( (lv_keyword_0_0= ruleIncludeKeyword ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1122:1: (lv_keyword_0_0= ruleIncludeKeyword )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1122:1: (lv_keyword_0_0= ruleIncludeKeyword )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1123:3: lv_keyword_0_0= ruleIncludeKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIncludeAccess().getKeywordIncludeKeywordParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIncludeKeyword_in_ruleInclude2452);
            lv_keyword_0_0=ruleIncludeKeyword();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIncludeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"IncludeKeyword", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1145:2: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1146:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1146:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1147:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude2469); 

            			createLeafNode(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleIncludeKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1177:1: entryRuleIncludeKeyword returns [String current=null] : iv_ruleIncludeKeyword= ruleIncludeKeyword EOF ;
    public final String entryRuleIncludeKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIncludeKeyword = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1181:2: (iv_ruleIncludeKeyword= ruleIncludeKeyword EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1182:2: iv_ruleIncludeKeyword= ruleIncludeKeyword EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncludeKeywordRule(), currentNode); 
            pushFollow(FOLLOW_ruleIncludeKeyword_in_entryRuleIncludeKeyword2517);
            iv_ruleIncludeKeyword=ruleIncludeKeyword();
            _fsp--;

             current =iv_ruleIncludeKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeKeyword2528); 

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
    // $ANTLR end entryRuleIncludeKeyword


    // $ANTLR start ruleIncludeKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1192:1: ruleIncludeKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' kw= 'include' ) ;
    public final AntlrDatatypeRuleToken ruleIncludeKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1198:6: ( (kw= '\\\\' kw= 'include' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1199:1: (kw= '\\\\' kw= 'include' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1199:1: (kw= '\\\\' kw= 'include' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1200:2: kw= '\\\\' kw= 'include'
            {
            kw=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleIncludeKeyword2570); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getIncludeKeywordAccess().getReverseSolidusKeyword_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleIncludeKeyword2583); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getIncludeKeywordAccess().getIncludeKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // $ANTLR end ruleIncludeKeyword


    // $ANTLR start entryRuleVersion
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1222:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1223:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1224:2: iv_ruleVersion= ruleVersion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVersionRule(), currentNode); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2627);
            iv_ruleVersion=ruleVersion();
            _fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2637); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1231:1: ruleVersion returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1236:6: ( ( ( (lv_keyword_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1237:1: ( ( (lv_keyword_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1237:1: ( ( (lv_keyword_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1237:2: ( (lv_keyword_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1237:2: ( (lv_keyword_0_0= ruleVersionKeyword ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1238:1: (lv_keyword_0_0= ruleVersionKeyword )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1238:1: (lv_keyword_0_0= ruleVersionKeyword )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1239:3: lv_keyword_0_0= ruleVersionKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVersionAccess().getKeywordVersionKeywordParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVersionKeyword_in_ruleVersion2683);
            lv_keyword_0_0=ruleVersionKeyword();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVersionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"VersionKeyword", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1261:2: ( (lv_version_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1262:1: (lv_version_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1262:1: (lv_version_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1263:3: lv_version_1_0= RULE_STRING
            {
            lv_version_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion2700); 

            			createLeafNode(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_1_0(), "version"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleVersionKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1293:1: entryRuleVersionKeyword returns [String current=null] : iv_ruleVersionKeyword= ruleVersionKeyword EOF ;
    public final String entryRuleVersionKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionKeyword = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1297:2: (iv_ruleVersionKeyword= ruleVersionKeyword EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1298:2: iv_ruleVersionKeyword= ruleVersionKeyword EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVersionKeywordRule(), currentNode); 
            pushFollow(FOLLOW_ruleVersionKeyword_in_entryRuleVersionKeyword2748);
            iv_ruleVersionKeyword=ruleVersionKeyword();
            _fsp--;

             current =iv_ruleVersionKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionKeyword2759); 

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
    // $ANTLR end entryRuleVersionKeyword


    // $ANTLR start ruleVersionKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1308:1: ruleVersionKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' kw= 'version' ) ;
    public final AntlrDatatypeRuleToken ruleVersionKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1314:6: ( (kw= '\\\\' kw= 'version' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1315:1: (kw= '\\\\' kw= 'version' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1315:1: (kw= '\\\\' kw= 'version' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1316:2: kw= '\\\\' kw= 'version'
            {
            kw=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleVersionKeyword2801); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getVersionKeywordAccess().getReverseSolidusKeyword_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleVersionKeyword2814); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getVersionKeywordAccess().getVersionKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // $ANTLR end ruleVersionKeyword


    // $ANTLR start entryRuleText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1338:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1339:2: (iv_ruleText= ruleText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1340:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText2858);
            iv_ruleText=ruleText();
            _fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2868); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1347:1: ruleText returns [EObject current=null] : ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        AntlrDatatypeRuleToken lv_value_0_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1352:6: ( ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1353:1: ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1353:1: ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1354:1: ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1354:1: ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1355:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1355:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 22:
                {
                alt15=1;
                }
                break;
            case 17:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            case 18:
                {
                alt15=4;
                }
                break;
            case 19:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1355:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1356:3: lv_value_0_1= ruleSchemeTextLiterals
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSchemeTextLiterals_in_ruleText2915);
                    lv_value_0_1=ruleSchemeTextLiterals();
                    _fsp--;


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
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1377:8: lv_value_0_2= '\\''
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleText2931); 

                            createLeafNode(grammarAccess.getTextAccess().getValueApostropheKeyword_0_1(), "value"); 
                        

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
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1395:8: lv_value_0_3= ','
                    {
                    lv_value_0_3=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleText2960); 

                            createLeafNode(grammarAccess.getTextAccess().getValueCommaKeyword_0_2(), "value"); 
                        

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
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1413:8: lv_value_0_4= '('
                    {
                    lv_value_0_4=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleText2989); 

                            createLeafNode(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_3(), "value"); 
                        

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
                    break;
                case 5 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1431:8: lv_value_0_5= ')'
                    {
                    lv_value_0_5=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleText3018); 

                            createLeafNode(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_4(), "value"); 
                        

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
                    break;

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1460:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1461:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1462:2: iv_ruleNumber= ruleNumber EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNumberRule(), currentNode); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber3069);
            iv_ruleNumber=ruleNumber();
            _fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber3079); 

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1469:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1474:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1475:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1475:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1476:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1476:1: (lv_value_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1477:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3120); 

            			createLeafNode(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), "value"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLilyPond130 = new BitSet(new long[]{0x00000000094F51E2L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExpression223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleExpression250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleExpression277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleExpression304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleExpression331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlock423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_ruleBlock450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSimpleBlock539 = new BitSet(new long[]{0x00000000094F71E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleBlock560 = new BitSet(new long[]{0x00000000094F71E0L});
    public static final BitSet FOLLOW_13_in_ruleSimpleBlock571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSimultaneousBlock661 = new BitSet(new long[]{0x00000000094FD1E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimultaneousBlock682 = new BitSet(new long[]{0x00000000094FD1E0L});
    public static final BitSet FOLLOW_15_in_ruleSimultaneousBlock693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleScheme774 = new BitSet(new long[]{0x0000000000D601F0L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSchemeExpression884 = new BitSet(new long[]{0x0000000000D401F0L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_ruleSchemeValue1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleSchemeBoolean1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList1246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSchemeList1300 = new BitSet(new long[]{0x0000000000DE01F0L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList1321 = new BitSet(new long[]{0x0000000000DE01F0L});
    public static final BitSet FOLLOW_19_in_ruleSchemeList1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSchemeBlock1413 = new BitSet(new long[]{0x00000000094F51E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSchemeBlock1434 = new BitSet(new long[]{0x00000000096F51E0L});
    public static final BitSet FOLLOW_21_in_ruleSchemeBlock1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText1481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_ruleSchemeText1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiterals1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSchemeTextLiterals1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeTextLiterals1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemeTextLiterals1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiterals1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSchemeNumber1802 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSchemeNumber1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryCommand_in_ruleCommand1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_ruleCommand1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryCommand_in_entryRuleArbitraryCommand1997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryCommand2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryCommandKeyword_in_ruleArbitraryCommand2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryCommandKeyword_in_entryRuleArbitraryCommandKeyword2094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryCommandKeyword2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleArbitraryCommandKeyword2147 = new BitSet(new long[]{0x00000000000C00A0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArbitraryCommandKeyword2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleArbitraryCommandKeyword2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleArbitraryCommandKeyword2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleArbitraryCommandKeyword2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand2277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleSpecialCommand2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSpecialCommand2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_ruleInclude2452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_entryRuleIncludeKeyword2517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeKeyword2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleIncludeKeyword2570 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleIncludeKeyword2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_ruleVersion2683 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_entryRuleVersionKeyword2748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionKeyword2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVersionKeyword2801 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVersionKeyword2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_ruleText2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleText2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleText2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleText2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleText3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3120 = new BitSet(new long[]{0x0000000000000002L});

}