package org.elysium.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.elysium.services.LilyPondGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyPondParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_BOOL", "RULE_INT", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "'\\\\\\\\'", "'('", "')'", "'\\''", "','", "'{'", "'}'", "'<<'", "'>>'", "'#'", "'\\\\'", "'include'", "'version'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_BOOL=7;
    public static final int RULE_INT=8;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g"; }


     
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:61:1: entryRuleLilyPond : ruleLilyPond EOF ;
    public final void entryRuleLilyPond() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:62:1: ( ruleLilyPond EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:63:1: ruleLilyPond EOF
            {
             before(grammarAccess.getLilyPondRule()); 
            pushFollow(FOLLOW_ruleLilyPond_in_entryRuleLilyPond61);
            ruleLilyPond();
            _fsp--;

             after(grammarAccess.getLilyPondRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilyPond68); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:70:1: ruleLilyPond : ( ( rule__LilyPond__ExpressionsAssignment )* ) ;
    public final void ruleLilyPond() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:74:2: ( ( ( rule__LilyPond__ExpressionsAssignment )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:75:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:75:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:76:1: ( rule__LilyPond__ExpressionsAssignment )*
            {
             before(grammarAccess.getLilyPondAccess().getExpressionsAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:77:1: ( rule__LilyPond__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||LA1_0==RULE_INT||(LA1_0>=12 && LA1_0<=17)||LA1_0==19||(LA1_0>=21 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:77:2: rule__LilyPond__ExpressionsAssignment
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


    // $ANTLR start entryRuleExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:89:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:90:1: ( ruleExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:91:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression122);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression129); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:98:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:102:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:103:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:103:1: ( ( rule__Expression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:104:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:105:1: ( rule__Expression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:105:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression155);
            rule__Expression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:117:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:118:1: ( ruleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:119:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock182);
            ruleBlock();
            _fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock189); 

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
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:126:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:130:2: ( ( ( rule__Block__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:131:1: ( ( rule__Block__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:131:1: ( ( rule__Block__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:132:1: ( rule__Block__Alternatives )
            {
             before(grammarAccess.getBlockAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:133:1: ( rule__Block__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:133:2: rule__Block__Alternatives
            {
            pushFollow(FOLLOW_rule__Block__Alternatives_in_ruleBlock215);
            rule__Block__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBlockAccess().getAlternatives()); 

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
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleSimpleBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:145:1: entryRuleSimpleBlock : ruleSimpleBlock EOF ;
    public final void entryRuleSimpleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:146:1: ( ruleSimpleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:147:1: ruleSimpleBlock EOF
            {
             before(grammarAccess.getSimpleBlockRule()); 
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock242);
            ruleSimpleBlock();
            _fsp--;

             after(grammarAccess.getSimpleBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock249); 

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
    // $ANTLR end entryRuleSimpleBlock


    // $ANTLR start ruleSimpleBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:154:1: ruleSimpleBlock : ( ( rule__SimpleBlock__Group__0 ) ) ;
    public final void ruleSimpleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:158:2: ( ( ( rule__SimpleBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:159:1: ( ( rule__SimpleBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:159:1: ( ( rule__SimpleBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:160:1: ( rule__SimpleBlock__Group__0 )
            {
             before(grammarAccess.getSimpleBlockAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:161:1: ( rule__SimpleBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:161:2: rule__SimpleBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0_in_ruleSimpleBlock275);
            rule__SimpleBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleBlockAccess().getGroup()); 

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
    // $ANTLR end ruleSimpleBlock


    // $ANTLR start entryRuleSimultaneousBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:173:1: entryRuleSimultaneousBlock : ruleSimultaneousBlock EOF ;
    public final void entryRuleSimultaneousBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:174:1: ( ruleSimultaneousBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:175:1: ruleSimultaneousBlock EOF
            {
             before(grammarAccess.getSimultaneousBlockRule()); 
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock302);
            ruleSimultaneousBlock();
            _fsp--;

             after(grammarAccess.getSimultaneousBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock309); 

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
    // $ANTLR end entryRuleSimultaneousBlock


    // $ANTLR start ruleSimultaneousBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:182:1: ruleSimultaneousBlock : ( ( rule__SimultaneousBlock__Group__0 ) ) ;
    public final void ruleSimultaneousBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:186:2: ( ( ( rule__SimultaneousBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:187:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:187:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:188:1: ( rule__SimultaneousBlock__Group__0 )
            {
             before(grammarAccess.getSimultaneousBlockAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:189:1: ( rule__SimultaneousBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:189:2: rule__SimultaneousBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0_in_ruleSimultaneousBlock335);
            rule__SimultaneousBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimultaneousBlockAccess().getGroup()); 

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
    // $ANTLR end ruleSimultaneousBlock


    // $ANTLR start entryRuleScheme
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:201:1: entryRuleScheme : ruleScheme EOF ;
    public final void entryRuleScheme() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:202:1: ( ruleScheme EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:203:1: ruleScheme EOF
            {
             before(grammarAccess.getSchemeRule()); 
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme362);
            ruleScheme();
            _fsp--;

             after(grammarAccess.getSchemeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme369); 

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
    // $ANTLR end entryRuleScheme


    // $ANTLR start ruleScheme
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:210:1: ruleScheme : ( ( rule__Scheme__Group__0 ) ) ;
    public final void ruleScheme() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:214:2: ( ( ( rule__Scheme__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:215:1: ( ( rule__Scheme__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:215:1: ( ( rule__Scheme__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:216:1: ( rule__Scheme__Group__0 )
            {
             before(grammarAccess.getSchemeAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:217:1: ( rule__Scheme__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:217:2: rule__Scheme__Group__0
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0_in_ruleScheme395);
            rule__Scheme__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSchemeAccess().getGroup()); 

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
    // $ANTLR end ruleScheme


    // $ANTLR start entryRuleSchemeExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:229:1: entryRuleSchemeExpression : ruleSchemeExpression EOF ;
    public final void entryRuleSchemeExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:230:1: ( ruleSchemeExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:231:1: ruleSchemeExpression EOF
            {
             before(grammarAccess.getSchemeExpressionRule()); 
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression422);
            ruleSchemeExpression();
            _fsp--;

             after(grammarAccess.getSchemeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression429); 

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
    // $ANTLR end entryRuleSchemeExpression


    // $ANTLR start ruleSchemeExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:238:1: ruleSchemeExpression : ( ( rule__SchemeExpression__Group__0 ) ) ;
    public final void ruleSchemeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:242:2: ( ( ( rule__SchemeExpression__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:243:1: ( ( rule__SchemeExpression__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:243:1: ( ( rule__SchemeExpression__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:244:1: ( rule__SchemeExpression__Group__0 )
            {
             before(grammarAccess.getSchemeExpressionAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:245:1: ( rule__SchemeExpression__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:245:2: rule__SchemeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0_in_ruleSchemeExpression455);
            rule__SchemeExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSchemeExpressionAccess().getGroup()); 

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
    // $ANTLR end ruleSchemeExpression


    // $ANTLR start entryRuleSchemeValue
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:257:1: entryRuleSchemeValue : ruleSchemeValue EOF ;
    public final void entryRuleSchemeValue() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:258:1: ( ruleSchemeValue EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:259:1: ruleSchemeValue EOF
            {
             before(grammarAccess.getSchemeValueRule()); 
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue482);
            ruleSchemeValue();
            _fsp--;

             after(grammarAccess.getSchemeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue489); 

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
    // $ANTLR end entryRuleSchemeValue


    // $ANTLR start ruleSchemeValue
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:266:1: ruleSchemeValue : ( ( rule__SchemeValue__Alternatives ) ) ;
    public final void ruleSchemeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:270:2: ( ( ( rule__SchemeValue__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:271:1: ( ( rule__SchemeValue__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:271:1: ( ( rule__SchemeValue__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:272:1: ( rule__SchemeValue__Alternatives )
            {
             before(grammarAccess.getSchemeValueAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:273:1: ( rule__SchemeValue__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:273:2: rule__SchemeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeValue__Alternatives_in_ruleSchemeValue515);
            rule__SchemeValue__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSchemeValueAccess().getAlternatives()); 

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
    // $ANTLR end ruleSchemeValue


    // $ANTLR start entryRuleSchemeBoolean
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:285:1: entryRuleSchemeBoolean : ruleSchemeBoolean EOF ;
    public final void entryRuleSchemeBoolean() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:286:1: ( ruleSchemeBoolean EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:287:1: ruleSchemeBoolean EOF
            {
             before(grammarAccess.getSchemeBooleanRule()); 
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean542);
            ruleSchemeBoolean();
            _fsp--;

             after(grammarAccess.getSchemeBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean549); 

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
    // $ANTLR end entryRuleSchemeBoolean


    // $ANTLR start ruleSchemeBoolean
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:294:1: ruleSchemeBoolean : ( ( rule__SchemeBoolean__ValueAssignment ) ) ;
    public final void ruleSchemeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:298:2: ( ( ( rule__SchemeBoolean__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:299:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:299:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:300:1: ( rule__SchemeBoolean__ValueAssignment )
            {
             before(grammarAccess.getSchemeBooleanAccess().getValueAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:301:1: ( rule__SchemeBoolean__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:301:2: rule__SchemeBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeBoolean__ValueAssignment_in_ruleSchemeBoolean575);
            rule__SchemeBoolean__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getSchemeBooleanAccess().getValueAssignment()); 

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
    // $ANTLR end ruleSchemeBoolean


    // $ANTLR start entryRuleSchemeList
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:313:1: entryRuleSchemeList : ruleSchemeList EOF ;
    public final void entryRuleSchemeList() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:314:1: ( ruleSchemeList EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:315:1: ruleSchemeList EOF
            {
             before(grammarAccess.getSchemeListRule()); 
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList602);
            ruleSchemeList();
            _fsp--;

             after(grammarAccess.getSchemeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList609); 

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
    // $ANTLR end entryRuleSchemeList


    // $ANTLR start ruleSchemeList
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:322:1: ruleSchemeList : ( ( rule__SchemeList__Group__0 ) ) ;
    public final void ruleSchemeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:326:2: ( ( ( rule__SchemeList__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:327:1: ( ( rule__SchemeList__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:327:1: ( ( rule__SchemeList__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:328:1: ( rule__SchemeList__Group__0 )
            {
             before(grammarAccess.getSchemeListAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:329:1: ( rule__SchemeList__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:329:2: rule__SchemeList__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0_in_ruleSchemeList635);
            rule__SchemeList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSchemeListAccess().getGroup()); 

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
    // $ANTLR end ruleSchemeList


    // $ANTLR start entryRuleSchemeText
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:341:1: entryRuleSchemeText : ruleSchemeText EOF ;
    public final void entryRuleSchemeText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:342:1: ( ruleSchemeText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:343:1: ruleSchemeText EOF
            {
             before(grammarAccess.getSchemeTextRule()); 
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText662);
            ruleSchemeText();
            _fsp--;

             after(grammarAccess.getSchemeTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText669); 

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
    // $ANTLR end entryRuleSchemeText


    // $ANTLR start ruleSchemeText
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:350:1: ruleSchemeText : ( ( rule__SchemeText__ValueAssignment ) ) ;
    public final void ruleSchemeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:354:2: ( ( ( rule__SchemeText__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:355:1: ( ( rule__SchemeText__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:355:1: ( ( rule__SchemeText__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:356:1: ( rule__SchemeText__ValueAssignment )
            {
             before(grammarAccess.getSchemeTextAccess().getValueAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:357:1: ( rule__SchemeText__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:357:2: rule__SchemeText__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText695);
            rule__SchemeText__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getSchemeTextAccess().getValueAssignment()); 

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
    // $ANTLR end ruleSchemeText


    // $ANTLR start entryRuleSchemeTextLiterals
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:369:1: entryRuleSchemeTextLiterals : ruleSchemeTextLiterals EOF ;
    public final void entryRuleSchemeTextLiterals() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:370:1: ( ruleSchemeTextLiterals EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:371:1: ruleSchemeTextLiterals EOF
            {
             before(grammarAccess.getSchemeTextLiteralsRule()); 
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals722);
            ruleSchemeTextLiterals();
            _fsp--;

             after(grammarAccess.getSchemeTextLiteralsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiterals729); 

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
    // $ANTLR end entryRuleSchemeTextLiterals


    // $ANTLR start ruleSchemeTextLiterals
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:378:1: ruleSchemeTextLiterals : ( ( rule__SchemeTextLiterals__Alternatives ) ) ;
    public final void ruleSchemeTextLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:382:2: ( ( ( rule__SchemeTextLiterals__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:383:1: ( ( rule__SchemeTextLiterals__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:383:1: ( ( rule__SchemeTextLiterals__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:384:1: ( rule__SchemeTextLiterals__Alternatives )
            {
             before(grammarAccess.getSchemeTextLiteralsAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:385:1: ( rule__SchemeTextLiterals__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:385:2: rule__SchemeTextLiterals__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeTextLiterals__Alternatives_in_ruleSchemeTextLiterals755);
            rule__SchemeTextLiterals__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSchemeTextLiteralsAccess().getAlternatives()); 

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
    // $ANTLR end ruleSchemeTextLiterals


    // $ANTLR start entryRuleCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:397:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:398:1: ( ruleCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:399:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand782);
            ruleCommand();
            _fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand789); 

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
    // $ANTLR end entryRuleCommand


    // $ANTLR start ruleCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:406:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:410:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:411:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:411:1: ( ( rule__Command__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:412:1: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:413:1: ( rule__Command__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:413:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand815);
            rule__Command__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

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
    // $ANTLR end ruleCommand


    // $ANTLR start entryRuleCustomCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:425:1: entryRuleCustomCommand : ruleCustomCommand EOF ;
    public final void entryRuleCustomCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:426:1: ( ruleCustomCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:427:1: ruleCustomCommand EOF
            {
             before(grammarAccess.getCustomCommandRule()); 
            pushFollow(FOLLOW_ruleCustomCommand_in_entryRuleCustomCommand842);
            ruleCustomCommand();
            _fsp--;

             after(grammarAccess.getCustomCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomCommand849); 

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
    // $ANTLR end entryRuleCustomCommand


    // $ANTLR start ruleCustomCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:434:1: ruleCustomCommand : ( ( rule__CustomCommand__Alternatives ) ) ;
    public final void ruleCustomCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:438:2: ( ( ( rule__CustomCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:439:1: ( ( rule__CustomCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:439:1: ( ( rule__CustomCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:440:1: ( rule__CustomCommand__Alternatives )
            {
             before(grammarAccess.getCustomCommandAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:441:1: ( rule__CustomCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:441:2: rule__CustomCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__CustomCommand__Alternatives_in_ruleCustomCommand875);
            rule__CustomCommand__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCustomCommandAccess().getAlternatives()); 

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
    // $ANTLR end ruleCustomCommand


    // $ANTLR start entryRuleLongCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:453:1: entryRuleLongCommand : ruleLongCommand EOF ;
    public final void entryRuleLongCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:457:1: ( ruleLongCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:458:1: ruleLongCommand EOF
            {
             before(grammarAccess.getLongCommandRule()); 
            pushFollow(FOLLOW_ruleLongCommand_in_entryRuleLongCommand907);
            ruleLongCommand();
            _fsp--;

             after(grammarAccess.getLongCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongCommand914); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleLongCommand


    // $ANTLR start ruleLongCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:468:1: ruleLongCommand : ( ( rule__LongCommand__Group__0 ) ) ;
    public final void ruleLongCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:473:2: ( ( ( rule__LongCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:474:1: ( ( rule__LongCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:474:1: ( ( rule__LongCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:475:1: ( rule__LongCommand__Group__0 )
            {
             before(grammarAccess.getLongCommandAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:476:1: ( rule__LongCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:476:2: rule__LongCommand__Group__0
            {
            pushFollow(FOLLOW_rule__LongCommand__Group__0_in_ruleLongCommand944);
            rule__LongCommand__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLongCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleLongCommand


    // $ANTLR start entryRuleShortCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:489:1: entryRuleShortCommand : ruleShortCommand EOF ;
    public final void entryRuleShortCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:493:1: ( ruleShortCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:494:1: ruleShortCommand EOF
            {
             before(grammarAccess.getShortCommandRule()); 
            pushFollow(FOLLOW_ruleShortCommand_in_entryRuleShortCommand976);
            ruleShortCommand();
            _fsp--;

             after(grammarAccess.getShortCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortCommand983); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleShortCommand


    // $ANTLR start ruleShortCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:1: ruleShortCommand : ( ( rule__ShortCommand__Group__0 ) ) ;
    public final void ruleShortCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:509:2: ( ( ( rule__ShortCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:510:1: ( ( rule__ShortCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:510:1: ( ( rule__ShortCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:511:1: ( rule__ShortCommand__Group__0 )
            {
             before(grammarAccess.getShortCommandAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:512:1: ( rule__ShortCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:512:2: rule__ShortCommand__Group__0
            {
            pushFollow(FOLLOW_rule__ShortCommand__Group__0_in_ruleShortCommand1013);
            rule__ShortCommand__Group__0();
            _fsp--;


            }

             after(grammarAccess.getShortCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleShortCommand


    // $ANTLR start entryRulePresetCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:525:1: entryRulePresetCommand : rulePresetCommand EOF ;
    public final void entryRulePresetCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:526:1: ( rulePresetCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:527:1: rulePresetCommand EOF
            {
             before(grammarAccess.getPresetCommandRule()); 
            pushFollow(FOLLOW_rulePresetCommand_in_entryRulePresetCommand1040);
            rulePresetCommand();
            _fsp--;

             after(grammarAccess.getPresetCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresetCommand1047); 

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
    // $ANTLR end entryRulePresetCommand


    // $ANTLR start rulePresetCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:534:1: rulePresetCommand : ( ( rule__PresetCommand__Alternatives ) ) ;
    public final void rulePresetCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:538:2: ( ( ( rule__PresetCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:539:1: ( ( rule__PresetCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:539:1: ( ( rule__PresetCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:540:1: ( rule__PresetCommand__Alternatives )
            {
             before(grammarAccess.getPresetCommandAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:541:1: ( rule__PresetCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:541:2: rule__PresetCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__PresetCommand__Alternatives_in_rulePresetCommand1073);
            rule__PresetCommand__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPresetCommandAccess().getAlternatives()); 

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
    // $ANTLR end rulePresetCommand


    // $ANTLR start entryRuleInclude
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:553:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:554:1: ( ruleInclude EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:555:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1100);
            ruleInclude();
            _fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1107); 

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
    // $ANTLR end entryRuleInclude


    // $ANTLR start ruleInclude
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:562:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:566:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:567:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:567:1: ( ( rule__Include__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:568:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:569:1: ( rule__Include__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:569:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude1133);
            rule__Include__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

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
    // $ANTLR end ruleInclude


    // $ANTLR start entryRuleIncludeKeyword
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:581:1: entryRuleIncludeKeyword : ruleIncludeKeyword EOF ;
    public final void entryRuleIncludeKeyword() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:585:1: ( ruleIncludeKeyword EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:586:1: ruleIncludeKeyword EOF
            {
             before(grammarAccess.getIncludeKeywordRule()); 
            pushFollow(FOLLOW_ruleIncludeKeyword_in_entryRuleIncludeKeyword1165);
            ruleIncludeKeyword();
            _fsp--;

             after(grammarAccess.getIncludeKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeKeyword1172); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleIncludeKeyword


    // $ANTLR start ruleIncludeKeyword
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:596:1: ruleIncludeKeyword : ( ( rule__IncludeKeyword__Group__0 ) ) ;
    public final void ruleIncludeKeyword() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:601:2: ( ( ( rule__IncludeKeyword__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:602:1: ( ( rule__IncludeKeyword__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:602:1: ( ( rule__IncludeKeyword__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:603:1: ( rule__IncludeKeyword__Group__0 )
            {
             before(grammarAccess.getIncludeKeywordAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:604:1: ( rule__IncludeKeyword__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:604:2: rule__IncludeKeyword__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeKeyword__Group__0_in_ruleIncludeKeyword1202);
            rule__IncludeKeyword__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIncludeKeywordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleIncludeKeyword


    // $ANTLR start entryRuleVersion
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:617:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:618:1: ( ruleVersion EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:619:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1229);
            ruleVersion();
            _fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion1236); 

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
    // $ANTLR end entryRuleVersion


    // $ANTLR start ruleVersion
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:626:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:630:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:631:1: ( ( rule__Version__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:631:1: ( ( rule__Version__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:632:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:633:1: ( rule__Version__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:633:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion1262);
            rule__Version__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

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
    // $ANTLR end ruleVersion


    // $ANTLR start entryRuleVersionKeyword
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:645:1: entryRuleVersionKeyword : ruleVersionKeyword EOF ;
    public final void entryRuleVersionKeyword() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:649:1: ( ruleVersionKeyword EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:650:1: ruleVersionKeyword EOF
            {
             before(grammarAccess.getVersionKeywordRule()); 
            pushFollow(FOLLOW_ruleVersionKeyword_in_entryRuleVersionKeyword1294);
            ruleVersionKeyword();
            _fsp--;

             after(grammarAccess.getVersionKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionKeyword1301); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleVersionKeyword


    // $ANTLR start ruleVersionKeyword
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:660:1: ruleVersionKeyword : ( ( rule__VersionKeyword__Group__0 ) ) ;
    public final void ruleVersionKeyword() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:665:2: ( ( ( rule__VersionKeyword__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:666:1: ( ( rule__VersionKeyword__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:666:1: ( ( rule__VersionKeyword__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:667:1: ( rule__VersionKeyword__Group__0 )
            {
             before(grammarAccess.getVersionKeywordAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:668:1: ( rule__VersionKeyword__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:668:2: rule__VersionKeyword__Group__0
            {
            pushFollow(FOLLOW_rule__VersionKeyword__Group__0_in_ruleVersionKeyword1331);
            rule__VersionKeyword__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVersionKeywordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleVersionKeyword


    // $ANTLR start entryRuleText
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:681:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:682:1: ( ruleText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:683:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1358);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1365); 

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
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:690:1: ruleText : ( ( rule__Text__ValueAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:694:2: ( ( ( rule__Text__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:695:1: ( ( rule__Text__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:695:1: ( ( rule__Text__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:696:1: ( rule__Text__ValueAssignment )
            {
             before(grammarAccess.getTextAccess().getValueAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:697:1: ( rule__Text__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:697:2: rule__Text__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Text__ValueAssignment_in_ruleText1391);
            rule__Text__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getTextAccess().getValueAssignment()); 

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
    // $ANTLR end ruleText


    // $ANTLR start entryRuleNumber
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:709:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:710:1: ( ruleNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:711:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1418);
            ruleNumber();
            _fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1425); 

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
    // $ANTLR end entryRuleNumber


    // $ANTLR start ruleNumber
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:718:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:722:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:723:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:723:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:724:1: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:725:1: ( rule__Number__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:725:2: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1451);
            rule__Number__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

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
    // $ANTLR end ruleNumber


    // $ANTLR start rule__Expression__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:737:1: rule__Expression__Alternatives : ( ( ruleBlock ) | ( ruleScheme ) | ( ruleCommand ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:741:1: ( ( ruleBlock ) | ( ruleScheme ) | ( ruleCommand ) | ( ruleText ) | ( ruleNumber ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 17:
            case 19:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
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
                    new NoViableAltException("737:1: rule__Expression__Alternatives : ( ( ruleBlock ) | ( ruleScheme ) | ( ruleCommand ) | ( ruleText ) | ( ruleNumber ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:742:1: ( ruleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:742:1: ( ruleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:743:1: ruleBlock
                    {
                     before(grammarAccess.getExpressionAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBlock_in_rule__Expression__Alternatives1487);
                    ruleBlock();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:748:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:748:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:749:1: ruleScheme
                    {
                     before(grammarAccess.getExpressionAccess().getSchemeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScheme_in_rule__Expression__Alternatives1504);
                    ruleScheme();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getSchemeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:754:6: ( ruleCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:754:6: ( ruleCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:755:1: ruleCommand
                    {
                     before(grammarAccess.getExpressionAccess().getCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCommand_in_rule__Expression__Alternatives1521);
                    ruleCommand();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCommandParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:760:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:760:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:761:1: ruleText
                    {
                     before(grammarAccess.getExpressionAccess().getTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleText_in_rule__Expression__Alternatives1538);
                    ruleText();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getTextParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:766:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:766:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:767:1: ruleNumber
                    {
                     before(grammarAccess.getExpressionAccess().getNumberParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Expression__Alternatives1555);
                    ruleNumber();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getNumberParserRuleCall_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__Block__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:777:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:781:1: ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("777:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:782:1: ( ruleSimpleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:782:1: ( ruleSimpleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:1: ruleSimpleBlock
                    {
                     before(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives1587);
                    ruleSimpleBlock();
                    _fsp--;

                     after(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:788:6: ( ruleSimultaneousBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:788:6: ( ruleSimultaneousBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:789:1: ruleSimultaneousBlock
                    {
                     before(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives1604);
                    ruleSimultaneousBlock();
                    _fsp--;

                     after(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__Block__Alternatives


    // $ANTLR start rule__SchemeValue__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:799:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeText ) | ( ruleNumber ) );
    public final void rule__SchemeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:803:1: ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeText ) | ( ruleNumber ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 12:
                {
                alt4=3;
                }
                break;
            case RULE_INT:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("799:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeText ) | ( ruleNumber ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:804:1: ( ruleSchemeBoolean )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:804:1: ( ruleSchemeBoolean )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:805:1: ruleSchemeBoolean
                    {
                     before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives1636);
                    ruleSchemeBoolean();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:810:6: ( ruleSchemeList )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:810:6: ( ruleSchemeList )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:811:1: ruleSchemeList
                    {
                     before(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives1653);
                    ruleSchemeList();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:816:6: ( ruleSchemeText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:816:6: ( ruleSchemeText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:817:1: ruleSchemeText
                    {
                     before(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives1670);
                    ruleSchemeText();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:822:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:822:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:823:1: ruleNumber
                    {
                     before(grammarAccess.getSchemeValueAccess().getNumberParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__SchemeValue__Alternatives1687);
                    ruleNumber();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getNumberParserRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__SchemeValue__Alternatives


    // $ANTLR start rule__SchemeTextLiterals__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:833:1: rule__SchemeTextLiterals__Alternatives : ( ( '\\\\\\\\' ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeTextLiterals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:837:1: ( ( '\\\\\\\\' ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("833:1: rule__SchemeTextLiterals__Alternatives : ( ( '\\\\\\\\' ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:838:1: ( '\\\\\\\\' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:838:1: ( '\\\\\\\\' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:839:1: '\\\\\\\\'
                    {
                     before(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__SchemeTextLiterals__Alternatives1720); 
                     after(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:846:6: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:846:6: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:847:1: RULE_ID
                    {
                     before(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives1739); 
                     after(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:852:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:852:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:853:1: RULE_STRING
                    {
                     before(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives1756); 
                     after(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:858:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:858:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:859:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives1773); 
                     after(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__SchemeTextLiterals__Alternatives


    // $ANTLR start rule__Command__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:869:1: rule__Command__Alternatives : ( ( ruleCustomCommand ) | ( rulePresetCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:873:1: ( ( ruleCustomCommand ) | ( rulePresetCommand ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=23 && LA6_1<=24)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_ID||LA6_1==RULE_ANY_OTHER||(LA6_1>=13 && LA6_1<=14)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("869:1: rule__Command__Alternatives : ( ( ruleCustomCommand ) | ( rulePresetCommand ) );", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("869:1: rule__Command__Alternatives : ( ( ruleCustomCommand ) | ( rulePresetCommand ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:874:1: ( ruleCustomCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:874:1: ( ruleCustomCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:875:1: ruleCustomCommand
                    {
                     before(grammarAccess.getCommandAccess().getCustomCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCustomCommand_in_rule__Command__Alternatives1805);
                    ruleCustomCommand();
                    _fsp--;

                     after(grammarAccess.getCommandAccess().getCustomCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:880:6: ( rulePresetCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:880:6: ( rulePresetCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:881:1: rulePresetCommand
                    {
                     before(grammarAccess.getCommandAccess().getPresetCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePresetCommand_in_rule__Command__Alternatives1822);
                    rulePresetCommand();
                    _fsp--;

                     after(grammarAccess.getCommandAccess().getPresetCommandParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__Command__Alternatives


    // $ANTLR start rule__CustomCommand__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:891:1: rule__CustomCommand__Alternatives : ( ( ruleLongCommand ) | ( ruleShortCommand ) );
    public final void rule__CustomCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:895:1: ( ( ruleLongCommand ) | ( ruleShortCommand ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else if ( (LA7_1==RULE_ANY_OTHER||(LA7_1>=13 && LA7_1<=14)) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("891:1: rule__CustomCommand__Alternatives : ( ( ruleLongCommand ) | ( ruleShortCommand ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("891:1: rule__CustomCommand__Alternatives : ( ( ruleLongCommand ) | ( ruleShortCommand ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:1: ( ruleLongCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:1: ( ruleLongCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:897:1: ruleLongCommand
                    {
                     before(grammarAccess.getCustomCommandAccess().getLongCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLongCommand_in_rule__CustomCommand__Alternatives1854);
                    ruleLongCommand();
                    _fsp--;

                     after(grammarAccess.getCustomCommandAccess().getLongCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:902:6: ( ruleShortCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:902:6: ( ruleShortCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:903:1: ruleShortCommand
                    {
                     before(grammarAccess.getCustomCommandAccess().getShortCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleShortCommand_in_rule__CustomCommand__Alternatives1871);
                    ruleShortCommand();
                    _fsp--;

                     after(grammarAccess.getCustomCommandAccess().getShortCommandParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__CustomCommand__Alternatives


    // $ANTLR start rule__ShortCommand__IdAlternatives_1_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:913:1: rule__ShortCommand__IdAlternatives_1_0 : ( ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) );
    public final void rule__ShortCommand__IdAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:917:1: ( ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("913:1: rule__ShortCommand__IdAlternatives_1_0 : ( ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:918:1: ( '(' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:918:1: ( '(' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:919:1: '('
                    {
                     before(grammarAccess.getShortCommandAccess().getIdLeftParenthesisKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__ShortCommand__IdAlternatives_1_01904); 
                     after(grammarAccess.getShortCommandAccess().getIdLeftParenthesisKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:926:6: ( ')' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:926:6: ( ')' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:927:1: ')'
                    {
                     before(grammarAccess.getShortCommandAccess().getIdRightParenthesisKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__ShortCommand__IdAlternatives_1_01924); 
                     after(grammarAccess.getShortCommandAccess().getIdRightParenthesisKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:934:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:934:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:935:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getShortCommandAccess().getIdANY_OTHERTerminalRuleCall_1_0_2()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ShortCommand__IdAlternatives_1_01943); 
                     after(grammarAccess.getShortCommandAccess().getIdANY_OTHERTerminalRuleCall_1_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__ShortCommand__IdAlternatives_1_0


    // $ANTLR start rule__PresetCommand__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:945:1: rule__PresetCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );
    public final void rule__PresetCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:949:1: ( ( ruleInclude ) | ( ruleVersion ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    alt9=1;
                }
                else if ( (LA9_1==24) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("945:1: rule__PresetCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("945:1: rule__PresetCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:950:1: ( ruleInclude )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:950:1: ( ruleInclude )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:951:1: ruleInclude
                    {
                     before(grammarAccess.getPresetCommandAccess().getIncludeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInclude_in_rule__PresetCommand__Alternatives1975);
                    ruleInclude();
                    _fsp--;

                     after(grammarAccess.getPresetCommandAccess().getIncludeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:956:6: ( ruleVersion )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:956:6: ( ruleVersion )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:957:1: ruleVersion
                    {
                     before(grammarAccess.getPresetCommandAccess().getVersionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVersion_in_rule__PresetCommand__Alternatives1992);
                    ruleVersion();
                    _fsp--;

                     after(grammarAccess.getPresetCommandAccess().getVersionParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__PresetCommand__Alternatives


    // $ANTLR start rule__Text__ValueAlternatives_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:967:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) );
    public final void rule__Text__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:971:1: ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 12:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            case 13:
                {
                alt10=4;
                }
                break;
            case 14:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("967:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:972:1: ( ruleSchemeTextLiterals )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:972:1: ( ruleSchemeTextLiterals )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:973:1: ruleSchemeTextLiterals
                    {
                     before(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_02024);
                    ruleSchemeTextLiterals();
                    _fsp--;

                     after(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:978:6: ( '\\'' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:978:6: ( '\\'' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:979:1: '\\''
                    {
                     before(grammarAccess.getTextAccess().getValueApostropheKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Text__ValueAlternatives_02042); 
                     after(grammarAccess.getTextAccess().getValueApostropheKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:986:6: ( ',' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:986:6: ( ',' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:987:1: ','
                    {
                     before(grammarAccess.getTextAccess().getValueCommaKeyword_0_2()); 
                    match(input,16,FOLLOW_16_in_rule__Text__ValueAlternatives_02062); 
                     after(grammarAccess.getTextAccess().getValueCommaKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:994:6: ( '(' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:994:6: ( '(' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:995:1: '('
                    {
                     before(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_3()); 
                    match(input,13,FOLLOW_13_in_rule__Text__ValueAlternatives_02082); 
                     after(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1002:6: ( ')' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1002:6: ( ')' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1003:1: ')'
                    {
                     before(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_4()); 
                    match(input,14,FOLLOW_14_in_rule__Text__ValueAlternatives_02102); 
                     after(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end rule__Text__ValueAlternatives_0


    // $ANTLR start rule__SimpleBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1017:1: rule__SimpleBlock__Group__0 : rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 ;
    public final void rule__SimpleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1021:1: ( rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1022:2: rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__02134);
            rule__SimpleBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__02137);
            rule__SimpleBlock__Group__1();
            _fsp--;


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
    // $ANTLR end rule__SimpleBlock__Group__0


    // $ANTLR start rule__SimpleBlock__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1029:1: rule__SimpleBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimpleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1033:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1034:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1034:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1035:1: ()
            {
             before(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1036:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1038:1: 
            {
            }

             after(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleBlock__Group__0__Impl


    // $ANTLR start rule__SimpleBlock__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1048:1: rule__SimpleBlock__Group__1 : rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 ;
    public final void rule__SimpleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1052:1: ( rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1053:2: rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__12195);
            rule__SimpleBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__12198);
            rule__SimpleBlock__Group__2();
            _fsp--;


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
    // $ANTLR end rule__SimpleBlock__Group__1


    // $ANTLR start rule__SimpleBlock__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1060:1: rule__SimpleBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SimpleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1064:1: ( ( '{' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1065:1: ( '{' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1065:1: ( '{' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1066:1: '{'
            {
             before(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__SimpleBlock__Group__1__Impl2226); 
             after(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end rule__SimpleBlock__Group__1__Impl


    // $ANTLR start rule__SimpleBlock__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1079:1: rule__SimpleBlock__Group__2 : rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 ;
    public final void rule__SimpleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1083:1: ( rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1084:2: rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__22257);
            rule__SimpleBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__22260);
            rule__SimpleBlock__Group__3();
            _fsp--;


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
    // $ANTLR end rule__SimpleBlock__Group__2


    // $ANTLR start rule__SimpleBlock__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1091:1: rule__SimpleBlock__Group__2__Impl : ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimpleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1095:1: ( ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1096:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1096:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1097:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1098:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_ANY_OTHER)||LA11_0==RULE_INT||(LA11_0>=12 && LA11_0<=17)||LA11_0==19||(LA11_0>=21 && LA11_0<=22)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1098:2: rule__SimpleBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl2287);
            	    rule__SimpleBlock__ExpressionsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 

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
    // $ANTLR end rule__SimpleBlock__Group__2__Impl


    // $ANTLR start rule__SimpleBlock__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1108:1: rule__SimpleBlock__Group__3 : rule__SimpleBlock__Group__3__Impl ;
    public final void rule__SimpleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1112:1: ( rule__SimpleBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1113:2: rule__SimpleBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__32318);
            rule__SimpleBlock__Group__3__Impl();
            _fsp--;


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
    // $ANTLR end rule__SimpleBlock__Group__3


    // $ANTLR start rule__SimpleBlock__Group__3__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1119:1: rule__SimpleBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__SimpleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1123:1: ( ( '}' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1124:1: ( '}' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1124:1: ( '}' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1125:1: '}'
            {
             before(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__SimpleBlock__Group__3__Impl2346); 
             after(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end rule__SimpleBlock__Group__3__Impl


    // $ANTLR start rule__SimultaneousBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1146:1: rule__SimultaneousBlock__Group__0 : rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 ;
    public final void rule__SimultaneousBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1150:1: ( rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1151:2: rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__02385);
            rule__SimultaneousBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__02388);
            rule__SimultaneousBlock__Group__1();
            _fsp--;


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
    // $ANTLR end rule__SimultaneousBlock__Group__0


    // $ANTLR start rule__SimultaneousBlock__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1158:1: rule__SimultaneousBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimultaneousBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1162:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1164:1: ()
            {
             before(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1165:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1167:1: 
            {
            }

             after(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimultaneousBlock__Group__0__Impl


    // $ANTLR start rule__SimultaneousBlock__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1177:1: rule__SimultaneousBlock__Group__1 : rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 ;
    public final void rule__SimultaneousBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1181:1: ( rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1182:2: rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__12446);
            rule__SimultaneousBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__12449);
            rule__SimultaneousBlock__Group__2();
            _fsp--;


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
    // $ANTLR end rule__SimultaneousBlock__Group__1


    // $ANTLR start rule__SimultaneousBlock__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1189:1: rule__SimultaneousBlock__Group__1__Impl : ( '<<' ) ;
    public final void rule__SimultaneousBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1193:1: ( ( '<<' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1194:1: ( '<<' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1194:1: ( '<<' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1195:1: '<<'
            {
             before(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__SimultaneousBlock__Group__1__Impl2477); 
             after(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 

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
    // $ANTLR end rule__SimultaneousBlock__Group__1__Impl


    // $ANTLR start rule__SimultaneousBlock__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1208:1: rule__SimultaneousBlock__Group__2 : rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 ;
    public final void rule__SimultaneousBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1212:1: ( rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1213:2: rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__22508);
            rule__SimultaneousBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__22511);
            rule__SimultaneousBlock__Group__3();
            _fsp--;


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
    // $ANTLR end rule__SimultaneousBlock__Group__2


    // $ANTLR start rule__SimultaneousBlock__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1220:1: rule__SimultaneousBlock__Group__2__Impl : ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimultaneousBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1224:1: ( ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1225:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1225:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1226:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1227:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_ANY_OTHER)||LA12_0==RULE_INT||(LA12_0>=12 && LA12_0<=17)||LA12_0==19||(LA12_0>=21 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1227:2: rule__SimultaneousBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl2538);
            	    rule__SimultaneousBlock__ExpressionsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 

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
    // $ANTLR end rule__SimultaneousBlock__Group__2__Impl


    // $ANTLR start rule__SimultaneousBlock__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1237:1: rule__SimultaneousBlock__Group__3 : rule__SimultaneousBlock__Group__3__Impl ;
    public final void rule__SimultaneousBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1241:1: ( rule__SimultaneousBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1242:2: rule__SimultaneousBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__32569);
            rule__SimultaneousBlock__Group__3__Impl();
            _fsp--;


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
    // $ANTLR end rule__SimultaneousBlock__Group__3


    // $ANTLR start rule__SimultaneousBlock__Group__3__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1248:1: rule__SimultaneousBlock__Group__3__Impl : ( '>>' ) ;
    public final void rule__SimultaneousBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1252:1: ( ( '>>' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1253:1: ( '>>' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1253:1: ( '>>' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1254:1: '>>'
            {
             before(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__SimultaneousBlock__Group__3__Impl2597); 
             after(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 

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
    // $ANTLR end rule__SimultaneousBlock__Group__3__Impl


    // $ANTLR start rule__Scheme__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1275:1: rule__Scheme__Group__0 : rule__Scheme__Group__0__Impl rule__Scheme__Group__1 ;
    public final void rule__Scheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1279:1: ( rule__Scheme__Group__0__Impl rule__Scheme__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1280:2: rule__Scheme__Group__0__Impl rule__Scheme__Group__1
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__02636);
            rule__Scheme__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__02639);
            rule__Scheme__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Scheme__Group__0


    // $ANTLR start rule__Scheme__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1287:1: rule__Scheme__Group__0__Impl : ( '#' ) ;
    public final void rule__Scheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1291:1: ( ( '#' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1292:1: ( '#' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1292:1: ( '#' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1293:1: '#'
            {
             before(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Scheme__Group__0__Impl2667); 
             after(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end rule__Scheme__Group__0__Impl


    // $ANTLR start rule__Scheme__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1306:1: rule__Scheme__Group__1 : rule__Scheme__Group__1__Impl ;
    public final void rule__Scheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1310:1: ( rule__Scheme__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1311:2: rule__Scheme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__12698);
            rule__Scheme__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__Scheme__Group__1


    // $ANTLR start rule__Scheme__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1317:1: rule__Scheme__Group__1__Impl : ( ( rule__Scheme__ValueAssignment_1 ) ) ;
    public final void rule__Scheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1321:1: ( ( ( rule__Scheme__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1322:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1322:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1323:1: ( rule__Scheme__ValueAssignment_1 )
            {
             before(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1324:1: ( rule__Scheme__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1324:2: rule__Scheme__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl2725);
            rule__Scheme__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSchemeAccess().getValueAssignment_1()); 

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
    // $ANTLR end rule__Scheme__Group__1__Impl


    // $ANTLR start rule__SchemeExpression__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1338:1: rule__SchemeExpression__Group__0 : rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 ;
    public final void rule__SchemeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1342:1: ( rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1343:2: rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__02759);
            rule__SchemeExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__02762);
            rule__SchemeExpression__Group__1();
            _fsp--;


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
    // $ANTLR end rule__SchemeExpression__Group__0


    // $ANTLR start rule__SchemeExpression__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1350:1: rule__SchemeExpression__Group__0__Impl : ( ( rule__SchemeExpression__QuotedAssignment_0 )? ) ;
    public final void rule__SchemeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1354:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1355:1: ( ( rule__SchemeExpression__QuotedAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1355:1: ( ( rule__SchemeExpression__QuotedAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1356:1: ( rule__SchemeExpression__QuotedAssignment_0 )?
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1357:1: ( rule__SchemeExpression__QuotedAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1357:2: rule__SchemeExpression__QuotedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_in_rule__SchemeExpression__Group__0__Impl2789);
                    rule__SchemeExpression__QuotedAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0()); 

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
    // $ANTLR end rule__SchemeExpression__Group__0__Impl


    // $ANTLR start rule__SchemeExpression__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1367:1: rule__SchemeExpression__Group__1 : rule__SchemeExpression__Group__1__Impl ;
    public final void rule__SchemeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1371:1: ( rule__SchemeExpression__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1372:2: rule__SchemeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__12820);
            rule__SchemeExpression__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__SchemeExpression__Group__1


    // $ANTLR start rule__SchemeExpression__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1378:1: rule__SchemeExpression__Group__1__Impl : ( ( rule__SchemeExpression__ValueAssignment_1 ) ) ;
    public final void rule__SchemeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1382:1: ( ( ( rule__SchemeExpression__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1383:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1383:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1384:1: ( rule__SchemeExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1385:1: ( rule__SchemeExpression__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1385:2: rule__SchemeExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl2847);
            rule__SchemeExpression__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 

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
    // $ANTLR end rule__SchemeExpression__Group__1__Impl


    // $ANTLR start rule__SchemeList__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1399:1: rule__SchemeList__Group__0 : rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 ;
    public final void rule__SchemeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1403:1: ( rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1404:2: rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__02881);
            rule__SchemeList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__02884);
            rule__SchemeList__Group__1();
            _fsp--;


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
    // $ANTLR end rule__SchemeList__Group__0


    // $ANTLR start rule__SchemeList__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1411:1: rule__SchemeList__Group__0__Impl : ( '(' ) ;
    public final void rule__SchemeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1415:1: ( ( '(' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1416:1: ( '(' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1416:1: ( '(' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1417:1: '('
            {
             before(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__SchemeList__Group__0__Impl2912); 
             after(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end rule__SchemeList__Group__0__Impl


    // $ANTLR start rule__SchemeList__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1430:1: rule__SchemeList__Group__1 : rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 ;
    public final void rule__SchemeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1434:1: ( rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1435:2: rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__12943);
            rule__SchemeList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__12946);
            rule__SchemeList__Group__2();
            _fsp--;


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
    // $ANTLR end rule__SchemeList__Group__1


    // $ANTLR start rule__SchemeList__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1442:1: rule__SchemeList__Group__1__Impl : ( ( ( rule__SchemeList__ExpressionsAssignment_1 ) ) ( ( rule__SchemeList__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__SchemeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1446:1: ( ( ( ( rule__SchemeList__ExpressionsAssignment_1 ) ) ( ( rule__SchemeList__ExpressionsAssignment_1 )* ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1447:1: ( ( ( rule__SchemeList__ExpressionsAssignment_1 ) ) ( ( rule__SchemeList__ExpressionsAssignment_1 )* ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1447:1: ( ( ( rule__SchemeList__ExpressionsAssignment_1 ) ) ( ( rule__SchemeList__ExpressionsAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1448:1: ( ( rule__SchemeList__ExpressionsAssignment_1 ) ) ( ( rule__SchemeList__ExpressionsAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1448:1: ( ( rule__SchemeList__ExpressionsAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1449:1: ( rule__SchemeList__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1450:1: ( rule__SchemeList__ExpressionsAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1450:2: rule__SchemeList__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_1_in_rule__SchemeList__Group__1__Impl2975);
            rule__SchemeList__ExpressionsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSchemeListAccess().getExpressionsAssignment_1()); 

            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1453:1: ( ( rule__SchemeList__ExpressionsAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1454:1: ( rule__SchemeList__ExpressionsAssignment_1 )*
            {
             before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1455:1: ( rule__SchemeList__ExpressionsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||(LA14_0>=12 && LA14_0<=13)||LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1455:2: rule__SchemeList__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_1_in_rule__SchemeList__Group__1__Impl2987);
            	    rule__SchemeList__ExpressionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSchemeListAccess().getExpressionsAssignment_1()); 

            }


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
    // $ANTLR end rule__SchemeList__Group__1__Impl


    // $ANTLR start rule__SchemeList__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1466:1: rule__SchemeList__Group__2 : rule__SchemeList__Group__2__Impl ;
    public final void rule__SchemeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1470:1: ( rule__SchemeList__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1471:2: rule__SchemeList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__23020);
            rule__SchemeList__Group__2__Impl();
            _fsp--;


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
    // $ANTLR end rule__SchemeList__Group__2


    // $ANTLR start rule__SchemeList__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1477:1: rule__SchemeList__Group__2__Impl : ( ')' ) ;
    public final void rule__SchemeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1481:1: ( ( ')' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1482:1: ( ')' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1482:1: ( ')' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1483:1: ')'
            {
             before(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__SchemeList__Group__2__Impl3048); 
             after(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end rule__SchemeList__Group__2__Impl


    // $ANTLR start rule__LongCommand__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1502:1: rule__LongCommand__Group__0 : rule__LongCommand__Group__0__Impl rule__LongCommand__Group__1 ;
    public final void rule__LongCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1506:1: ( rule__LongCommand__Group__0__Impl rule__LongCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1507:2: rule__LongCommand__Group__0__Impl rule__LongCommand__Group__1
            {
            pushFollow(FOLLOW_rule__LongCommand__Group__0__Impl_in_rule__LongCommand__Group__03085);
            rule__LongCommand__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LongCommand__Group__1_in_rule__LongCommand__Group__03088);
            rule__LongCommand__Group__1();
            _fsp--;


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
    // $ANTLR end rule__LongCommand__Group__0


    // $ANTLR start rule__LongCommand__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1514:1: rule__LongCommand__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__LongCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1518:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1519:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1519:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1520:1: '\\\\'
            {
             before(grammarAccess.getLongCommandAccess().getReverseSolidusKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__LongCommand__Group__0__Impl3116); 
             after(grammarAccess.getLongCommandAccess().getReverseSolidusKeyword_0()); 

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
    // $ANTLR end rule__LongCommand__Group__0__Impl


    // $ANTLR start rule__LongCommand__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1533:1: rule__LongCommand__Group__1 : rule__LongCommand__Group__1__Impl ;
    public final void rule__LongCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1537:1: ( rule__LongCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1538:2: rule__LongCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LongCommand__Group__1__Impl_in_rule__LongCommand__Group__13147);
            rule__LongCommand__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__LongCommand__Group__1


    // $ANTLR start rule__LongCommand__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1544:1: rule__LongCommand__Group__1__Impl : ( ( rule__LongCommand__IdAssignment_1 ) ) ;
    public final void rule__LongCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1548:1: ( ( ( rule__LongCommand__IdAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1549:1: ( ( rule__LongCommand__IdAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1549:1: ( ( rule__LongCommand__IdAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1550:1: ( rule__LongCommand__IdAssignment_1 )
            {
             before(grammarAccess.getLongCommandAccess().getIdAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1551:1: ( rule__LongCommand__IdAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1551:2: rule__LongCommand__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__LongCommand__IdAssignment_1_in_rule__LongCommand__Group__1__Impl3174);
            rule__LongCommand__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLongCommandAccess().getIdAssignment_1()); 

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
    // $ANTLR end rule__LongCommand__Group__1__Impl


    // $ANTLR start rule__ShortCommand__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1565:1: rule__ShortCommand__Group__0 : rule__ShortCommand__Group__0__Impl rule__ShortCommand__Group__1 ;
    public final void rule__ShortCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1569:1: ( rule__ShortCommand__Group__0__Impl rule__ShortCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1570:2: rule__ShortCommand__Group__0__Impl rule__ShortCommand__Group__1
            {
            pushFollow(FOLLOW_rule__ShortCommand__Group__0__Impl_in_rule__ShortCommand__Group__03208);
            rule__ShortCommand__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ShortCommand__Group__1_in_rule__ShortCommand__Group__03211);
            rule__ShortCommand__Group__1();
            _fsp--;


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
    // $ANTLR end rule__ShortCommand__Group__0


    // $ANTLR start rule__ShortCommand__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:1: rule__ShortCommand__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__ShortCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1581:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1582:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1582:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1583:1: '\\\\'
            {
             before(grammarAccess.getShortCommandAccess().getReverseSolidusKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ShortCommand__Group__0__Impl3239); 
             after(grammarAccess.getShortCommandAccess().getReverseSolidusKeyword_0()); 

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
    // $ANTLR end rule__ShortCommand__Group__0__Impl


    // $ANTLR start rule__ShortCommand__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1596:1: rule__ShortCommand__Group__1 : rule__ShortCommand__Group__1__Impl ;
    public final void rule__ShortCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1600:1: ( rule__ShortCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:2: rule__ShortCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ShortCommand__Group__1__Impl_in_rule__ShortCommand__Group__13270);
            rule__ShortCommand__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__ShortCommand__Group__1


    // $ANTLR start rule__ShortCommand__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1607:1: rule__ShortCommand__Group__1__Impl : ( ( rule__ShortCommand__IdAssignment_1 ) ) ;
    public final void rule__ShortCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1611:1: ( ( ( rule__ShortCommand__IdAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1612:1: ( ( rule__ShortCommand__IdAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1612:1: ( ( rule__ShortCommand__IdAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1613:1: ( rule__ShortCommand__IdAssignment_1 )
            {
             before(grammarAccess.getShortCommandAccess().getIdAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1614:1: ( rule__ShortCommand__IdAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1614:2: rule__ShortCommand__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ShortCommand__IdAssignment_1_in_rule__ShortCommand__Group__1__Impl3297);
            rule__ShortCommand__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getShortCommandAccess().getIdAssignment_1()); 

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
    // $ANTLR end rule__ShortCommand__Group__1__Impl


    // $ANTLR start rule__Include__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1628:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1632:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1633:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__03331);
            rule__Include__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__03334);
            rule__Include__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Include__Group__0


    // $ANTLR start rule__Include__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1640:1: rule__Include__Group__0__Impl : ( ( rule__Include__IdAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1644:1: ( ( ( rule__Include__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1645:1: ( ( rule__Include__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1645:1: ( ( rule__Include__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1646:1: ( rule__Include__IdAssignment_0 )
            {
             before(grammarAccess.getIncludeAccess().getIdAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1647:1: ( rule__Include__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1647:2: rule__Include__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__IdAssignment_0_in_rule__Include__Group__0__Impl3361);
            rule__Include__IdAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getIncludeAccess().getIdAssignment_0()); 

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
    // $ANTLR end rule__Include__Group__0__Impl


    // $ANTLR start rule__Include__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1657:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1661:1: ( rule__Include__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1662:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__13391);
            rule__Include__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__Include__Group__1


    // $ANTLR start rule__Include__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1668:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1672:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1673:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1673:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1674:1: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1675:1: ( rule__Include__ImportURIAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1675:2: rule__Include__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_1_in_rule__Include__Group__1__Impl3418);
            rule__Include__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end rule__Include__Group__1__Impl


    // $ANTLR start rule__IncludeKeyword__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1689:1: rule__IncludeKeyword__Group__0 : rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1 ;
    public final void rule__IncludeKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1693:1: ( rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1694:2: rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeKeyword__Group__0__Impl_in_rule__IncludeKeyword__Group__03452);
            rule__IncludeKeyword__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IncludeKeyword__Group__1_in_rule__IncludeKeyword__Group__03455);
            rule__IncludeKeyword__Group__1();
            _fsp--;


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
    // $ANTLR end rule__IncludeKeyword__Group__0


    // $ANTLR start rule__IncludeKeyword__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1701:1: rule__IncludeKeyword__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__IncludeKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1705:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1706:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1706:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1707:1: '\\\\'
            {
             before(grammarAccess.getIncludeKeywordAccess().getReverseSolidusKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__IncludeKeyword__Group__0__Impl3483); 
             after(grammarAccess.getIncludeKeywordAccess().getReverseSolidusKeyword_0()); 

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
    // $ANTLR end rule__IncludeKeyword__Group__0__Impl


    // $ANTLR start rule__IncludeKeyword__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1720:1: rule__IncludeKeyword__Group__1 : rule__IncludeKeyword__Group__1__Impl ;
    public final void rule__IncludeKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1724:1: ( rule__IncludeKeyword__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1725:2: rule__IncludeKeyword__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IncludeKeyword__Group__1__Impl_in_rule__IncludeKeyword__Group__13514);
            rule__IncludeKeyword__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__IncludeKeyword__Group__1


    // $ANTLR start rule__IncludeKeyword__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1731:1: rule__IncludeKeyword__Group__1__Impl : ( 'include' ) ;
    public final void rule__IncludeKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1735:1: ( ( 'include' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1736:1: ( 'include' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1736:1: ( 'include' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1737:1: 'include'
            {
             before(grammarAccess.getIncludeKeywordAccess().getIncludeKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__IncludeKeyword__Group__1__Impl3542); 
             after(grammarAccess.getIncludeKeywordAccess().getIncludeKeyword_1()); 

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
    // $ANTLR end rule__IncludeKeyword__Group__1__Impl


    // $ANTLR start rule__Version__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1754:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1758:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1759:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__03577);
            rule__Version__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__03580);
            rule__Version__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Version__Group__0


    // $ANTLR start rule__Version__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1766:1: rule__Version__Group__0__Impl : ( ( rule__Version__IdAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1770:1: ( ( ( rule__Version__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1771:1: ( ( rule__Version__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1771:1: ( ( rule__Version__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1772:1: ( rule__Version__IdAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getIdAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1773:1: ( rule__Version__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1773:2: rule__Version__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Version__IdAssignment_0_in_rule__Version__Group__0__Impl3607);
            rule__Version__IdAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getVersionAccess().getIdAssignment_0()); 

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
    // $ANTLR end rule__Version__Group__0__Impl


    // $ANTLR start rule__Version__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1783:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1787:1: ( rule__Version__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1788:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__13637);
            rule__Version__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__Version__Group__1


    // $ANTLR start rule__Version__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1794:1: rule__Version__Group__1__Impl : ( ( rule__Version__VersionAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1798:1: ( ( ( rule__Version__VersionAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1799:1: ( ( rule__Version__VersionAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1799:1: ( ( rule__Version__VersionAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1800:1: ( rule__Version__VersionAssignment_1 )
            {
             before(grammarAccess.getVersionAccess().getVersionAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1801:1: ( rule__Version__VersionAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1801:2: rule__Version__VersionAssignment_1
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl3664);
            rule__Version__VersionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVersionAccess().getVersionAssignment_1()); 

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
    // $ANTLR end rule__Version__Group__1__Impl


    // $ANTLR start rule__VersionKeyword__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1815:1: rule__VersionKeyword__Group__0 : rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1 ;
    public final void rule__VersionKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1819:1: ( rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1820:2: rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__VersionKeyword__Group__0__Impl_in_rule__VersionKeyword__Group__03698);
            rule__VersionKeyword__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VersionKeyword__Group__1_in_rule__VersionKeyword__Group__03701);
            rule__VersionKeyword__Group__1();
            _fsp--;


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
    // $ANTLR end rule__VersionKeyword__Group__0


    // $ANTLR start rule__VersionKeyword__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1827:1: rule__VersionKeyword__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__VersionKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1831:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1832:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1832:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1833:1: '\\\\'
            {
             before(grammarAccess.getVersionKeywordAccess().getReverseSolidusKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__VersionKeyword__Group__0__Impl3729); 
             after(grammarAccess.getVersionKeywordAccess().getReverseSolidusKeyword_0()); 

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
    // $ANTLR end rule__VersionKeyword__Group__0__Impl


    // $ANTLR start rule__VersionKeyword__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1846:1: rule__VersionKeyword__Group__1 : rule__VersionKeyword__Group__1__Impl ;
    public final void rule__VersionKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1850:1: ( rule__VersionKeyword__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1851:2: rule__VersionKeyword__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VersionKeyword__Group__1__Impl_in_rule__VersionKeyword__Group__13760);
            rule__VersionKeyword__Group__1__Impl();
            _fsp--;


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
    // $ANTLR end rule__VersionKeyword__Group__1


    // $ANTLR start rule__VersionKeyword__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1857:1: rule__VersionKeyword__Group__1__Impl : ( 'version' ) ;
    public final void rule__VersionKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1861:1: ( ( 'version' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1862:1: ( 'version' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1862:1: ( 'version' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1863:1: 'version'
            {
             before(grammarAccess.getVersionKeywordAccess().getVersionKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__VersionKeyword__Group__1__Impl3788); 
             after(grammarAccess.getVersionKeywordAccess().getVersionKeyword_1()); 

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
    // $ANTLR end rule__VersionKeyword__Group__1__Impl


    // $ANTLR start rule__LilyPond__ExpressionsAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1881:1: rule__LilyPond__ExpressionsAssignment : ( ruleExpression ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1885:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1886:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1886:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1887:1: ruleExpression
            {
             before(grammarAccess.getLilyPondAccess().getExpressionsExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__LilyPond__ExpressionsAssignment3828);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getLilyPondAccess().getExpressionsExpressionParserRuleCall_0()); 

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


    // $ANTLR start rule__SimpleBlock__ExpressionsAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1896:1: rule__SimpleBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1900:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1901:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1901:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1902:1: ruleExpression
            {
             before(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_23859);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end rule__SimpleBlock__ExpressionsAssignment_2


    // $ANTLR start rule__SimultaneousBlock__ExpressionsAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1911:1: rule__SimultaneousBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimultaneousBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1915:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1916:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1916:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1917:1: ruleExpression
            {
             before(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_23890);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end rule__SimultaneousBlock__ExpressionsAssignment_2


    // $ANTLR start rule__Scheme__ValueAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1926:1: rule__Scheme__ValueAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__Scheme__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1930:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1931:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1931:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1932:1: ruleSchemeExpression
            {
             before(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_13921);
            ruleSchemeExpression();
            _fsp--;

             after(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Scheme__ValueAssignment_1


    // $ANTLR start rule__SchemeExpression__QuotedAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1941:1: rule__SchemeExpression__QuotedAssignment_0 : ( ( '\\'' ) ) ;
    public final void rule__SchemeExpression__QuotedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1945:1: ( ( ( '\\'' ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1946:1: ( ( '\\'' ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1946:1: ( ( '\\'' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1947:1: ( '\\'' )
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1948:1: ( '\\'' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1949:1: '\\''
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__SchemeExpression__QuotedAssignment_03957); 
             after(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0()); 

            }

             after(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0()); 

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
    // $ANTLR end rule__SchemeExpression__QuotedAssignment_0


    // $ANTLR start rule__SchemeExpression__ValueAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1964:1: rule__SchemeExpression__ValueAssignment_1 : ( ruleSchemeValue ) ;
    public final void rule__SchemeExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1968:1: ( ( ruleSchemeValue ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1969:1: ( ruleSchemeValue )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1969:1: ( ruleSchemeValue )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1970:1: ruleSchemeValue
            {
             before(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_13996);
            ruleSchemeValue();
            _fsp--;

             after(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 

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
    // $ANTLR end rule__SchemeExpression__ValueAssignment_1


    // $ANTLR start rule__SchemeBoolean__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1979:1: rule__SchemeBoolean__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__SchemeBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1983:1: ( ( RULE_BOOL ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1984:1: ( RULE_BOOL )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1984:1: ( RULE_BOOL )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1985:1: RULE_BOOL
            {
             before(grammarAccess.getSchemeBooleanAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__SchemeBoolean__ValueAssignment4027); 
             after(grammarAccess.getSchemeBooleanAccess().getValueBOOLTerminalRuleCall_0()); 

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
    // $ANTLR end rule__SchemeBoolean__ValueAssignment


    // $ANTLR start rule__SchemeList__ExpressionsAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1994:1: rule__SchemeList__ExpressionsAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__SchemeList__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1998:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1999:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1999:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2000:1: ruleSchemeExpression
            {
             before(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_14058);
            ruleSchemeExpression();
            _fsp--;

             after(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end rule__SchemeList__ExpressionsAssignment_1


    // $ANTLR start rule__SchemeText__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2009:1: rule__SchemeText__ValueAssignment : ( ruleSchemeTextLiterals ) ;
    public final void rule__SchemeText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2013:1: ( ( ruleSchemeTextLiterals ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2014:1: ( ruleSchemeTextLiterals )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2014:1: ( ruleSchemeTextLiterals )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2015:1: ruleSchemeTextLiterals
            {
             before(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment4089);
            ruleSchemeTextLiterals();
            _fsp--;

             after(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0()); 

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
    // $ANTLR end rule__SchemeText__ValueAssignment


    // $ANTLR start rule__LongCommand__IdAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2024:1: rule__LongCommand__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__LongCommand__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2028:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2029:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2029:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2030:1: RULE_ID
            {
             before(grammarAccess.getLongCommandAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LongCommand__IdAssignment_14120); 
             after(grammarAccess.getLongCommandAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__LongCommand__IdAssignment_1


    // $ANTLR start rule__ShortCommand__IdAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2039:1: rule__ShortCommand__IdAssignment_1 : ( ( rule__ShortCommand__IdAlternatives_1_0 ) ) ;
    public final void rule__ShortCommand__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2043:1: ( ( ( rule__ShortCommand__IdAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2044:1: ( ( rule__ShortCommand__IdAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2044:1: ( ( rule__ShortCommand__IdAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2045:1: ( rule__ShortCommand__IdAlternatives_1_0 )
            {
             before(grammarAccess.getShortCommandAccess().getIdAlternatives_1_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2046:1: ( rule__ShortCommand__IdAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2046:2: rule__ShortCommand__IdAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ShortCommand__IdAlternatives_1_0_in_rule__ShortCommand__IdAssignment_14151);
            rule__ShortCommand__IdAlternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getShortCommandAccess().getIdAlternatives_1_0()); 

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
    // $ANTLR end rule__ShortCommand__IdAssignment_1


    // $ANTLR start rule__Include__IdAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2055:1: rule__Include__IdAssignment_0 : ( ruleIncludeKeyword ) ;
    public final void rule__Include__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2059:1: ( ( ruleIncludeKeyword ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2060:1: ( ruleIncludeKeyword )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2060:1: ( ruleIncludeKeyword )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2061:1: ruleIncludeKeyword
            {
             before(grammarAccess.getIncludeAccess().getIdIncludeKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIncludeKeyword_in_rule__Include__IdAssignment_04184);
            ruleIncludeKeyword();
            _fsp--;

             after(grammarAccess.getIncludeAccess().getIdIncludeKeywordParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Include__IdAssignment_0


    // $ANTLR start rule__Include__ImportURIAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2070:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2074:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2075:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2075:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2076:1: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_14215); 
             after(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Include__ImportURIAssignment_1


    // $ANTLR start rule__Version__IdAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2085:1: rule__Version__IdAssignment_0 : ( ruleVersionKeyword ) ;
    public final void rule__Version__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2089:1: ( ( ruleVersionKeyword ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2090:1: ( ruleVersionKeyword )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2090:1: ( ruleVersionKeyword )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2091:1: ruleVersionKeyword
            {
             before(grammarAccess.getVersionAccess().getIdVersionKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVersionKeyword_in_rule__Version__IdAssignment_04246);
            ruleVersionKeyword();
            _fsp--;

             after(grammarAccess.getVersionAccess().getIdVersionKeywordParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Version__IdAssignment_0


    // $ANTLR start rule__Version__VersionAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2100:1: rule__Version__VersionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Version__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2104:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2105:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2105:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2106:1: RULE_STRING
            {
             before(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_14277); 
             after(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Version__VersionAssignment_1


    // $ANTLR start rule__Text__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2115:1: rule__Text__ValueAssignment : ( ( rule__Text__ValueAlternatives_0 ) ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2119:1: ( ( ( rule__Text__ValueAlternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2120:1: ( ( rule__Text__ValueAlternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2120:1: ( ( rule__Text__ValueAlternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2121:1: ( rule__Text__ValueAlternatives_0 )
            {
             before(grammarAccess.getTextAccess().getValueAlternatives_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2122:1: ( rule__Text__ValueAlternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2122:2: rule__Text__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment4308);
            rule__Text__ValueAlternatives_0();
            _fsp--;


            }

             after(grammarAccess.getTextAccess().getValueAlternatives_0()); 

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
    // $ANTLR end rule__Text__ValueAssignment


    // $ANTLR start rule__Number__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2131:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2135:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2136:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2136:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2137:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment4341); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end rule__Number__ValueAssignment


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond94 = new BitSet(new long[]{0x00000000006BF172L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_in_ruleBlock215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0_in_ruleSimpleBlock275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0_in_ruleSimultaneousBlock335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0_in_ruleScheme395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0_in_ruleSchemeExpression455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeValue__Alternatives_in_ruleSchemeValue515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBoolean__ValueAssignment_in_ruleSchemeBoolean575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0_in_ruleSchemeList635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiterals729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeTextLiterals__Alternatives_in_ruleSchemeTextLiterals755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomCommand_in_entryRuleCustomCommand842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomCommand849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomCommand__Alternatives_in_ruleCustomCommand875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongCommand_in_entryRuleLongCommand907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongCommand914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongCommand__Group__0_in_ruleLongCommand944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortCommand_in_entryRuleShortCommand976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortCommand983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__Group__0_in_ruleShortCommand1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresetCommand_in_entryRulePresetCommand1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresetCommand1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresetCommand__Alternatives_in_rulePresetCommand1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_entryRuleIncludeKeyword1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeKeyword1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__0_in_ruleIncludeKeyword1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_entryRuleVersionKeyword1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionKeyword1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__0_in_ruleVersionKeyword1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAssignment_in_ruleText1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Expression__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__Expression__Alternatives1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Expression__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Expression__Alternatives1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Expression__Alternatives1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__SchemeValue__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SchemeTextLiterals__Alternatives1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomCommand_in_rule__Command__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresetCommand_in_rule__Command__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongCommand_in_rule__CustomCommand__Alternatives1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortCommand_in_rule__CustomCommand__Alternatives1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ShortCommand__IdAlternatives_1_01904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ShortCommand__IdAlternatives_1_01924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ShortCommand__IdAlternatives_1_01943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__PresetCommand__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__PresetCommand__Alternatives1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_02024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Text__ValueAlternatives_02042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Text__ValueAlternatives_02062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Text__ValueAlternatives_02082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Text__ValueAlternatives_02102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__02134 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__02137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__12195 = new BitSet(new long[]{0x00000000006FF170L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__12198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleBlock__Group__1__Impl2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__22257 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__22260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl2287 = new BitSet(new long[]{0x00000000006BF172L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__32318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SimpleBlock__Group__3__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__02385 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__02388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__12446 = new BitSet(new long[]{0x00000000007BF170L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__12449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SimultaneousBlock__Group__1__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__22508 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__22511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl2538 = new BitSet(new long[]{0x00000000006BF172L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__32569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SimultaneousBlock__Group__3__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__02636 = new BitSet(new long[]{0x000000000000B1F0L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__02639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Scheme__Group__0__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__12698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__02759 = new BitSet(new long[]{0x00000000000031F0L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_in_rule__SchemeExpression__Group__0__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__12820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__02881 = new BitSet(new long[]{0x000000000000B1F0L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__02884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SchemeList__Group__0__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__12943 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__12946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_1_in_rule__SchemeList__Group__1__Impl2975 = new BitSet(new long[]{0x000000000000B1F2L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_1_in_rule__SchemeList__Group__1__Impl2987 = new BitSet(new long[]{0x000000000000B1F2L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__23020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SchemeList__Group__2__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongCommand__Group__0__Impl_in_rule__LongCommand__Group__03085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LongCommand__Group__1_in_rule__LongCommand__Group__03088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LongCommand__Group__0__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongCommand__Group__1__Impl_in_rule__LongCommand__Group__13147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongCommand__IdAssignment_1_in_rule__LongCommand__Group__1__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__Group__0__Impl_in_rule__ShortCommand__Group__03208 = new BitSet(new long[]{0x0000000000006040L});
    public static final BitSet FOLLOW_rule__ShortCommand__Group__1_in_rule__ShortCommand__Group__03211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ShortCommand__Group__0__Impl3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__Group__1__Impl_in_rule__ShortCommand__Group__13270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__IdAssignment_1_in_rule__ShortCommand__Group__1__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__03331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__03334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IdAssignment_0_in_rule__Include__Group__0__Impl3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__13391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_1_in_rule__Include__Group__1__Impl3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__0__Impl_in_rule__IncludeKeyword__Group__03452 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__1_in_rule__IncludeKeyword__Group__03455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IncludeKeyword__Group__0__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__1__Impl_in_rule__IncludeKeyword__Group__13514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IncludeKeyword__Group__1__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__03577 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__03580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__IdAssignment_0_in_rule__Version__Group__0__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__0__Impl_in_rule__VersionKeyword__Group__03698 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__1_in_rule__VersionKeyword__Group__03701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VersionKeyword__Group__0__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__1__Impl_in_rule__VersionKeyword__Group__13760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VersionKeyword__Group__1__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LilyPond__ExpressionsAssignment3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_23859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_23890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_13921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SchemeExpression__QuotedAssignment_03957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__SchemeBoolean__ValueAssignment4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_14058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LongCommand__IdAssignment_14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__IdAlternatives_1_0_in_rule__ShortCommand__IdAssignment_14151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_rule__Include__IdAssignment_04184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_14215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_rule__Version__IdAssignment_04246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_14277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment4341 = new BitSet(new long[]{0x0000000000000002L});

}