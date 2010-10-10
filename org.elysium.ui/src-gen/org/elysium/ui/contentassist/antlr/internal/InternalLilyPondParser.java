package org.elysium.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLilyPondParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_29", "KEYWORD_27", "KEYWORD_28", "KEYWORD_26", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_ID=35;
    public static final int RULE_SCHEME_SL_COMMENT=39;
    public static final int RULE_ANY_OTHER=41;
    public static final int KEYWORD_19=8;
    public static final int KEYWORD_1=15;
    public static final int KEYWORD_17=31;
    public static final int KEYWORD_18=32;
    public static final int KEYWORD_15=29;
    public static final int KEYWORD_5=19;
    public static final int KEYWORD_16=30;
    public static final int KEYWORD_4=18;
    public static final int KEYWORD_13=27;
    public static final int KEYWORD_3=17;
    public static final int KEYWORD_14=28;
    public static final int KEYWORD_2=16;
    public static final int KEYWORD_11=25;
    public static final int KEYWORD_12=26;
    public static final int RULE_SL_COMMENT=37;
    public static final int Tokens=42;
    public static final int EOF=-1;
    public static final int KEYWORD_10=24;
    public static final int RULE_ML_COMMENT=38;
    public static final int RULE_STRING=33;
    public static final int KEYWORD_6=20;
    public static final int KEYWORD_7=21;
    public static final int KEYWORD_8=22;
    public static final int KEYWORD_9=23;
    public static final int KEYWORD_28=6;
    public static final int KEYWORD_29=4;
    public static final int RULE_SCHEME_ML_COMMENT=40;
    public static final int RULE_INT=34;
    public static final int KEYWORD_24=13;
    public static final int KEYWORD_25=14;
    public static final int KEYWORD_26=7;
    public static final int KEYWORD_27=5;
    public static final int KEYWORD_20=9;
    public static final int RULE_WS=36;
    public static final int KEYWORD_21=10;
    public static final int KEYWORD_22=11;
    public static final int KEYWORD_23=12;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[288+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g"; }


     
     	private LilyPondGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'!'");
    		tokenNameToValue.put("KEYWORD_2", "'#'");
    		tokenNameToValue.put("KEYWORD_3", "'\u0024'");
    		tokenNameToValue.put("KEYWORD_4", "'\''");
    		tokenNameToValue.put("KEYWORD_5", "'('");
    		tokenNameToValue.put("KEYWORD_6", "')'");
    		tokenNameToValue.put("KEYWORD_7", "'+'");
    		tokenNameToValue.put("KEYWORD_8", "','");
    		tokenNameToValue.put("KEYWORD_9", "'<'");
    		tokenNameToValue.put("KEYWORD_10", "'='");
    		tokenNameToValue.put("KEYWORD_11", "'>'");
    		tokenNameToValue.put("KEYWORD_12", "'['");
    		tokenNameToValue.put("KEYWORD_13", "'\\'");
    		tokenNameToValue.put("KEYWORD_14", "']'");
    		tokenNameToValue.put("KEYWORD_15", "'`'");
    		tokenNameToValue.put("KEYWORD_16", "'{'");
    		tokenNameToValue.put("KEYWORD_17", "'}'");
    		tokenNameToValue.put("KEYWORD_18", "'~'");
    		tokenNameToValue.put("KEYWORD_19", "'#:'");
    		tokenNameToValue.put("KEYWORD_20", "'#\\'");
    		tokenNameToValue.put("KEYWORD_21", "'#{'");
    		tokenNameToValue.put("KEYWORD_22", "'#}'");
    		tokenNameToValue.put("KEYWORD_23", "'<<'");
    		tokenNameToValue.put("KEYWORD_24", "'>>'");
    		tokenNameToValue.put("KEYWORD_25", "'\\\\'");
    		tokenNameToValue.put("KEYWORD_26", "'markup'");
    		tokenNameToValue.put("KEYWORD_27", "'include'");
    		tokenNameToValue.put("KEYWORD_28", "'version'");
    		tokenNameToValue.put("KEYWORD_29", "'markuplines'");
     	}
     	
        public void setGrammarAccess(LilyPondGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start entryRuleLilyPond
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:94:1: entryRuleLilyPond : ruleLilyPond EOF ;
    public final void entryRuleLilyPond() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:95:1: ( ruleLilyPond EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:96:1: ruleLilyPond EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondRule()); 
            }
            pushFollow(FOLLOW_ruleLilyPond_in_entryRuleLilyPond60);
            ruleLilyPond();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getLilyPondRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilyPond67); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:103:1: ruleLilyPond : ( ( rule__LilyPond__ExpressionsAssignment )* ) ;
    public final void ruleLilyPond() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:107:5: ( ( ( rule__LilyPond__ExpressionsAssignment )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:108:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:108:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:109:1: ( rule__LilyPond__ExpressionsAssignment )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:110:1: ( rule__LilyPond__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_23||(LA1_0>=KEYWORD_25 && LA1_0<=KEYWORD_2)||(LA1_0>=KEYWORD_4 && LA1_0<=KEYWORD_14)||LA1_0==KEYWORD_16||(LA1_0>=KEYWORD_18 && LA1_0<=RULE_ID)||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:110:2: rule__LilyPond__ExpressionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond97);
            	    rule__LilyPond__ExpressionsAssignment();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getLilyPondAccess().getExpressionsAssignment()); 
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
    // $ANTLR end ruleLilyPond


    // $ANTLR start entryRuleToplevelExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:122:1: entryRuleToplevelExpression : ruleToplevelExpression EOF ;
    public final void entryRuleToplevelExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:123:1: ( ruleToplevelExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:124:1: ruleToplevelExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getToplevelExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleToplevelExpression_in_entryRuleToplevelExpression125);
            ruleToplevelExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getToplevelExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToplevelExpression132); if (failed) return ;

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
    // $ANTLR end entryRuleToplevelExpression


    // $ANTLR start ruleToplevelExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:131:1: ruleToplevelExpression : ( ( rule__ToplevelExpression__Alternatives ) ) ;
    public final void ruleToplevelExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:135:5: ( ( ( rule__ToplevelExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:136:1: ( ( rule__ToplevelExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:136:1: ( ( rule__ToplevelExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:137:1: ( rule__ToplevelExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getToplevelExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:138:1: ( rule__ToplevelExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:138:2: rule__ToplevelExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ToplevelExpression__Alternatives_in_ruleToplevelExpression162);
            rule__ToplevelExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getToplevelExpressionAccess().getAlternatives()); 
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
    // $ANTLR end ruleToplevelExpression


    // $ANTLR start entryRuleExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:150:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:151:1: ( ruleExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:152:1: ruleExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression189);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression196); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:159:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:163:5: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:164:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:164:1: ( ( rule__Expression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:165:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:166:1: ( rule__Expression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:166:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression226);
            rule__Expression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleCommonExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:178:1: entryRuleCommonExpression : ruleCommonExpression EOF ;
    public final void entryRuleCommonExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:179:1: ( ruleCommonExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:180:1: ruleCommonExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonExpression_in_entryRuleCommonExpression253);
            ruleCommonExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCommonExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonExpression260); if (failed) return ;

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
    // $ANTLR end entryRuleCommonExpression


    // $ANTLR start ruleCommonExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:187:1: ruleCommonExpression : ( ( rule__CommonExpression__Alternatives ) ) ;
    public final void ruleCommonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:191:5: ( ( ( rule__CommonExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:192:1: ( ( rule__CommonExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:192:1: ( ( rule__CommonExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:193:1: ( rule__CommonExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommonExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:194:1: ( rule__CommonExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:194:2: rule__CommonExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__CommonExpression__Alternatives_in_ruleCommonExpression290);
            rule__CommonExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCommonExpressionAccess().getAlternatives()); 
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
    // $ANTLR end ruleCommonExpression


    // $ANTLR start entryRuleAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:206:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:207:1: ( ruleAssignment EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:208:1: ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment317);
            ruleAssignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment324); if (failed) return ;

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
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:215:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:219:5: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:220:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:220:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:221:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:222:1: ( rule__Assignment__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:222:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment354);
            rule__Assignment__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRulePropertyAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:234:1: entryRulePropertyAssignment : rulePropertyAssignment EOF ;
    public final void entryRulePropertyAssignment() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:235:1: ( rulePropertyAssignment EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:236:1: rulePropertyAssignment EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentRule()); 
            }
            pushFollow(FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment381);
            rulePropertyAssignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPropertyAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAssignment388); if (failed) return ;

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
    // $ANTLR end entryRulePropertyAssignment


    // $ANTLR start rulePropertyAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:243:1: rulePropertyAssignment : ( ( rule__PropertyAssignment__Group__0 ) ) ;
    public final void rulePropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:247:5: ( ( ( rule__PropertyAssignment__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:248:1: ( ( rule__PropertyAssignment__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:248:1: ( ( rule__PropertyAssignment__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:249:1: ( rule__PropertyAssignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:250:1: ( rule__PropertyAssignment__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:250:2: rule__PropertyAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__0_in_rulePropertyAssignment418);
            rule__PropertyAssignment__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPropertyAssignmentAccess().getGroup()); 
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
    // $ANTLR end rulePropertyAssignment


    // $ANTLR start entryRuleBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:262:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:263:1: ( ruleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:264:1: ruleBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock445);
            ruleBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock452); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:271:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:275:5: ( ( ( rule__Block__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:276:1: ( ( rule__Block__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:276:1: ( ( rule__Block__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:277:1: ( rule__Block__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:278:1: ( rule__Block__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:278:2: rule__Block__Alternatives
            {
            pushFollow(FOLLOW_rule__Block__Alternatives_in_ruleBlock482);
            rule__Block__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getAlternatives()); 
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
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleSimpleBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:290:1: entryRuleSimpleBlock : ruleSimpleBlock EOF ;
    public final void entryRuleSimpleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:291:1: ( ruleSimpleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:292:1: ruleSimpleBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock509);
            ruleSimpleBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSimpleBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleBlock516); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:299:1: ruleSimpleBlock : ( ( rule__SimpleBlock__Group__0 ) ) ;
    public final void ruleSimpleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:303:5: ( ( ( rule__SimpleBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:304:1: ( ( rule__SimpleBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:304:1: ( ( rule__SimpleBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:305:1: ( rule__SimpleBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:306:1: ( rule__SimpleBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:306:2: rule__SimpleBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0_in_ruleSimpleBlock546);
            rule__SimpleBlock__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSimpleBlockAccess().getGroup()); 
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
    // $ANTLR end ruleSimpleBlock


    // $ANTLR start entryRuleSimultaneousBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:318:1: entryRuleSimultaneousBlock : ruleSimultaneousBlock EOF ;
    public final void entryRuleSimultaneousBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:319:1: ( ruleSimultaneousBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:320:1: ruleSimultaneousBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock573);
            ruleSimultaneousBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSimultaneousBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimultaneousBlock580); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:327:1: ruleSimultaneousBlock : ( ( rule__SimultaneousBlock__Group__0 ) ) ;
    public final void ruleSimultaneousBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:331:5: ( ( ( rule__SimultaneousBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:332:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:332:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:333:1: ( rule__SimultaneousBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:334:1: ( rule__SimultaneousBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:334:2: rule__SimultaneousBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0_in_ruleSimultaneousBlock610);
            rule__SimultaneousBlock__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSimultaneousBlockAccess().getGroup()); 
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
    // $ANTLR end ruleSimultaneousBlock


    // $ANTLR start entryRuleCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:346:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:347:1: ( ruleCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:348:1: ruleCommand EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand637);
            ruleCommand();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand644); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:355:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:359:5: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:360:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:360:1: ( ( rule__Command__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:361:1: ( rule__Command__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:362:1: ( rule__Command__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:362:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand674);
            rule__Command__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives()); 
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
    // $ANTLR end ruleCommand


    // $ANTLR start entryRuleSpecialCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:374:1: entryRuleSpecialCommand : ruleSpecialCommand EOF ;
    public final void entryRuleSpecialCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:375:1: ( ruleSpecialCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:376:1: ruleSpecialCommand EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand701);
            ruleSpecialCommand();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSpecialCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommand708); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:383:1: ruleSpecialCommand : ( ( rule__SpecialCommand__Alternatives ) ) ;
    public final void ruleSpecialCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:387:5: ( ( ( rule__SpecialCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:388:1: ( ( rule__SpecialCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:388:1: ( ( rule__SpecialCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:389:1: ( rule__SpecialCommand__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:390:1: ( rule__SpecialCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:390:2: rule__SpecialCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecialCommand__Alternatives_in_ruleSpecialCommand738);
            rule__SpecialCommand__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSpecialCommandAccess().getAlternatives()); 
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
    // $ANTLR end ruleSpecialCommand


    // $ANTLR start entryRuleInclude
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:402:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:403:1: ( ruleInclude EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:404:1: ruleInclude EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude765);
            ruleInclude();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude772); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:411:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:415:5: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:416:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:416:1: ( ( rule__Include__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:417:1: ( rule__Include__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:418:1: ( rule__Include__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:418:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude802);
            rule__Include__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getGroup()); 
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
    // $ANTLR end ruleInclude


    // $ANTLR start entryRuleVersion
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:430:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:431:1: ( ruleVersion EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:432:1: ruleVersion EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion829);
            ruleVersion();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVersionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion836); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:439:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:443:5: ( ( ( rule__Version__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:444:1: ( ( rule__Version__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:444:1: ( ( rule__Version__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:445:1: ( rule__Version__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:446:1: ( rule__Version__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:446:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion866);
            rule__Version__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup()); 
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
    // $ANTLR end ruleVersion


    // $ANTLR start entryRuleMarkup
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:458:1: entryRuleMarkup : ruleMarkup EOF ;
    public final void entryRuleMarkup() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:459:1: ( ruleMarkup EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:460:1: ruleMarkup EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupRule()); 
            }
            pushFollow(FOLLOW_ruleMarkup_in_entryRuleMarkup893);
            ruleMarkup();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkup900); if (failed) return ;

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
    // $ANTLR end entryRuleMarkup


    // $ANTLR start ruleMarkup
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:467:1: ruleMarkup : ( ( rule__Markup__Group__0 ) ) ;
    public final void ruleMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:471:5: ( ( ( rule__Markup__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:472:1: ( ( rule__Markup__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:472:1: ( ( rule__Markup__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:473:1: ( rule__Markup__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:474:1: ( rule__Markup__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:474:2: rule__Markup__Group__0
            {
            pushFollow(FOLLOW_rule__Markup__Group__0_in_ruleMarkup930);
            rule__Markup__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getGroup()); 
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
    // $ANTLR end ruleMarkup


    // $ANTLR start entryRuleMarkupLines
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:486:1: entryRuleMarkupLines : ruleMarkupLines EOF ;
    public final void entryRuleMarkupLines() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:487:1: ( ruleMarkupLines EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:488:1: ruleMarkupLines EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines957);
            ruleMarkupLines();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupLinesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupLines964); if (failed) return ;

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
    // $ANTLR end entryRuleMarkupLines


    // $ANTLR start ruleMarkupLines
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:495:1: ruleMarkupLines : ( ( rule__MarkupLines__Group__0 ) ) ;
    public final void ruleMarkupLines() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:499:5: ( ( ( rule__MarkupLines__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:500:1: ( ( rule__MarkupLines__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:500:1: ( ( rule__MarkupLines__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:501:1: ( rule__MarkupLines__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:502:1: ( rule__MarkupLines__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:502:2: rule__MarkupLines__Group__0
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__0_in_ruleMarkupLines994);
            rule__MarkupLines__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupLinesAccess().getGroup()); 
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
    // $ANTLR end ruleMarkupLines


    // $ANTLR start entryRuleMarkupBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:514:1: entryRuleMarkupBlock : ruleMarkupBlock EOF ;
    public final void entryRuleMarkupBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:515:1: ( ruleMarkupBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:516:1: ruleMarkupBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupBlock_in_entryRuleMarkupBlock1021);
            ruleMarkupBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBlock1028); if (failed) return ;

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
    // $ANTLR end entryRuleMarkupBlock


    // $ANTLR start ruleMarkupBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:523:1: ruleMarkupBlock : ( ( rule__MarkupBlock__Group__0 ) ) ;
    public final void ruleMarkupBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:527:5: ( ( ( rule__MarkupBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:528:1: ( ( rule__MarkupBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:528:1: ( ( rule__MarkupBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:529:1: ( rule__MarkupBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:530:1: ( rule__MarkupBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:530:2: rule__MarkupBlock__Group__0
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__0_in_ruleMarkupBlock1058);
            rule__MarkupBlock__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBlockAccess().getGroup()); 
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
    // $ANTLR end ruleMarkupBlock


    // $ANTLR start entryRuleMarkupExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:542:1: entryRuleMarkupExpression : ruleMarkupExpression EOF ;
    public final void entryRuleMarkupExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:543:1: ( ruleMarkupExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:544:1: ruleMarkupExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupExpression_in_entryRuleMarkupExpression1085);
            ruleMarkupExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupExpression1092); if (failed) return ;

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
    // $ANTLR end entryRuleMarkupExpression


    // $ANTLR start ruleMarkupExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:551:1: ruleMarkupExpression : ( ( rule__MarkupExpression__Alternatives ) ) ;
    public final void ruleMarkupExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:555:5: ( ( ( rule__MarkupExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:556:1: ( ( rule__MarkupExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:556:1: ( ( rule__MarkupExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:557:1: ( rule__MarkupExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:558:1: ( rule__MarkupExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:558:2: rule__MarkupExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkupExpression__Alternatives_in_ruleMarkupExpression1122);
            rule__MarkupExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupExpressionAccess().getAlternatives()); 
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
    // $ANTLR end ruleMarkupExpression


    // $ANTLR start entryRuleMarkupCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:570:1: entryRuleMarkupCommand : ruleMarkupCommand EOF ;
    public final void entryRuleMarkupCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:571:1: ( ruleMarkupCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:572:1: ruleMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupCommand_in_entryRuleMarkupCommand1149);
            ruleMarkupCommand();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupCommand1156); if (failed) return ;

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
    // $ANTLR end entryRuleMarkupCommand


    // $ANTLR start ruleMarkupCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:579:1: ruleMarkupCommand : ( ( rule__MarkupCommand__Group__0 ) ) ;
    public final void ruleMarkupCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:583:5: ( ( ( rule__MarkupCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:584:1: ( ( rule__MarkupCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:584:1: ( ( rule__MarkupCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:585:1: ( rule__MarkupCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:586:1: ( rule__MarkupCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:586:2: rule__MarkupCommand__Group__0
            {
            pushFollow(FOLLOW_rule__MarkupCommand__Group__0_in_ruleMarkupCommand1186);
            rule__MarkupCommand__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupCommandAccess().getGroup()); 
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
    // $ANTLR end ruleMarkupCommand


    // $ANTLR start entryRuleReference
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:598:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:599:1: ( ruleReference EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:600:1: ruleReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1213);
            ruleReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1220); if (failed) return ;

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
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:607:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:611:5: ( ( ( rule__Reference__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:612:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:612:1: ( ( rule__Reference__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:613:1: ( rule__Reference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:614:1: ( rule__Reference__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:614:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1250);
            rule__Reference__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGroup()); 
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
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleReferenceName
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:626:1: entryRuleReferenceName : ruleReferenceName EOF ;
    public final void entryRuleReferenceName() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:627:1: ( ruleReferenceName EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:628:1: ruleReferenceName EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceNameRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceName_in_entryRuleReferenceName1277);
            ruleReferenceName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceName1284); if (failed) return ;

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
    // $ANTLR end entryRuleReferenceName


    // $ANTLR start ruleReferenceName
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:635:1: ruleReferenceName : ( ( rule__ReferenceName__Alternatives ) ) ;
    public final void ruleReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:639:5: ( ( ( rule__ReferenceName__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:640:1: ( ( rule__ReferenceName__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:640:1: ( ( rule__ReferenceName__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:641:1: ( rule__ReferenceName__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceNameAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:642:1: ( rule__ReferenceName__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:642:2: rule__ReferenceName__Alternatives
            {
            pushFollow(FOLLOW_rule__ReferenceName__Alternatives_in_ruleReferenceName1314);
            rule__ReferenceName__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceNameAccess().getAlternatives()); 
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
    // $ANTLR end ruleReferenceName


    // $ANTLR start entryRuleSpecialCharacter
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:654:1: entryRuleSpecialCharacter : ruleSpecialCharacter EOF ;
    public final void entryRuleSpecialCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:655:1: ( ruleSpecialCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:656:1: ruleSpecialCharacter EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1341);
            ruleSpecialCharacter();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSpecialCharacterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCharacter1348); if (failed) return ;

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
    // $ANTLR end entryRuleSpecialCharacter


    // $ANTLR start ruleSpecialCharacter
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:663:1: ruleSpecialCharacter : ( ( rule__SpecialCharacter__Alternatives ) ) ;
    public final void ruleSpecialCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:667:5: ( ( ( rule__SpecialCharacter__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:668:1: ( ( rule__SpecialCharacter__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:668:1: ( ( rule__SpecialCharacter__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:669:1: ( rule__SpecialCharacter__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCharacterAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:670:1: ( rule__SpecialCharacter__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:670:2: rule__SpecialCharacter__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecialCharacter__Alternatives_in_ruleSpecialCharacter1378);
            rule__SpecialCharacter__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSpecialCharacterAccess().getAlternatives()); 
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
    // $ANTLR end ruleSpecialCharacter


    // $ANTLR start entryRuleText
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:682:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:683:1: ( ruleText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:684:1: ruleText EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText1405);
            ruleText();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1412); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:691:1: ruleText : ( ( rule__Text__ValueAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:695:5: ( ( ( rule__Text__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:696:1: ( ( rule__Text__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:696:1: ( ( rule__Text__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:697:1: ( rule__Text__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:698:1: ( rule__Text__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:698:2: rule__Text__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Text__ValueAssignment_in_ruleText1442);
            rule__Text__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextAccess().getValueAssignment()); 
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
    // $ANTLR end ruleText


    // $ANTLR start entryRuleNumber
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:710:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:711:1: ( ruleNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:712:1: ruleNumber EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1469);
            ruleNumber();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1476); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:719:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:723:5: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:724:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:724:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:725:1: ( rule__Number__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:726:1: ( rule__Number__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:726:2: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1506);
            rule__Number__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getValueAssignment()); 
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
    // $ANTLR end ruleNumber


    // $ANTLR start entryRuleScheme
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:738:1: entryRuleScheme : ruleScheme EOF ;
    public final void entryRuleScheme() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:742:1: ( ruleScheme EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:743:1: ruleScheme EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeRule()); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme1538);
            ruleScheme();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme1545); if (failed) return ;

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
    // $ANTLR end entryRuleScheme


    // $ANTLR start ruleScheme
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:753:1: ruleScheme : ( ( rule__Scheme__Group__0 ) ) ;
    public final void ruleScheme() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:758:5: ( ( ( rule__Scheme__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:759:1: ( ( rule__Scheme__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:759:1: ( ( rule__Scheme__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:760:1: ( rule__Scheme__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:761:1: ( rule__Scheme__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:761:2: rule__Scheme__Group__0
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0_in_ruleScheme1579);
            rule__Scheme__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleScheme


    // $ANTLR start entryRuleSchemeExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:774:1: entryRuleSchemeExpression : ruleSchemeExpression EOF ;
    public final void entryRuleSchemeExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:775:1: ( ruleSchemeExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:776:1: ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression1606);
            ruleSchemeExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression1613); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:1: ruleSchemeExpression : ( ( rule__SchemeExpression__Group__0 ) ) ;
    public final void ruleSchemeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:787:5: ( ( ( rule__SchemeExpression__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:788:1: ( ( rule__SchemeExpression__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:788:1: ( ( rule__SchemeExpression__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:789:1: ( rule__SchemeExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:790:1: ( rule__SchemeExpression__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:790:2: rule__SchemeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0_in_ruleSchemeExpression1643);
            rule__SchemeExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getGroup()); 
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
    // $ANTLR end ruleSchemeExpression


    // $ANTLR start entryRuleSchemeValue
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:802:1: entryRuleSchemeValue : ruleSchemeValue EOF ;
    public final void entryRuleSchemeValue() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:803:1: ( ruleSchemeValue EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:804:1: ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue1670);
            ruleSchemeValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue1677); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:811:1: ruleSchemeValue : ( ( rule__SchemeValue__Alternatives ) ) ;
    public final void ruleSchemeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:815:5: ( ( ( rule__SchemeValue__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:816:1: ( ( rule__SchemeValue__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:816:1: ( ( rule__SchemeValue__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:817:1: ( rule__SchemeValue__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeValueAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:818:1: ( rule__SchemeValue__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:818:2: rule__SchemeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeValue__Alternatives_in_ruleSchemeValue1707);
            rule__SchemeValue__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeValueAccess().getAlternatives()); 
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
    // $ANTLR end ruleSchemeValue


    // $ANTLR start entryRuleSchemeBoolean
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:830:1: entryRuleSchemeBoolean : ruleSchemeBoolean EOF ;
    public final void entryRuleSchemeBoolean() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:831:1: ( ruleSchemeBoolean EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:832:1: ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1734);
            ruleSchemeBoolean();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean1741); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:839:1: ruleSchemeBoolean : ( ( rule__SchemeBoolean__ValueAssignment ) ) ;
    public final void ruleSchemeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:843:5: ( ( ( rule__SchemeBoolean__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:844:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:844:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:845:1: ( rule__SchemeBoolean__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:846:1: ( rule__SchemeBoolean__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:846:2: rule__SchemeBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeBoolean__ValueAssignment_in_ruleSchemeBoolean1771);
            rule__SchemeBoolean__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBooleanAccess().getValueAssignment()); 
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
    // $ANTLR end ruleSchemeBoolean


    // $ANTLR start entryRuleSchemeList
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:858:1: entryRuleSchemeList : ruleSchemeList EOF ;
    public final void entryRuleSchemeList() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:859:1: ( ruleSchemeList EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:860:1: ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList1798);
            ruleSchemeList();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList1805); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:867:1: ruleSchemeList : ( ( rule__SchemeList__Group__0 ) ) ;
    public final void ruleSchemeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:871:5: ( ( ( rule__SchemeList__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:872:1: ( ( rule__SchemeList__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:872:1: ( ( rule__SchemeList__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:873:1: ( rule__SchemeList__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:874:1: ( rule__SchemeList__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:874:2: rule__SchemeList__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0_in_ruleSchemeList1835);
            rule__SchemeList__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getGroup()); 
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
    // $ANTLR end ruleSchemeList


    // $ANTLR start entryRuleSchemeBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:886:1: entryRuleSchemeBlock : ruleSchemeBlock EOF ;
    public final void entryRuleSchemeBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:887:1: ( ruleSchemeBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:888:1: ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1862);
            ruleSchemeBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock1869); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:895:1: ruleSchemeBlock : ( ( rule__SchemeBlock__Group__0 ) ) ;
    public final void ruleSchemeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:899:5: ( ( ( rule__SchemeBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:900:1: ( ( rule__SchemeBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:900:1: ( ( rule__SchemeBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:901:1: ( rule__SchemeBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:902:1: ( rule__SchemeBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:902:2: rule__SchemeBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0_in_ruleSchemeBlock1899);
            rule__SchemeBlock__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getGroup()); 
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
    // $ANTLR end ruleSchemeBlock


    // $ANTLR start entryRuleSchemeCharacter
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:914:1: entryRuleSchemeCharacter : ruleSchemeCharacter EOF ;
    public final void entryRuleSchemeCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:915:1: ( ruleSchemeCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:916:1: ruleSchemeCharacter EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter1926);
            ruleSchemeCharacter();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeCharacterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter1933); if (failed) return ;

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
    // $ANTLR end entryRuleSchemeCharacter


    // $ANTLR start ruleSchemeCharacter
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:923:1: ruleSchemeCharacter : ( ( rule__SchemeCharacter__Group__0 ) ) ;
    public final void ruleSchemeCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:927:5: ( ( ( rule__SchemeCharacter__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:928:1: ( ( rule__SchemeCharacter__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:928:1: ( ( rule__SchemeCharacter__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:929:1: ( rule__SchemeCharacter__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:1: ( rule__SchemeCharacter__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:2: rule__SchemeCharacter__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__0_in_ruleSchemeCharacter1963);
            rule__SchemeCharacter__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeCharacterAccess().getGroup()); 
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
    // $ANTLR end ruleSchemeCharacter


    // $ANTLR start entryRuleSchemeText
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:942:1: entryRuleSchemeText : ruleSchemeText EOF ;
    public final void entryRuleSchemeText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:943:1: ( ruleSchemeText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:944:1: ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText1990);
            ruleSchemeText();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText1997); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:951:1: ruleSchemeText : ( ( rule__SchemeText__ValueAssignment ) ) ;
    public final void ruleSchemeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:955:5: ( ( ( rule__SchemeText__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:956:1: ( ( rule__SchemeText__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:956:1: ( ( rule__SchemeText__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:957:1: ( rule__SchemeText__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:958:1: ( rule__SchemeText__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:958:2: rule__SchemeText__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText2027);
            rule__SchemeText__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextAccess().getValueAssignment()); 
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
    // $ANTLR end ruleSchemeText


    // $ANTLR start entryRuleSchemeTextLiterals
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:970:1: entryRuleSchemeTextLiterals : ruleSchemeTextLiterals EOF ;
    public final void entryRuleSchemeTextLiterals() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:971:1: ( ruleSchemeTextLiterals EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:972:1: ruleSchemeTextLiterals EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextLiteralsRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals2054);
            ruleSchemeTextLiterals();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextLiteralsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiterals2061); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:979:1: ruleSchemeTextLiterals : ( ( rule__SchemeTextLiterals__Alternatives ) ) ;
    public final void ruleSchemeTextLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:983:5: ( ( ( rule__SchemeTextLiterals__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:984:1: ( ( rule__SchemeTextLiterals__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:984:1: ( ( rule__SchemeTextLiterals__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:985:1: ( rule__SchemeTextLiterals__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextLiteralsAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:986:1: ( rule__SchemeTextLiterals__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:986:2: rule__SchemeTextLiterals__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeTextLiterals__Alternatives_in_ruleSchemeTextLiterals2091);
            rule__SchemeTextLiterals__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextLiteralsAccess().getAlternatives()); 
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
    // $ANTLR end ruleSchemeTextLiterals


    // $ANTLR start entryRuleSchemeNumber
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:998:1: entryRuleSchemeNumber : ruleSchemeNumber EOF ;
    public final void entryRuleSchemeNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1002:1: ( ruleSchemeNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1003:1: ruleSchemeNumber EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber2123);
            ruleSchemeNumber();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber2130); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1013:1: ruleSchemeNumber : ( ( rule__SchemeNumber__Group__0 ) ) ;
    public final void ruleSchemeNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1018:5: ( ( ( rule__SchemeNumber__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1019:1: ( ( rule__SchemeNumber__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1019:1: ( ( rule__SchemeNumber__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1020:1: ( rule__SchemeNumber__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1021:1: ( rule__SchemeNumber__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1021:2: rule__SchemeNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0_in_ruleSchemeNumber2164);
            rule__SchemeNumber__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleSchemeNumber


    // $ANTLR start entryRuleSchemeNumberRadix
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1034:1: entryRuleSchemeNumberRadix : ruleSchemeNumberRadix EOF ;
    public final void entryRuleSchemeNumberRadix() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1038:1: ( ruleSchemeNumberRadix EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1039:1: ruleSchemeNumberRadix EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix2196);
            ruleSchemeNumberRadix();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRadixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix2203); if (failed) return ;

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
    // $ANTLR end entryRuleSchemeNumberRadix


    // $ANTLR start ruleSchemeNumberRadix
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1049:1: ruleSchemeNumberRadix : ( ( rule__SchemeNumberRadix__Group__0 ) ) ;
    public final void ruleSchemeNumberRadix() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1054:5: ( ( ( rule__SchemeNumberRadix__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1055:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1055:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1056:1: ( rule__SchemeNumberRadix__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1057:1: ( rule__SchemeNumberRadix__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1057:2: rule__SchemeNumberRadix__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__0_in_ruleSchemeNumberRadix2237);
            rule__SchemeNumberRadix__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRadixAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleSchemeNumberRadix


    // $ANTLR start entryRuleSchemeMarkupCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1070:1: entryRuleSchemeMarkupCommand : ruleSchemeMarkupCommand EOF ;
    public final void entryRuleSchemeMarkupCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1074:1: ( ruleSchemeMarkupCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1075:1: ruleSchemeMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand2269);
            ruleSchemeMarkupCommand();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeMarkupCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand2276); if (failed) return ;

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
    // $ANTLR end entryRuleSchemeMarkupCommand


    // $ANTLR start ruleSchemeMarkupCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1085:1: ruleSchemeMarkupCommand : ( ( rule__SchemeMarkupCommand__Group__0 ) ) ;
    public final void ruleSchemeMarkupCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1090:5: ( ( ( rule__SchemeMarkupCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1091:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1091:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1092:1: ( rule__SchemeMarkupCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1093:1: ( rule__SchemeMarkupCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1093:2: rule__SchemeMarkupCommand__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__0_in_ruleSchemeMarkupCommand2310);
            rule__SchemeMarkupCommand__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeMarkupCommandAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleSchemeMarkupCommand


    // $ANTLR start entryRuleBOOL
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1106:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1107:1: ( ruleBOOL EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1108:1: ruleBOOL EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL2337);
            ruleBOOL();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBOOLRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL2344); if (failed) return ;

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
    // $ANTLR end entryRuleBOOL


    // $ANTLR start ruleBOOL
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1115:1: ruleBOOL : ( ( rule__BOOL__Group__0 ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1119:5: ( ( ( rule__BOOL__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1120:1: ( ( rule__BOOL__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1120:1: ( ( rule__BOOL__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1121:1: ( rule__BOOL__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1122:1: ( rule__BOOL__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1122:2: rule__BOOL__Group__0
            {
            pushFollow(FOLLOW_rule__BOOL__Group__0_in_ruleBOOL2374);
            rule__BOOL__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBOOLAccess().getGroup()); 
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
    // $ANTLR end ruleBOOL


    // $ANTLR start rule__ToplevelExpression__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1134:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );
    public final void rule__ToplevelExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1138:1: ( ( ruleAssignment ) | ( ruleCommonExpression ) )
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
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1134:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 1, input);

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
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1134:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_23:
            case KEYWORD_25:
            case KEYWORD_1:
            case KEYWORD_2:
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
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt2=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1134:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1139:1: ( ruleAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1139:1: ( ruleAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1140:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__ToplevelExpression__Alternatives2410);
                    ruleAssignment();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1145:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1145:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1146:1: ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getToplevelExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_rule__ToplevelExpression__Alternatives2427);
                    ruleCommonExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getToplevelExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end rule__ToplevelExpression__Alternatives


    // $ANTLR start rule__Expression__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1156:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1160:1: ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) )
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
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1156:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 1, input);

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
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1156:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_23:
            case KEYWORD_25:
            case KEYWORD_1:
            case KEYWORD_2:
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
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1156:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1161:1: ( rulePropertyAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1161:1: ( rulePropertyAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1162:1: rulePropertyAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_rule__Expression__Alternatives2459);
                    rulePropertyAssignment();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1167:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1167:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1168:1: ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_rule__Expression__Alternatives2476);
                    ruleCommonExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }

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


    // $ANTLR start rule__CommonExpression__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1178:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__CommonExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1182:1: ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
                {
                alt4=1;
                }
                break;
            case KEYWORD_23:
            case KEYWORD_16:
                {
                alt4=2;
                }
                break;
            case KEYWORD_2:
                {
                alt4=3;
                }
                break;
            case KEYWORD_25:
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
            case KEYWORD_14:
            case KEYWORD_18:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
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
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1178:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1183:1: ( ruleCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1183:1: ( ruleCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1184:1: ruleCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCommand_in_rule__CommonExpression__Alternatives2508);
                    ruleCommand();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getCommonExpressionAccess().getCommandParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1189:6: ( ruleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1189:6: ( ruleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1190:1: ruleBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__CommonExpression__Alternatives2525);
                    ruleBlock();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getCommonExpressionAccess().getBlockParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1195:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1195:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1196:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getSchemeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__CommonExpression__Alternatives2542);
                    ruleScheme();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getCommonExpressionAccess().getSchemeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1201:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1201:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1202:1: ruleText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__CommonExpression__Alternatives2559);
                    ruleText();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1207:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1207:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1208:1: ruleNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getNumberParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumber_in_rule__CommonExpression__Alternatives2576);
                    ruleNumber();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getCommonExpressionAccess().getNumberParserRuleCall_4()); 
                    }

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
    // $ANTLR end rule__CommonExpression__Alternatives


    // $ANTLR start rule__Assignment__NameAlternatives_0_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1218:1: rule__Assignment__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Assignment__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1222:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1218:1: rule__Assignment__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1223:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1223:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1224:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__NameAlternatives_0_02608); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1229:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1229:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1230:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assignment__NameAlternatives_0_02625); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    }

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
    // $ANTLR end rule__Assignment__NameAlternatives_0_0


    // $ANTLR start rule__PropertyAssignment__IdAlternatives_0_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1240:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__PropertyAssignment__IdAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1244:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1240:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1245:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1245:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1246:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPropertyAssignmentAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyAssignment__IdAlternatives_0_02657); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPropertyAssignmentAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1251:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1251:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1252:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPropertyAssignmentAccess().getIdSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertyAssignment__IdAlternatives_0_02674); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPropertyAssignmentAccess().getIdSTRINGTerminalRuleCall_0_0_1()); 
                    }

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
    // $ANTLR end rule__PropertyAssignment__IdAlternatives_0_0


    // $ANTLR start rule__Block__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1262:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1266:1: ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_16) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_23) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1262:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1267:1: ( ruleSimpleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1267:1: ( ruleSimpleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1268:1: ruleSimpleBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives2706);
                    ruleSimpleBlock();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1273:6: ( ruleSimultaneousBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1273:6: ( ruleSimultaneousBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1274:1: ruleSimultaneousBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives2723);
                    ruleSimultaneousBlock();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                    }

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


    // $ANTLR start rule__Command__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1284:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1288:1: ( ( ruleSpecialCommand ) | ( ruleReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_13) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=KEYWORD_29 && LA8_1<=KEYWORD_26)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==KEYWORD_1||(LA8_1>=KEYWORD_5 && LA8_1<=KEYWORD_7)||LA8_1==KEYWORD_9||(LA8_1>=KEYWORD_11 && LA8_1<=KEYWORD_12)||LA8_1==KEYWORD_14||LA8_1==KEYWORD_18||LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1284:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1284:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1289:1: ( ruleSpecialCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1289:1: ( ruleSpecialCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1290:1: ruleSpecialCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives2755);
                    ruleSpecialCommand();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1295:6: ( ruleReference )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1295:6: ( ruleReference )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1296:1: ruleReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReference_in_rule__Command__Alternatives2772);
                    ruleReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1()); 
                    }

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


    // $ANTLR start rule__SpecialCommand__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1306:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) );
    public final void rule__SpecialCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1310:1: ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_13) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_26:
                    {
                    alt9=3;
                    }
                    break;
                case KEYWORD_29:
                    {
                    alt9=4;
                    }
                    break;
                case KEYWORD_27:
                    {
                    alt9=1;
                    }
                    break;
                case KEYWORD_28:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1306:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1306:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1311:1: ( ruleInclude )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1311:1: ( ruleInclude )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1312:1: ruleInclude
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives2804);
                    ruleInclude();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1317:6: ( ruleVersion )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1317:6: ( ruleVersion )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1318:1: ruleVersion
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives2821);
                    ruleVersion();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1323:6: ( ruleMarkup )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1323:6: ( ruleMarkup )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1324:1: ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_rule__SpecialCommand__Alternatives2838);
                    ruleMarkup();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1329:6: ( ruleMarkupLines )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1329:6: ( ruleMarkupLines )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1330:1: ruleMarkupLines
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_rule__SpecialCommand__Alternatives2855);
                    ruleMarkupLines();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_3()); 
                    }

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


    // $ANTLR start rule__MarkupExpression__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1340:1: rule__MarkupExpression__Alternatives : ( ( ruleMarkupCommand ) | ( ruleMarkupBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__MarkupExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1344:1: ( ( ruleMarkupCommand ) | ( ruleMarkupBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
                {
                alt10=1;
                }
                break;
            case KEYWORD_16:
                {
                alt10=2;
                }
                break;
            case KEYWORD_2:
                {
                alt10=3;
                }
                break;
            case KEYWORD_25:
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
            case KEYWORD_14:
            case KEYWORD_18:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt10=4;
                }
                break;
            case RULE_INT:
                {
                alt10=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1340:1: rule__MarkupExpression__Alternatives : ( ( ruleMarkupCommand ) | ( ruleMarkupBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1345:1: ( ruleMarkupCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1345:1: ( ruleMarkupCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1346:1: ruleMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getMarkupCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMarkupCommand_in_rule__MarkupExpression__Alternatives2887);
                    ruleMarkupCommand();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMarkupExpressionAccess().getMarkupCommandParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1351:6: ( ruleMarkupBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1351:6: ( ruleMarkupBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1352:1: ruleMarkupBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getMarkupBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleMarkupBlock_in_rule__MarkupExpression__Alternatives2904);
                    ruleMarkupBlock();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMarkupExpressionAccess().getMarkupBlockParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1357:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1357:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1358:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getSchemeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__MarkupExpression__Alternatives2921);
                    ruleScheme();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMarkupExpressionAccess().getSchemeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1363:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1363:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1364:1: ruleText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__MarkupExpression__Alternatives2938);
                    ruleText();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMarkupExpressionAccess().getTextParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1369:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1369:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1370:1: ruleNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getNumberParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumber_in_rule__MarkupExpression__Alternatives2955);
                    ruleNumber();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMarkupExpressionAccess().getNumberParserRuleCall_4()); 
                    }

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
    // $ANTLR end rule__MarkupExpression__Alternatives


    // $ANTLR start rule__ReferenceName__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1380:1: rule__ReferenceName__Alternatives : ( ( RULE_ID ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleSpecialCharacter ) );
    public final void rule__ReferenceName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1384:1: ( ( RULE_ID ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleSpecialCharacter ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case KEYWORD_5:
                {
                alt11=2;
                }
                break;
            case KEYWORD_6:
                {
                alt11=3;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
                {
                alt11=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1380:1: rule__ReferenceName__Alternatives : ( ( RULE_ID ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleSpecialCharacter ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1385:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1385:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1386:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getReferenceNameAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceName__Alternatives2987); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getReferenceNameAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1391:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1391:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1392:1: KEYWORD_5
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getReferenceNameAccess().getLeftParenthesisKeyword_1()); 
                    }
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__ReferenceName__Alternatives3005); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getReferenceNameAccess().getLeftParenthesisKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1399:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1399:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1400:1: KEYWORD_6
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getReferenceNameAccess().getRightParenthesisKeyword_2()); 
                    }
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__ReferenceName__Alternatives3025); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getReferenceNameAccess().getRightParenthesisKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1407:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1407:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1408:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getReferenceNameAccess().getSpecialCharacterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__ReferenceName__Alternatives3044);
                    ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getReferenceNameAccess().getSpecialCharacterParserRuleCall_3()); 
                    }

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
    // $ANTLR end rule__ReferenceName__Alternatives


    // $ANTLR start rule__SpecialCharacter__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1418:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_11 ) | ( KEYWORD_12 ) | ( KEYWORD_14 ) | ( KEYWORD_18 ) );
    public final void rule__SpecialCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1422:1: ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_11 ) | ( KEYWORD_12 ) | ( KEYWORD_14 ) | ( KEYWORD_18 ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
                {
                alt12=1;
                }
                break;
            case KEYWORD_7:
                {
                alt12=2;
                }
                break;
            case KEYWORD_9:
                {
                alt12=3;
                }
                break;
            case KEYWORD_11:
                {
                alt12=4;
                }
                break;
            case KEYWORD_12:
                {
                alt12=5;
                }
                break;
            case KEYWORD_14:
                {
                alt12=6;
                }
                break;
            case KEYWORD_18:
                {
                alt12=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1418:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_11 ) | ( KEYWORD_12 ) | ( KEYWORD_14 ) | ( KEYWORD_18 ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1423:1: ( KEYWORD_1 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1423:1: ( KEYWORD_1 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1424:1: KEYWORD_1
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__SpecialCharacter__Alternatives3077); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1431:6: ( KEYWORD_7 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1431:6: ( KEYWORD_7 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1432:1: KEYWORD_7
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1()); 
                    }
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__SpecialCharacter__Alternatives3097); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1439:6: ( KEYWORD_9 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1439:6: ( KEYWORD_9 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1440:1: KEYWORD_9
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__SpecialCharacter__Alternatives3117); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1447:6: ( KEYWORD_11 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1447:6: ( KEYWORD_11 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1448:1: KEYWORD_11
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3()); 
                    }
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__SpecialCharacter__Alternatives3137); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1455:6: ( KEYWORD_12 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1455:6: ( KEYWORD_12 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1456:1: KEYWORD_12
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4()); 
                    }
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__SpecialCharacter__Alternatives3157); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1463:6: ( KEYWORD_14 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1463:6: ( KEYWORD_14 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1464:1: KEYWORD_14
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5()); 
                    }
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__SpecialCharacter__Alternatives3177); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1471:6: ( KEYWORD_18 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1471:6: ( KEYWORD_18 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1472:1: KEYWORD_18
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getTildeKeyword_6()); 
                    }
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__SpecialCharacter__Alternatives3197); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getTildeKeyword_6()); 
                    }

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
    // $ANTLR end rule__SpecialCharacter__Alternatives


    // $ANTLR start rule__Text__ValueAlternatives_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1484:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) );
    public final void rule__Text__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1488:1: ( ( ruleSchemeTextLiterals ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case KEYWORD_25:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt13=1;
                }
                break;
            case KEYWORD_5:
                {
                alt13=2;
                }
                break;
            case KEYWORD_6:
                {
                alt13=3;
                }
                break;
            case KEYWORD_4:
                {
                alt13=4;
                }
                break;
            case KEYWORD_8:
                {
                alt13=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1484:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1489:1: ( ruleSchemeTextLiterals )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1489:1: ( ruleSchemeTextLiterals )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1490:1: ruleSchemeTextLiterals
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_03231);
                    ruleSchemeTextLiterals();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1495:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1495:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1496:1: KEYWORD_5
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1()); 
                    }
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Text__ValueAlternatives_03249); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1503:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1503:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1504:1: KEYWORD_6
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2()); 
                    }
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Text__ValueAlternatives_03269); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1511:6: ( KEYWORD_4 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1511:6: ( KEYWORD_4 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1512:1: KEYWORD_4
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3()); 
                    }
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__Text__ValueAlternatives_03289); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1519:6: ( KEYWORD_8 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1519:6: ( KEYWORD_8 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1520:1: KEYWORD_8
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueCommaKeyword_0_4()); 
                    }
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__Text__ValueAlternatives_03309); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueCommaKeyword_0_4()); 
                    }

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


    // $ANTLR start rule__SchemeExpression__Alternatives_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );
    public final void rule__SchemeExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1536:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case KEYWORD_4:
                {
                alt17=1;
                }
                break;
            case KEYWORD_2:
                {
                int LA17_2 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                int LA17_3 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_21:
                {
                int LA17_4 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_20:
                {
                int LA17_5 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 5, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_25:
                {
                int LA17_6 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 6, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_10:
                {
                int LA17_7 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 7, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_1:
                {
                int LA17_8 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 8, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_7:
                {
                int LA17_9 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 9, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_9:
                {
                int LA17_10 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 10, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_11:
                {
                int LA17_11 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 11, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_12:
                {
                int LA17_12 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 12, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_14:
                {
                int LA17_13 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 13, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_18:
                {
                int LA17_14 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 14, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA17_15 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 15, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA17_16 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 16, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ANY_OTHER:
                {
                int LA17_17 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 17, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA17_18 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 18, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_19:
                {
                int LA17_19 = input.LA(2);

                if ( (synpred33()) ) {
                    alt17=1;
                }
                else if ( (synpred35()) ) {
                    alt17=2;
                }
                else if ( (synpred37()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 19, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_15:
                {
                alt17=2;
                }
                break;
            case KEYWORD_8:
                {
                alt17=3;
                }
                break;
            case KEYWORD_3:
                {
                alt17=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1532:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1537:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1537:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1538:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1539:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==KEYWORD_4) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1539:2: rule__SchemeExpression__QuotedAssignment_0_0
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_rule__SchemeExpression__Alternatives_03343);
                            rule__SchemeExpression__QuotedAssignment_0_0();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1543:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1543:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1544:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1545:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==KEYWORD_15) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1545:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_rule__SchemeExpression__Alternatives_03362);
                            rule__SchemeExpression__QuasiquotedAssignment_0_1();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1549:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1549:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1550:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1551:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==KEYWORD_8) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1551:2: rule__SchemeExpression__UnquotedAssignment_0_2
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_rule__SchemeExpression__Alternatives_03381);
                            rule__SchemeExpression__UnquotedAssignment_0_2();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 ) )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 ) )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1556:1: ( rule__SchemeExpression__VariableAssignment_0_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getVariableAssignment_0_3()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1557:1: ( rule__SchemeExpression__VariableAssignment_0_3 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1557:2: rule__SchemeExpression__VariableAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__SchemeExpression__VariableAssignment_0_3_in_rule__SchemeExpression__Alternatives_03400);
                    rule__SchemeExpression__VariableAssignment_0_3();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeExpressionAccess().getVariableAssignment_0_3()); 
                    }

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
    // $ANTLR end rule__SchemeExpression__Alternatives_0


    // $ANTLR start rule__SchemeValue__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1566:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );
    public final void rule__SchemeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1570:1: ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID) ) {
                    int LA18_8 = input.LA(3);

                    if ( (synpred38()) ) {
                        alt18=1;
                    }
                    else if ( (synpred43()) ) {
                        alt18=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1566:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 18, 8, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1==KEYWORD_5) ) {
                    alt18=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1566:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                alt18=2;
                }
                break;
            case KEYWORD_21:
                {
                alt18=3;
                }
                break;
            case KEYWORD_20:
                {
                alt18=4;
                }
                break;
            case KEYWORD_25:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt18=5;
                }
                break;
            case RULE_INT:
                {
                alt18=6;
                }
                break;
            case KEYWORD_19:
                {
                alt18=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1566:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1571:1: ( ruleSchemeBoolean )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1571:1: ( ruleSchemeBoolean )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1572:1: ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives3433);
                    ruleSchemeBoolean();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:6: ( ruleSchemeList )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:6: ( ruleSchemeList )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1578:1: ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives3450);
                    ruleSchemeList();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1583:6: ( ruleSchemeBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1583:6: ( ruleSchemeBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1584:1: ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives3467);
                    ruleSchemeBlock();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1589:6: ( ruleSchemeCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1589:6: ( ruleSchemeCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1590:1: ruleSchemeCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_rule__SchemeValue__Alternatives3484);
                    ruleSchemeCharacter();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1595:6: ( ruleSchemeText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1595:6: ( ruleSchemeText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1596:1: ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives3501);
                    ruleSchemeText();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:6: ( ruleSchemeNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:6: ( ruleSchemeNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1602:1: ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives3518);
                    ruleSchemeNumber();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1607:6: ( ruleSchemeMarkupCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1607:6: ( ruleSchemeMarkupCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1608:1: ruleSchemeMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_rule__SchemeValue__Alternatives3535);
                    ruleSchemeMarkupCommand();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6()); 
                    }

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


    // $ANTLR start rule__SchemeCharacter__ValueAlternatives_1_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1618:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeCharacter__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1622:1: ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
                {
                alt19=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt19=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1618:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1623:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1623:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1624:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeCharacter__ValueAlternatives_1_03567); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeCharacterAccess().getValueIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1629:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1629:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1630:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeCharacter__ValueAlternatives_1_03584);
                    ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1635:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1635:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1636:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueANY_OTHERTerminalRuleCall_1_0_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeCharacter__ValueAlternatives_1_03601); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeCharacterAccess().getValueANY_OTHERTerminalRuleCall_1_0_2()); 
                    }

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
    // $ANTLR end rule__SchemeCharacter__ValueAlternatives_1_0


    // $ANTLR start rule__SchemeTextLiterals__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1646:1: rule__SchemeTextLiterals__Alternatives : ( ( KEYWORD_25 ) | ( KEYWORD_10 ) | ( ruleSpecialCharacter ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeTextLiterals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1650:1: ( ( KEYWORD_25 ) | ( KEYWORD_10 ) | ( ruleSpecialCharacter ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case KEYWORD_25:
                {
                alt20=1;
                }
                break;
            case KEYWORD_10:
                {
                alt20=2;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
                {
                alt20=3;
                }
                break;
            case RULE_ID:
                {
                alt20=4;
                }
                break;
            case RULE_STRING:
                {
                alt20=5;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt20=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1646:1: rule__SchemeTextLiterals__Alternatives : ( ( KEYWORD_25 ) | ( KEYWORD_10 ) | ( ruleSpecialCharacter ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1651:1: ( KEYWORD_25 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1651:1: ( KEYWORD_25 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1652:1: KEYWORD_25
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }
                    match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__SchemeTextLiterals__Alternatives3634); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1659:6: ( KEYWORD_10 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1659:6: ( KEYWORD_10 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1660:1: KEYWORD_10
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__SchemeTextLiterals__Alternatives3654); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1667:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1667:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1668:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getSpecialCharacterParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiterals__Alternatives3673);
                    ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getSpecialCharacterParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1673:6: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1673:6: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1674:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_3()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives3690); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1679:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1679:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1680:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_4()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives3707); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1685:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1685:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1686:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_5()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives3724); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_5()); 
                    }

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


    // $ANTLR start rule__Assignment__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1698:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1702:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1703:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03754);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03757);
            rule__Assignment__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__0


    // $ANTLR start rule__Assignment__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1710:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1714:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1715:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1715:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1716:1: ( rule__Assignment__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1717:1: ( rule__Assignment__NameAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1717:2: rule__Assignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl3784);
            rule__Assignment__NameAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
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
    // $ANTLR end rule__Assignment__Group__0__Impl


    // $ANTLR start rule__Assignment__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1727:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1731:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1732:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13814);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13817);
            rule__Assignment__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__1


    // $ANTLR start rule__Assignment__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1739:1: rule__Assignment__Group__1__Impl : ( KEYWORD_10 ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1743:1: ( ( KEYWORD_10 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1744:1: ( KEYWORD_10 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1744:1: ( KEYWORD_10 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1745:1: KEYWORD_10
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__Assignment__Group__1__Impl3845); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end rule__Assignment__Group__1__Impl


    // $ANTLR start rule__Assignment__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1758:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1762:1: ( rule__Assignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1763:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__23876);
            rule__Assignment__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__2


    // $ANTLR start rule__Assignment__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1769:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1773:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1774:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1774:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1775:1: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1776:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1776:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl3903);
            rule__Assignment__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
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
    // $ANTLR end rule__Assignment__Group__2__Impl


    // $ANTLR start rule__PropertyAssignment__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1792:1: rule__PropertyAssignment__Group__0 : rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 ;
    public final void rule__PropertyAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1796:1: ( rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1797:2: rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__03939);
            rule__PropertyAssignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__03942);
            rule__PropertyAssignment__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyAssignment__Group__0


    // $ANTLR start rule__PropertyAssignment__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1804:1: rule__PropertyAssignment__Group__0__Impl : ( ( rule__PropertyAssignment__IdAssignment_0 ) ) ;
    public final void rule__PropertyAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1808:1: ( ( ( rule__PropertyAssignment__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1809:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1809:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1810:1: ( rule__PropertyAssignment__IdAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1811:1: ( rule__PropertyAssignment__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1811:2: rule__PropertyAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl3969);
            rule__PropertyAssignment__IdAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPropertyAssignmentAccess().getIdAssignment_0()); 
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
    // $ANTLR end rule__PropertyAssignment__Group__0__Impl


    // $ANTLR start rule__PropertyAssignment__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1821:1: rule__PropertyAssignment__Group__1 : rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 ;
    public final void rule__PropertyAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1825:1: ( rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1826:2: rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__13999);
            rule__PropertyAssignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__14002);
            rule__PropertyAssignment__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyAssignment__Group__1


    // $ANTLR start rule__PropertyAssignment__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1833:1: rule__PropertyAssignment__Group__1__Impl : ( KEYWORD_10 ) ;
    public final void rule__PropertyAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1837:1: ( ( KEYWORD_10 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1838:1: ( KEYWORD_10 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1838:1: ( KEYWORD_10 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1839:1: KEYWORD_10
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__PropertyAssignment__Group__1__Impl4030); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end rule__PropertyAssignment__Group__1__Impl


    // $ANTLR start rule__PropertyAssignment__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1852:1: rule__PropertyAssignment__Group__2 : rule__PropertyAssignment__Group__2__Impl ;
    public final void rule__PropertyAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1856:1: ( rule__PropertyAssignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1857:2: rule__PropertyAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__24061);
            rule__PropertyAssignment__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyAssignment__Group__2


    // $ANTLR start rule__PropertyAssignment__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1863:1: rule__PropertyAssignment__Group__2__Impl : ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) ;
    public final void rule__PropertyAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1867:1: ( ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1868:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1868:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1869:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1870:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1870:2: rule__PropertyAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl4088);
            rule__PropertyAssignment__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPropertyAssignmentAccess().getValueAssignment_2()); 
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
    // $ANTLR end rule__PropertyAssignment__Group__2__Impl


    // $ANTLR start rule__SimpleBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1886:1: rule__SimpleBlock__Group__0 : rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 ;
    public final void rule__SimpleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1890:1: ( rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1891:2: rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__04124);
            rule__SimpleBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__04127);
            rule__SimpleBlock__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1898:1: rule__SimpleBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimpleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1902:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1903:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1903:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1904:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1905:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1907:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            }

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1917:1: rule__SimpleBlock__Group__1 : rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 ;
    public final void rule__SimpleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1921:1: ( rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1922:2: rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__14185);
            rule__SimpleBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__14188);
            rule__SimpleBlock__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1929:1: rule__SimpleBlock__Group__1__Impl : ( KEYWORD_16 ) ;
    public final void rule__SimpleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1933:1: ( ( KEYWORD_16 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1934:1: ( KEYWORD_16 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1934:1: ( KEYWORD_16 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1935:1: KEYWORD_16
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__SimpleBlock__Group__1__Impl4216); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end rule__SimpleBlock__Group__1__Impl


    // $ANTLR start rule__SimpleBlock__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1948:1: rule__SimpleBlock__Group__2 : rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 ;
    public final void rule__SimpleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1952:1: ( rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1953:2: rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__24247);
            rule__SimpleBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__24250);
            rule__SimpleBlock__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1960:1: rule__SimpleBlock__Group__2__Impl : ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimpleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1964:1: ( ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1965:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1965:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1966:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1967:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==KEYWORD_23||(LA21_0>=KEYWORD_25 && LA21_0<=KEYWORD_2)||(LA21_0>=KEYWORD_4 && LA21_0<=KEYWORD_14)||LA21_0==KEYWORD_16||(LA21_0>=KEYWORD_18 && LA21_0<=RULE_ID)||LA21_0==RULE_ANY_OTHER) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1967:2: rule__SimpleBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl4277);
            	    rule__SimpleBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
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
    // $ANTLR end rule__SimpleBlock__Group__2__Impl


    // $ANTLR start rule__SimpleBlock__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1977:1: rule__SimpleBlock__Group__3 : rule__SimpleBlock__Group__3__Impl ;
    public final void rule__SimpleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1981:1: ( rule__SimpleBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1982:2: rule__SimpleBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__34308);
            rule__SimpleBlock__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1988:1: rule__SimpleBlock__Group__3__Impl : ( KEYWORD_17 ) ;
    public final void rule__SimpleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1992:1: ( ( KEYWORD_17 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1993:1: ( KEYWORD_17 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1993:1: ( KEYWORD_17 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1994:1: KEYWORD_17
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__SimpleBlock__Group__3__Impl4336); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end rule__SimpleBlock__Group__3__Impl


    // $ANTLR start rule__SimultaneousBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2015:1: rule__SimultaneousBlock__Group__0 : rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 ;
    public final void rule__SimultaneousBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2019:1: ( rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2020:2: rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__04375);
            rule__SimultaneousBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__04378);
            rule__SimultaneousBlock__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2027:1: rule__SimultaneousBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimultaneousBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2031:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2032:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2032:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2033:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2034:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2036:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            }

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2046:1: rule__SimultaneousBlock__Group__1 : rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 ;
    public final void rule__SimultaneousBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2050:1: ( rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2051:2: rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__14436);
            rule__SimultaneousBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__14439);
            rule__SimultaneousBlock__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2058:1: rule__SimultaneousBlock__Group__1__Impl : ( KEYWORD_23 ) ;
    public final void rule__SimultaneousBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2062:1: ( ( KEYWORD_23 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2063:1: ( KEYWORD_23 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2063:1: ( KEYWORD_23 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2064:1: KEYWORD_23
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
            }
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__SimultaneousBlock__Group__1__Impl4467); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
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
    // $ANTLR end rule__SimultaneousBlock__Group__1__Impl


    // $ANTLR start rule__SimultaneousBlock__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2077:1: rule__SimultaneousBlock__Group__2 : rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 ;
    public final void rule__SimultaneousBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2081:1: ( rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2082:2: rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__24498);
            rule__SimultaneousBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__24501);
            rule__SimultaneousBlock__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2089:1: rule__SimultaneousBlock__Group__2__Impl : ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimultaneousBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2093:1: ( ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2094:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2094:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2095:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2096:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_23||(LA22_0>=KEYWORD_25 && LA22_0<=KEYWORD_2)||(LA22_0>=KEYWORD_4 && LA22_0<=KEYWORD_14)||LA22_0==KEYWORD_16||(LA22_0>=KEYWORD_18 && LA22_0<=RULE_ID)||LA22_0==RULE_ANY_OTHER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2096:2: rule__SimultaneousBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl4528);
            	    rule__SimultaneousBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
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
    // $ANTLR end rule__SimultaneousBlock__Group__2__Impl


    // $ANTLR start rule__SimultaneousBlock__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2106:1: rule__SimultaneousBlock__Group__3 : rule__SimultaneousBlock__Group__3__Impl ;
    public final void rule__SimultaneousBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2110:1: ( rule__SimultaneousBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2111:2: rule__SimultaneousBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__34559);
            rule__SimultaneousBlock__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2117:1: rule__SimultaneousBlock__Group__3__Impl : ( KEYWORD_24 ) ;
    public final void rule__SimultaneousBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2121:1: ( ( KEYWORD_24 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2122:1: ( KEYWORD_24 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2122:1: ( KEYWORD_24 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2123:1: KEYWORD_24
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            }
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__SimultaneousBlock__Group__3__Impl4587); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
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
    // $ANTLR end rule__SimultaneousBlock__Group__3__Impl


    // $ANTLR start rule__Include__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2144:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2148:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2149:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__04626);
            rule__Include__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__04629);
            rule__Include__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2156:1: rule__Include__Group__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2160:1: ( ( KEYWORD_13 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2161:1: ( KEYWORD_13 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2161:1: ( KEYWORD_13 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2162:1: KEYWORD_13
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__Include__Group__0__Impl4657); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__Include__Group__0__Impl


    // $ANTLR start rule__Include__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2175:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2179:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2180:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__14688);
            rule__Include__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__14691);
            rule__Include__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2187:1: rule__Include__Group__1__Impl : ( KEYWORD_27 ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2191:1: ( ( KEYWORD_27 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2192:1: ( KEYWORD_27 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2192:1: ( KEYWORD_27 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2193:1: KEYWORD_27
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeKeyword_1()); 
            }
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__Include__Group__1__Impl4719); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getIncludeKeyword_1()); 
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
    // $ANTLR end rule__Include__Group__1__Impl


    // $ANTLR start rule__Include__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2206:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2210:1: ( rule__Include__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2211:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__24750);
            rule__Include__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Include__Group__2


    // $ANTLR start rule__Include__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2217:1: rule__Include__Group__2__Impl : ( ( rule__Include__ImportURIAssignment_2 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2221:1: ( ( ( rule__Include__ImportURIAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2222:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2222:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2223:1: ( rule__Include__ImportURIAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURIAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2224:1: ( rule__Include__ImportURIAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2224:2: rule__Include__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl4777);
            rule__Include__ImportURIAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getImportURIAssignment_2()); 
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
    // $ANTLR end rule__Include__Group__2__Impl


    // $ANTLR start rule__Version__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2240:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2244:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2245:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__04813);
            rule__Version__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__04816);
            rule__Version__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2252:1: rule__Version__Group__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2256:1: ( ( KEYWORD_13 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:1: ( KEYWORD_13 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:1: ( KEYWORD_13 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2258:1: KEYWORD_13
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__Version__Group__0__Impl4844); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__Version__Group__0__Impl


    // $ANTLR start rule__Version__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2271:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2275:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2276:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__14875);
            rule__Version__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__2_in_rule__Version__Group__14878);
            rule__Version__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2283:1: rule__Version__Group__1__Impl : ( KEYWORD_28 ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2287:1: ( ( KEYWORD_28 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2288:1: ( KEYWORD_28 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2288:1: ( KEYWORD_28 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2289:1: KEYWORD_28
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
            }
            match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__Version__Group__1__Impl4906); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
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
    // $ANTLR end rule__Version__Group__1__Impl


    // $ANTLR start rule__Version__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2302:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2306:1: ( rule__Version__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2307:2: rule__Version__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__24937);
            rule__Version__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Version__Group__2


    // $ANTLR start rule__Version__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: rule__Version__Group__2__Impl : ( ( rule__Version__VersionAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2317:1: ( ( ( rule__Version__VersionAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2318:1: ( ( rule__Version__VersionAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2318:1: ( ( rule__Version__VersionAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2319:1: ( rule__Version__VersionAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2320:1: ( rule__Version__VersionAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2320:2: rule__Version__VersionAssignment_2
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_2_in_rule__Version__Group__2__Impl4964);
            rule__Version__VersionAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getVersionAssignment_2()); 
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
    // $ANTLR end rule__Version__Group__2__Impl


    // $ANTLR start rule__Markup__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2336:1: rule__Markup__Group__0 : rule__Markup__Group__0__Impl rule__Markup__Group__1 ;
    public final void rule__Markup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2340:1: ( rule__Markup__Group__0__Impl rule__Markup__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2341:2: rule__Markup__Group__0__Impl rule__Markup__Group__1
            {
            pushFollow(FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__05000);
            rule__Markup__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__05003);
            rule__Markup__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Markup__Group__0


    // $ANTLR start rule__Markup__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2348:1: rule__Markup__Group__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__Markup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2352:1: ( ( KEYWORD_13 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2353:1: ( KEYWORD_13 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2353:1: ( KEYWORD_13 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2354:1: KEYWORD_13
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__Markup__Group__0__Impl5031); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__Markup__Group__0__Impl


    // $ANTLR start rule__Markup__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2367:1: rule__Markup__Group__1 : rule__Markup__Group__1__Impl rule__Markup__Group__2 ;
    public final void rule__Markup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2371:1: ( rule__Markup__Group__1__Impl rule__Markup__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2372:2: rule__Markup__Group__1__Impl rule__Markup__Group__2
            {
            pushFollow(FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__15062);
            rule__Markup__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__2_in_rule__Markup__Group__15065);
            rule__Markup__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Markup__Group__1


    // $ANTLR start rule__Markup__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2379:1: rule__Markup__Group__1__Impl : ( KEYWORD_26 ) ;
    public final void rule__Markup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2383:1: ( ( KEYWORD_26 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ( KEYWORD_26 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ( KEYWORD_26 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2385:1: KEYWORD_26
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getMarkupKeyword_1()); 
            }
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__Markup__Group__1__Impl5093); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getMarkupKeyword_1()); 
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
    // $ANTLR end rule__Markup__Group__1__Impl


    // $ANTLR start rule__Markup__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2398:1: rule__Markup__Group__2 : rule__Markup__Group__2__Impl ;
    public final void rule__Markup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2402:1: ( rule__Markup__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2403:2: rule__Markup__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Markup__Group__2__Impl_in_rule__Markup__Group__25124);
            rule__Markup__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Markup__Group__2


    // $ANTLR start rule__Markup__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2409:1: rule__Markup__Group__2__Impl : ( ( rule__Markup__BlockAssignment_2 ) ) ;
    public final void rule__Markup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2413:1: ( ( ( rule__Markup__BlockAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2414:1: ( ( rule__Markup__BlockAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2414:1: ( ( rule__Markup__BlockAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:1: ( rule__Markup__BlockAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBlockAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2416:1: ( rule__Markup__BlockAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2416:2: rule__Markup__BlockAssignment_2
            {
            pushFollow(FOLLOW_rule__Markup__BlockAssignment_2_in_rule__Markup__Group__2__Impl5151);
            rule__Markup__BlockAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getBlockAssignment_2()); 
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
    // $ANTLR end rule__Markup__Group__2__Impl


    // $ANTLR start rule__MarkupLines__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2432:1: rule__MarkupLines__Group__0 : rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1 ;
    public final void rule__MarkupLines__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2436:1: ( rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2437:2: rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__0__Impl_in_rule__MarkupLines__Group__05187);
            rule__MarkupLines__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupLines__Group__1_in_rule__MarkupLines__Group__05190);
            rule__MarkupLines__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupLines__Group__0


    // $ANTLR start rule__MarkupLines__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2444:1: rule__MarkupLines__Group__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__MarkupLines__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2448:1: ( ( KEYWORD_13 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2449:1: ( KEYWORD_13 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2449:1: ( KEYWORD_13 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2450:1: KEYWORD_13
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__MarkupLines__Group__0__Impl5218); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__MarkupLines__Group__0__Impl


    // $ANTLR start rule__MarkupLines__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2463:1: rule__MarkupLines__Group__1 : rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2 ;
    public final void rule__MarkupLines__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2467:1: ( rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2468:2: rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__1__Impl_in_rule__MarkupLines__Group__15249);
            rule__MarkupLines__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupLines__Group__2_in_rule__MarkupLines__Group__15252);
            rule__MarkupLines__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupLines__Group__1


    // $ANTLR start rule__MarkupLines__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2475:1: rule__MarkupLines__Group__1__Impl : ( KEYWORD_29 ) ;
    public final void rule__MarkupLines__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2479:1: ( ( KEYWORD_29 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2480:1: ( KEYWORD_29 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2480:1: ( KEYWORD_29 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2481:1: KEYWORD_29
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getMarkuplinesKeyword_1()); 
            }
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__MarkupLines__Group__1__Impl5280); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupLinesAccess().getMarkuplinesKeyword_1()); 
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
    // $ANTLR end rule__MarkupLines__Group__1__Impl


    // $ANTLR start rule__MarkupLines__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2494:1: rule__MarkupLines__Group__2 : rule__MarkupLines__Group__2__Impl ;
    public final void rule__MarkupLines__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2498:1: ( rule__MarkupLines__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2499:2: rule__MarkupLines__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__2__Impl_in_rule__MarkupLines__Group__25311);
            rule__MarkupLines__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupLines__Group__2


    // $ANTLR start rule__MarkupLines__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2505:1: rule__MarkupLines__Group__2__Impl : ( ( rule__MarkupLines__BlockAssignment_2 ) ) ;
    public final void rule__MarkupLines__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2509:1: ( ( ( rule__MarkupLines__BlockAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2510:1: ( ( rule__MarkupLines__BlockAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2510:1: ( ( rule__MarkupLines__BlockAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2511:1: ( rule__MarkupLines__BlockAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getBlockAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2512:1: ( rule__MarkupLines__BlockAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2512:2: rule__MarkupLines__BlockAssignment_2
            {
            pushFollow(FOLLOW_rule__MarkupLines__BlockAssignment_2_in_rule__MarkupLines__Group__2__Impl5338);
            rule__MarkupLines__BlockAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupLinesAccess().getBlockAssignment_2()); 
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
    // $ANTLR end rule__MarkupLines__Group__2__Impl


    // $ANTLR start rule__MarkupBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2528:1: rule__MarkupBlock__Group__0 : rule__MarkupBlock__Group__0__Impl rule__MarkupBlock__Group__1 ;
    public final void rule__MarkupBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2532:1: ( rule__MarkupBlock__Group__0__Impl rule__MarkupBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2533:2: rule__MarkupBlock__Group__0__Impl rule__MarkupBlock__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__0__Impl_in_rule__MarkupBlock__Group__05374);
            rule__MarkupBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBlock__Group__1_in_rule__MarkupBlock__Group__05377);
            rule__MarkupBlock__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupBlock__Group__0


    // $ANTLR start rule__MarkupBlock__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2540:1: rule__MarkupBlock__Group__0__Impl : ( () ) ;
    public final void rule__MarkupBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2544:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2545:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2545:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2546:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getMarkupBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2547:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2549:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBlockAccess().getMarkupBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupBlock__Group__0__Impl


    // $ANTLR start rule__MarkupBlock__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2559:1: rule__MarkupBlock__Group__1 : rule__MarkupBlock__Group__1__Impl rule__MarkupBlock__Group__2 ;
    public final void rule__MarkupBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2563:1: ( rule__MarkupBlock__Group__1__Impl rule__MarkupBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2564:2: rule__MarkupBlock__Group__1__Impl rule__MarkupBlock__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__1__Impl_in_rule__MarkupBlock__Group__15435);
            rule__MarkupBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBlock__Group__2_in_rule__MarkupBlock__Group__15438);
            rule__MarkupBlock__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupBlock__Group__1


    // $ANTLR start rule__MarkupBlock__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2571:1: rule__MarkupBlock__Group__1__Impl : ( KEYWORD_16 ) ;
    public final void rule__MarkupBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2575:1: ( ( KEYWORD_16 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2576:1: ( KEYWORD_16 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2576:1: ( KEYWORD_16 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2577:1: KEYWORD_16
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__MarkupBlock__Group__1__Impl5466); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBlockAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end rule__MarkupBlock__Group__1__Impl


    // $ANTLR start rule__MarkupBlock__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2590:1: rule__MarkupBlock__Group__2 : rule__MarkupBlock__Group__2__Impl rule__MarkupBlock__Group__3 ;
    public final void rule__MarkupBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2594:1: ( rule__MarkupBlock__Group__2__Impl rule__MarkupBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2595:2: rule__MarkupBlock__Group__2__Impl rule__MarkupBlock__Group__3
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__2__Impl_in_rule__MarkupBlock__Group__25497);
            rule__MarkupBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBlock__Group__3_in_rule__MarkupBlock__Group__25500);
            rule__MarkupBlock__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupBlock__Group__2


    // $ANTLR start rule__MarkupBlock__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2602:1: rule__MarkupBlock__Group__2__Impl : ( ( rule__MarkupBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__MarkupBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2606:1: ( ( ( rule__MarkupBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2607:1: ( ( rule__MarkupBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2607:1: ( ( rule__MarkupBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2608:1: ( rule__MarkupBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2609:1: ( rule__MarkupBlock__ExpressionsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=KEYWORD_25 && LA23_0<=KEYWORD_2)||(LA23_0>=KEYWORD_4 && LA23_0<=KEYWORD_14)||LA23_0==KEYWORD_16||(LA23_0>=KEYWORD_18 && LA23_0<=RULE_ID)||LA23_0==RULE_ANY_OTHER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2609:2: rule__MarkupBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MarkupBlock__ExpressionsAssignment_2_in_rule__MarkupBlock__Group__2__Impl5527);
            	    rule__MarkupBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBlockAccess().getExpressionsAssignment_2()); 
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
    // $ANTLR end rule__MarkupBlock__Group__2__Impl


    // $ANTLR start rule__MarkupBlock__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2619:1: rule__MarkupBlock__Group__3 : rule__MarkupBlock__Group__3__Impl ;
    public final void rule__MarkupBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2623:1: ( rule__MarkupBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2624:2: rule__MarkupBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__3__Impl_in_rule__MarkupBlock__Group__35558);
            rule__MarkupBlock__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupBlock__Group__3


    // $ANTLR start rule__MarkupBlock__Group__3__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2630:1: rule__MarkupBlock__Group__3__Impl : ( KEYWORD_17 ) ;
    public final void rule__MarkupBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2634:1: ( ( KEYWORD_17 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2635:1: ( KEYWORD_17 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2635:1: ( KEYWORD_17 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2636:1: KEYWORD_17
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__MarkupBlock__Group__3__Impl5586); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBlockAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end rule__MarkupBlock__Group__3__Impl


    // $ANTLR start rule__MarkupCommand__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2657:1: rule__MarkupCommand__Group__0 : rule__MarkupCommand__Group__0__Impl rule__MarkupCommand__Group__1 ;
    public final void rule__MarkupCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2661:1: ( rule__MarkupCommand__Group__0__Impl rule__MarkupCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2662:2: rule__MarkupCommand__Group__0__Impl rule__MarkupCommand__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupCommand__Group__0__Impl_in_rule__MarkupCommand__Group__05625);
            rule__MarkupCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupCommand__Group__1_in_rule__MarkupCommand__Group__05628);
            rule__MarkupCommand__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupCommand__Group__0


    // $ANTLR start rule__MarkupCommand__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2669:1: rule__MarkupCommand__Group__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__MarkupCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2673:1: ( ( KEYWORD_13 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2674:1: ( KEYWORD_13 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2674:1: ( KEYWORD_13 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2675:1: KEYWORD_13
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__MarkupCommand__Group__0__Impl5656); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupCommandAccess().getReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__MarkupCommand__Group__0__Impl


    // $ANTLR start rule__MarkupCommand__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2688:1: rule__MarkupCommand__Group__1 : rule__MarkupCommand__Group__1__Impl ;
    public final void rule__MarkupCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2692:1: ( rule__MarkupCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2693:2: rule__MarkupCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MarkupCommand__Group__1__Impl_in_rule__MarkupCommand__Group__15687);
            rule__MarkupCommand__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupCommand__Group__1


    // $ANTLR start rule__MarkupCommand__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2699:1: rule__MarkupCommand__Group__1__Impl : ( ( rule__MarkupCommand__CommandAssignment_1 ) ) ;
    public final void rule__MarkupCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2703:1: ( ( ( rule__MarkupCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2704:1: ( ( rule__MarkupCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2704:1: ( ( rule__MarkupCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2705:1: ( rule__MarkupCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2706:1: ( rule__MarkupCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2706:2: rule__MarkupCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__MarkupCommand__CommandAssignment_1_in_rule__MarkupCommand__Group__1__Impl5714);
            rule__MarkupCommand__CommandAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupCommandAccess().getCommandAssignment_1()); 
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
    // $ANTLR end rule__MarkupCommand__Group__1__Impl


    // $ANTLR start rule__Reference__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2720:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2724:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2725:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05748);
            rule__Reference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05751);
            rule__Reference__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reference__Group__0


    // $ANTLR start rule__Reference__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2732:1: rule__Reference__Group__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2736:1: ( ( KEYWORD_13 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2737:1: ( KEYWORD_13 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2737:1: ( KEYWORD_13 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2738:1: KEYWORD_13
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__Reference__Group__0__Impl5779); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__Reference__Group__0__Impl


    // $ANTLR start rule__Reference__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2751:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2755:1: ( rule__Reference__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2756:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__15810);
            rule__Reference__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reference__Group__1


    // $ANTLR start rule__Reference__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2762:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__AssignmentAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2766:1: ( ( ( rule__Reference__AssignmentAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2767:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2767:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2768:1: ( rule__Reference__AssignmentAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2769:1: ( rule__Reference__AssignmentAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2769:2: rule__Reference__AssignmentAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl5837);
            rule__Reference__AssignmentAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getAssignmentAssignment_1()); 
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
    // $ANTLR end rule__Reference__Group__1__Impl


    // $ANTLR start rule__Scheme__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2783:1: rule__Scheme__Group__0 : rule__Scheme__Group__0__Impl rule__Scheme__Group__1 ;
    public final void rule__Scheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2787:1: ( rule__Scheme__Group__0__Impl rule__Scheme__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2788:2: rule__Scheme__Group__0__Impl rule__Scheme__Group__1
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__05871);
            rule__Scheme__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__05874);
            rule__Scheme__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2795:1: rule__Scheme__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__Scheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2799:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2800:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2800:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2801:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl5902); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
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
    // $ANTLR end rule__Scheme__Group__0__Impl


    // $ANTLR start rule__Scheme__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2814:1: rule__Scheme__Group__1 : rule__Scheme__Group__1__Impl ;
    public final void rule__Scheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2818:1: ( rule__Scheme__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2819:2: rule__Scheme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__15933);
            rule__Scheme__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2825:1: rule__Scheme__Group__1__Impl : ( ( rule__Scheme__ValueAssignment_1 ) ) ;
    public final void rule__Scheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2829:1: ( ( ( rule__Scheme__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2830:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2830:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2831:1: ( rule__Scheme__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2832:1: ( rule__Scheme__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2832:2: rule__Scheme__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl5960);
            rule__Scheme__ValueAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
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
    // $ANTLR end rule__Scheme__Group__1__Impl


    // $ANTLR start rule__SchemeExpression__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2846:1: rule__SchemeExpression__Group__0 : rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 ;
    public final void rule__SchemeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2850:1: ( rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2851:2: rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__05994);
            rule__SchemeExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__05997);
            rule__SchemeExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2858:1: rule__SchemeExpression__Group__0__Impl : ( ( rule__SchemeExpression__Alternatives_0 ) ) ;
    public final void rule__SchemeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2862:1: ( ( ( rule__SchemeExpression__Alternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2863:1: ( ( rule__SchemeExpression__Alternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2863:1: ( ( rule__SchemeExpression__Alternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2864:1: ( rule__SchemeExpression__Alternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2865:1: ( rule__SchemeExpression__Alternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2865:2: rule__SchemeExpression__Alternatives_0
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl6024);
            rule__SchemeExpression__Alternatives_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getAlternatives_0()); 
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
    // $ANTLR end rule__SchemeExpression__Group__0__Impl


    // $ANTLR start rule__SchemeExpression__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2875:1: rule__SchemeExpression__Group__1 : rule__SchemeExpression__Group__1__Impl ;
    public final void rule__SchemeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2879:1: ( rule__SchemeExpression__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2880:2: rule__SchemeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__16054);
            rule__SchemeExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2886:1: rule__SchemeExpression__Group__1__Impl : ( ( rule__SchemeExpression__ValueAssignment_1 ) ) ;
    public final void rule__SchemeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2890:1: ( ( ( rule__SchemeExpression__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2891:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2891:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2892:1: ( rule__SchemeExpression__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2893:1: ( rule__SchemeExpression__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2893:2: rule__SchemeExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl6081);
            rule__SchemeExpression__ValueAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
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
    // $ANTLR end rule__SchemeExpression__Group__1__Impl


    // $ANTLR start rule__SchemeList__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2907:1: rule__SchemeList__Group__0 : rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 ;
    public final void rule__SchemeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2911:1: ( rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2912:2: rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__06115);
            rule__SchemeList__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__06118);
            rule__SchemeList__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2919:1: rule__SchemeList__Group__0__Impl : ( () ) ;
    public final void rule__SchemeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2923:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2924:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2924:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2925:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2926:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2928:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 
            }

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2938:1: rule__SchemeList__Group__1 : rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 ;
    public final void rule__SchemeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2942:1: ( rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2943:2: rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__16176);
            rule__SchemeList__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__16179);
            rule__SchemeList__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2950:1: rule__SchemeList__Group__1__Impl : ( ( rule__SchemeList__VectorAssignment_1 )? ) ;
    public final void rule__SchemeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2954:1: ( ( ( rule__SchemeList__VectorAssignment_1 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2955:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2955:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2956:1: ( rule__SchemeList__VectorAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2957:1: ( rule__SchemeList__VectorAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_2) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2957:2: rule__SchemeList__VectorAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl6206);
                    rule__SchemeList__VectorAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getVectorAssignment_1()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2967:1: rule__SchemeList__Group__2 : rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 ;
    public final void rule__SchemeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2971:1: ( rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2972:2: rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__26237);
            rule__SchemeList__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__26240);
            rule__SchemeList__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2979:1: rule__SchemeList__Group__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__SchemeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2983:1: ( ( KEYWORD_5 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2984:1: ( KEYWORD_5 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2984:1: ( KEYWORD_5 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2985:1: KEYWORD_5
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl6268); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end rule__SchemeList__Group__2__Impl


    // $ANTLR start rule__SchemeList__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2998:1: rule__SchemeList__Group__3 : rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 ;
    public final void rule__SchemeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3002:1: ( rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3003:2: rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__36299);
            rule__SchemeList__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__36302);
            rule__SchemeList__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3010:1: rule__SchemeList__Group__3__Impl : ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) ;
    public final void rule__SchemeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3014:1: ( ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3015:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3015:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3016:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_3()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3017:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=KEYWORD_19 && LA25_0<=KEYWORD_21)||(LA25_0>=KEYWORD_25 && LA25_0<=KEYWORD_5)||(LA25_0>=KEYWORD_7 && LA25_0<=KEYWORD_12)||(LA25_0>=KEYWORD_14 && LA25_0<=KEYWORD_15)||(LA25_0>=KEYWORD_18 && LA25_0<=RULE_ID)||LA25_0==RULE_ANY_OTHER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3017:2: rule__SchemeList__ExpressionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl6329);
            	    rule__SchemeList__ExpressionsAssignment_3();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getExpressionsAssignment_3()); 
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
    // $ANTLR end rule__SchemeList__Group__3__Impl


    // $ANTLR start rule__SchemeList__Group__4
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3027:1: rule__SchemeList__Group__4 : rule__SchemeList__Group__4__Impl ;
    public final void rule__SchemeList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3031:1: ( rule__SchemeList__Group__4__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3032:2: rule__SchemeList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__46360);
            rule__SchemeList__Group__4__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SchemeList__Group__4


    // $ANTLR start rule__SchemeList__Group__4__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3038:1: rule__SchemeList__Group__4__Impl : ( KEYWORD_6 ) ;
    public final void rule__SchemeList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3042:1: ( ( KEYWORD_6 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3043:1: ( KEYWORD_6 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3043:1: ( KEYWORD_6 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3044:1: KEYWORD_6
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl6388); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end rule__SchemeList__Group__4__Impl


    // $ANTLR start rule__SchemeBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3067:1: rule__SchemeBlock__Group__0 : rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 ;
    public final void rule__SchemeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3071:1: ( rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3072:2: rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__06429);
            rule__SchemeBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__06432);
            rule__SchemeBlock__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3079:1: rule__SchemeBlock__Group__0__Impl : ( KEYWORD_21 ) ;
    public final void rule__SchemeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3083:1: ( ( KEYWORD_21 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3084:1: ( KEYWORD_21 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3084:1: ( KEYWORD_21 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3085:1: KEYWORD_21
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 
            }
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__SchemeBlock__Group__0__Impl6460); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end rule__SchemeBlock__Group__0__Impl


    // $ANTLR start rule__SchemeBlock__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3098:1: rule__SchemeBlock__Group__1 : rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 ;
    public final void rule__SchemeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3102:1: ( rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3103:2: rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__16491);
            rule__SchemeBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__16494);
            rule__SchemeBlock__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3110:1: rule__SchemeBlock__Group__1__Impl : ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__SchemeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3114:1: ( ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3115:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3115:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3116:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3116:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3117:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3118:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3118:2: rule__SchemeBlock__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl6523);
            rule__SchemeBlock__ExpressionsAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }

            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3121:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3122:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3123:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEYWORD_23||(LA26_0>=KEYWORD_25 && LA26_0<=KEYWORD_2)||(LA26_0>=KEYWORD_4 && LA26_0<=KEYWORD_14)||LA26_0==KEYWORD_16||(LA26_0>=KEYWORD_18 && LA26_0<=RULE_ID)||LA26_0==RULE_ANY_OTHER) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3123:2: rule__SchemeBlock__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl6535);
            	    rule__SchemeBlock__ExpressionsAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3134:1: rule__SchemeBlock__Group__2 : rule__SchemeBlock__Group__2__Impl ;
    public final void rule__SchemeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3138:1: ( rule__SchemeBlock__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3139:2: rule__SchemeBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__26568);
            rule__SchemeBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3145:1: rule__SchemeBlock__Group__2__Impl : ( KEYWORD_22 ) ;
    public final void rule__SchemeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3149:1: ( ( KEYWORD_22 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3150:1: ( KEYWORD_22 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3150:1: ( KEYWORD_22 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3151:1: KEYWORD_22
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__SchemeBlock__Group__2__Impl6596); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 
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
    // $ANTLR end rule__SchemeBlock__Group__2__Impl


    // $ANTLR start rule__SchemeCharacter__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3170:1: rule__SchemeCharacter__Group__0 : rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 ;
    public final void rule__SchemeCharacter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3174:1: ( rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3175:2: rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__06633);
            rule__SchemeCharacter__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__06636);
            rule__SchemeCharacter__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SchemeCharacter__Group__0


    // $ANTLR start rule__SchemeCharacter__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3182:1: rule__SchemeCharacter__Group__0__Impl : ( KEYWORD_20 ) ;
    public final void rule__SchemeCharacter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3186:1: ( ( KEYWORD_20 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3187:1: ( KEYWORD_20 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3187:1: ( KEYWORD_20 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3188:1: KEYWORD_20
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__SchemeCharacter__Group__0__Impl6664); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__SchemeCharacter__Group__0__Impl


    // $ANTLR start rule__SchemeCharacter__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3201:1: rule__SchemeCharacter__Group__1 : rule__SchemeCharacter__Group__1__Impl ;
    public final void rule__SchemeCharacter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3205:1: ( rule__SchemeCharacter__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3206:2: rule__SchemeCharacter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__16695);
            rule__SchemeCharacter__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SchemeCharacter__Group__1


    // $ANTLR start rule__SchemeCharacter__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3212:1: rule__SchemeCharacter__Group__1__Impl : ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) ;
    public final void rule__SchemeCharacter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3216:1: ( ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3217:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3217:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3218:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3219:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3219:2: rule__SchemeCharacter__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl6722);
            rule__SchemeCharacter__ValueAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeCharacterAccess().getValueAssignment_1()); 
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
    // $ANTLR end rule__SchemeCharacter__Group__1__Impl


    // $ANTLR start rule__SchemeNumber__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3233:1: rule__SchemeNumber__Group__0 : rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 ;
    public final void rule__SchemeNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3237:1: ( rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3238:2: rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__06756);
            rule__SchemeNumber__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__06759);
            rule__SchemeNumber__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3245:1: rule__SchemeNumber__Group__0__Impl : ( ( rule__SchemeNumber__RadixAssignment_0 )? ) ;
    public final void rule__SchemeNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3249:1: ( ( ( rule__SchemeNumber__RadixAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3250:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3250:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3251:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3252:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_2) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3252:2: rule__SchemeNumber__RadixAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl6786);
                    rule__SchemeNumber__RadixAssignment_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberAccess().getRadixAssignment_0()); 
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
    // $ANTLR end rule__SchemeNumber__Group__0__Impl


    // $ANTLR start rule__SchemeNumber__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3262:1: rule__SchemeNumber__Group__1 : rule__SchemeNumber__Group__1__Impl ;
    public final void rule__SchemeNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3266:1: ( rule__SchemeNumber__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3267:2: rule__SchemeNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__16817);
            rule__SchemeNumber__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3273:1: rule__SchemeNumber__Group__1__Impl : ( ( rule__SchemeNumber__ValueAssignment_1 ) ) ;
    public final void rule__SchemeNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3277:1: ( ( ( rule__SchemeNumber__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3278:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3278:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3279:1: ( rule__SchemeNumber__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3280:1: ( rule__SchemeNumber__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3280:2: rule__SchemeNumber__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl6844);
            rule__SchemeNumber__ValueAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberAccess().getValueAssignment_1()); 
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
    // $ANTLR end rule__SchemeNumber__Group__1__Impl


    // $ANTLR start rule__SchemeNumberRadix__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3294:1: rule__SchemeNumberRadix__Group__0 : rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 ;
    public final void rule__SchemeNumberRadix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3298:1: ( rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3299:2: rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__06878);
            rule__SchemeNumberRadix__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__06881);
            rule__SchemeNumberRadix__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SchemeNumberRadix__Group__0


    // $ANTLR start rule__SchemeNumberRadix__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3306:1: rule__SchemeNumberRadix__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__SchemeNumberRadix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3310:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3311:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3311:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3312:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl6909); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0()); 
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
    // $ANTLR end rule__SchemeNumberRadix__Group__0__Impl


    // $ANTLR start rule__SchemeNumberRadix__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3325:1: rule__SchemeNumberRadix__Group__1 : rule__SchemeNumberRadix__Group__1__Impl ;
    public final void rule__SchemeNumberRadix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3329:1: ( rule__SchemeNumberRadix__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3330:2: rule__SchemeNumberRadix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__16940);
            rule__SchemeNumberRadix__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SchemeNumberRadix__Group__1


    // $ANTLR start rule__SchemeNumberRadix__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3336:1: rule__SchemeNumberRadix__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__SchemeNumberRadix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3340:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3341:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3341:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3342:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeNumberRadix__Group__1__Impl6967); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRadixAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end rule__SchemeNumberRadix__Group__1__Impl


    // $ANTLR start rule__SchemeMarkupCommand__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3357:1: rule__SchemeMarkupCommand__Group__0 : rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 ;
    public final void rule__SchemeMarkupCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3361:1: ( rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3362:2: rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__07000);
            rule__SchemeMarkupCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__07003);
            rule__SchemeMarkupCommand__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SchemeMarkupCommand__Group__0


    // $ANTLR start rule__SchemeMarkupCommand__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3369:1: rule__SchemeMarkupCommand__Group__0__Impl : ( KEYWORD_19 ) ;
    public final void rule__SchemeMarkupCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3373:1: ( ( KEYWORD_19 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3374:1: ( KEYWORD_19 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3374:1: ( KEYWORD_19 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3375:1: KEYWORD_19
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0()); 
            }
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__SchemeMarkupCommand__Group__0__Impl7031); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0()); 
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
    // $ANTLR end rule__SchemeMarkupCommand__Group__0__Impl


    // $ANTLR start rule__SchemeMarkupCommand__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3388:1: rule__SchemeMarkupCommand__Group__1 : rule__SchemeMarkupCommand__Group__1__Impl ;
    public final void rule__SchemeMarkupCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3392:1: ( rule__SchemeMarkupCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3393:2: rule__SchemeMarkupCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__17062);
            rule__SchemeMarkupCommand__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SchemeMarkupCommand__Group__1


    // $ANTLR start rule__SchemeMarkupCommand__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3399:1: rule__SchemeMarkupCommand__Group__1__Impl : ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) ;
    public final void rule__SchemeMarkupCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3403:1: ( ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3404:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3404:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3405:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3406:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3406:2: rule__SchemeMarkupCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl7089);
            rule__SchemeMarkupCommand__CommandAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeMarkupCommandAccess().getCommandAssignment_1()); 
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
    // $ANTLR end rule__SchemeMarkupCommand__Group__1__Impl


    // $ANTLR start rule__BOOL__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3420:1: rule__BOOL__Group__0 : rule__BOOL__Group__0__Impl rule__BOOL__Group__1 ;
    public final void rule__BOOL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3424:1: ( rule__BOOL__Group__0__Impl rule__BOOL__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3425:2: rule__BOOL__Group__0__Impl rule__BOOL__Group__1
            {
            pushFollow(FOLLOW_rule__BOOL__Group__0__Impl_in_rule__BOOL__Group__07123);
            rule__BOOL__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__BOOL__Group__1_in_rule__BOOL__Group__07126);
            rule__BOOL__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOOL__Group__0


    // $ANTLR start rule__BOOL__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3432:1: rule__BOOL__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__BOOL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3436:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3437:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3437:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3438:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__BOOL__Group__0__Impl7154); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBOOLAccess().getNumberSignKeyword_0()); 
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
    // $ANTLR end rule__BOOL__Group__0__Impl


    // $ANTLR start rule__BOOL__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3451:1: rule__BOOL__Group__1 : rule__BOOL__Group__1__Impl ;
    public final void rule__BOOL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3455:1: ( rule__BOOL__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3456:2: rule__BOOL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BOOL__Group__1__Impl_in_rule__BOOL__Group__17185);
            rule__BOOL__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOOL__Group__1


    // $ANTLR start rule__BOOL__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3462:1: rule__BOOL__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__BOOL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3466:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3467:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3467:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3468:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BOOL__Group__1__Impl7212); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBOOLAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end rule__BOOL__Group__1__Impl


    // $ANTLR start rule__LilyPond__ExpressionsAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3484:1: rule__LilyPond__ExpressionsAssignment : ( ruleToplevelExpression ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3488:1: ( ( ruleToplevelExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3489:1: ( ruleToplevelExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3489:1: ( ruleToplevelExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3490:1: ruleToplevelExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment7250);
            ruleToplevelExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionParserRuleCall_0()); 
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
    // $ANTLR end rule__LilyPond__ExpressionsAssignment


    // $ANTLR start rule__Assignment__NameAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3499:1: rule__Assignment__NameAssignment_0 : ( ( rule__Assignment__NameAlternatives_0_0 ) ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3503:1: ( ( ( rule__Assignment__NameAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3504:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3504:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3505:1: ( rule__Assignment__NameAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3506:1: ( rule__Assignment__NameAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3506:2: rule__Assignment__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_07281);
            rule__Assignment__NameAlternatives_0_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getNameAlternatives_0_0()); 
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
    // $ANTLR end rule__Assignment__NameAssignment_0


    // $ANTLR start rule__Assignment__ValueAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3515:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3519:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3520:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3520:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3521:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_27314);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end rule__Assignment__ValueAssignment_2


    // $ANTLR start rule__PropertyAssignment__IdAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3530:1: rule__PropertyAssignment__IdAssignment_0 : ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) ;
    public final void rule__PropertyAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3534:1: ( ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3535:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3535:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3536:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3537:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3537:2: rule__PropertyAssignment__IdAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_07345);
            rule__PropertyAssignment__IdAlternatives_0_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPropertyAssignmentAccess().getIdAlternatives_0_0()); 
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
    // $ANTLR end rule__PropertyAssignment__IdAssignment_0


    // $ANTLR start rule__PropertyAssignment__ValueAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3546:1: rule__PropertyAssignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__PropertyAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3550:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3551:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3551:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3552:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_27378);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end rule__PropertyAssignment__ValueAssignment_2


    // $ANTLR start rule__SimpleBlock__ExpressionsAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3561:1: rule__SimpleBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3565:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3566:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3566:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3567:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_27409);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end rule__SimpleBlock__ExpressionsAssignment_2


    // $ANTLR start rule__SimultaneousBlock__ExpressionsAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3576:1: rule__SimultaneousBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimultaneousBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3580:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3581:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3581:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3582:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_27440);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end rule__SimultaneousBlock__ExpressionsAssignment_2


    // $ANTLR start rule__Include__ImportURIAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3591:1: rule__Include__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3595:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3596:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3596:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3597:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_27471); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end rule__Include__ImportURIAssignment_2


    // $ANTLR start rule__Version__VersionAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3606:1: rule__Version__VersionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Version__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3610:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3611:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3611:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3612:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_27502); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end rule__Version__VersionAssignment_2


    // $ANTLR start rule__Markup__BlockAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3621:1: rule__Markup__BlockAssignment_2 : ( ruleMarkupBlock ) ;
    public final void rule__Markup__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3625:1: ( ( ruleMarkupBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3626:1: ( ruleMarkupBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3626:1: ( ruleMarkupBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3627:1: ruleMarkupBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBlockMarkupBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBlock_in_rule__Markup__BlockAssignment_27533);
            ruleMarkupBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getBlockMarkupBlockParserRuleCall_2_0()); 
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
    // $ANTLR end rule__Markup__BlockAssignment_2


    // $ANTLR start rule__MarkupLines__BlockAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3636:1: rule__MarkupLines__BlockAssignment_2 : ( ruleMarkupBlock ) ;
    public final void rule__MarkupLines__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3640:1: ( ( ruleMarkupBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3641:1: ( ruleMarkupBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3641:1: ( ruleMarkupBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3642:1: ruleMarkupBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getBlockMarkupBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBlock_in_rule__MarkupLines__BlockAssignment_27564);
            ruleMarkupBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupLinesAccess().getBlockMarkupBlockParserRuleCall_2_0()); 
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
    // $ANTLR end rule__MarkupLines__BlockAssignment_2


    // $ANTLR start rule__MarkupBlock__ExpressionsAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3651:1: rule__MarkupBlock__ExpressionsAssignment_2 : ( ruleMarkupExpression ) ;
    public final void rule__MarkupBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3655:1: ( ( ruleMarkupExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3656:1: ( ruleMarkupExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3656:1: ( ruleMarkupExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3657:1: ruleMarkupExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getExpressionsMarkupExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupExpression_in_rule__MarkupBlock__ExpressionsAssignment_27595);
            ruleMarkupExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBlockAccess().getExpressionsMarkupExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end rule__MarkupBlock__ExpressionsAssignment_2


    // $ANTLR start rule__MarkupCommand__CommandAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3666:1: rule__MarkupCommand__CommandAssignment_1 : ( RULE_ID ) ;
    public final void rule__MarkupCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3670:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3671:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3671:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3672:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MarkupCommand__CommandAssignment_17626); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__MarkupCommand__CommandAssignment_1


    // $ANTLR start rule__Reference__AssignmentAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3681:1: rule__Reference__AssignmentAssignment_1 : ( ( ruleReferenceName ) ) ;
    public final void rule__Reference__AssignmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3685:1: ( ( ( ruleReferenceName ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3686:1: ( ( ruleReferenceName ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3686:1: ( ( ruleReferenceName ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3687:1: ( ruleReferenceName )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3688:1: ( ruleReferenceName )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3689:1: ruleReferenceName
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentReferenceNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleReferenceName_in_rule__Reference__AssignmentAssignment_17661);
            ruleReferenceName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getAssignmentAssignmentReferenceNameParserRuleCall_1_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0()); 
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
    // $ANTLR end rule__Reference__AssignmentAssignment_1


    // $ANTLR start rule__Text__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3700:1: rule__Text__ValueAssignment : ( ( rule__Text__ValueAlternatives_0 ) ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3704:1: ( ( ( rule__Text__ValueAlternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3705:1: ( ( rule__Text__ValueAlternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3705:1: ( ( rule__Text__ValueAlternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3706:1: ( rule__Text__ValueAlternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3707:1: ( rule__Text__ValueAlternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3707:2: rule__Text__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment7696);
            rule__Text__ValueAlternatives_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextAccess().getValueAlternatives_0()); 
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
    // $ANTLR end rule__Text__ValueAssignment


    // $ANTLR start rule__Number__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3716:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3720:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3721:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3721:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3722:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment7729); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
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
    // $ANTLR end rule__Number__ValueAssignment


    // $ANTLR start rule__Scheme__ValueAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3731:1: rule__Scheme__ValueAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__Scheme__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3735:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3736:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3736:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3737:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_17760);
            ruleSchemeExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end rule__Scheme__ValueAssignment_1


    // $ANTLR start rule__SchemeExpression__QuotedAssignment_0_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3746:1: rule__SchemeExpression__QuotedAssignment_0_0 : ( ( KEYWORD_4 ) ) ;
    public final void rule__SchemeExpression__QuotedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3750:1: ( ( ( KEYWORD_4 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3751:1: ( ( KEYWORD_4 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3751:1: ( ( KEYWORD_4 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3752:1: ( KEYWORD_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3753:1: ( KEYWORD_4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3754:1: KEYWORD_4
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_07796); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
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
    // $ANTLR end rule__SchemeExpression__QuotedAssignment_0_0


    // $ANTLR start rule__SchemeExpression__QuasiquotedAssignment_0_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3769:1: rule__SchemeExpression__QuasiquotedAssignment_0_1 : ( ( KEYWORD_15 ) ) ;
    public final void rule__SchemeExpression__QuasiquotedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3773:1: ( ( ( KEYWORD_15 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3774:1: ( ( KEYWORD_15 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3774:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3775:1: ( KEYWORD_15 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3776:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3777:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__SchemeExpression__QuasiquotedAssignment_0_17840); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
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
    // $ANTLR end rule__SchemeExpression__QuasiquotedAssignment_0_1


    // $ANTLR start rule__SchemeExpression__UnquotedAssignment_0_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3792:1: rule__SchemeExpression__UnquotedAssignment_0_2 : ( ( KEYWORD_8 ) ) ;
    public final void rule__SchemeExpression__UnquotedAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3796:1: ( ( ( KEYWORD_8 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3797:1: ( ( KEYWORD_8 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3797:1: ( ( KEYWORD_8 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3798:1: ( KEYWORD_8 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3799:1: ( KEYWORD_8 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3800:1: KEYWORD_8
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_27884); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
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
    // $ANTLR end rule__SchemeExpression__UnquotedAssignment_0_2


    // $ANTLR start rule__SchemeExpression__VariableAssignment_0_3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3815:1: rule__SchemeExpression__VariableAssignment_0_3 : ( ( KEYWORD_3 ) ) ;
    public final void rule__SchemeExpression__VariableAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3819:1: ( ( ( KEYWORD_3 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3820:1: ( ( KEYWORD_3 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3820:1: ( ( KEYWORD_3 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3821:1: ( KEYWORD_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3822:1: ( KEYWORD_3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3823:1: KEYWORD_3
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_37928); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
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
    // $ANTLR end rule__SchemeExpression__VariableAssignment_0_3


    // $ANTLR start rule__SchemeExpression__ValueAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3838:1: rule__SchemeExpression__ValueAssignment_1 : ( ruleSchemeValue ) ;
    public final void rule__SchemeExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3842:1: ( ( ruleSchemeValue ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3843:1: ( ruleSchemeValue )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3843:1: ( ruleSchemeValue )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3844:1: ruleSchemeValue
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_17967);
            ruleSchemeValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
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
    // $ANTLR end rule__SchemeExpression__ValueAssignment_1


    // $ANTLR start rule__SchemeBoolean__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3853:1: rule__SchemeBoolean__ValueAssignment : ( ruleBOOL ) ;
    public final void rule__SchemeBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3857:1: ( ( ruleBOOL ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3858:1: ( ruleBOOL )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3858:1: ( ruleBOOL )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3859:1: ruleBOOL
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueBOOLParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__SchemeBoolean__ValueAssignment7998);
            ruleBOOL();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBooleanAccess().getValueBOOLParserRuleCall_0()); 
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
    // $ANTLR end rule__SchemeBoolean__ValueAssignment


    // $ANTLR start rule__SchemeList__VectorAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3868:1: rule__SchemeList__VectorAssignment_1 : ( ( KEYWORD_2 ) ) ;
    public final void rule__SchemeList__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3872:1: ( ( ( KEYWORD_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3873:1: ( ( KEYWORD_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3873:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3874:1: ( KEYWORD_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3875:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3876:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_18034); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
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
    // $ANTLR end rule__SchemeList__VectorAssignment_1


    // $ANTLR start rule__SchemeList__ExpressionsAssignment_3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3891:1: rule__SchemeList__ExpressionsAssignment_3 : ( ruleSchemeExpression ) ;
    public final void rule__SchemeList__ExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3895:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3896:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3896:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3897:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_38073);
            ruleSchemeExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end rule__SchemeList__ExpressionsAssignment_3


    // $ANTLR start rule__SchemeBlock__ExpressionsAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3906:1: rule__SchemeBlock__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__SchemeBlock__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3910:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3911:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3911:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3912:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_18104);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end rule__SchemeBlock__ExpressionsAssignment_1


    // $ANTLR start rule__SchemeCharacter__ValueAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3921:1: rule__SchemeCharacter__ValueAssignment_1 : ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) ;
    public final void rule__SchemeCharacter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3925:1: ( ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3926:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3926:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3927:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3928:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3928:2: rule__SchemeCharacter__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_18135);
            rule__SchemeCharacter__ValueAlternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeCharacterAccess().getValueAlternatives_1_0()); 
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
    // $ANTLR end rule__SchemeCharacter__ValueAssignment_1


    // $ANTLR start rule__SchemeText__ValueAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3937:1: rule__SchemeText__ValueAssignment : ( ruleSchemeTextLiterals ) ;
    public final void rule__SchemeText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3941:1: ( ( ruleSchemeTextLiterals ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3942:1: ( ruleSchemeTextLiterals )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3942:1: ( ruleSchemeTextLiterals )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3943:1: ruleSchemeTextLiterals
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment8168);
            ruleSchemeTextLiterals();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0()); 
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
    // $ANTLR end rule__SchemeText__ValueAssignment


    // $ANTLR start rule__SchemeNumber__RadixAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3952:1: rule__SchemeNumber__RadixAssignment_0 : ( ruleSchemeNumberRadix ) ;
    public final void rule__SchemeNumber__RadixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3956:1: ( ( ruleSchemeNumberRadix ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3957:1: ( ruleSchemeNumberRadix )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3957:1: ( ruleSchemeNumberRadix )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3958:1: ruleSchemeNumberRadix
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_08199);
            ruleSchemeNumberRadix();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0()); 
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
    // $ANTLR end rule__SchemeNumber__RadixAssignment_0


    // $ANTLR start rule__SchemeNumber__ValueAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3967:1: rule__SchemeNumber__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SchemeNumber__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3971:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3972:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3972:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3973:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_18230); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__SchemeNumber__ValueAssignment_1


    // $ANTLR start rule__SchemeMarkupCommand__CommandAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3982:1: rule__SchemeMarkupCommand__CommandAssignment_1 : ( RULE_ID ) ;
    public final void rule__SchemeMarkupCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3986:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3987:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3987:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3988:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeMarkupCommand__CommandAssignment_18261); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__SchemeMarkupCommand__CommandAssignment_1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1139:1: ( ( ruleAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1139:1: ( ruleAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1139:1: ( ruleAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1140:1: ruleAssignment
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred22410);
        ruleAssignment();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1161:1: ( ( rulePropertyAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1161:1: ( rulePropertyAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1161:1: ( rulePropertyAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1162:1: rulePropertyAssignment
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred32459);
        rulePropertyAssignment();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1537:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1537:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1537:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1538:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1539:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        int alt28=2;
        int LA28_0 = input.LA(1);

        if ( (LA28_0==KEYWORD_4) ) {
            alt28=1;
        }
        switch (alt28) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1539:2: rule__SchemeExpression__QuotedAssignment_0_0
                {
                pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred333343);
                rule__SchemeExpression__QuotedAssignment_0_0();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1543:6: ( ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1543:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1543:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1544:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1545:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        int alt29=2;
        int LA29_0 = input.LA(1);

        if ( (LA29_0==KEYWORD_15) ) {
            alt29=1;
        }
        switch (alt29) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1545:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
                {
                pushFollow(FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred353362);
                rule__SchemeExpression__QuasiquotedAssignment_0_1();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1549:6: ( ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1549:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1549:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1550:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1551:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0==KEYWORD_8) ) {
            alt30=1;
        }
        switch (alt30) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1551:2: rule__SchemeExpression__UnquotedAssignment_0_2
                {
                pushFollow(FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred373381);
                rule__SchemeExpression__UnquotedAssignment_0_2();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1571:1: ( ( ruleSchemeBoolean ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1571:1: ( ruleSchemeBoolean )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1571:1: ( ruleSchemeBoolean )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1572:1: ruleSchemeBoolean
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred383433);
        ruleSchemeBoolean();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:6: ( ( ruleSchemeNumber ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:6: ( ruleSchemeNumber )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:6: ( ruleSchemeNumber )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1602:1: ruleSchemeNumber
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred433518);
        ruleSchemeNumber();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred43

    public final boolean synpred35() {
        backtracking++;
        int start = input.mark();
        try {
            synpred35_fragment(); // can never throw exception
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
    public final boolean synpred33() {
        backtracking++;
        int start = input.mark();
        try {
            synpred33_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred37() {
        backtracking++;
        int start = input.mark();
        try {
            synpred37_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleLilyPond_in_entryRuleLilyPond60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilyPond67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond97 = new BitSet(new long[]{0x0000020F5FFDD002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_entryRuleToplevelExpression125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToplevelExpression132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToplevelExpression__Alternatives_in_ruleToplevelExpression162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_entryRuleCommonExpression253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonExpression260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommonExpression__Alternatives_in_ruleCommonExpression290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_entryRulePropertyAssignment381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssignment388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__0_in_rulePropertyAssignment418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_in_ruleBlock482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_entryRuleSimpleBlock509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleBlock516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0_in_ruleSimpleBlock546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_entryRuleSimultaneousBlock573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimultaneousBlock580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0_in_ruleSimultaneousBlock610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_entryRuleSpecialCommand701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommand708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialCommand__Alternatives_in_ruleSpecialCommand738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkup900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__0_in_ruleMarkup930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_entryRuleMarkupLines957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupLines964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__0_in_ruleMarkupLines994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_entryRuleMarkupBlock1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBlock1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__0_in_ruleMarkupBlock1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupExpression_in_entryRuleMarkupExpression1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupExpression1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupExpression__Alternatives_in_ruleMarkupExpression1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupCommand_in_entryRuleMarkupCommand1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupCommand1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupCommand__Group__0_in_ruleMarkupCommand1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceName_in_entryRuleReferenceName1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceName1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceName__Alternatives_in_ruleReferenceName1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialCharacter__Alternatives_in_ruleSpecialCharacter1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAssignment_in_ruleText1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme1538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0_in_ruleScheme1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0_in_ruleSchemeExpression1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeValue__Alternatives_in_ruleSchemeValue1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBoolean__ValueAssignment_in_ruleSchemeBoolean1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList1798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0_in_ruleSchemeList1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0_in_ruleSchemeBlock1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__0_in_ruleSchemeCharacter1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiterals2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeTextLiterals__Alternatives_in_ruleSchemeTextLiterals2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber2123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0_in_ruleSchemeNumber2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix2196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__0_in_ruleSchemeNumberRadix2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand2269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__0_in_ruleSchemeMarkupCommand2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__0_in_ruleBOOL2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__ToplevelExpression__Alternatives2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_rule__ToplevelExpression__Alternatives2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_rule__Expression__Alternatives2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_rule__Expression__Alternatives2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__CommonExpression__Alternatives2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CommonExpression__Alternatives2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__CommonExpression__Alternatives2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CommonExpression__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__CommonExpression__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__NameAlternatives_0_02608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assignment__NameAlternatives_0_02625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyAssignment__IdAlternatives_0_02657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyAssignment__IdAlternatives_0_02674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Command__Alternatives2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_rule__SpecialCommand__Alternatives2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_rule__SpecialCommand__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupCommand_in_rule__MarkupExpression__Alternatives2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_rule__MarkupExpression__Alternatives2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__MarkupExpression__Alternatives2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__MarkupExpression__Alternatives2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__MarkupExpression__Alternatives2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceName__Alternatives2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__ReferenceName__Alternatives3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__ReferenceName__Alternatives3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__ReferenceName__Alternatives3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__SpecialCharacter__Alternatives3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__SpecialCharacter__Alternatives3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__SpecialCharacter__Alternatives3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__SpecialCharacter__Alternatives3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__SpecialCharacter__Alternatives3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__SpecialCharacter__Alternatives3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__SpecialCharacter__Alternatives3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_03231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Text__ValueAlternatives_03249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Text__ValueAlternatives_03269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__Text__ValueAlternatives_03289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__Text__ValueAlternatives_03309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_rule__SchemeExpression__Alternatives_03343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_rule__SchemeExpression__Alternatives_03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_rule__SchemeExpression__Alternatives_03381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__VariableAssignment_0_3_in_rule__SchemeExpression__Alternatives_03400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_rule__SchemeValue__Alternatives3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_rule__SchemeValue__Alternatives3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeCharacter__ValueAlternatives_1_03567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeCharacter__ValueAlternatives_1_03584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeCharacter__ValueAlternatives_1_03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__SchemeTextLiterals__Alternatives3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__SchemeTextLiterals__Alternatives3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiterals__Alternatives3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03754 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13814 = new BitSet(new long[]{0x0000020F5FFDD000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__Assignment__Group__1__Impl3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__23876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__03939 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__03942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__13999 = new BitSet(new long[]{0x0000020F5FFDD000L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__14002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__PropertyAssignment__Group__1__Impl4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__24061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__04124 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__04127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__14185 = new BitSet(new long[]{0x0000020FDFFDD000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__SimpleBlock__Group__1__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__24247 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__24250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl4277 = new BitSet(new long[]{0x0000020F5FFDD002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__34308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__SimpleBlock__Group__3__Impl4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__04375 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__04378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__14436 = new BitSet(new long[]{0x0000020F5FFDF000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__14439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__SimultaneousBlock__Group__1__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__24498 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__24501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl4528 = new BitSet(new long[]{0x0000020F5FFDD002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__34559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__SimultaneousBlock__Group__3__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__04626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__04629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__Include__Group__0__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__14688 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__14691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__Include__Group__1__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__24750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__04813 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__04816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__Version__Group__0__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__14875 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__14878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__Version__Group__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__24937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_2_in_rule__Version__Group__2__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__05000 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__05003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__Markup__Group__0__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__15062 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Markup__Group__2_in_rule__Markup__Group__15065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__Markup__Group__1__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__2__Impl_in_rule__Markup__Group__25124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__BlockAssignment_2_in_rule__Markup__Group__2__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__0__Impl_in_rule__MarkupLines__Group__05187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__1_in_rule__MarkupLines__Group__05190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__MarkupLines__Group__0__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__1__Impl_in_rule__MarkupLines__Group__15249 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__2_in_rule__MarkupLines__Group__15252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__MarkupLines__Group__1__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__2__Impl_in_rule__MarkupLines__Group__25311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__BlockAssignment_2_in_rule__MarkupLines__Group__2__Impl5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__0__Impl_in_rule__MarkupBlock__Group__05374 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__1_in_rule__MarkupBlock__Group__05377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__1__Impl_in_rule__MarkupBlock__Group__15435 = new BitSet(new long[]{0x0000020FDFFDC000L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__2_in_rule__MarkupBlock__Group__15438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__MarkupBlock__Group__1__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__2__Impl_in_rule__MarkupBlock__Group__25497 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__3_in_rule__MarkupBlock__Group__25500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__ExpressionsAssignment_2_in_rule__MarkupBlock__Group__2__Impl5527 = new BitSet(new long[]{0x0000020F5FFDC002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__3__Impl_in_rule__MarkupBlock__Group__35558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__MarkupBlock__Group__3__Impl5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupCommand__Group__0__Impl_in_rule__MarkupCommand__Group__05625 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__MarkupCommand__Group__1_in_rule__MarkupCommand__Group__05628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__MarkupCommand__Group__0__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupCommand__Group__1__Impl_in_rule__MarkupCommand__Group__15687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupCommand__CommandAssignment_1_in_rule__MarkupCommand__Group__1__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05748 = new BitSet(new long[]{0x0000000916B88000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__Reference__Group__0__Impl5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__15810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__05871 = new BitSet(new long[]{0x0000020F37EFC700L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__05874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__15933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__05994 = new BitSet(new long[]{0x0000020F17A9C700L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__05997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__16054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__06115 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__06118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__16176 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__16179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__26237 = new BitSet(new long[]{0x0000020F37FFC700L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__26240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__36299 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__36302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl6329 = new BitSet(new long[]{0x0000020F37EFC702L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__46360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__06429 = new BitSet(new long[]{0x0000020F5FFDD000L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__06432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__SchemeBlock__Group__0__Impl6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__16491 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__16494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl6523 = new BitSet(new long[]{0x0000020F5FFDD002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl6535 = new BitSet(new long[]{0x0000020F5FFDD002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__26568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__SchemeBlock__Group__2__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__06633 = new BitSet(new long[]{0x0000020916A08000L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__06636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__SchemeCharacter__Group__0__Impl6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__16695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__06756 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__06759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__16817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__06878 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__06881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeNumberRadix__Group__1__Impl6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__07000 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__07003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__SchemeMarkupCommand__Group__0__Impl7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__17062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__0__Impl_in_rule__BOOL__Group__07123 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BOOL__Group__1_in_rule__BOOL__Group__07126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__BOOL__Group__0__Impl7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__1__Impl_in_rule__BOOL__Group__17185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BOOL__Group__1__Impl7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_07281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_27314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_07345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_27378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_27409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_27440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_27471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_27502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_rule__Markup__BlockAssignment_27533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_rule__MarkupLines__BlockAssignment_27564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupExpression_in_rule__MarkupBlock__ExpressionsAssignment_27595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MarkupCommand__CommandAssignment_17626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceName_in_rule__Reference__AssignmentAssignment_17661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment7696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment7729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_17760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_07796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__SchemeExpression__QuasiquotedAssignment_0_17840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_27884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_37928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_17967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__SchemeBoolean__ValueAssignment7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_18034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_38073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_18104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_18135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_08199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_18230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeMarkupCommand__CommandAssignment_18261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred22410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred32459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred333343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred353362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred373381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred383433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred433518 = new BitSet(new long[]{0x0000000000000002L});

}