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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_BOOL", "RULE_INT", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "'\\\\\\\\'", "'('", "')'", "'\\''", "','", "'{'", "'}'", "'<<'", "'>>'", "'#'", "'#{'", "'#}'", "'\\\\'", "'include'", "'version'", "'#x'"
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


    // $ANTLR start entryRuleSchemeNumber
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:425:1: entryRuleSchemeNumber : ruleSchemeNumber EOF ;
    public final void entryRuleSchemeNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:429:1: ( ruleSchemeNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:430:1: ruleSchemeNumber EOF
            {
             before(grammarAccess.getSchemeNumberRule()); 
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber847);
            ruleSchemeNumber();
            _fsp--;

             after(grammarAccess.getSchemeNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber854); 

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
    // $ANTLR end entryRuleSchemeNumber


    // $ANTLR start ruleSchemeNumber
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:440:1: ruleSchemeNumber : ( ( rule__SchemeNumber__Group__0 ) ) ;
    public final void ruleSchemeNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:445:2: ( ( ( rule__SchemeNumber__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:446:1: ( ( rule__SchemeNumber__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:446:1: ( ( rule__SchemeNumber__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:447:1: ( rule__SchemeNumber__Group__0 )
            {
             before(grammarAccess.getSchemeNumberAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:448:1: ( rule__SchemeNumber__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:448:2: rule__SchemeNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0_in_ruleSchemeNumber884);
            rule__SchemeNumber__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSchemeNumberAccess().getGroup()); 

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
    // $ANTLR end ruleSchemeNumber


    // $ANTLR start entryRuleCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:461:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:462:1: ( ruleCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:463:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand911);
            ruleCommand();
            _fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand918); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:470:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:474:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:475:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:475:1: ( ( rule__Command__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:476:1: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:477:1: ( rule__Command__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:477:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand944);
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


    // $ANTLR start entryRuleArbitraryCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:489:1: entryRuleArbitraryCommand : ruleArbitraryCommand EOF ;
    public final void entryRuleArbitraryCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:490:1: ( ruleArbitraryCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:491:1: ruleArbitraryCommand EOF
            {
             before(grammarAccess.getArbitraryCommandRule()); 
            pushFollow(FOLLOW_ruleArbitraryCommand_in_entryRuleArbitraryCommand971);
            ruleArbitraryCommand();
            _fsp--;

             after(grammarAccess.getArbitraryCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryCommand978); 

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
    // $ANTLR end entryRuleArbitraryCommand


    // $ANTLR start ruleArbitraryCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:498:1: ruleArbitraryCommand : ( ( rule__ArbitraryCommand__KeywordAssignment ) ) ;
    public final void ruleArbitraryCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:502:2: ( ( ( rule__ArbitraryCommand__KeywordAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:503:1: ( ( rule__ArbitraryCommand__KeywordAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:503:1: ( ( rule__ArbitraryCommand__KeywordAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:1: ( rule__ArbitraryCommand__KeywordAssignment )
            {
             before(grammarAccess.getArbitraryCommandAccess().getKeywordAssignment()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:505:1: ( rule__ArbitraryCommand__KeywordAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:505:2: rule__ArbitraryCommand__KeywordAssignment
            {
            pushFollow(FOLLOW_rule__ArbitraryCommand__KeywordAssignment_in_ruleArbitraryCommand1004);
            rule__ArbitraryCommand__KeywordAssignment();
            _fsp--;


            }

             after(grammarAccess.getArbitraryCommandAccess().getKeywordAssignment()); 

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
    // $ANTLR end ruleArbitraryCommand


    // $ANTLR start entryRuleArbitraryCommandKeyword
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:517:1: entryRuleArbitraryCommandKeyword : ruleArbitraryCommandKeyword EOF ;
    public final void entryRuleArbitraryCommandKeyword() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:521:1: ( ruleArbitraryCommandKeyword EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:522:1: ruleArbitraryCommandKeyword EOF
            {
             before(grammarAccess.getArbitraryCommandKeywordRule()); 
            pushFollow(FOLLOW_ruleArbitraryCommandKeyword_in_entryRuleArbitraryCommandKeyword1036);
            ruleArbitraryCommandKeyword();
            _fsp--;

             after(grammarAccess.getArbitraryCommandKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryCommandKeyword1043); 

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
    // $ANTLR end entryRuleArbitraryCommandKeyword


    // $ANTLR start ruleArbitraryCommandKeyword
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:532:1: ruleArbitraryCommandKeyword : ( ( rule__ArbitraryCommandKeyword__Group__0 ) ) ;
    public final void ruleArbitraryCommandKeyword() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:537:2: ( ( ( rule__ArbitraryCommandKeyword__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:538:1: ( ( rule__ArbitraryCommandKeyword__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:538:1: ( ( rule__ArbitraryCommandKeyword__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:539:1: ( rule__ArbitraryCommandKeyword__Group__0 )
            {
             before(grammarAccess.getArbitraryCommandKeywordAccess().getGroup()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:540:1: ( rule__ArbitraryCommandKeyword__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:540:2: rule__ArbitraryCommandKeyword__Group__0
            {
            pushFollow(FOLLOW_rule__ArbitraryCommandKeyword__Group__0_in_ruleArbitraryCommandKeyword1073);
            rule__ArbitraryCommandKeyword__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArbitraryCommandKeywordAccess().getGroup()); 

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
    // $ANTLR end ruleArbitraryCommandKeyword


    // $ANTLR start entryRuleSpecialCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:553:1: entryRuleSpecialCommand : ruleSpecialCommand EOF ;
    public final void entryRuleSpecialCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:554:1: ( ruleSpecialCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:555:1: ruleSpecialCommand EOF
            {
             before(grammarAccess.getSpecialCommandRule()); 
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand1100);
            ruleSpecialCommand();
            _fsp--;

             after(grammarAccess.getSpecialCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand1107); 

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
    // $ANTLR end entryRuleSpecialCommand


    // $ANTLR start ruleSpecialCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:562:1: ruleSpecialCommand : ( ( rule__SpecialCommand__Alternatives ) ) ;
    public final void ruleSpecialCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:566:2: ( ( ( rule__SpecialCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:567:1: ( ( rule__SpecialCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:567:1: ( ( rule__SpecialCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:568:1: ( rule__SpecialCommand__Alternatives )
            {
             before(grammarAccess.getSpecialCommandAccess().getAlternatives()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:569:1: ( rule__SpecialCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:569:2: rule__SpecialCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecialCommand__Alternatives_in_ruleSpecialCommand1133);
            rule__SpecialCommand__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSpecialCommandAccess().getAlternatives()); 

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
    // $ANTLR end ruleSpecialCommand


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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:827:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) );
    public final void rule__SchemeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:831:1: ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) )
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
            case 27:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("827:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) );", 4, 0, input);

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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:856:6: ( ruleSchemeNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:856:6: ( ruleSchemeNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:857:1: ruleSchemeNumber
                    {
                     before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives1764);
                    ruleSchemeNumber();
                    _fsp--;

                     after(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_4()); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:903:1: rule__Command__Alternatives : ( ( ruleArbitraryCommand ) | ( ruleSpecialCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:907:1: ( ( ruleArbitraryCommand ) | ( ruleSpecialCommand ) )
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
                        new NoViableAltException("903:1: rule__Command__Alternatives : ( ( ruleArbitraryCommand ) | ( ruleSpecialCommand ) );", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("903:1: rule__Command__Alternatives : ( ( ruleArbitraryCommand ) | ( ruleSpecialCommand ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:908:1: ( ruleArbitraryCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:908:1: ( ruleArbitraryCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:909:1: ruleArbitraryCommand
                    {
                     before(grammarAccess.getCommandAccess().getArbitraryCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleArbitraryCommand_in_rule__Command__Alternatives1882);
                    ruleArbitraryCommand();
                    _fsp--;

                     after(grammarAccess.getCommandAccess().getArbitraryCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:914:6: ( ruleSpecialCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:914:6: ( ruleSpecialCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:915:1: ruleSpecialCommand
                    {
                     before(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives1899);
                    ruleSpecialCommand();
                    _fsp--;

                     after(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_1()); 

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


    // $ANTLR start rule__ArbitraryCommandKeyword__Alternatives_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:925:1: rule__ArbitraryCommandKeyword__Alternatives_1 : ( ( RULE_ID ) | ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) );
    public final void rule__ArbitraryCommandKeyword__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:929:1: ( ( RULE_ID ) | ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("925:1: rule__ArbitraryCommandKeyword__Alternatives_1 : ( ( RULE_ID ) | ( '(' ) | ( ')' ) | ( RULE_ANY_OTHER ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:931:1: RULE_ID
                    {
                     before(grammarAccess.getArbitraryCommandKeywordAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArbitraryCommandKeyword__Alternatives_11931); 
                     after(grammarAccess.getArbitraryCommandKeywordAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:936:6: ( '(' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:936:6: ( '(' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:937:1: '('
                    {
                     before(grammarAccess.getArbitraryCommandKeywordAccess().getLeftParenthesisKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__ArbitraryCommandKeyword__Alternatives_11949); 
                     after(grammarAccess.getArbitraryCommandKeywordAccess().getLeftParenthesisKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:944:6: ( ')' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:944:6: ( ')' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:945:1: ')'
                    {
                     before(grammarAccess.getArbitraryCommandKeywordAccess().getRightParenthesisKeyword_1_2()); 
                    match(input,14,FOLLOW_14_in_rule__ArbitraryCommandKeyword__Alternatives_11969); 
                     after(grammarAccess.getArbitraryCommandKeywordAccess().getRightParenthesisKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:952:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:952:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:953:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getArbitraryCommandKeywordAccess().getANY_OTHERTerminalRuleCall_1_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ArbitraryCommandKeyword__Alternatives_11988); 
                     after(grammarAccess.getArbitraryCommandKeywordAccess().getANY_OTHERTerminalRuleCall_1_3()); 

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
    // $ANTLR end rule__ArbitraryCommandKeyword__Alternatives_1


    // $ANTLR start rule__SpecialCommand__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:963:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );
    public final void rule__SpecialCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:967:1: ( ( ruleInclude ) | ( ruleVersion ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==26) ) {
                    alt8=2;
                }
                else if ( (LA8_1==25) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("963:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("963:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:968:1: ( ruleInclude )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:968:1: ( ruleInclude )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:969:1: ruleInclude
                    {
                     before(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives2020);
                    ruleInclude();
                    _fsp--;

                     after(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:974:6: ( ruleVersion )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:974:6: ( ruleVersion )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:975:1: ruleVersion
                    {
                     before(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives2037);
                    ruleVersion();
                    _fsp--;

                     after(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 

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
    // $ANTLR end rule__SpecialCommand__Alternatives


    // $ANTLR start rule__Text__ValueAlternatives_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:985:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) );
    public final void rule__Text__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:989:1: ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_ANY_OTHER:
            case 12:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            case 13:
                {
                alt9=4;
                }
                break;
            case 14:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("985:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( '\\'' ) | ( ',' ) | ( '(' ) | ( ')' ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:990:1: ( ruleSchemeTextLiterals )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:990:1: ( ruleSchemeTextLiterals )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:991:1: ruleSchemeTextLiterals
                    {
                     before(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_02069);
                    ruleSchemeTextLiterals();
                    _fsp--;

                     after(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:996:6: ( '\\'' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:996:6: ( '\\'' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:997:1: '\\''
                    {
                     before(grammarAccess.getTextAccess().getValueApostropheKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Text__ValueAlternatives_02087); 
                     after(grammarAccess.getTextAccess().getValueApostropheKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1004:6: ( ',' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1004:6: ( ',' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1005:1: ','
                    {
                     before(grammarAccess.getTextAccess().getValueCommaKeyword_0_2()); 
                    match(input,16,FOLLOW_16_in_rule__Text__ValueAlternatives_02107); 
                     after(grammarAccess.getTextAccess().getValueCommaKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1012:6: ( '(' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1012:6: ( '(' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1013:1: '('
                    {
                     before(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_3()); 
                    match(input,13,FOLLOW_13_in_rule__Text__ValueAlternatives_02127); 
                     after(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1020:6: ( ')' )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1020:6: ( ')' )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1021:1: ')'
                    {
                     before(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_4()); 
                    match(input,14,FOLLOW_14_in_rule__Text__ValueAlternatives_02147); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1035:1: rule__SimpleBlock__Group__0 : rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 ;
    public final void rule__SimpleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1039:1: ( rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1040:2: rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__02179);
            rule__SimpleBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__02182);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1047:1: rule__SimpleBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimpleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1051:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1052:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1052:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1053:1: ()
            {
             before(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1054:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1056:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1066:1: rule__SimpleBlock__Group__1 : rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 ;
    public final void rule__SimpleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1070:1: ( rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1071:2: rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__12240);
            rule__SimpleBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__12243);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1078:1: rule__SimpleBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SimpleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1082:1: ( ( '{' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1083:1: ( '{' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1083:1: ( '{' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1084:1: '{'
            {
             before(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__SimpleBlock__Group__1__Impl2271); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1097:1: rule__SimpleBlock__Group__2 : rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 ;
    public final void rule__SimpleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1101:1: ( rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1102:2: rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__22302);
            rule__SimpleBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__22305);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1109:1: rule__SimpleBlock__Group__2__Impl : ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimpleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1113:1: ( ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1114:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1114:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1115:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1116:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_ANY_OTHER)||LA10_0==RULE_INT||(LA10_0>=12 && LA10_0<=17)||LA10_0==19||LA10_0==21||LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1116:2: rule__SimpleBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl2332);
            	    rule__SimpleBlock__ExpressionsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1126:1: rule__SimpleBlock__Group__3 : rule__SimpleBlock__Group__3__Impl ;
    public final void rule__SimpleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1130:1: ( rule__SimpleBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1131:2: rule__SimpleBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__32363);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1137:1: rule__SimpleBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__SimpleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1141:1: ( ( '}' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1142:1: ( '}' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1142:1: ( '}' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1143:1: '}'
            {
             before(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__SimpleBlock__Group__3__Impl2391); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1164:1: rule__SimultaneousBlock__Group__0 : rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 ;
    public final void rule__SimultaneousBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1168:1: ( rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1169:2: rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__02430);
            rule__SimultaneousBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__02433);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1176:1: rule__SimultaneousBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimultaneousBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1180:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1181:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1181:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1182:1: ()
            {
             before(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1183:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1185:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1195:1: rule__SimultaneousBlock__Group__1 : rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 ;
    public final void rule__SimultaneousBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1199:1: ( rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1200:2: rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__12491);
            rule__SimultaneousBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__12494);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1207:1: rule__SimultaneousBlock__Group__1__Impl : ( '<<' ) ;
    public final void rule__SimultaneousBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1211:1: ( ( '<<' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1212:1: ( '<<' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1212:1: ( '<<' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1213:1: '<<'
            {
             before(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__SimultaneousBlock__Group__1__Impl2522); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1226:1: rule__SimultaneousBlock__Group__2 : rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 ;
    public final void rule__SimultaneousBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1230:1: ( rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1231:2: rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__22553);
            rule__SimultaneousBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__22556);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1238:1: rule__SimultaneousBlock__Group__2__Impl : ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimultaneousBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1242:1: ( ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1243:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1243:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1244:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1245:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_ANY_OTHER)||LA11_0==RULE_INT||(LA11_0>=12 && LA11_0<=17)||LA11_0==19||LA11_0==21||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1245:2: rule__SimultaneousBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl2583);
            	    rule__SimultaneousBlock__ExpressionsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1255:1: rule__SimultaneousBlock__Group__3 : rule__SimultaneousBlock__Group__3__Impl ;
    public final void rule__SimultaneousBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1259:1: ( rule__SimultaneousBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1260:2: rule__SimultaneousBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__32614);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1266:1: rule__SimultaneousBlock__Group__3__Impl : ( '>>' ) ;
    public final void rule__SimultaneousBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1270:1: ( ( '>>' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1271:1: ( '>>' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1271:1: ( '>>' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1272:1: '>>'
            {
             before(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__SimultaneousBlock__Group__3__Impl2642); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1293:1: rule__Scheme__Group__0 : rule__Scheme__Group__0__Impl rule__Scheme__Group__1 ;
    public final void rule__Scheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1297:1: ( rule__Scheme__Group__0__Impl rule__Scheme__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1298:2: rule__Scheme__Group__0__Impl rule__Scheme__Group__1
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__02681);
            rule__Scheme__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__02684);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1305:1: rule__Scheme__Group__0__Impl : ( '#' ) ;
    public final void rule__Scheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1309:1: ( ( '#' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1310:1: ( '#' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1310:1: ( '#' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1311:1: '#'
            {
             before(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Scheme__Group__0__Impl2712); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1324:1: rule__Scheme__Group__1 : rule__Scheme__Group__1__Impl ;
    public final void rule__Scheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1328:1: ( rule__Scheme__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1329:2: rule__Scheme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__12743);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1335:1: rule__Scheme__Group__1__Impl : ( ( rule__Scheme__ValueAssignment_1 ) ) ;
    public final void rule__Scheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1339:1: ( ( ( rule__Scheme__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1340:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1340:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1341:1: ( rule__Scheme__ValueAssignment_1 )
            {
             before(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1342:1: ( rule__Scheme__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1342:2: rule__Scheme__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl2770);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1356:1: rule__SchemeExpression__Group__0 : rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 ;
    public final void rule__SchemeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1360:1: ( rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1361:2: rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__02804);
            rule__SchemeExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__02807);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1368:1: rule__SchemeExpression__Group__0__Impl : ( ( rule__SchemeExpression__QuotedAssignment_0 )? ) ;
    public final void rule__SchemeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1372:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1373:1: ( ( rule__SchemeExpression__QuotedAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1373:1: ( ( rule__SchemeExpression__QuotedAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1374:1: ( rule__SchemeExpression__QuotedAssignment_0 )?
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:1: ( rule__SchemeExpression__QuotedAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:2: rule__SchemeExpression__QuotedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_in_rule__SchemeExpression__Group__0__Impl2834);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1385:1: rule__SchemeExpression__Group__1 : rule__SchemeExpression__Group__1__Impl ;
    public final void rule__SchemeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1389:1: ( rule__SchemeExpression__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1390:2: rule__SchemeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__12865);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1396:1: rule__SchemeExpression__Group__1__Impl : ( ( rule__SchemeExpression__ValueAssignment_1 ) ) ;
    public final void rule__SchemeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1400:1: ( ( ( rule__SchemeExpression__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1401:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1401:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1402:1: ( rule__SchemeExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1403:1: ( rule__SchemeExpression__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1403:2: rule__SchemeExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl2892);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1417:1: rule__SchemeList__Group__0 : rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 ;
    public final void rule__SchemeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1421:1: ( rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1422:2: rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__02926);
            rule__SchemeList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__02929);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1429:1: rule__SchemeList__Group__0__Impl : ( () ) ;
    public final void rule__SchemeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1433:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1434:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1434:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1435:1: ()
            {
             before(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1436:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1438:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1448:1: rule__SchemeList__Group__1 : rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 ;
    public final void rule__SchemeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1452:1: ( rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1453:2: rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__12987);
            rule__SchemeList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__12990);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1460:1: rule__SchemeList__Group__1__Impl : ( '(' ) ;
    public final void rule__SchemeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1464:1: ( ( '(' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:1: ( '(' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:1: ( '(' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1466:1: '('
            {
             before(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__SchemeList__Group__1__Impl3018); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1479:1: rule__SchemeList__Group__2 : rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 ;
    public final void rule__SchemeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1483:1: ( rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1484:2: rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__23049);
            rule__SchemeList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__23052);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1491:1: rule__SchemeList__Group__2__Impl : ( ( rule__SchemeList__ExpressionsAssignment_2 )* ) ;
    public final void rule__SchemeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1495:1: ( ( ( rule__SchemeList__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1496:1: ( ( rule__SchemeList__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1496:1: ( ( rule__SchemeList__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1497:1: ( rule__SchemeList__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_2()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1498:1: ( rule__SchemeList__ExpressionsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||(LA13_0>=12 && LA13_0<=13)||LA13_0==15||LA13_0==22||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1498:2: rule__SchemeList__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_2_in_rule__SchemeList__Group__2__Impl3079);
            	    rule__SchemeList__ExpressionsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1508:1: rule__SchemeList__Group__3 : rule__SchemeList__Group__3__Impl ;
    public final void rule__SchemeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1512:1: ( rule__SchemeList__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1513:2: rule__SchemeList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__33110);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1519:1: rule__SchemeList__Group__3__Impl : ( ')' ) ;
    public final void rule__SchemeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1523:1: ( ( ')' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1524:1: ( ')' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1524:1: ( ')' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1525:1: ')'
            {
             before(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__SchemeList__Group__3__Impl3138); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1546:1: rule__SchemeBlock__Group__0 : rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 ;
    public final void rule__SchemeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1550:1: ( rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1551:2: rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__03177);
            rule__SchemeBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__03180);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1558:1: rule__SchemeBlock__Group__0__Impl : ( '#{' ) ;
    public final void rule__SchemeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1562:1: ( ( '#{' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1563:1: ( '#{' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1563:1: ( '#{' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1564:1: '#{'
            {
             before(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__SchemeBlock__Group__0__Impl3208); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:1: rule__SchemeBlock__Group__1 : rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 ;
    public final void rule__SchemeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1581:1: ( rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1582:2: rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__13239);
            rule__SchemeBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__13242);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1589:1: rule__SchemeBlock__Group__1__Impl : ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__SchemeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1593:1: ( ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1594:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1594:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1595:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1595:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1596:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1597:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1597:2: rule__SchemeBlock__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl3271);
            rule__SchemeBlock__ExpressionsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 

            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1600:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            {
             before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1602:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_ANY_OTHER)||LA14_0==RULE_INT||(LA14_0>=12 && LA14_0<=17)||LA14_0==19||LA14_0==21||LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1602:2: rule__SchemeBlock__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl3283);
            	    rule__SchemeBlock__ExpressionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1613:1: rule__SchemeBlock__Group__2 : rule__SchemeBlock__Group__2__Impl ;
    public final void rule__SchemeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1617:1: ( rule__SchemeBlock__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1618:2: rule__SchemeBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__23316);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1624:1: rule__SchemeBlock__Group__2__Impl : ( '#}' ) ;
    public final void rule__SchemeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1628:1: ( ( '#}' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1629:1: ( '#}' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1629:1: ( '#}' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1630:1: '#}'
            {
             before(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__SchemeBlock__Group__2__Impl3344); 
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


    // $ANTLR start rule__SchemeNumber__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1649:1: rule__SchemeNumber__Group__0 : rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 ;
    public final void rule__SchemeNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1653:1: ( rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1654:2: rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__03381);
            rule__SchemeNumber__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__03384);
            rule__SchemeNumber__Group__1();
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
    // $ANTLR end rule__SchemeNumber__Group__0


    // $ANTLR start rule__SchemeNumber__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1661:1: rule__SchemeNumber__Group__0__Impl : ( ( rule__SchemeNumber__HexadecimalAssignment_0 )? ) ;
    public final void rule__SchemeNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1665:1: ( ( ( rule__SchemeNumber__HexadecimalAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1666:1: ( ( rule__SchemeNumber__HexadecimalAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1666:1: ( ( rule__SchemeNumber__HexadecimalAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1667:1: ( rule__SchemeNumber__HexadecimalAssignment_0 )?
            {
             before(grammarAccess.getSchemeNumberAccess().getHexadecimalAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1668:1: ( rule__SchemeNumber__HexadecimalAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1668:2: rule__SchemeNumber__HexadecimalAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeNumber__HexadecimalAssignment_0_in_rule__SchemeNumber__Group__0__Impl3411);
                    rule__SchemeNumber__HexadecimalAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemeNumberAccess().getHexadecimalAssignment_0()); 

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
    // $ANTLR end rule__SchemeNumber__Group__0__Impl


    // $ANTLR start rule__SchemeNumber__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1678:1: rule__SchemeNumber__Group__1 : rule__SchemeNumber__Group__1__Impl ;
    public final void rule__SchemeNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1682:1: ( rule__SchemeNumber__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1683:2: rule__SchemeNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__13442);
            rule__SchemeNumber__Group__1__Impl();
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
    // $ANTLR end rule__SchemeNumber__Group__1


    // $ANTLR start rule__SchemeNumber__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1689:1: rule__SchemeNumber__Group__1__Impl : ( ( rule__SchemeNumber__ValueAssignment_1 ) ) ;
    public final void rule__SchemeNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1693:1: ( ( ( rule__SchemeNumber__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1694:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1694:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1695:1: ( rule__SchemeNumber__ValueAssignment_1 )
            {
             before(grammarAccess.getSchemeNumberAccess().getValueAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1696:1: ( rule__SchemeNumber__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1696:2: rule__SchemeNumber__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl3469);
            rule__SchemeNumber__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSchemeNumberAccess().getValueAssignment_1()); 

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
    // $ANTLR end rule__SchemeNumber__Group__1__Impl


    // $ANTLR start rule__ArbitraryCommandKeyword__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1710:1: rule__ArbitraryCommandKeyword__Group__0 : rule__ArbitraryCommandKeyword__Group__0__Impl rule__ArbitraryCommandKeyword__Group__1 ;
    public final void rule__ArbitraryCommandKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1714:1: ( rule__ArbitraryCommandKeyword__Group__0__Impl rule__ArbitraryCommandKeyword__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1715:2: rule__ArbitraryCommandKeyword__Group__0__Impl rule__ArbitraryCommandKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__ArbitraryCommandKeyword__Group__0__Impl_in_rule__ArbitraryCommandKeyword__Group__03503);
            rule__ArbitraryCommandKeyword__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArbitraryCommandKeyword__Group__1_in_rule__ArbitraryCommandKeyword__Group__03506);
            rule__ArbitraryCommandKeyword__Group__1();
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
    // $ANTLR end rule__ArbitraryCommandKeyword__Group__0


    // $ANTLR start rule__ArbitraryCommandKeyword__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1722:1: rule__ArbitraryCommandKeyword__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__ArbitraryCommandKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1726:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1727:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1727:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1728:1: '\\\\'
            {
             before(grammarAccess.getArbitraryCommandKeywordAccess().getReverseSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ArbitraryCommandKeyword__Group__0__Impl3534); 
             after(grammarAccess.getArbitraryCommandKeywordAccess().getReverseSolidusKeyword_0()); 

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
    // $ANTLR end rule__ArbitraryCommandKeyword__Group__0__Impl


    // $ANTLR start rule__ArbitraryCommandKeyword__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1741:1: rule__ArbitraryCommandKeyword__Group__1 : rule__ArbitraryCommandKeyword__Group__1__Impl ;
    public final void rule__ArbitraryCommandKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1745:1: ( rule__ArbitraryCommandKeyword__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1746:2: rule__ArbitraryCommandKeyword__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArbitraryCommandKeyword__Group__1__Impl_in_rule__ArbitraryCommandKeyword__Group__13565);
            rule__ArbitraryCommandKeyword__Group__1__Impl();
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
    // $ANTLR end rule__ArbitraryCommandKeyword__Group__1


    // $ANTLR start rule__ArbitraryCommandKeyword__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1752:1: rule__ArbitraryCommandKeyword__Group__1__Impl : ( ( rule__ArbitraryCommandKeyword__Alternatives_1 ) ) ;
    public final void rule__ArbitraryCommandKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1756:1: ( ( ( rule__ArbitraryCommandKeyword__Alternatives_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1757:1: ( ( rule__ArbitraryCommandKeyword__Alternatives_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1757:1: ( ( rule__ArbitraryCommandKeyword__Alternatives_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1758:1: ( rule__ArbitraryCommandKeyword__Alternatives_1 )
            {
             before(grammarAccess.getArbitraryCommandKeywordAccess().getAlternatives_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1759:1: ( rule__ArbitraryCommandKeyword__Alternatives_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1759:2: rule__ArbitraryCommandKeyword__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ArbitraryCommandKeyword__Alternatives_1_in_rule__ArbitraryCommandKeyword__Group__1__Impl3592);
            rule__ArbitraryCommandKeyword__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getArbitraryCommandKeywordAccess().getAlternatives_1()); 

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
    // $ANTLR end rule__ArbitraryCommandKeyword__Group__1__Impl


    // $ANTLR start rule__Include__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1773:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1777:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1778:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__03626);
            rule__Include__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__03629);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1785:1: rule__Include__Group__0__Impl : ( ( rule__Include__KeywordAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1789:1: ( ( ( rule__Include__KeywordAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1790:1: ( ( rule__Include__KeywordAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1790:1: ( ( rule__Include__KeywordAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1791:1: ( rule__Include__KeywordAssignment_0 )
            {
             before(grammarAccess.getIncludeAccess().getKeywordAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1792:1: ( rule__Include__KeywordAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1792:2: rule__Include__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__KeywordAssignment_0_in_rule__Include__Group__0__Impl3656);
            rule__Include__KeywordAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getIncludeAccess().getKeywordAssignment_0()); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1802:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1806:1: ( rule__Include__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1807:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__13686);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1813:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1817:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1818:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1818:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1819:1: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1820:1: ( rule__Include__ImportURIAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1820:2: rule__Include__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_1_in_rule__Include__Group__1__Impl3713);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1834:1: rule__IncludeKeyword__Group__0 : rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1 ;
    public final void rule__IncludeKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1838:1: ( rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1839:2: rule__IncludeKeyword__Group__0__Impl rule__IncludeKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeKeyword__Group__0__Impl_in_rule__IncludeKeyword__Group__03747);
            rule__IncludeKeyword__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IncludeKeyword__Group__1_in_rule__IncludeKeyword__Group__03750);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1846:1: rule__IncludeKeyword__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__IncludeKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1850:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1851:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1851:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1852:1: '\\\\'
            {
             before(grammarAccess.getIncludeKeywordAccess().getReverseSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__IncludeKeyword__Group__0__Impl3778); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1865:1: rule__IncludeKeyword__Group__1 : rule__IncludeKeyword__Group__1__Impl ;
    public final void rule__IncludeKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1869:1: ( rule__IncludeKeyword__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1870:2: rule__IncludeKeyword__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IncludeKeyword__Group__1__Impl_in_rule__IncludeKeyword__Group__13809);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1876:1: rule__IncludeKeyword__Group__1__Impl : ( 'include' ) ;
    public final void rule__IncludeKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1880:1: ( ( 'include' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1881:1: ( 'include' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1881:1: ( 'include' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1882:1: 'include'
            {
             before(grammarAccess.getIncludeKeywordAccess().getIncludeKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__IncludeKeyword__Group__1__Impl3837); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1899:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1903:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1904:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__03872);
            rule__Version__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__03875);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1911:1: rule__Version__Group__0__Impl : ( ( rule__Version__KeywordAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1915:1: ( ( ( rule__Version__KeywordAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1916:1: ( ( rule__Version__KeywordAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1916:1: ( ( rule__Version__KeywordAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1917:1: ( rule__Version__KeywordAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getKeywordAssignment_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1918:1: ( rule__Version__KeywordAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1918:2: rule__Version__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Version__KeywordAssignment_0_in_rule__Version__Group__0__Impl3902);
            rule__Version__KeywordAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getVersionAccess().getKeywordAssignment_0()); 

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1928:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1932:1: ( rule__Version__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1933:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__13932);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1939:1: rule__Version__Group__1__Impl : ( ( rule__Version__VersionAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1943:1: ( ( ( rule__Version__VersionAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1944:1: ( ( rule__Version__VersionAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1944:1: ( ( rule__Version__VersionAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1945:1: ( rule__Version__VersionAssignment_1 )
            {
             before(grammarAccess.getVersionAccess().getVersionAssignment_1()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1946:1: ( rule__Version__VersionAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1946:2: rule__Version__VersionAssignment_1
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl3959);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1960:1: rule__VersionKeyword__Group__0 : rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1 ;
    public final void rule__VersionKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1964:1: ( rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1965:2: rule__VersionKeyword__Group__0__Impl rule__VersionKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__VersionKeyword__Group__0__Impl_in_rule__VersionKeyword__Group__03993);
            rule__VersionKeyword__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VersionKeyword__Group__1_in_rule__VersionKeyword__Group__03996);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1972:1: rule__VersionKeyword__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__VersionKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1976:1: ( ( '\\\\' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1977:1: ( '\\\\' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1977:1: ( '\\\\' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1978:1: '\\\\'
            {
             before(grammarAccess.getVersionKeywordAccess().getReverseSolidusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__VersionKeyword__Group__0__Impl4024); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1991:1: rule__VersionKeyword__Group__1 : rule__VersionKeyword__Group__1__Impl ;
    public final void rule__VersionKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1995:1: ( rule__VersionKeyword__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1996:2: rule__VersionKeyword__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VersionKeyword__Group__1__Impl_in_rule__VersionKeyword__Group__14055);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2002:1: rule__VersionKeyword__Group__1__Impl : ( 'version' ) ;
    public final void rule__VersionKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2006:1: ( ( 'version' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2007:1: ( 'version' )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2007:1: ( 'version' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2008:1: 'version'
            {
             before(grammarAccess.getVersionKeywordAccess().getVersionKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__VersionKeyword__Group__1__Impl4083); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2026:1: rule__LilyPond__ExpressionsAssignment : ( ruleExpression ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2030:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2031:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2031:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2032:1: ruleExpression
            {
             before(grammarAccess.getLilyPondAccess().getExpressionsExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__LilyPond__ExpressionsAssignment4123);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2041:1: rule__SimpleBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2045:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2046:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2046:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2047:1: ruleExpression
            {
             before(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_24154);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2056:1: rule__SimultaneousBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimultaneousBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2060:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2061:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2061:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2062:1: ruleExpression
            {
             before(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_24185);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2071:1: rule__Scheme__ValueAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__Scheme__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2075:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2076:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2076:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2077:1: ruleSchemeExpression
            {
             before(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_14216);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2086:1: rule__SchemeExpression__QuotedAssignment_0 : ( ( '\\'' ) ) ;
    public final void rule__SchemeExpression__QuotedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2090:1: ( ( ( '\\'' ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2091:1: ( ( '\\'' ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2091:1: ( ( '\\'' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2092:1: ( '\\'' )
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2093:1: ( '\\'' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2094:1: '\\''
            {
             before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__SchemeExpression__QuotedAssignment_04252); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2109:1: rule__SchemeExpression__ValueAssignment_1 : ( ruleSchemeValue ) ;
    public final void rule__SchemeExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2113:1: ( ( ruleSchemeValue ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2114:1: ( ruleSchemeValue )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2114:1: ( ruleSchemeValue )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2115:1: ruleSchemeValue
            {
             before(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_14291);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2124:1: rule__SchemeBoolean__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__SchemeBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2128:1: ( ( RULE_BOOL ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2129:1: ( RULE_BOOL )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2129:1: ( RULE_BOOL )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2130:1: RULE_BOOL
            {
             before(grammarAccess.getSchemeBooleanAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__SchemeBoolean__ValueAssignment4322); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2139:1: rule__SchemeList__ExpressionsAssignment_2 : ( ruleSchemeExpression ) ;
    public final void rule__SchemeList__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2143:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2144:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2144:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2145:1: ruleSchemeExpression
            {
             before(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_24353);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2154:1: rule__SchemeBlock__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__SchemeBlock__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2158:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2159:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2159:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2160:1: ruleExpression
            {
             before(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_14384);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2169:1: rule__SchemeText__ValueAssignment : ( ruleSchemeTextLiterals ) ;
    public final void rule__SchemeText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2173:1: ( ( ruleSchemeTextLiterals ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2174:1: ( ruleSchemeTextLiterals )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2174:1: ( ruleSchemeTextLiterals )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2175:1: ruleSchemeTextLiterals
            {
             before(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment4415);
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


    // $ANTLR start rule__SchemeNumber__HexadecimalAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2184:1: rule__SchemeNumber__HexadecimalAssignment_0 : ( ( '#x' ) ) ;
    public final void rule__SchemeNumber__HexadecimalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2188:1: ( ( ( '#x' ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2189:1: ( ( '#x' ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2189:1: ( ( '#x' ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2190:1: ( '#x' )
            {
             before(grammarAccess.getSchemeNumberAccess().getHexadecimalXKeyword_0_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2191:1: ( '#x' )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2192:1: '#x'
            {
             before(grammarAccess.getSchemeNumberAccess().getHexadecimalXKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__SchemeNumber__HexadecimalAssignment_04451); 
             after(grammarAccess.getSchemeNumberAccess().getHexadecimalXKeyword_0_0()); 

            }

             after(grammarAccess.getSchemeNumberAccess().getHexadecimalXKeyword_0_0()); 

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
    // $ANTLR end rule__SchemeNumber__HexadecimalAssignment_0


    // $ANTLR start rule__SchemeNumber__ValueAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:1: rule__SchemeNumber__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SchemeNumber__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2211:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2212:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2212:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2213:1: RULE_INT
            {
             before(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_14490); 
             after(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__SchemeNumber__ValueAssignment_1


    // $ANTLR start rule__ArbitraryCommand__KeywordAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2222:1: rule__ArbitraryCommand__KeywordAssignment : ( ruleArbitraryCommandKeyword ) ;
    public final void rule__ArbitraryCommand__KeywordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2226:1: ( ( ruleArbitraryCommandKeyword ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2227:1: ( ruleArbitraryCommandKeyword )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2227:1: ( ruleArbitraryCommandKeyword )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2228:1: ruleArbitraryCommandKeyword
            {
             before(grammarAccess.getArbitraryCommandAccess().getKeywordArbitraryCommandKeywordParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleArbitraryCommandKeyword_in_rule__ArbitraryCommand__KeywordAssignment4521);
            ruleArbitraryCommandKeyword();
            _fsp--;

             after(grammarAccess.getArbitraryCommandAccess().getKeywordArbitraryCommandKeywordParserRuleCall_0()); 

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
    // $ANTLR end rule__ArbitraryCommand__KeywordAssignment


    // $ANTLR start rule__Include__KeywordAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2237:1: rule__Include__KeywordAssignment_0 : ( ruleIncludeKeyword ) ;
    public final void rule__Include__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2241:1: ( ( ruleIncludeKeyword ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2242:1: ( ruleIncludeKeyword )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2242:1: ( ruleIncludeKeyword )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2243:1: ruleIncludeKeyword
            {
             before(grammarAccess.getIncludeAccess().getKeywordIncludeKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIncludeKeyword_in_rule__Include__KeywordAssignment_04552);
            ruleIncludeKeyword();
            _fsp--;

             after(grammarAccess.getIncludeAccess().getKeywordIncludeKeywordParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Include__KeywordAssignment_0


    // $ANTLR start rule__Include__ImportURIAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2252:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2256:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2258:1: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_14583); 
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


    // $ANTLR start rule__Version__KeywordAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2267:1: rule__Version__KeywordAssignment_0 : ( ruleVersionKeyword ) ;
    public final void rule__Version__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2271:1: ( ( ruleVersionKeyword ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2272:1: ( ruleVersionKeyword )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2272:1: ( ruleVersionKeyword )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2273:1: ruleVersionKeyword
            {
             before(grammarAccess.getVersionAccess().getKeywordVersionKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVersionKeyword_in_rule__Version__KeywordAssignment_04614);
            ruleVersionKeyword();
            _fsp--;

             after(grammarAccess.getVersionAccess().getKeywordVersionKeywordParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Version__KeywordAssignment_0


    // $ANTLR start rule__Version__VersionAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2282:1: rule__Version__VersionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Version__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2286:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2287:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2287:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2288:1: RULE_STRING
            {
             before(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_14645); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2297:1: rule__Text__ValueAssignment : ( ( rule__Text__ValueAlternatives_0 ) ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2301:1: ( ( ( rule__Text__ValueAlternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2302:1: ( ( rule__Text__ValueAlternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2302:1: ( ( rule__Text__ValueAlternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2303:1: ( rule__Text__ValueAlternatives_0 )
            {
             before(grammarAccess.getTextAccess().getValueAlternatives_0()); 
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2304:1: ( rule__Text__ValueAlternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2304:2: rule__Text__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment4676);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2317:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2318:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2318:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2319:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment4709); 
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
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0_in_ruleSchemeNumber884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryCommand_in_entryRuleArbitraryCommand971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryCommand978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryCommand__KeywordAssignment_in_ruleArbitraryCommand1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryCommandKeyword_in_entryRuleArbitraryCommandKeyword1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryCommandKeyword1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryCommandKeyword__Group__0_in_ruleArbitraryCommandKeyword1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialCommand__Alternatives_in_ruleSpecialCommand1133 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SchemeTextLiterals__Alternatives1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryCommand_in_rule__Command__Alternatives1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArbitraryCommandKeyword__Alternatives_11931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArbitraryCommandKeyword__Alternatives_11949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ArbitraryCommandKeyword__Alternatives_11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ArbitraryCommandKeyword__Alternatives_11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_02069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Text__ValueAlternatives_02087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Text__ValueAlternatives_02107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Text__ValueAlternatives_02127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Text__ValueAlternatives_02147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__02179 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__02182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__12240 = new BitSet(new long[]{0x00000000012FF170L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__12243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleBlock__Group__1__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__22302 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__22305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl2332 = new BitSet(new long[]{0x00000000012BF172L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__32363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SimpleBlock__Group__3__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__02430 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__02433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__12491 = new BitSet(new long[]{0x00000000013BF170L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SimultaneousBlock__Group__1__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__22553 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__22556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl2583 = new BitSet(new long[]{0x00000000012BF172L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__32614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SimultaneousBlock__Group__3__Impl2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__02681 = new BitSet(new long[]{0x000000000840B1F0L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__02684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Scheme__Group__0__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__02804 = new BitSet(new long[]{0x00000000084031F0L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__02807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_in_rule__SchemeExpression__Group__0__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__12865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__02926 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__02929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__12987 = new BitSet(new long[]{0x000000000840F1F0L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__12990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SchemeList__Group__1__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__23049 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__23052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_2_in_rule__SchemeList__Group__2__Impl3079 = new BitSet(new long[]{0x000000000840B1F2L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__33110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SchemeList__Group__3__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__03177 = new BitSet(new long[]{0x00000000012BF170L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__03180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SchemeBlock__Group__0__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__13239 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__13242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl3271 = new BitSet(new long[]{0x00000000012BF172L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl3283 = new BitSet(new long[]{0x00000000012BF172L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__23316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SchemeBlock__Group__2__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__03381 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__03384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__HexadecimalAssignment_0_in_rule__SchemeNumber__Group__0__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__13442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryCommandKeyword__Group__0__Impl_in_rule__ArbitraryCommandKeyword__Group__03503 = new BitSet(new long[]{0x0000000000006050L});
    public static final BitSet FOLLOW_rule__ArbitraryCommandKeyword__Group__1_in_rule__ArbitraryCommandKeyword__Group__03506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ArbitraryCommandKeyword__Group__0__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryCommandKeyword__Group__1__Impl_in_rule__ArbitraryCommandKeyword__Group__13565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryCommandKeyword__Alternatives_1_in_rule__ArbitraryCommandKeyword__Group__1__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__03626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__03629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__KeywordAssignment_0_in_rule__Include__Group__0__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__13686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_1_in_rule__Include__Group__1__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__0__Impl_in_rule__IncludeKeyword__Group__03747 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__1_in_rule__IncludeKeyword__Group__03750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IncludeKeyword__Group__0__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeKeyword__Group__1__Impl_in_rule__IncludeKeyword__Group__13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IncludeKeyword__Group__1__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__03872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__03875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__KeywordAssignment_0_in_rule__Version__Group__0__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__13932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__0__Impl_in_rule__VersionKeyword__Group__03993 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__1_in_rule__VersionKeyword__Group__03996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VersionKeyword__Group__0__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionKeyword__Group__1__Impl_in_rule__VersionKeyword__Group__14055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VersionKeyword__Group__1__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LilyPond__ExpressionsAssignment4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_24154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_24185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_14216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SchemeExpression__QuotedAssignment_04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_14291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__SchemeBoolean__ValueAssignment4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_24353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_14384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SchemeNumber__HexadecimalAssignment_04451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_14490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryCommandKeyword_in_rule__ArbitraryCommand__KeywordAssignment4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeKeyword_in_rule__Include__KeywordAssignment_04552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_14583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionKeyword_in_rule__Version__KeywordAssignment_04614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_14645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment4709 = new BitSet(new long[]{0x0000000000000002L});

}