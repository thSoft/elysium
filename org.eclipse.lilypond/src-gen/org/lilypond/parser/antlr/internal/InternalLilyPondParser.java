package org.lilypond.parser.antlr.internal; 

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
import org.lilypond.services.LilyPondGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalLilyPondParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TOPLEVELEXPRESSION", "RULE_WS_CHAR", "RULE_SL_COMMENT", "RULE_ML_COMMENT"
    };
    public static final int RULE_WS_CHAR=5;
    public static final int RULE_TOPLEVELEXPRESSION=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=6;
    public static final int RULE_ML_COMMENT=7;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g"; }


     
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
        	return classLoader.getResourceAsStream("org/lilypond/parser/antlr/internal/InternalLilyPond.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LilyPond";	
       	} 



    // $ANTLR start entryRuleLilyPond
    // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:72:1: entryRuleLilyPond returns [EObject current=null] : iv_ruleLilyPond= ruleLilyPond EOF ;
    public final EObject entryRuleLilyPond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLilyPond = null;


        try {
            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:72:50: (iv_ruleLilyPond= ruleLilyPond EOF )
            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:73:2: iv_ruleLilyPond= ruleLilyPond EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLilyPondRule(), currentNode); 
            pushFollow(FOLLOW_ruleLilyPond_in_entryRuleLilyPond73);
            iv_ruleLilyPond=ruleLilyPond();
            _fsp--;

             current =iv_ruleLilyPond; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilyPond83); 

            }

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
    // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:80:1: ruleLilyPond returns [EObject current=null] : (lv_expressions_0= RULE_TOPLEVELEXPRESSION )* ;
    public final EObject ruleLilyPond() throws RecognitionException {
        EObject current = null;

        Token lv_expressions_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:85:6: ( (lv_expressions_0= RULE_TOPLEVELEXPRESSION )* )
            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:86:1: (lv_expressions_0= RULE_TOPLEVELEXPRESSION )*
            {
            // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:86:1: (lv_expressions_0= RULE_TOPLEVELEXPRESSION )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TOPLEVELEXPRESSION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.lilypond/src-gen/org/lilypond/parser/antlr/internal/InternalLilyPond.g:88:6: lv_expressions_0= RULE_TOPLEVELEXPRESSION
            	    {
            	    lv_expressions_0=(Token)input.LT(1);
            	    match(input,RULE_TOPLEVELEXPRESSION,FOLLOW_RULE_TOPLEVELEXPRESSION_in_ruleLilyPond129); 

            	    		createLeafNode(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionTerminalRuleCall_0(), "expressions"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLilyPondRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "expressions", lv_expressions_0, "ToplevelExpression", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
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


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TOPLEVELEXPRESSION_in_ruleLilyPond129 = new BitSet(new long[]{0x0000000000000012L});

}