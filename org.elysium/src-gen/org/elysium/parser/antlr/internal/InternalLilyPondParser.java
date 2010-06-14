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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_INT", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "'{'", "'}'", "'<<'", "'>>'", "'#'", "'\\''", "'('", "')'", "'#{'", "'#}'", "'\\\\\\\\'", "'\\\\'", "'include'", "'version'", "','"
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
            ruleMemo = new HashMap[75+1];
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:83:1: entryRuleLilyPond returns [EObject current=null] : iv_ruleLilyPond= ruleLilyPond EOF ;
    public final EObject entryRuleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLilyPond = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:84:2: (iv_ruleLilyPond= ruleLilyPond EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:85:2: iv_ruleLilyPond= ruleLilyPond EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLilyPondRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLilyPond_in_entryRuleLilyPond81);
            iv_ruleLilyPond=ruleLilyPond();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLilyPond; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilyPond91); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:92:1: ruleLilyPond returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpression ) )* ;
    public final EObject ruleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:97:6: ( ( (lv_expressions_0_0= ruleExpression ) )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:98:1: ( (lv_expressions_0_0= ruleExpression ) )*
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:98:1: ( (lv_expressions_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==12||LA1_0==14||(LA1_0>=16 && LA1_0<=19)||(LA1_0>=22 && LA1_0<=23)||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:99:1: (lv_expressions_0_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:99:1: (lv_expressions_0_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:100:3: lv_expressions_0_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getLilyPondAccess().getExpressionsExpressionParserRuleCall_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleLilyPond136);
            	    lv_expressions_0_0=ruleExpression();
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


    // $ANTLR start entryRuleExpression
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:130:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:131:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:132:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression172);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression182); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:139:1: ruleExpression returns [EObject current=null] : (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_Scheme_1 = null;

        EObject this_Command_2 = null;

        EObject this_Text_3 = null;

        EObject this_Number_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:144:6: ( (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:145:1: (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:145:1: (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber )
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
            case 23:
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
            case 26:
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("145:1: (this_Block_0= ruleBlock | this_Scheme_1= ruleScheme | this_Command_2= ruleCommand | this_Text_3= ruleText | this_Number_4= ruleNumber )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:146:2: this_Block_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBlockParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleExpression232);
                    this_Block_0=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Block_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:159:2: this_Scheme_1= ruleScheme
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getSchemeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleScheme_in_ruleExpression262);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:172:2: this_Command_2= ruleCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommandParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommand_in_ruleExpression292);
                    this_Command_2=ruleCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Command_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:185:2: this_Text_3= ruleText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTextParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleExpression322);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:198:2: this_Number_4= ruleNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getNumberParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleExpression352);
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleBlock
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:217:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:218:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:219:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock387);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock397); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:226:1: ruleBlock returns [EObject current=null] : (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleBlock_0 = null;

        EObject this_SimultaneousBlock_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:231:6: ( (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:232:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:232:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("232:1: (this_SimpleBlock_0= ruleSimpleBlock | this_SimultaneousBlock_1= ruleSimultaneousBlock )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:233:2: this_SimpleBlock_0= ruleSimpleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_ruleBlock447);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:246:2: this_SimultaneousBlock_1= ruleSimultaneousBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_ruleBlock477);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:265:1: entryRuleSimpleBlock returns [EObject current=null] : iv_ruleSimpleBlock= ruleSimpleBlock EOF ;
    public final EObject entryRuleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:266:2: (iv_ruleSimpleBlock= ruleSimpleBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:267:2: iv_ruleSimpleBlock= ruleSimpleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock512);
            iv_ruleSimpleBlock=ruleSimpleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock522); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:274:1: ruleSimpleBlock returns [EObject current=null] : ( () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}' ) ;
    public final EObject ruleSimpleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:279:6: ( ( () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:280:1: ( () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:280:1: ( () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:280:2: () '{' ( (lv_expressions_2_0= ruleExpression ) )* '}'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:280:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:281:2: 
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

            match(input,12,FOLLOW_12_in_ruleSimpleBlock569); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:298:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||LA4_0==12||LA4_0==14||(LA4_0>=16 && LA4_0<=19)||(LA4_0>=22 && LA4_0<=23)||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:299:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:299:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:300:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimpleBlock590);
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
            	    break loop4;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleSimpleBlock601); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:334:1: entryRuleSimultaneousBlock returns [EObject current=null] : iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF ;
    public final EObject entryRuleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneousBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:335:2: (iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:336:2: iv_ruleSimultaneousBlock= ruleSimultaneousBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimultaneousBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock637);
            iv_ruleSimultaneousBlock=ruleSimultaneousBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimultaneousBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock647); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:343:1: ruleSimultaneousBlock returns [EObject current=null] : ( () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>' ) ;
    public final EObject ruleSimultaneousBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:348:6: ( ( () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:349:1: ( () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:349:1: ( () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:349:2: () '<<' ( (lv_expressions_2_0= ruleExpression ) )* '>>'
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:349:2: ()
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:350:2: 
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

            match(input,14,FOLLOW_14_in_ruleSimultaneousBlock694); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:367:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==12||LA5_0==14||(LA5_0>=16 && LA5_0<=19)||(LA5_0>=22 && LA5_0<=23)||LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:368:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:368:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:369:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSimultaneousBlock715);
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
            	    break loop5;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleSimultaneousBlock726); if (failed) return current;
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


    // $ANTLR start entryRuleScheme
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:403:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:404:2: (iv_ruleScheme= ruleScheme EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:405:2: iv_ruleScheme= ruleScheme EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme762);
            iv_ruleScheme=ruleScheme();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScheme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme772); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:412:1: ruleScheme returns [EObject current=null] : ( '#' ( (lv_value_1_0= ruleSchemeExpression ) ) ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:417:6: ( ( '#' ( (lv_value_1_0= ruleSchemeExpression ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:418:1: ( '#' ( (lv_value_1_0= ruleSchemeExpression ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:418:1: ( '#' ( (lv_value_1_0= ruleSchemeExpression ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:418:3: '#' ( (lv_value_1_0= ruleSchemeExpression ) )
            {
            match(input,16,FOLLOW_16_in_ruleScheme807); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeAccess().getNumberSignKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:422:1: ( (lv_value_1_0= ruleSchemeExpression ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:1: (lv_value_1_0= ruleSchemeExpression )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:423:1: (lv_value_1_0= ruleSchemeExpression )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:424:3: lv_value_1_0= ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_ruleScheme828);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:454:1: entryRuleSchemeExpression returns [EObject current=null] : iv_ruleSchemeExpression= ruleSchemeExpression EOF ;
    public final EObject entryRuleSchemeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeExpression = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:455:2: (iv_ruleSchemeExpression= ruleSchemeExpression EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:456:2: iv_ruleSchemeExpression= ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression864);
            iv_ruleSchemeExpression=ruleSchemeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression874); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:463:1: ruleSchemeExpression returns [EObject current=null] : ( ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) ) ) ;
    public final EObject ruleSchemeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_quoted_0_0=null;
        EObject lv_value_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:468:6: ( ( ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:469:1: ( ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:469:1: ( ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:469:2: ( (lv_quoted_0_0= '\\'' ) )? ( (lv_value_1_0= ruleSchemeValue ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:469:2: ( (lv_quoted_0_0= '\\'' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:470:1: (lv_quoted_0_0= '\\'' )
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:470:1: (lv_quoted_0_0= '\\'' )
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:471:3: lv_quoted_0_0= '\\''
                    {
                    lv_quoted_0_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleSchemeExpression917); if (failed) return current;
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

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:490:3: ( (lv_value_1_0= ruleSchemeValue ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:491:1: (lv_value_1_0= ruleSchemeValue )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:491:1: (lv_value_1_0= ruleSchemeValue )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:492:3: lv_value_1_0= ruleSchemeValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_ruleSchemeExpression952);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:522:1: entryRuleSchemeValue returns [EObject current=null] : iv_ruleSchemeValue= ruleSchemeValue EOF ;
    public final EObject entryRuleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeValue = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:523:2: (iv_ruleSchemeValue= ruleSchemeValue EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:524:2: iv_ruleSchemeValue= ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue988);
            iv_ruleSchemeValue=ruleSchemeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue998); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:531:1: ruleSchemeValue returns [EObject current=null] : (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_Number_4= ruleNumber ) ;
    public final EObject ruleSchemeValue() throws RecognitionException {
        EObject current = null;

        EObject this_SchemeBoolean_0 = null;

        EObject this_SchemeList_1 = null;

        EObject this_SchemeBlock_2 = null;

        EObject this_SchemeText_3 = null;

        EObject this_Number_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:536:6: ( (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_Number_4= ruleNumber ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:537:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_Number_4= ruleNumber )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:537:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_Number_4= ruleNumber )
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
                {
                alt7=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("537:1: (this_SchemeBoolean_0= ruleSchemeBoolean | this_SchemeList_1= ruleSchemeList | this_SchemeBlock_2= ruleSchemeBlock | this_SchemeText_3= ruleSchemeText | this_Number_4= ruleNumber )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:538:2: this_SchemeBoolean_0= ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue1048);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:551:2: this_SchemeList_1= ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_ruleSchemeValue1078);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:564:2: this_SchemeBlock_2= ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_ruleSchemeValue1108);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:577:2: this_SchemeText_3= ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_ruleSchemeValue1138);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:590:2: this_Number_4= ruleNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSchemeValueAccess().getNumberParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleSchemeValue1168);
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
    // $ANTLR end ruleSchemeValue


    // $ANTLR start entryRuleSchemeBoolean
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:609:1: entryRuleSchemeBoolean returns [EObject current=null] : iv_ruleSchemeBoolean= ruleSchemeBoolean EOF ;
    public final EObject entryRuleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBoolean = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:610:2: (iv_ruleSchemeBoolean= ruleSchemeBoolean EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:611:2: iv_ruleSchemeBoolean= ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1203);
            iv_ruleSchemeBoolean=ruleSchemeBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean1213); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:618:1: ruleSchemeBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleSchemeBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:623:6: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:624:1: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:624:1: ( (lv_value_0_0= RULE_BOOL ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:625:1: (lv_value_0_0= RULE_BOOL )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:625:1: (lv_value_0_0= RULE_BOOL )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:626:3: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleSchemeBoolean1254); if (failed) return current;
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:656:1: entryRuleSchemeList returns [EObject current=null] : iv_ruleSchemeList= ruleSchemeList EOF ;
    public final EObject entryRuleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeList = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:657:2: (iv_ruleSchemeList= ruleSchemeList EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:658:2: iv_ruleSchemeList= ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList1294);
            iv_ruleSchemeList=ruleSchemeList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList1304); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:665:1: ruleSchemeList returns [EObject current=null] : ( '(' ( (lv_expressions_1_0= ruleSchemeExpression ) )+ ')' ) ;
    public final EObject ruleSchemeList() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:670:6: ( ( '(' ( (lv_expressions_1_0= ruleSchemeExpression ) )+ ')' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:671:1: ( '(' ( (lv_expressions_1_0= ruleSchemeExpression ) )+ ')' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:671:1: ( '(' ( (lv_expressions_1_0= ruleSchemeExpression ) )+ ')' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:671:3: '(' ( (lv_expressions_1_0= ruleSchemeExpression ) )+ ')'
            {
            match(input,18,FOLLOW_18_in_ruleSchemeList1339); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:675:1: ( (lv_expressions_1_0= ruleSchemeExpression ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_BOOL && LA8_0<=RULE_INT)||(LA8_0>=17 && LA8_0<=18)||LA8_0==20||LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:676:1: (lv_expressions_1_0= ruleSchemeExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:676:1: (lv_expressions_1_0= ruleSchemeExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:677:3: lv_expressions_1_0= ruleSchemeExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSchemeExpression_in_ruleSchemeList1360);
            	    lv_expressions_1_0=ruleSchemeExpression();
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
            	      	        		lv_expressions_1_0, 
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
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            match(input,19,FOLLOW_19_in_ruleSchemeList1371); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_2(), null); 
                  
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:711:1: entryRuleSchemeBlock returns [EObject current=null] : iv_ruleSchemeBlock= ruleSchemeBlock EOF ;
    public final EObject entryRuleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeBlock = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:712:2: (iv_ruleSchemeBlock= ruleSchemeBlock EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:713:2: iv_ruleSchemeBlock= ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1407);
            iv_ruleSchemeBlock=ruleSchemeBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock1417); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:720:1: ruleSchemeBlock returns [EObject current=null] : ( '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}' ) ;
    public final EObject ruleSchemeBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:725:6: ( ( '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:726:1: ( '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:726:1: ( '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:726:3: '#{' ( (lv_expressions_1_0= ruleExpression ) )+ '#}'
            {
            match(input,20,FOLLOW_20_in_ruleSchemeBlock1452); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:730:1: ( (lv_expressions_1_0= ruleExpression ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)||LA9_0==12||LA9_0==14||(LA9_0>=16 && LA9_0<=19)||(LA9_0>=22 && LA9_0<=23)||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:731:1: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:731:1: (lv_expressions_1_0= ruleExpression )
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:732:3: lv_expressions_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSchemeBlock1473);
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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match(input,21,FOLLOW_21_in_ruleSchemeBlock1484); if (failed) return current;
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


    // $ANTLR start entryRuleSchemeText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:766:1: entryRuleSchemeText returns [EObject current=null] : iv_ruleSchemeText= ruleSchemeText EOF ;
    public final EObject entryRuleSchemeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemeText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:767:2: (iv_ruleSchemeText= ruleSchemeText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:768:2: iv_ruleSchemeText= ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText1520);
            iv_ruleSchemeText=ruleSchemeText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText1530); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:775:1: ruleSchemeText returns [EObject current=null] : ( (lv_value_0_0= ruleSchemeTextLiterals ) ) ;
    public final EObject ruleSchemeText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:780:6: ( ( (lv_value_0_0= ruleSchemeTextLiterals ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:781:1: ( (lv_value_0_0= ruleSchemeTextLiterals ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:781:1: ( (lv_value_0_0= ruleSchemeTextLiterals ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:782:1: (lv_value_0_0= ruleSchemeTextLiterals )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:782:1: (lv_value_0_0= ruleSchemeTextLiterals )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:783:3: lv_value_0_0= ruleSchemeTextLiterals
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_ruleSchemeText1575);
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:813:1: entryRuleSchemeTextLiterals returns [String current=null] : iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF ;
    public final String entryRuleSchemeTextLiterals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemeTextLiterals = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:814:2: (iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:815:2: iv_ruleSchemeTextLiterals= ruleSchemeTextLiterals EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSchemeTextLiteralsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals1611);
            iv_ruleSchemeTextLiterals=ruleSchemeTextLiterals();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSchemeTextLiterals.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiterals1622); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:822:1: ruleSchemeTextLiterals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSchemeTextLiterals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token this_ANY_OTHER_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:827:6: ( (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:828:1: (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:828:1: (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("828:1: (kw= '\\\\\\\\' | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:829:2: kw= '\\\\\\\\'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleSchemeTextLiterals1660); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:835:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchemeTextLiterals1681); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:843:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemeTextLiterals1707); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:851:10: this_ANY_OTHER_3= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_3=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiterals1733); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_3(), null); 
                          
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


    // $ANTLR start entryRuleCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:866:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:867:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:868:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1778);
            iv_ruleCommand=ruleCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1788); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:875:1: ruleCommand returns [EObject current=null] : (this_CustomCommand_0= ruleCustomCommand | this_PresetCommand_1= rulePresetCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_CustomCommand_0 = null;

        EObject this_PresetCommand_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:880:6: ( (this_CustomCommand_0= ruleCustomCommand | this_PresetCommand_1= rulePresetCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:881:1: (this_CustomCommand_0= ruleCustomCommand | this_PresetCommand_1= rulePresetCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:881:1: (this_CustomCommand_0= ruleCustomCommand | this_PresetCommand_1= rulePresetCommand )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=24 && LA11_1<=25)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==RULE_ID||LA11_1==RULE_ANY_OTHER||(LA11_1>=18 && LA11_1<=19)) ) {
                    alt11=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("881:1: (this_CustomCommand_0= ruleCustomCommand | this_PresetCommand_1= rulePresetCommand )", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("881:1: (this_CustomCommand_0= ruleCustomCommand | this_PresetCommand_1= rulePresetCommand )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:882:2: this_CustomCommand_0= ruleCustomCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommandAccess().getCustomCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCustomCommand_in_ruleCommand1838);
                    this_CustomCommand_0=ruleCustomCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CustomCommand_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:895:2: this_PresetCommand_1= rulePresetCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommandAccess().getPresetCommandParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePresetCommand_in_ruleCommand1868);
                    this_PresetCommand_1=rulePresetCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PresetCommand_1; 
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


    // $ANTLR start entryRuleCustomCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:914:1: entryRuleCustomCommand returns [EObject current=null] : iv_ruleCustomCommand= ruleCustomCommand EOF ;
    public final EObject entryRuleCustomCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:915:2: (iv_ruleCustomCommand= ruleCustomCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:916:2: iv_ruleCustomCommand= ruleCustomCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCustomCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCustomCommand_in_entryRuleCustomCommand1903);
            iv_ruleCustomCommand=ruleCustomCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCustomCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomCommand1913); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCustomCommand


    // $ANTLR start ruleCustomCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:923:1: ruleCustomCommand returns [EObject current=null] : (this_LongCommand_0= ruleLongCommand | this_ShortCommand_1= ruleShortCommand ) ;
    public final EObject ruleCustomCommand() throws RecognitionException {
        EObject current = null;

        EObject this_LongCommand_0 = null;

        EObject this_ShortCommand_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:928:6: ( (this_LongCommand_0= ruleLongCommand | this_ShortCommand_1= ruleShortCommand ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:929:1: (this_LongCommand_0= ruleLongCommand | this_ShortCommand_1= ruleShortCommand )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:929:1: (this_LongCommand_0= ruleLongCommand | this_ShortCommand_1= ruleShortCommand )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_ANY_OTHER||(LA12_1>=18 && LA12_1<=19)) ) {
                    alt12=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("929:1: (this_LongCommand_0= ruleLongCommand | this_ShortCommand_1= ruleShortCommand )", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("929:1: (this_LongCommand_0= ruleLongCommand | this_ShortCommand_1= ruleShortCommand )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:930:2: this_LongCommand_0= ruleLongCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCustomCommandAccess().getLongCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLongCommand_in_ruleCustomCommand1963);
                    this_LongCommand_0=ruleLongCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LongCommand_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:943:2: this_ShortCommand_1= ruleShortCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCustomCommandAccess().getShortCommandParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleShortCommand_in_ruleCustomCommand1993);
                    this_ShortCommand_1=ruleShortCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ShortCommand_1; 
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
    // $ANTLR end ruleCustomCommand


    // $ANTLR start entryRuleLongCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:962:1: entryRuleLongCommand returns [EObject current=null] : iv_ruleLongCommand= ruleLongCommand EOF ;
    public final EObject entryRuleLongCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:966:2: (iv_ruleLongCommand= ruleLongCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:967:2: iv_ruleLongCommand= ruleLongCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLongCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLongCommand_in_entryRuleLongCommand2034);
            iv_ruleLongCommand=ruleLongCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLongCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongCommand2044); if (failed) return current;

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
    // $ANTLR end entryRuleLongCommand


    // $ANTLR start ruleLongCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:977:1: ruleLongCommand returns [EObject current=null] : ( '\\\\' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLongCommand() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:983:6: ( ( '\\\\' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:984:1: ( '\\\\' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:984:1: ( '\\\\' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:984:3: '\\\\' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,23,FOLLOW_23_in_ruleLongCommand2083); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLongCommandAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:988:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:989:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:989:1: (lv_id_1_0= RULE_ID )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:990:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLongCommand2100); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getLongCommandAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLongCommandRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_1_0, 
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
    // $ANTLR end ruleLongCommand


    // $ANTLR start entryRuleShortCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1023:1: entryRuleShortCommand returns [EObject current=null] : iv_ruleShortCommand= ruleShortCommand EOF ;
    public final EObject entryRuleShortCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1027:2: (iv_ruleShortCommand= ruleShortCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1028:2: iv_ruleShortCommand= ruleShortCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getShortCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleShortCommand_in_entryRuleShortCommand2151);
            iv_ruleShortCommand=ruleShortCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleShortCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortCommand2161); if (failed) return current;

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
    // $ANTLR end entryRuleShortCommand


    // $ANTLR start ruleShortCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1038:1: ruleShortCommand returns [EObject current=null] : ( '\\\\' ( ( (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER ) ) ) ) ;
    public final EObject ruleShortCommand() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_1=null;
        Token lv_id_1_2=null;
        Token lv_id_1_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1044:6: ( ( '\\\\' ( ( (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER ) ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1045:1: ( '\\\\' ( ( (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER ) ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1045:1: ( '\\\\' ( ( (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1045:3: '\\\\' ( ( (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER ) ) )
            {
            match(input,23,FOLLOW_23_in_ruleShortCommand2200); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getShortCommandAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1049:1: ( ( (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1050:1: ( (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1050:1: ( (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1051:1: (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1051:1: (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt13=1;
                }
                break;
            case 19:
                {
                alt13=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt13=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1051:1: (lv_id_1_1= '(' | lv_id_1_2= ')' | lv_id_1_3= RULE_ANY_OTHER )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1052:3: lv_id_1_1= '('
                    {
                    lv_id_1_1=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleShortCommand2220); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getShortCommandAccess().getIdLeftParenthesisKeyword_1_0_0(), "id"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getShortCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_1_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1070:8: lv_id_1_2= ')'
                    {
                    lv_id_1_2=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleShortCommand2249); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getShortCommandAccess().getIdRightParenthesisKeyword_1_0_1(), "id"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getShortCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_1_2, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1088:8: lv_id_1_3= RULE_ANY_OTHER
                    {
                    lv_id_1_3=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleShortCommand2277); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getShortCommandAccess().getIdANY_OTHERTerminalRuleCall_1_0_2(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getShortCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_1_3, 
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleShortCommand


    // $ANTLR start entryRulePresetCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1123:1: entryRulePresetCommand returns [EObject current=null] : iv_rulePresetCommand= rulePresetCommand EOF ;
    public final EObject entryRulePresetCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresetCommand = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1124:2: (iv_rulePresetCommand= rulePresetCommand EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1125:2: iv_rulePresetCommand= rulePresetCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPresetCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePresetCommand_in_entryRulePresetCommand2325);
            iv_rulePresetCommand=rulePresetCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePresetCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePresetCommand2335); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresetCommand


    // $ANTLR start rulePresetCommand
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1132:1: rulePresetCommand returns [EObject current=null] : (this_Include_0= ruleInclude | this_Version_1= ruleVersion ) ;
    public final EObject rulePresetCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Include_0 = null;

        EObject this_Version_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1137:6: ( (this_Include_0= ruleInclude | this_Version_1= ruleVersion ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1138:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1138:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==25) ) {
                    alt14=2;
                }
                else if ( (LA14_1==24) ) {
                    alt14=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1138:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion )", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1138:1: (this_Include_0= ruleInclude | this_Version_1= ruleVersion )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1139:2: this_Include_0= ruleInclude
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPresetCommandAccess().getIncludeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_rulePresetCommand2385);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1152:2: this_Version_1= ruleVersion
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPresetCommandAccess().getVersionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVersion_in_rulePresetCommand2415);
                    this_Version_1=ruleVersion();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Version_1; 
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
    // $ANTLR end rulePresetCommand


    // $ANTLR start entryRuleInclude
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1171:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1172:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1173:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude2450);
            iv_ruleInclude=ruleInclude();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude2460); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1180:1: ruleInclude returns [EObject current=null] : ( ( (lv_id_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1185:6: ( ( ( (lv_id_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1186:1: ( ( (lv_id_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1186:1: ( ( (lv_id_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1186:2: ( (lv_id_0_0= ruleIncludeKeyword ) ) ( (lv_importURI_1_0= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1186:2: ( (lv_id_0_0= ruleIncludeKeyword ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1187:1: (lv_id_0_0= ruleIncludeKeyword )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1187:1: (lv_id_0_0= ruleIncludeKeyword )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1188:3: lv_id_0_0= ruleIncludeKeyword
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIncludeAccess().getIdIncludeKeywordParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIncludeKeyword_in_ruleInclude2506);
            lv_id_0_0=ruleIncludeKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIncludeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_0_0, 
              	        		"IncludeKeyword", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1210:2: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1211:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1211:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1212:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude2523); if (failed) return current;
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


    // $ANTLR start entryRuleIncludeKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1242:1: entryRuleIncludeKeyword returns [String current=null] : iv_ruleIncludeKeyword= ruleIncludeKeyword EOF ;
    public final String entryRuleIncludeKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIncludeKeyword = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1246:2: (iv_ruleIncludeKeyword= ruleIncludeKeyword EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1247:2: iv_ruleIncludeKeyword= ruleIncludeKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIncludeKeyword_in_entryRuleIncludeKeyword2571);
            iv_ruleIncludeKeyword=ruleIncludeKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIncludeKeyword.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeKeyword2582); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1257:1: ruleIncludeKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' kw= 'include' ) ;
    public final AntlrDatatypeRuleToken ruleIncludeKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1263:6: ( (kw= '\\\\' kw= 'include' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1264:1: (kw= '\\\\' kw= 'include' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1264:1: (kw= '\\\\' kw= 'include' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1265:2: kw= '\\\\' kw= 'include'
            {
            kw=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ruleIncludeKeyword2624); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getIncludeKeywordAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleIncludeKeyword2637); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getIncludeKeywordAccess().getIncludeKeyword_1(), null); 
                  
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
    // $ANTLR end ruleIncludeKeyword


    // $ANTLR start entryRuleVersion
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1287:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1288:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1289:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVersionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2681);
            iv_ruleVersion=ruleVersion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2691); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1296:1: ruleVersion returns [EObject current=null] : ( ( (lv_id_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1301:6: ( ( ( (lv_id_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1302:1: ( ( (lv_id_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1302:1: ( ( (lv_id_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1302:2: ( (lv_id_0_0= ruleVersionKeyword ) ) ( (lv_version_1_0= RULE_STRING ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1302:2: ( (lv_id_0_0= ruleVersionKeyword ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1303:1: (lv_id_0_0= ruleVersionKeyword )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1303:1: (lv_id_0_0= ruleVersionKeyword )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1304:3: lv_id_0_0= ruleVersionKeyword
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVersionAccess().getIdVersionKeywordParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVersionKeyword_in_ruleVersion2737);
            lv_id_0_0=ruleVersionKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVersionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_0_0, 
              	        		"VersionKeyword", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1326:2: ( (lv_version_1_0= RULE_STRING ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1327:1: (lv_version_1_0= RULE_STRING )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1327:1: (lv_version_1_0= RULE_STRING )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1328:3: lv_version_1_0= RULE_STRING
            {
            lv_version_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion2754); if (failed) return current;
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


    // $ANTLR start entryRuleVersionKeyword
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1358:1: entryRuleVersionKeyword returns [String current=null] : iv_ruleVersionKeyword= ruleVersionKeyword EOF ;
    public final String entryRuleVersionKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionKeyword = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1362:2: (iv_ruleVersionKeyword= ruleVersionKeyword EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1363:2: iv_ruleVersionKeyword= ruleVersionKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVersionKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVersionKeyword_in_entryRuleVersionKeyword2802);
            iv_ruleVersionKeyword=ruleVersionKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVersionKeyword.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionKeyword2813); if (failed) return current;

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1373:1: ruleVersionKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' kw= 'version' ) ;
    public final AntlrDatatypeRuleToken ruleVersionKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1379:6: ( (kw= '\\\\' kw= 'version' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1380:1: (kw= '\\\\' kw= 'version' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1380:1: (kw= '\\\\' kw= 'version' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1381:2: kw= '\\\\' kw= 'version'
            {
            kw=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ruleVersionKeyword2855); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getVersionKeywordAccess().getReverseSolidusKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleVersionKeyword2868); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getVersionKeywordAccess().getVersionKeyword_1(), null); 
                  
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
    // $ANTLR end ruleVersionKeyword


    // $ANTLR start entryRuleText
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1403:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1404:2: (iv_ruleText= ruleText EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1405:2: iv_ruleText= ruleText EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText2912);
            iv_ruleText=ruleText();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2922); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1412:1: ruleText returns [EObject current=null] : ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        AntlrDatatypeRuleToken lv_value_0_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1417:6: ( ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1418:1: ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1418:1: ( ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1419:1: ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1419:1: ( (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1420:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1420:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' )
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
            case 26:
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1420:1: (lv_value_0_1= ruleSchemeTextLiterals | lv_value_0_2= '\\'' | lv_value_0_3= ',' | lv_value_0_4= '(' | lv_value_0_5= ')' )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1421:3: lv_value_0_1= ruleSchemeTextLiterals
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSchemeTextLiterals_in_ruleText2969);
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1442:8: lv_value_0_2= '\\''
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleText2985); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueApostropheKeyword_0_1(), "value"); 
                          
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1460:8: lv_value_0_3= ','
                    {
                    lv_value_0_3=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleText3014); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueCommaKeyword_0_2(), "value"); 
                          
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1478:8: lv_value_0_4= '('
                    {
                    lv_value_0_4=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleText3043); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_3(), "value"); 
                          
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
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1496:8: lv_value_0_5= ')'
                    {
                    lv_value_0_5=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleText3072); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_4(), "value"); 
                          
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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1525:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1526:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1527:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber3123);
            iv_ruleNumber=ruleNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber3133); if (failed) return current;

            }

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
    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1534:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1539:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1540:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1540:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1541:1: (lv_value_0_0= RULE_INT )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1542:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3174); if (failed) return current;
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


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLilyPond136 = new BitSet(new long[]{0x0000000004CF51E2L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExpression232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleExpression262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleExpression292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleExpression322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleExpression352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_ruleBlock447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_ruleBlock477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSimpleBlock569 = new BitSet(new long[]{0x0000000004CF71E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleBlock590 = new BitSet(new long[]{0x0000000004CF71E0L});
    public static final BitSet FOLLOW_13_in_ruleSimpleBlock601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSimultaneousBlock694 = new BitSet(new long[]{0x0000000004CFD1E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSimultaneousBlock715 = new BitSet(new long[]{0x0000000004CFD1E0L});
    public static final BitSet FOLLOW_15_in_ruleSimultaneousBlock726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleScheme807 = new BitSet(new long[]{0x00000000005601F0L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleScheme828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSchemeExpression917 = new BitSet(new long[]{0x00000000005401F0L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_ruleSchemeExpression952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_ruleSchemeValue1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_ruleSchemeValue1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_ruleSchemeValue1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_ruleSchemeValue1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleSchemeValue1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleSchemeBoolean1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSchemeList1339 = new BitSet(new long[]{0x00000000005601F0L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_ruleSchemeList1360 = new BitSet(new long[]{0x00000000005E01F0L});
    public static final BitSet FOLLOW_19_in_ruleSchemeList1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSchemeBlock1452 = new BitSet(new long[]{0x0000000004CF51E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSchemeBlock1473 = new BitSet(new long[]{0x0000000004EF51E0L});
    public static final BitSet FOLLOW_21_in_ruleSchemeBlock1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_ruleSchemeText1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals1611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiterals1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSchemeTextLiterals1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchemeTextLiterals1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemeTextLiterals1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSchemeTextLiterals1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomCommand_in_ruleCommand1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresetCommand_in_ruleCommand1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomCommand_in_entryRuleCustomCommand1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomCommand1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongCommand_in_ruleCustomCommand1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortCommand_in_ruleCustomCommand1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongCommand_in_entryRuleLongCommand2034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongCommand2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLongCommand2083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLongCommand2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortCommand_in_entryRuleShortCommand2151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortCommand2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleShortCommand2200 = new BitSet(new long[]{0x00000000000C0080L});
    public static final BitSet FOLLOW_18_in_ruleShortCommand2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleShortCommand2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleShortCommand2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresetCommand_in_entryRulePresetCommand2325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresetCommand2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rulePresetCommand2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rulePresetCommand2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude2450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_ruleInclude2506 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_entryRuleIncludeKeyword2571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeKeyword2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIncludeKeyword2624 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIncludeKeyword2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_ruleVersion2737 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_entryRuleVersionKeyword2802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionKeyword2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVersionKeyword2855 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVersionKeyword2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_ruleText2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleText2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleText3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleText3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleText3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3174 = new BitSet(new long[]{0x0000000000000002L});

}