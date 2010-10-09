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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER", "FRAGMENT_KEYWORD_1", "FRAGMENT_KEYWORD_2", "FRAGMENT_KEYWORD_3", "FRAGMENT_KEYWORD_4", "FRAGMENT_KEYWORD_5", "FRAGMENT_KEYWORD_6", "FRAGMENT_KEYWORD_7", "FRAGMENT_KEYWORD_8", "FRAGMENT_KEYWORD_9", "FRAGMENT_KEYWORD_10", "FRAGMENT_KEYWORD_11", "FRAGMENT_KEYWORD_12", "FRAGMENT_KEYWORD_13", "FRAGMENT_KEYWORD_14", "FRAGMENT_KEYWORD_15", "FRAGMENT_KEYWORD_16", "FRAGMENT_KEYWORD_17", "FRAGMENT_KEYWORD_18", "FRAGMENT_KEYWORD_19", "FRAGMENT_KEYWORD_20", "FRAGMENT_KEYWORD_21", "FRAGMENT_KEYWORD_22", "FRAGMENT_KEYWORD_23", "FRAGMENT_KEYWORD_24", "FRAGMENT_KEYWORD_25", "FRAGMENT_KEYWORD_26", "FRAGMENT_KEYWORD_27", "FRAGMENT_KEYWORD_28", "FRAGMENT_KEYWORD_29", "FRAGMENT_RULE_STRING", "FRAGMENT_RULE_INT", "FRAGMENT_RULE_ID", "FRAGMENT_RULE_WS", "FRAGMENT_RULE_SL_COMMENT", "FRAGMENT_RULE_ML_COMMENT", "FRAGMENT_RULE_SCHEME_SL_COMMENT", "FRAGMENT_RULE_SCHEME_ML_COMMENT", "FRAGMENT_RULE_ANY_OTHER", "SYNTHETIC_ALL_KEYWORDS", "Tokens", "'b'", "'t'", "'n'", "'f'", "'r'", "'\"'", "'''", "'\\'", "'0'", "'9'", "'a'", "'z'", "'A'", "'Z'", "'-'", "' '", "'\t'", "'\r'", "'\n'"
    };
    public static final int RULE_ID=35;
    public static final int FRAGMENT_KEYWORD_29=70;
    public static final int FRAGMENT_KEYWORD_28=69;
    public static final int RULE_SCHEME_SL_COMMENT=39;
    public static final int FRAGMENT_KEYWORD_27=68;
    public static final int FRAGMENT_KEYWORD_26=67;
    public static final int FRAGMENT_KEYWORD_25=66;
    public static final int FRAGMENT_KEYWORD_24=65;
    public static final int FRAGMENT_KEYWORD_23=64;
    public static final int FRAGMENT_KEYWORD_22=63;
    public static final int FRAGMENT_KEYWORD_21=62;
    public static final int RULE_ANY_OTHER=41;
    public static final int FRAGMENT_KEYWORD_3=44;
    public static final int FRAGMENT_KEYWORD_20=61;
    public static final int FRAGMENT_KEYWORD_4=45;
    public static final int FRAGMENT_KEYWORD_1=42;
    public static final int FRAGMENT_KEYWORD_2=43;
    public static final int FRAGMENT_KEYWORD_8=49;
    public static final int KEYWORD_19=22;
    public static final int FRAGMENT_KEYWORD_7=48;
    public static final int FRAGMENT_KEYWORD_6=47;
    public static final int KEYWORD_17=20;
    public static final int FRAGMENT_KEYWORD_5=46;
    public static final int KEYWORD_18=21;
    public static final int KEYWORD_15=18;
    public static final int KEYWORD_16=19;
    public static final int KEYWORD_13=16;
    public static final int FRAGMENT_KEYWORD_9=50;
    public static final int KEYWORD_14=17;
    public static final int KEYWORD_11=14;
    public static final int EOF=-1;
    public static final int FRAGMENT_RULE_SCHEME_ML_COMMENT=78;
    public static final int KEYWORD_12=15;
    public static final int KEYWORD_10=13;
    public static final int KEYWORD_6=9;
    public static final int KEYWORD_7=10;
    public static final int KEYWORD_8=11;
    public static final int KEYWORD_9=12;
    public static final int KEYWORD_28=31;
    public static final int KEYWORD_29=32;
    public static final int RULE_SCHEME_ML_COMMENT=40;
    public static final int RULE_INT=34;
    public static final int FRAGMENT_RULE_SL_COMMENT=75;
    public static final int KEYWORD_24=27;
    public static final int KEYWORD_25=28;
    public static final int KEYWORD_26=29;
    public static final int KEYWORD_27=30;
    public static final int KEYWORD_20=23;
    public static final int KEYWORD_21=24;
    public static final int KEYWORD_22=25;
    public static final int KEYWORD_23=26;
    public static final int KEYWORD_1=4;
    public static final int FRAGMENT_RULE_ID=73;
    public static final int KEYWORD_5=8;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_3=6;
    public static final int KEYWORD_2=5;
    public static final int RULE_SL_COMMENT=37;
    public static final int Tokens=81;
    public static final int RULE_ML_COMMENT=38;
    public static final int FRAGMENT_KEYWORD_15=56;
    public static final int FRAGMENT_KEYWORD_14=55;
    public static final int FRAGMENT_KEYWORD_17=58;
    public static final int RULE_STRING=33;
    public static final int FRAGMENT_KEYWORD_16=57;
    public static final int FRAGMENT_KEYWORD_19=60;
    public static final int FRAGMENT_KEYWORD_18=59;
    public static final int FRAGMENT_RULE_STRING=71;
    public static final int SYNTHETIC_ALL_KEYWORDS=80;
    public static final int FRAGMENT_RULE_INT=72;
    public static final int FRAGMENT_KEYWORD_11=52;
    public static final int FRAGMENT_KEYWORD_10=51;
    public static final int FRAGMENT_KEYWORD_13=54;
    public static final int FRAGMENT_KEYWORD_12=53;
    public static final int FRAGMENT_RULE_ML_COMMENT=76;
    public static final int FRAGMENT_RULE_WS=74;
    public static final int RULE_WS=36;
    public static final int FRAGMENT_RULE_SCHEME_SL_COMMENT=77;
    public static final int FRAGMENT_RULE_ANY_OTHER=79;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[282+1];
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
    		tokenNameToValue.put("KEYWORD_26", "'lines'");
    		tokenNameToValue.put("KEYWORD_27", "'\\markup'");
    		tokenNameToValue.put("KEYWORD_28", "'\\include'");
    		tokenNameToValue.put("KEYWORD_29", "'\\version'");
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

                if ( ((LA1_0>=KEYWORD_1 && LA1_0<=KEYWORD_2)||(LA1_0>=KEYWORD_4 && LA1_0<=KEYWORD_14)||LA1_0==KEYWORD_16||LA1_0==KEYWORD_18||LA1_0==KEYWORD_23||LA1_0==KEYWORD_25||(LA1_0>=KEYWORD_27 && LA1_0<=RULE_ID)||LA1_0==RULE_ANY_OTHER) ) {
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


    // $ANTLR start entryRuleMarkupKeyword
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:486:1: entryRuleMarkupKeyword : ruleMarkupKeyword EOF ;
    public final void entryRuleMarkupKeyword() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:490:1: ( ruleMarkupKeyword EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:491:1: ruleMarkupKeyword EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupKeywordRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupKeyword_in_entryRuleMarkupKeyword962);
            ruleMarkupKeyword();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupKeywordRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupKeyword969); if (failed) return ;

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
    // $ANTLR end entryRuleMarkupKeyword


    // $ANTLR start ruleMarkupKeyword
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:501:1: ruleMarkupKeyword : ( ( rule__MarkupKeyword__Group__0 ) ) ;
    public final void ruleMarkupKeyword() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:506:5: ( ( ( rule__MarkupKeyword__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:507:1: ( ( rule__MarkupKeyword__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:507:1: ( ( rule__MarkupKeyword__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:508:1: ( rule__MarkupKeyword__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupKeywordAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:509:1: ( rule__MarkupKeyword__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:509:2: rule__MarkupKeyword__Group__0
            {
            pushFollow(FOLLOW_rule__MarkupKeyword__Group__0_in_ruleMarkupKeyword1003);
            rule__MarkupKeyword__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupKeywordAccess().getGroup()); 
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
    // $ANTLR end ruleMarkupKeyword


    // $ANTLR start entryRuleMarkupBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:522:1: entryRuleMarkupBlock : ruleMarkupBlock EOF ;
    public final void entryRuleMarkupBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:523:1: ( ruleMarkupBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:524:1: ruleMarkupBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupBlock_in_entryRuleMarkupBlock1030);
            ruleMarkupBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBlock1037); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:531:1: ruleMarkupBlock : ( ( rule__MarkupBlock__Group__0 ) ) ;
    public final void ruleMarkupBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:535:5: ( ( ( rule__MarkupBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:536:1: ( ( rule__MarkupBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:536:1: ( ( rule__MarkupBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:537:1: ( rule__MarkupBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:538:1: ( rule__MarkupBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:538:2: rule__MarkupBlock__Group__0
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__0_in_ruleMarkupBlock1067);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:550:1: entryRuleMarkupExpression : ruleMarkupExpression EOF ;
    public final void entryRuleMarkupExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:551:1: ( ruleMarkupExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:552:1: ruleMarkupExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupExpression_in_entryRuleMarkupExpression1094);
            ruleMarkupExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupExpression1101); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:559:1: ruleMarkupExpression : ( ( rule__MarkupExpression__Alternatives ) ) ;
    public final void ruleMarkupExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:563:5: ( ( ( rule__MarkupExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:564:1: ( ( rule__MarkupExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:564:1: ( ( rule__MarkupExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:565:1: ( rule__MarkupExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:566:1: ( rule__MarkupExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:566:2: rule__MarkupExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkupExpression__Alternatives_in_ruleMarkupExpression1131);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:578:1: entryRuleMarkupCommand : ruleMarkupCommand EOF ;
    public final void entryRuleMarkupCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:582:1: ( ruleMarkupCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:583:1: ruleMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupCommand_in_entryRuleMarkupCommand1163);
            ruleMarkupCommand();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupCommand1170); if (failed) return ;

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
    // $ANTLR end entryRuleMarkupCommand


    // $ANTLR start ruleMarkupCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:593:1: ruleMarkupCommand : ( ( rule__MarkupCommand__Group__0 ) ) ;
    public final void ruleMarkupCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:598:5: ( ( ( rule__MarkupCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:599:1: ( ( rule__MarkupCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:599:1: ( ( rule__MarkupCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:600:1: ( rule__MarkupCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:601:1: ( rule__MarkupCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:601:2: rule__MarkupCommand__Group__0
            {
            pushFollow(FOLLOW_rule__MarkupCommand__Group__0_in_ruleMarkupCommand1204);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleMarkupCommand


    // $ANTLR start entryRuleReference
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:614:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:618:1: ( ruleReference EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:619:1: ruleReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1236);
            ruleReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1243); if (failed) return ;

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
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:629:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:634:5: ( ( ( rule__Reference__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:635:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:635:1: ( ( rule__Reference__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:636:1: ( rule__Reference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:637:1: ( rule__Reference__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:637:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1277);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleReferenceName
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:650:1: entryRuleReferenceName : ruleReferenceName EOF ;
    public final void entryRuleReferenceName() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:651:1: ( ruleReferenceName EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:652:1: ruleReferenceName EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceNameRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceName_in_entryRuleReferenceName1304);
            ruleReferenceName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceName1311); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:659:1: ruleReferenceName : ( ( rule__ReferenceName__Alternatives ) ) ;
    public final void ruleReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:663:5: ( ( ( rule__ReferenceName__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:664:1: ( ( rule__ReferenceName__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:664:1: ( ( rule__ReferenceName__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:665:1: ( rule__ReferenceName__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceNameAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:666:1: ( rule__ReferenceName__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:666:2: rule__ReferenceName__Alternatives
            {
            pushFollow(FOLLOW_rule__ReferenceName__Alternatives_in_ruleReferenceName1341);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:678:1: entryRuleSpecialCharacter : ruleSpecialCharacter EOF ;
    public final void entryRuleSpecialCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:679:1: ( ruleSpecialCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:680:1: ruleSpecialCharacter EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1368);
            ruleSpecialCharacter();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSpecialCharacterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCharacter1375); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:687:1: ruleSpecialCharacter : ( ( rule__SpecialCharacter__Alternatives ) ) ;
    public final void ruleSpecialCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:691:5: ( ( ( rule__SpecialCharacter__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:692:1: ( ( rule__SpecialCharacter__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:692:1: ( ( rule__SpecialCharacter__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:693:1: ( rule__SpecialCharacter__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCharacterAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:694:1: ( rule__SpecialCharacter__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:694:2: rule__SpecialCharacter__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecialCharacter__Alternatives_in_ruleSpecialCharacter1405);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:706:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:707:1: ( ruleText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:708:1: ruleText EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText1432);
            ruleText();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1439); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:715:1: ruleText : ( ( rule__Text__ValueAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:719:5: ( ( ( rule__Text__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:720:1: ( ( rule__Text__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:720:1: ( ( rule__Text__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:721:1: ( rule__Text__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:722:1: ( rule__Text__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:722:2: rule__Text__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Text__ValueAssignment_in_ruleText1469);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:734:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:735:1: ( ruleNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:736:1: ruleNumber EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1496);
            ruleNumber();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1503); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:743:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:747:5: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:748:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:748:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:749:1: ( rule__Number__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:750:1: ( rule__Number__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:750:2: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1533);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:762:1: entryRuleScheme : ruleScheme EOF ;
    public final void entryRuleScheme() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:766:1: ( ruleScheme EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:767:1: ruleScheme EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeRule()); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme1565);
            ruleScheme();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme1572); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:777:1: ruleScheme : ( ( rule__Scheme__Group__0 ) ) ;
    public final void ruleScheme() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:782:5: ( ( ( rule__Scheme__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:1: ( ( rule__Scheme__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:1: ( ( rule__Scheme__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:784:1: ( rule__Scheme__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:785:1: ( rule__Scheme__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:785:2: rule__Scheme__Group__0
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0_in_ruleScheme1606);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:798:1: entryRuleSchemeExpression : ruleSchemeExpression EOF ;
    public final void entryRuleSchemeExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:799:1: ( ruleSchemeExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:800:1: ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression1633);
            ruleSchemeExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression1640); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:807:1: ruleSchemeExpression : ( ( rule__SchemeExpression__Group__0 ) ) ;
    public final void ruleSchemeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:811:5: ( ( ( rule__SchemeExpression__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:812:1: ( ( rule__SchemeExpression__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:812:1: ( ( rule__SchemeExpression__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:813:1: ( rule__SchemeExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:814:1: ( rule__SchemeExpression__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:814:2: rule__SchemeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0_in_ruleSchemeExpression1670);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:826:1: entryRuleSchemeValue : ruleSchemeValue EOF ;
    public final void entryRuleSchemeValue() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:827:1: ( ruleSchemeValue EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:828:1: ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue1697);
            ruleSchemeValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue1704); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:835:1: ruleSchemeValue : ( ( rule__SchemeValue__Alternatives ) ) ;
    public final void ruleSchemeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:839:5: ( ( ( rule__SchemeValue__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:840:1: ( ( rule__SchemeValue__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:840:1: ( ( rule__SchemeValue__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:841:1: ( rule__SchemeValue__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeValueAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:842:1: ( rule__SchemeValue__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:842:2: rule__SchemeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeValue__Alternatives_in_ruleSchemeValue1734);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:854:1: entryRuleSchemeBoolean : ruleSchemeBoolean EOF ;
    public final void entryRuleSchemeBoolean() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:855:1: ( ruleSchemeBoolean EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:856:1: ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1761);
            ruleSchemeBoolean();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean1768); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:863:1: ruleSchemeBoolean : ( ( rule__SchemeBoolean__ValueAssignment ) ) ;
    public final void ruleSchemeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:867:5: ( ( ( rule__SchemeBoolean__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:868:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:868:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:869:1: ( rule__SchemeBoolean__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:870:1: ( rule__SchemeBoolean__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:870:2: rule__SchemeBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeBoolean__ValueAssignment_in_ruleSchemeBoolean1798);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:882:1: entryRuleSchemeList : ruleSchemeList EOF ;
    public final void entryRuleSchemeList() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:883:1: ( ruleSchemeList EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:884:1: ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList1825);
            ruleSchemeList();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList1832); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:891:1: ruleSchemeList : ( ( rule__SchemeList__Group__0 ) ) ;
    public final void ruleSchemeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:895:5: ( ( ( rule__SchemeList__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:1: ( ( rule__SchemeList__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:1: ( ( rule__SchemeList__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:897:1: ( rule__SchemeList__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:898:1: ( rule__SchemeList__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:898:2: rule__SchemeList__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0_in_ruleSchemeList1862);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:910:1: entryRuleSchemeBlock : ruleSchemeBlock EOF ;
    public final void entryRuleSchemeBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:911:1: ( ruleSchemeBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:912:1: ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1889);
            ruleSchemeBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock1896); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:919:1: ruleSchemeBlock : ( ( rule__SchemeBlock__Group__0 ) ) ;
    public final void ruleSchemeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:923:5: ( ( ( rule__SchemeBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:924:1: ( ( rule__SchemeBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:924:1: ( ( rule__SchemeBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:925:1: ( rule__SchemeBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:926:1: ( rule__SchemeBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:926:2: rule__SchemeBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0_in_ruleSchemeBlock1926);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:938:1: entryRuleSchemeCharacter : ruleSchemeCharacter EOF ;
    public final void entryRuleSchemeCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:939:1: ( ruleSchemeCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:940:1: ruleSchemeCharacter EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter1953);
            ruleSchemeCharacter();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeCharacterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter1960); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:947:1: ruleSchemeCharacter : ( ( rule__SchemeCharacter__Group__0 ) ) ;
    public final void ruleSchemeCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:951:5: ( ( ( rule__SchemeCharacter__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:952:1: ( ( rule__SchemeCharacter__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:952:1: ( ( rule__SchemeCharacter__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:953:1: ( rule__SchemeCharacter__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:954:1: ( rule__SchemeCharacter__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:954:2: rule__SchemeCharacter__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__0_in_ruleSchemeCharacter1990);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:966:1: entryRuleSchemeText : ruleSchemeText EOF ;
    public final void entryRuleSchemeText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:967:1: ( ruleSchemeText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:968:1: ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText2017);
            ruleSchemeText();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText2024); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:975:1: ruleSchemeText : ( ( rule__SchemeText__ValueAssignment ) ) ;
    public final void ruleSchemeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:979:5: ( ( ( rule__SchemeText__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:980:1: ( ( rule__SchemeText__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:980:1: ( ( rule__SchemeText__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:981:1: ( rule__SchemeText__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:982:1: ( rule__SchemeText__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:982:2: rule__SchemeText__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText2054);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:994:1: entryRuleSchemeTextLiterals : ruleSchemeTextLiterals EOF ;
    public final void entryRuleSchemeTextLiterals() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:995:1: ( ruleSchemeTextLiterals EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:996:1: ruleSchemeTextLiterals EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextLiteralsRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals2081);
            ruleSchemeTextLiterals();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextLiteralsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiterals2088); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1003:1: ruleSchemeTextLiterals : ( ( rule__SchemeTextLiterals__Alternatives ) ) ;
    public final void ruleSchemeTextLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1007:5: ( ( ( rule__SchemeTextLiterals__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1008:1: ( ( rule__SchemeTextLiterals__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1008:1: ( ( rule__SchemeTextLiterals__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1009:1: ( rule__SchemeTextLiterals__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextLiteralsAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1010:1: ( rule__SchemeTextLiterals__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1010:2: rule__SchemeTextLiterals__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeTextLiterals__Alternatives_in_ruleSchemeTextLiterals2118);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1022:1: entryRuleSchemeNumber : ruleSchemeNumber EOF ;
    public final void entryRuleSchemeNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1026:1: ( ruleSchemeNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1027:1: ruleSchemeNumber EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber2150);
            ruleSchemeNumber();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber2157); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1037:1: ruleSchemeNumber : ( ( rule__SchemeNumber__Group__0 ) ) ;
    public final void ruleSchemeNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1042:5: ( ( ( rule__SchemeNumber__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1043:1: ( ( rule__SchemeNumber__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1043:1: ( ( rule__SchemeNumber__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1044:1: ( rule__SchemeNumber__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1045:1: ( rule__SchemeNumber__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1045:2: rule__SchemeNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0_in_ruleSchemeNumber2191);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1058:1: entryRuleSchemeNumberRadix : ruleSchemeNumberRadix EOF ;
    public final void entryRuleSchemeNumberRadix() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1062:1: ( ruleSchemeNumberRadix EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1063:1: ruleSchemeNumberRadix EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix2223);
            ruleSchemeNumberRadix();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRadixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix2230); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1073:1: ruleSchemeNumberRadix : ( ( rule__SchemeNumberRadix__Group__0 ) ) ;
    public final void ruleSchemeNumberRadix() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1078:5: ( ( ( rule__SchemeNumberRadix__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1079:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1079:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1080:1: ( rule__SchemeNumberRadix__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1081:1: ( rule__SchemeNumberRadix__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1081:2: rule__SchemeNumberRadix__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__0_in_ruleSchemeNumberRadix2264);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1094:1: entryRuleSchemeMarkupCommand : ruleSchemeMarkupCommand EOF ;
    public final void entryRuleSchemeMarkupCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1098:1: ( ruleSchemeMarkupCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1099:1: ruleSchemeMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand2296);
            ruleSchemeMarkupCommand();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeMarkupCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand2303); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1109:1: ruleSchemeMarkupCommand : ( ( rule__SchemeMarkupCommand__Group__0 ) ) ;
    public final void ruleSchemeMarkupCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1114:5: ( ( ( rule__SchemeMarkupCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1115:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1115:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1116:1: ( rule__SchemeMarkupCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1117:1: ( rule__SchemeMarkupCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1117:2: rule__SchemeMarkupCommand__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__0_in_ruleSchemeMarkupCommand2337);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1130:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1131:1: ( ruleBOOL EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1132:1: ruleBOOL EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL2364);
            ruleBOOL();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBOOLRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL2371); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1139:1: ruleBOOL : ( ( rule__BOOL__Group__0 ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1143:5: ( ( ( rule__BOOL__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1144:1: ( ( rule__BOOL__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1144:1: ( ( rule__BOOL__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1145:1: ( rule__BOOL__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1146:1: ( rule__BOOL__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1146:2: rule__BOOL__Group__0
            {
            pushFollow(FOLLOW_rule__BOOL__Group__0_in_ruleBOOL2401);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1158:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );
    public final void rule__ToplevelExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1162:1: ( ( ruleAssignment ) | ( ruleCommonExpression ) )
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
                        new NoViableAltException("1158:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 1, input);

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
                        new NoViableAltException("1158:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
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
            case KEYWORD_23:
            case KEYWORD_25:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt2=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1158:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( ruleAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( ruleAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1164:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__ToplevelExpression__Alternatives2437);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1169:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1169:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1170:1: ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getToplevelExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_rule__ToplevelExpression__Alternatives2454);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1180:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1184:1: ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) )
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
                        new NoViableAltException("1180:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 1, input);

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
                        new NoViableAltException("1180:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
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
            case KEYWORD_23:
            case KEYWORD_25:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1180:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1185:1: ( rulePropertyAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1185:1: ( rulePropertyAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1186:1: rulePropertyAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_rule__Expression__Alternatives2486);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1191:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1191:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1192:1: ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_rule__Expression__Alternatives2503);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1202:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__CommonExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1206:1: ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
                {
                alt4=1;
                }
                break;
            case KEYWORD_16:
            case KEYWORD_23:
                {
                alt4=2;
                }
                break;
            case KEYWORD_2:
                {
                alt4=3;
                }
                break;
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
            case KEYWORD_25:
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
                    new NoViableAltException("1202:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1207:1: ( ruleCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1207:1: ( ruleCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1208:1: ruleCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCommand_in_rule__CommonExpression__Alternatives2535);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1213:6: ( ruleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1213:6: ( ruleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1214:1: ruleBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__CommonExpression__Alternatives2552);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1219:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1219:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1220:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getSchemeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__CommonExpression__Alternatives2569);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1225:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1225:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1226:1: ruleText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__CommonExpression__Alternatives2586);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1231:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1231:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1232:1: ruleNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getNumberParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumber_in_rule__CommonExpression__Alternatives2603);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1242:1: rule__Assignment__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Assignment__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1246:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    new NoViableAltException("1242:1: rule__Assignment__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1247:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1247:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1248:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__NameAlternatives_0_02635); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1253:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1253:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1254:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assignment__NameAlternatives_0_02652); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1264:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__PropertyAssignment__IdAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1268:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    new NoViableAltException("1264:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1269:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1269:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1270:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPropertyAssignmentAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyAssignment__IdAlternatives_0_02684); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPropertyAssignmentAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1275:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1275:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1276:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPropertyAssignmentAccess().getIdSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertyAssignment__IdAlternatives_0_02701); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1286:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1290:1: ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) )
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
                    new NoViableAltException("1286:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1291:1: ( ruleSimpleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1291:1: ( ruleSimpleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1292:1: ruleSimpleBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives2733);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1297:6: ( ruleSimultaneousBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1297:6: ( ruleSimultaneousBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1298:1: ruleSimultaneousBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives2750);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1308:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1312:1: ( ( ruleSpecialCommand ) | ( ruleReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=KEYWORD_27 && LA8_0<=KEYWORD_29)) ) {
                alt8=1;
            }
            else if ( (LA8_0==KEYWORD_13) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1308:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1313:1: ( ruleSpecialCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1313:1: ( ruleSpecialCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1314:1: ruleSpecialCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives2782);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1319:6: ( ruleReference )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1319:6: ( ruleReference )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1320:1: ruleReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReference_in_rule__Command__Alternatives2799);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1330:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) );
    public final void rule__SpecialCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1334:1: ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case KEYWORD_28:
                {
                alt9=1;
                }
                break;
            case KEYWORD_29:
                {
                alt9=2;
                }
                break;
            case KEYWORD_27:
                {
                alt9=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1330:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1335:1: ( ruleInclude )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1335:1: ( ruleInclude )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1336:1: ruleInclude
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives2831);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1341:6: ( ruleVersion )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1341:6: ( ruleVersion )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1342:1: ruleVersion
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives2848);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1347:6: ( ruleMarkup )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1347:6: ( ruleMarkup )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1348:1: ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_rule__SpecialCommand__Alternatives2865);
                    ruleMarkup();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1358:1: rule__MarkupExpression__Alternatives : ( ( ruleMarkupCommand ) | ( ruleMarkupBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__MarkupExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1362:1: ( ( ruleMarkupCommand ) | ( ruleMarkupBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
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
            case KEYWORD_25:
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
                    new NoViableAltException("1358:1: rule__MarkupExpression__Alternatives : ( ( ruleMarkupCommand ) | ( ruleMarkupBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1363:1: ( ruleMarkupCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1363:1: ( ruleMarkupCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1364:1: ruleMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getMarkupCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMarkupCommand_in_rule__MarkupExpression__Alternatives2897);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1369:6: ( ruleMarkupBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1369:6: ( ruleMarkupBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1370:1: ruleMarkupBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getMarkupBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleMarkupBlock_in_rule__MarkupExpression__Alternatives2914);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1376:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getSchemeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__MarkupExpression__Alternatives2931);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1381:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1381:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1382:1: ruleText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__MarkupExpression__Alternatives2948);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1387:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1387:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1388:1: ruleNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupExpressionAccess().getNumberParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumber_in_rule__MarkupExpression__Alternatives2965);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1398:1: rule__ReferenceName__Alternatives : ( ( RULE_ID ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleSpecialCharacter ) );
    public final void rule__ReferenceName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1402:1: ( ( RULE_ID ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleSpecialCharacter ) )
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
                    new NoViableAltException("1398:1: rule__ReferenceName__Alternatives : ( ( RULE_ID ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleSpecialCharacter ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1403:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1403:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1404:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getReferenceNameAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceName__Alternatives2997); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getReferenceNameAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1409:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1409:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1410:1: KEYWORD_5
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getReferenceNameAccess().getLeftParenthesisKeyword_1()); 
                    }
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__ReferenceName__Alternatives3015); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getReferenceNameAccess().getLeftParenthesisKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1417:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1417:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1418:1: KEYWORD_6
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getReferenceNameAccess().getRightParenthesisKeyword_2()); 
                    }
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__ReferenceName__Alternatives3035); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getReferenceNameAccess().getRightParenthesisKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1425:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1425:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1426:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getReferenceNameAccess().getSpecialCharacterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__ReferenceName__Alternatives3054);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1436:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_11 ) | ( KEYWORD_12 ) | ( KEYWORD_14 ) | ( KEYWORD_18 ) );
    public final void rule__SpecialCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1440:1: ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_11 ) | ( KEYWORD_12 ) | ( KEYWORD_14 ) | ( KEYWORD_18 ) )
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
                    new NoViableAltException("1436:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_11 ) | ( KEYWORD_12 ) | ( KEYWORD_14 ) | ( KEYWORD_18 ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1441:1: ( KEYWORD_1 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1441:1: ( KEYWORD_1 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1442:1: KEYWORD_1
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__SpecialCharacter__Alternatives3087); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1449:6: ( KEYWORD_7 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1449:6: ( KEYWORD_7 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1450:1: KEYWORD_7
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1()); 
                    }
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__SpecialCharacter__Alternatives3107); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1457:6: ( KEYWORD_9 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1457:6: ( KEYWORD_9 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1458:1: KEYWORD_9
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__SpecialCharacter__Alternatives3127); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:6: ( KEYWORD_11 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:6: ( KEYWORD_11 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1466:1: KEYWORD_11
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3()); 
                    }
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__SpecialCharacter__Alternatives3147); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1473:6: ( KEYWORD_12 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1473:6: ( KEYWORD_12 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1474:1: KEYWORD_12
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4()); 
                    }
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__SpecialCharacter__Alternatives3167); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1481:6: ( KEYWORD_14 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1481:6: ( KEYWORD_14 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1482:1: KEYWORD_14
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5()); 
                    }
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__SpecialCharacter__Alternatives3187); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1489:6: ( KEYWORD_18 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1489:6: ( KEYWORD_18 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1490:1: KEYWORD_18
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getTildeKeyword_6()); 
                    }
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__SpecialCharacter__Alternatives3207); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1502:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) );
    public final void rule__Text__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1506:1: ( ( ruleSchemeTextLiterals ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
            case KEYWORD_25:
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
                    new NoViableAltException("1502:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiterals ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1507:1: ( ruleSchemeTextLiterals )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1507:1: ( ruleSchemeTextLiterals )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1508:1: ruleSchemeTextLiterals
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueSchemeTextLiteralsParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_03241);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1513:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1513:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1514:1: KEYWORD_5
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1()); 
                    }
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Text__ValueAlternatives_03259); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1521:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1521:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1522:1: KEYWORD_6
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2()); 
                    }
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Text__ValueAlternatives_03279); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1529:6: ( KEYWORD_4 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1529:6: ( KEYWORD_4 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1530:1: KEYWORD_4
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3()); 
                    }
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__Text__ValueAlternatives_03299); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1537:6: ( KEYWORD_8 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1537:6: ( KEYWORD_8 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1538:1: KEYWORD_8
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueCommaKeyword_0_4()); 
                    }
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__Text__ValueAlternatives_03319); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );
    public final void rule__SchemeExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1554:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) )
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

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                int LA17_3 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_21:
                {
                int LA17_4 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_20:
                {
                int LA17_5 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 5, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_25:
                {
                int LA17_6 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 6, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_10:
                {
                int LA17_7 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 7, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_1:
                {
                int LA17_8 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 8, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_7:
                {
                int LA17_9 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 9, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_9:
                {
                int LA17_10 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 10, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_11:
                {
                int LA17_11 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 11, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_12:
                {
                int LA17_12 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 12, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_14:
                {
                int LA17_13 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 13, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_18:
                {
                int LA17_14 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 14, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA17_15 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 15, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA17_16 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 16, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ANY_OTHER:
                {
                int LA17_17 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 17, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA17_18 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 18, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_19:
                {
                int LA17_19 = input.LA(2);

                if ( (synpred32()) ) {
                    alt17=1;
                }
                else if ( (synpred34()) ) {
                    alt17=2;
                }
                else if ( (synpred36()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 19, input);

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
                    new NoViableAltException("1550:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1556:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1557:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==KEYWORD_4) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1557:2: rule__SchemeExpression__QuotedAssignment_0_0
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_rule__SchemeExpression__Alternatives_03353);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1561:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1561:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1562:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1563:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==KEYWORD_15) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1563:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_rule__SchemeExpression__Alternatives_03372);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1567:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1567:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1568:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1569:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==KEYWORD_8) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1569:2: rule__SchemeExpression__UnquotedAssignment_0_2
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_rule__SchemeExpression__Alternatives_03391);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1573:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 ) )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1573:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 ) )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1574:1: ( rule__SchemeExpression__VariableAssignment_0_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getVariableAssignment_0_3()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1575:1: ( rule__SchemeExpression__VariableAssignment_0_3 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1575:2: rule__SchemeExpression__VariableAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__SchemeExpression__VariableAssignment_0_3_in_rule__SchemeExpression__Alternatives_03410);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1584:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );
    public final void rule__SchemeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1588:1: ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==KEYWORD_5) ) {
                    alt18=2;
                }
                else if ( (LA18_1==RULE_ID) ) {
                    int LA18_8 = input.LA(3);

                    if ( (synpred37()) ) {
                        alt18=1;
                    }
                    else if ( (synpred42()) ) {
                        alt18=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1584:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 18, 8, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1584:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 18, 1, input);

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
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_14:
            case KEYWORD_18:
            case KEYWORD_25:
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
                    new NoViableAltException("1584:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1589:1: ( ruleSchemeBoolean )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1589:1: ( ruleSchemeBoolean )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1590:1: ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives3443);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1595:6: ( ruleSchemeList )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1595:6: ( ruleSchemeList )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1596:1: ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives3460);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:6: ( ruleSchemeBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1601:6: ( ruleSchemeBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1602:1: ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives3477);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1607:6: ( ruleSchemeCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1607:6: ( ruleSchemeCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1608:1: ruleSchemeCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_rule__SchemeValue__Alternatives3494);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1613:6: ( ruleSchemeText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1613:6: ( ruleSchemeText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1614:1: ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives3511);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1619:6: ( ruleSchemeNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1619:6: ( ruleSchemeNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1620:1: ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives3528);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1625:6: ( ruleSchemeMarkupCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1625:6: ( ruleSchemeMarkupCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1626:1: ruleSchemeMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_rule__SchemeValue__Alternatives3545);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1636:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeCharacter__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1640:1: ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) )
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
                    new NoViableAltException("1636:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1641:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1641:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1642:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeCharacter__ValueAlternatives_1_03577); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeCharacterAccess().getValueIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1647:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1647:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1648:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeCharacter__ValueAlternatives_1_03594);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1653:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1653:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1654:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueANY_OTHERTerminalRuleCall_1_0_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeCharacter__ValueAlternatives_1_03611); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1664:1: rule__SchemeTextLiterals__Alternatives : ( ( KEYWORD_25 ) | ( KEYWORD_10 ) | ( ruleSpecialCharacter ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeTextLiterals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1668:1: ( ( KEYWORD_25 ) | ( KEYWORD_10 ) | ( ruleSpecialCharacter ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
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
                    new NoViableAltException("1664:1: rule__SchemeTextLiterals__Alternatives : ( ( KEYWORD_25 ) | ( KEYWORD_10 ) | ( ruleSpecialCharacter ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1669:1: ( KEYWORD_25 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1669:1: ( KEYWORD_25 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1670:1: KEYWORD_25
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }
                    match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__SchemeTextLiterals__Alternatives3644); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1677:6: ( KEYWORD_10 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1677:6: ( KEYWORD_10 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1678:1: KEYWORD_10
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__SchemeTextLiterals__Alternatives3664); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1685:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1685:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1686:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getSpecialCharacterParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiterals__Alternatives3683);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1691:6: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1691:6: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1692:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_3()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives3700); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getIDTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1697:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1697:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1698:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_4()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives3717); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralsAccess().getSTRINGTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1703:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1703:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1704:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralsAccess().getANY_OTHERTerminalRuleCall_5()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives3734); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1716:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1720:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1721:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03764);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03767);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1728:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1732:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1733:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1733:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1734:1: ( rule__Assignment__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1735:1: ( rule__Assignment__NameAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1735:2: rule__Assignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl3794);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1745:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1749:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1750:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13824);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13827);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1757:1: rule__Assignment__Group__1__Impl : ( KEYWORD_10 ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1761:1: ( ( KEYWORD_10 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1762:1: ( KEYWORD_10 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1762:1: ( KEYWORD_10 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1763:1: KEYWORD_10
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__Assignment__Group__1__Impl3855); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1776:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1780:1: ( rule__Assignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1781:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__23886);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1787:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1791:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1792:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1792:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1793:1: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1794:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1794:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl3913);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1810:1: rule__PropertyAssignment__Group__0 : rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 ;
    public final void rule__PropertyAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1814:1: ( rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1815:2: rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__03949);
            rule__PropertyAssignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__03952);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1822:1: rule__PropertyAssignment__Group__0__Impl : ( ( rule__PropertyAssignment__IdAssignment_0 ) ) ;
    public final void rule__PropertyAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1826:1: ( ( ( rule__PropertyAssignment__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1827:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1827:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1828:1: ( rule__PropertyAssignment__IdAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1829:1: ( rule__PropertyAssignment__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1829:2: rule__PropertyAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl3979);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1839:1: rule__PropertyAssignment__Group__1 : rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 ;
    public final void rule__PropertyAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1843:1: ( rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1844:2: rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__14009);
            rule__PropertyAssignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__14012);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1851:1: rule__PropertyAssignment__Group__1__Impl : ( KEYWORD_10 ) ;
    public final void rule__PropertyAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1855:1: ( ( KEYWORD_10 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1856:1: ( KEYWORD_10 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1856:1: ( KEYWORD_10 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1857:1: KEYWORD_10
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__PropertyAssignment__Group__1__Impl4040); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1870:1: rule__PropertyAssignment__Group__2 : rule__PropertyAssignment__Group__2__Impl ;
    public final void rule__PropertyAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1874:1: ( rule__PropertyAssignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1875:2: rule__PropertyAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__24071);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1881:1: rule__PropertyAssignment__Group__2__Impl : ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) ;
    public final void rule__PropertyAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1885:1: ( ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1886:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1886:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1887:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1888:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1888:2: rule__PropertyAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl4098);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1904:1: rule__SimpleBlock__Group__0 : rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 ;
    public final void rule__SimpleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1908:1: ( rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1909:2: rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__04134);
            rule__SimpleBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__04137);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1916:1: rule__SimpleBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimpleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1920:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1921:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1921:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1922:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1923:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1925:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1935:1: rule__SimpleBlock__Group__1 : rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 ;
    public final void rule__SimpleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1939:1: ( rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1940:2: rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__14195);
            rule__SimpleBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__14198);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1947:1: rule__SimpleBlock__Group__1__Impl : ( KEYWORD_16 ) ;
    public final void rule__SimpleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1951:1: ( ( KEYWORD_16 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1952:1: ( KEYWORD_16 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1952:1: ( KEYWORD_16 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1953:1: KEYWORD_16
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__SimpleBlock__Group__1__Impl4226); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1966:1: rule__SimpleBlock__Group__2 : rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 ;
    public final void rule__SimpleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1970:1: ( rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1971:2: rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__24257);
            rule__SimpleBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__24260);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1978:1: rule__SimpleBlock__Group__2__Impl : ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimpleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1982:1: ( ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1983:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1983:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1984:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1985:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=KEYWORD_1 && LA21_0<=KEYWORD_2)||(LA21_0>=KEYWORD_4 && LA21_0<=KEYWORD_14)||LA21_0==KEYWORD_16||LA21_0==KEYWORD_18||LA21_0==KEYWORD_23||LA21_0==KEYWORD_25||(LA21_0>=KEYWORD_27 && LA21_0<=RULE_ID)||LA21_0==RULE_ANY_OTHER) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1985:2: rule__SimpleBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl4287);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1995:1: rule__SimpleBlock__Group__3 : rule__SimpleBlock__Group__3__Impl ;
    public final void rule__SimpleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1999:1: ( rule__SimpleBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2000:2: rule__SimpleBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__34318);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2006:1: rule__SimpleBlock__Group__3__Impl : ( KEYWORD_17 ) ;
    public final void rule__SimpleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2010:1: ( ( KEYWORD_17 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2011:1: ( KEYWORD_17 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2011:1: ( KEYWORD_17 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2012:1: KEYWORD_17
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__SimpleBlock__Group__3__Impl4346); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2033:1: rule__SimultaneousBlock__Group__0 : rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 ;
    public final void rule__SimultaneousBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2037:1: ( rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2038:2: rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__04385);
            rule__SimultaneousBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__04388);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2045:1: rule__SimultaneousBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimultaneousBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2049:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2050:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2050:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2051:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2052:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2054:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2064:1: rule__SimultaneousBlock__Group__1 : rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 ;
    public final void rule__SimultaneousBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2068:1: ( rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2069:2: rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__14446);
            rule__SimultaneousBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__14449);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2076:1: rule__SimultaneousBlock__Group__1__Impl : ( KEYWORD_23 ) ;
    public final void rule__SimultaneousBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2080:1: ( ( KEYWORD_23 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2081:1: ( KEYWORD_23 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2081:1: ( KEYWORD_23 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2082:1: KEYWORD_23
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
            }
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__SimultaneousBlock__Group__1__Impl4477); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2095:1: rule__SimultaneousBlock__Group__2 : rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 ;
    public final void rule__SimultaneousBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2099:1: ( rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2100:2: rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__24508);
            rule__SimultaneousBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__24511);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2107:1: rule__SimultaneousBlock__Group__2__Impl : ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimultaneousBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2111:1: ( ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2112:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2112:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2113:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2114:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=KEYWORD_1 && LA22_0<=KEYWORD_2)||(LA22_0>=KEYWORD_4 && LA22_0<=KEYWORD_14)||LA22_0==KEYWORD_16||LA22_0==KEYWORD_18||LA22_0==KEYWORD_23||LA22_0==KEYWORD_25||(LA22_0>=KEYWORD_27 && LA22_0<=RULE_ID)||LA22_0==RULE_ANY_OTHER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2114:2: rule__SimultaneousBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl4538);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2124:1: rule__SimultaneousBlock__Group__3 : rule__SimultaneousBlock__Group__3__Impl ;
    public final void rule__SimultaneousBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2128:1: ( rule__SimultaneousBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2129:2: rule__SimultaneousBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__34569);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2135:1: rule__SimultaneousBlock__Group__3__Impl : ( KEYWORD_24 ) ;
    public final void rule__SimultaneousBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2139:1: ( ( KEYWORD_24 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2140:1: ( KEYWORD_24 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2140:1: ( KEYWORD_24 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2141:1: KEYWORD_24
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            }
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__SimultaneousBlock__Group__3__Impl4597); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2162:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2166:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2167:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__04636);
            rule__Include__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__04639);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2174:1: rule__Include__Group__0__Impl : ( ( rule__Include__KeywordAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2178:1: ( ( ( rule__Include__KeywordAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2179:1: ( ( rule__Include__KeywordAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2179:1: ( ( rule__Include__KeywordAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2180:1: ( rule__Include__KeywordAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getKeywordAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2181:1: ( rule__Include__KeywordAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2181:2: rule__Include__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__KeywordAssignment_0_in_rule__Include__Group__0__Impl4666);
            rule__Include__KeywordAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getKeywordAssignment_0()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2191:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2195:1: ( rule__Include__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2196:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__14696);
            rule__Include__Group__1__Impl();
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2202:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2206:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2208:1: ( rule__Include__ImportURIAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2209:1: ( rule__Include__ImportURIAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2209:2: rule__Include__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_1_in_rule__Include__Group__1__Impl4723);
            rule__Include__ImportURIAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
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


    // $ANTLR start rule__Version__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2223:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2227:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2228:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__04757);
            rule__Version__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__04760);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2235:1: rule__Version__Group__0__Impl : ( ( rule__Version__KeywordAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2239:1: ( ( ( rule__Version__KeywordAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2240:1: ( ( rule__Version__KeywordAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2240:1: ( ( rule__Version__KeywordAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2241:1: ( rule__Version__KeywordAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getKeywordAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2242:1: ( rule__Version__KeywordAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2242:2: rule__Version__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Version__KeywordAssignment_0_in_rule__Version__Group__0__Impl4787);
            rule__Version__KeywordAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getKeywordAssignment_0()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2252:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2256:1: ( rule__Version__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__14817);
            rule__Version__Group__1__Impl();
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2263:1: rule__Version__Group__1__Impl : ( ( rule__Version__VersionAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2267:1: ( ( ( rule__Version__VersionAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2268:1: ( ( rule__Version__VersionAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2268:1: ( ( rule__Version__VersionAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2269:1: ( rule__Version__VersionAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2270:1: ( rule__Version__VersionAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2270:2: rule__Version__VersionAssignment_1
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl4844);
            rule__Version__VersionAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getVersionAssignment_1()); 
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


    // $ANTLR start rule__Markup__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2284:1: rule__Markup__Group__0 : rule__Markup__Group__0__Impl rule__Markup__Group__1 ;
    public final void rule__Markup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2288:1: ( rule__Markup__Group__0__Impl rule__Markup__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2289:2: rule__Markup__Group__0__Impl rule__Markup__Group__1
            {
            pushFollow(FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__04878);
            rule__Markup__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__04881);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2296:1: rule__Markup__Group__0__Impl : ( ( rule__Markup__KeywordAssignment_0 ) ) ;
    public final void rule__Markup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2300:1: ( ( ( rule__Markup__KeywordAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2301:1: ( ( rule__Markup__KeywordAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2301:1: ( ( rule__Markup__KeywordAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2302:1: ( rule__Markup__KeywordAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getKeywordAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2303:1: ( rule__Markup__KeywordAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2303:2: rule__Markup__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Markup__KeywordAssignment_0_in_rule__Markup__Group__0__Impl4908);
            rule__Markup__KeywordAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getKeywordAssignment_0()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: rule__Markup__Group__1 : rule__Markup__Group__1__Impl ;
    public final void rule__Markup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2317:1: ( rule__Markup__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2318:2: rule__Markup__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__14938);
            rule__Markup__Group__1__Impl();
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2324:1: rule__Markup__Group__1__Impl : ( ( rule__Markup__BlockAssignment_1 ) ) ;
    public final void rule__Markup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2328:1: ( ( ( rule__Markup__BlockAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2329:1: ( ( rule__Markup__BlockAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2329:1: ( ( rule__Markup__BlockAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2330:1: ( rule__Markup__BlockAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBlockAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2331:1: ( rule__Markup__BlockAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2331:2: rule__Markup__BlockAssignment_1
            {
            pushFollow(FOLLOW_rule__Markup__BlockAssignment_1_in_rule__Markup__Group__1__Impl4965);
            rule__Markup__BlockAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getBlockAssignment_1()); 
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


    // $ANTLR start rule__MarkupKeyword__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2345:1: rule__MarkupKeyword__Group__0 : rule__MarkupKeyword__Group__0__Impl rule__MarkupKeyword__Group__1 ;
    public final void rule__MarkupKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2349:1: ( rule__MarkupKeyword__Group__0__Impl rule__MarkupKeyword__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2350:2: rule__MarkupKeyword__Group__0__Impl rule__MarkupKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupKeyword__Group__0__Impl_in_rule__MarkupKeyword__Group__04999);
            rule__MarkupKeyword__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupKeyword__Group__1_in_rule__MarkupKeyword__Group__05002);
            rule__MarkupKeyword__Group__1();
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
    // $ANTLR end rule__MarkupKeyword__Group__0


    // $ANTLR start rule__MarkupKeyword__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2357:1: rule__MarkupKeyword__Group__0__Impl : ( KEYWORD_27 ) ;
    public final void rule__MarkupKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2361:1: ( ( KEYWORD_27 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2362:1: ( KEYWORD_27 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2362:1: ( KEYWORD_27 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2363:1: KEYWORD_27
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupKeywordAccess().getMarkupKeyword_0()); 
            }
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__MarkupKeyword__Group__0__Impl5030); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupKeywordAccess().getMarkupKeyword_0()); 
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
    // $ANTLR end rule__MarkupKeyword__Group__0__Impl


    // $ANTLR start rule__MarkupKeyword__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2376:1: rule__MarkupKeyword__Group__1 : rule__MarkupKeyword__Group__1__Impl ;
    public final void rule__MarkupKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2380:1: ( rule__MarkupKeyword__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2381:2: rule__MarkupKeyword__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MarkupKeyword__Group__1__Impl_in_rule__MarkupKeyword__Group__15061);
            rule__MarkupKeyword__Group__1__Impl();
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
    // $ANTLR end rule__MarkupKeyword__Group__1


    // $ANTLR start rule__MarkupKeyword__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2387:1: rule__MarkupKeyword__Group__1__Impl : ( ( KEYWORD_26 )? ) ;
    public final void rule__MarkupKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2391:1: ( ( ( KEYWORD_26 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2392:1: ( ( KEYWORD_26 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2392:1: ( ( KEYWORD_26 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2393:1: ( KEYWORD_26 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupKeywordAccess().getLinesKeyword_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2394:1: ( KEYWORD_26 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2395:2: KEYWORD_26
                    {
                    match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__MarkupKeyword__Group__1__Impl5090); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupKeywordAccess().getLinesKeyword_1()); 
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
    // $ANTLR end rule__MarkupKeyword__Group__1__Impl


    // $ANTLR start rule__MarkupBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2410:1: rule__MarkupBlock__Group__0 : rule__MarkupBlock__Group__0__Impl rule__MarkupBlock__Group__1 ;
    public final void rule__MarkupBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2414:1: ( rule__MarkupBlock__Group__0__Impl rule__MarkupBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:2: rule__MarkupBlock__Group__0__Impl rule__MarkupBlock__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__0__Impl_in_rule__MarkupBlock__Group__05127);
            rule__MarkupBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBlock__Group__1_in_rule__MarkupBlock__Group__05130);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2422:1: rule__MarkupBlock__Group__0__Impl : ( () ) ;
    public final void rule__MarkupBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2426:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2427:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2427:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2428:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getMarkupBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2429:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2431:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2441:1: rule__MarkupBlock__Group__1 : rule__MarkupBlock__Group__1__Impl rule__MarkupBlock__Group__2 ;
    public final void rule__MarkupBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2445:1: ( rule__MarkupBlock__Group__1__Impl rule__MarkupBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2446:2: rule__MarkupBlock__Group__1__Impl rule__MarkupBlock__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__1__Impl_in_rule__MarkupBlock__Group__15188);
            rule__MarkupBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBlock__Group__2_in_rule__MarkupBlock__Group__15191);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2453:1: rule__MarkupBlock__Group__1__Impl : ( KEYWORD_16 ) ;
    public final void rule__MarkupBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2457:1: ( ( KEYWORD_16 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2458:1: ( KEYWORD_16 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2458:1: ( KEYWORD_16 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2459:1: KEYWORD_16
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__MarkupBlock__Group__1__Impl5219); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2472:1: rule__MarkupBlock__Group__2 : rule__MarkupBlock__Group__2__Impl rule__MarkupBlock__Group__3 ;
    public final void rule__MarkupBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2476:1: ( rule__MarkupBlock__Group__2__Impl rule__MarkupBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2477:2: rule__MarkupBlock__Group__2__Impl rule__MarkupBlock__Group__3
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__2__Impl_in_rule__MarkupBlock__Group__25250);
            rule__MarkupBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBlock__Group__3_in_rule__MarkupBlock__Group__25253);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2484:1: rule__MarkupBlock__Group__2__Impl : ( ( rule__MarkupBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__MarkupBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2488:1: ( ( ( rule__MarkupBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2489:1: ( ( rule__MarkupBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2489:1: ( ( rule__MarkupBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2490:1: ( rule__MarkupBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2491:1: ( rule__MarkupBlock__ExpressionsAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=KEYWORD_1 && LA24_0<=KEYWORD_2)||(LA24_0>=KEYWORD_4 && LA24_0<=KEYWORD_14)||LA24_0==KEYWORD_16||LA24_0==KEYWORD_18||LA24_0==KEYWORD_25||(LA24_0>=RULE_STRING && LA24_0<=RULE_ID)||LA24_0==RULE_ANY_OTHER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2491:2: rule__MarkupBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MarkupBlock__ExpressionsAssignment_2_in_rule__MarkupBlock__Group__2__Impl5280);
            	    rule__MarkupBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2501:1: rule__MarkupBlock__Group__3 : rule__MarkupBlock__Group__3__Impl ;
    public final void rule__MarkupBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2505:1: ( rule__MarkupBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2506:2: rule__MarkupBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MarkupBlock__Group__3__Impl_in_rule__MarkupBlock__Group__35311);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2512:1: rule__MarkupBlock__Group__3__Impl : ( KEYWORD_17 ) ;
    public final void rule__MarkupBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2516:1: ( ( KEYWORD_17 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2517:1: ( KEYWORD_17 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2517:1: ( KEYWORD_17 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2518:1: KEYWORD_17
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__MarkupBlock__Group__3__Impl5339); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2539:1: rule__MarkupCommand__Group__0 : rule__MarkupCommand__Group__0__Impl rule__MarkupCommand__Group__1 ;
    public final void rule__MarkupCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2543:1: ( rule__MarkupCommand__Group__0__Impl rule__MarkupCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2544:2: rule__MarkupCommand__Group__0__Impl rule__MarkupCommand__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupCommand__Group__0__Impl_in_rule__MarkupCommand__Group__05378);
            rule__MarkupCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupCommand__Group__1_in_rule__MarkupCommand__Group__05381);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2551:1: rule__MarkupCommand__Group__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__MarkupCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2555:1: ( ( KEYWORD_13 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2556:1: ( KEYWORD_13 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2556:1: ( KEYWORD_13 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2557:1: KEYWORD_13
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__MarkupCommand__Group__0__Impl5409); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2570:1: rule__MarkupCommand__Group__1 : rule__MarkupCommand__Group__1__Impl ;
    public final void rule__MarkupCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2574:1: ( rule__MarkupCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2575:2: rule__MarkupCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MarkupCommand__Group__1__Impl_in_rule__MarkupCommand__Group__15440);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2581:1: rule__MarkupCommand__Group__1__Impl : ( ( rule__MarkupCommand__CommandAssignment_1 ) ) ;
    public final void rule__MarkupCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2585:1: ( ( ( rule__MarkupCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2586:1: ( ( rule__MarkupCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2586:1: ( ( rule__MarkupCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2587:1: ( rule__MarkupCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2588:1: ( rule__MarkupCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2588:2: rule__MarkupCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__MarkupCommand__CommandAssignment_1_in_rule__MarkupCommand__Group__1__Impl5467);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2602:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2606:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2607:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05501);
            rule__Reference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05504);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2614:1: rule__Reference__Group__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2618:1: ( ( KEYWORD_13 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2619:1: ( KEYWORD_13 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2619:1: ( KEYWORD_13 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2620:1: KEYWORD_13
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__Reference__Group__0__Impl5532); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2633:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2637:1: ( rule__Reference__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2638:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__15563);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2644:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__AssignmentAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2648:1: ( ( ( rule__Reference__AssignmentAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2649:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2649:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2650:1: ( rule__Reference__AssignmentAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2651:1: ( rule__Reference__AssignmentAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2651:2: rule__Reference__AssignmentAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl5590);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2665:1: rule__Scheme__Group__0 : rule__Scheme__Group__0__Impl rule__Scheme__Group__1 ;
    public final void rule__Scheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2669:1: ( rule__Scheme__Group__0__Impl rule__Scheme__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2670:2: rule__Scheme__Group__0__Impl rule__Scheme__Group__1
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__05624);
            rule__Scheme__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__05627);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2677:1: rule__Scheme__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__Scheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2681:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2682:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2682:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2683:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl5655); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2696:1: rule__Scheme__Group__1 : rule__Scheme__Group__1__Impl ;
    public final void rule__Scheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2700:1: ( rule__Scheme__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2701:2: rule__Scheme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__15686);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2707:1: rule__Scheme__Group__1__Impl : ( ( rule__Scheme__ValueAssignment_1 ) ) ;
    public final void rule__Scheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2711:1: ( ( ( rule__Scheme__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2712:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2712:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2713:1: ( rule__Scheme__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2714:1: ( rule__Scheme__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2714:2: rule__Scheme__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl5713);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2728:1: rule__SchemeExpression__Group__0 : rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 ;
    public final void rule__SchemeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2732:1: ( rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2733:2: rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__05747);
            rule__SchemeExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__05750);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2740:1: rule__SchemeExpression__Group__0__Impl : ( ( rule__SchemeExpression__Alternatives_0 ) ) ;
    public final void rule__SchemeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2744:1: ( ( ( rule__SchemeExpression__Alternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2745:1: ( ( rule__SchemeExpression__Alternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2745:1: ( ( rule__SchemeExpression__Alternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2746:1: ( rule__SchemeExpression__Alternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2747:1: ( rule__SchemeExpression__Alternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2747:2: rule__SchemeExpression__Alternatives_0
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl5777);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2757:1: rule__SchemeExpression__Group__1 : rule__SchemeExpression__Group__1__Impl ;
    public final void rule__SchemeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2761:1: ( rule__SchemeExpression__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2762:2: rule__SchemeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__15807);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2768:1: rule__SchemeExpression__Group__1__Impl : ( ( rule__SchemeExpression__ValueAssignment_1 ) ) ;
    public final void rule__SchemeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2772:1: ( ( ( rule__SchemeExpression__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2773:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2773:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2774:1: ( rule__SchemeExpression__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2775:1: ( rule__SchemeExpression__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2775:2: rule__SchemeExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl5834);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2789:1: rule__SchemeList__Group__0 : rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 ;
    public final void rule__SchemeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2793:1: ( rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2794:2: rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__05868);
            rule__SchemeList__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__05871);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2801:1: rule__SchemeList__Group__0__Impl : ( () ) ;
    public final void rule__SchemeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2805:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2806:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2806:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2807:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2808:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2810:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2820:1: rule__SchemeList__Group__1 : rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 ;
    public final void rule__SchemeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2824:1: ( rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2825:2: rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__15929);
            rule__SchemeList__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__15932);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2832:1: rule__SchemeList__Group__1__Impl : ( ( rule__SchemeList__VectorAssignment_1 )? ) ;
    public final void rule__SchemeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2836:1: ( ( ( rule__SchemeList__VectorAssignment_1 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2837:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2837:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2838:1: ( rule__SchemeList__VectorAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2839:1: ( rule__SchemeList__VectorAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_2) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2839:2: rule__SchemeList__VectorAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl5959);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2849:1: rule__SchemeList__Group__2 : rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 ;
    public final void rule__SchemeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2853:1: ( rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2854:2: rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__25990);
            rule__SchemeList__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__25993);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2861:1: rule__SchemeList__Group__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__SchemeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2865:1: ( ( KEYWORD_5 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2866:1: ( KEYWORD_5 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2866:1: ( KEYWORD_5 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2867:1: KEYWORD_5
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl6021); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2880:1: rule__SchemeList__Group__3 : rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 ;
    public final void rule__SchemeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2884:1: ( rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2885:2: rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__36052);
            rule__SchemeList__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__36055);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2892:1: rule__SchemeList__Group__3__Impl : ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) ;
    public final void rule__SchemeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2896:1: ( ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2897:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2897:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2898:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_3()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2899:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=KEYWORD_1 && LA26_0<=KEYWORD_5)||(LA26_0>=KEYWORD_7 && LA26_0<=KEYWORD_12)||(LA26_0>=KEYWORD_14 && LA26_0<=KEYWORD_15)||(LA26_0>=KEYWORD_18 && LA26_0<=KEYWORD_21)||LA26_0==KEYWORD_25||(LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||LA26_0==RULE_ANY_OTHER) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2899:2: rule__SchemeList__ExpressionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl6082);
            	    rule__SchemeList__ExpressionsAssignment_3();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2909:1: rule__SchemeList__Group__4 : rule__SchemeList__Group__4__Impl ;
    public final void rule__SchemeList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2913:1: ( rule__SchemeList__Group__4__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2914:2: rule__SchemeList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__46113);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2920:1: rule__SchemeList__Group__4__Impl : ( KEYWORD_6 ) ;
    public final void rule__SchemeList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2924:1: ( ( KEYWORD_6 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2925:1: ( KEYWORD_6 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2925:1: ( KEYWORD_6 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2926:1: KEYWORD_6
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl6141); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2949:1: rule__SchemeBlock__Group__0 : rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 ;
    public final void rule__SchemeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2953:1: ( rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2954:2: rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__06182);
            rule__SchemeBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__06185);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2961:1: rule__SchemeBlock__Group__0__Impl : ( KEYWORD_21 ) ;
    public final void rule__SchemeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2965:1: ( ( KEYWORD_21 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2966:1: ( KEYWORD_21 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2966:1: ( KEYWORD_21 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2967:1: KEYWORD_21
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 
            }
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__SchemeBlock__Group__0__Impl6213); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2980:1: rule__SchemeBlock__Group__1 : rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 ;
    public final void rule__SchemeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2984:1: ( rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2985:2: rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__16244);
            rule__SchemeBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__16247);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2992:1: rule__SchemeBlock__Group__1__Impl : ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__SchemeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2996:1: ( ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2997:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2997:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2998:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2998:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2999:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3000:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3000:2: rule__SchemeBlock__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl6276);
            rule__SchemeBlock__ExpressionsAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }

            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3003:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3004:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3005:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=KEYWORD_1 && LA27_0<=KEYWORD_2)||(LA27_0>=KEYWORD_4 && LA27_0<=KEYWORD_14)||LA27_0==KEYWORD_16||LA27_0==KEYWORD_18||LA27_0==KEYWORD_23||LA27_0==KEYWORD_25||(LA27_0>=KEYWORD_27 && LA27_0<=RULE_ID)||LA27_0==RULE_ANY_OTHER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3005:2: rule__SchemeBlock__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl6288);
            	    rule__SchemeBlock__ExpressionsAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3016:1: rule__SchemeBlock__Group__2 : rule__SchemeBlock__Group__2__Impl ;
    public final void rule__SchemeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3020:1: ( rule__SchemeBlock__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3021:2: rule__SchemeBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__26321);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3027:1: rule__SchemeBlock__Group__2__Impl : ( KEYWORD_22 ) ;
    public final void rule__SchemeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3031:1: ( ( KEYWORD_22 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3032:1: ( KEYWORD_22 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3032:1: ( KEYWORD_22 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3033:1: KEYWORD_22
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__SchemeBlock__Group__2__Impl6349); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3052:1: rule__SchemeCharacter__Group__0 : rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 ;
    public final void rule__SchemeCharacter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3056:1: ( rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3057:2: rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__06386);
            rule__SchemeCharacter__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__06389);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3064:1: rule__SchemeCharacter__Group__0__Impl : ( KEYWORD_20 ) ;
    public final void rule__SchemeCharacter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3068:1: ( ( KEYWORD_20 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3069:1: ( KEYWORD_20 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3069:1: ( KEYWORD_20 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3070:1: KEYWORD_20
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__SchemeCharacter__Group__0__Impl6417); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3083:1: rule__SchemeCharacter__Group__1 : rule__SchemeCharacter__Group__1__Impl ;
    public final void rule__SchemeCharacter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3087:1: ( rule__SchemeCharacter__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3088:2: rule__SchemeCharacter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__16448);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3094:1: rule__SchemeCharacter__Group__1__Impl : ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) ;
    public final void rule__SchemeCharacter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3098:1: ( ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3099:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3099:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3100:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3101:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3101:2: rule__SchemeCharacter__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl6475);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3115:1: rule__SchemeNumber__Group__0 : rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 ;
    public final void rule__SchemeNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3119:1: ( rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3120:2: rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__06509);
            rule__SchemeNumber__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__06512);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3127:1: rule__SchemeNumber__Group__0__Impl : ( ( rule__SchemeNumber__RadixAssignment_0 )? ) ;
    public final void rule__SchemeNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3131:1: ( ( ( rule__SchemeNumber__RadixAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3132:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3132:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3133:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3134:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_2) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3134:2: rule__SchemeNumber__RadixAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl6539);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3144:1: rule__SchemeNumber__Group__1 : rule__SchemeNumber__Group__1__Impl ;
    public final void rule__SchemeNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3148:1: ( rule__SchemeNumber__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3149:2: rule__SchemeNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__16570);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3155:1: rule__SchemeNumber__Group__1__Impl : ( ( rule__SchemeNumber__ValueAssignment_1 ) ) ;
    public final void rule__SchemeNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3159:1: ( ( ( rule__SchemeNumber__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3160:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3160:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3161:1: ( rule__SchemeNumber__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3162:1: ( rule__SchemeNumber__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3162:2: rule__SchemeNumber__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl6597);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3176:1: rule__SchemeNumberRadix__Group__0 : rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 ;
    public final void rule__SchemeNumberRadix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3180:1: ( rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3181:2: rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__06631);
            rule__SchemeNumberRadix__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__06634);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3188:1: rule__SchemeNumberRadix__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__SchemeNumberRadix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3192:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3193:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3193:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3194:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl6662); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3207:1: rule__SchemeNumberRadix__Group__1 : rule__SchemeNumberRadix__Group__1__Impl ;
    public final void rule__SchemeNumberRadix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3211:1: ( rule__SchemeNumberRadix__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3212:2: rule__SchemeNumberRadix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__16693);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3218:1: rule__SchemeNumberRadix__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__SchemeNumberRadix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3222:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3223:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3223:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3224:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeNumberRadix__Group__1__Impl6720); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3239:1: rule__SchemeMarkupCommand__Group__0 : rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 ;
    public final void rule__SchemeMarkupCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3243:1: ( rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3244:2: rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__06753);
            rule__SchemeMarkupCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__06756);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3251:1: rule__SchemeMarkupCommand__Group__0__Impl : ( KEYWORD_19 ) ;
    public final void rule__SchemeMarkupCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3255:1: ( ( KEYWORD_19 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3256:1: ( KEYWORD_19 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3256:1: ( KEYWORD_19 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3257:1: KEYWORD_19
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0()); 
            }
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__SchemeMarkupCommand__Group__0__Impl6784); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3270:1: rule__SchemeMarkupCommand__Group__1 : rule__SchemeMarkupCommand__Group__1__Impl ;
    public final void rule__SchemeMarkupCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3274:1: ( rule__SchemeMarkupCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3275:2: rule__SchemeMarkupCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__16815);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3281:1: rule__SchemeMarkupCommand__Group__1__Impl : ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) ;
    public final void rule__SchemeMarkupCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3285:1: ( ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3286:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3286:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3287:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3288:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3288:2: rule__SchemeMarkupCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl6842);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3302:1: rule__BOOL__Group__0 : rule__BOOL__Group__0__Impl rule__BOOL__Group__1 ;
    public final void rule__BOOL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3306:1: ( rule__BOOL__Group__0__Impl rule__BOOL__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3307:2: rule__BOOL__Group__0__Impl rule__BOOL__Group__1
            {
            pushFollow(FOLLOW_rule__BOOL__Group__0__Impl_in_rule__BOOL__Group__06876);
            rule__BOOL__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__BOOL__Group__1_in_rule__BOOL__Group__06879);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3314:1: rule__BOOL__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__BOOL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3318:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3319:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3319:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3320:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__BOOL__Group__0__Impl6907); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3333:1: rule__BOOL__Group__1 : rule__BOOL__Group__1__Impl ;
    public final void rule__BOOL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3337:1: ( rule__BOOL__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3338:2: rule__BOOL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BOOL__Group__1__Impl_in_rule__BOOL__Group__16938);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3344:1: rule__BOOL__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__BOOL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3348:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3349:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3349:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3350:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BOOL__Group__1__Impl6965); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3366:1: rule__LilyPond__ExpressionsAssignment : ( ruleToplevelExpression ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3370:1: ( ( ruleToplevelExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3371:1: ( ruleToplevelExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3371:1: ( ruleToplevelExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3372:1: ruleToplevelExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment7003);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3381:1: rule__Assignment__NameAssignment_0 : ( ( rule__Assignment__NameAlternatives_0_0 ) ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3385:1: ( ( ( rule__Assignment__NameAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3386:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3386:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3387:1: ( rule__Assignment__NameAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3388:1: ( rule__Assignment__NameAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3388:2: rule__Assignment__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_07034);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3397:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3401:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3402:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3402:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3403:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_27067);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3412:1: rule__PropertyAssignment__IdAssignment_0 : ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) ;
    public final void rule__PropertyAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3416:1: ( ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3417:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3417:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3418:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3419:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3419:2: rule__PropertyAssignment__IdAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_07098);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3428:1: rule__PropertyAssignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__PropertyAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3432:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3433:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3433:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3434:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_27131);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3443:1: rule__SimpleBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3447:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3448:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3448:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3449:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_27162);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3458:1: rule__SimultaneousBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimultaneousBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3462:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3463:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3463:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3464:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_27193);
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


    // $ANTLR start rule__Include__KeywordAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3473:1: rule__Include__KeywordAssignment_0 : ( ( KEYWORD_28 ) ) ;
    public final void rule__Include__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3477:1: ( ( ( KEYWORD_28 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3478:1: ( ( KEYWORD_28 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3478:1: ( ( KEYWORD_28 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3479:1: ( KEYWORD_28 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getKeywordIncludeKeyword_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3480:1: ( KEYWORD_28 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3481:1: KEYWORD_28
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getKeywordIncludeKeyword_0_0()); 
            }
            match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__Include__KeywordAssignment_07229); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getKeywordIncludeKeyword_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getKeywordIncludeKeyword_0_0()); 
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
    // $ANTLR end rule__Include__KeywordAssignment_0


    // $ANTLR start rule__Include__ImportURIAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3496:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3500:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3501:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3501:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3502:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_17268); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__Include__ImportURIAssignment_1


    // $ANTLR start rule__Version__KeywordAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3511:1: rule__Version__KeywordAssignment_0 : ( ( KEYWORD_29 ) ) ;
    public final void rule__Version__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3515:1: ( ( ( KEYWORD_29 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3516:1: ( ( KEYWORD_29 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3516:1: ( ( KEYWORD_29 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3517:1: ( KEYWORD_29 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getKeywordVersionKeyword_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3518:1: ( KEYWORD_29 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3519:1: KEYWORD_29
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getKeywordVersionKeyword_0_0()); 
            }
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__Version__KeywordAssignment_07304); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getKeywordVersionKeyword_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getKeywordVersionKeyword_0_0()); 
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
    // $ANTLR end rule__Version__KeywordAssignment_0


    // $ANTLR start rule__Version__VersionAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3534:1: rule__Version__VersionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Version__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3538:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3539:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3539:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3540:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_17343); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__Version__VersionAssignment_1


    // $ANTLR start rule__Markup__KeywordAssignment_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3549:1: rule__Markup__KeywordAssignment_0 : ( ruleMarkupKeyword ) ;
    public final void rule__Markup__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3553:1: ( ( ruleMarkupKeyword ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3554:1: ( ruleMarkupKeyword )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3554:1: ( ruleMarkupKeyword )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3555:1: ruleMarkupKeyword
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getKeywordMarkupKeywordParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupKeyword_in_rule__Markup__KeywordAssignment_07374);
            ruleMarkupKeyword();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getKeywordMarkupKeywordParserRuleCall_0_0()); 
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
    // $ANTLR end rule__Markup__KeywordAssignment_0


    // $ANTLR start rule__Markup__BlockAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3564:1: rule__Markup__BlockAssignment_1 : ( ruleMarkupBlock ) ;
    public final void rule__Markup__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3568:1: ( ( ruleMarkupBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3569:1: ( ruleMarkupBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3569:1: ( ruleMarkupBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3570:1: ruleMarkupBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBlockMarkupBlockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBlock_in_rule__Markup__BlockAssignment_17405);
            ruleMarkupBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getBlockMarkupBlockParserRuleCall_1_0()); 
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
    // $ANTLR end rule__Markup__BlockAssignment_1


    // $ANTLR start rule__MarkupBlock__ExpressionsAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3579:1: rule__MarkupBlock__ExpressionsAssignment_2 : ( ruleMarkupExpression ) ;
    public final void rule__MarkupBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3583:1: ( ( ruleMarkupExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3584:1: ( ruleMarkupExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3584:1: ( ruleMarkupExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3585:1: ruleMarkupExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBlockAccess().getExpressionsMarkupExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupExpression_in_rule__MarkupBlock__ExpressionsAssignment_27436);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3594:1: rule__MarkupCommand__CommandAssignment_1 : ( RULE_ID ) ;
    public final void rule__MarkupCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3598:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3599:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3599:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3600:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MarkupCommand__CommandAssignment_17467); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3609:1: rule__Reference__AssignmentAssignment_1 : ( ( ruleReferenceName ) ) ;
    public final void rule__Reference__AssignmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3613:1: ( ( ( ruleReferenceName ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3614:1: ( ( ruleReferenceName ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3614:1: ( ( ruleReferenceName ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3615:1: ( ruleReferenceName )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3616:1: ( ruleReferenceName )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3617:1: ruleReferenceName
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentReferenceNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleReferenceName_in_rule__Reference__AssignmentAssignment_17502);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3628:1: rule__Text__ValueAssignment : ( ( rule__Text__ValueAlternatives_0 ) ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3632:1: ( ( ( rule__Text__ValueAlternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3633:1: ( ( rule__Text__ValueAlternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3633:1: ( ( rule__Text__ValueAlternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3634:1: ( rule__Text__ValueAlternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3635:1: ( rule__Text__ValueAlternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3635:2: rule__Text__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment7537);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3644:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3648:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3649:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3649:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3650:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment7570); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3659:1: rule__Scheme__ValueAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__Scheme__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3663:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3664:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3664:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3665:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_17601);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3674:1: rule__SchemeExpression__QuotedAssignment_0_0 : ( ( KEYWORD_4 ) ) ;
    public final void rule__SchemeExpression__QuotedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3678:1: ( ( ( KEYWORD_4 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3679:1: ( ( KEYWORD_4 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3679:1: ( ( KEYWORD_4 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3680:1: ( KEYWORD_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3681:1: ( KEYWORD_4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3682:1: KEYWORD_4
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_07637); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3697:1: rule__SchemeExpression__QuasiquotedAssignment_0_1 : ( ( KEYWORD_15 ) ) ;
    public final void rule__SchemeExpression__QuasiquotedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3701:1: ( ( ( KEYWORD_15 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3702:1: ( ( KEYWORD_15 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3702:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3703:1: ( KEYWORD_15 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3704:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3705:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__SchemeExpression__QuasiquotedAssignment_0_17681); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3720:1: rule__SchemeExpression__UnquotedAssignment_0_2 : ( ( KEYWORD_8 ) ) ;
    public final void rule__SchemeExpression__UnquotedAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3724:1: ( ( ( KEYWORD_8 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3725:1: ( ( KEYWORD_8 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3725:1: ( ( KEYWORD_8 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3726:1: ( KEYWORD_8 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3727:1: ( KEYWORD_8 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3728:1: KEYWORD_8
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_27725); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3743:1: rule__SchemeExpression__VariableAssignment_0_3 : ( ( KEYWORD_3 ) ) ;
    public final void rule__SchemeExpression__VariableAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3747:1: ( ( ( KEYWORD_3 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3748:1: ( ( KEYWORD_3 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3748:1: ( ( KEYWORD_3 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3749:1: ( KEYWORD_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3750:1: ( KEYWORD_3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3751:1: KEYWORD_3
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_37769); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3766:1: rule__SchemeExpression__ValueAssignment_1 : ( ruleSchemeValue ) ;
    public final void rule__SchemeExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3770:1: ( ( ruleSchemeValue ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3771:1: ( ruleSchemeValue )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3771:1: ( ruleSchemeValue )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3772:1: ruleSchemeValue
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_17808);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3781:1: rule__SchemeBoolean__ValueAssignment : ( ruleBOOL ) ;
    public final void rule__SchemeBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3785:1: ( ( ruleBOOL ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3786:1: ( ruleBOOL )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3786:1: ( ruleBOOL )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3787:1: ruleBOOL
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueBOOLParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__SchemeBoolean__ValueAssignment7839);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3796:1: rule__SchemeList__VectorAssignment_1 : ( ( KEYWORD_2 ) ) ;
    public final void rule__SchemeList__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3800:1: ( ( ( KEYWORD_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3801:1: ( ( KEYWORD_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3801:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3802:1: ( KEYWORD_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3803:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3804:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_17875); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3819:1: rule__SchemeList__ExpressionsAssignment_3 : ( ruleSchemeExpression ) ;
    public final void rule__SchemeList__ExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3823:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3824:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3824:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3825:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_37914);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3834:1: rule__SchemeBlock__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__SchemeBlock__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3838:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3839:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3839:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3840:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_17945);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3849:1: rule__SchemeCharacter__ValueAssignment_1 : ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) ;
    public final void rule__SchemeCharacter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3853:1: ( ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3854:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3854:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3855:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3856:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3856:2: rule__SchemeCharacter__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_17976);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3865:1: rule__SchemeText__ValueAssignment : ( ruleSchemeTextLiterals ) ;
    public final void rule__SchemeText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3869:1: ( ( ruleSchemeTextLiterals ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3870:1: ( ruleSchemeTextLiterals )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3870:1: ( ruleSchemeTextLiterals )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3871:1: ruleSchemeTextLiterals
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueSchemeTextLiteralsParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment8009);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3880:1: rule__SchemeNumber__RadixAssignment_0 : ( ruleSchemeNumberRadix ) ;
    public final void rule__SchemeNumber__RadixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3884:1: ( ( ruleSchemeNumberRadix ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3885:1: ( ruleSchemeNumberRadix )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3885:1: ( ruleSchemeNumberRadix )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3886:1: ruleSchemeNumberRadix
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_08040);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3895:1: rule__SchemeNumber__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SchemeNumber__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3899:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3900:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3900:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3901:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_18071); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3910:1: rule__SchemeMarkupCommand__CommandAssignment_1 : ( RULE_ID ) ;
    public final void rule__SchemeMarkupCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3914:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3915:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3915:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3916:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeMarkupCommand__CommandAssignment_18102); if (failed) return ;
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( ( ruleAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( ruleAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( ruleAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1164:1: ruleAssignment
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred22437);
        ruleAssignment();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1185:1: ( ( rulePropertyAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1185:1: ( rulePropertyAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1185:1: ( rulePropertyAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1186:1: rulePropertyAssignment
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred32486);
        rulePropertyAssignment();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1556:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1557:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        int alt29=2;
        int LA29_0 = input.LA(1);

        if ( (LA29_0==KEYWORD_4) ) {
            alt29=1;
        }
        switch (alt29) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1557:2: rule__SchemeExpression__QuotedAssignment_0_0
                {
                pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred323353);
                rule__SchemeExpression__QuotedAssignment_0_0();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1561:6: ( ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1561:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1561:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1562:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1563:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0==KEYWORD_15) ) {
            alt30=1;
        }
        switch (alt30) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1563:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
                {
                pushFollow(FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred343372);
                rule__SchemeExpression__QuasiquotedAssignment_0_1();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1567:6: ( ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1567:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1567:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1568:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1569:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        int alt31=2;
        int LA31_0 = input.LA(1);

        if ( (LA31_0==KEYWORD_8) ) {
            alt31=1;
        }
        switch (alt31) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1569:2: rule__SchemeExpression__UnquotedAssignment_0_2
                {
                pushFollow(FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred363391);
                rule__SchemeExpression__UnquotedAssignment_0_2();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1589:1: ( ( ruleSchemeBoolean ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1589:1: ( ruleSchemeBoolean )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1589:1: ( ruleSchemeBoolean )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1590:1: ruleSchemeBoolean
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred373443);
        ruleSchemeBoolean();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1619:6: ( ( ruleSchemeNumber ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1619:6: ( ruleSchemeNumber )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1619:6: ( ruleSchemeNumber )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1620:1: ruleSchemeNumber
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred423528);
        ruleSchemeNumber();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred42

    public final boolean synpred34() {
        backtracking++;
        int start = input.mark();
        try {
            synpred34_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred32() {
        backtracking++;
        int start = input.mark();
        try {
            synpred32_fragment(); // can never throw exception
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
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond97 = new BitSet(new long[]{0x0000020FD42BFFB2L});
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
    public static final BitSet FOLLOW_ruleMarkupKeyword_in_entryRuleMarkupKeyword962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupKeyword969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupKeyword__Group__0_in_ruleMarkupKeyword1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_entryRuleMarkupBlock1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBlock1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__0_in_ruleMarkupBlock1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupExpression_in_entryRuleMarkupExpression1094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupExpression1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupExpression__Alternatives_in_ruleMarkupExpression1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupCommand_in_entryRuleMarkupCommand1163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupCommand1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupCommand__Group__0_in_ruleMarkupCommand1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceName_in_entryRuleReferenceName1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceName1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceName__Alternatives_in_ruleReferenceName1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialCharacter__Alternatives_in_ruleSpecialCharacter1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAssignment_in_ruleText1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme1565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0_in_ruleScheme1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression1633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0_in_ruleSchemeExpression1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeValue__Alternatives_in_ruleSchemeValue1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBoolean__ValueAssignment_in_ruleSchemeBoolean1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0_in_ruleSchemeList1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock1889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0_in_ruleSchemeBlock1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__0_in_ruleSchemeCharacter1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText2017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_entryRuleSchemeTextLiterals2081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiterals2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeTextLiterals__Alternatives_in_ruleSchemeTextLiterals2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0_in_ruleSchemeNumber2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__0_in_ruleSchemeNumberRadix2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand2296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__0_in_ruleSchemeMarkupCommand2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL2364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__0_in_ruleBOOL2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__ToplevelExpression__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_rule__ToplevelExpression__Alternatives2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_rule__Expression__Alternatives2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_rule__Expression__Alternatives2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__CommonExpression__Alternatives2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CommonExpression__Alternatives2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__CommonExpression__Alternatives2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CommonExpression__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__CommonExpression__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__NameAlternatives_0_02635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assignment__NameAlternatives_0_02652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyAssignment__IdAlternatives_0_02684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyAssignment__IdAlternatives_0_02701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Command__Alternatives2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_rule__SpecialCommand__Alternatives2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupCommand_in_rule__MarkupExpression__Alternatives2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_rule__MarkupExpression__Alternatives2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__MarkupExpression__Alternatives2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__MarkupExpression__Alternatives2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__MarkupExpression__Alternatives2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceName__Alternatives2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__ReferenceName__Alternatives3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__ReferenceName__Alternatives3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__ReferenceName__Alternatives3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__SpecialCharacter__Alternatives3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__SpecialCharacter__Alternatives3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__SpecialCharacter__Alternatives3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__SpecialCharacter__Alternatives3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__SpecialCharacter__Alternatives3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__SpecialCharacter__Alternatives3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__SpecialCharacter__Alternatives3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__Text__ValueAlternatives_03241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Text__ValueAlternatives_03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Text__ValueAlternatives_03279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__Text__ValueAlternatives_03299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__Text__ValueAlternatives_03319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_rule__SchemeExpression__Alternatives_03353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_rule__SchemeExpression__Alternatives_03372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_rule__SchemeExpression__Alternatives_03391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__VariableAssignment_0_3_in_rule__SchemeExpression__Alternatives_03410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_rule__SchemeValue__Alternatives3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_rule__SchemeValue__Alternatives3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeCharacter__ValueAlternatives_1_03577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeCharacter__ValueAlternatives_1_03594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeCharacter__ValueAlternatives_1_03611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__SchemeTextLiterals__Alternatives3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__SchemeTextLiterals__Alternatives3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiterals__Alternatives3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeTextLiterals__Alternatives3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SchemeTextLiterals__Alternatives3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiterals__Alternatives3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03764 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13824 = new BitSet(new long[]{0x0000020FD42BFFB0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__Assignment__Group__1__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__23886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__03949 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__03952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__14009 = new BitSet(new long[]{0x0000020FD42BFFB0L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__14012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__PropertyAssignment__Group__1__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__24071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__04134 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__04137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__14195 = new BitSet(new long[]{0x0000020FD43BFFB0L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__14198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__SimpleBlock__Group__1__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__24257 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__24260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl4287 = new BitSet(new long[]{0x0000020FD42BFFB2L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__34318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__SimpleBlock__Group__3__Impl4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__04385 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__04388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__14446 = new BitSet(new long[]{0x0000020FDC2BFFB0L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__14449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__SimultaneousBlock__Group__1__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__24508 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__24511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl4538 = new BitSet(new long[]{0x0000020FD42BFFB2L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__34569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__SimultaneousBlock__Group__3__Impl4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__04636 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__04639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__KeywordAssignment_0_in_rule__Include__Group__0__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_1_in_rule__Include__Group__1__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__04757 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__04760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__KeywordAssignment_0_in_rule__Version__Group__0__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__14817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__04878 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__04881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__KeywordAssignment_0_in_rule__Markup__Group__0__Impl4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__14938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__BlockAssignment_1_in_rule__Markup__Group__1__Impl4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupKeyword__Group__0__Impl_in_rule__MarkupKeyword__Group__04999 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__MarkupKeyword__Group__1_in_rule__MarkupKeyword__Group__05002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__MarkupKeyword__Group__0__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupKeyword__Group__1__Impl_in_rule__MarkupKeyword__Group__15061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__MarkupKeyword__Group__1__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__0__Impl_in_rule__MarkupBlock__Group__05127 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__1_in_rule__MarkupBlock__Group__05130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__1__Impl_in_rule__MarkupBlock__Group__15188 = new BitSet(new long[]{0x0000020E103BFFB0L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__2_in_rule__MarkupBlock__Group__15191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__MarkupBlock__Group__1__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__2__Impl_in_rule__MarkupBlock__Group__25250 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__3_in_rule__MarkupBlock__Group__25253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBlock__ExpressionsAssignment_2_in_rule__MarkupBlock__Group__2__Impl5280 = new BitSet(new long[]{0x0000020E102BFFB2L});
    public static final BitSet FOLLOW_rule__MarkupBlock__Group__3__Impl_in_rule__MarkupBlock__Group__35311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__MarkupBlock__Group__3__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupCommand__Group__0__Impl_in_rule__MarkupCommand__Group__05378 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__MarkupCommand__Group__1_in_rule__MarkupCommand__Group__05381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__MarkupCommand__Group__0__Impl5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupCommand__Group__1__Impl_in_rule__MarkupCommand__Group__15440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupCommand__CommandAssignment_1_in_rule__MarkupCommand__Group__1__Impl5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05501 = new BitSet(new long[]{0x000000080022D710L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__Reference__Group__0__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__15563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__05624 = new BitSet(new long[]{0x0000020E11E6FDF0L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__05627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__15686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__05747 = new BitSet(new long[]{0x0000020E11E2F530L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__05750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__15807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__05868 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__05871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__15929 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__15932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__25990 = new BitSet(new long[]{0x0000020E11E6FFF0L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__25993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__36052 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__36055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl6082 = new BitSet(new long[]{0x0000020E11E6FDF2L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__46113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__06182 = new BitSet(new long[]{0x0000020FD42BFFB0L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__06185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__SchemeBlock__Group__0__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__16244 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__16247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl6276 = new BitSet(new long[]{0x0000020FD42BFFB2L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl6288 = new BitSet(new long[]{0x0000020FD42BFFB2L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__26321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__SchemeBlock__Group__2__Impl6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__06386 = new BitSet(new long[]{0x000002080022D410L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__06389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__SchemeCharacter__Group__0__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__16448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__06509 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__06512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__16570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__06631 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__06634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__16693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeNumberRadix__Group__1__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__06753 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__06756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__SchemeMarkupCommand__Group__0__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__16815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__0__Impl_in_rule__BOOL__Group__06876 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BOOL__Group__1_in_rule__BOOL__Group__06879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__BOOL__Group__0__Impl6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__1__Impl_in_rule__BOOL__Group__16938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BOOL__Group__1__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_07034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_27067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_07098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_27131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_27162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_27193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__Include__KeywordAssignment_07229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_17268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__Version__KeywordAssignment_07304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_17343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupKeyword_in_rule__Markup__KeywordAssignment_07374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBlock_in_rule__Markup__BlockAssignment_17405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupExpression_in_rule__MarkupBlock__ExpressionsAssignment_27436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MarkupCommand__CommandAssignment_17467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceName_in_rule__Reference__AssignmentAssignment_17502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_17601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_07637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__SchemeExpression__QuasiquotedAssignment_0_17681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_27725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_37769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_17808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__SchemeBoolean__ValueAssignment7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_17875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_37914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_17945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_17976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiterals_in_rule__SchemeText__ValueAssignment8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_08040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_18071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeMarkupCommand__CommandAssignment_18102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred22437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred32486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred323353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred343372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred363391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred373443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred423528 = new BitSet(new long[]{0x0000000000000002L});

}