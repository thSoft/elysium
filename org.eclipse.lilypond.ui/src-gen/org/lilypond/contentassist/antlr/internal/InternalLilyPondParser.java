package org.lilypond.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.lilypond.services.LilyPondGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalLilyPondParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TOPLEVELEXPRESSION", "RULE_WS_CHAR", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT"
    };
    public static final int RULE_WS_CHAR=5;
    public static final int RULE_TOPLEVELEXPRESSION=4;
    public static final int RULE_WS=6;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=8;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g"; }


     
     	private LilyPondGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LilyPondGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleLilyPond
    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:60:1: entryRuleLilyPond : ruleLilyPond EOF ;
    public final void entryRuleLilyPond() throws RecognitionException {
        try {
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:60:19: ( ruleLilyPond EOF )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:61:1: ruleLilyPond EOF
            {
             before(grammarAccess.getLilyPondRule()); 
            pushFollow(FOLLOW_ruleLilyPond_in_entryRuleLilyPond60);
            ruleLilyPond();
            _fsp--;

             after(grammarAccess.getLilyPondRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilyPond67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLilyPond


    // $ANTLR start ruleLilyPond
    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:68:1: ruleLilyPond : ( ( rule__LilyPond__ExpressionsAssignment )* ) ;
    public final void ruleLilyPond() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:72:2: ( ( ( rule__LilyPond__ExpressionsAssignment )* ) )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:73:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            {
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:73:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:74:1: ( rule__LilyPond__ExpressionsAssignment )*
            {
             before(grammarAccess.getLilyPondAccess().getExpressionsAssignment()); 
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:75:1: ( rule__LilyPond__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TOPLEVELEXPRESSION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:75:2: rule__LilyPond__ExpressionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond94);
            	    rule__LilyPond__ExpressionsAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLilyPondAccess().getExpressionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLilyPond


    // $ANTLR start rule__LilyPond__ExpressionsAssignment
    // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:89:1: rule__LilyPond__ExpressionsAssignment : ( RULE_TOPLEVELEXPRESSION ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:93:1: ( ( RULE_TOPLEVELEXPRESSION ) )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:94:1: ( RULE_TOPLEVELEXPRESSION )
            {
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:94:1: ( RULE_TOPLEVELEXPRESSION )
            // ../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g:95:1: RULE_TOPLEVELEXPRESSION
            {
             before(grammarAccess.getLilyPondAccess().getExpressionsTopLevelExpressionTerminalRuleCall_0()); 
            match(input,RULE_TOPLEVELEXPRESSION,FOLLOW_RULE_TOPLEVELEXPRESSION_in_rule__LilyPond__ExpressionsAssignment133); 
             after(grammarAccess.getLilyPondAccess().getExpressionsTopLevelExpressionTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LilyPond__ExpressionsAssignment


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_TOPLEVELEXPRESSION_in_rule__LilyPond__ExpressionsAssignment133 = new BitSet(new long[]{0x0000000000000002L});

}