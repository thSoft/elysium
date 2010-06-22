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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_BOOL", "RULE_INT", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "'\\\\\\\\'", "'('", "')'", "'\\''", "','", "'{'", "'}'", "'<<'", "'>>'", "'#'", "'#{'", "'#}'", "'\\\\'", "'include'", "'version'"
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||LA1_0==RULE_INT||(LA1_0>=12 && LA1_0<=17)||LA1_0==19||LA1_0==21||LA1_0==24) ) {
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


    // $ANTLR start entryRuleSchemeBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:341:1: entryRuleSchemeBlock : ruleSchemeBlock EOF ;
    public final void entryRuleSchemeBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:342:1: ( ruleSchemeBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:343:1: ruleSchemeBlock EOF
            {
             before(grammarAccess.getSchemeBlockRule()); 
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock662);
            ruleSchemeBlock();
            _fsp--;

             after(grammarAccess.getSchemeBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock669); 

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
    // $ANTLR end entryRuleSchemeBlock


    // $ANTLR start ruleSchemeBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:350:1: ruleSchemeBlock : ( ( rule__SchemeBlock__Group__0 ) ) ;
    public final void ruleSchemeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:354:2: ( ( ( rule__SchemeBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:355:1: ( ( rule__SchemeBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:355:1: ( ( rule__SchemeBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:356:1: ( rule__SchemeBlock__Group__0 )
            {
             before(grammarAccess.getSchemeBlockAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:357:1: ( rule__SchemeBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:357:2: rule__SchemeBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0_in_ruleSchemeBlock695);
            rule__SchemeBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSchemeBlockAccess().getGroup()); 

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
    // $ANTLR end ruleSchemeBlock


    // $ANTLR start entryRuleSchemeText
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:369:1: entryRuleSchemeText : ruleSchemeText EOF ;
    public final void entryRuleSchemeText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:370:1: ( ruleSchemeText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:371:1: ruleSchemeText EOF
            {
             before(grammarAccess.getSchemeTextRule()); 
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText722);
            ruleSchemeText();
            _fsp--;

             after(grammarAccess.getSchemeTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText729); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:378:1: ruleSchemeText : ( ( rule__SchemeText__ValueAssignment ) ) ;
    public final void ruleSchemeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:382:2: ( ( ( rule__SchemeText__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:383:1: ( ( rule__SchemeText__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:383:1: ( ( rule__SchemeText__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:384:1: ( rule__SchemeText__ValueAssignment )
            {
             before(grammarAccess.getSchemeTextAccess().getValueAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:385:1: ( rule__SchemeText__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:385:2: rule__SchemeText__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText755);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:397:1: entryRuleSchemeTextLiterals : ruleSchemeTextLiterals EOF ;
    public final void entryRuleSchemeTextLiterals() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:398:1: ( ruleSchemeTextLiterals EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:399:1: ruleSchemeTextLiterals EOF
            {
             before(grammarAccess.getSchemeTextLiteralsRule()); 
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals782);
            ruleSchemeTextLiterals();
            _fsp--;

             after(grammarAccess.getSchemeTextLiteralsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiterals789); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:406:1: ruleSchemeTextLiterals : ( ( rule__SchemeTextLiterals__Alternatives ) ) ;
    public final void ruleSchemeTextLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:410:2: ( ( ( rule__SchemeTextLiterals__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:411:1: ( ( rule__SchemeTextLiterals__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:411:1: ( ( rule__SchemeTextLiterals__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:412:1: ( rule__SchemeTextLiterals__Alternatives )
            {
             before(grammarAccess.getSchemeTextLiteralsAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:413:1: ( rule__SchemeTextLiterals__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:413:2: rule__SchemeTextLiterals__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeTextLiterals__Alternatives_in_ruleSchemeTextLiterals815);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:425:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:426:1: ( ruleCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:427:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand842);
            ruleCommand();
            _fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand849); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:434:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:438:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:439:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:439:1: ( ( rule__Command__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:440:1: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:441:1: ( rule__Command__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:441:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand875);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:453:1: entryRuleCustomCommand : ruleCustomCommand EOF ;
    public final void entryRuleCustomCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:454:1: ( ruleCustomCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:455:1: ruleCustomCommand EOF
            {
             before(grammarAccess.getCustomCommandRule()); 
            pushFollow(FOLLOW_ruleCustomCommand_in_entryRuleCustomCommand902);
            ruleCustomCommand();
            _fsp--;

             after(grammarAccess.getCustomCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomCommand909); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:462:1: ruleCustomCommand : ( ( rule__CustomCommand__Alternatives ) ) ;
    public final void ruleCustomCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:466:2: ( ( ( rule__CustomCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:467:1: ( ( rule__CustomCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:467:1: ( ( rule__CustomCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:468:1: ( rule__CustomCommand__Alternatives )
            {
             before(grammarAccess.getCustomCommandAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:469:1: ( rule__CustomCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:469:2: rule__CustomCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__CustomCommand__Alternatives_in_ruleCustomCommand935);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:481:1: entryRuleLongCommand : ruleLongCommand EOF ;
    public final void entryRuleLongCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:485:1: ( ruleLongCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:486:1: ruleLongCommand EOF
            {
             before(grammarAccess.getLongCommandRule()); 
            pushFollow(FOLLOW_ruleLongCommand_in_entryRuleLongCommand967);
            ruleLongCommand();
            _fsp--;

             after(grammarAccess.getLongCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongCommand974); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:496:1: ruleLongCommand : ( ( rule__LongCommand__Group__0 ) ) ;
    public final void ruleLongCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:501:2: ( ( ( rule__LongCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:502:1: ( ( rule__LongCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:502:1: ( ( rule__LongCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:503:1: ( rule__LongCommand__Group__0 )
            {
             before(grammarAccess.getLongCommandAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:1: ( rule__LongCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:2: rule__LongCommand__Group__0
            {
            pushFollow(FOLLOW_rule__LongCommand__Group__0_in_ruleLongCommand1004);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:517:1: entryRuleShortCommand : ruleShortCommand EOF ;
    public final void entryRuleShortCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:521:1: ( ruleShortCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:522:1: ruleShortCommand EOF
            {
             before(grammarAccess.getShortCommandRule()); 
            pushFollow(FOLLOW_ruleShortCommand_in_entryRuleShortCommand1036);
            ruleShortCommand();
            _fsp--;

             after(grammarAccess.getShortCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortCommand1043); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:532:1: ruleShortCommand : ( ( rule__ShortCommand__Group__0 ) ) ;
    public final void ruleShortCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:537:2: ( ( ( rule__ShortCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:538:1: ( ( rule__ShortCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:538:1: ( ( rule__ShortCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:539:1: ( rule__ShortCommand__Group__0 )
            {
             before(grammarAccess.getShortCommandAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:540:1: ( rule__ShortCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:540:2: rule__ShortCommand__Group__0
            {
            pushFollow(FOLLOW_rule__ShortCommand__Group__0_in_ruleShortCommand1073);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:553:1: entryRulePresetCommand : rulePresetCommand EOF ;
    public final void entryRulePresetCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:554:1: ( rulePresetCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:555:1: rulePresetCommand EOF
            {
             before(grammarAccess.getPresetCommandRule()); 
            pushFollow(FOLLOW_rulePresetCommand_in_entryRulePresetCommand1100);
            rulePresetCommand();
            _fsp--;

             after(grammarAccess.getPresetCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresetCommand1107); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:562:1: rulePresetCommand : ( ( rule__PresetCommand__Alternatives ) ) ;
    public final void rulePresetCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:566:2: ( ( ( rule__PresetCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:567:1: ( ( rule__PresetCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:567:1: ( ( rule__PresetCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:568:1: ( rule__PresetCommand__Alternatives )
            {
             before(grammarAccess.getPresetCommandAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:569:1: ( rule__PresetCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:569:2: rule__PresetCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__PresetCommand__Alternatives_in_rulePresetCommand1133);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:581:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:582:1: ( ruleInclude EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:583:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1160);
            ruleInclude();
            _fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1167); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:590:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:594:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:595:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:595:1: ( ( rule__Include__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:596:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:597:1: ( rule__Include__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:597:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude1193);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:609:1: entryRuleIncludeKeyword : ruleIncludeKeyword EOF ;
    public final void entryRuleIncludeKeyword() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:613:1: ( ruleIncludeKeyword EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:614:1: ruleIncludeKeyword EOF
            {
             before(grammarAccess.getIncludeKeywordRule()); 
            pushFollow(FOLLOW_ruleIncludeKeyword_in_entryRuleIncludeKeyword1225);
            ruleIncludeKeyword();
            _fsp--;

             after(grammarAccess.getIncludeKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeKeyword1232); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:624:1: ruleIncludeKeyword : ( ( rule__IncludeKeyword__Group__0 ) ) ;
    public final void ruleIncludeKeyword() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:629:2: ( ( ( rule__IncludeKeyword__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:630:1: ( ( rule__IncludeKeyword__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:630:1: ( ( rule__IncludeKeyword__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:631:1: ( rule__IncludeKeyword__Group__0 )
            {
             before(grammarAccess.getIncludeKeywordAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:632:1: ( rule__IncludeKeyword__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:632:2: rule__IncludeKeyword__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeKeyword__Group__0_in_ruleIncludeKeyword1262);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:645:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:646:1: ( ruleVersion EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:647:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1289);
            ruleVersion();
            _fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion1296); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:654:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:658:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:659:1: ( ( rule__Version__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:659:1: ( ( rule__Version__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:660:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:661:1: ( rule__Version__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:661:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion1322);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:673:1: entryRuleVersionKeyword : ruleVersionKeyword EOF ;
    public final void entryRuleVersionKeyword() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:677:1: ( ruleVersionKeyword EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:678:1: ruleVersionKeyword EOF
            {
             before(grammarAccess.getVersionKeywordRule()); 
            pushFollow(FOLLOW_ruleVersionKeyword_in_entryRuleVersionKeyword1354);
            ruleVersionKeyword();
            _fsp--;

             after(grammarAccess.getVersionKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionKeyword1361); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:688:1: ruleVersionKeyword : ( ( rule__VersionKeyword__Group__0 ) ) ;
    public final void ruleVersionKeyword() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:693:2: ( ( ( rule__VersionKeyword__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:694:1: ( ( rule__VersionKeyword__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:694:1: ( ( rule__VersionKeyword__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:695:1: ( rule__VersionKeyword__Group__0 )
            {
             before(grammarAccess.getVersionKeywordAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:696:1: ( rule__VersionKeyword__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:696:2: rule__VersionKeyword__Group__0
            {
            pushFollow(FOLLOW_rule__VersionKeyword__Group__0_in_ruleVersionKeyword1391);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:709:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:710:1: ( ruleText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:711:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1418);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1425); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:718:1: ruleText : ( ( rule__Text__ValueAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:722:2: ( ( ( rule__Text__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:723:1: ( ( rule__Text__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:723:1: ( ( rule__Text__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:724:1: ( rule__Text__ValueAssignment )
            {
             before(grammarAccess.getTextAccess().getValueAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:725:1: ( rule__Text__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:725:2: rule__Text__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Text__ValueAssignment_in_ruleText1451);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:737:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:738:1: ( ruleNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:739:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1478);
            ruleNumber();
            _fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1485); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:746:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:750:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:751:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:751:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:752:1: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:753:1: ( rule__Number__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:753:2: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1511);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:765:1: rule__Expression__Alternatives : ( ( ruleBlock ) | ( ruleScheme ) | ( ruleCommand ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:769:1: ( ( ruleBlock ) | ( ruleScheme ) | ( ruleCommand ) | ( ruleText ) | ( ruleNumber ) )
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
            case 24:
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
                    new NoViableAltException("765:1: rule__Expression__Alternatives : ( ( ruleBlock ) | ( ruleScheme ) | ( ruleCommand ) | ( ruleText ) | ( ruleNumber ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:770:1: ( ruleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:770:1: ( ruleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:771:1: ruleBlock
                    {
                     before(grammarAccess.getExpressionAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBlock_in_rule__Expression__Alternatives1547);
                    ruleBlock();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:776:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:776:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:777:1: ruleScheme
                    {
                     before(grammarAccess.getExpressionAccess().getSchemeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScheme_in_rule__Expression__Alternatives1564);
                    ruleScheme();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getSchemeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:782:6: ( ruleCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:782:6: ( ruleCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:1: ruleCommand
                    {
                     before(grammarAccess.getExpressionAccess().getCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCommand_in_rule__Expression__Alternatives1581);
                    ruleCommand();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCommandParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:788:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:788:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:789:1: ruleText
                    {
                     before(grammarAccess.getExpressionAccess().getTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleText_in_rule__Expression__Alternatives1598);
                    ruleText();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getTextParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:794:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:794:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:795:1: ruleNumber
                    {
                     before(grammarAccess.getExpressionAccess().getNumberParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Expression__Alternatives1615);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:805:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:809:1: ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) )
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
                    new NoViableAltException("805:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:810:1: ( ruleSimpleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:810:1: ( ruleSimpleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:811:1: ruleSimpleBlock
                    {
                     before(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives1647);
                    ruleSimpleBlock();
                    _fsp--;

                     after(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:816:6: ( ruleSimultaneousBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:816:6: ( ruleSimultaneousBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:817:1: ruleSimultaneousBlock
                    {
                     before(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives1664);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:827:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeText ) | ( ruleNumber ) );
    public final void rule__SchemeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:831:1: ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeText ) | ( ruleNumber ) )
            int alt4=5;
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
            case 22:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 12:
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
                NoViableAltException nvae =
                    new NoViableAltException("827:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeText ) | ( ruleNumber ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:832:1: ( ruleSchemeBoolean )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:832:1: ( ruleSchemeBoolean )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:833:1: ruleSchemeBoolean
                    {
                     before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives1696);
                    ruleSchemeBoolean();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:838:6: ( ruleSchemeList )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:838:6: ( ruleSchemeList )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:839:1: ruleSchemeList
                    {
                     before(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives1713);
                    ruleSchemeList();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:844:6: ( ruleSchemeBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:844:6: ( ruleSchemeBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:845:1: ruleSchemeBlock
                    {
                     before(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives1730);
                    ruleSchemeBlock();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:850:6: ( ruleSchemeText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:850:6: ( ruleSchemeText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:851:1: ruleSchemeText
                    {
                     before(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives1747);
                    ruleSchemeText();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:856:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:856:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:857:1: ruleNumber
                    {
                     before(grammarAccess.getSchemeValueAccess().getNumberParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__SchemeValue__Alternatives1764);
                    ruleNumber();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getNumberParserRuleCall_4()); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:867:1: rule__SchemeTextLiterals__Alternatives : ( ( '\\\\\\\\' ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeTextLiterals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:871:1: ( ( '\\\\\\\\' ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
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
                    new NoViableAltException("867:1: rule__SchemeTextLiterals__Alternatives : ( ( '\\\\\\\\' ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:872:1: ( '\\\\\\\\' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:872:1: ( '\\\\\\\\' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:873:1: '\\\\\\\\'
                    {
                     before(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__SchemeTextLiterals__Alternatives1797); 
                     after(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:880:6: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:880:6: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:881:1: RULE_ID
                    {
                     before(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives1816); 
                     after(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:886:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:886:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:887:1: RULE_STRING
                    {
                     before(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives1833); 
                     after(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:892:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:892:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:893:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives1850); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:903:1: rule__Command__Alternatives : ( ( ruleCustomCommand ) | ( rulePresetCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:907:1: ( ( ruleCustomCommand ) | ( rulePresetCommand ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID||LA6_1==RULE_ANY_OTHER||(LA6_1>=13 && LA6_1<=14)) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=25 && LA6_1<=26)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("903:1: rule__Command__Alternatives : ( ( ruleCustomCommand ) | ( rulePresetCommand ) );", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("903:1: rule__Command__Alternatives : ( ( ruleCustomCommand ) | ( rulePresetCommand ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:908:1: ( ruleCustomCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:908:1: ( ruleCustomCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:909:1: ruleCustomCommand
                    {
                     before(grammarAccess.getCommandAccess().getCustomCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCustomCommand_in_rule__Command__Alternatives1882);
                    ruleCustomCommand();
                    _fsp--;

                     after(grammarAccess.getCommandAccess().getCustomCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:914:6: ( rulePresetCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:914:6: ( rulePresetCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:915:1: rulePresetCommand
                    {
                     before(grammarAccess.getCommandAccess().getPresetCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePresetCommand_in_rule__Command__Alternatives1899);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:925:1: rule__CustomCommand__Alternatives : ( ( ruleLongCommand ) | ( ruleShortCommand ) );
    public final void rule__CustomCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:929:1: ( ( ruleLongCommand ) | ( ruleShortCommand ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ANY_OTHER||(LA7_1>=13 && LA7_1<=14)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("925:1: rule__CustomCommand__Alternatives : ( ( ruleLongCommand ) | ( ruleShortCommand ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("925:1: rule__CustomCommand__Alternatives : ( ( ruleLongCommand ) | ( ruleShortCommand ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:1: ( ruleLongCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:1: ( ruleLongCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:931:1: ruleLongCommand
                    {
                     before(grammarAccess.getCustomCommandAccess().getLongCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLongCommand_in_rule__CustomCommand__Alternatives1931);
                    ruleLongCommand();
                    _fsp--;

                     after(grammarAccess.getCustomCommandAccess().getLongCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:936:6: ( ruleShortCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:936:6: ( ruleShortCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:937:1: ruleShortCommand
                    {
                     before(grammarAccess.getCustomCommandAccess().getShortCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleShortCommand_in_rule__CustomCommand__Alternatives1948);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:947:1: rule__ShortCommand__IdAlternatives_1_0 : ( ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) );
    public final void rule__ShortCommand__IdAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:951:1: ( ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) )
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
                    new NoViableAltException("947:1: rule__ShortCommand__IdAlternatives_1_0 : ( ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:952:1: ( '(' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:952:1: ( '(' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:953:1: '('
                    {
                     before(grammarAccess.getShortCommandAccess().getIdLeftParenthesisKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__ShortCommand__IdAlternatives_1_01981); 
                     after(grammarAccess.getShortCommandAccess().getIdLeftParenthesisKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:960:6: ( ')' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:960:6: ( ')' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:961:1: ')'
                    {
                     before(grammarAccess.getShortCommandAccess().getIdRightParenthesisKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__ShortCommand__IdAlternatives_1_02001); 
                     after(grammarAccess.getShortCommandAccess().getIdRightParenthesisKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:968:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:968:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:969:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getShortCommandAccess().getIdANY_OTHERTerminalRuleCall_1_0_2()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ShortCommand__IdAlternatives_1_02020); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:979:1: rule__PresetCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );
    public final void rule__PresetCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:983:1: ( ( ruleInclude ) | ( ruleVersion ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==25) ) {
                    alt9=1;
                }
                else if ( (LA9_1==26) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("979:1: rule__PresetCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("979:1: rule__PresetCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:984:1: ( ruleInclude )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:984:1: ( ruleInclude )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:985:1: ruleInclude
                    {
                     before(grammarAccess.getPresetCommandAccess().getIncludeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInclude_in_rule__PresetCommand__Alternatives2052);
                    ruleInclude();
                    _fsp--;

                     after(grammarAccess.getPresetCommandAccess().getIncludeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:990:6: ( ruleVersion )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:990:6: ( ruleVersion )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:991:1: ruleVersion
                    {
                     before(grammarAccess.getPresetCommandAccess().getVersionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVersion_in_rule__PresetCommand__Alternatives2069);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1001:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) );
    public final void rule__Text__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1005:1: ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) )
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
                    new NoViableAltException("1001:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1006:1: ( ruleSchemeTextLiterals )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1006:1: ( ruleSchemeTextLiterals )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1007:1: ruleSchemeTextLiterals
                    {
                     before(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_02101);
                    ruleSchemeTextLiterals();
                    _fsp--;

                     after(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1012:6: ( '\\'' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1012:6: ( '\\'' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1013:1: '\\''
                    {
                     before(grammarAccess.getTextAccess().getValueApostropheKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Text__ValueAlternatives_02119); 
                     after(grammarAccess.getTextAccess().getValueApostropheKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1020:6: ( ',' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1020:6: ( ',' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1021:1: ','
                    {
                     before(grammarAccess.getTextAccess().getValueCommaKeyword_0_2()); 
                    match(input,16,FOLLOW_16_in_rule__Text__ValueAlternatives_02139); 
                     after(grammarAccess.getTextAccess().getValueCommaKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1028:6: ( '(' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1028:6: ( '(' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1029:1: '('
                    {
                     before(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_3()); 
                    match(input,13,FOLLOW_13_in_rule__Text__ValueAlternatives_02159); 
                     after(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1036:6: ( ')' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1036:6: ( ')' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1037:1: ')'
                    {
                     before(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_4()); 
                    match(input,14,FOLLOW_14_in_rule__Text__ValueAlternatives_02179); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1051:1: rule__SimpleBlock__Group__0 : rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 ;
    public final void rule__SimpleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1055:1: ( rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1056:2: rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__02211);
            rule__SimpleBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__02214);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1063:1: rule__SimpleBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimpleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1067:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1068:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1068:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1069:1: ()
            {
             before(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1070:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1072:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1082:1: rule__SimpleBlock__Group__1 : rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 ;
    public final void rule__SimpleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1086:1: ( rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1087:2: rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__12272);
            rule__SimpleBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__12275);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1094:1: rule__SimpleBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SimpleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1098:1: ( ( '{' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1099:1: ( '{' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1099:1: ( '{' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1100:1: '{'
            {
             before(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__SimpleBlock__Group__1__Impl2303); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1113:1: rule__SimpleBlock__Group__2 : rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 ;
    public final void rule__SimpleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1117:1: ( rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1118:2: rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__22334);
            rule__SimpleBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__22337);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1125:1: rule__SimpleBlock__Group__2__Impl : ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimpleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1129:1: ( ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1130:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1130:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1131:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1132:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_ANY_OTHER)||LA11_0==RULE_INT||(LA11_0>=12 && LA11_0<=17)||LA11_0==19||LA11_0==21||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1132:2: rule__SimpleBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl2364);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1142:1: rule__SimpleBlock__Group__3 : rule__SimpleBlock__Group__3__Impl ;
    public final void rule__SimpleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1146:1: ( rule__SimpleBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1147:2: rule__SimpleBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__32395);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1153:1: rule__SimpleBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__SimpleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1157:1: ( ( '}' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1158:1: ( '}' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1158:1: ( '}' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1159:1: '}'
            {
             before(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__SimpleBlock__Group__3__Impl2423); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1180:1: rule__SimultaneousBlock__Group__0 : rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 ;
    public final void rule__SimultaneousBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1184:1: ( rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1185:2: rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__02462);
            rule__SimultaneousBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__02465);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1192:1: rule__SimultaneousBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimultaneousBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1196:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1197:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1197:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1198:1: ()
            {
             before(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1199:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1201:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1211:1: rule__SimultaneousBlock__Group__1 : rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 ;
    public final void rule__SimultaneousBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1215:1: ( rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1216:2: rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__12523);
            rule__SimultaneousBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__12526);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1223:1: rule__SimultaneousBlock__Group__1__Impl : ( '<<' ) ;
    public final void rule__SimultaneousBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1227:1: ( ( '<<' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1228:1: ( '<<' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1228:1: ( '<<' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1229:1: '<<'
            {
             before(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__SimultaneousBlock__Group__1__Impl2554); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1242:1: rule__SimultaneousBlock__Group__2 : rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 ;
    public final void rule__SimultaneousBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1246:1: ( rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1247:2: rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__22585);
            rule__SimultaneousBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__22588);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1254:1: rule__SimultaneousBlock__Group__2__Impl : ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimultaneousBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1258:1: ( ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1259:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1259:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1260:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1261:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_ANY_OTHER)||LA12_0==RULE_INT||(LA12_0>=12 && LA12_0<=17)||LA12_0==19||LA12_0==21||LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1261:2: rule__SimultaneousBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl2615);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1271:1: rule__SimultaneousBlock__Group__3 : rule__SimultaneousBlock__Group__3__Impl ;
    public final void rule__SimultaneousBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1275:1: ( rule__SimultaneousBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1276:2: rule__SimultaneousBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__32646);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1282:1: rule__SimultaneousBlock__Group__3__Impl : ( '>>' ) ;
    public final void rule__SimultaneousBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1286:1: ( ( '>>' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1287:1: ( '>>' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1287:1: ( '>>' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1288:1: '>>'
            {
             before(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__SimultaneousBlock__Group__3__Impl2674); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1309:1: rule__Scheme__Group__0 : rule__Scheme__Group__0__Impl rule__Scheme__Group__1 ;
    public final void rule__Scheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1313:1: ( rule__Scheme__Group__0__Impl rule__Scheme__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1314:2: rule__Scheme__Group__0__Impl rule__Scheme__Group__1
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__02713);
            rule__Scheme__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__02716);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1321:1: rule__Scheme__Group__0__Impl : ( '#' ) ;
    public final void rule__Scheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1325:1: ( ( '#' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1326:1: ( '#' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1326:1: ( '#' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1327:1: '#'
            {
             before(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Scheme__Group__0__Impl2744); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1340:1: rule__Scheme__Group__1 : rule__Scheme__Group__1__Impl ;
    public final void rule__Scheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1344:1: ( rule__Scheme__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1345:2: rule__Scheme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__12775);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1351:1: rule__Scheme__Group__1__Impl : ( ( rule__Scheme__ValueAssignment_1 ) ) ;
    public final void rule__Scheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1355:1: ( ( ( rule__Scheme__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1356:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1356:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1357:1: ( rule__Scheme__ValueAssignment_1 )
            {
             before(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1358:1: ( rule__Scheme__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1358:2: rule__Scheme__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl2802);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1372:1: rule__SchemeExpression__Group__0 : rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 ;
    public final void rule__SchemeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1376:1: ( rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1377:2: rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__02836);
            rule__SchemeExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__02839);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1384:1: rule__SchemeExpression__Group__0__Impl : ( ( rule__SchemeExpression__QuotedAssignment_0 )? ) ;
    public final void rule__SchemeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1388:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1389:1: ( ( rule__SchemeExpression__QuotedAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1389:1: ( ( rule__SchemeExpression__QuotedAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1390:1: ( rule__SchemeExpression__QuotedAssignment_0 )?
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1391:1: ( rule__SchemeExpression__QuotedAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1391:2: rule__SchemeExpression__QuotedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_in_rule__SchemeExpression__Group__0__Impl2866);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1401:1: rule__SchemeExpression__Group__1 : rule__SchemeExpression__Group__1__Impl ;
    public final void rule__SchemeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1405:1: ( rule__SchemeExpression__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1406:2: rule__SchemeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__12897);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1412:1: rule__SchemeExpression__Group__1__Impl : ( ( rule__SchemeExpression__ValueAssignment_1 ) ) ;
    public final void rule__SchemeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1416:1: ( ( ( rule__SchemeExpression__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1417:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1417:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1418:1: ( rule__SchemeExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1419:1: ( rule__SchemeExpression__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1419:2: rule__SchemeExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl2924);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1433:1: rule__SchemeList__Group__0 : rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 ;
    public final void rule__SchemeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1437:1: ( rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1438:2: rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__02958);
            rule__SchemeList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__02961);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1445:1: rule__SchemeList__Group__0__Impl : ( () ) ;
    public final void rule__SchemeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1449:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1450:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1450:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1451:1: ()
            {
             before(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1452:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1454:1: 
            {
            }

             after(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SchemeList__Group__0__Impl


    // $ANTLR start rule__SchemeList__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1464:1: rule__SchemeList__Group__1 : rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 ;
    public final void rule__SchemeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1468:1: ( rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1469:2: rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__13019);
            rule__SchemeList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__13022);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1476:1: rule__SchemeList__Group__1__Impl : ( '(' ) ;
    public final void rule__SchemeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1480:1: ( ( '(' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1481:1: ( '(' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1481:1: ( '(' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1482:1: '('
            {
             before(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__SchemeList__Group__1__Impl3050); 
             after(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_1()); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1495:1: rule__SchemeList__Group__2 : rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 ;
    public final void rule__SchemeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1499:1: ( rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1500:2: rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__23081);
            rule__SchemeList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__23084);
            rule__SchemeList__Group__3();
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1507:1: rule__SchemeList__Group__2__Impl : ( ( rule__SchemeList__ExpressionsAssignment_2 )* ) ;
    public final void rule__SchemeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1511:1: ( ( ( rule__SchemeList__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1512:1: ( ( rule__SchemeList__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1512:1: ( ( rule__SchemeList__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1513:1: ( rule__SchemeList__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_2()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1514:1: ( rule__SchemeList__ExpressionsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||(LA14_0>=12 && LA14_0<=13)||LA14_0==15||LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1514:2: rule__SchemeList__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_2_in_rule__SchemeList__Group__2__Impl3111);
            	    rule__SchemeList__ExpressionsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSchemeListAccess().getExpressionsAssignment_2()); 

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


    // $ANTLR start rule__SchemeList__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1524:1: rule__SchemeList__Group__3 : rule__SchemeList__Group__3__Impl ;
    public final void rule__SchemeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1528:1: ( rule__SchemeList__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1529:2: rule__SchemeList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__33142);
            rule__SchemeList__Group__3__Impl();
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
    // $ANTLR end rule__SchemeList__Group__3


    // $ANTLR start rule__SchemeList__Group__3__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1535:1: rule__SchemeList__Group__3__Impl : ( ')' ) ;
    public final void rule__SchemeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1539:1: ( ( ')' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1540:1: ( ')' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1540:1: ( ')' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1541:1: ')'
            {
             before(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__SchemeList__Group__3__Impl3170); 
             after(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end rule__SchemeList__Group__3__Impl


    // $ANTLR start rule__SchemeBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1562:1: rule__SchemeBlock__Group__0 : rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 ;
    public final void rule__SchemeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1566:1: ( rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1567:2: rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__03209);
            rule__SchemeBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__03212);
            rule__SchemeBlock__Group__1();
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
    // $ANTLR end rule__SchemeBlock__Group__0


    // $ANTLR start rule__SchemeBlock__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1574:1: rule__SchemeBlock__Group__0__Impl : ( '#{' ) ;
    public final void rule__SchemeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1578:1: ( ( '#{' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1579:1: ( '#{' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1579:1: ( '#{' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1580:1: '#{'
            {
             before(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__SchemeBlock__Group__0__Impl3240); 
             after(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end rule__SchemeBlock__Group__0__Impl


    // $ANTLR start rule__SchemeBlock__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1593:1: rule__SchemeBlock__Group__1 : rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 ;
    public final void rule__SchemeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1597:1: ( rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1598:2: rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__13271);
            rule__SchemeBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__13274);
            rule__SchemeBlock__Group__2();
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
    // $ANTLR end rule__SchemeBlock__Group__1


    // $ANTLR start rule__SchemeBlock__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1605:1: rule__SchemeBlock__Group__1__Impl : ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__SchemeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1609:1: ( ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1610:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1610:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1611:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1611:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1612:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1613:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1613:2: rule__SchemeBlock__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl3303);
            rule__SchemeBlock__ExpressionsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 

            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1616:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1617:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            {
             before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1618:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_ANY_OTHER)||LA15_0==RULE_INT||(LA15_0>=12 && LA15_0<=17)||LA15_0==19||LA15_0==21||LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1618:2: rule__SchemeBlock__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl3315);
            	    rule__SchemeBlock__ExpressionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 

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
    // $ANTLR end rule__SchemeBlock__Group__1__Impl


    // $ANTLR start rule__SchemeBlock__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1629:1: rule__SchemeBlock__Group__2 : rule__SchemeBlock__Group__2__Impl ;
    public final void rule__SchemeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1633:1: ( rule__SchemeBlock__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1634:2: rule__SchemeBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__23348);
            rule__SchemeBlock__Group__2__Impl();
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
    // $ANTLR end rule__SchemeBlock__Group__2


    // $ANTLR start rule__SchemeBlock__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1640:1: rule__SchemeBlock__Group__2__Impl : ( '#}' ) ;
    public final void rule__SchemeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1644:1: ( ( '#}' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1645:1: ( '#}' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1645:1: ( '#}' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1646:1: '#}'
            {
             before(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__SchemeBlock__Group__2__Impl3376); 
             after(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end rule__SchemeBlock__Group__2__Impl


    // $ANTLR start rule__LongCommand__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1665:1: rule__LongCommand__Group__0 : rule__LongCommand__Group__0__Impl rule__LongCommand__Group__1 ;
    public final void rule__LongCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1669:1: ( rule__LongCommand__Group__0__Impl rule__LongCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1670:2: rule__LongCommand__Group__0__Impl rule__LongCommand__Group__1
            {
            pushFollow(FOLLOW_rule__LongCommand__Group__0__Impl_in_rule__LongCommand__Group__03413);
            rule__LongCommand__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LongCommand__Group__1_in_rule__LongCommand__Group__03416);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1677:1: rule__LongCommand__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__LongCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1681:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1682:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1682:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1683:1: '\\\\'
            {
             before(grammarAccess.getLongCommandAccess().getReverseSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__LongCommand__Group__0__Impl3444); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1696:1: rule__LongCommand__Group__1 : rule__LongCommand__Group__1__Impl ;
    public final void rule__LongCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1700:1: ( rule__LongCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1701:2: rule__LongCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LongCommand__Group__1__Impl_in_rule__LongCommand__Group__13475);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1707:1: rule__LongCommand__Group__1__Impl : ( ( rule__LongCommand__IdAssignment_1 ) ) ;
    public final void rule__LongCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1711:1: ( ( ( rule__LongCommand__IdAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1712:1: ( ( rule__LongCommand__IdAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1712:1: ( ( rule__LongCommand__IdAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1713:1: ( rule__LongCommand__IdAssignment_1 )
            {
             before(grammarAccess.getLongCommandAccess().getIdAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1714:1: ( rule__LongCommand__IdAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1714:2: rule__LongCommand__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__LongCommand__IdAssignment_1_in_rule__LongCommand__Group__1__Impl3502);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1728:1: rule__ShortCommand__Group__0 : rule__ShortCommand__Group__0__Impl rule__ShortCommand__Group__1 ;
    public final void rule__ShortCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1732:1: ( rule__ShortCommand__Group__0__Impl rule__ShortCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1733:2: rule__ShortCommand__Group__0__Impl rule__ShortCommand__Group__1
            {
            pushFollow(FOLLOW_rule__ShortCommand__Group__0__Impl_in_rule__ShortCommand__Group__03536);
            rule__ShortCommand__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ShortCommand__Group__1_in_rule__ShortCommand__Group__03539);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1740:1: rule__ShortCommand__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__ShortCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1744:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1745:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1745:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1746:1: '\\\\'
            {
             before(grammarAccess.getShortCommandAccess().getReverseSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ShortCommand__Group__0__Impl3567); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1759:1: rule__ShortCommand__Group__1 : rule__ShortCommand__Group__1__Impl ;
    public final void rule__ShortCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1763:1: ( rule__ShortCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1764:2: rule__ShortCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ShortCommand__Group__1__Impl_in_rule__ShortCommand__Group__13598);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1770:1: rule__ShortCommand__Group__1__Impl : ( ( rule__ShortCommand__IdAssignment_1 ) ) ;
    public final void rule__ShortCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1774:1: ( ( ( rule__ShortCommand__IdAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1775:1: ( ( rule__ShortCommand__IdAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1775:1: ( ( rule__ShortCommand__IdAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1776:1: ( rule__ShortCommand__IdAssignment_1 )
            {
             before(grammarAccess.getShortCommandAccess().getIdAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1777:1: ( rule__ShortCommand__IdAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1777:2: rule__ShortCommand__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ShortCommand__IdAssignment_1_in_rule__ShortCommand__Group__1__Impl3625);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1791:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1795:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1796:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__03659);
            rule__Include__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__03662);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1803:1: rule__Include__Group__0__Impl : ( ( rule__Include__IdAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1807:1: ( ( ( rule__Include__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1808:1: ( ( rule__Include__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1808:1: ( ( rule__Include__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1809:1: ( rule__Include__IdAssignment_0 )
            {
             before(grammarAccess.getIncludeAccess().getIdAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1810:1: ( rule__Include__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1810:2: rule__Include__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__IdAssignment_0_in_rule__Include__Group__0__Impl3689);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1820:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1824:1: ( rule__Include__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1825:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__13719);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1831:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1835:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1836:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1836:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1837:1: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1838:1: ( rule__Include__ImportURIAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1838:2: rule__Include__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_1_in_rule__Include__Group__1__Impl3746);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1852:1: rule__IncludeKeyword__Group__0 : rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1 ;
    public final void rule__IncludeKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1856:1: ( rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1857:2: rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeKeyword__Group__0__Impl_in_rule__IncludeKeyword__Group__03780);
            rule__IncludeKeyword__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IncludeKeyword__Group__1_in_rule__IncludeKeyword__Group__03783);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1864:1: rule__IncludeKeyword__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__IncludeKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1868:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1869:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1869:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1870:1: '\\\\'
            {
             before(grammarAccess.getIncludeKeywordAccess().getReverseSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__IncludeKeyword__Group__0__Impl3811); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1883:1: rule__IncludeKeyword__Group__1 : rule__IncludeKeyword__Group__1__Impl ;
    public final void rule__IncludeKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1887:1: ( rule__IncludeKeyword__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1888:2: rule__IncludeKeyword__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IncludeKeyword__Group__1__Impl_in_rule__IncludeKeyword__Group__13842);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1894:1: rule__IncludeKeyword__Group__1__Impl : ( 'include' ) ;
    public final void rule__IncludeKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1898:1: ( ( 'include' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1899:1: ( 'include' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1899:1: ( 'include' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1900:1: 'include'
            {
             before(grammarAccess.getIncludeKeywordAccess().getIncludeKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__IncludeKeyword__Group__1__Impl3870); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1917:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1921:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1922:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__03905);
            rule__Version__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__03908);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1929:1: rule__Version__Group__0__Impl : ( ( rule__Version__IdAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1933:1: ( ( ( rule__Version__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1934:1: ( ( rule__Version__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1934:1: ( ( rule__Version__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1935:1: ( rule__Version__IdAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getIdAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1936:1: ( rule__Version__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1936:2: rule__Version__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Version__IdAssignment_0_in_rule__Version__Group__0__Impl3935);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1946:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1950:1: ( rule__Version__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1951:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__13965);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1957:1: rule__Version__Group__1__Impl : ( ( rule__Version__VersionAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1961:1: ( ( ( rule__Version__VersionAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1962:1: ( ( rule__Version__VersionAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1962:1: ( ( rule__Version__VersionAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1963:1: ( rule__Version__VersionAssignment_1 )
            {
             before(grammarAccess.getVersionAccess().getVersionAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1964:1: ( rule__Version__VersionAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1964:2: rule__Version__VersionAssignment_1
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl3992);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1978:1: rule__VersionKeyword__Group__0 : rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1 ;
    public final void rule__VersionKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1982:1: ( rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1983:2: rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__VersionKeyword__Group__0__Impl_in_rule__VersionKeyword__Group__04026);
            rule__VersionKeyword__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VersionKeyword__Group__1_in_rule__VersionKeyword__Group__04029);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1990:1: rule__VersionKeyword__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__VersionKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1994:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1995:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1995:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1996:1: '\\\\'
            {
             before(grammarAccess.getVersionKeywordAccess().getReverseSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__VersionKeyword__Group__0__Impl4057); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2009:1: rule__VersionKeyword__Group__1 : rule__VersionKeyword__Group__1__Impl ;
    public final void rule__VersionKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2013:1: ( rule__VersionKeyword__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2014:2: rule__VersionKeyword__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VersionKeyword__Group__1__Impl_in_rule__VersionKeyword__Group__14088);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2020:1: rule__VersionKeyword__Group__1__Impl : ( 'version' ) ;
    public final void rule__VersionKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2024:1: ( ( 'version' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2025:1: ( 'version' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2025:1: ( 'version' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2026:1: 'version'
            {
             before(grammarAccess.getVersionKeywordAccess().getVersionKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__VersionKeyword__Group__1__Impl4116); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2044:1: rule__LilyPond__ExpressionsAssignment : ( ruleExpression ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2048:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2049:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2049:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2050:1: ruleExpression
            {
             before(grammarAccess.getLilyPondAccess().getExpressionsExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__LilyPond__ExpressionsAssignment4156);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2059:1: rule__SimpleBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2063:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2064:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2064:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2065:1: ruleExpression
            {
             before(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_24187);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2074:1: rule__SimultaneousBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimultaneousBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2078:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2079:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2079:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2080:1: ruleExpression
            {
             before(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_24218);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2089:1: rule__Scheme__ValueAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__Scheme__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2093:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2094:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2094:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2095:1: ruleSchemeExpression
            {
             before(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_14249);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2104:1: rule__SchemeExpression__QuotedAssignment_0 : ( ( '\\'' ) ) ;
    public final void rule__SchemeExpression__QuotedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2108:1: ( ( ( '\\'' ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2109:1: ( ( '\\'' ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2109:1: ( ( '\\'' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2110:1: ( '\\'' )
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2111:1: ( '\\'' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2112:1: '\\''
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__SchemeExpression__QuotedAssignment_04285); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2127:1: rule__SchemeExpression__ValueAssignment_1 : ( ruleSchemeValue ) ;
    public final void rule__SchemeExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2131:1: ( ( ruleSchemeValue ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2132:1: ( ruleSchemeValue )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2132:1: ( ruleSchemeValue )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2133:1: ruleSchemeValue
            {
             before(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_14324);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2142:1: rule__SchemeBoolean__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__SchemeBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2146:1: ( ( RULE_BOOL ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2147:1: ( RULE_BOOL )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2147:1: ( RULE_BOOL )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2148:1: RULE_BOOL
            {
             before(grammarAccess.getSchemeBooleanAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__SchemeBoolean__ValueAssignment4355); 
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


    // $ANTLR start rule__SchemeList__ExpressionsAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2157:1: rule__SchemeList__ExpressionsAssignment_2 : ( ruleSchemeExpression ) ;
    public final void rule__SchemeList__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2161:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2162:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2162:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2163:1: ruleSchemeExpression
            {
             before(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_24386);
            ruleSchemeExpression();
            _fsp--;

             after(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end rule__SchemeList__ExpressionsAssignment_2


    // $ANTLR start rule__SchemeBlock__ExpressionsAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2172:1: rule__SchemeBlock__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__SchemeBlock__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2176:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2177:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2177:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2178:1: ruleExpression
            {
             before(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_14417);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end rule__SchemeBlock__ExpressionsAssignment_1


    // $ANTLR start rule__SchemeText__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2187:1: rule__SchemeText__ValueAssignment : ( ruleSchemeTextLiterals ) ;
    public final void rule__SchemeText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2191:1: ( ( ruleSchemeTextLiterals ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2192:1: ( ruleSchemeTextLiterals )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2192:1: ( ruleSchemeTextLiterals )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2193:1: ruleSchemeTextLiterals
            {
             before(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment4448);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2202:1: rule__LongCommand__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__LongCommand__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2206:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2208:1: RULE_ID
            {
             before(grammarAccess.getLongCommandAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LongCommand__IdAssignment_14479); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2217:1: rule__ShortCommand__IdAssignment_1 : ( ( rule__ShortCommand__IdAlternatives_1_0 ) ) ;
    public final void rule__ShortCommand__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2221:1: ( ( ( rule__ShortCommand__IdAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2222:1: ( ( rule__ShortCommand__IdAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2222:1: ( ( rule__ShortCommand__IdAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2223:1: ( rule__ShortCommand__IdAlternatives_1_0 )
            {
             before(grammarAccess.getShortCommandAccess().getIdAlternatives_1_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2224:1: ( rule__ShortCommand__IdAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2224:2: rule__ShortCommand__IdAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ShortCommand__IdAlternatives_1_0_in_rule__ShortCommand__IdAssignment_14510);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2233:1: rule__Include__IdAssignment_0 : ( ruleIncludeKeyword ) ;
    public final void rule__Include__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2237:1: ( ( ruleIncludeKeyword ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2238:1: ( ruleIncludeKeyword )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2238:1: ( ruleIncludeKeyword )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2239:1: ruleIncludeKeyword
            {
             before(grammarAccess.getIncludeAccess().getIdIncludeKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIncludeKeyword_in_rule__Include__IdAssignment_04543);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2248:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2252:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2253:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2253:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2254:1: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_14574); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2263:1: rule__Version__IdAssignment_0 : ( ruleVersionKeyword ) ;
    public final void rule__Version__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2267:1: ( ( ruleVersionKeyword ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2268:1: ( ruleVersionKeyword )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2268:1: ( ruleVersionKeyword )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2269:1: ruleVersionKeyword
            {
             before(grammarAccess.getVersionAccess().getIdVersionKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVersionKeyword_in_rule__Version__IdAssignment_04605);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2278:1: rule__Version__VersionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Version__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2282:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2283:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2283:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2284:1: RULE_STRING
            {
             before(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_14636); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2293:1: rule__Text__ValueAssignment : ( ( rule__Text__ValueAlternatives_0 ) ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2297:1: ( ( ( rule__Text__ValueAlternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2298:1: ( ( rule__Text__ValueAlternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2298:1: ( ( rule__Text__ValueAlternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2299:1: ( rule__Text__ValueAlternatives_0 )
            {
             before(grammarAccess.getTextAccess().getValueAlternatives_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2300:1: ( rule__Text__ValueAlternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2300:2: rule__Text__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment4667);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2309:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2314:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2314:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2315:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment4700); 
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
    public static final BitSet FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond94 = new BitSet(new long[]{0x00000000012BF172L});
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
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0_in_ruleSchemeBlock695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiterals789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeTextLiterals__Alternatives_in_ruleSchemeTextLiterals815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomCommand_in_entryRuleCustomCommand902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomCommand909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomCommand__Alternatives_in_ruleCustomCommand935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongCommand_in_entryRuleLongCommand967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongCommand974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongCommand__Group__0_in_ruleLongCommand1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortCommand_in_entryRuleShortCommand1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortCommand1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__Group__0_in_ruleShortCommand1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresetCommand_in_entryRulePresetCommand1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresetCommand1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresetCommand__Alternatives_in_rulePresetCommand1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_entryRuleIncludeKeyword1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeKeyword1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__0_in_ruleIncludeKeyword1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_entryRuleVersionKeyword1354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionKeyword1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__0_in_ruleVersionKeyword1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAssignment_in_ruleText1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Expression__Alternatives1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__Expression__Alternatives1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Expression__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Expression__Alternatives1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Expression__Alternatives1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__SchemeValue__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SchemeTextLiterals__Alternatives1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomCommand_in_rule__Command__Alternatives1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresetCommand_in_rule__Command__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongCommand_in_rule__CustomCommand__Alternatives1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortCommand_in_rule__CustomCommand__Alternatives1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ShortCommand__IdAlternatives_1_01981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ShortCommand__IdAlternatives_1_02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ShortCommand__IdAlternatives_1_02020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__PresetCommand__Alternatives2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__PresetCommand__Alternatives2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_02101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Text__ValueAlternatives_02119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Text__ValueAlternatives_02139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Text__ValueAlternatives_02159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Text__ValueAlternatives_02179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__02211 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__02214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__12272 = new BitSet(new long[]{0x00000000012FF170L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__12275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleBlock__Group__1__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__22334 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__22337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl2364 = new BitSet(new long[]{0x00000000012BF172L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__32395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SimpleBlock__Group__3__Impl2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__02462 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__02465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__12523 = new BitSet(new long[]{0x00000000013BF170L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SimultaneousBlock__Group__1__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__22585 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__22588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl2615 = new BitSet(new long[]{0x00000000012BF172L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__32646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SimultaneousBlock__Group__3__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__02713 = new BitSet(new long[]{0x000000000040B1F0L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Scheme__Group__0__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__02836 = new BitSet(new long[]{0x00000000004031F0L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__02839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_in_rule__SchemeExpression__Group__0__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__02958 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__02961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__13019 = new BitSet(new long[]{0x000000000040F1F0L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__13022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SchemeList__Group__1__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__23081 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__23084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_2_in_rule__SchemeList__Group__2__Impl3111 = new BitSet(new long[]{0x000000000040B1F2L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__33142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SchemeList__Group__3__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__03209 = new BitSet(new long[]{0x00000000012BF170L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__03212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SchemeBlock__Group__0__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__13271 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__13274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl3303 = new BitSet(new long[]{0x00000000012BF172L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl3315 = new BitSet(new long[]{0x00000000012BF172L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__23348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SchemeBlock__Group__2__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongCommand__Group__0__Impl_in_rule__LongCommand__Group__03413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LongCommand__Group__1_in_rule__LongCommand__Group__03416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LongCommand__Group__0__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongCommand__Group__1__Impl_in_rule__LongCommand__Group__13475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongCommand__IdAssignment_1_in_rule__LongCommand__Group__1__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__Group__0__Impl_in_rule__ShortCommand__Group__03536 = new BitSet(new long[]{0x0000000000006040L});
    public static final BitSet FOLLOW_rule__ShortCommand__Group__1_in_rule__ShortCommand__Group__03539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ShortCommand__Group__0__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__Group__1__Impl_in_rule__ShortCommand__Group__13598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__IdAssignment_1_in_rule__ShortCommand__Group__1__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__03659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__03662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IdAssignment_0_in_rule__Include__Group__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__13719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_1_in_rule__Include__Group__1__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__0__Impl_in_rule__IncludeKeyword__Group__03780 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__1_in_rule__IncludeKeyword__Group__03783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IncludeKeyword__Group__0__Impl3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__1__Impl_in_rule__IncludeKeyword__Group__13842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IncludeKeyword__Group__1__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__03905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__03908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__IdAssignment_0_in_rule__Version__Group__0__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__0__Impl_in_rule__VersionKeyword__Group__04026 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__1_in_rule__VersionKeyword__Group__04029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VersionKeyword__Group__0__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__1__Impl_in_rule__VersionKeyword__Group__14088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VersionKeyword__Group__1__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LilyPond__ExpressionsAssignment4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_24187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_24218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_14249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SchemeExpression__QuotedAssignment_04285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_14324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__SchemeBoolean__ValueAssignment4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_24386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LongCommand__IdAssignment_14479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortCommand__IdAlternatives_1_0_in_rule__ShortCommand__IdAssignment_14510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_rule__Include__IdAssignment_04543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_14574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_rule__Version__IdAssignment_04605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_14636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment4700 = new BitSet(new long[]{0x0000000000000002L});

}