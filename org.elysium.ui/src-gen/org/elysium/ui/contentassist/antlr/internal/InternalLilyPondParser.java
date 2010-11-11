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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_88", "KEYWORD_86", "KEYWORD_87", "KEYWORD_84", "KEYWORD_85", "KEYWORD_81", "KEYWORD_82", "KEYWORD_83", "KEYWORD_79", "KEYWORD_80", "KEYWORD_74", "KEYWORD_75", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "RULE_STRING", "RULE_INT", "RULE_ALPHA", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_SCHEME_SL_COMMENT=98;
    public static final int RULE_ANY_OTHER=100;
    public static final int KEYWORD_56=42;
    public static final int KEYWORD_55=41;
    public static final int KEYWORD_54=40;
    public static final int KEYWORD_53=39;
    public static final int KEYWORD_52=38;
    public static final int KEYWORD_51=37;
    public static final int KEYWORD_50=36;
    public static final int EOF=-1;
    public static final int KEYWORD_59=27;
    public static final int KEYWORD_58=44;
    public static final int KEYWORD_57=43;
    public static final int KEYWORD_65=33;
    public static final int RULE_SCHEME_ML_COMMENT=99;
    public static final int KEYWORD_64=32;
    public static final int KEYWORD_67=20;
    public static final int KEYWORD_66=19;
    public static final int KEYWORD_61=29;
    public static final int KEYWORD_60=28;
    public static final int KEYWORD_63=31;
    public static final int KEYWORD_62=30;
    public static final int KEYWORD_69=22;
    public static final int KEYWORD_68=21;
    public static final int KEYWORD_30=64;
    public static final int KEYWORD_34=55;
    public static final int KEYWORD_33=54;
    public static final int KEYWORD_32=53;
    public static final int KEYWORD_31=52;
    public static final int KEYWORD_38=59;
    public static final int KEYWORD_37=58;
    public static final int KEYWORD_36=57;
    public static final int KEYWORD_35=56;
    public static final int RULE_ML_COMMENT=97;
    public static final int KEYWORD_39=60;
    public static final int RULE_STRING=92;
    public static final int KEYWORD_41=45;
    public static final int KEYWORD_40=61;
    public static final int KEYWORD_43=47;
    public static final int KEYWORD_42=46;
    public static final int KEYWORD_45=49;
    public static final int KEYWORD_44=48;
    public static final int KEYWORD_47=51;
    public static final int KEYWORD_46=50;
    public static final int KEYWORD_49=35;
    public static final int KEYWORD_48=34;
    public static final int KEYWORD_19=90;
    public static final int KEYWORD_17=88;
    public static final int KEYWORD_18=89;
    public static final int KEYWORD_15=86;
    public static final int KEYWORD_16=87;
    public static final int KEYWORD_13=84;
    public static final int KEYWORD_14=85;
    public static final int KEYWORD_11=82;
    public static final int KEYWORD_12=83;
    public static final int KEYWORD_10=81;
    public static final int KEYWORD_6=77;
    public static final int KEYWORD_7=78;
    public static final int KEYWORD_8=79;
    public static final int KEYWORD_9=80;
    public static final int KEYWORD_28=62;
    public static final int KEYWORD_29=63;
    public static final int RULE_INT=93;
    public static final int KEYWORD_24=68;
    public static final int KEYWORD_25=69;
    public static final int KEYWORD_26=70;
    public static final int KEYWORD_27=71;
    public static final int KEYWORD_20=91;
    public static final int KEYWORD_21=65;
    public static final int KEYWORD_22=66;
    public static final int KEYWORD_23=67;
    public static final int KEYWORD_79=12;
    public static final int KEYWORD_71=24;
    public static final int KEYWORD_72=25;
    public static final int KEYWORD_73=26;
    public static final int KEYWORD_74=14;
    public static final int KEYWORD_75=15;
    public static final int KEYWORD_76=16;
    public static final int KEYWORD_77=17;
    public static final int KEYWORD_78=18;
    public static final int KEYWORD_1=72;
    public static final int KEYWORD_5=76;
    public static final int KEYWORD_4=75;
    public static final int RULE_ALPHA=94;
    public static final int KEYWORD_70=23;
    public static final int KEYWORD_3=74;
    public static final int KEYWORD_2=73;
    public static final int Tokens=101;
    public static final int RULE_SL_COMMENT=96;
    public static final int KEYWORD_84=7;
    public static final int KEYWORD_85=8;
    public static final int KEYWORD_82=10;
    public static final int KEYWORD_83=11;
    public static final int KEYWORD_88=4;
    public static final int KEYWORD_86=5;
    public static final int KEYWORD_87=6;
    public static final int KEYWORD_81=9;
    public static final int KEYWORD_80=13;
    public static final int RULE_WS=95;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[418+1];
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
    		tokenNameToValue.put("KEYWORD_9", "'-'");
    		tokenNameToValue.put("KEYWORD_10", "':'");
    		tokenNameToValue.put("KEYWORD_11", "'<'");
    		tokenNameToValue.put("KEYWORD_12", "'='");
    		tokenNameToValue.put("KEYWORD_13", "'>'");
    		tokenNameToValue.put("KEYWORD_14", "'['");
    		tokenNameToValue.put("KEYWORD_15", "'\\'");
    		tokenNameToValue.put("KEYWORD_16", "']'");
    		tokenNameToValue.put("KEYWORD_17", "'`'");
    		tokenNameToValue.put("KEYWORD_18", "'{'");
    		tokenNameToValue.put("KEYWORD_19", "'}'");
    		tokenNameToValue.put("KEYWORD_20", "'~'");
    		tokenNameToValue.put("KEYWORD_21", "'#:'");
    		tokenNameToValue.put("KEYWORD_22", "'#\\'");
    		tokenNameToValue.put("KEYWORD_23", "'#{'");
    		tokenNameToValue.put("KEYWORD_24", "'#}'");
    		tokenNameToValue.put("KEYWORD_25", "'<<'");
    		tokenNameToValue.put("KEYWORD_26", "'>>'");
    		tokenNameToValue.put("KEYWORD_27", "'\\\\'");
    		tokenNameToValue.put("KEYWORD_28", "'key'");
    		tokenNameToValue.put("KEYWORD_29", "'new'");
    		tokenNameToValue.put("KEYWORD_30", "'set'");
    		tokenNameToValue.put("KEYWORD_31", "'book'");
    		tokenNameToValue.put("KEYWORD_32", "'mark'");
    		tokenNameToValue.put("KEYWORD_33", "'midi'");
    		tokenNameToValue.put("KEYWORD_34", "'name'");
    		tokenNameToValue.put("KEYWORD_35", "'once'");
    		tokenNameToValue.put("KEYWORD_36", "'rest'");
    		tokenNameToValue.put("KEYWORD_37", "'skip'");
    		tokenNameToValue.put("KEYWORD_38", "'time'");
    		tokenNameToValue.put("KEYWORD_39", "'type'");
    		tokenNameToValue.put("KEYWORD_40", "'with'");
    		tokenNameToValue.put("KEYWORD_41", "'alias'");
    		tokenNameToValue.put("KEYWORD_42", "'drums'");
    		tokenNameToValue.put("KEYWORD_43", "'paper'");
    		tokenNameToValue.put("KEYWORD_44", "'score'");
    		tokenNameToValue.put("KEYWORD_45", "'tempo'");
    		tokenNameToValue.put("KEYWORD_46", "'times'");
    		tokenNameToValue.put("KEYWORD_47", "'unset'");
    		tokenNameToValue.put("KEYWORD_48", "'change'");
    		tokenNameToValue.put("KEYWORD_49", "'chords'");
    		tokenNameToValue.put("KEYWORD_50", "'denies'");
    		tokenNameToValue.put("KEYWORD_51", "'header'");
    		tokenNameToValue.put("KEYWORD_52", "'layout'");
    		tokenNameToValue.put("KEYWORD_53", "'lyrics'");
    		tokenNameToValue.put("KEYWORD_54", "'markup'");
    		tokenNameToValue.put("KEYWORD_55", "'octave'");
    		tokenNameToValue.put("KEYWORD_56", "'remove'");
    		tokenNameToValue.put("KEYWORD_57", "'repeat'");
    		tokenNameToValue.put("KEYWORD_58", "'revert'");
    		tokenNameToValue.put("KEYWORD_59", "'accepts'");
    		tokenNameToValue.put("KEYWORD_60", "'context'");
    		tokenNameToValue.put("KEYWORD_61", "'default'");
    		tokenNameToValue.put("KEYWORD_62", "'figures'");
    		tokenNameToValue.put("KEYWORD_63", "'include'");
    		tokenNameToValue.put("KEYWORD_64", "'partial'");
    		tokenNameToValue.put("KEYWORD_65", "'version'");
    		tokenNameToValue.put("KEYWORD_66", "'bookpart'");
    		tokenNameToValue.put("KEYWORD_67", "'consists'");
    		tokenNameToValue.put("KEYWORD_68", "'drummode'");
    		tokenNameToValue.put("KEYWORD_69", "'lyricsto'");
    		tokenNameToValue.put("KEYWORD_70", "'notemode'");
    		tokenNameToValue.put("KEYWORD_71", "'objectid'");
    		tokenNameToValue.put("KEYWORD_72", "'override'");
    		tokenNameToValue.put("KEYWORD_73", "'relative'");
    		tokenNameToValue.put("KEYWORD_74", "'addlyrics'");
    		tokenNameToValue.put("KEYWORD_75", "'chordmode'");
    		tokenNameToValue.put("KEYWORD_76", "'lyricmode'");
    		tokenNameToValue.put("KEYWORD_77", "'maininput'");
    		tokenNameToValue.put("KEYWORD_78", "'transpose'");
    		tokenNameToValue.put("KEYWORD_79", "'figuremode'");
    		tokenNameToValue.put("KEYWORD_80", "'sequential'");
    		tokenNameToValue.put("KEYWORD_81", "'alternative'");
    		tokenNameToValue.put("KEYWORD_82", "'description'");
    		tokenNameToValue.put("KEYWORD_83", "'markuplines'");
    		tokenNameToValue.put("KEYWORD_84", "'defaultchild'");
    		tokenNameToValue.put("KEYWORD_85", "'simultaneous'");
    		tokenNameToValue.put("KEYWORD_86", "'sourcefileline'");
    		tokenNameToValue.put("KEYWORD_87", "'sourcefilename'");
    		tokenNameToValue.put("KEYWORD_88", "'grobdescriptions'");
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:153:1: entryRuleLilyPond : ruleLilyPond EOF ;
    public final void entryRuleLilyPond() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:154:1: ( ruleLilyPond EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:155:1: ruleLilyPond EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:162:1: ruleLilyPond : ( ( rule__LilyPond__ExpressionsAssignment )* ) ;
    public final void ruleLilyPond() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:166:5: ( ( ( rule__LilyPond__ExpressionsAssignment )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:167:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:167:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:168:1: ( rule__LilyPond__ExpressionsAssignment )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:169:1: ( rule__LilyPond__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_88 && LA1_0<=KEYWORD_30)||LA1_0==KEYWORD_25||(LA1_0>=KEYWORD_27 && LA1_0<=KEYWORD_2)||(LA1_0>=KEYWORD_4 && LA1_0<=KEYWORD_16)||LA1_0==KEYWORD_18||(LA1_0>=KEYWORD_20 && LA1_0<=RULE_ALPHA)||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:169:2: rule__LilyPond__ExpressionsAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:181:1: entryRuleToplevelExpression : ruleToplevelExpression EOF ;
    public final void entryRuleToplevelExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:182:1: ( ruleToplevelExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:183:1: ruleToplevelExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:190:1: ruleToplevelExpression : ( ( rule__ToplevelExpression__Alternatives ) ) ;
    public final void ruleToplevelExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:194:5: ( ( ( rule__ToplevelExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:195:1: ( ( rule__ToplevelExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:195:1: ( ( rule__ToplevelExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:196:1: ( rule__ToplevelExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getToplevelExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:197:1: ( rule__ToplevelExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:197:2: rule__ToplevelExpression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:209:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:210:1: ( ruleExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:211:1: ruleExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:218:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:222:5: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:223:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:223:1: ( ( rule__Expression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:224:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:225:1: ( rule__Expression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:225:2: rule__Expression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:237:1: entryRuleCommonExpression : ruleCommonExpression EOF ;
    public final void entryRuleCommonExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:238:1: ( ruleCommonExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:239:1: ruleCommonExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:246:1: ruleCommonExpression : ( ( rule__CommonExpression__Alternatives ) ) ;
    public final void ruleCommonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:250:5: ( ( ( rule__CommonExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:251:1: ( ( rule__CommonExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:251:1: ( ( rule__CommonExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:252:1: ( rule__CommonExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommonExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:253:1: ( rule__CommonExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:253:2: rule__CommonExpression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:265:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:266:1: ( ruleAssignment EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:267:1: ruleAssignment EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:274:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:278:5: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:279:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:279:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:280:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:281:1: ( rule__Assignment__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:281:2: rule__Assignment__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:293:1: entryRulePropertyAssignment : rulePropertyAssignment EOF ;
    public final void entryRulePropertyAssignment() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:294:1: ( rulePropertyAssignment EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:295:1: rulePropertyAssignment EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:302:1: rulePropertyAssignment : ( ( rule__PropertyAssignment__Group__0 ) ) ;
    public final void rulePropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:306:5: ( ( ( rule__PropertyAssignment__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:307:1: ( ( rule__PropertyAssignment__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:307:1: ( ( rule__PropertyAssignment__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:308:1: ( rule__PropertyAssignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:309:1: ( rule__PropertyAssignment__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:309:2: rule__PropertyAssignment__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:321:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:322:1: ( ruleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:323:1: ruleBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:330:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:334:5: ( ( ( rule__Block__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:335:1: ( ( rule__Block__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:335:1: ( ( rule__Block__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:336:1: ( rule__Block__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:337:1: ( rule__Block__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:337:2: rule__Block__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:349:1: entryRuleSimpleBlock : ruleSimpleBlock EOF ;
    public final void entryRuleSimpleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:350:1: ( ruleSimpleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:351:1: ruleSimpleBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:358:1: ruleSimpleBlock : ( ( rule__SimpleBlock__Group__0 ) ) ;
    public final void ruleSimpleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:362:5: ( ( ( rule__SimpleBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:363:1: ( ( rule__SimpleBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:363:1: ( ( rule__SimpleBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:364:1: ( rule__SimpleBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:365:1: ( rule__SimpleBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:365:2: rule__SimpleBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:377:1: entryRuleSimultaneousBlock : ruleSimultaneousBlock EOF ;
    public final void entryRuleSimultaneousBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:378:1: ( ruleSimultaneousBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:379:1: ruleSimultaneousBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:386:1: ruleSimultaneousBlock : ( ( rule__SimultaneousBlock__Group__0 ) ) ;
    public final void ruleSimultaneousBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:390:5: ( ( ( rule__SimultaneousBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:391:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:391:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:392:1: ( rule__SimultaneousBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:393:1: ( rule__SimultaneousBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:393:2: rule__SimultaneousBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:405:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:406:1: ( ruleCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:407:1: ruleCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:414:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:418:5: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:419:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:419:1: ( ( rule__Command__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:420:1: ( rule__Command__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:421:1: ( rule__Command__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:421:2: rule__Command__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:433:1: entryRuleSpecialCommand : ruleSpecialCommand EOF ;
    public final void entryRuleSpecialCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:434:1: ( ruleSpecialCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:435:1: ruleSpecialCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:442:1: ruleSpecialCommand : ( ( rule__SpecialCommand__Alternatives ) ) ;
    public final void ruleSpecialCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:446:5: ( ( ( rule__SpecialCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:447:1: ( ( rule__SpecialCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:447:1: ( ( rule__SpecialCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:448:1: ( rule__SpecialCommand__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:449:1: ( rule__SpecialCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:449:2: rule__SpecialCommand__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:461:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:462:1: ( ruleInclude EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:463:1: ruleInclude EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:470:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:474:5: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:475:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:475:1: ( ( rule__Include__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:476:1: ( rule__Include__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:477:1: ( rule__Include__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:477:2: rule__Include__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:489:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:490:1: ( ruleVersion EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:491:1: ruleVersion EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:498:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:502:5: ( ( ( rule__Version__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:503:1: ( ( rule__Version__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:503:1: ( ( rule__Version__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:1: ( rule__Version__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:505:1: ( rule__Version__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:505:2: rule__Version__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:517:1: entryRuleMarkup : ruleMarkup EOF ;
    public final void entryRuleMarkup() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:518:1: ( ruleMarkup EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:519:1: ruleMarkup EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:526:1: ruleMarkup : ( ( rule__Markup__Group__0 ) ) ;
    public final void ruleMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:530:5: ( ( ( rule__Markup__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:531:1: ( ( rule__Markup__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:531:1: ( ( rule__Markup__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:532:1: ( rule__Markup__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:533:1: ( rule__Markup__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:533:2: rule__Markup__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:545:1: entryRuleMarkupLines : ruleMarkupLines EOF ;
    public final void entryRuleMarkupLines() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:546:1: ( ruleMarkupLines EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:547:1: ruleMarkupLines EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:554:1: ruleMarkupLines : ( ( rule__MarkupLines__Group__0 ) ) ;
    public final void ruleMarkupLines() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:558:5: ( ( ( rule__MarkupLines__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:559:1: ( ( rule__MarkupLines__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:559:1: ( ( rule__MarkupLines__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:560:1: ( rule__MarkupLines__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:561:1: ( rule__MarkupLines__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:561:2: rule__MarkupLines__Group__0
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


    // $ANTLR start entryRuleMarkupBody
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:573:1: entryRuleMarkupBody : ruleMarkupBody EOF ;
    public final void entryRuleMarkupBody() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:574:1: ( ruleMarkupBody EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:575:1: ruleMarkupBody EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody1021);
            ruleMarkupBody();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBodyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupBody1028); if (failed) return ;

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
    // $ANTLR end entryRuleMarkupBody


    // $ANTLR start ruleMarkupBody
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:582:1: ruleMarkupBody : ( ( rule__MarkupBody__Group__0 ) ) ;
    public final void ruleMarkupBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:586:5: ( ( ( rule__MarkupBody__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:587:1: ( ( rule__MarkupBody__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:587:1: ( ( rule__MarkupBody__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:588:1: ( rule__MarkupBody__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:589:1: ( rule__MarkupBody__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:589:2: rule__MarkupBody__Group__0
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__0_in_ruleMarkupBody1058);
            rule__MarkupBody__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBodyAccess().getGroup()); 
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
    // $ANTLR end ruleMarkupBody


    // $ANTLR start entryRuleContext
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:601:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:602:1: ( ruleContext EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:603:1: ruleContext EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextRule()); 
            }
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext1085);
            ruleContext();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getContextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext1092); if (failed) return ;

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
    // $ANTLR end entryRuleContext


    // $ANTLR start ruleContext
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:610:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:614:5: ( ( ( rule__Context__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:615:1: ( ( rule__Context__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:615:1: ( ( rule__Context__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:616:1: ( rule__Context__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:617:1: ( rule__Context__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:617:2: rule__Context__Group__0
            {
            pushFollow(FOLLOW_rule__Context__Group__0_in_ruleContext1122);
            rule__Context__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getContextAccess().getGroup()); 
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
    // $ANTLR end ruleContext


    // $ANTLR start entryRuleOther
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:629:1: entryRuleOther : ruleOther EOF ;
    public final void entryRuleOther() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:630:1: ( ruleOther EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:631:1: ruleOther EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOther_in_entryRuleOther1149);
            ruleOther();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOtherRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOther1156); if (failed) return ;

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
    // $ANTLR end entryRuleOther


    // $ANTLR start ruleOther
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:638:1: ruleOther : ( ( rule__Other__Group__0 ) ) ;
    public final void ruleOther() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:642:5: ( ( ( rule__Other__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:643:1: ( ( rule__Other__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:643:1: ( ( rule__Other__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:644:1: ( rule__Other__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:645:1: ( rule__Other__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:645:2: rule__Other__Group__0
            {
            pushFollow(FOLLOW_rule__Other__Group__0_in_ruleOther1186);
            rule__Other__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOtherAccess().getGroup()); 
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
    // $ANTLR end ruleOther


    // $ANTLR start entryRuleOtherName
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:657:1: entryRuleOtherName : ruleOtherName EOF ;
    public final void entryRuleOtherName() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:658:1: ( ruleOtherName EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:659:1: ruleOtherName EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherNameRule()); 
            }
            pushFollow(FOLLOW_ruleOtherName_in_entryRuleOtherName1213);
            ruleOtherName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOtherNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherName1220); if (failed) return ;

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
    // $ANTLR end entryRuleOtherName


    // $ANTLR start ruleOtherName
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:666:1: ruleOtherName : ( ( rule__OtherName__Alternatives ) ) ;
    public final void ruleOtherName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:670:5: ( ( ( rule__OtherName__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:671:1: ( ( rule__OtherName__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:671:1: ( ( rule__OtherName__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:672:1: ( rule__OtherName__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherNameAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:673:1: ( rule__OtherName__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:673:2: rule__OtherName__Alternatives
            {
            pushFollow(FOLLOW_rule__OtherName__Alternatives_in_ruleOtherName1250);
            rule__OtherName__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOtherNameAccess().getAlternatives()); 
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
    // $ANTLR end ruleOtherName


    // $ANTLR start entryRuleSpecialCommandName
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:685:1: entryRuleSpecialCommandName : ruleSpecialCommandName EOF ;
    public final void entryRuleSpecialCommandName() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:686:1: ( ruleSpecialCommandName EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:687:1: ruleSpecialCommandName EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandNameRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName1277);
            ruleSpecialCommandName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSpecialCommandNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialCommandName1284); if (failed) return ;

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
    // $ANTLR end entryRuleSpecialCommandName


    // $ANTLR start ruleSpecialCommandName
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:694:1: ruleSpecialCommandName : ( ( rule__SpecialCommandName__Alternatives ) ) ;
    public final void ruleSpecialCommandName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:698:5: ( ( ( rule__SpecialCommandName__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:699:1: ( ( rule__SpecialCommandName__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:699:1: ( ( rule__SpecialCommandName__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:700:1: ( rule__SpecialCommandName__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandNameAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:701:1: ( rule__SpecialCommandName__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:701:2: rule__SpecialCommandName__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecialCommandName__Alternatives_in_ruleSpecialCommandName1314);
            rule__SpecialCommandName__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSpecialCommandNameAccess().getAlternatives()); 
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
    // $ANTLR end ruleSpecialCommandName


    // $ANTLR start entryRuleSpecialCharacter
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:713:1: entryRuleSpecialCharacter : ruleSpecialCharacter EOF ;
    public final void entryRuleSpecialCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:714:1: ( ruleSpecialCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:715:1: ruleSpecialCharacter EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:722:1: ruleSpecialCharacter : ( ( rule__SpecialCharacter__Alternatives ) ) ;
    public final void ruleSpecialCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:726:5: ( ( ( rule__SpecialCharacter__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:727:1: ( ( rule__SpecialCharacter__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:727:1: ( ( rule__SpecialCharacter__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:728:1: ( rule__SpecialCharacter__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCharacterAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:729:1: ( rule__SpecialCharacter__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:729:2: rule__SpecialCharacter__Alternatives
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


    // $ANTLR start entryRuleUnparsedBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:741:1: entryRuleUnparsedBlock : ruleUnparsedBlock EOF ;
    public final void entryRuleUnparsedBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:742:1: ( ruleUnparsedBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:743:1: ruleUnparsedBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1405);
            ruleUnparsedBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedBlock1412); if (failed) return ;

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
    // $ANTLR end entryRuleUnparsedBlock


    // $ANTLR start ruleUnparsedBlock
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:750:1: ruleUnparsedBlock : ( ( rule__UnparsedBlock__Group__0 ) ) ;
    public final void ruleUnparsedBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:754:5: ( ( ( rule__UnparsedBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:755:1: ( ( rule__UnparsedBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:755:1: ( ( rule__UnparsedBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:756:1: ( rule__UnparsedBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:757:1: ( rule__UnparsedBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:757:2: rule__UnparsedBlock__Group__0
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__0_in_ruleUnparsedBlock1442);
            rule__UnparsedBlock__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedBlockAccess().getGroup()); 
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
    // $ANTLR end ruleUnparsedBlock


    // $ANTLR start entryRuleUnparsedExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:769:1: entryRuleUnparsedExpression : ruleUnparsedExpression EOF ;
    public final void entryRuleUnparsedExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:770:1: ( ruleUnparsedExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:771:1: ruleUnparsedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1469);
            ruleUnparsedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedExpression1476); if (failed) return ;

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
    // $ANTLR end entryRuleUnparsedExpression


    // $ANTLR start ruleUnparsedExpression
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:778:1: ruleUnparsedExpression : ( ( rule__UnparsedExpression__Alternatives ) ) ;
    public final void ruleUnparsedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:782:5: ( ( ( rule__UnparsedExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:1: ( ( rule__UnparsedExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:1: ( ( rule__UnparsedExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:784:1: ( rule__UnparsedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:785:1: ( rule__UnparsedExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:785:2: rule__UnparsedExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnparsedExpression__Alternatives_in_ruleUnparsedExpression1506);
            rule__UnparsedExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedExpressionAccess().getAlternatives()); 
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
    // $ANTLR end ruleUnparsedExpression


    // $ANTLR start entryRuleUnparsedCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:797:1: entryRuleUnparsedCommand : ruleUnparsedCommand EOF ;
    public final void entryRuleUnparsedCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:798:1: ( ruleUnparsedCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:799:1: ruleUnparsedCommand EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandRule()); 
            }
            pushFollow(FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand1533);
            ruleUnparsedCommand();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnparsedCommand1540); if (failed) return ;

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
    // $ANTLR end entryRuleUnparsedCommand


    // $ANTLR start ruleUnparsedCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:806:1: ruleUnparsedCommand : ( ( rule__UnparsedCommand__Group__0 ) ) ;
    public final void ruleUnparsedCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:810:5: ( ( ( rule__UnparsedCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:811:1: ( ( rule__UnparsedCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:811:1: ( ( rule__UnparsedCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:812:1: ( rule__UnparsedCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:813:1: ( rule__UnparsedCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:813:2: rule__UnparsedCommand__Group__0
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__0_in_ruleUnparsedCommand1570);
            rule__UnparsedCommand__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedCommandAccess().getGroup()); 
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
    // $ANTLR end ruleUnparsedCommand


    // $ANTLR start entryRuleReference
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:825:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:826:1: ( ruleReference EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:827:1: ruleReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1597);
            ruleReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1604); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:834:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:838:5: ( ( ( rule__Reference__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:839:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:839:1: ( ( rule__Reference__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:840:1: ( rule__Reference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:841:1: ( rule__Reference__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:841:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1634);
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


    // $ANTLR start entryRuleText
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:853:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:854:1: ( ruleText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:855:1: ruleText EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText1661);
            ruleText();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1668); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:862:1: ruleText : ( ( rule__Text__ValueAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:866:5: ( ( ( rule__Text__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:867:1: ( ( rule__Text__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:867:1: ( ( rule__Text__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:868:1: ( rule__Text__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:869:1: ( rule__Text__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:869:2: rule__Text__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Text__ValueAssignment_in_ruleText1698);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:881:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:882:1: ( ruleNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:883:1: ruleNumber EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1725);
            ruleNumber();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1732); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:890:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:894:5: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:895:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:895:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:1: ( rule__Number__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:897:1: ( rule__Number__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:897:2: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1762);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:909:1: entryRuleScheme : ruleScheme EOF ;
    public final void entryRuleScheme() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:913:1: ( ruleScheme EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:914:1: ruleScheme EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeRule()); 
            }
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme1794);
            ruleScheme();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme1801); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:924:1: ruleScheme : ( ( rule__Scheme__Group__0 ) ) ;
    public final void ruleScheme() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:929:5: ( ( ( rule__Scheme__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:1: ( ( rule__Scheme__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:1: ( ( rule__Scheme__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:931:1: ( rule__Scheme__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:932:1: ( rule__Scheme__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:932:2: rule__Scheme__Group__0
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0_in_ruleScheme1835);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:945:1: entryRuleSchemeExpression : ruleSchemeExpression EOF ;
    public final void entryRuleSchemeExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:946:1: ( ruleSchemeExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:947:1: ruleSchemeExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression1862);
            ruleSchemeExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeExpression1869); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:954:1: ruleSchemeExpression : ( ( rule__SchemeExpression__Group__0 ) ) ;
    public final void ruleSchemeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:958:5: ( ( ( rule__SchemeExpression__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:959:1: ( ( rule__SchemeExpression__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:959:1: ( ( rule__SchemeExpression__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:960:1: ( rule__SchemeExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:961:1: ( rule__SchemeExpression__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:961:2: rule__SchemeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0_in_ruleSchemeExpression1899);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:973:1: entryRuleSchemeValue : ruleSchemeValue EOF ;
    public final void entryRuleSchemeValue() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:974:1: ( ruleSchemeValue EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:975:1: ruleSchemeValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeValueRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue1926);
            ruleSchemeValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeValue1933); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:982:1: ruleSchemeValue : ( ( rule__SchemeValue__Alternatives ) ) ;
    public final void ruleSchemeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:986:5: ( ( ( rule__SchemeValue__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:987:1: ( ( rule__SchemeValue__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:987:1: ( ( rule__SchemeValue__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:988:1: ( rule__SchemeValue__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeValueAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:989:1: ( rule__SchemeValue__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:989:2: rule__SchemeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeValue__Alternatives_in_ruleSchemeValue1963);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1001:1: entryRuleSchemeBoolean : ruleSchemeBoolean EOF ;
    public final void entryRuleSchemeBoolean() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1002:1: ( ruleSchemeBoolean EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1003:1: ruleSchemeBoolean EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1990);
            ruleSchemeBoolean();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBoolean1997); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1010:1: ruleSchemeBoolean : ( ( rule__SchemeBoolean__ValueAssignment ) ) ;
    public final void ruleSchemeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1014:5: ( ( ( rule__SchemeBoolean__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1015:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1015:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1016:1: ( rule__SchemeBoolean__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1017:1: ( rule__SchemeBoolean__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1017:2: rule__SchemeBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeBoolean__ValueAssignment_in_ruleSchemeBoolean2027);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1029:1: entryRuleSchemeList : ruleSchemeList EOF ;
    public final void entryRuleSchemeList() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1030:1: ( ruleSchemeList EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1031:1: ruleSchemeList EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeList_in_entryRuleSchemeList2054);
            ruleSchemeList();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeList2061); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1038:1: ruleSchemeList : ( ( rule__SchemeList__Group__0 ) ) ;
    public final void ruleSchemeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1042:5: ( ( ( rule__SchemeList__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1043:1: ( ( rule__SchemeList__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1043:1: ( ( rule__SchemeList__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1044:1: ( rule__SchemeList__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1045:1: ( rule__SchemeList__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1045:2: rule__SchemeList__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0_in_ruleSchemeList2091);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1057:1: entryRuleSchemeBlock : ruleSchemeBlock EOF ;
    public final void entryRuleSchemeBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1058:1: ( ruleSchemeBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1059:1: ruleSchemeBlock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock2118);
            ruleSchemeBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeBlock2125); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1066:1: ruleSchemeBlock : ( ( rule__SchemeBlock__Group__0 ) ) ;
    public final void ruleSchemeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1070:5: ( ( ( rule__SchemeBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1071:1: ( ( rule__SchemeBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1071:1: ( ( rule__SchemeBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1072:1: ( rule__SchemeBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1073:1: ( rule__SchemeBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1073:2: rule__SchemeBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0_in_ruleSchemeBlock2155);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1085:1: entryRuleSchemeCharacter : ruleSchemeCharacter EOF ;
    public final void entryRuleSchemeCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1086:1: ( ruleSchemeCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1087:1: ruleSchemeCharacter EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter2182);
            ruleSchemeCharacter();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeCharacterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeCharacter2189); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1094:1: ruleSchemeCharacter : ( ( rule__SchemeCharacter__Group__0 ) ) ;
    public final void ruleSchemeCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1098:5: ( ( ( rule__SchemeCharacter__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1099:1: ( ( rule__SchemeCharacter__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1099:1: ( ( rule__SchemeCharacter__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1100:1: ( rule__SchemeCharacter__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1101:1: ( rule__SchemeCharacter__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1101:2: rule__SchemeCharacter__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__0_in_ruleSchemeCharacter2219);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1113:1: entryRuleSchemeText : ruleSchemeText EOF ;
    public final void entryRuleSchemeText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1114:1: ( ruleSchemeText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1115:1: ruleSchemeText EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeText_in_entryRuleSchemeText2246);
            ruleSchemeText();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeText2253); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1122:1: ruleSchemeText : ( ( rule__SchemeText__ValueAssignment ) ) ;
    public final void ruleSchemeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1126:5: ( ( ( rule__SchemeText__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1127:1: ( ( rule__SchemeText__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1127:1: ( ( rule__SchemeText__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1128:1: ( rule__SchemeText__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1129:1: ( rule__SchemeText__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1129:2: rule__SchemeText__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText2283);
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


    // $ANTLR start entryRuleSchemeId
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1141:1: entryRuleSchemeId : ruleSchemeId EOF ;
    public final void entryRuleSchemeId() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1145:1: ( ruleSchemeId EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1146:1: ruleSchemeId EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeId_in_entryRuleSchemeId2315);
            ruleSchemeId();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeIdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeId2322); if (failed) return ;

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
    // $ANTLR end entryRuleSchemeId


    // $ANTLR start ruleSchemeId
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1156:1: ruleSchemeId : ( ( rule__SchemeId__Group__0 ) ) ;
    public final void ruleSchemeId() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1161:5: ( ( ( rule__SchemeId__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1162:1: ( ( rule__SchemeId__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1162:1: ( ( rule__SchemeId__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( rule__SchemeId__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1164:1: ( rule__SchemeId__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1164:2: rule__SchemeId__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeId__Group__0_in_ruleSchemeId2356);
            rule__SchemeId__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeIdAccess().getGroup()); 
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
    // $ANTLR end ruleSchemeId


    // $ANTLR start entryRuleSchemeTextLiteral
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1177:1: entryRuleSchemeTextLiteral : ruleSchemeTextLiteral EOF ;
    public final void entryRuleSchemeTextLiteral() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1178:1: ( ruleSchemeTextLiteral EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1179:1: ruleSchemeTextLiteral EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_entryRuleSchemeTextLiteral2383);
            ruleSchemeTextLiteral();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeTextLiteral2390); if (failed) return ;

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
    // $ANTLR end entryRuleSchemeTextLiteral


    // $ANTLR start ruleSchemeTextLiteral
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1186:1: ruleSchemeTextLiteral : ( ( rule__SchemeTextLiteral__Alternatives ) ) ;
    public final void ruleSchemeTextLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1190:5: ( ( ( rule__SchemeTextLiteral__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1191:1: ( ( rule__SchemeTextLiteral__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1191:1: ( ( rule__SchemeTextLiteral__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1192:1: ( rule__SchemeTextLiteral__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextLiteralAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1193:1: ( rule__SchemeTextLiteral__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1193:2: rule__SchemeTextLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__SchemeTextLiteral__Alternatives_in_ruleSchemeTextLiteral2420);
            rule__SchemeTextLiteral__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextLiteralAccess().getAlternatives()); 
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
    // $ANTLR end ruleSchemeTextLiteral


    // $ANTLR start entryRuleSchemeNumber
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1205:1: entryRuleSchemeNumber : ruleSchemeNumber EOF ;
    public final void entryRuleSchemeNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1209:1: ( ruleSchemeNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1210:1: ruleSchemeNumber EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber2452);
            ruleSchemeNumber();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumber2459); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1220:1: ruleSchemeNumber : ( ( rule__SchemeNumber__Group__0 ) ) ;
    public final void ruleSchemeNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1225:5: ( ( ( rule__SchemeNumber__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1226:1: ( ( rule__SchemeNumber__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1226:1: ( ( rule__SchemeNumber__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1227:1: ( rule__SchemeNumber__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1228:1: ( rule__SchemeNumber__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1228:2: rule__SchemeNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0_in_ruleSchemeNumber2493);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1241:1: entryRuleSchemeNumberRadix : ruleSchemeNumberRadix EOF ;
    public final void entryRuleSchemeNumberRadix() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1242:1: ( ruleSchemeNumberRadix EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1243:1: ruleSchemeNumberRadix EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix2520);
            ruleSchemeNumberRadix();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRadixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeNumberRadix2527); if (failed) return ;

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
    // $ANTLR end entryRuleSchemeNumberRadix


    // $ANTLR start ruleSchemeNumberRadix
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1250:1: ruleSchemeNumberRadix : ( ( rule__SchemeNumberRadix__Group__0 ) ) ;
    public final void ruleSchemeNumberRadix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1254:5: ( ( ( rule__SchemeNumberRadix__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1255:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1255:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1256:1: ( rule__SchemeNumberRadix__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1257:1: ( rule__SchemeNumberRadix__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1257:2: rule__SchemeNumberRadix__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__0_in_ruleSchemeNumberRadix2557);
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

        }
        return ;
    }
    // $ANTLR end ruleSchemeNumberRadix


    // $ANTLR start entryRuleSchemeMarkupCommand
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1269:1: entryRuleSchemeMarkupCommand : ruleSchemeMarkupCommand EOF ;
    public final void entryRuleSchemeMarkupCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1273:1: ( ruleSchemeMarkupCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1274:1: ruleSchemeMarkupCommand EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandRule()); 
            }
            pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand2589);
            ruleSchemeMarkupCommand();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeMarkupCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemeMarkupCommand2596); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1284:1: ruleSchemeMarkupCommand : ( ( rule__SchemeMarkupCommand__Group__0 ) ) ;
    public final void ruleSchemeMarkupCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1289:5: ( ( ( rule__SchemeMarkupCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1290:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1290:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1291:1: ( rule__SchemeMarkupCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1292:1: ( rule__SchemeMarkupCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1292:2: rule__SchemeMarkupCommand__Group__0
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__0_in_ruleSchemeMarkupCommand2630);
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


    // $ANTLR start entryRuleIdentifier
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1305:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1309:1: ( ruleIdentifier EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1310:1: ruleIdentifier EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier2662);
            ruleIdentifier();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdentifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier2669); if (failed) return ;

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
    // $ANTLR end entryRuleIdentifier


    // $ANTLR start ruleIdentifier
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1320:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1325:5: ( ( ( rule__Identifier__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1326:1: ( ( rule__Identifier__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1326:1: ( ( rule__Identifier__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1327:1: ( rule__Identifier__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1328:1: ( rule__Identifier__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1328:2: rule__Identifier__Group__0
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0_in_ruleIdentifier2703);
            rule__Identifier__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getGroup()); 
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
    // $ANTLR end ruleIdentifier


    // $ANTLR start entryRuleBoolean
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1341:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1342:1: ( ruleBoolean EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1343:1: ruleBoolean EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2730);
            ruleBoolean();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2737); if (failed) return ;

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
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1350:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1354:5: ( ( ( rule__Boolean__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1355:1: ( ( rule__Boolean__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1355:1: ( ( rule__Boolean__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1356:1: ( rule__Boolean__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1357:1: ( rule__Boolean__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1357:2: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_rule__Boolean__Group__0_in_ruleBoolean2767);
            rule__Boolean__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getGroup()); 
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
    // $ANTLR end ruleBoolean


    // $ANTLR start rule__ToplevelExpression__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1369:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );
    public final void rule__ToplevelExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1373:1: ( ( ruleAssignment ) | ( ruleCommonExpression ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
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
                        new NoViableAltException("1369:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 1, input);

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
                        new NoViableAltException("1369:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_25:
            case KEYWORD_27:
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
            case KEYWORD_15:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_20:
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt2=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1369:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1374:1: ( ruleAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1374:1: ( ruleAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__ToplevelExpression__Alternatives2803);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1380:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1380:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1381:1: ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getToplevelExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_rule__ToplevelExpression__Alternatives2820);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1391:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1395:1: ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
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
                        new NoViableAltException("1391:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 1, input);

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
                        new NoViableAltException("1391:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_25:
            case KEYWORD_27:
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
            case KEYWORD_15:
            case KEYWORD_16:
            case KEYWORD_18:
            case KEYWORD_20:
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1391:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1396:1: ( rulePropertyAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1396:1: ( rulePropertyAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1397:1: rulePropertyAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_rule__Expression__Alternatives2852);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1402:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1402:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1403:1: ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_rule__Expression__Alternatives2869);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1413:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__CommonExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1417:1: ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case KEYWORD_15:
                {
                alt4=1;
                }
                break;
            case KEYWORD_25:
            case KEYWORD_18:
                {
                alt4=2;
                }
                break;
            case KEYWORD_2:
                {
                alt4=3;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_27:
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
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
            case RULE_STRING:
            case RULE_ALPHA:
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
                    new NoViableAltException("1413:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1418:1: ( ruleCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1418:1: ( ruleCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1419:1: ruleCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCommand_in_rule__CommonExpression__Alternatives2901);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1424:6: ( ruleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1424:6: ( ruleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1425:1: ruleBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__CommonExpression__Alternatives2918);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1430:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1430:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1431:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getSchemeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__CommonExpression__Alternatives2935);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1436:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1436:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1437:1: ruleText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__CommonExpression__Alternatives2952);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1442:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1442:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1443:1: ruleNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getNumberParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumber_in_rule__CommonExpression__Alternatives2969);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1453:1: rule__Assignment__NameAlternatives_0_0 : ( ( ruleIdentifier ) | ( RULE_STRING ) );
    public final void rule__Assignment__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1457:1: ( ( ruleIdentifier ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ALPHA) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1453:1: rule__Assignment__NameAlternatives_0_0 : ( ( ruleIdentifier ) | ( RULE_STRING ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1458:1: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1458:1: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1459:1: ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getNameIdentifierParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rule__Assignment__NameAlternatives_0_03001);
                    ruleIdentifier();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getNameIdentifierParserRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1464:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1464:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assignment__NameAlternatives_0_03018); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1475:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( ruleIdentifier ) | ( RULE_STRING ) );
    public final void rule__PropertyAssignment__IdAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1479:1: ( ( ruleIdentifier ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ALPHA) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1475:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( ruleIdentifier ) | ( RULE_STRING ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1480:1: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1480:1: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1481:1: ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPropertyAssignmentAccess().getIdIdentifierParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rule__PropertyAssignment__IdAlternatives_0_03050);
                    ruleIdentifier();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPropertyAssignmentAccess().getIdIdentifierParserRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1486:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1486:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1487:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPropertyAssignmentAccess().getIdSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertyAssignment__IdAlternatives_0_03067); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1497:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1501:1: ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_18) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_25) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1497:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1502:1: ( ruleSimpleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1502:1: ( ruleSimpleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1503:1: ruleSimpleBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives3099);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1508:6: ( ruleSimultaneousBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1508:6: ( ruleSimultaneousBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1509:1: ruleSimultaneousBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives3116);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1519:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1523:1: ( ( ruleSpecialCommand ) | ( ruleReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_15) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ALPHA) ) {
                    alt8=2;
                }
                else if ( ((LA8_1>=KEYWORD_88 && LA8_1<=KEYWORD_30)||LA8_1==KEYWORD_1||(LA8_1>=KEYWORD_5 && LA8_1<=KEYWORD_7)||LA8_1==KEYWORD_11||(LA8_1>=KEYWORD_13 && LA8_1<=KEYWORD_14)||LA8_1==KEYWORD_16||LA8_1==KEYWORD_20) ) {
                    alt8=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1519:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1519:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1524:1: ( ruleSpecialCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1524:1: ( ruleSpecialCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1525:1: ruleSpecialCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives3148);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1530:6: ( ruleReference )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1530:6: ( ruleReference )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1531:1: ruleReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReference_in_rule__Command__Alternatives3165);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1541:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );
    public final void rule__SpecialCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1545:1: ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) )
            int alt9=6;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_15) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_83:
                    {
                    alt9=4;
                    }
                    break;
                case KEYWORD_63:
                    {
                    alt9=1;
                    }
                    break;
                case KEYWORD_60:
                    {
                    alt9=5;
                    }
                    break;
                case KEYWORD_54:
                    {
                    alt9=3;
                    }
                    break;
                case KEYWORD_65:
                    {
                    alt9=2;
                    }
                    break;
                case KEYWORD_88:
                case KEYWORD_86:
                case KEYWORD_87:
                case KEYWORD_84:
                case KEYWORD_85:
                case KEYWORD_81:
                case KEYWORD_82:
                case KEYWORD_79:
                case KEYWORD_80:
                case KEYWORD_74:
                case KEYWORD_75:
                case KEYWORD_76:
                case KEYWORD_77:
                case KEYWORD_78:
                case KEYWORD_66:
                case KEYWORD_67:
                case KEYWORD_68:
                case KEYWORD_69:
                case KEYWORD_70:
                case KEYWORD_71:
                case KEYWORD_72:
                case KEYWORD_73:
                case KEYWORD_59:
                case KEYWORD_61:
                case KEYWORD_62:
                case KEYWORD_64:
                case KEYWORD_48:
                case KEYWORD_49:
                case KEYWORD_50:
                case KEYWORD_51:
                case KEYWORD_52:
                case KEYWORD_53:
                case KEYWORD_55:
                case KEYWORD_56:
                case KEYWORD_57:
                case KEYWORD_58:
                case KEYWORD_41:
                case KEYWORD_42:
                case KEYWORD_43:
                case KEYWORD_44:
                case KEYWORD_45:
                case KEYWORD_46:
                case KEYWORD_47:
                case KEYWORD_31:
                case KEYWORD_32:
                case KEYWORD_33:
                case KEYWORD_34:
                case KEYWORD_35:
                case KEYWORD_36:
                case KEYWORD_37:
                case KEYWORD_38:
                case KEYWORD_39:
                case KEYWORD_40:
                case KEYWORD_28:
                case KEYWORD_29:
                case KEYWORD_30:
                case KEYWORD_1:
                case KEYWORD_5:
                case KEYWORD_6:
                case KEYWORD_7:
                case KEYWORD_11:
                case KEYWORD_13:
                case KEYWORD_14:
                case KEYWORD_16:
                case KEYWORD_20:
                    {
                    alt9=6;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1541:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1541:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1546:1: ( ruleInclude )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1546:1: ( ruleInclude )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1547:1: ruleInclude
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives3197);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1552:6: ( ruleVersion )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1552:6: ( ruleVersion )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1553:1: ruleVersion
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives3214);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1558:6: ( ruleMarkup )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1558:6: ( ruleMarkup )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1559:1: ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_rule__SpecialCommand__Alternatives3231);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1564:6: ( ruleMarkupLines )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1564:6: ( ruleMarkupLines )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1565:1: ruleMarkupLines
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_rule__SpecialCommand__Alternatives3248);
                    ruleMarkupLines();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1570:6: ( ruleContext )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1570:6: ( ruleContext )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1571:1: ruleContext
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getContextParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleContext_in_rule__SpecialCommand__Alternatives3265);
                    ruleContext();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandAccess().getContextParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1576:6: ( ruleOther )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1576:6: ( ruleOther )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:1: ruleOther
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getOtherParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleOther_in_rule__SpecialCommand__Alternatives3282);
                    ruleOther();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandAccess().getOtherParserRuleCall_5()); 
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


    // $ANTLR start rule__MarkupBody__CommandAlternatives_1_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1587:1: rule__MarkupBody__CommandAlternatives_1_0 : ( ( ruleScheme ) | ( ruleUnparsedCommand ) );
    public final void rule__MarkupBody__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1591:1: ( ( ruleScheme ) | ( ruleUnparsedCommand ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_2) ) {
                alt10=1;
            }
            else if ( (LA10_0==KEYWORD_15) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1587:1: rule__MarkupBody__CommandAlternatives_1_0 : ( ( ruleScheme ) | ( ruleUnparsedCommand ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1592:1: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1592:1: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1593:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupBodyAccess().getCommandSchemeParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__MarkupBody__CommandAlternatives_1_03314);
                    ruleScheme();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMarkupBodyAccess().getCommandSchemeParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1598:6: ( ruleUnparsedCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1598:6: ( ruleUnparsedCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1599:1: ruleUnparsedCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_rule__MarkupBody__CommandAlternatives_1_03331);
                    ruleUnparsedCommand();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1()); 
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
    // $ANTLR end rule__MarkupBody__CommandAlternatives_1_0


    // $ANTLR start rule__Other__KeywordAlternatives_1_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1609:1: rule__Other__KeywordAlternatives_1_0 : ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) );
    public final void rule__Other__KeywordAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1613:1: ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
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
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_64:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
                {
                alt11=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1609:1: rule__Other__KeywordAlternatives_1_0 : ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1614:1: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1614:1: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1615:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherAccess().getKeywordSpecialCharacterParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__Other__KeywordAlternatives_1_03363);
                    ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherAccess().getKeywordSpecialCharacterParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1620:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1620:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1621:1: KEYWORD_5
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherAccess().getKeywordLeftParenthesisKeyword_1_0_1()); 
                    }
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Other__KeywordAlternatives_1_03381); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherAccess().getKeywordLeftParenthesisKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1628:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1628:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1629:1: KEYWORD_6
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherAccess().getKeywordRightParenthesisKeyword_1_0_2()); 
                    }
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Other__KeywordAlternatives_1_03401); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherAccess().getKeywordRightParenthesisKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1636:6: ( ruleOtherName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1636:6: ( ruleOtherName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1637:1: ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherAccess().getKeywordOtherNameParserRuleCall_1_0_3()); 
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_rule__Other__KeywordAlternatives_1_03420);
                    ruleOtherName();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherAccess().getKeywordOtherNameParserRuleCall_1_0_3()); 
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
    // $ANTLR end rule__Other__KeywordAlternatives_1_0


    // $ANTLR start rule__OtherName__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1647:1: rule__OtherName__Alternatives : ( ( KEYWORD_59 ) | ( KEYWORD_74 ) | ( KEYWORD_41 ) | ( KEYWORD_81 ) | ( KEYWORD_31 ) | ( KEYWORD_66 ) | ( KEYWORD_48 ) | ( KEYWORD_75 ) | ( KEYWORD_49 ) | ( KEYWORD_67 ) | ( KEYWORD_61 ) | ( KEYWORD_84 ) | ( KEYWORD_50 ) | ( KEYWORD_82 ) | ( KEYWORD_68 ) | ( KEYWORD_42 ) | ( KEYWORD_79 ) | ( KEYWORD_62 ) | ( KEYWORD_88 ) | ( KEYWORD_51 ) | ( KEYWORD_28 ) | ( KEYWORD_52 ) | ( KEYWORD_76 ) | ( KEYWORD_53 ) | ( KEYWORD_69 ) | ( KEYWORD_77 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_34 ) | ( KEYWORD_29 ) | ( KEYWORD_70 ) | ( KEYWORD_71 ) | ( KEYWORD_55 ) | ( KEYWORD_35 ) | ( KEYWORD_72 ) | ( KEYWORD_43 ) | ( KEYWORD_64 ) | ( KEYWORD_73 ) | ( KEYWORD_56 ) | ( KEYWORD_57 ) | ( KEYWORD_36 ) | ( KEYWORD_58 ) | ( KEYWORD_44 ) | ( KEYWORD_80 ) | ( KEYWORD_30 ) | ( KEYWORD_85 ) | ( KEYWORD_37 ) | ( KEYWORD_86 ) | ( KEYWORD_87 ) | ( KEYWORD_45 ) | ( KEYWORD_38 ) | ( KEYWORD_46 ) | ( KEYWORD_78 ) | ( KEYWORD_39 ) | ( KEYWORD_47 ) | ( KEYWORD_40 ) );
    public final void rule__OtherName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1651:1: ( ( KEYWORD_59 ) | ( KEYWORD_74 ) | ( KEYWORD_41 ) | ( KEYWORD_81 ) | ( KEYWORD_31 ) | ( KEYWORD_66 ) | ( KEYWORD_48 ) | ( KEYWORD_75 ) | ( KEYWORD_49 ) | ( KEYWORD_67 ) | ( KEYWORD_61 ) | ( KEYWORD_84 ) | ( KEYWORD_50 ) | ( KEYWORD_82 ) | ( KEYWORD_68 ) | ( KEYWORD_42 ) | ( KEYWORD_79 ) | ( KEYWORD_62 ) | ( KEYWORD_88 ) | ( KEYWORD_51 ) | ( KEYWORD_28 ) | ( KEYWORD_52 ) | ( KEYWORD_76 ) | ( KEYWORD_53 ) | ( KEYWORD_69 ) | ( KEYWORD_77 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_34 ) | ( KEYWORD_29 ) | ( KEYWORD_70 ) | ( KEYWORD_71 ) | ( KEYWORD_55 ) | ( KEYWORD_35 ) | ( KEYWORD_72 ) | ( KEYWORD_43 ) | ( KEYWORD_64 ) | ( KEYWORD_73 ) | ( KEYWORD_56 ) | ( KEYWORD_57 ) | ( KEYWORD_36 ) | ( KEYWORD_58 ) | ( KEYWORD_44 ) | ( KEYWORD_80 ) | ( KEYWORD_30 ) | ( KEYWORD_85 ) | ( KEYWORD_37 ) | ( KEYWORD_86 ) | ( KEYWORD_87 ) | ( KEYWORD_45 ) | ( KEYWORD_38 ) | ( KEYWORD_46 ) | ( KEYWORD_78 ) | ( KEYWORD_39 ) | ( KEYWORD_47 ) | ( KEYWORD_40 ) )
            int alt12=56;
            switch ( input.LA(1) ) {
            case KEYWORD_59:
                {
                alt12=1;
                }
                break;
            case KEYWORD_74:
                {
                alt12=2;
                }
                break;
            case KEYWORD_41:
                {
                alt12=3;
                }
                break;
            case KEYWORD_81:
                {
                alt12=4;
                }
                break;
            case KEYWORD_31:
                {
                alt12=5;
                }
                break;
            case KEYWORD_66:
                {
                alt12=6;
                }
                break;
            case KEYWORD_48:
                {
                alt12=7;
                }
                break;
            case KEYWORD_75:
                {
                alt12=8;
                }
                break;
            case KEYWORD_49:
                {
                alt12=9;
                }
                break;
            case KEYWORD_67:
                {
                alt12=10;
                }
                break;
            case KEYWORD_61:
                {
                alt12=11;
                }
                break;
            case KEYWORD_84:
                {
                alt12=12;
                }
                break;
            case KEYWORD_50:
                {
                alt12=13;
                }
                break;
            case KEYWORD_82:
                {
                alt12=14;
                }
                break;
            case KEYWORD_68:
                {
                alt12=15;
                }
                break;
            case KEYWORD_42:
                {
                alt12=16;
                }
                break;
            case KEYWORD_79:
                {
                alt12=17;
                }
                break;
            case KEYWORD_62:
                {
                alt12=18;
                }
                break;
            case KEYWORD_88:
                {
                alt12=19;
                }
                break;
            case KEYWORD_51:
                {
                alt12=20;
                }
                break;
            case KEYWORD_28:
                {
                alt12=21;
                }
                break;
            case KEYWORD_52:
                {
                alt12=22;
                }
                break;
            case KEYWORD_76:
                {
                alt12=23;
                }
                break;
            case KEYWORD_53:
                {
                alt12=24;
                }
                break;
            case KEYWORD_69:
                {
                alt12=25;
                }
                break;
            case KEYWORD_77:
                {
                alt12=26;
                }
                break;
            case KEYWORD_32:
                {
                alt12=27;
                }
                break;
            case KEYWORD_33:
                {
                alt12=28;
                }
                break;
            case KEYWORD_34:
                {
                alt12=29;
                }
                break;
            case KEYWORD_29:
                {
                alt12=30;
                }
                break;
            case KEYWORD_70:
                {
                alt12=31;
                }
                break;
            case KEYWORD_71:
                {
                alt12=32;
                }
                break;
            case KEYWORD_55:
                {
                alt12=33;
                }
                break;
            case KEYWORD_35:
                {
                alt12=34;
                }
                break;
            case KEYWORD_72:
                {
                alt12=35;
                }
                break;
            case KEYWORD_43:
                {
                alt12=36;
                }
                break;
            case KEYWORD_64:
                {
                alt12=37;
                }
                break;
            case KEYWORD_73:
                {
                alt12=38;
                }
                break;
            case KEYWORD_56:
                {
                alt12=39;
                }
                break;
            case KEYWORD_57:
                {
                alt12=40;
                }
                break;
            case KEYWORD_36:
                {
                alt12=41;
                }
                break;
            case KEYWORD_58:
                {
                alt12=42;
                }
                break;
            case KEYWORD_44:
                {
                alt12=43;
                }
                break;
            case KEYWORD_80:
                {
                alt12=44;
                }
                break;
            case KEYWORD_30:
                {
                alt12=45;
                }
                break;
            case KEYWORD_85:
                {
                alt12=46;
                }
                break;
            case KEYWORD_37:
                {
                alt12=47;
                }
                break;
            case KEYWORD_86:
                {
                alt12=48;
                }
                break;
            case KEYWORD_87:
                {
                alt12=49;
                }
                break;
            case KEYWORD_45:
                {
                alt12=50;
                }
                break;
            case KEYWORD_38:
                {
                alt12=51;
                }
                break;
            case KEYWORD_46:
                {
                alt12=52;
                }
                break;
            case KEYWORD_78:
                {
                alt12=53;
                }
                break;
            case KEYWORD_39:
                {
                alt12=54;
                }
                break;
            case KEYWORD_47:
                {
                alt12=55;
                }
                break;
            case KEYWORD_40:
                {
                alt12=56;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1647:1: rule__OtherName__Alternatives : ( ( KEYWORD_59 ) | ( KEYWORD_74 ) | ( KEYWORD_41 ) | ( KEYWORD_81 ) | ( KEYWORD_31 ) | ( KEYWORD_66 ) | ( KEYWORD_48 ) | ( KEYWORD_75 ) | ( KEYWORD_49 ) | ( KEYWORD_67 ) | ( KEYWORD_61 ) | ( KEYWORD_84 ) | ( KEYWORD_50 ) | ( KEYWORD_82 ) | ( KEYWORD_68 ) | ( KEYWORD_42 ) | ( KEYWORD_79 ) | ( KEYWORD_62 ) | ( KEYWORD_88 ) | ( KEYWORD_51 ) | ( KEYWORD_28 ) | ( KEYWORD_52 ) | ( KEYWORD_76 ) | ( KEYWORD_53 ) | ( KEYWORD_69 ) | ( KEYWORD_77 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_34 ) | ( KEYWORD_29 ) | ( KEYWORD_70 ) | ( KEYWORD_71 ) | ( KEYWORD_55 ) | ( KEYWORD_35 ) | ( KEYWORD_72 ) | ( KEYWORD_43 ) | ( KEYWORD_64 ) | ( KEYWORD_73 ) | ( KEYWORD_56 ) | ( KEYWORD_57 ) | ( KEYWORD_36 ) | ( KEYWORD_58 ) | ( KEYWORD_44 ) | ( KEYWORD_80 ) | ( KEYWORD_30 ) | ( KEYWORD_85 ) | ( KEYWORD_37 ) | ( KEYWORD_86 ) | ( KEYWORD_87 ) | ( KEYWORD_45 ) | ( KEYWORD_38 ) | ( KEYWORD_46 ) | ( KEYWORD_78 ) | ( KEYWORD_39 ) | ( KEYWORD_47 ) | ( KEYWORD_40 ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1652:1: ( KEYWORD_59 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1652:1: ( KEYWORD_59 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1653:1: KEYWORD_59
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0()); 
                    }
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_rule__OtherName__Alternatives3453); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1660:6: ( KEYWORD_74 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1660:6: ( KEYWORD_74 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1661:1: KEYWORD_74
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1()); 
                    }
                    match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_rule__OtherName__Alternatives3473); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1668:6: ( KEYWORD_41 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1668:6: ( KEYWORD_41 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1669:1: KEYWORD_41
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAliasKeyword_2()); 
                    }
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rule__OtherName__Alternatives3493); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAliasKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1676:6: ( KEYWORD_81 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1676:6: ( KEYWORD_81 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1677:1: KEYWORD_81
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3()); 
                    }
                    match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_rule__OtherName__Alternatives3513); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1684:6: ( KEYWORD_31 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1684:6: ( KEYWORD_31 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1685:1: KEYWORD_31
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getBookKeyword_4()); 
                    }
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__OtherName__Alternatives3533); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getBookKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1692:6: ( KEYWORD_66 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1692:6: ( KEYWORD_66 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1693:1: KEYWORD_66
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getBookpartKeyword_5()); 
                    }
                    match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_rule__OtherName__Alternatives3553); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getBookpartKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1700:6: ( KEYWORD_48 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1700:6: ( KEYWORD_48 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1701:1: KEYWORD_48
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChangeKeyword_6()); 
                    }
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rule__OtherName__Alternatives3573); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChangeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1708:6: ( KEYWORD_75 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1708:6: ( KEYWORD_75 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1709:1: KEYWORD_75
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChordmodeKeyword_7()); 
                    }
                    match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_rule__OtherName__Alternatives3593); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChordmodeKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1716:6: ( KEYWORD_49 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1716:6: ( KEYWORD_49 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1717:1: KEYWORD_49
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChordsKeyword_8()); 
                    }
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_rule__OtherName__Alternatives3613); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChordsKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1724:6: ( KEYWORD_67 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1724:6: ( KEYWORD_67 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1725:1: KEYWORD_67
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getConsistsKeyword_9()); 
                    }
                    match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_rule__OtherName__Alternatives3633); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getConsistsKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1732:6: ( KEYWORD_61 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1732:6: ( KEYWORD_61 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1733:1: KEYWORD_61
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDefaultKeyword_10()); 
                    }
                    match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_rule__OtherName__Alternatives3653); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDefaultKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1740:6: ( KEYWORD_84 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1740:6: ( KEYWORD_84 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1741:1: KEYWORD_84
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_11()); 
                    }
                    match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_rule__OtherName__Alternatives3673); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1748:6: ( KEYWORD_50 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1748:6: ( KEYWORD_50 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1749:1: KEYWORD_50
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDeniesKeyword_12()); 
                    }
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rule__OtherName__Alternatives3693); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDeniesKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1756:6: ( KEYWORD_82 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1756:6: ( KEYWORD_82 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1757:1: KEYWORD_82
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDescriptionKeyword_13()); 
                    }
                    match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_rule__OtherName__Alternatives3713); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDescriptionKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1764:6: ( KEYWORD_68 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1764:6: ( KEYWORD_68 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1765:1: KEYWORD_68
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDrummodeKeyword_14()); 
                    }
                    match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_rule__OtherName__Alternatives3733); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDrummodeKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1772:6: ( KEYWORD_42 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1772:6: ( KEYWORD_42 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1773:1: KEYWORD_42
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDrumsKeyword_15()); 
                    }
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__OtherName__Alternatives3753); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDrumsKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1780:6: ( KEYWORD_79 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1780:6: ( KEYWORD_79 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1781:1: KEYWORD_79
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getFiguremodeKeyword_16()); 
                    }
                    match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_rule__OtherName__Alternatives3773); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getFiguremodeKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1788:6: ( KEYWORD_62 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1788:6: ( KEYWORD_62 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1789:1: KEYWORD_62
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getFiguresKeyword_17()); 
                    }
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rule__OtherName__Alternatives3793); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getFiguresKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1796:6: ( KEYWORD_88 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1796:6: ( KEYWORD_88 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1797:1: KEYWORD_88
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_18()); 
                    }
                    match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_rule__OtherName__Alternatives3813); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1804:6: ( KEYWORD_51 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1804:6: ( KEYWORD_51 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1805:1: KEYWORD_51
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getHeaderKeyword_19()); 
                    }
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rule__OtherName__Alternatives3833); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getHeaderKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1812:6: ( KEYWORD_28 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1812:6: ( KEYWORD_28 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1813:1: KEYWORD_28
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getKeyKeyword_20()); 
                    }
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__OtherName__Alternatives3853); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getKeyKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1820:6: ( KEYWORD_52 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1820:6: ( KEYWORD_52 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1821:1: KEYWORD_52
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLayoutKeyword_21()); 
                    }
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rule__OtherName__Alternatives3873); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLayoutKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1828:6: ( KEYWORD_76 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1828:6: ( KEYWORD_76 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1829:1: KEYWORD_76
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricmodeKeyword_22()); 
                    }
                    match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_rule__OtherName__Alternatives3893); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricmodeKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1836:6: ( KEYWORD_53 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1836:6: ( KEYWORD_53 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1837:1: KEYWORD_53
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricsKeyword_23()); 
                    }
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rule__OtherName__Alternatives3913); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricsKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1844:6: ( KEYWORD_69 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1844:6: ( KEYWORD_69 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1845:1: KEYWORD_69
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricstoKeyword_24()); 
                    }
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_rule__OtherName__Alternatives3933); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricstoKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1852:6: ( KEYWORD_77 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1852:6: ( KEYWORD_77 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1853:1: KEYWORD_77
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMaininputKeyword_25()); 
                    }
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_rule__OtherName__Alternatives3953); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMaininputKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1860:6: ( KEYWORD_32 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1860:6: ( KEYWORD_32 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1861:1: KEYWORD_32
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMarkKeyword_26()); 
                    }
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rule__OtherName__Alternatives3973); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMarkKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1868:6: ( KEYWORD_33 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1868:6: ( KEYWORD_33 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1869:1: KEYWORD_33
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMidiKeyword_27()); 
                    }
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__OtherName__Alternatives3993); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMidiKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1876:6: ( KEYWORD_34 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1876:6: ( KEYWORD_34 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1877:1: KEYWORD_34
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNameKeyword_28()); 
                    }
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rule__OtherName__Alternatives4013); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNameKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1884:6: ( KEYWORD_29 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1884:6: ( KEYWORD_29 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1885:1: KEYWORD_29
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNewKeyword_29()); 
                    }
                    match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__OtherName__Alternatives4033); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNewKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1892:6: ( KEYWORD_70 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1892:6: ( KEYWORD_70 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1893:1: KEYWORD_70
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNotemodeKeyword_30()); 
                    }
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_rule__OtherName__Alternatives4053); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNotemodeKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1900:6: ( KEYWORD_71 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1900:6: ( KEYWORD_71 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1901:1: KEYWORD_71
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getObjectidKeyword_31()); 
                    }
                    match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_rule__OtherName__Alternatives4073); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getObjectidKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1908:6: ( KEYWORD_55 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1908:6: ( KEYWORD_55 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1909:1: KEYWORD_55
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOctaveKeyword_32()); 
                    }
                    match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_rule__OtherName__Alternatives4093); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOctaveKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1916:6: ( KEYWORD_35 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1916:6: ( KEYWORD_35 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1917:1: KEYWORD_35
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOnceKeyword_33()); 
                    }
                    match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__OtherName__Alternatives4113); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOnceKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1924:6: ( KEYWORD_72 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1924:6: ( KEYWORD_72 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1925:1: KEYWORD_72
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOverrideKeyword_34()); 
                    }
                    match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_rule__OtherName__Alternatives4133); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOverrideKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1932:6: ( KEYWORD_43 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1932:6: ( KEYWORD_43 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1933:1: KEYWORD_43
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getPaperKeyword_35()); 
                    }
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rule__OtherName__Alternatives4153); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getPaperKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1940:6: ( KEYWORD_64 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1940:6: ( KEYWORD_64 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1941:1: KEYWORD_64
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getPartialKeyword_36()); 
                    }
                    match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rule__OtherName__Alternatives4173); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getPartialKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1948:6: ( KEYWORD_73 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1948:6: ( KEYWORD_73 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1949:1: KEYWORD_73
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRelativeKeyword_37()); 
                    }
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_rule__OtherName__Alternatives4193); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRelativeKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1956:6: ( KEYWORD_56 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1956:6: ( KEYWORD_56 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1957:1: KEYWORD_56
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRemoveKeyword_38()); 
                    }
                    match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_rule__OtherName__Alternatives4213); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRemoveKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1964:6: ( KEYWORD_57 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1964:6: ( KEYWORD_57 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1965:1: KEYWORD_57
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRepeatKeyword_39()); 
                    }
                    match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_rule__OtherName__Alternatives4233); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRepeatKeyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1972:6: ( KEYWORD_36 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1972:6: ( KEYWORD_36 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1973:1: KEYWORD_36
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRestKeyword_40()); 
                    }
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rule__OtherName__Alternatives4253); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRestKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1980:6: ( KEYWORD_58 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1980:6: ( KEYWORD_58 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1981:1: KEYWORD_58
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRevertKeyword_41()); 
                    }
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_rule__OtherName__Alternatives4273); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRevertKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1988:6: ( KEYWORD_44 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1988:6: ( KEYWORD_44 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1989:1: KEYWORD_44
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getScoreKeyword_42()); 
                    }
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rule__OtherName__Alternatives4293); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getScoreKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1996:6: ( KEYWORD_80 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1996:6: ( KEYWORD_80 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1997:1: KEYWORD_80
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSequentialKeyword_43()); 
                    }
                    match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_rule__OtherName__Alternatives4313); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSequentialKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2004:6: ( KEYWORD_30 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2004:6: ( KEYWORD_30 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2005:1: KEYWORD_30
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSetKeyword_44()); 
                    }
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__OtherName__Alternatives4333); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSetKeyword_44()); 
                    }

                    }


                    }
                    break;
                case 46 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2012:6: ( KEYWORD_85 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2012:6: ( KEYWORD_85 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2013:1: KEYWORD_85
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_45()); 
                    }
                    match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_rule__OtherName__Alternatives4353); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_45()); 
                    }

                    }


                    }
                    break;
                case 47 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2020:6: ( KEYWORD_37 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2020:6: ( KEYWORD_37 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2021:1: KEYWORD_37
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSkipKeyword_46()); 
                    }
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_rule__OtherName__Alternatives4373); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSkipKeyword_46()); 
                    }

                    }


                    }
                    break;
                case 48 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2028:6: ( KEYWORD_86 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2028:6: ( KEYWORD_86 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2029:1: KEYWORD_86
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_47()); 
                    }
                    match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_rule__OtherName__Alternatives4393); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_47()); 
                    }

                    }


                    }
                    break;
                case 49 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2036:6: ( KEYWORD_87 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2036:6: ( KEYWORD_87 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2037:1: KEYWORD_87
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_48()); 
                    }
                    match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_rule__OtherName__Alternatives4413); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_48()); 
                    }

                    }


                    }
                    break;
                case 50 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2044:6: ( KEYWORD_45 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2044:6: ( KEYWORD_45 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2045:1: KEYWORD_45
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTempoKeyword_49()); 
                    }
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rule__OtherName__Alternatives4433); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTempoKeyword_49()); 
                    }

                    }


                    }
                    break;
                case 51 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2052:6: ( KEYWORD_38 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2052:6: ( KEYWORD_38 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2053:1: KEYWORD_38
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTimeKeyword_50()); 
                    }
                    match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rule__OtherName__Alternatives4453); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTimeKeyword_50()); 
                    }

                    }


                    }
                    break;
                case 52 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2060:6: ( KEYWORD_46 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2060:6: ( KEYWORD_46 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2061:1: KEYWORD_46
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTimesKeyword_51()); 
                    }
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rule__OtherName__Alternatives4473); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTimesKeyword_51()); 
                    }

                    }


                    }
                    break;
                case 53 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2068:6: ( KEYWORD_78 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2068:6: ( KEYWORD_78 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2069:1: KEYWORD_78
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTransposeKeyword_52()); 
                    }
                    match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_rule__OtherName__Alternatives4493); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTransposeKeyword_52()); 
                    }

                    }


                    }
                    break;
                case 54 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2076:6: ( KEYWORD_39 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2076:6: ( KEYWORD_39 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2077:1: KEYWORD_39
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTypeKeyword_53()); 
                    }
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rule__OtherName__Alternatives4513); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTypeKeyword_53()); 
                    }

                    }


                    }
                    break;
                case 55 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2084:6: ( KEYWORD_47 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2084:6: ( KEYWORD_47 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2085:1: KEYWORD_47
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getUnsetKeyword_54()); 
                    }
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rule__OtherName__Alternatives4533); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getUnsetKeyword_54()); 
                    }

                    }


                    }
                    break;
                case 56 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2092:6: ( KEYWORD_40 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2092:6: ( KEYWORD_40 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2093:1: KEYWORD_40
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getWithKeyword_55()); 
                    }
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rule__OtherName__Alternatives4553); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getWithKeyword_55()); 
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
    // $ANTLR end rule__OtherName__Alternatives


    // $ANTLR start rule__SpecialCommandName__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2105:1: rule__SpecialCommandName__Alternatives : ( ( KEYWORD_63 ) | ( KEYWORD_65 ) | ( KEYWORD_54 ) | ( KEYWORD_83 ) | ( KEYWORD_60 ) | ( ruleOtherName ) );
    public final void rule__SpecialCommandName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2109:1: ( ( KEYWORD_63 ) | ( KEYWORD_65 ) | ( KEYWORD_54 ) | ( KEYWORD_83 ) | ( KEYWORD_60 ) | ( ruleOtherName ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case KEYWORD_63:
                {
                alt13=1;
                }
                break;
            case KEYWORD_65:
                {
                alt13=2;
                }
                break;
            case KEYWORD_54:
                {
                alt13=3;
                }
                break;
            case KEYWORD_83:
                {
                alt13=4;
                }
                break;
            case KEYWORD_60:
                {
                alt13=5;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_64:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
                {
                alt13=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2105:1: rule__SpecialCommandName__Alternatives : ( ( KEYWORD_63 ) | ( KEYWORD_65 ) | ( KEYWORD_54 ) | ( KEYWORD_83 ) | ( KEYWORD_60 ) | ( ruleOtherName ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2110:1: ( KEYWORD_63 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2110:1: ( KEYWORD_63 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2111:1: KEYWORD_63
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0()); 
                    }
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_rule__SpecialCommandName__Alternatives4588); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2118:6: ( KEYWORD_65 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2118:6: ( KEYWORD_65 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2119:1: KEYWORD_65
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1()); 
                    }
                    match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_rule__SpecialCommandName__Alternatives4608); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2126:6: ( KEYWORD_54 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2126:6: ( KEYWORD_54 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2127:1: KEYWORD_54
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2()); 
                    }
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rule__SpecialCommandName__Alternatives4628); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2134:6: ( KEYWORD_83 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2134:6: ( KEYWORD_83 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2135:1: KEYWORD_83
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3()); 
                    }
                    match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_rule__SpecialCommandName__Alternatives4648); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2142:6: ( KEYWORD_60 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2142:6: ( KEYWORD_60 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2143:1: KEYWORD_60
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_4()); 
                    }
                    match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_rule__SpecialCommandName__Alternatives4668); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2150:6: ( ruleOtherName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2150:6: ( ruleOtherName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2151:1: ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getOtherNameParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_rule__SpecialCommandName__Alternatives4687);
                    ruleOtherName();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getOtherNameParserRuleCall_5()); 
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
    // $ANTLR end rule__SpecialCommandName__Alternatives


    // $ANTLR start rule__SpecialCharacter__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2161:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_14 ) | ( KEYWORD_16 ) | ( KEYWORD_20 ) );
    public final void rule__SpecialCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2165:1: ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_14 ) | ( KEYWORD_16 ) | ( KEYWORD_20 ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
                {
                alt14=1;
                }
                break;
            case KEYWORD_7:
                {
                alt14=2;
                }
                break;
            case KEYWORD_11:
                {
                alt14=3;
                }
                break;
            case KEYWORD_13:
                {
                alt14=4;
                }
                break;
            case KEYWORD_14:
                {
                alt14=5;
                }
                break;
            case KEYWORD_16:
                {
                alt14=6;
                }
                break;
            case KEYWORD_20:
                {
                alt14=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2161:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_14 ) | ( KEYWORD_16 ) | ( KEYWORD_20 ) );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2166:1: ( KEYWORD_1 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2166:1: ( KEYWORD_1 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2167:1: KEYWORD_1
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__SpecialCharacter__Alternatives4720); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2174:6: ( KEYWORD_7 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2174:6: ( KEYWORD_7 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2175:1: KEYWORD_7
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1()); 
                    }
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__SpecialCharacter__Alternatives4740); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2182:6: ( KEYWORD_11 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2182:6: ( KEYWORD_11 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2183:1: KEYWORD_11
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__SpecialCharacter__Alternatives4760); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2190:6: ( KEYWORD_13 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2190:6: ( KEYWORD_13 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2191:1: KEYWORD_13
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3()); 
                    }
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__SpecialCharacter__Alternatives4780); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2198:6: ( KEYWORD_14 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2198:6: ( KEYWORD_14 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2199:1: KEYWORD_14
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4()); 
                    }
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__SpecialCharacter__Alternatives4800); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2206:6: ( KEYWORD_16 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2206:6: ( KEYWORD_16 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:1: KEYWORD_16
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5()); 
                    }
                    match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__SpecialCharacter__Alternatives4820); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2214:6: ( KEYWORD_20 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2214:6: ( KEYWORD_20 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2215:1: KEYWORD_20
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getTildeKeyword_6()); 
                    }
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__SpecialCharacter__Alternatives4840); if (failed) return ;
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


    // $ANTLR start rule__UnparsedExpression__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2227:1: rule__UnparsedExpression__Alternatives : ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__UnparsedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2231:1: ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case KEYWORD_15:
                {
                alt15=1;
                }
                break;
            case KEYWORD_18:
                {
                alt15=2;
                }
                break;
            case KEYWORD_2:
                {
                alt15=3;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_27:
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
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
            case RULE_STRING:
            case RULE_ALPHA:
            case RULE_ANY_OTHER:
                {
                alt15=4;
                }
                break;
            case RULE_INT:
                {
                alt15=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2227:1: rule__UnparsedExpression__Alternatives : ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2232:1: ( ruleUnparsedCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2232:1: ( ruleUnparsedCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2233:1: ruleUnparsedCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getUnparsedCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_rule__UnparsedExpression__Alternatives4874);
                    ruleUnparsedCommand();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnparsedExpressionAccess().getUnparsedCommandParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2238:6: ( ruleUnparsedBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2238:6: ( ruleUnparsedBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2239:1: ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getUnparsedBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_rule__UnparsedExpression__Alternatives4891);
                    ruleUnparsedBlock();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnparsedExpressionAccess().getUnparsedBlockParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2244:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2244:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2245:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getSchemeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__UnparsedExpression__Alternatives4908);
                    ruleScheme();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnparsedExpressionAccess().getSchemeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2250:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2250:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2251:1: ruleText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__UnparsedExpression__Alternatives4925);
                    ruleText();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2256:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2256:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:1: ruleNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getNumberParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumber_in_rule__UnparsedExpression__Alternatives4942);
                    ruleNumber();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnparsedExpressionAccess().getNumberParserRuleCall_4()); 
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
    // $ANTLR end rule__UnparsedExpression__Alternatives


    // $ANTLR start rule__UnparsedCommand__CommandAlternatives_1_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2267:1: rule__UnparsedCommand__CommandAlternatives_1_0 : ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) );
    public final void rule__UnparsedCommand__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2271:1: ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ALPHA) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=KEYWORD_88 && LA16_0<=KEYWORD_30)) ) {
                alt16=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2267:1: rule__UnparsedCommand__CommandAlternatives_1_0 : ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2272:1: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2272:1: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2273:1: ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedCommandAccess().getCommandIdentifierParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rule__UnparsedCommand__CommandAlternatives_1_04974);
                    ruleIdentifier();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnparsedCommandAccess().getCommandIdentifierParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2278:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2278:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2279:1: ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_rule__UnparsedCommand__CommandAlternatives_1_04991);
                    ruleSpecialCommandName();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnparsedCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
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
    // $ANTLR end rule__UnparsedCommand__CommandAlternatives_1_0


    // $ANTLR start rule__Text__ValueAlternatives_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2289:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) );
    public final void rule__Text__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2293:1: ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_27:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
            case RULE_STRING:
            case RULE_ALPHA:
            case RULE_ANY_OTHER:
                {
                alt17=1;
                }
                break;
            case KEYWORD_5:
                {
                alt17=2;
                }
                break;
            case KEYWORD_6:
                {
                alt17=3;
                }
                break;
            case KEYWORD_4:
                {
                alt17=4;
                }
                break;
            case KEYWORD_8:
                {
                alt17=5;
                }
                break;
            case KEYWORD_10:
                {
                alt17=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2289:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2294:1: ( ruleSchemeTextLiteral )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2294:1: ( ruleSchemeTextLiteral )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2295:1: ruleSchemeTextLiteral
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueSchemeTextLiteralParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeTextLiteral_in_rule__Text__ValueAlternatives_05023);
                    ruleSchemeTextLiteral();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueSchemeTextLiteralParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2300:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2300:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2301:1: KEYWORD_5
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1()); 
                    }
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Text__ValueAlternatives_05041); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2308:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2308:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2309:1: KEYWORD_6
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2()); 
                    }
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Text__ValueAlternatives_05061); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2316:6: ( KEYWORD_4 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2316:6: ( KEYWORD_4 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2317:1: KEYWORD_4
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3()); 
                    }
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__Text__ValueAlternatives_05081); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2324:6: ( KEYWORD_8 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2324:6: ( KEYWORD_8 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2325:1: KEYWORD_8
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueCommaKeyword_0_4()); 
                    }
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__Text__ValueAlternatives_05101); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueCommaKeyword_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2332:6: ( KEYWORD_10 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2332:6: ( KEYWORD_10 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2333:1: KEYWORD_10
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueColonKeyword_0_5()); 
                    }
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__Text__ValueAlternatives_05121); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueColonKeyword_0_5()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );
    public final void rule__SchemeExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2349:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case KEYWORD_4:
                {
                alt22=1;
                }
                break;
            case KEYWORD_2:
                {
                int LA22_2 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                int LA22_3 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_23:
                {
                int LA22_4 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 4, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_22:
                {
                int LA22_5 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 5, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_27:
                {
                int LA22_6 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 6, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_12:
                {
                int LA22_7 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 7, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_9:
                {
                int LA22_8 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 8, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_1:
                {
                int LA22_9 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 9, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_7:
                {
                int LA22_10 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 10, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_11:
                {
                int LA22_11 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 11, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_13:
                {
                int LA22_12 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 12, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_14:
                {
                int LA22_13 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 13, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_16:
                {
                int LA22_14 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 14, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_20:
                {
                int LA22_15 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 15, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_63:
                {
                int LA22_16 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 16, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_65:
                {
                int LA22_17 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 17, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_54:
                {
                int LA22_18 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 18, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_83:
                {
                int LA22_19 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 19, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_60:
                {
                int LA22_20 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 20, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_59:
                {
                int LA22_21 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 21, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_74:
                {
                int LA22_22 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 22, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_41:
                {
                int LA22_23 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 23, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_81:
                {
                int LA22_24 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 24, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_31:
                {
                int LA22_25 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 25, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_66:
                {
                int LA22_26 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 26, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_48:
                {
                int LA22_27 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 27, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_75:
                {
                int LA22_28 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 28, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_49:
                {
                int LA22_29 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 29, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_67:
                {
                int LA22_30 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 30, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_61:
                {
                int LA22_31 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 31, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_84:
                {
                int LA22_32 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 32, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_50:
                {
                int LA22_33 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 33, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_82:
                {
                int LA22_34 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 34, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_68:
                {
                int LA22_35 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 35, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_42:
                {
                int LA22_36 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 36, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_79:
                {
                int LA22_37 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 37, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_62:
                {
                int LA22_38 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 38, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_88:
                {
                int LA22_39 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 39, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_51:
                {
                int LA22_40 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 40, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_28:
                {
                int LA22_41 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 41, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_52:
                {
                int LA22_42 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 42, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_76:
                {
                int LA22_43 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 43, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_53:
                {
                int LA22_44 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 44, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_69:
                {
                int LA22_45 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 45, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_77:
                {
                int LA22_46 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 46, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_32:
                {
                int LA22_47 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 47, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_33:
                {
                int LA22_48 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 48, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_34:
                {
                int LA22_49 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 49, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_29:
                {
                int LA22_50 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 50, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_70:
                {
                int LA22_51 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 51, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_71:
                {
                int LA22_52 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 52, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_55:
                {
                int LA22_53 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 53, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_35:
                {
                int LA22_54 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 54, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_72:
                {
                int LA22_55 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 55, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_43:
                {
                int LA22_56 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 56, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_64:
                {
                int LA22_57 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 57, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_73:
                {
                int LA22_58 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 58, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_56:
                {
                int LA22_59 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 59, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_57:
                {
                int LA22_60 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 60, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_36:
                {
                int LA22_61 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 61, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_58:
                {
                int LA22_62 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 62, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_44:
                {
                int LA22_63 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 63, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_80:
                {
                int LA22_64 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 64, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_30:
                {
                int LA22_65 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 65, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_85:
                {
                int LA22_66 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 66, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_37:
                {
                int LA22_67 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 67, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_86:
                {
                int LA22_68 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 68, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_87:
                {
                int LA22_69 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 69, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_45:
                {
                int LA22_70 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 70, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_38:
                {
                int LA22_71 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 71, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_46:
                {
                int LA22_72 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 72, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_78:
                {
                int LA22_73 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 73, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_39:
                {
                int LA22_74 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 74, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_47:
                {
                int LA22_75 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 75, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_40:
                {
                int LA22_76 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 76, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ALPHA:
                {
                int LA22_77 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 77, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA22_78 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 78, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ANY_OTHER:
                {
                int LA22_79 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 79, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA22_80 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 80, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_21:
                {
                int LA22_81 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 81, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                int LA22_82 = input.LA(2);

                if ( (synpred98()) ) {
                    alt22=1;
                }
                else if ( (synpred100()) ) {
                    alt22=2;
                }
                else if ( (synpred102()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 82, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_17:
                {
                alt22=2;
                }
                break;
            case KEYWORD_8:
                {
                alt22=3;
                }
                break;
            case KEYWORD_3:
                {
                alt22=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2345:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2350:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2350:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2351:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2352:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==KEYWORD_4) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2352:2: rule__SchemeExpression__QuotedAssignment_0_0
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_rule__SchemeExpression__Alternatives_05155);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2356:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2356:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2357:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2358:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==KEYWORD_17) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2358:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_rule__SchemeExpression__Alternatives_05174);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2362:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2362:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2363:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2364:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KEYWORD_8) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2364:2: rule__SchemeExpression__UnquotedAssignment_0_2
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_rule__SchemeExpression__Alternatives_05193);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2368:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2368:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2369:1: ( rule__SchemeExpression__VariableAssignment_0_3 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getVariableAssignment_0_3()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2370:1: ( rule__SchemeExpression__VariableAssignment_0_3 )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==KEYWORD_3) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2370:2: rule__SchemeExpression__VariableAssignment_0_3
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__VariableAssignment_0_3_in_rule__SchemeExpression__Alternatives_05212);
                            rule__SchemeExpression__VariableAssignment_0_3();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2379:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );
    public final void rule__SchemeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2383:1: ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==KEYWORD_5) ) {
                    alt23=2;
                }
                else if ( (LA23_1==RULE_ALPHA) ) {
                    int LA23_8 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt23=1;
                    }
                    else if ( (synpred109()) ) {
                        alt23=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("2379:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 23, 8, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2379:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                alt23=2;
                }
                break;
            case KEYWORD_23:
                {
                alt23=3;
                }
                break;
            case KEYWORD_22:
                {
                alt23=4;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_27:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
            case RULE_STRING:
            case RULE_ALPHA:
            case RULE_ANY_OTHER:
                {
                alt23=5;
                }
                break;
            case RULE_INT:
                {
                alt23=6;
                }
                break;
            case KEYWORD_21:
                {
                alt23=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2379:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ( ruleSchemeBoolean )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ( ruleSchemeBoolean )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2385:1: ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives5246);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2390:6: ( ruleSchemeList )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2390:6: ( ruleSchemeList )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2391:1: ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives5263);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2396:6: ( ruleSchemeBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2396:6: ( ruleSchemeBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2397:1: ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives5280);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2402:6: ( ruleSchemeCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2402:6: ( ruleSchemeCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2403:1: ruleSchemeCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_rule__SchemeValue__Alternatives5297);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2408:6: ( ruleSchemeText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2408:6: ( ruleSchemeText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2409:1: ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives5314);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2414:6: ( ruleSchemeNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2414:6: ( ruleSchemeNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:1: ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives5331);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2420:6: ( ruleSchemeMarkupCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2420:6: ( ruleSchemeMarkupCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2421:1: ruleSchemeMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_rule__SchemeValue__Alternatives5348);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2431:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ALPHA ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeCharacter__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2435:1: ( ( RULE_ALPHA ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt24=1;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
                {
                alt24=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt24=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2431:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ALPHA ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2436:1: ( RULE_ALPHA )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2436:1: ( RULE_ALPHA )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2437:1: RULE_ALPHA
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueALPHATerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__SchemeCharacter__ValueAlternatives_1_05380); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeCharacterAccess().getValueALPHATerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2442:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2442:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2443:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeCharacter__ValueAlternatives_1_05397);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2448:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2448:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2449:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueANY_OTHERTerminalRuleCall_1_0_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeCharacter__ValueAlternatives_1_05414); if (failed) return ;
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


    // $ANTLR start rule__SchemeTextLiteral__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2459:1: rule__SchemeTextLiteral__Alternatives : ( ( KEYWORD_27 ) | ( KEYWORD_12 ) | ( KEYWORD_9 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( ruleIdentifier ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeTextLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2463:1: ( ( KEYWORD_27 ) | ( KEYWORD_12 ) | ( KEYWORD_9 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( ruleIdentifier ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
            int alt25=8;
            switch ( input.LA(1) ) {
            case KEYWORD_27:
                {
                alt25=1;
                }
                break;
            case KEYWORD_12:
                {
                alt25=2;
                }
                break;
            case KEYWORD_9:
                {
                alt25=3;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_16:
            case KEYWORD_20:
                {
                alt25=4;
                }
                break;
            case KEYWORD_88:
            case KEYWORD_86:
            case KEYWORD_87:
            case KEYWORD_84:
            case KEYWORD_85:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_30:
                {
                alt25=5;
                }
                break;
            case RULE_ALPHA:
                {
                alt25=6;
                }
                break;
            case RULE_STRING:
                {
                alt25=7;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt25=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2459:1: rule__SchemeTextLiteral__Alternatives : ( ( KEYWORD_27 ) | ( KEYWORD_12 ) | ( KEYWORD_9 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( ruleIdentifier ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2464:1: ( KEYWORD_27 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2464:1: ( KEYWORD_27 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2465:1: KEYWORD_27
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }
                    match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__SchemeTextLiteral__Alternatives5447); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2472:6: ( KEYWORD_12 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2472:6: ( KEYWORD_12 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2473:1: KEYWORD_12
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__SchemeTextLiteral__Alternatives5467); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2480:6: ( KEYWORD_9 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2480:6: ( KEYWORD_9 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2481:1: KEYWORD_9
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getHyphenMinusKeyword_2()); 
                    }
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__SchemeTextLiteral__Alternatives5487); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getHyphenMinusKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2488:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2488:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2489:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSpecialCharacterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiteral__Alternatives5506);
                    ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getSpecialCharacterParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2494:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2494:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2495:1: ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSpecialCommandNameParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_rule__SchemeTextLiteral__Alternatives5523);
                    ruleSpecialCommandName();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getSpecialCommandNameParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2500:6: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2500:6: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2501:1: ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getIdentifierParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rule__SchemeTextLiteral__Alternatives5540);
                    ruleIdentifier();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getIdentifierParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2506:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2506:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2507:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSTRINGTerminalRuleCall_6()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SchemeTextLiteral__Alternatives5557); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getSTRINGTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2512:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2512:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2513:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getANY_OTHERTerminalRuleCall_7()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiteral__Alternatives5574); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getANY_OTHERTerminalRuleCall_7()); 
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
    // $ANTLR end rule__SchemeTextLiteral__Alternatives


    // $ANTLR start rule__SchemeMarkupCommand__CommandAlternatives_1_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2523:1: rule__SchemeMarkupCommand__CommandAlternatives_1_0 : ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) );
    public final void rule__SchemeMarkupCommand__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2527:1: ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ALPHA) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=KEYWORD_88 && LA26_0<=KEYWORD_30)) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2523:1: rule__SchemeMarkupCommand__CommandAlternatives_1_0 : ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2528:1: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2528:1: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2529:1: ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeMarkupCommandAccess().getCommandIdentifierParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05606);
                    ruleIdentifier();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeMarkupCommandAccess().getCommandIdentifierParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2534:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2534:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2535:1: ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeMarkupCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05623);
                    ruleSpecialCommandName();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeMarkupCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
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
    // $ANTLR end rule__SchemeMarkupCommand__CommandAlternatives_1_0


    // $ANTLR start rule__Assignment__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2547:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2551:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2552:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05653);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05656);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2559:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2563:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2564:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2564:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2565:1: ( rule__Assignment__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2566:1: ( rule__Assignment__NameAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2566:2: rule__Assignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl5683);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2576:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2580:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2581:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15713);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__15716);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2588:1: rule__Assignment__Group__1__Impl : ( KEYWORD_12 ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2592:1: ( ( KEYWORD_12 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2593:1: ( KEYWORD_12 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2593:1: ( KEYWORD_12 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2594:1: KEYWORD_12
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__Assignment__Group__1__Impl5744); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2607:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2611:1: ( rule__Assignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2612:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__25775);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2618:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2622:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2623:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2623:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2624:1: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2625:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2625:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl5802);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2641:1: rule__PropertyAssignment__Group__0 : rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 ;
    public final void rule__PropertyAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2645:1: ( rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2646:2: rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__05838);
            rule__PropertyAssignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__05841);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2653:1: rule__PropertyAssignment__Group__0__Impl : ( ( rule__PropertyAssignment__IdAssignment_0 ) ) ;
    public final void rule__PropertyAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2657:1: ( ( ( rule__PropertyAssignment__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2658:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2658:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2659:1: ( rule__PropertyAssignment__IdAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2660:1: ( rule__PropertyAssignment__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2660:2: rule__PropertyAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl5868);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2670:1: rule__PropertyAssignment__Group__1 : rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 ;
    public final void rule__PropertyAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2674:1: ( rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2675:2: rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__15898);
            rule__PropertyAssignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__15901);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2682:1: rule__PropertyAssignment__Group__1__Impl : ( KEYWORD_12 ) ;
    public final void rule__PropertyAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2686:1: ( ( KEYWORD_12 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2687:1: ( KEYWORD_12 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2687:1: ( KEYWORD_12 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2688:1: KEYWORD_12
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__PropertyAssignment__Group__1__Impl5929); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2701:1: rule__PropertyAssignment__Group__2 : rule__PropertyAssignment__Group__2__Impl ;
    public final void rule__PropertyAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2705:1: ( rule__PropertyAssignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2706:2: rule__PropertyAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__25960);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2712:1: rule__PropertyAssignment__Group__2__Impl : ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) ;
    public final void rule__PropertyAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2716:1: ( ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2717:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2717:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2718:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2719:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2719:2: rule__PropertyAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl5987);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2735:1: rule__SimpleBlock__Group__0 : rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 ;
    public final void rule__SimpleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2739:1: ( rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2740:2: rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__06023);
            rule__SimpleBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__06026);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2747:1: rule__SimpleBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimpleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2751:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2752:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2752:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2753:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2754:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2756:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2766:1: rule__SimpleBlock__Group__1 : rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 ;
    public final void rule__SimpleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2770:1: ( rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2771:2: rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__16084);
            rule__SimpleBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__16087);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2778:1: rule__SimpleBlock__Group__1__Impl : ( KEYWORD_18 ) ;
    public final void rule__SimpleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2782:1: ( ( KEYWORD_18 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2783:1: ( KEYWORD_18 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2783:1: ( KEYWORD_18 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2784:1: KEYWORD_18
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__SimpleBlock__Group__1__Impl6115); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2797:1: rule__SimpleBlock__Group__2 : rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 ;
    public final void rule__SimpleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2801:1: ( rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2802:2: rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__26146);
            rule__SimpleBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__26149);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2809:1: rule__SimpleBlock__Group__2__Impl : ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimpleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2813:1: ( ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2814:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2814:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2815:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2816:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=KEYWORD_88 && LA27_0<=KEYWORD_30)||LA27_0==KEYWORD_25||(LA27_0>=KEYWORD_27 && LA27_0<=KEYWORD_2)||(LA27_0>=KEYWORD_4 && LA27_0<=KEYWORD_16)||LA27_0==KEYWORD_18||(LA27_0>=KEYWORD_20 && LA27_0<=RULE_ALPHA)||LA27_0==RULE_ANY_OTHER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2816:2: rule__SimpleBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl6176);
            	    rule__SimpleBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2826:1: rule__SimpleBlock__Group__3 : rule__SimpleBlock__Group__3__Impl ;
    public final void rule__SimpleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2830:1: ( rule__SimpleBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2831:2: rule__SimpleBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__36207);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2837:1: rule__SimpleBlock__Group__3__Impl : ( KEYWORD_19 ) ;
    public final void rule__SimpleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2841:1: ( ( KEYWORD_19 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2842:1: ( KEYWORD_19 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2842:1: ( KEYWORD_19 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2843:1: KEYWORD_19
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__SimpleBlock__Group__3__Impl6235); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2864:1: rule__SimultaneousBlock__Group__0 : rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 ;
    public final void rule__SimultaneousBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2868:1: ( rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2869:2: rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__06274);
            rule__SimultaneousBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__06277);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2876:1: rule__SimultaneousBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimultaneousBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2880:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2881:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2881:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2882:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2883:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2885:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2895:1: rule__SimultaneousBlock__Group__1 : rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 ;
    public final void rule__SimultaneousBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2899:1: ( rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2900:2: rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__16335);
            rule__SimultaneousBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__16338);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2907:1: rule__SimultaneousBlock__Group__1__Impl : ( KEYWORD_25 ) ;
    public final void rule__SimultaneousBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2911:1: ( ( KEYWORD_25 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2912:1: ( KEYWORD_25 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2912:1: ( KEYWORD_25 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2913:1: KEYWORD_25
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
            }
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__SimultaneousBlock__Group__1__Impl6366); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2926:1: rule__SimultaneousBlock__Group__2 : rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 ;
    public final void rule__SimultaneousBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2930:1: ( rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2931:2: rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__26397);
            rule__SimultaneousBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__26400);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2938:1: rule__SimultaneousBlock__Group__2__Impl : ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimultaneousBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2942:1: ( ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2943:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2943:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2944:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2945:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=KEYWORD_88 && LA28_0<=KEYWORD_30)||LA28_0==KEYWORD_25||(LA28_0>=KEYWORD_27 && LA28_0<=KEYWORD_2)||(LA28_0>=KEYWORD_4 && LA28_0<=KEYWORD_16)||LA28_0==KEYWORD_18||(LA28_0>=KEYWORD_20 && LA28_0<=RULE_ALPHA)||LA28_0==RULE_ANY_OTHER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2945:2: rule__SimultaneousBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl6427);
            	    rule__SimultaneousBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2955:1: rule__SimultaneousBlock__Group__3 : rule__SimultaneousBlock__Group__3__Impl ;
    public final void rule__SimultaneousBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2959:1: ( rule__SimultaneousBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2960:2: rule__SimultaneousBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__36458);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2966:1: rule__SimultaneousBlock__Group__3__Impl : ( KEYWORD_26 ) ;
    public final void rule__SimultaneousBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2970:1: ( ( KEYWORD_26 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2971:1: ( KEYWORD_26 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2971:1: ( KEYWORD_26 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2972:1: KEYWORD_26
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            }
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__SimultaneousBlock__Group__3__Impl6486); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2993:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2997:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2998:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06525);
            rule__Include__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06528);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3005:1: rule__Include__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3009:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3010:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3010:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3011:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Include__Group__0__Impl6556); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3024:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3028:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3029:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16587);
            rule__Include__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16590);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3036:1: rule__Include__Group__1__Impl : ( KEYWORD_63 ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3040:1: ( ( KEYWORD_63 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3041:1: ( KEYWORD_63 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3041:1: ( KEYWORD_63 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3042:1: KEYWORD_63
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeKeyword_1()); 
            }
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_rule__Include__Group__1__Impl6618); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3055:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3059:1: ( rule__Include__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3060:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26649);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3066:1: rule__Include__Group__2__Impl : ( ( rule__Include__ImportURIAssignment_2 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3070:1: ( ( ( rule__Include__ImportURIAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3071:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3071:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3072:1: ( rule__Include__ImportURIAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURIAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3073:1: ( rule__Include__ImportURIAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3073:2: rule__Include__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl6676);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3089:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3093:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3094:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__06712);
            rule__Version__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06715);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3101:1: rule__Version__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3105:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3106:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3106:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3107:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Version__Group__0__Impl6743); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3120:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3124:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3125:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__16774);
            rule__Version__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__2_in_rule__Version__Group__16777);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3132:1: rule__Version__Group__1__Impl : ( KEYWORD_65 ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3136:1: ( ( KEYWORD_65 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3137:1: ( KEYWORD_65 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3137:1: ( KEYWORD_65 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3138:1: KEYWORD_65
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
            }
            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_rule__Version__Group__1__Impl6805); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3151:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3155:1: ( rule__Version__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3156:2: rule__Version__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__26836);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3162:1: rule__Version__Group__2__Impl : ( ( rule__Version__VersionAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3166:1: ( ( ( rule__Version__VersionAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3167:1: ( ( rule__Version__VersionAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3167:1: ( ( rule__Version__VersionAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3168:1: ( rule__Version__VersionAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3169:1: ( rule__Version__VersionAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3169:2: rule__Version__VersionAssignment_2
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_2_in_rule__Version__Group__2__Impl6863);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3185:1: rule__Markup__Group__0 : rule__Markup__Group__0__Impl rule__Markup__Group__1 ;
    public final void rule__Markup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3189:1: ( rule__Markup__Group__0__Impl rule__Markup__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3190:2: rule__Markup__Group__0__Impl rule__Markup__Group__1
            {
            pushFollow(FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__06899);
            rule__Markup__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__06902);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3197:1: rule__Markup__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Markup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3201:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3202:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3202:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3203:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Markup__Group__0__Impl6930); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3216:1: rule__Markup__Group__1 : rule__Markup__Group__1__Impl rule__Markup__Group__2 ;
    public final void rule__Markup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3220:1: ( rule__Markup__Group__1__Impl rule__Markup__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3221:2: rule__Markup__Group__1__Impl rule__Markup__Group__2
            {
            pushFollow(FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__16961);
            rule__Markup__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__2_in_rule__Markup__Group__16964);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3228:1: rule__Markup__Group__1__Impl : ( KEYWORD_54 ) ;
    public final void rule__Markup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3232:1: ( ( KEYWORD_54 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3233:1: ( KEYWORD_54 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3233:1: ( KEYWORD_54 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3234:1: KEYWORD_54
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getMarkupKeyword_1()); 
            }
            match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rule__Markup__Group__1__Impl6992); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3247:1: rule__Markup__Group__2 : rule__Markup__Group__2__Impl ;
    public final void rule__Markup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3251:1: ( rule__Markup__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3252:2: rule__Markup__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Markup__Group__2__Impl_in_rule__Markup__Group__27023);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3258:1: rule__Markup__Group__2__Impl : ( ( rule__Markup__BodyAssignment_2 ) ) ;
    public final void rule__Markup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3262:1: ( ( ( rule__Markup__BodyAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3263:1: ( ( rule__Markup__BodyAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3263:1: ( ( rule__Markup__BodyAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3264:1: ( rule__Markup__BodyAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBodyAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3265:1: ( rule__Markup__BodyAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3265:2: rule__Markup__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Markup__BodyAssignment_2_in_rule__Markup__Group__2__Impl7050);
            rule__Markup__BodyAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getBodyAssignment_2()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3281:1: rule__MarkupLines__Group__0 : rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1 ;
    public final void rule__MarkupLines__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3285:1: ( rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3286:2: rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__0__Impl_in_rule__MarkupLines__Group__07086);
            rule__MarkupLines__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupLines__Group__1_in_rule__MarkupLines__Group__07089);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3293:1: rule__MarkupLines__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__MarkupLines__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3297:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3298:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3298:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3299:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__MarkupLines__Group__0__Impl7117); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3312:1: rule__MarkupLines__Group__1 : rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2 ;
    public final void rule__MarkupLines__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3316:1: ( rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3317:2: rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__1__Impl_in_rule__MarkupLines__Group__17148);
            rule__MarkupLines__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupLines__Group__2_in_rule__MarkupLines__Group__17151);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3324:1: rule__MarkupLines__Group__1__Impl : ( KEYWORD_83 ) ;
    public final void rule__MarkupLines__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3328:1: ( ( KEYWORD_83 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3329:1: ( KEYWORD_83 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3329:1: ( KEYWORD_83 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3330:1: KEYWORD_83
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getMarkuplinesKeyword_1()); 
            }
            match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_rule__MarkupLines__Group__1__Impl7179); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3343:1: rule__MarkupLines__Group__2 : rule__MarkupLines__Group__2__Impl ;
    public final void rule__MarkupLines__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3347:1: ( rule__MarkupLines__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3348:2: rule__MarkupLines__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__2__Impl_in_rule__MarkupLines__Group__27210);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3354:1: rule__MarkupLines__Group__2__Impl : ( ( rule__MarkupLines__BodyAssignment_2 ) ) ;
    public final void rule__MarkupLines__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3358:1: ( ( ( rule__MarkupLines__BodyAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3359:1: ( ( rule__MarkupLines__BodyAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3359:1: ( ( rule__MarkupLines__BodyAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3360:1: ( rule__MarkupLines__BodyAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getBodyAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3361:1: ( rule__MarkupLines__BodyAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3361:2: rule__MarkupLines__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__MarkupLines__BodyAssignment_2_in_rule__MarkupLines__Group__2__Impl7237);
            rule__MarkupLines__BodyAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupLinesAccess().getBodyAssignment_2()); 
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


    // $ANTLR start rule__MarkupBody__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3377:1: rule__MarkupBody__Group__0 : rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1 ;
    public final void rule__MarkupBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3381:1: ( rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3382:2: rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__0__Impl_in_rule__MarkupBody__Group__07273);
            rule__MarkupBody__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBody__Group__1_in_rule__MarkupBody__Group__07276);
            rule__MarkupBody__Group__1();
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
    // $ANTLR end rule__MarkupBody__Group__0


    // $ANTLR start rule__MarkupBody__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3389:1: rule__MarkupBody__Group__0__Impl : ( () ) ;
    public final void rule__MarkupBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3393:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3394:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3394:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3395:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getMarkupBodyAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3396:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3398:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBodyAccess().getMarkupBodyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupBody__Group__0__Impl


    // $ANTLR start rule__MarkupBody__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3408:1: rule__MarkupBody__Group__1 : rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2 ;
    public final void rule__MarkupBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3412:1: ( rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3413:2: rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__1__Impl_in_rule__MarkupBody__Group__17334);
            rule__MarkupBody__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBody__Group__2_in_rule__MarkupBody__Group__17337);
            rule__MarkupBody__Group__2();
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
    // $ANTLR end rule__MarkupBody__Group__1


    // $ANTLR start rule__MarkupBody__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3420:1: rule__MarkupBody__Group__1__Impl : ( ( rule__MarkupBody__CommandAssignment_1 )* ) ;
    public final void rule__MarkupBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3424:1: ( ( ( rule__MarkupBody__CommandAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3425:1: ( ( rule__MarkupBody__CommandAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3425:1: ( ( rule__MarkupBody__CommandAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3426:1: ( rule__MarkupBody__CommandAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3427:1: ( rule__MarkupBody__CommandAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_15) ) {
                    int LA29_5 = input.LA(2);

                    if ( (synpred122()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==KEYWORD_2) ) {
                    int LA29_7 = input.LA(2);

                    if ( (synpred122()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3427:2: rule__MarkupBody__CommandAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__MarkupBody__CommandAssignment_1_in_rule__MarkupBody__Group__1__Impl7364);
            	    rule__MarkupBody__CommandAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBodyAccess().getCommandAssignment_1()); 
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
    // $ANTLR end rule__MarkupBody__Group__1__Impl


    // $ANTLR start rule__MarkupBody__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3437:1: rule__MarkupBody__Group__2 : rule__MarkupBody__Group__2__Impl ;
    public final void rule__MarkupBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3441:1: ( rule__MarkupBody__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3442:2: rule__MarkupBody__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__2__Impl_in_rule__MarkupBody__Group__27395);
            rule__MarkupBody__Group__2__Impl();
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
    // $ANTLR end rule__MarkupBody__Group__2


    // $ANTLR start rule__MarkupBody__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3448:1: rule__MarkupBody__Group__2__Impl : ( ( rule__MarkupBody__BlockAssignment_2 )? ) ;
    public final void rule__MarkupBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3452:1: ( ( ( rule__MarkupBody__BlockAssignment_2 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3453:1: ( ( rule__MarkupBody__BlockAssignment_2 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3453:1: ( ( rule__MarkupBody__BlockAssignment_2 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3454:1: ( rule__MarkupBody__BlockAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getBlockAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3455:1: ( rule__MarkupBody__BlockAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_18) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred123()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3455:2: rule__MarkupBody__BlockAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MarkupBody__BlockAssignment_2_in_rule__MarkupBody__Group__2__Impl7422);
                    rule__MarkupBody__BlockAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBodyAccess().getBlockAssignment_2()); 
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
    // $ANTLR end rule__MarkupBody__Group__2__Impl


    // $ANTLR start rule__Context__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3471:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3475:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3476:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__07459);
            rule__Context__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__07462);
            rule__Context__Group__1();
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
    // $ANTLR end rule__Context__Group__0


    // $ANTLR start rule__Context__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3483:1: rule__Context__Group__0__Impl : ( () ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3487:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3488:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3488:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3489:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getContextAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3490:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3492:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getContextAccess().getContextAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Context__Group__0__Impl


    // $ANTLR start rule__Context__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3502:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3506:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3507:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__17520);
            rule__Context__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__17523);
            rule__Context__Group__2();
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
    // $ANTLR end rule__Context__Group__1


    // $ANTLR start rule__Context__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3514:1: rule__Context__Group__1__Impl : ( KEYWORD_15 ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3518:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3519:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3519:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3520:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getReverseSolidusKeyword_1()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Context__Group__1__Impl7551); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getContextAccess().getReverseSolidusKeyword_1()); 
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
    // $ANTLR end rule__Context__Group__1__Impl


    // $ANTLR start rule__Context__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3533:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3537:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3538:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__27582);
            rule__Context__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__27585);
            rule__Context__Group__3();
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
    // $ANTLR end rule__Context__Group__2


    // $ANTLR start rule__Context__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3545:1: rule__Context__Group__2__Impl : ( KEYWORD_60 ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3549:1: ( ( KEYWORD_60 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3550:1: ( KEYWORD_60 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3550:1: ( KEYWORD_60 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3551:1: KEYWORD_60
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getContextKeyword_2()); 
            }
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_rule__Context__Group__2__Impl7613); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getContextAccess().getContextKeyword_2()); 
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
    // $ANTLR end rule__Context__Group__2__Impl


    // $ANTLR start rule__Context__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3564:1: rule__Context__Group__3 : rule__Context__Group__3__Impl ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3568:1: ( rule__Context__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3569:2: rule__Context__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__37644);
            rule__Context__Group__3__Impl();
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
    // $ANTLR end rule__Context__Group__3


    // $ANTLR start rule__Context__Group__3__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3575:1: rule__Context__Group__3__Impl : ( ( rule__Context__BlockAssignment_3 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3579:1: ( ( ( rule__Context__BlockAssignment_3 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3580:1: ( ( rule__Context__BlockAssignment_3 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3580:1: ( ( rule__Context__BlockAssignment_3 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3581:1: ( rule__Context__BlockAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getBlockAssignment_3()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3582:1: ( rule__Context__BlockAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_18) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred124()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3582:2: rule__Context__BlockAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Context__BlockAssignment_3_in_rule__Context__Group__3__Impl7671);
                    rule__Context__BlockAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getContextAccess().getBlockAssignment_3()); 
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
    // $ANTLR end rule__Context__Group__3__Impl


    // $ANTLR start rule__Other__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3600:1: rule__Other__Group__0 : rule__Other__Group__0__Impl rule__Other__Group__1 ;
    public final void rule__Other__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3604:1: ( rule__Other__Group__0__Impl rule__Other__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3605:2: rule__Other__Group__0__Impl rule__Other__Group__1
            {
            pushFollow(FOLLOW_rule__Other__Group__0__Impl_in_rule__Other__Group__07710);
            rule__Other__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Other__Group__1_in_rule__Other__Group__07713);
            rule__Other__Group__1();
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
    // $ANTLR end rule__Other__Group__0


    // $ANTLR start rule__Other__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3612:1: rule__Other__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Other__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3616:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3617:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3617:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3618:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Other__Group__0__Impl7741); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOtherAccess().getReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__Other__Group__0__Impl


    // $ANTLR start rule__Other__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3631:1: rule__Other__Group__1 : rule__Other__Group__1__Impl ;
    public final void rule__Other__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3635:1: ( rule__Other__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3636:2: rule__Other__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Other__Group__1__Impl_in_rule__Other__Group__17772);
            rule__Other__Group__1__Impl();
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
    // $ANTLR end rule__Other__Group__1


    // $ANTLR start rule__Other__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3642:1: rule__Other__Group__1__Impl : ( ( rule__Other__KeywordAssignment_1 ) ) ;
    public final void rule__Other__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3646:1: ( ( ( rule__Other__KeywordAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3647:1: ( ( rule__Other__KeywordAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3647:1: ( ( rule__Other__KeywordAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3648:1: ( rule__Other__KeywordAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getKeywordAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3649:1: ( rule__Other__KeywordAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3649:2: rule__Other__KeywordAssignment_1
            {
            pushFollow(FOLLOW_rule__Other__KeywordAssignment_1_in_rule__Other__Group__1__Impl7799);
            rule__Other__KeywordAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOtherAccess().getKeywordAssignment_1()); 
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
    // $ANTLR end rule__Other__Group__1__Impl


    // $ANTLR start rule__UnparsedBlock__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3663:1: rule__UnparsedBlock__Group__0 : rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1 ;
    public final void rule__UnparsedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3667:1: ( rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3668:2: rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__0__Impl_in_rule__UnparsedBlock__Group__07833);
            rule__UnparsedBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__1_in_rule__UnparsedBlock__Group__07836);
            rule__UnparsedBlock__Group__1();
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
    // $ANTLR end rule__UnparsedBlock__Group__0


    // $ANTLR start rule__UnparsedBlock__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3675:1: rule__UnparsedBlock__Group__0__Impl : ( () ) ;
    public final void rule__UnparsedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3679:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3680:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3680:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3681:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getUnparsedBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3682:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3684:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedBlockAccess().getUnparsedBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnparsedBlock__Group__0__Impl


    // $ANTLR start rule__UnparsedBlock__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3694:1: rule__UnparsedBlock__Group__1 : rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2 ;
    public final void rule__UnparsedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3698:1: ( rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3699:2: rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__1__Impl_in_rule__UnparsedBlock__Group__17894);
            rule__UnparsedBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__2_in_rule__UnparsedBlock__Group__17897);
            rule__UnparsedBlock__Group__2();
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
    // $ANTLR end rule__UnparsedBlock__Group__1


    // $ANTLR start rule__UnparsedBlock__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3706:1: rule__UnparsedBlock__Group__1__Impl : ( KEYWORD_18 ) ;
    public final void rule__UnparsedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3710:1: ( ( KEYWORD_18 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3711:1: ( KEYWORD_18 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3711:1: ( KEYWORD_18 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3712:1: KEYWORD_18
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__UnparsedBlock__Group__1__Impl7925); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end rule__UnparsedBlock__Group__1__Impl


    // $ANTLR start rule__UnparsedBlock__Group__2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3725:1: rule__UnparsedBlock__Group__2 : rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3 ;
    public final void rule__UnparsedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3729:1: ( rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3730:2: rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__2__Impl_in_rule__UnparsedBlock__Group__27956);
            rule__UnparsedBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__3_in_rule__UnparsedBlock__Group__27959);
            rule__UnparsedBlock__Group__3();
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
    // $ANTLR end rule__UnparsedBlock__Group__2


    // $ANTLR start rule__UnparsedBlock__Group__2__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3737:1: rule__UnparsedBlock__Group__2__Impl : ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__UnparsedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3741:1: ( ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3742:1: ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3742:1: ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3743:1: ( rule__UnparsedBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3744:1: ( rule__UnparsedBlock__ExpressionsAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=KEYWORD_88 && LA32_0<=KEYWORD_30)||(LA32_0>=KEYWORD_27 && LA32_0<=KEYWORD_2)||(LA32_0>=KEYWORD_4 && LA32_0<=KEYWORD_16)||LA32_0==KEYWORD_18||(LA32_0>=KEYWORD_20 && LA32_0<=RULE_ALPHA)||LA32_0==RULE_ANY_OTHER) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3744:2: rule__UnparsedBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__UnparsedBlock__ExpressionsAssignment_2_in_rule__UnparsedBlock__Group__2__Impl7986);
            	    rule__UnparsedBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedBlockAccess().getExpressionsAssignment_2()); 
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
    // $ANTLR end rule__UnparsedBlock__Group__2__Impl


    // $ANTLR start rule__UnparsedBlock__Group__3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3754:1: rule__UnparsedBlock__Group__3 : rule__UnparsedBlock__Group__3__Impl ;
    public final void rule__UnparsedBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3758:1: ( rule__UnparsedBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3759:2: rule__UnparsedBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__3__Impl_in_rule__UnparsedBlock__Group__38017);
            rule__UnparsedBlock__Group__3__Impl();
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
    // $ANTLR end rule__UnparsedBlock__Group__3


    // $ANTLR start rule__UnparsedBlock__Group__3__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3765:1: rule__UnparsedBlock__Group__3__Impl : ( KEYWORD_19 ) ;
    public final void rule__UnparsedBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3769:1: ( ( KEYWORD_19 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3770:1: ( KEYWORD_19 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3770:1: ( KEYWORD_19 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3771:1: KEYWORD_19
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__UnparsedBlock__Group__3__Impl8045); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedBlockAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end rule__UnparsedBlock__Group__3__Impl


    // $ANTLR start rule__UnparsedCommand__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3792:1: rule__UnparsedCommand__Group__0 : rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1 ;
    public final void rule__UnparsedCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3796:1: ( rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3797:2: rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__0__Impl_in_rule__UnparsedCommand__Group__08084);
            rule__UnparsedCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__1_in_rule__UnparsedCommand__Group__08087);
            rule__UnparsedCommand__Group__1();
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
    // $ANTLR end rule__UnparsedCommand__Group__0


    // $ANTLR start rule__UnparsedCommand__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3804:1: rule__UnparsedCommand__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__UnparsedCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3808:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3809:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3809:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3810:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__UnparsedCommand__Group__0__Impl8115); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0()); 
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
    // $ANTLR end rule__UnparsedCommand__Group__0__Impl


    // $ANTLR start rule__UnparsedCommand__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3823:1: rule__UnparsedCommand__Group__1 : rule__UnparsedCommand__Group__1__Impl ;
    public final void rule__UnparsedCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3827:1: ( rule__UnparsedCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3828:2: rule__UnparsedCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__1__Impl_in_rule__UnparsedCommand__Group__18146);
            rule__UnparsedCommand__Group__1__Impl();
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
    // $ANTLR end rule__UnparsedCommand__Group__1


    // $ANTLR start rule__UnparsedCommand__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3834:1: rule__UnparsedCommand__Group__1__Impl : ( ( rule__UnparsedCommand__CommandAssignment_1 ) ) ;
    public final void rule__UnparsedCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3838:1: ( ( ( rule__UnparsedCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3839:1: ( ( rule__UnparsedCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3839:1: ( ( rule__UnparsedCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3840:1: ( rule__UnparsedCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3841:1: ( rule__UnparsedCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3841:2: rule__UnparsedCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__CommandAssignment_1_in_rule__UnparsedCommand__Group__1__Impl8173);
            rule__UnparsedCommand__CommandAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedCommandAccess().getCommandAssignment_1()); 
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
    // $ANTLR end rule__UnparsedCommand__Group__1__Impl


    // $ANTLR start rule__Reference__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3855:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3859:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3860:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08207);
            rule__Reference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08210);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3867:1: rule__Reference__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3871:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3872:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3872:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3873:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Reference__Group__0__Impl8238); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3886:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3890:1: ( rule__Reference__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3891:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18269);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3897:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__AssignmentAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3901:1: ( ( ( rule__Reference__AssignmentAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3902:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3902:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3903:1: ( rule__Reference__AssignmentAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3904:1: ( rule__Reference__AssignmentAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3904:2: rule__Reference__AssignmentAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl8296);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3918:1: rule__Scheme__Group__0 : rule__Scheme__Group__0__Impl rule__Scheme__Group__1 ;
    public final void rule__Scheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3922:1: ( rule__Scheme__Group__0__Impl rule__Scheme__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3923:2: rule__Scheme__Group__0__Impl rule__Scheme__Group__1
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__08330);
            rule__Scheme__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__08333);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3930:1: rule__Scheme__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__Scheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3934:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3935:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3935:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3936:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl8361); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3949:1: rule__Scheme__Group__1 : rule__Scheme__Group__1__Impl ;
    public final void rule__Scheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3953:1: ( rule__Scheme__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3954:2: rule__Scheme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__18392);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3960:1: rule__Scheme__Group__1__Impl : ( ( rule__Scheme__ValueAssignment_1 ) ) ;
    public final void rule__Scheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3964:1: ( ( ( rule__Scheme__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3965:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3965:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3966:1: ( rule__Scheme__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3967:1: ( rule__Scheme__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3967:2: rule__Scheme__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl8419);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3981:1: rule__SchemeExpression__Group__0 : rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 ;
    public final void rule__SchemeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3985:1: ( rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3986:2: rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__08453);
            rule__SchemeExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__08456);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3993:1: rule__SchemeExpression__Group__0__Impl : ( ( rule__SchemeExpression__Alternatives_0 )? ) ;
    public final void rule__SchemeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3997:1: ( ( ( rule__SchemeExpression__Alternatives_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3998:1: ( ( rule__SchemeExpression__Alternatives_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3998:1: ( ( rule__SchemeExpression__Alternatives_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3999:1: ( rule__SchemeExpression__Alternatives_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4000:1: ( rule__SchemeExpression__Alternatives_0 )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case KEYWORD_3:
                case KEYWORD_4:
                case KEYWORD_8:
                case KEYWORD_17:
                    {
                    alt33=1;
                    }
                    break;
                case KEYWORD_2:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_5:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_23:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_22:
                    {
                    int LA33_5 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_27:
                    {
                    int LA33_6 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_12:
                    {
                    int LA33_7 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_9:
                    {
                    int LA33_8 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_1:
                    {
                    int LA33_9 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_7:
                    {
                    int LA33_10 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_11:
                    {
                    int LA33_11 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_13:
                    {
                    int LA33_12 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_14:
                    {
                    int LA33_13 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_16:
                    {
                    int LA33_14 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_20:
                    {
                    int LA33_15 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_63:
                    {
                    int LA33_16 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_65:
                    {
                    int LA33_17 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_54:
                    {
                    int LA33_18 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_83:
                    {
                    int LA33_19 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_60:
                    {
                    int LA33_20 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_59:
                    {
                    int LA33_21 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_74:
                    {
                    int LA33_22 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_41:
                    {
                    int LA33_23 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_81:
                    {
                    int LA33_24 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_31:
                    {
                    int LA33_25 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_66:
                    {
                    int LA33_26 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_48:
                    {
                    int LA33_27 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_75:
                    {
                    int LA33_28 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_49:
                    {
                    int LA33_29 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_67:
                    {
                    int LA33_30 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_61:
                    {
                    int LA33_31 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_84:
                    {
                    int LA33_32 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_50:
                    {
                    int LA33_33 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_82:
                    {
                    int LA33_34 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_68:
                    {
                    int LA33_35 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_42:
                    {
                    int LA33_36 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_79:
                    {
                    int LA33_37 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_62:
                    {
                    int LA33_38 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_88:
                    {
                    int LA33_39 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_51:
                    {
                    int LA33_40 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_28:
                    {
                    int LA33_41 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_52:
                    {
                    int LA33_42 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_76:
                    {
                    int LA33_43 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_53:
                    {
                    int LA33_44 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_69:
                    {
                    int LA33_45 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_77:
                    {
                    int LA33_46 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_32:
                    {
                    int LA33_47 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_33:
                    {
                    int LA33_48 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_34:
                    {
                    int LA33_49 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_29:
                    {
                    int LA33_50 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_70:
                    {
                    int LA33_51 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_71:
                    {
                    int LA33_52 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_55:
                    {
                    int LA33_53 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_35:
                    {
                    int LA33_54 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_72:
                    {
                    int LA33_55 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_43:
                    {
                    int LA33_56 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_64:
                    {
                    int LA33_57 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_73:
                    {
                    int LA33_58 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_56:
                    {
                    int LA33_59 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_57:
                    {
                    int LA33_60 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_36:
                    {
                    int LA33_61 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_58:
                    {
                    int LA33_62 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_44:
                    {
                    int LA33_63 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_80:
                    {
                    int LA33_64 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_30:
                    {
                    int LA33_65 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_85:
                    {
                    int LA33_66 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_37:
                    {
                    int LA33_67 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_86:
                    {
                    int LA33_68 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_87:
                    {
                    int LA33_69 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_45:
                    {
                    int LA33_70 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_38:
                    {
                    int LA33_71 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_46:
                    {
                    int LA33_72 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_78:
                    {
                    int LA33_73 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_39:
                    {
                    int LA33_74 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_47:
                    {
                    int LA33_75 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_40:
                    {
                    int LA33_76 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case RULE_ALPHA:
                    {
                    int LA33_77 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA33_78 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    int LA33_79 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA33_80 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
                case KEYWORD_21:
                    {
                    int LA33_81 = input.LA(2);

                    if ( (synpred126()) ) {
                        alt33=1;
                    }
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4000:2: rule__SchemeExpression__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl8483);
                    rule__SchemeExpression__Alternatives_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4010:1: rule__SchemeExpression__Group__1 : rule__SchemeExpression__Group__1__Impl ;
    public final void rule__SchemeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4014:1: ( rule__SchemeExpression__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4015:2: rule__SchemeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__18514);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4021:1: rule__SchemeExpression__Group__1__Impl : ( ( rule__SchemeExpression__ValueAssignment_1 ) ) ;
    public final void rule__SchemeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4025:1: ( ( ( rule__SchemeExpression__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4026:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4026:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4027:1: ( rule__SchemeExpression__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4028:1: ( rule__SchemeExpression__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4028:2: rule__SchemeExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl8541);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4042:1: rule__SchemeList__Group__0 : rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 ;
    public final void rule__SchemeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4046:1: ( rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4047:2: rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__08575);
            rule__SchemeList__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__08578);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4054:1: rule__SchemeList__Group__0__Impl : ( () ) ;
    public final void rule__SchemeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4058:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4059:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4059:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4060:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4061:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4063:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4073:1: rule__SchemeList__Group__1 : rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 ;
    public final void rule__SchemeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4077:1: ( rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4078:2: rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__18636);
            rule__SchemeList__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__18639);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4085:1: rule__SchemeList__Group__1__Impl : ( ( rule__SchemeList__VectorAssignment_1 )? ) ;
    public final void rule__SchemeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4089:1: ( ( ( rule__SchemeList__VectorAssignment_1 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4090:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4090:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4091:1: ( rule__SchemeList__VectorAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4092:1: ( rule__SchemeList__VectorAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_2) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4092:2: rule__SchemeList__VectorAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl8666);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4102:1: rule__SchemeList__Group__2 : rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 ;
    public final void rule__SchemeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4106:1: ( rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4107:2: rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__28697);
            rule__SchemeList__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__28700);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4114:1: rule__SchemeList__Group__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__SchemeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4118:1: ( ( KEYWORD_5 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4119:1: ( KEYWORD_5 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4119:1: ( KEYWORD_5 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4120:1: KEYWORD_5
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl8728); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4133:1: rule__SchemeList__Group__3 : rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 ;
    public final void rule__SchemeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4137:1: ( rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4138:2: rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__38759);
            rule__SchemeList__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__38762);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4145:1: rule__SchemeList__Group__3__Impl : ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) ;
    public final void rule__SchemeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4149:1: ( ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4150:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4150:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4151:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_3()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4152:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=KEYWORD_88 && LA35_0<=KEYWORD_23)||(LA35_0>=KEYWORD_27 && LA35_0<=KEYWORD_5)||(LA35_0>=KEYWORD_7 && LA35_0<=KEYWORD_9)||(LA35_0>=KEYWORD_11 && LA35_0<=KEYWORD_14)||(LA35_0>=KEYWORD_16 && LA35_0<=KEYWORD_17)||(LA35_0>=KEYWORD_20 && LA35_0<=RULE_ALPHA)||LA35_0==RULE_ANY_OTHER) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4152:2: rule__SchemeList__ExpressionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl8789);
            	    rule__SchemeList__ExpressionsAssignment_3();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4162:1: rule__SchemeList__Group__4 : rule__SchemeList__Group__4__Impl ;
    public final void rule__SchemeList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4166:1: ( rule__SchemeList__Group__4__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4167:2: rule__SchemeList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__48820);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4173:1: rule__SchemeList__Group__4__Impl : ( KEYWORD_6 ) ;
    public final void rule__SchemeList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4177:1: ( ( KEYWORD_6 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4178:1: ( KEYWORD_6 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4178:1: ( KEYWORD_6 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4179:1: KEYWORD_6
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl8848); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4202:1: rule__SchemeBlock__Group__0 : rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 ;
    public final void rule__SchemeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4206:1: ( rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4207:2: rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__08889);
            rule__SchemeBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__08892);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4214:1: rule__SchemeBlock__Group__0__Impl : ( KEYWORD_23 ) ;
    public final void rule__SchemeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4218:1: ( ( KEYWORD_23 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4219:1: ( KEYWORD_23 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4219:1: ( KEYWORD_23 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4220:1: KEYWORD_23
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 
            }
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__SchemeBlock__Group__0__Impl8920); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4233:1: rule__SchemeBlock__Group__1 : rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 ;
    public final void rule__SchemeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4237:1: ( rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4238:2: rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__18951);
            rule__SchemeBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__18954);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4245:1: rule__SchemeBlock__Group__1__Impl : ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__SchemeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4249:1: ( ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4250:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4250:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4251:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4251:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4252:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4253:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4253:2: rule__SchemeBlock__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl8983);
            rule__SchemeBlock__ExpressionsAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }

            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4256:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4257:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4258:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=KEYWORD_88 && LA36_0<=KEYWORD_30)||LA36_0==KEYWORD_25||(LA36_0>=KEYWORD_27 && LA36_0<=KEYWORD_2)||(LA36_0>=KEYWORD_4 && LA36_0<=KEYWORD_16)||LA36_0==KEYWORD_18||(LA36_0>=KEYWORD_20 && LA36_0<=RULE_ALPHA)||LA36_0==RULE_ANY_OTHER) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4258:2: rule__SchemeBlock__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl8995);
            	    rule__SchemeBlock__ExpressionsAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4269:1: rule__SchemeBlock__Group__2 : rule__SchemeBlock__Group__2__Impl ;
    public final void rule__SchemeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4273:1: ( rule__SchemeBlock__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4274:2: rule__SchemeBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__29028);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4280:1: rule__SchemeBlock__Group__2__Impl : ( KEYWORD_24 ) ;
    public final void rule__SchemeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4284:1: ( ( KEYWORD_24 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4285:1: ( KEYWORD_24 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4285:1: ( KEYWORD_24 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4286:1: KEYWORD_24
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 
            }
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__SchemeBlock__Group__2__Impl9056); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4305:1: rule__SchemeCharacter__Group__0 : rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 ;
    public final void rule__SchemeCharacter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4309:1: ( rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4310:2: rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__09093);
            rule__SchemeCharacter__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__09096);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4317:1: rule__SchemeCharacter__Group__0__Impl : ( KEYWORD_22 ) ;
    public final void rule__SchemeCharacter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4321:1: ( ( KEYWORD_22 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4322:1: ( KEYWORD_22 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4322:1: ( KEYWORD_22 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4323:1: KEYWORD_22
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__SchemeCharacter__Group__0__Impl9124); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4336:1: rule__SchemeCharacter__Group__1 : rule__SchemeCharacter__Group__1__Impl ;
    public final void rule__SchemeCharacter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4340:1: ( rule__SchemeCharacter__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4341:2: rule__SchemeCharacter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__19155);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4347:1: rule__SchemeCharacter__Group__1__Impl : ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) ;
    public final void rule__SchemeCharacter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4351:1: ( ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4352:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4352:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4353:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4354:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4354:2: rule__SchemeCharacter__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl9182);
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


    // $ANTLR start rule__SchemeId__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4368:1: rule__SchemeId__Group__0 : rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1 ;
    public final void rule__SchemeId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4372:1: ( rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4373:2: rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeId__Group__0__Impl_in_rule__SchemeId__Group__09216);
            rule__SchemeId__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeId__Group__1_in_rule__SchemeId__Group__09219);
            rule__SchemeId__Group__1();
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
    // $ANTLR end rule__SchemeId__Group__0


    // $ANTLR start rule__SchemeId__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4380:1: rule__SchemeId__Group__0__Impl : ( ruleSchemeTextLiteral ) ;
    public final void rule__SchemeId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4384:1: ( ( ruleSchemeTextLiteral ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4385:1: ( ruleSchemeTextLiteral )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4385:1: ( ruleSchemeTextLiteral )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4386:1: ruleSchemeTextLiteral
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group__0__Impl9246);
            ruleSchemeTextLiteral();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_0()); 
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
    // $ANTLR end rule__SchemeId__Group__0__Impl


    // $ANTLR start rule__SchemeId__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4397:1: rule__SchemeId__Group__1 : rule__SchemeId__Group__1__Impl ;
    public final void rule__SchemeId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4401:1: ( rule__SchemeId__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4402:2: rule__SchemeId__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeId__Group__1__Impl_in_rule__SchemeId__Group__19275);
            rule__SchemeId__Group__1__Impl();
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
    // $ANTLR end rule__SchemeId__Group__1


    // $ANTLR start rule__SchemeId__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4408:1: rule__SchemeId__Group__1__Impl : ( ( rule__SchemeId__Group_1__0 )? ) ;
    public final void rule__SchemeId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4412:1: ( ( ( rule__SchemeId__Group_1__0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4413:1: ( ( rule__SchemeId__Group_1__0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4413:1: ( ( rule__SchemeId__Group_1__0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4414:1: ( rule__SchemeId__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getGroup_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4415:1: ( rule__SchemeId__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_10) ) {
                switch ( input.LA(2) ) {
                    case KEYWORD_27:
                        {
                        int LA37_3 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_12:
                        {
                        int LA37_4 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_9:
                        {
                        int LA37_5 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_1:
                        {
                        int LA37_6 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_7:
                        {
                        int LA37_7 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_11:
                        {
                        int LA37_8 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_13:
                        {
                        int LA37_9 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_14:
                        {
                        int LA37_10 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_16:
                        {
                        int LA37_11 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_20:
                        {
                        int LA37_12 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_63:
                        {
                        int LA37_13 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_65:
                        {
                        int LA37_14 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_54:
                        {
                        int LA37_15 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_83:
                        {
                        int LA37_16 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_60:
                        {
                        int LA37_17 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_59:
                        {
                        int LA37_18 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_74:
                        {
                        int LA37_19 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_41:
                        {
                        int LA37_20 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_81:
                        {
                        int LA37_21 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_31:
                        {
                        int LA37_22 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_66:
                        {
                        int LA37_23 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_48:
                        {
                        int LA37_24 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_75:
                        {
                        int LA37_25 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_49:
                        {
                        int LA37_26 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_67:
                        {
                        int LA37_27 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_61:
                        {
                        int LA37_28 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_84:
                        {
                        int LA37_29 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_50:
                        {
                        int LA37_30 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_82:
                        {
                        int LA37_31 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_68:
                        {
                        int LA37_32 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_42:
                        {
                        int LA37_33 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_79:
                        {
                        int LA37_34 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_62:
                        {
                        int LA37_35 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_88:
                        {
                        int LA37_36 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_51:
                        {
                        int LA37_37 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_28:
                        {
                        int LA37_38 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_52:
                        {
                        int LA37_39 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_76:
                        {
                        int LA37_40 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_53:
                        {
                        int LA37_41 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_69:
                        {
                        int LA37_42 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_77:
                        {
                        int LA37_43 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_32:
                        {
                        int LA37_44 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_33:
                        {
                        int LA37_45 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_34:
                        {
                        int LA37_46 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_29:
                        {
                        int LA37_47 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_70:
                        {
                        int LA37_48 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_71:
                        {
                        int LA37_49 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_55:
                        {
                        int LA37_50 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_35:
                        {
                        int LA37_51 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_72:
                        {
                        int LA37_52 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_43:
                        {
                        int LA37_53 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_64:
                        {
                        int LA37_54 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_73:
                        {
                        int LA37_55 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_56:
                        {
                        int LA37_56 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_57:
                        {
                        int LA37_57 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_36:
                        {
                        int LA37_58 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_58:
                        {
                        int LA37_59 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_44:
                        {
                        int LA37_60 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_80:
                        {
                        int LA37_61 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_30:
                        {
                        int LA37_62 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_85:
                        {
                        int LA37_63 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_37:
                        {
                        int LA37_64 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_86:
                        {
                        int LA37_65 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_87:
                        {
                        int LA37_66 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_45:
                        {
                        int LA37_67 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_38:
                        {
                        int LA37_68 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_46:
                        {
                        int LA37_69 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_78:
                        {
                        int LA37_70 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_39:
                        {
                        int LA37_71 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_47:
                        {
                        int LA37_72 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case KEYWORD_40:
                        {
                        int LA37_73 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case RULE_ALPHA:
                        {
                        int LA37_74 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA37_75 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                    case RULE_ANY_OTHER:
                        {
                        int LA37_76 = input.LA(3);

                        if ( (synpred130()) ) {
                            alt37=1;
                        }
                        }
                        break;
                }

            }
            switch (alt37) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4415:2: rule__SchemeId__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SchemeId__Group_1__0_in_rule__SchemeId__Group__1__Impl9302);
                    rule__SchemeId__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeIdAccess().getGroup_1()); 
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
    // $ANTLR end rule__SchemeId__Group__1__Impl


    // $ANTLR start rule__SchemeId__Group_1__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4429:1: rule__SchemeId__Group_1__0 : rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1 ;
    public final void rule__SchemeId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4433:1: ( rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4434:2: rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1
            {
            pushFollow(FOLLOW_rule__SchemeId__Group_1__0__Impl_in_rule__SchemeId__Group_1__09337);
            rule__SchemeId__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeId__Group_1__1_in_rule__SchemeId__Group_1__09340);
            rule__SchemeId__Group_1__1();
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
    // $ANTLR end rule__SchemeId__Group_1__0


    // $ANTLR start rule__SchemeId__Group_1__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4441:1: rule__SchemeId__Group_1__0__Impl : ( KEYWORD_10 ) ;
    public final void rule__SchemeId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4445:1: ( ( KEYWORD_10 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4446:1: ( KEYWORD_10 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4446:1: ( KEYWORD_10 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4447:1: KEYWORD_10
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getColonKeyword_1_0()); 
            }
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__SchemeId__Group_1__0__Impl9368); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeIdAccess().getColonKeyword_1_0()); 
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
    // $ANTLR end rule__SchemeId__Group_1__0__Impl


    // $ANTLR start rule__SchemeId__Group_1__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4460:1: rule__SchemeId__Group_1__1 : rule__SchemeId__Group_1__1__Impl ;
    public final void rule__SchemeId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4464:1: ( rule__SchemeId__Group_1__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4465:2: rule__SchemeId__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeId__Group_1__1__Impl_in_rule__SchemeId__Group_1__19399);
            rule__SchemeId__Group_1__1__Impl();
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
    // $ANTLR end rule__SchemeId__Group_1__1


    // $ANTLR start rule__SchemeId__Group_1__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4471:1: rule__SchemeId__Group_1__1__Impl : ( ruleSchemeTextLiteral ) ;
    public final void rule__SchemeId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4475:1: ( ( ruleSchemeTextLiteral ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4476:1: ( ruleSchemeTextLiteral )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4476:1: ( ruleSchemeTextLiteral )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4477:1: ruleSchemeTextLiteral
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group_1__1__Impl9426);
            ruleSchemeTextLiteral();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_1_1()); 
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
    // $ANTLR end rule__SchemeId__Group_1__1__Impl


    // $ANTLR start rule__SchemeNumber__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4492:1: rule__SchemeNumber__Group__0 : rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 ;
    public final void rule__SchemeNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4496:1: ( rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4497:2: rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__09459);
            rule__SchemeNumber__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__09462);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4504:1: rule__SchemeNumber__Group__0__Impl : ( ( rule__SchemeNumber__RadixAssignment_0 )? ) ;
    public final void rule__SchemeNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4508:1: ( ( ( rule__SchemeNumber__RadixAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4509:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4509:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4510:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4511:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_2) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4511:2: rule__SchemeNumber__RadixAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl9489);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4521:1: rule__SchemeNumber__Group__1 : rule__SchemeNumber__Group__1__Impl ;
    public final void rule__SchemeNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4525:1: ( rule__SchemeNumber__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4526:2: rule__SchemeNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__19520);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4532:1: rule__SchemeNumber__Group__1__Impl : ( ( rule__SchemeNumber__ValueAssignment_1 ) ) ;
    public final void rule__SchemeNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4536:1: ( ( ( rule__SchemeNumber__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4537:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4537:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4538:1: ( rule__SchemeNumber__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4539:1: ( rule__SchemeNumber__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4539:2: rule__SchemeNumber__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl9547);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4553:1: rule__SchemeNumberRadix__Group__0 : rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 ;
    public final void rule__SchemeNumberRadix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4557:1: ( rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4558:2: rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__09581);
            rule__SchemeNumberRadix__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__09584);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4565:1: rule__SchemeNumberRadix__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__SchemeNumberRadix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4569:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4570:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4570:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4571:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl9612); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4584:1: rule__SchemeNumberRadix__Group__1 : rule__SchemeNumberRadix__Group__1__Impl ;
    public final void rule__SchemeNumberRadix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4588:1: ( rule__SchemeNumberRadix__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4589:2: rule__SchemeNumberRadix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__19643);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4595:1: rule__SchemeNumberRadix__Group__1__Impl : ( RULE_ALPHA ) ;
    public final void rule__SchemeNumberRadix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4599:1: ( ( RULE_ALPHA ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4600:1: ( RULE_ALPHA )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4600:1: ( RULE_ALPHA )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4601:1: RULE_ALPHA
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getALPHATerminalRuleCall_1()); 
            }
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__SchemeNumberRadix__Group__1__Impl9670); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeNumberRadixAccess().getALPHATerminalRuleCall_1()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4616:1: rule__SchemeMarkupCommand__Group__0 : rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 ;
    public final void rule__SchemeMarkupCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4620:1: ( rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4621:2: rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__09703);
            rule__SchemeMarkupCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__09706);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4628:1: rule__SchemeMarkupCommand__Group__0__Impl : ( KEYWORD_21 ) ;
    public final void rule__SchemeMarkupCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4632:1: ( ( KEYWORD_21 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4633:1: ( KEYWORD_21 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4633:1: ( KEYWORD_21 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4634:1: KEYWORD_21
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0()); 
            }
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__SchemeMarkupCommand__Group__0__Impl9734); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4647:1: rule__SchemeMarkupCommand__Group__1 : rule__SchemeMarkupCommand__Group__1__Impl ;
    public final void rule__SchemeMarkupCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4651:1: ( rule__SchemeMarkupCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4652:2: rule__SchemeMarkupCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__19765);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4658:1: rule__SchemeMarkupCommand__Group__1__Impl : ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) ;
    public final void rule__SchemeMarkupCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4662:1: ( ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4663:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4663:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4664:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4665:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4665:2: rule__SchemeMarkupCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl9792);
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


    // $ANTLR start rule__Identifier__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4679:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4683:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4684:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__09826);
            rule__Identifier__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__09829);
            rule__Identifier__Group__1();
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
    // $ANTLR end rule__Identifier__Group__0


    // $ANTLR start rule__Identifier__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4691:1: rule__Identifier__Group__0__Impl : ( RULE_ALPHA ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4695:1: ( ( RULE_ALPHA ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4696:1: ( RULE_ALPHA )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4696:1: ( RULE_ALPHA )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4697:1: RULE_ALPHA
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_0()); 
            }
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Identifier__Group__0__Impl9856); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_0()); 
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
    // $ANTLR end rule__Identifier__Group__0__Impl


    // $ANTLR start rule__Identifier__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4708:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4712:1: ( rule__Identifier__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4713:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__19885);
            rule__Identifier__Group__1__Impl();
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
    // $ANTLR end rule__Identifier__Group__1


    // $ANTLR start rule__Identifier__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4719:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Group_1__0 )* ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4723:1: ( ( ( rule__Identifier__Group_1__0 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4724:1: ( ( rule__Identifier__Group_1__0 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4724:1: ( ( rule__Identifier__Group_1__0 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4725:1: ( rule__Identifier__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getGroup_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4726:1: ( rule__Identifier__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==KEYWORD_9) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==RULE_ALPHA) ) {
                        int LA39_3 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt39=1;
                        }


                    }


                }


                switch (alt39) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4726:2: rule__Identifier__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl9912);
            	    rule__Identifier__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getGroup_1()); 
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
    // $ANTLR end rule__Identifier__Group__1__Impl


    // $ANTLR start rule__Identifier__Group_1__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4740:1: rule__Identifier__Group_1__0 : rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 ;
    public final void rule__Identifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4744:1: ( rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4745:2: rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__09947);
            rule__Identifier__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__09950);
            rule__Identifier__Group_1__1();
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
    // $ANTLR end rule__Identifier__Group_1__0


    // $ANTLR start rule__Identifier__Group_1__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4752:1: rule__Identifier__Group_1__0__Impl : ( KEYWORD_9 ) ;
    public final void rule__Identifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4756:1: ( ( KEYWORD_9 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4757:1: ( KEYWORD_9 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4757:1: ( KEYWORD_9 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4758:1: KEYWORD_9
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getHyphenMinusKeyword_1_0()); 
            }
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__Identifier__Group_1__0__Impl9978); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getHyphenMinusKeyword_1_0()); 
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
    // $ANTLR end rule__Identifier__Group_1__0__Impl


    // $ANTLR start rule__Identifier__Group_1__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4771:1: rule__Identifier__Group_1__1 : rule__Identifier__Group_1__1__Impl ;
    public final void rule__Identifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4775:1: ( rule__Identifier__Group_1__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4776:2: rule__Identifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__110009);
            rule__Identifier__Group_1__1__Impl();
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
    // $ANTLR end rule__Identifier__Group_1__1


    // $ANTLR start rule__Identifier__Group_1__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4782:1: rule__Identifier__Group_1__1__Impl : ( RULE_ALPHA ) ;
    public final void rule__Identifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4786:1: ( ( RULE_ALPHA ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4787:1: ( RULE_ALPHA )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4787:1: ( RULE_ALPHA )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4788:1: RULE_ALPHA
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_1_1()); 
            }
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Identifier__Group_1__1__Impl10036); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_1_1()); 
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
    // $ANTLR end rule__Identifier__Group_1__1__Impl


    // $ANTLR start rule__Boolean__Group__0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4803:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4807:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4808:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_rule__Boolean__Group__0__Impl_in_rule__Boolean__Group__010069);
            rule__Boolean__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Boolean__Group__1_in_rule__Boolean__Group__010072);
            rule__Boolean__Group__1();
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
    // $ANTLR end rule__Boolean__Group__0


    // $ANTLR start rule__Boolean__Group__0__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4815:1: rule__Boolean__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4819:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4820:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4820:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4821:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Boolean__Group__0__Impl10100); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getNumberSignKeyword_0()); 
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
    // $ANTLR end rule__Boolean__Group__0__Impl


    // $ANTLR start rule__Boolean__Group__1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4834:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4838:1: ( rule__Boolean__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4839:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Boolean__Group__1__Impl_in_rule__Boolean__Group__110131);
            rule__Boolean__Group__1__Impl();
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
    // $ANTLR end rule__Boolean__Group__1


    // $ANTLR start rule__Boolean__Group__1__Impl
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4845:1: rule__Boolean__Group__1__Impl : ( RULE_ALPHA ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4849:1: ( ( RULE_ALPHA ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4850:1: ( RULE_ALPHA )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4850:1: ( RULE_ALPHA )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4851:1: RULE_ALPHA
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getALPHATerminalRuleCall_1()); 
            }
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Boolean__Group__1__Impl10158); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getALPHATerminalRuleCall_1()); 
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
    // $ANTLR end rule__Boolean__Group__1__Impl


    // $ANTLR start rule__LilyPond__ExpressionsAssignment
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4867:1: rule__LilyPond__ExpressionsAssignment : ( ruleToplevelExpression ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4871:1: ( ( ruleToplevelExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4872:1: ( ruleToplevelExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4872:1: ( ruleToplevelExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4873:1: ruleToplevelExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment10196);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4882:1: rule__Assignment__NameAssignment_0 : ( ( rule__Assignment__NameAlternatives_0_0 ) ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4886:1: ( ( ( rule__Assignment__NameAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4887:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4887:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4888:1: ( rule__Assignment__NameAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4889:1: ( rule__Assignment__NameAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4889:2: rule__Assignment__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_010227);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4898:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4902:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4903:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4903:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4904:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_210260);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4913:1: rule__PropertyAssignment__IdAssignment_0 : ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) ;
    public final void rule__PropertyAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4917:1: ( ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4918:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4918:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4919:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4920:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4920:2: rule__PropertyAssignment__IdAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_010291);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4929:1: rule__PropertyAssignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__PropertyAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4933:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4934:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4934:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4935:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_210324);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4944:1: rule__SimpleBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4948:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4949:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4949:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4950:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_210355);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4959:1: rule__SimultaneousBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimultaneousBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4963:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4964:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4964:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4965:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_210386);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4974:1: rule__Include__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4978:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4979:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4979:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4980:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_210417); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4989:1: rule__Version__VersionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Version__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4993:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4994:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4994:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4995:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_210448); if (failed) return ;
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


    // $ANTLR start rule__Markup__BodyAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5004:1: rule__Markup__BodyAssignment_2 : ( ruleMarkupBody ) ;
    public final void rule__Markup__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5008:1: ( ( ruleMarkupBody ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5009:1: ( ruleMarkupBody )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5009:1: ( ruleMarkupBody )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5010:1: ruleMarkupBody
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_rule__Markup__BodyAssignment_210479);
            ruleMarkupBody();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
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
    // $ANTLR end rule__Markup__BodyAssignment_2


    // $ANTLR start rule__MarkupLines__BodyAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5019:1: rule__MarkupLines__BodyAssignment_2 : ( ruleMarkupBody ) ;
    public final void rule__MarkupLines__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5023:1: ( ( ruleMarkupBody ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5024:1: ( ruleMarkupBody )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5024:1: ( ruleMarkupBody )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5025:1: ruleMarkupBody
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_rule__MarkupLines__BodyAssignment_210510);
            ruleMarkupBody();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
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
    // $ANTLR end rule__MarkupLines__BodyAssignment_2


    // $ANTLR start rule__MarkupBody__CommandAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5034:1: rule__MarkupBody__CommandAssignment_1 : ( ( rule__MarkupBody__CommandAlternatives_1_0 ) ) ;
    public final void rule__MarkupBody__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5038:1: ( ( ( rule__MarkupBody__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5039:1: ( ( rule__MarkupBody__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5039:1: ( ( rule__MarkupBody__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5040:1: ( rule__MarkupBody__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5041:1: ( rule__MarkupBody__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5041:2: rule__MarkupBody__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__MarkupBody__CommandAlternatives_1_0_in_rule__MarkupBody__CommandAssignment_110541);
            rule__MarkupBody__CommandAlternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBodyAccess().getCommandAlternatives_1_0()); 
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
    // $ANTLR end rule__MarkupBody__CommandAssignment_1


    // $ANTLR start rule__MarkupBody__BlockAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5050:1: rule__MarkupBody__BlockAssignment_2 : ( ruleUnparsedBlock ) ;
    public final void rule__MarkupBody__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5054:1: ( ( ruleUnparsedBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5055:1: ( ruleUnparsedBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5055:1: ( ruleUnparsedBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5056:1: ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_rule__MarkupBody__BlockAssignment_210574);
            ruleUnparsedBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
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
    // $ANTLR end rule__MarkupBody__BlockAssignment_2


    // $ANTLR start rule__Context__BlockAssignment_3
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5065:1: rule__Context__BlockAssignment_3 : ( ruleUnparsedBlock ) ;
    public final void rule__Context__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5069:1: ( ( ruleUnparsedBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5070:1: ( ruleUnparsedBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5070:1: ( ruleUnparsedBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5071:1: ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getBlockUnparsedBlockParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_rule__Context__BlockAssignment_310605);
            ruleUnparsedBlock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getContextAccess().getBlockUnparsedBlockParserRuleCall_3_0()); 
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
    // $ANTLR end rule__Context__BlockAssignment_3


    // $ANTLR start rule__Other__KeywordAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5080:1: rule__Other__KeywordAssignment_1 : ( ( rule__Other__KeywordAlternatives_1_0 ) ) ;
    public final void rule__Other__KeywordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5084:1: ( ( ( rule__Other__KeywordAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5085:1: ( ( rule__Other__KeywordAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5085:1: ( ( rule__Other__KeywordAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5086:1: ( rule__Other__KeywordAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getKeywordAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5087:1: ( rule__Other__KeywordAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5087:2: rule__Other__KeywordAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Other__KeywordAlternatives_1_0_in_rule__Other__KeywordAssignment_110636);
            rule__Other__KeywordAlternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOtherAccess().getKeywordAlternatives_1_0()); 
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
    // $ANTLR end rule__Other__KeywordAssignment_1


    // $ANTLR start rule__UnparsedBlock__ExpressionsAssignment_2
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5096:1: rule__UnparsedBlock__ExpressionsAssignment_2 : ( ruleUnparsedExpression ) ;
    public final void rule__UnparsedBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5100:1: ( ( ruleUnparsedExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5101:1: ( ruleUnparsedExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5101:1: ( ruleUnparsedExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5102:1: ruleUnparsedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_rule__UnparsedBlock__ExpressionsAssignment_210669);
            ruleUnparsedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end rule__UnparsedBlock__ExpressionsAssignment_2


    // $ANTLR start rule__UnparsedCommand__CommandAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5111:1: rule__UnparsedCommand__CommandAssignment_1 : ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) ) ;
    public final void rule__UnparsedCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5115:1: ( ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5116:1: ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5116:1: ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5117:1: ( rule__UnparsedCommand__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5118:1: ( rule__UnparsedCommand__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5118:2: rule__UnparsedCommand__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__CommandAlternatives_1_0_in_rule__UnparsedCommand__CommandAssignment_110700);
            rule__UnparsedCommand__CommandAlternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnparsedCommandAccess().getCommandAlternatives_1_0()); 
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
    // $ANTLR end rule__UnparsedCommand__CommandAssignment_1


    // $ANTLR start rule__Reference__AssignmentAssignment_1
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5127:1: rule__Reference__AssignmentAssignment_1 : ( ( ruleIdentifier ) ) ;
    public final void rule__Reference__AssignmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5131:1: ( ( ( ruleIdentifier ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5132:1: ( ( ruleIdentifier ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5132:1: ( ( ruleIdentifier ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5133:1: ( ruleIdentifier )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5134:1: ( ruleIdentifier )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5135:1: ruleIdentifier
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentIdentifierParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Reference__AssignmentAssignment_110737);
            ruleIdentifier();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getAssignmentAssignmentIdentifierParserRuleCall_1_0_1()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5146:1: rule__Text__ValueAssignment : ( ( rule__Text__ValueAlternatives_0 ) ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5150:1: ( ( ( rule__Text__ValueAlternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5151:1: ( ( rule__Text__ValueAlternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5151:1: ( ( rule__Text__ValueAlternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5152:1: ( rule__Text__ValueAlternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5153:1: ( rule__Text__ValueAlternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5153:2: rule__Text__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment10772);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5162:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5166:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5167:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5167:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5168:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment10805); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5177:1: rule__Scheme__ValueAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__Scheme__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5181:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5182:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5182:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5183:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_110836);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5192:1: rule__SchemeExpression__QuotedAssignment_0_0 : ( ( KEYWORD_4 ) ) ;
    public final void rule__SchemeExpression__QuotedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5196:1: ( ( ( KEYWORD_4 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5197:1: ( ( KEYWORD_4 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5197:1: ( ( KEYWORD_4 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5198:1: ( KEYWORD_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5199:1: ( KEYWORD_4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5200:1: KEYWORD_4
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_010872); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5215:1: rule__SchemeExpression__QuasiquotedAssignment_0_1 : ( ( KEYWORD_17 ) ) ;
    public final void rule__SchemeExpression__QuasiquotedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5219:1: ( ( ( KEYWORD_17 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5220:1: ( ( KEYWORD_17 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5220:1: ( ( KEYWORD_17 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5221:1: ( KEYWORD_17 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5222:1: ( KEYWORD_17 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5223:1: KEYWORD_17
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__SchemeExpression__QuasiquotedAssignment_0_110916); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5238:1: rule__SchemeExpression__UnquotedAssignment_0_2 : ( ( KEYWORD_8 ) ) ;
    public final void rule__SchemeExpression__UnquotedAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5242:1: ( ( ( KEYWORD_8 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5243:1: ( ( KEYWORD_8 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5243:1: ( ( KEYWORD_8 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5244:1: ( KEYWORD_8 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5245:1: ( KEYWORD_8 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5246:1: KEYWORD_8
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_210960); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5261:1: rule__SchemeExpression__VariableAssignment_0_3 : ( ( KEYWORD_3 ) ) ;
    public final void rule__SchemeExpression__VariableAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5265:1: ( ( ( KEYWORD_3 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5266:1: ( ( KEYWORD_3 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5266:1: ( ( KEYWORD_3 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5267:1: ( KEYWORD_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5268:1: ( KEYWORD_3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5269:1: KEYWORD_3
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_311004); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5284:1: rule__SchemeExpression__ValueAssignment_1 : ( ruleSchemeValue ) ;
    public final void rule__SchemeExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5288:1: ( ( ruleSchemeValue ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5289:1: ( ruleSchemeValue )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5289:1: ( ruleSchemeValue )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5290:1: ruleSchemeValue
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_111043);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5299:1: rule__SchemeBoolean__ValueAssignment : ( ruleBoolean ) ;
    public final void rule__SchemeBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5303:1: ( ( ruleBoolean ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5304:1: ( ruleBoolean )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5304:1: ( ruleBoolean )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5305:1: ruleBoolean
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueBooleanParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__SchemeBoolean__ValueAssignment11074);
            ruleBoolean();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBooleanAccess().getValueBooleanParserRuleCall_0()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5314:1: rule__SchemeList__VectorAssignment_1 : ( ( KEYWORD_2 ) ) ;
    public final void rule__SchemeList__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5318:1: ( ( ( KEYWORD_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5319:1: ( ( KEYWORD_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5319:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5320:1: ( KEYWORD_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5321:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5322:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_111110); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5337:1: rule__SchemeList__ExpressionsAssignment_3 : ( ruleSchemeExpression ) ;
    public final void rule__SchemeList__ExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5341:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5342:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5342:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5343:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_311149);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5352:1: rule__SchemeBlock__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__SchemeBlock__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5356:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5357:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5357:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5358:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_111180);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5367:1: rule__SchemeCharacter__ValueAssignment_1 : ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) ;
    public final void rule__SchemeCharacter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5371:1: ( ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5372:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5372:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5373:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5374:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5374:2: rule__SchemeCharacter__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_111211);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5383:1: rule__SchemeText__ValueAssignment : ( ruleSchemeId ) ;
    public final void rule__SchemeText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5387:1: ( ( ruleSchemeId ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5388:1: ( ruleSchemeId )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5388:1: ( ruleSchemeId )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5389:1: ruleSchemeId
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueSchemeIdParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeId_in_rule__SchemeText__ValueAssignment11244);
            ruleSchemeId();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeTextAccess().getValueSchemeIdParserRuleCall_0()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5398:1: rule__SchemeNumber__RadixAssignment_0 : ( ruleSchemeNumberRadix ) ;
    public final void rule__SchemeNumber__RadixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5402:1: ( ( ruleSchemeNumberRadix ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5403:1: ( ruleSchemeNumberRadix )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5403:1: ( ruleSchemeNumberRadix )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5404:1: ruleSchemeNumberRadix
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_011275);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5413:1: rule__SchemeNumber__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SchemeNumber__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5417:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5418:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5418:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5419:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_111306); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5428:1: rule__SchemeMarkupCommand__CommandAssignment_1 : ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) ) ;
    public final void rule__SchemeMarkupCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5432:1: ( ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5433:1: ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5433:1: ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5434:1: ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5435:1: ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5435:2: rule__SchemeMarkupCommand__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__CommandAlternatives_1_0_in_rule__SchemeMarkupCommand__CommandAssignment_111337);
            rule__SchemeMarkupCommand__CommandAlternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeMarkupCommandAccess().getCommandAlternatives_1_0()); 
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1374:1: ( ( ruleAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1374:1: ( ruleAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1374:1: ( ruleAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:1: ruleAssignment
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred22803);
        ruleAssignment();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1396:1: ( ( rulePropertyAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1396:1: ( rulePropertyAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1396:1: ( rulePropertyAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1397:1: rulePropertyAssignment
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred32852);
        rulePropertyAssignment();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2350:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2350:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2350:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2351:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2352:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        int alt40=2;
        int LA40_0 = input.LA(1);

        if ( (LA40_0==KEYWORD_4) ) {
            alt40=1;
        }
        switch (alt40) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2352:2: rule__SchemeExpression__QuotedAssignment_0_0
                {
                pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred985155);
                rule__SchemeExpression__QuotedAssignment_0_0();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2356:6: ( ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2356:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2356:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2357:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2358:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        int alt41=2;
        int LA41_0 = input.LA(1);

        if ( (LA41_0==KEYWORD_17) ) {
            alt41=1;
        }
        switch (alt41) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2358:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
                {
                pushFollow(FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred1005174);
                rule__SchemeExpression__QuasiquotedAssignment_0_1();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred102
    public final void synpred102_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2362:6: ( ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2362:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2362:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2363:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2364:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        int alt42=2;
        int LA42_0 = input.LA(1);

        if ( (LA42_0==KEYWORD_8) ) {
            alt42=1;
        }
        switch (alt42) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2364:2: rule__SchemeExpression__UnquotedAssignment_0_2
                {
                pushFollow(FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred1025193);
                rule__SchemeExpression__UnquotedAssignment_0_2();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred102

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ( ( ruleSchemeBoolean ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ( ruleSchemeBoolean )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ( ruleSchemeBoolean )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2385:1: ruleSchemeBoolean
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred1045246);
        ruleSchemeBoolean();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred109
    public final void synpred109_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2414:6: ( ( ruleSchemeNumber ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2414:6: ( ruleSchemeNumber )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2414:6: ( ruleSchemeNumber )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:1: ruleSchemeNumber
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred1095331);
        ruleSchemeNumber();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred109

    // $ANTLR start synpred122
    public final void synpred122_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3427:2: ( rule__MarkupBody__CommandAssignment_1 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3427:2: rule__MarkupBody__CommandAssignment_1
        {
        pushFollow(FOLLOW_rule__MarkupBody__CommandAssignment_1_in_synpred1227364);
        rule__MarkupBody__CommandAssignment_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred122

    // $ANTLR start synpred123
    public final void synpred123_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3455:2: ( rule__MarkupBody__BlockAssignment_2 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3455:2: rule__MarkupBody__BlockAssignment_2
        {
        pushFollow(FOLLOW_rule__MarkupBody__BlockAssignment_2_in_synpred1237422);
        rule__MarkupBody__BlockAssignment_2();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred123

    // $ANTLR start synpred124
    public final void synpred124_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3582:2: ( rule__Context__BlockAssignment_3 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3582:2: rule__Context__BlockAssignment_3
        {
        pushFollow(FOLLOW_rule__Context__BlockAssignment_3_in_synpred1247671);
        rule__Context__BlockAssignment_3();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred124

    // $ANTLR start synpred126
    public final void synpred126_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4000:2: ( rule__SchemeExpression__Alternatives_0 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4000:2: rule__SchemeExpression__Alternatives_0
        {
        pushFollow(FOLLOW_rule__SchemeExpression__Alternatives_0_in_synpred1268483);
        rule__SchemeExpression__Alternatives_0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred126

    // $ANTLR start synpred130
    public final void synpred130_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4415:2: ( rule__SchemeId__Group_1__0 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4415:2: rule__SchemeId__Group_1__0
        {
        pushFollow(FOLLOW_rule__SchemeId__Group_1__0_in_synpred1309302);
        rule__SchemeId__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred130

    // $ANTLR start synpred132
    public final void synpred132_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4726:2: ( rule__Identifier__Group_1__0 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4726:2: rule__Identifier__Group_1__0
        {
        pushFollow(FOLLOW_rule__Identifier__Group_1__0_in_synpred1329912);
        rule__Identifier__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred132

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
    public final boolean synpred122() {
        backtracking++;
        int start = input.mark();
        try {
            synpred122_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred123() {
        backtracking++;
        int start = input.mark();
        try {
            synpred123_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred124() {
        backtracking++;
        int start = input.mark();
        try {
            synpred124_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred100() {
        backtracking++;
        int start = input.mark();
        try {
            synpred100_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred102() {
        backtracking++;
        int start = input.mark();
        try {
            synpred102_fragment(); // can never throw exception
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
    public final boolean synpred104() {
        backtracking++;
        int start = input.mark();
        try {
            synpred104_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred132() {
        backtracking++;
        int start = input.mark();
        try {
            synpred132_fragment(); // can never throw exception
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
    public final boolean synpred98() {
        backtracking++;
        int start = input.mark();
        try {
            synpred98_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred130() {
        backtracking++;
        int start = input.mark();
        try {
            synpred130_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred109() {
        backtracking++;
        int start = input.mark();
        try {
            synpred109_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond97 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000107AFFFBA1L});
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
    public static final BitSet FOLLOW_ruleMarkupBody_in_entryRuleMarkupBody1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupBody1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__0_in_ruleMarkupBody1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0_in_ruleContext1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_entryRuleOther1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOther1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__Group__0_in_ruleOther1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_entryRuleOtherName1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherName1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherName__Alternatives_in_ruleOtherName1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_entryRuleSpecialCommandName1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCommandName1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialCommandName__Alternatives_in_ruleSpecialCommandName1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_entryRuleSpecialCharacter1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialCharacter1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialCharacter__Alternatives_in_ruleSpecialCharacter1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_entryRuleUnparsedBlock1405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedBlock1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__0_in_ruleUnparsedBlock1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_entryRuleUnparsedExpression1469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedExpression1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedExpression__Alternatives_in_ruleUnparsedExpression1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_entryRuleUnparsedCommand1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnparsedCommand1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__0_in_ruleUnparsedCommand1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAssignment_in_ruleText1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0_in_ruleScheme1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_entryRuleSchemeExpression1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeExpression1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0_in_ruleSchemeExpression1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_entryRuleSchemeValue1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeValue1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeValue__Alternatives_in_ruleSchemeValue1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_entryRuleSchemeBoolean1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBoolean1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBoolean__ValueAssignment_in_ruleSchemeBoolean2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_entryRuleSchemeList2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeList2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0_in_ruleSchemeList2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_entryRuleSchemeBlock2118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeBlock2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0_in_ruleSchemeBlock2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_entryRuleSchemeCharacter2182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeCharacter2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__0_in_ruleSchemeCharacter2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_entryRuleSchemeText2246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeText2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeText__ValueAssignment_in_ruleSchemeText2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeId_in_entryRuleSchemeId2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeId2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__0_in_ruleSchemeId2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_entryRuleSchemeTextLiteral2383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeTextLiteral2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeTextLiteral__Alternatives_in_ruleSchemeTextLiteral2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_entryRuleSchemeNumber2452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumber2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0_in_ruleSchemeNumber2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_entryRuleSchemeNumberRadix2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeNumberRadix2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__0_in_ruleSchemeNumberRadix2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_entryRuleSchemeMarkupCommand2589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemeMarkupCommand2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__0_in_ruleSchemeMarkupCommand2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier2662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0_in_ruleIdentifier2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__0_in_ruleBoolean2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__ToplevelExpression__Alternatives2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_rule__ToplevelExpression__Alternatives2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_rule__Expression__Alternatives2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_rule__Expression__Alternatives2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__CommonExpression__Alternatives2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CommonExpression__Alternatives2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__CommonExpression__Alternatives2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CommonExpression__Alternatives2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__CommonExpression__Alternatives2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Assignment__NameAlternatives_0_03001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assignment__NameAlternatives_0_03018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__PropertyAssignment__IdAlternatives_0_03050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyAssignment__IdAlternatives_0_03067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Command__Alternatives3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_rule__SpecialCommand__Alternatives3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_rule__SpecialCommand__Alternatives3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__SpecialCommand__Alternatives3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_rule__SpecialCommand__Alternatives3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__MarkupBody__CommandAlternatives_1_03314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_rule__MarkupBody__CommandAlternatives_1_03331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__Other__KeywordAlternatives_1_03363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Other__KeywordAlternatives_1_03381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Other__KeywordAlternatives_1_03401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_rule__Other__KeywordAlternatives_1_03420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_rule__OtherName__Alternatives3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_rule__OtherName__Alternatives3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rule__OtherName__Alternatives3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_rule__OtherName__Alternatives3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__OtherName__Alternatives3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_rule__OtherName__Alternatives3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rule__OtherName__Alternatives3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_rule__OtherName__Alternatives3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_rule__OtherName__Alternatives3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_rule__OtherName__Alternatives3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_rule__OtherName__Alternatives3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_rule__OtherName__Alternatives3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rule__OtherName__Alternatives3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_rule__OtherName__Alternatives3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_rule__OtherName__Alternatives3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__OtherName__Alternatives3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_rule__OtherName__Alternatives3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rule__OtherName__Alternatives3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_rule__OtherName__Alternatives3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rule__OtherName__Alternatives3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__OtherName__Alternatives3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rule__OtherName__Alternatives3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_rule__OtherName__Alternatives3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rule__OtherName__Alternatives3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_rule__OtherName__Alternatives3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_rule__OtherName__Alternatives3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rule__OtherName__Alternatives3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__OtherName__Alternatives3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rule__OtherName__Alternatives4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__OtherName__Alternatives4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_rule__OtherName__Alternatives4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_rule__OtherName__Alternatives4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_rule__OtherName__Alternatives4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__OtherName__Alternatives4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_rule__OtherName__Alternatives4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rule__OtherName__Alternatives4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rule__OtherName__Alternatives4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_rule__OtherName__Alternatives4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_rule__OtherName__Alternatives4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_rule__OtherName__Alternatives4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rule__OtherName__Alternatives4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_rule__OtherName__Alternatives4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rule__OtherName__Alternatives4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_rule__OtherName__Alternatives4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__OtherName__Alternatives4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_rule__OtherName__Alternatives4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_rule__OtherName__Alternatives4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_rule__OtherName__Alternatives4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_rule__OtherName__Alternatives4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rule__OtherName__Alternatives4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rule__OtherName__Alternatives4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rule__OtherName__Alternatives4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_rule__OtherName__Alternatives4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rule__OtherName__Alternatives4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rule__OtherName__Alternatives4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rule__OtherName__Alternatives4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_rule__SpecialCommandName__Alternatives4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_rule__SpecialCommandName__Alternatives4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rule__SpecialCommandName__Alternatives4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_rule__SpecialCommandName__Alternatives4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_rule__SpecialCommandName__Alternatives4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_rule__SpecialCommandName__Alternatives4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__SpecialCharacter__Alternatives4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__SpecialCharacter__Alternatives4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__SpecialCharacter__Alternatives4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__SpecialCharacter__Alternatives4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__SpecialCharacter__Alternatives4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__SpecialCharacter__Alternatives4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__SpecialCharacter__Alternatives4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_rule__UnparsedExpression__Alternatives4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_rule__UnparsedExpression__Alternatives4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__UnparsedExpression__Alternatives4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__UnparsedExpression__Alternatives4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__UnparsedExpression__Alternatives4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__UnparsedCommand__CommandAlternatives_1_04974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_rule__UnparsedCommand__CommandAlternatives_1_04991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_rule__Text__ValueAlternatives_05023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Text__ValueAlternatives_05041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Text__ValueAlternatives_05061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__Text__ValueAlternatives_05081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__Text__ValueAlternatives_05101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__Text__ValueAlternatives_05121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_rule__SchemeExpression__Alternatives_05155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_rule__SchemeExpression__Alternatives_05174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_rule__SchemeExpression__Alternatives_05193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__VariableAssignment_0_3_in_rule__SchemeExpression__Alternatives_05212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_rule__SchemeValue__Alternatives5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_rule__SchemeValue__Alternatives5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__SchemeCharacter__ValueAlternatives_1_05380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeCharacter__ValueAlternatives_1_05397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeCharacter__ValueAlternatives_1_05414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__SchemeTextLiteral__Alternatives5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__SchemeTextLiteral__Alternatives5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__SchemeTextLiteral__Alternatives5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiteral__Alternatives5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_rule__SchemeTextLiteral__Alternatives5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__SchemeTextLiteral__Alternatives5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SchemeTextLiteral__Alternatives5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiteral__Alternatives5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15713 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__15716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__Assignment__Group__1__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__25775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__05838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__05841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__15898 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__15901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__PropertyAssignment__Group__1__Impl5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__25960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__06023 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__06026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__16084 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107EFFFBA1L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__16087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__SimpleBlock__Group__1__Impl6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__26146 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__26149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl6176 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__36207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__SimpleBlock__Group__3__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__06274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__06277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__16335 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBE1L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__16338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__SimultaneousBlock__Group__1__Impl6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__26397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__26400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl6427 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__36458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__SimultaneousBlock__Group__3__Impl6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06525 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Include__Group__0__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16587 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_rule__Include__Group__1__Impl6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__06712 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Version__Group__0__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__16774 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__16777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_rule__Version__Group__1__Impl6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__26836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_2_in_rule__Version__Group__2__Impl6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__06899 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__06902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Markup__Group__0__Impl6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__16961 = new BitSet(new long[]{0x0000000000000002L,0x0000000002400200L});
    public static final BitSet FOLLOW_rule__Markup__Group__2_in_rule__Markup__Group__16964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rule__Markup__Group__1__Impl6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__2__Impl_in_rule__Markup__Group__27023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__BodyAssignment_2_in_rule__Markup__Group__2__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__0__Impl_in_rule__MarkupLines__Group__07086 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__1_in_rule__MarkupLines__Group__07089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__MarkupLines__Group__0__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__1__Impl_in_rule__MarkupLines__Group__17148 = new BitSet(new long[]{0x0000000000000002L,0x0000000002400200L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__2_in_rule__MarkupLines__Group__17151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_rule__MarkupLines__Group__1__Impl7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__2__Impl_in_rule__MarkupLines__Group__27210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__BodyAssignment_2_in_rule__MarkupLines__Group__2__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__0__Impl_in_rule__MarkupBody__Group__07273 = new BitSet(new long[]{0x0000000000000002L,0x0000000002400200L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__1_in_rule__MarkupBody__Group__07276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__1__Impl_in_rule__MarkupBody__Group__17334 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__2_in_rule__MarkupBody__Group__17337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAssignment_1_in_rule__MarkupBody__Group__1__Impl7364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400200L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__2__Impl_in_rule__MarkupBody__Group__27395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__BlockAssignment_2_in_rule__MarkupBody__Group__2__Impl7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__07459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__07462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__17520 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__17523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Context__Group__1__Impl7551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__27582 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__27585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_rule__Context__Group__2__Impl7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__37644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__BlockAssignment_3_in_rule__Context__Group__3__Impl7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__Group__0__Impl_in_rule__Other__Group__07710 = new BitSet(new long[]{0xFFFFFEFD6FFFF7F0L,0x0000000008B47101L});
    public static final BitSet FOLLOW_rule__Other__Group__1_in_rule__Other__Group__07713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Other__Group__0__Impl7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__Group__1__Impl_in_rule__Other__Group__17772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__KeywordAssignment_1_in_rule__Other__Group__1__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__0__Impl_in_rule__UnparsedBlock__Group__07833 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__1_in_rule__UnparsedBlock__Group__07836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__1__Impl_in_rule__UnparsedBlock__Group__17894 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107EFFFB81L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__2_in_rule__UnparsedBlock__Group__17897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__UnparsedBlock__Group__1__Impl7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__2__Impl_in_rule__UnparsedBlock__Group__27956 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__3_in_rule__UnparsedBlock__Group__27959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__ExpressionsAssignment_2_in_rule__UnparsedBlock__Group__2__Impl7986 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000107AFFFB81L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__3__Impl_in_rule__UnparsedBlock__Group__38017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__UnparsedBlock__Group__3__Impl8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__0__Impl_in_rule__UnparsedCommand__Group__08084 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000040000001L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__1_in_rule__UnparsedCommand__Group__08087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__UnparsedCommand__Group__0__Impl8115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__1__Impl_in_rule__UnparsedCommand__Group__18146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__CommandAssignment_1_in_rule__UnparsedCommand__Group__1__Impl8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08207 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Reference__Group__0__Impl8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl8296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__08330 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001079BDDF8FL});
    public static final BitSet FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__08333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__18392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl8419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__08453 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001078BD538FL});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__08456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl8483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__18514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__08575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__08578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__18636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__18639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__28697 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001079BDFF8FL});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__28700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__38759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__38762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl8789 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x0000001079BDDF8FL});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__48820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__08889 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__08892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__SchemeBlock__Group__0__Impl8920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__18951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__18954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl8983 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl8995 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000107AFFFBA1L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__29028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__SchemeBlock__Group__2__Impl9056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__09093 = new BitSet(new long[]{0x0000000000000000L,0x0000001048B44100L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__09096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__SchemeCharacter__Group__0__Impl9124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__19155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__0__Impl_in_rule__SchemeId__Group__09216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__1_in_rule__SchemeId__Group__09219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group__0__Impl9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__1__Impl_in_rule__SchemeId__Group__19275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0_in_rule__SchemeId__Group__1__Impl9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0__Impl_in_rule__SchemeId__Group_1__09337 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001058BD4181L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__1_in_rule__SchemeId__Group_1__09340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__SchemeId__Group_1__0__Impl9368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__1__Impl_in_rule__SchemeId__Group_1__19399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group_1__1__Impl9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__09459 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__09462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__19520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl9547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__09581 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__09584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl9612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__19643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__SchemeNumberRadix__Group__1__Impl9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__09703 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000040000001L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__09706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__SchemeMarkupCommand__Group__0__Impl9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__19765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__09826 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__09829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Identifier__Group__0__Impl9856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__19885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl9912 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__09947 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__09950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__Identifier__Group_1__0__Impl9978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__110009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Identifier__Group_1__1__Impl10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__0__Impl_in_rule__Boolean__Group__010069 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Boolean__Group__1_in_rule__Boolean__Group__010072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Boolean__Group__0__Impl10100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__1__Impl_in_rule__Boolean__Group__110131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Boolean__Group__1__Impl10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_010227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_210260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_010291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_210324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_210355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_210386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_210417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_210448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_rule__Markup__BodyAssignment_210479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_rule__MarkupLines__BodyAssignment_210510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAlternatives_1_0_in_rule__MarkupBody__CommandAssignment_110541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_rule__MarkupBody__BlockAssignment_210574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_rule__Context__BlockAssignment_310605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__KeywordAlternatives_1_0_in_rule__Other__KeywordAssignment_110636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_rule__UnparsedBlock__ExpressionsAssignment_210669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__CommandAlternatives_1_0_in_rule__UnparsedCommand__CommandAssignment_110700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Reference__AssignmentAssignment_110737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment10772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment10805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_110836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_010872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__SchemeExpression__QuasiquotedAssignment_0_110916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_210960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_311004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_111043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__SchemeBoolean__ValueAssignment11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_111110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_311149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_111180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_111211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeId_in_rule__SchemeText__ValueAssignment11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_011275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_111306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__CommandAlternatives_1_0_in_rule__SchemeMarkupCommand__CommandAssignment_111337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred22803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred32852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred985155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred1005174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred1025193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred1045246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred1095331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAssignment_1_in_synpred1227364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__BlockAssignment_2_in_synpred1237422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__BlockAssignment_3_in_synpred1247671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Alternatives_0_in_synpred1268483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0_in_synpred1309302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__0_in_synpred1329912 = new BitSet(new long[]{0x0000000000000002L});

}