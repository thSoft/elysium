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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_89", "KEYWORD_87", "KEYWORD_88", "KEYWORD_85", "KEYWORD_86", "KEYWORD_82", "KEYWORD_83", "KEYWORD_84", "KEYWORD_80", "KEYWORD_81", "KEYWORD_75", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_79", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "RULE_STRING", "RULE_INT", "RULE_ALPHA", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_SCHEME_SL_COMMENT=99;
    public static final int RULE_ANY_OTHER=101;
    public static final int KEYWORD_56=41;
    public static final int KEYWORD_55=40;
    public static final int KEYWORD_54=39;
    public static final int KEYWORD_53=38;
    public static final int KEYWORD_52=37;
    public static final int KEYWORD_51=36;
    public static final int KEYWORD_50=35;
    public static final int EOF=-1;
    public static final int KEYWORD_59=44;
    public static final int KEYWORD_58=43;
    public static final int KEYWORD_57=42;
    public static final int KEYWORD_65=32;
    public static final int RULE_SCHEME_ML_COMMENT=100;
    public static final int KEYWORD_64=31;
    public static final int KEYWORD_67=19;
    public static final int KEYWORD_66=33;
    public static final int KEYWORD_61=28;
    public static final int KEYWORD_60=27;
    public static final int KEYWORD_63=30;
    public static final int KEYWORD_62=29;
    public static final int KEYWORD_69=21;
    public static final int KEYWORD_68=20;
    public static final int KEYWORD_30=63;
    public static final int KEYWORD_34=54;
    public static final int KEYWORD_33=53;
    public static final int KEYWORD_32=52;
    public static final int KEYWORD_31=64;
    public static final int KEYWORD_38=58;
    public static final int KEYWORD_37=57;
    public static final int KEYWORD_36=56;
    public static final int KEYWORD_35=55;
    public static final int RULE_ML_COMMENT=98;
    public static final int KEYWORD_39=59;
    public static final int RULE_STRING=93;
    public static final int KEYWORD_41=61;
    public static final int KEYWORD_40=60;
    public static final int KEYWORD_43=46;
    public static final int KEYWORD_42=45;
    public static final int KEYWORD_45=48;
    public static final int KEYWORD_44=47;
    public static final int KEYWORD_47=50;
    public static final int KEYWORD_46=49;
    public static final int KEYWORD_49=34;
    public static final int KEYWORD_48=51;
    public static final int KEYWORD_19=91;
    public static final int KEYWORD_17=89;
    public static final int KEYWORD_18=90;
    public static final int KEYWORD_15=87;
    public static final int KEYWORD_16=88;
    public static final int KEYWORD_13=85;
    public static final int KEYWORD_14=86;
    public static final int KEYWORD_11=83;
    public static final int KEYWORD_12=84;
    public static final int KEYWORD_10=82;
    public static final int KEYWORD_6=78;
    public static final int KEYWORD_7=79;
    public static final int KEYWORD_8=80;
    public static final int KEYWORD_9=81;
    public static final int KEYWORD_28=72;
    public static final int KEYWORD_29=62;
    public static final int RULE_INT=94;
    public static final int KEYWORD_24=68;
    public static final int KEYWORD_25=69;
    public static final int KEYWORD_26=70;
    public static final int KEYWORD_27=71;
    public static final int KEYWORD_20=92;
    public static final int KEYWORD_21=65;
    public static final int KEYWORD_22=66;
    public static final int KEYWORD_23=67;
    public static final int KEYWORD_79=18;
    public static final int KEYWORD_71=23;
    public static final int KEYWORD_72=24;
    public static final int KEYWORD_73=25;
    public static final int KEYWORD_74=26;
    public static final int KEYWORD_75=14;
    public static final int KEYWORD_76=15;
    public static final int KEYWORD_77=16;
    public static final int KEYWORD_78=17;
    public static final int KEYWORD_1=73;
    public static final int KEYWORD_5=77;
    public static final int KEYWORD_4=76;
    public static final int RULE_ALPHA=95;
    public static final int KEYWORD_70=22;
    public static final int KEYWORD_3=75;
    public static final int KEYWORD_2=74;
    public static final int Tokens=102;
    public static final int RULE_SL_COMMENT=97;
    public static final int KEYWORD_84=11;
    public static final int KEYWORD_85=7;
    public static final int KEYWORD_82=9;
    public static final int KEYWORD_83=10;
    public static final int KEYWORD_88=6;
    public static final int KEYWORD_89=4;
    public static final int KEYWORD_86=8;
    public static final int KEYWORD_87=5;
    public static final int KEYWORD_81=13;
    public static final int KEYWORD_80=12;
    public static final int RULE_WS=96;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[421+1];
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
    		tokenNameToValue.put("KEYWORD_25", "'::'");
    		tokenNameToValue.put("KEYWORD_26", "'<<'");
    		tokenNameToValue.put("KEYWORD_27", "'>>'");
    		tokenNameToValue.put("KEYWORD_28", "'\\\\'");
    		tokenNameToValue.put("KEYWORD_29", "'key'");
    		tokenNameToValue.put("KEYWORD_30", "'new'");
    		tokenNameToValue.put("KEYWORD_31", "'set'");
    		tokenNameToValue.put("KEYWORD_32", "'book'");
    		tokenNameToValue.put("KEYWORD_33", "'mark'");
    		tokenNameToValue.put("KEYWORD_34", "'midi'");
    		tokenNameToValue.put("KEYWORD_35", "'name'");
    		tokenNameToValue.put("KEYWORD_36", "'once'");
    		tokenNameToValue.put("KEYWORD_37", "'rest'");
    		tokenNameToValue.put("KEYWORD_38", "'skip'");
    		tokenNameToValue.put("KEYWORD_39", "'time'");
    		tokenNameToValue.put("KEYWORD_40", "'type'");
    		tokenNameToValue.put("KEYWORD_41", "'with'");
    		tokenNameToValue.put("KEYWORD_42", "'alias'");
    		tokenNameToValue.put("KEYWORD_43", "'drums'");
    		tokenNameToValue.put("KEYWORD_44", "'paper'");
    		tokenNameToValue.put("KEYWORD_45", "'score'");
    		tokenNameToValue.put("KEYWORD_46", "'tempo'");
    		tokenNameToValue.put("KEYWORD_47", "'times'");
    		tokenNameToValue.put("KEYWORD_48", "'unset'");
    		tokenNameToValue.put("KEYWORD_49", "'change'");
    		tokenNameToValue.put("KEYWORD_50", "'chords'");
    		tokenNameToValue.put("KEYWORD_51", "'denies'");
    		tokenNameToValue.put("KEYWORD_52", "'header'");
    		tokenNameToValue.put("KEYWORD_53", "'layout'");
    		tokenNameToValue.put("KEYWORD_54", "'lyrics'");
    		tokenNameToValue.put("KEYWORD_55", "'markup'");
    		tokenNameToValue.put("KEYWORD_56", "'octave'");
    		tokenNameToValue.put("KEYWORD_57", "'remove'");
    		tokenNameToValue.put("KEYWORD_58", "'repeat'");
    		tokenNameToValue.put("KEYWORD_59", "'revert'");
    		tokenNameToValue.put("KEYWORD_60", "'accepts'");
    		tokenNameToValue.put("KEYWORD_61", "'context'");
    		tokenNameToValue.put("KEYWORD_62", "'default'");
    		tokenNameToValue.put("KEYWORD_63", "'figures'");
    		tokenNameToValue.put("KEYWORD_64", "'include'");
    		tokenNameToValue.put("KEYWORD_65", "'partial'");
    		tokenNameToValue.put("KEYWORD_66", "'version'");
    		tokenNameToValue.put("KEYWORD_67", "'bookpart'");
    		tokenNameToValue.put("KEYWORD_68", "'consists'");
    		tokenNameToValue.put("KEYWORD_69", "'drummode'");
    		tokenNameToValue.put("KEYWORD_70", "'lyricsto'");
    		tokenNameToValue.put("KEYWORD_71", "'notemode'");
    		tokenNameToValue.put("KEYWORD_72", "'objectid'");
    		tokenNameToValue.put("KEYWORD_73", "'override'");
    		tokenNameToValue.put("KEYWORD_74", "'relative'");
    		tokenNameToValue.put("KEYWORD_75", "'addlyrics'");
    		tokenNameToValue.put("KEYWORD_76", "'chordmode'");
    		tokenNameToValue.put("KEYWORD_77", "'lyricmode'");
    		tokenNameToValue.put("KEYWORD_78", "'maininput'");
    		tokenNameToValue.put("KEYWORD_79", "'transpose'");
    		tokenNameToValue.put("KEYWORD_80", "'figuremode'");
    		tokenNameToValue.put("KEYWORD_81", "'sequential'");
    		tokenNameToValue.put("KEYWORD_82", "'alternative'");
    		tokenNameToValue.put("KEYWORD_83", "'description'");
    		tokenNameToValue.put("KEYWORD_84", "'markuplines'");
    		tokenNameToValue.put("KEYWORD_85", "'defaultchild'");
    		tokenNameToValue.put("KEYWORD_86", "'simultaneous'");
    		tokenNameToValue.put("KEYWORD_87", "'sourcefileline'");
    		tokenNameToValue.put("KEYWORD_88", "'sourcefilename'");
    		tokenNameToValue.put("KEYWORD_89", "'grobdescriptions'");
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:154:1: entryRuleLilyPond : ruleLilyPond EOF ;
    public final void entryRuleLilyPond() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:155:1: ( ruleLilyPond EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:156:1: ruleLilyPond EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:163:1: ruleLilyPond : ( ( rule__LilyPond__ExpressionsAssignment )* ) ;
    public final void ruleLilyPond() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:167:5: ( ( ( rule__LilyPond__ExpressionsAssignment )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:168:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:168:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:169:1: ( rule__LilyPond__ExpressionsAssignment )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:170:1: ( rule__LilyPond__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_89 && LA1_0<=KEYWORD_31)||LA1_0==KEYWORD_26||(LA1_0>=KEYWORD_28 && LA1_0<=KEYWORD_2)||(LA1_0>=KEYWORD_4 && LA1_0<=KEYWORD_16)||LA1_0==KEYWORD_18||(LA1_0>=KEYWORD_20 && LA1_0<=RULE_ALPHA)||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:170:2: rule__LilyPond__ExpressionsAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:182:1: entryRuleToplevelExpression : ruleToplevelExpression EOF ;
    public final void entryRuleToplevelExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:183:1: ( ruleToplevelExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:184:1: ruleToplevelExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:191:1: ruleToplevelExpression : ( ( rule__ToplevelExpression__Alternatives ) ) ;
    public final void ruleToplevelExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:195:5: ( ( ( rule__ToplevelExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:196:1: ( ( rule__ToplevelExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:196:1: ( ( rule__ToplevelExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:197:1: ( rule__ToplevelExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getToplevelExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:198:1: ( rule__ToplevelExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:198:2: rule__ToplevelExpression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:210:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:211:1: ( ruleExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:212:1: ruleExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:219:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:223:5: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:224:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:224:1: ( ( rule__Expression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:225:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:226:1: ( rule__Expression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:226:2: rule__Expression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:238:1: entryRuleCommonExpression : ruleCommonExpression EOF ;
    public final void entryRuleCommonExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:239:1: ( ruleCommonExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:240:1: ruleCommonExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:247:1: ruleCommonExpression : ( ( rule__CommonExpression__Alternatives ) ) ;
    public final void ruleCommonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:251:5: ( ( ( rule__CommonExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:252:1: ( ( rule__CommonExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:252:1: ( ( rule__CommonExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:253:1: ( rule__CommonExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommonExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:254:1: ( rule__CommonExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:254:2: rule__CommonExpression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:266:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:267:1: ( ruleAssignment EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:268:1: ruleAssignment EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:275:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:279:5: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:280:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:280:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:281:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:282:1: ( rule__Assignment__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:282:2: rule__Assignment__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:294:1: entryRulePropertyAssignment : rulePropertyAssignment EOF ;
    public final void entryRulePropertyAssignment() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:295:1: ( rulePropertyAssignment EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:296:1: rulePropertyAssignment EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:303:1: rulePropertyAssignment : ( ( rule__PropertyAssignment__Group__0 ) ) ;
    public final void rulePropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:307:5: ( ( ( rule__PropertyAssignment__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:308:1: ( ( rule__PropertyAssignment__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:308:1: ( ( rule__PropertyAssignment__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:309:1: ( rule__PropertyAssignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:310:1: ( rule__PropertyAssignment__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:310:2: rule__PropertyAssignment__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:322:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:323:1: ( ruleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:324:1: ruleBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:331:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:335:5: ( ( ( rule__Block__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:336:1: ( ( rule__Block__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:336:1: ( ( rule__Block__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:337:1: ( rule__Block__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:338:1: ( rule__Block__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:338:2: rule__Block__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:350:1: entryRuleSimpleBlock : ruleSimpleBlock EOF ;
    public final void entryRuleSimpleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:351:1: ( ruleSimpleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:352:1: ruleSimpleBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:359:1: ruleSimpleBlock : ( ( rule__SimpleBlock__Group__0 ) ) ;
    public final void ruleSimpleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:363:5: ( ( ( rule__SimpleBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:364:1: ( ( rule__SimpleBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:364:1: ( ( rule__SimpleBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:365:1: ( rule__SimpleBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:366:1: ( rule__SimpleBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:366:2: rule__SimpleBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:378:1: entryRuleSimultaneousBlock : ruleSimultaneousBlock EOF ;
    public final void entryRuleSimultaneousBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:379:1: ( ruleSimultaneousBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:380:1: ruleSimultaneousBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:387:1: ruleSimultaneousBlock : ( ( rule__SimultaneousBlock__Group__0 ) ) ;
    public final void ruleSimultaneousBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:391:5: ( ( ( rule__SimultaneousBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:392:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:392:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:393:1: ( rule__SimultaneousBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:394:1: ( rule__SimultaneousBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:394:2: rule__SimultaneousBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:406:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:407:1: ( ruleCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:408:1: ruleCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:415:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:419:5: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:420:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:420:1: ( ( rule__Command__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:421:1: ( rule__Command__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:422:1: ( rule__Command__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:422:2: rule__Command__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:434:1: entryRuleSpecialCommand : ruleSpecialCommand EOF ;
    public final void entryRuleSpecialCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:435:1: ( ruleSpecialCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:436:1: ruleSpecialCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:443:1: ruleSpecialCommand : ( ( rule__SpecialCommand__Alternatives ) ) ;
    public final void ruleSpecialCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:447:5: ( ( ( rule__SpecialCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:448:1: ( ( rule__SpecialCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:448:1: ( ( rule__SpecialCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:449:1: ( rule__SpecialCommand__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:450:1: ( rule__SpecialCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:450:2: rule__SpecialCommand__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:462:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:463:1: ( ruleInclude EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:464:1: ruleInclude EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:471:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:475:5: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:476:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:476:1: ( ( rule__Include__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:477:1: ( rule__Include__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:478:1: ( rule__Include__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:478:2: rule__Include__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:490:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:491:1: ( ruleVersion EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:492:1: ruleVersion EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:499:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:503:5: ( ( ( rule__Version__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:1: ( ( rule__Version__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:1: ( ( rule__Version__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:505:1: ( rule__Version__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:506:1: ( rule__Version__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:506:2: rule__Version__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:518:1: entryRuleMarkup : ruleMarkup EOF ;
    public final void entryRuleMarkup() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:519:1: ( ruleMarkup EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:520:1: ruleMarkup EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:527:1: ruleMarkup : ( ( rule__Markup__Group__0 ) ) ;
    public final void ruleMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:531:5: ( ( ( rule__Markup__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:532:1: ( ( rule__Markup__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:532:1: ( ( rule__Markup__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:533:1: ( rule__Markup__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:534:1: ( rule__Markup__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:534:2: rule__Markup__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:546:1: entryRuleMarkupLines : ruleMarkupLines EOF ;
    public final void entryRuleMarkupLines() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:547:1: ( ruleMarkupLines EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:548:1: ruleMarkupLines EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:555:1: ruleMarkupLines : ( ( rule__MarkupLines__Group__0 ) ) ;
    public final void ruleMarkupLines() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:559:5: ( ( ( rule__MarkupLines__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:560:1: ( ( rule__MarkupLines__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:560:1: ( ( rule__MarkupLines__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:561:1: ( rule__MarkupLines__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:562:1: ( rule__MarkupLines__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:562:2: rule__MarkupLines__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:574:1: entryRuleMarkupBody : ruleMarkupBody EOF ;
    public final void entryRuleMarkupBody() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:575:1: ( ruleMarkupBody EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:576:1: ruleMarkupBody EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:583:1: ruleMarkupBody : ( ( rule__MarkupBody__Group__0 ) ) ;
    public final void ruleMarkupBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:587:5: ( ( ( rule__MarkupBody__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:588:1: ( ( rule__MarkupBody__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:588:1: ( ( rule__MarkupBody__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:589:1: ( rule__MarkupBody__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:590:1: ( rule__MarkupBody__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:590:2: rule__MarkupBody__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:602:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:603:1: ( ruleContext EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:604:1: ruleContext EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:611:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:615:5: ( ( ( rule__Context__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:616:1: ( ( rule__Context__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:616:1: ( ( rule__Context__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:617:1: ( rule__Context__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:618:1: ( rule__Context__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:618:2: rule__Context__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:630:1: entryRuleOther : ruleOther EOF ;
    public final void entryRuleOther() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:631:1: ( ruleOther EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:632:1: ruleOther EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:639:1: ruleOther : ( ( rule__Other__Group__0 ) ) ;
    public final void ruleOther() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:643:5: ( ( ( rule__Other__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:644:1: ( ( rule__Other__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:644:1: ( ( rule__Other__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:645:1: ( rule__Other__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:646:1: ( rule__Other__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:646:2: rule__Other__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:658:1: entryRuleOtherName : ruleOtherName EOF ;
    public final void entryRuleOtherName() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:659:1: ( ruleOtherName EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:660:1: ruleOtherName EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:667:1: ruleOtherName : ( ( rule__OtherName__Alternatives ) ) ;
    public final void ruleOtherName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:671:5: ( ( ( rule__OtherName__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:672:1: ( ( rule__OtherName__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:672:1: ( ( rule__OtherName__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:673:1: ( rule__OtherName__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherNameAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:674:1: ( rule__OtherName__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:674:2: rule__OtherName__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:686:1: entryRuleSpecialCommandName : ruleSpecialCommandName EOF ;
    public final void entryRuleSpecialCommandName() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:687:1: ( ruleSpecialCommandName EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:688:1: ruleSpecialCommandName EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:695:1: ruleSpecialCommandName : ( ( rule__SpecialCommandName__Alternatives ) ) ;
    public final void ruleSpecialCommandName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:699:5: ( ( ( rule__SpecialCommandName__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:700:1: ( ( rule__SpecialCommandName__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:700:1: ( ( rule__SpecialCommandName__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:701:1: ( rule__SpecialCommandName__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandNameAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:702:1: ( rule__SpecialCommandName__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:702:2: rule__SpecialCommandName__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:714:1: entryRuleSpecialCharacter : ruleSpecialCharacter EOF ;
    public final void entryRuleSpecialCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:715:1: ( ruleSpecialCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:716:1: ruleSpecialCharacter EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:723:1: ruleSpecialCharacter : ( ( rule__SpecialCharacter__Alternatives ) ) ;
    public final void ruleSpecialCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:727:5: ( ( ( rule__SpecialCharacter__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:728:1: ( ( rule__SpecialCharacter__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:728:1: ( ( rule__SpecialCharacter__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:729:1: ( rule__SpecialCharacter__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCharacterAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:730:1: ( rule__SpecialCharacter__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:730:2: rule__SpecialCharacter__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:742:1: entryRuleUnparsedBlock : ruleUnparsedBlock EOF ;
    public final void entryRuleUnparsedBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:743:1: ( ruleUnparsedBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:744:1: ruleUnparsedBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:751:1: ruleUnparsedBlock : ( ( rule__UnparsedBlock__Group__0 ) ) ;
    public final void ruleUnparsedBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:755:5: ( ( ( rule__UnparsedBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:756:1: ( ( rule__UnparsedBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:756:1: ( ( rule__UnparsedBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:757:1: ( rule__UnparsedBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:758:1: ( rule__UnparsedBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:758:2: rule__UnparsedBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:770:1: entryRuleUnparsedExpression : ruleUnparsedExpression EOF ;
    public final void entryRuleUnparsedExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:771:1: ( ruleUnparsedExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:772:1: ruleUnparsedExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:779:1: ruleUnparsedExpression : ( ( rule__UnparsedExpression__Alternatives ) ) ;
    public final void ruleUnparsedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:5: ( ( ( rule__UnparsedExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:784:1: ( ( rule__UnparsedExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:784:1: ( ( rule__UnparsedExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:785:1: ( rule__UnparsedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:786:1: ( rule__UnparsedExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:786:2: rule__UnparsedExpression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:798:1: entryRuleUnparsedCommand : ruleUnparsedCommand EOF ;
    public final void entryRuleUnparsedCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:799:1: ( ruleUnparsedCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:800:1: ruleUnparsedCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:807:1: ruleUnparsedCommand : ( ( rule__UnparsedCommand__Group__0 ) ) ;
    public final void ruleUnparsedCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:811:5: ( ( ( rule__UnparsedCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:812:1: ( ( rule__UnparsedCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:812:1: ( ( rule__UnparsedCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:813:1: ( rule__UnparsedCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:814:1: ( rule__UnparsedCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:814:2: rule__UnparsedCommand__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:826:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:827:1: ( ruleReference EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:828:1: ruleReference EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:835:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:839:5: ( ( ( rule__Reference__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:840:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:840:1: ( ( rule__Reference__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:841:1: ( rule__Reference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:842:1: ( rule__Reference__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:842:2: rule__Reference__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:854:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:855:1: ( ruleText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:856:1: ruleText EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:863:1: ruleText : ( ( rule__Text__ValueAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:867:5: ( ( ( rule__Text__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:868:1: ( ( rule__Text__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:868:1: ( ( rule__Text__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:869:1: ( rule__Text__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:870:1: ( rule__Text__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:870:2: rule__Text__ValueAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:882:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:883:1: ( ruleNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:884:1: ruleNumber EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:891:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:895:5: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:897:1: ( rule__Number__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:898:1: ( rule__Number__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:898:2: rule__Number__ValueAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:910:1: entryRuleScheme : ruleScheme EOF ;
    public final void entryRuleScheme() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:914:1: ( ruleScheme EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:915:1: ruleScheme EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:925:1: ruleScheme : ( ( rule__Scheme__Group__0 ) ) ;
    public final void ruleScheme() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:5: ( ( ( rule__Scheme__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:931:1: ( ( rule__Scheme__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:931:1: ( ( rule__Scheme__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:932:1: ( rule__Scheme__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:933:1: ( rule__Scheme__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:933:2: rule__Scheme__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:946:1: entryRuleSchemeExpression : ruleSchemeExpression EOF ;
    public final void entryRuleSchemeExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:947:1: ( ruleSchemeExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:948:1: ruleSchemeExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:955:1: ruleSchemeExpression : ( ( rule__SchemeExpression__Group__0 ) ) ;
    public final void ruleSchemeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:959:5: ( ( ( rule__SchemeExpression__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:960:1: ( ( rule__SchemeExpression__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:960:1: ( ( rule__SchemeExpression__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:961:1: ( rule__SchemeExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:962:1: ( rule__SchemeExpression__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:962:2: rule__SchemeExpression__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:974:1: entryRuleSchemeValue : ruleSchemeValue EOF ;
    public final void entryRuleSchemeValue() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:975:1: ( ruleSchemeValue EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:976:1: ruleSchemeValue EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:983:1: ruleSchemeValue : ( ( rule__SchemeValue__Alternatives ) ) ;
    public final void ruleSchemeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:987:5: ( ( ( rule__SchemeValue__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:988:1: ( ( rule__SchemeValue__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:988:1: ( ( rule__SchemeValue__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:989:1: ( rule__SchemeValue__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeValueAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:990:1: ( rule__SchemeValue__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:990:2: rule__SchemeValue__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1002:1: entryRuleSchemeBoolean : ruleSchemeBoolean EOF ;
    public final void entryRuleSchemeBoolean() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1003:1: ( ruleSchemeBoolean EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1004:1: ruleSchemeBoolean EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1011:1: ruleSchemeBoolean : ( ( rule__SchemeBoolean__ValueAssignment ) ) ;
    public final void ruleSchemeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1015:5: ( ( ( rule__SchemeBoolean__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1016:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1016:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1017:1: ( rule__SchemeBoolean__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1018:1: ( rule__SchemeBoolean__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1018:2: rule__SchemeBoolean__ValueAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1030:1: entryRuleSchemeList : ruleSchemeList EOF ;
    public final void entryRuleSchemeList() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1031:1: ( ruleSchemeList EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1032:1: ruleSchemeList EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1039:1: ruleSchemeList : ( ( rule__SchemeList__Group__0 ) ) ;
    public final void ruleSchemeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1043:5: ( ( ( rule__SchemeList__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1044:1: ( ( rule__SchemeList__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1044:1: ( ( rule__SchemeList__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1045:1: ( rule__SchemeList__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1046:1: ( rule__SchemeList__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1046:2: rule__SchemeList__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1058:1: entryRuleSchemeBlock : ruleSchemeBlock EOF ;
    public final void entryRuleSchemeBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1059:1: ( ruleSchemeBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1060:1: ruleSchemeBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1067:1: ruleSchemeBlock : ( ( rule__SchemeBlock__Group__0 ) ) ;
    public final void ruleSchemeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1071:5: ( ( ( rule__SchemeBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1072:1: ( ( rule__SchemeBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1072:1: ( ( rule__SchemeBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1073:1: ( rule__SchemeBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1074:1: ( rule__SchemeBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1074:2: rule__SchemeBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1086:1: entryRuleSchemeCharacter : ruleSchemeCharacter EOF ;
    public final void entryRuleSchemeCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1087:1: ( ruleSchemeCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1088:1: ruleSchemeCharacter EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1095:1: ruleSchemeCharacter : ( ( rule__SchemeCharacter__Group__0 ) ) ;
    public final void ruleSchemeCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1099:5: ( ( ( rule__SchemeCharacter__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1100:1: ( ( rule__SchemeCharacter__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1100:1: ( ( rule__SchemeCharacter__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1101:1: ( rule__SchemeCharacter__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1102:1: ( rule__SchemeCharacter__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1102:2: rule__SchemeCharacter__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1114:1: entryRuleSchemeText : ruleSchemeText EOF ;
    public final void entryRuleSchemeText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1115:1: ( ruleSchemeText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1116:1: ruleSchemeText EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1123:1: ruleSchemeText : ( ( rule__SchemeText__ValueAssignment ) ) ;
    public final void ruleSchemeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1127:5: ( ( ( rule__SchemeText__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1128:1: ( ( rule__SchemeText__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1128:1: ( ( rule__SchemeText__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1129:1: ( rule__SchemeText__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1130:1: ( rule__SchemeText__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1130:2: rule__SchemeText__ValueAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1142:1: entryRuleSchemeId : ruleSchemeId EOF ;
    public final void entryRuleSchemeId() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1146:1: ( ruleSchemeId EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1147:1: ruleSchemeId EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1157:1: ruleSchemeId : ( ( rule__SchemeId__Group__0 ) ) ;
    public final void ruleSchemeId() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1162:5: ( ( ( rule__SchemeId__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( ( rule__SchemeId__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( ( rule__SchemeId__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1164:1: ( rule__SchemeId__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1165:1: ( rule__SchemeId__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1165:2: rule__SchemeId__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1178:1: entryRuleSchemeTextLiteral : ruleSchemeTextLiteral EOF ;
    public final void entryRuleSchemeTextLiteral() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1179:1: ( ruleSchemeTextLiteral EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1180:1: ruleSchemeTextLiteral EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1187:1: ruleSchemeTextLiteral : ( ( rule__SchemeTextLiteral__Alternatives ) ) ;
    public final void ruleSchemeTextLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1191:5: ( ( ( rule__SchemeTextLiteral__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1192:1: ( ( rule__SchemeTextLiteral__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1192:1: ( ( rule__SchemeTextLiteral__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1193:1: ( rule__SchemeTextLiteral__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextLiteralAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1194:1: ( rule__SchemeTextLiteral__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1194:2: rule__SchemeTextLiteral__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1206:1: entryRuleSchemeNumber : ruleSchemeNumber EOF ;
    public final void entryRuleSchemeNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1210:1: ( ruleSchemeNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1211:1: ruleSchemeNumber EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1221:1: ruleSchemeNumber : ( ( rule__SchemeNumber__Group__0 ) ) ;
    public final void ruleSchemeNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1226:5: ( ( ( rule__SchemeNumber__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1227:1: ( ( rule__SchemeNumber__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1227:1: ( ( rule__SchemeNumber__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1228:1: ( rule__SchemeNumber__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1229:1: ( rule__SchemeNumber__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1229:2: rule__SchemeNumber__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1242:1: entryRuleSchemeNumberRadix : ruleSchemeNumberRadix EOF ;
    public final void entryRuleSchemeNumberRadix() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1243:1: ( ruleSchemeNumberRadix EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1244:1: ruleSchemeNumberRadix EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1251:1: ruleSchemeNumberRadix : ( ( rule__SchemeNumberRadix__Group__0 ) ) ;
    public final void ruleSchemeNumberRadix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1255:5: ( ( ( rule__SchemeNumberRadix__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1256:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1256:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1257:1: ( rule__SchemeNumberRadix__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1258:1: ( rule__SchemeNumberRadix__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1258:2: rule__SchemeNumberRadix__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1270:1: entryRuleSchemeMarkupCommand : ruleSchemeMarkupCommand EOF ;
    public final void entryRuleSchemeMarkupCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1274:1: ( ruleSchemeMarkupCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1275:1: ruleSchemeMarkupCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1285:1: ruleSchemeMarkupCommand : ( ( rule__SchemeMarkupCommand__Group__0 ) ) ;
    public final void ruleSchemeMarkupCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1290:5: ( ( ( rule__SchemeMarkupCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1291:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1291:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1292:1: ( rule__SchemeMarkupCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1293:1: ( rule__SchemeMarkupCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1293:2: rule__SchemeMarkupCommand__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1306:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1310:1: ( ruleIdentifier EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1311:1: ruleIdentifier EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1321:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1326:5: ( ( ( rule__Identifier__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1327:1: ( ( rule__Identifier__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1327:1: ( ( rule__Identifier__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1328:1: ( rule__Identifier__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1329:1: ( rule__Identifier__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1329:2: rule__Identifier__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1342:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1343:1: ( ruleBoolean EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1344:1: ruleBoolean EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1351:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1355:5: ( ( ( rule__Boolean__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1356:1: ( ( rule__Boolean__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1356:1: ( ( rule__Boolean__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1357:1: ( rule__Boolean__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1358:1: ( rule__Boolean__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1358:2: rule__Boolean__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1370:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );
    public final void rule__ToplevelExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1374:1: ( ( ruleAssignment ) | ( ruleCommonExpression ) )
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
                        new NoViableAltException("1370:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 1, input);

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
                        new NoViableAltException("1370:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_26:
            case KEYWORD_28:
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
                    new NoViableAltException("1370:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:1: ( ruleAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:1: ( ruleAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1376:1: ruleAssignment
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1381:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1381:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1382:1: ruleCommonExpression
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1392:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1396:1: ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) )
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
                        new NoViableAltException("1392:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 1, input);

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
                        new NoViableAltException("1392:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_26:
            case KEYWORD_28:
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
                    new NoViableAltException("1392:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1397:1: ( rulePropertyAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1397:1: ( rulePropertyAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1398:1: rulePropertyAssignment
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1403:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1403:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1404:1: ruleCommonExpression
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1414:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__CommonExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1418:1: ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case KEYWORD_15:
                {
                alt4=1;
                }
                break;
            case KEYWORD_26:
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
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_28:
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
                int LA4_5 = input.LA(2);

                if ( (synpred7()) ) {
                    alt4=4;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1414:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1414:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1419:1: ( ruleCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1419:1: ( ruleCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1420:1: ruleCommand
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1425:6: ( ruleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1425:6: ( ruleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1426:1: ruleBlock
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1431:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1431:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1432:1: ruleScheme
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1437:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1437:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1438:1: ruleText
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1443:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1443:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1444:1: ruleNumber
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1454:1: rule__Assignment__NameAlternatives_0_0 : ( ( ruleIdentifier ) | ( RULE_STRING ) );
    public final void rule__Assignment__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1458:1: ( ( ruleIdentifier ) | ( RULE_STRING ) )
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
                    new NoViableAltException("1454:1: rule__Assignment__NameAlternatives_0_0 : ( ( ruleIdentifier ) | ( RULE_STRING ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1459:1: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1459:1: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1460:1: ruleIdentifier
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1466:1: RULE_STRING
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1476:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( ruleIdentifier ) | ( RULE_STRING ) );
    public final void rule__PropertyAssignment__IdAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1480:1: ( ( ruleIdentifier ) | ( RULE_STRING ) )
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
                    new NoViableAltException("1476:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( ruleIdentifier ) | ( RULE_STRING ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1481:1: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1481:1: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1482:1: ruleIdentifier
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1487:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1487:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1488:1: RULE_STRING
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1498:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1502:1: ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_18) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_26) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1498:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1503:1: ( ruleSimpleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1503:1: ( ruleSimpleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1504:1: ruleSimpleBlock
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1509:6: ( ruleSimultaneousBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1509:6: ( ruleSimultaneousBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1510:1: ruleSimultaneousBlock
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1520:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1524:1: ( ( ruleSpecialCommand ) | ( ruleReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_15) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=KEYWORD_89 && LA8_1<=KEYWORD_31)||LA8_1==KEYWORD_1||(LA8_1>=KEYWORD_5 && LA8_1<=KEYWORD_7)||LA8_1==KEYWORD_11||(LA8_1>=KEYWORD_13 && LA8_1<=KEYWORD_14)||LA8_1==KEYWORD_16||LA8_1==KEYWORD_20) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_ALPHA) ) {
                    alt8=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1520:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1520:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1525:1: ( ruleSpecialCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1525:1: ( ruleSpecialCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1526:1: ruleSpecialCommand
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1531:6: ( ruleReference )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1531:6: ( ruleReference )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1532:1: ruleReference
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1542:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );
    public final void rule__SpecialCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1546:1: ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) )
            int alt9=6;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_15) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_61:
                    {
                    alt9=5;
                    }
                    break;
                case KEYWORD_89:
                case KEYWORD_87:
                case KEYWORD_88:
                case KEYWORD_85:
                case KEYWORD_86:
                case KEYWORD_82:
                case KEYWORD_83:
                case KEYWORD_80:
                case KEYWORD_81:
                case KEYWORD_75:
                case KEYWORD_76:
                case KEYWORD_77:
                case KEYWORD_78:
                case KEYWORD_79:
                case KEYWORD_67:
                case KEYWORD_68:
                case KEYWORD_69:
                case KEYWORD_70:
                case KEYWORD_71:
                case KEYWORD_72:
                case KEYWORD_73:
                case KEYWORD_74:
                case KEYWORD_60:
                case KEYWORD_62:
                case KEYWORD_63:
                case KEYWORD_65:
                case KEYWORD_49:
                case KEYWORD_50:
                case KEYWORD_51:
                case KEYWORD_52:
                case KEYWORD_53:
                case KEYWORD_54:
                case KEYWORD_56:
                case KEYWORD_57:
                case KEYWORD_58:
                case KEYWORD_59:
                case KEYWORD_42:
                case KEYWORD_43:
                case KEYWORD_44:
                case KEYWORD_45:
                case KEYWORD_46:
                case KEYWORD_47:
                case KEYWORD_48:
                case KEYWORD_32:
                case KEYWORD_33:
                case KEYWORD_34:
                case KEYWORD_35:
                case KEYWORD_36:
                case KEYWORD_37:
                case KEYWORD_38:
                case KEYWORD_39:
                case KEYWORD_40:
                case KEYWORD_41:
                case KEYWORD_29:
                case KEYWORD_30:
                case KEYWORD_31:
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
                case KEYWORD_66:
                    {
                    alt9=2;
                    }
                    break;
                case KEYWORD_84:
                    {
                    alt9=4;
                    }
                    break;
                case KEYWORD_64:
                    {
                    alt9=1;
                    }
                    break;
                case KEYWORD_55:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1542:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1542:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1547:1: ( ruleInclude )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1547:1: ( ruleInclude )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1548:1: ruleInclude
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1553:6: ( ruleVersion )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1553:6: ( ruleVersion )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1554:1: ruleVersion
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1559:6: ( ruleMarkup )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1559:6: ( ruleMarkup )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1560:1: ruleMarkup
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1565:6: ( ruleMarkupLines )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1565:6: ( ruleMarkupLines )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1566:1: ruleMarkupLines
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1571:6: ( ruleContext )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1571:6: ( ruleContext )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1572:1: ruleContext
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:6: ( ruleOther )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:6: ( ruleOther )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1578:1: ruleOther
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1588:1: rule__MarkupBody__CommandAlternatives_1_0 : ( ( ruleScheme ) | ( ruleUnparsedCommand ) );
    public final void rule__MarkupBody__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1592:1: ( ( ruleScheme ) | ( ruleUnparsedCommand ) )
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
                    new NoViableAltException("1588:1: rule__MarkupBody__CommandAlternatives_1_0 : ( ( ruleScheme ) | ( ruleUnparsedCommand ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1593:1: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1593:1: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1594:1: ruleScheme
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1599:6: ( ruleUnparsedCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1599:6: ( ruleUnparsedCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1600:1: ruleUnparsedCommand
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1610:1: rule__Other__KeywordAlternatives_1_0 : ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) );
    public final void rule__Other__KeywordAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1614:1: ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) )
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
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_65:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
                {
                alt11=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1610:1: rule__Other__KeywordAlternatives_1_0 : ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1615:1: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1615:1: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1616:1: ruleSpecialCharacter
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1621:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1621:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1622:1: KEYWORD_5
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1629:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1629:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1630:1: KEYWORD_6
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1637:6: ( ruleOtherName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1637:6: ( ruleOtherName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1638:1: ruleOtherName
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1648:1: rule__OtherName__Alternatives : ( ( KEYWORD_60 ) | ( KEYWORD_75 ) | ( KEYWORD_42 ) | ( KEYWORD_82 ) | ( KEYWORD_32 ) | ( KEYWORD_67 ) | ( KEYWORD_49 ) | ( KEYWORD_76 ) | ( KEYWORD_50 ) | ( KEYWORD_68 ) | ( KEYWORD_62 ) | ( KEYWORD_85 ) | ( KEYWORD_51 ) | ( KEYWORD_83 ) | ( KEYWORD_69 ) | ( KEYWORD_43 ) | ( KEYWORD_80 ) | ( KEYWORD_63 ) | ( KEYWORD_89 ) | ( KEYWORD_52 ) | ( KEYWORD_29 ) | ( KEYWORD_53 ) | ( KEYWORD_77 ) | ( KEYWORD_54 ) | ( KEYWORD_70 ) | ( KEYWORD_78 ) | ( KEYWORD_33 ) | ( KEYWORD_34 ) | ( KEYWORD_35 ) | ( KEYWORD_30 ) | ( KEYWORD_71 ) | ( KEYWORD_72 ) | ( KEYWORD_56 ) | ( KEYWORD_36 ) | ( KEYWORD_73 ) | ( KEYWORD_44 ) | ( KEYWORD_65 ) | ( KEYWORD_74 ) | ( KEYWORD_57 ) | ( KEYWORD_58 ) | ( KEYWORD_37 ) | ( KEYWORD_59 ) | ( KEYWORD_45 ) | ( KEYWORD_81 ) | ( KEYWORD_31 ) | ( KEYWORD_86 ) | ( KEYWORD_38 ) | ( KEYWORD_87 ) | ( KEYWORD_88 ) | ( KEYWORD_46 ) | ( KEYWORD_39 ) | ( KEYWORD_47 ) | ( KEYWORD_79 ) | ( KEYWORD_40 ) | ( KEYWORD_48 ) | ( KEYWORD_41 ) );
    public final void rule__OtherName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1652:1: ( ( KEYWORD_60 ) | ( KEYWORD_75 ) | ( KEYWORD_42 ) | ( KEYWORD_82 ) | ( KEYWORD_32 ) | ( KEYWORD_67 ) | ( KEYWORD_49 ) | ( KEYWORD_76 ) | ( KEYWORD_50 ) | ( KEYWORD_68 ) | ( KEYWORD_62 ) | ( KEYWORD_85 ) | ( KEYWORD_51 ) | ( KEYWORD_83 ) | ( KEYWORD_69 ) | ( KEYWORD_43 ) | ( KEYWORD_80 ) | ( KEYWORD_63 ) | ( KEYWORD_89 ) | ( KEYWORD_52 ) | ( KEYWORD_29 ) | ( KEYWORD_53 ) | ( KEYWORD_77 ) | ( KEYWORD_54 ) | ( KEYWORD_70 ) | ( KEYWORD_78 ) | ( KEYWORD_33 ) | ( KEYWORD_34 ) | ( KEYWORD_35 ) | ( KEYWORD_30 ) | ( KEYWORD_71 ) | ( KEYWORD_72 ) | ( KEYWORD_56 ) | ( KEYWORD_36 ) | ( KEYWORD_73 ) | ( KEYWORD_44 ) | ( KEYWORD_65 ) | ( KEYWORD_74 ) | ( KEYWORD_57 ) | ( KEYWORD_58 ) | ( KEYWORD_37 ) | ( KEYWORD_59 ) | ( KEYWORD_45 ) | ( KEYWORD_81 ) | ( KEYWORD_31 ) | ( KEYWORD_86 ) | ( KEYWORD_38 ) | ( KEYWORD_87 ) | ( KEYWORD_88 ) | ( KEYWORD_46 ) | ( KEYWORD_39 ) | ( KEYWORD_47 ) | ( KEYWORD_79 ) | ( KEYWORD_40 ) | ( KEYWORD_48 ) | ( KEYWORD_41 ) )
            int alt12=56;
            switch ( input.LA(1) ) {
            case KEYWORD_60:
                {
                alt12=1;
                }
                break;
            case KEYWORD_75:
                {
                alt12=2;
                }
                break;
            case KEYWORD_42:
                {
                alt12=3;
                }
                break;
            case KEYWORD_82:
                {
                alt12=4;
                }
                break;
            case KEYWORD_32:
                {
                alt12=5;
                }
                break;
            case KEYWORD_67:
                {
                alt12=6;
                }
                break;
            case KEYWORD_49:
                {
                alt12=7;
                }
                break;
            case KEYWORD_76:
                {
                alt12=8;
                }
                break;
            case KEYWORD_50:
                {
                alt12=9;
                }
                break;
            case KEYWORD_68:
                {
                alt12=10;
                }
                break;
            case KEYWORD_62:
                {
                alt12=11;
                }
                break;
            case KEYWORD_85:
                {
                alt12=12;
                }
                break;
            case KEYWORD_51:
                {
                alt12=13;
                }
                break;
            case KEYWORD_83:
                {
                alt12=14;
                }
                break;
            case KEYWORD_69:
                {
                alt12=15;
                }
                break;
            case KEYWORD_43:
                {
                alt12=16;
                }
                break;
            case KEYWORD_80:
                {
                alt12=17;
                }
                break;
            case KEYWORD_63:
                {
                alt12=18;
                }
                break;
            case KEYWORD_89:
                {
                alt12=19;
                }
                break;
            case KEYWORD_52:
                {
                alt12=20;
                }
                break;
            case KEYWORD_29:
                {
                alt12=21;
                }
                break;
            case KEYWORD_53:
                {
                alt12=22;
                }
                break;
            case KEYWORD_77:
                {
                alt12=23;
                }
                break;
            case KEYWORD_54:
                {
                alt12=24;
                }
                break;
            case KEYWORD_70:
                {
                alt12=25;
                }
                break;
            case KEYWORD_78:
                {
                alt12=26;
                }
                break;
            case KEYWORD_33:
                {
                alt12=27;
                }
                break;
            case KEYWORD_34:
                {
                alt12=28;
                }
                break;
            case KEYWORD_35:
                {
                alt12=29;
                }
                break;
            case KEYWORD_30:
                {
                alt12=30;
                }
                break;
            case KEYWORD_71:
                {
                alt12=31;
                }
                break;
            case KEYWORD_72:
                {
                alt12=32;
                }
                break;
            case KEYWORD_56:
                {
                alt12=33;
                }
                break;
            case KEYWORD_36:
                {
                alt12=34;
                }
                break;
            case KEYWORD_73:
                {
                alt12=35;
                }
                break;
            case KEYWORD_44:
                {
                alt12=36;
                }
                break;
            case KEYWORD_65:
                {
                alt12=37;
                }
                break;
            case KEYWORD_74:
                {
                alt12=38;
                }
                break;
            case KEYWORD_57:
                {
                alt12=39;
                }
                break;
            case KEYWORD_58:
                {
                alt12=40;
                }
                break;
            case KEYWORD_37:
                {
                alt12=41;
                }
                break;
            case KEYWORD_59:
                {
                alt12=42;
                }
                break;
            case KEYWORD_45:
                {
                alt12=43;
                }
                break;
            case KEYWORD_81:
                {
                alt12=44;
                }
                break;
            case KEYWORD_31:
                {
                alt12=45;
                }
                break;
            case KEYWORD_86:
                {
                alt12=46;
                }
                break;
            case KEYWORD_38:
                {
                alt12=47;
                }
                break;
            case KEYWORD_87:
                {
                alt12=48;
                }
                break;
            case KEYWORD_88:
                {
                alt12=49;
                }
                break;
            case KEYWORD_46:
                {
                alt12=50;
                }
                break;
            case KEYWORD_39:
                {
                alt12=51;
                }
                break;
            case KEYWORD_47:
                {
                alt12=52;
                }
                break;
            case KEYWORD_79:
                {
                alt12=53;
                }
                break;
            case KEYWORD_40:
                {
                alt12=54;
                }
                break;
            case KEYWORD_48:
                {
                alt12=55;
                }
                break;
            case KEYWORD_41:
                {
                alt12=56;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1648:1: rule__OtherName__Alternatives : ( ( KEYWORD_60 ) | ( KEYWORD_75 ) | ( KEYWORD_42 ) | ( KEYWORD_82 ) | ( KEYWORD_32 ) | ( KEYWORD_67 ) | ( KEYWORD_49 ) | ( KEYWORD_76 ) | ( KEYWORD_50 ) | ( KEYWORD_68 ) | ( KEYWORD_62 ) | ( KEYWORD_85 ) | ( KEYWORD_51 ) | ( KEYWORD_83 ) | ( KEYWORD_69 ) | ( KEYWORD_43 ) | ( KEYWORD_80 ) | ( KEYWORD_63 ) | ( KEYWORD_89 ) | ( KEYWORD_52 ) | ( KEYWORD_29 ) | ( KEYWORD_53 ) | ( KEYWORD_77 ) | ( KEYWORD_54 ) | ( KEYWORD_70 ) | ( KEYWORD_78 ) | ( KEYWORD_33 ) | ( KEYWORD_34 ) | ( KEYWORD_35 ) | ( KEYWORD_30 ) | ( KEYWORD_71 ) | ( KEYWORD_72 ) | ( KEYWORD_56 ) | ( KEYWORD_36 ) | ( KEYWORD_73 ) | ( KEYWORD_44 ) | ( KEYWORD_65 ) | ( KEYWORD_74 ) | ( KEYWORD_57 ) | ( KEYWORD_58 ) | ( KEYWORD_37 ) | ( KEYWORD_59 ) | ( KEYWORD_45 ) | ( KEYWORD_81 ) | ( KEYWORD_31 ) | ( KEYWORD_86 ) | ( KEYWORD_38 ) | ( KEYWORD_87 ) | ( KEYWORD_88 ) | ( KEYWORD_46 ) | ( KEYWORD_39 ) | ( KEYWORD_47 ) | ( KEYWORD_79 ) | ( KEYWORD_40 ) | ( KEYWORD_48 ) | ( KEYWORD_41 ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1653:1: ( KEYWORD_60 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1653:1: ( KEYWORD_60 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1654:1: KEYWORD_60
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0()); 
                    }
                    match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_rule__OtherName__Alternatives3453); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1661:6: ( KEYWORD_75 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1661:6: ( KEYWORD_75 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1662:1: KEYWORD_75
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1()); 
                    }
                    match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_rule__OtherName__Alternatives3473); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1669:6: ( KEYWORD_42 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1669:6: ( KEYWORD_42 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1670:1: KEYWORD_42
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAliasKeyword_2()); 
                    }
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__OtherName__Alternatives3493); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAliasKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1677:6: ( KEYWORD_82 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1677:6: ( KEYWORD_82 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1678:1: KEYWORD_82
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3()); 
                    }
                    match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_rule__OtherName__Alternatives3513); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1685:6: ( KEYWORD_32 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1685:6: ( KEYWORD_32 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1686:1: KEYWORD_32
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getBookKeyword_4()); 
                    }
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rule__OtherName__Alternatives3533); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getBookKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1693:6: ( KEYWORD_67 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1693:6: ( KEYWORD_67 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1694:1: KEYWORD_67
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getBookpartKeyword_5()); 
                    }
                    match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_rule__OtherName__Alternatives3553); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getBookpartKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1701:6: ( KEYWORD_49 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1701:6: ( KEYWORD_49 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1702:1: KEYWORD_49
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChangeKeyword_6()); 
                    }
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_rule__OtherName__Alternatives3573); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChangeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1709:6: ( KEYWORD_76 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1709:6: ( KEYWORD_76 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1710:1: KEYWORD_76
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChordmodeKeyword_7()); 
                    }
                    match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_rule__OtherName__Alternatives3593); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChordmodeKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1717:6: ( KEYWORD_50 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1717:6: ( KEYWORD_50 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1718:1: KEYWORD_50
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChordsKeyword_8()); 
                    }
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rule__OtherName__Alternatives3613); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChordsKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1725:6: ( KEYWORD_68 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1725:6: ( KEYWORD_68 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1726:1: KEYWORD_68
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getConsistsKeyword_9()); 
                    }
                    match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_rule__OtherName__Alternatives3633); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getConsistsKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1733:6: ( KEYWORD_62 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1733:6: ( KEYWORD_62 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1734:1: KEYWORD_62
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDefaultKeyword_10()); 
                    }
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rule__OtherName__Alternatives3653); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDefaultKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1741:6: ( KEYWORD_85 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1741:6: ( KEYWORD_85 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1742:1: KEYWORD_85
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_11()); 
                    }
                    match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_rule__OtherName__Alternatives3673); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1749:6: ( KEYWORD_51 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1749:6: ( KEYWORD_51 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1750:1: KEYWORD_51
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDeniesKeyword_12()); 
                    }
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rule__OtherName__Alternatives3693); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDeniesKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1757:6: ( KEYWORD_83 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1757:6: ( KEYWORD_83 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1758:1: KEYWORD_83
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDescriptionKeyword_13()); 
                    }
                    match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_rule__OtherName__Alternatives3713); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDescriptionKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1765:6: ( KEYWORD_69 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1765:6: ( KEYWORD_69 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1766:1: KEYWORD_69
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDrummodeKeyword_14()); 
                    }
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_rule__OtherName__Alternatives3733); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDrummodeKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1773:6: ( KEYWORD_43 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1773:6: ( KEYWORD_43 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1774:1: KEYWORD_43
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDrumsKeyword_15()); 
                    }
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rule__OtherName__Alternatives3753); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDrumsKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1781:6: ( KEYWORD_80 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1781:6: ( KEYWORD_80 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1782:1: KEYWORD_80
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getFiguremodeKeyword_16()); 
                    }
                    match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_rule__OtherName__Alternatives3773); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getFiguremodeKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1789:6: ( KEYWORD_63 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1789:6: ( KEYWORD_63 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1790:1: KEYWORD_63
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getFiguresKeyword_17()); 
                    }
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_rule__OtherName__Alternatives3793); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getFiguresKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1797:6: ( KEYWORD_89 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1797:6: ( KEYWORD_89 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1798:1: KEYWORD_89
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_18()); 
                    }
                    match(input,KEYWORD_89,FOLLOW_KEYWORD_89_in_rule__OtherName__Alternatives3813); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1805:6: ( KEYWORD_52 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1805:6: ( KEYWORD_52 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1806:1: KEYWORD_52
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getHeaderKeyword_19()); 
                    }
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rule__OtherName__Alternatives3833); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getHeaderKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1813:6: ( KEYWORD_29 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1813:6: ( KEYWORD_29 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1814:1: KEYWORD_29
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getKeyKeyword_20()); 
                    }
                    match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__OtherName__Alternatives3853); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getKeyKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1821:6: ( KEYWORD_53 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1821:6: ( KEYWORD_53 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1822:1: KEYWORD_53
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLayoutKeyword_21()); 
                    }
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rule__OtherName__Alternatives3873); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLayoutKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1829:6: ( KEYWORD_77 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1829:6: ( KEYWORD_77 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1830:1: KEYWORD_77
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricmodeKeyword_22()); 
                    }
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_rule__OtherName__Alternatives3893); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricmodeKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1837:6: ( KEYWORD_54 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1837:6: ( KEYWORD_54 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1838:1: KEYWORD_54
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricsKeyword_23()); 
                    }
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rule__OtherName__Alternatives3913); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricsKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1845:6: ( KEYWORD_70 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1845:6: ( KEYWORD_70 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1846:1: KEYWORD_70
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricstoKeyword_24()); 
                    }
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_rule__OtherName__Alternatives3933); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricstoKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1853:6: ( KEYWORD_78 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1853:6: ( KEYWORD_78 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1854:1: KEYWORD_78
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMaininputKeyword_25()); 
                    }
                    match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_rule__OtherName__Alternatives3953); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMaininputKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1861:6: ( KEYWORD_33 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1861:6: ( KEYWORD_33 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1862:1: KEYWORD_33
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMarkKeyword_26()); 
                    }
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__OtherName__Alternatives3973); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMarkKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1869:6: ( KEYWORD_34 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1869:6: ( KEYWORD_34 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1870:1: KEYWORD_34
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMidiKeyword_27()); 
                    }
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rule__OtherName__Alternatives3993); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMidiKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1877:6: ( KEYWORD_35 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1877:6: ( KEYWORD_35 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1878:1: KEYWORD_35
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNameKeyword_28()); 
                    }
                    match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__OtherName__Alternatives4013); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNameKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1885:6: ( KEYWORD_30 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1885:6: ( KEYWORD_30 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1886:1: KEYWORD_30
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNewKeyword_29()); 
                    }
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__OtherName__Alternatives4033); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNewKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1893:6: ( KEYWORD_71 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1893:6: ( KEYWORD_71 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1894:1: KEYWORD_71
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNotemodeKeyword_30()); 
                    }
                    match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_rule__OtherName__Alternatives4053); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNotemodeKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1901:6: ( KEYWORD_72 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1901:6: ( KEYWORD_72 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1902:1: KEYWORD_72
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getObjectidKeyword_31()); 
                    }
                    match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_rule__OtherName__Alternatives4073); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getObjectidKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1909:6: ( KEYWORD_56 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1909:6: ( KEYWORD_56 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1910:1: KEYWORD_56
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOctaveKeyword_32()); 
                    }
                    match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_rule__OtherName__Alternatives4093); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOctaveKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1917:6: ( KEYWORD_36 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1917:6: ( KEYWORD_36 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1918:1: KEYWORD_36
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOnceKeyword_33()); 
                    }
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rule__OtherName__Alternatives4113); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOnceKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1925:6: ( KEYWORD_73 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1925:6: ( KEYWORD_73 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1926:1: KEYWORD_73
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOverrideKeyword_34()); 
                    }
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_rule__OtherName__Alternatives4133); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOverrideKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1933:6: ( KEYWORD_44 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1933:6: ( KEYWORD_44 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1934:1: KEYWORD_44
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getPaperKeyword_35()); 
                    }
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rule__OtherName__Alternatives4153); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getPaperKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1941:6: ( KEYWORD_65 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1941:6: ( KEYWORD_65 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1942:1: KEYWORD_65
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getPartialKeyword_36()); 
                    }
                    match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_rule__OtherName__Alternatives4173); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getPartialKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1949:6: ( KEYWORD_74 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1949:6: ( KEYWORD_74 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1950:1: KEYWORD_74
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRelativeKeyword_37()); 
                    }
                    match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_rule__OtherName__Alternatives4193); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRelativeKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1957:6: ( KEYWORD_57 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1957:6: ( KEYWORD_57 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1958:1: KEYWORD_57
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRemoveKeyword_38()); 
                    }
                    match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_rule__OtherName__Alternatives4213); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRemoveKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1965:6: ( KEYWORD_58 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1965:6: ( KEYWORD_58 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1966:1: KEYWORD_58
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRepeatKeyword_39()); 
                    }
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_rule__OtherName__Alternatives4233); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRepeatKeyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1973:6: ( KEYWORD_37 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1973:6: ( KEYWORD_37 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1974:1: KEYWORD_37
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRestKeyword_40()); 
                    }
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_rule__OtherName__Alternatives4253); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRestKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1981:6: ( KEYWORD_59 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1981:6: ( KEYWORD_59 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1982:1: KEYWORD_59
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRevertKeyword_41()); 
                    }
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_rule__OtherName__Alternatives4273); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRevertKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1989:6: ( KEYWORD_45 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1989:6: ( KEYWORD_45 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1990:1: KEYWORD_45
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getScoreKeyword_42()); 
                    }
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rule__OtherName__Alternatives4293); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getScoreKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1997:6: ( KEYWORD_81 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1997:6: ( KEYWORD_81 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1998:1: KEYWORD_81
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSequentialKeyword_43()); 
                    }
                    match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_rule__OtherName__Alternatives4313); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSequentialKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2005:6: ( KEYWORD_31 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2005:6: ( KEYWORD_31 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2006:1: KEYWORD_31
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSetKeyword_44()); 
                    }
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__OtherName__Alternatives4333); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSetKeyword_44()); 
                    }

                    }


                    }
                    break;
                case 46 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2013:6: ( KEYWORD_86 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2013:6: ( KEYWORD_86 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2014:1: KEYWORD_86
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_45()); 
                    }
                    match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_rule__OtherName__Alternatives4353); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_45()); 
                    }

                    }


                    }
                    break;
                case 47 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2021:6: ( KEYWORD_38 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2021:6: ( KEYWORD_38 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2022:1: KEYWORD_38
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSkipKeyword_46()); 
                    }
                    match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rule__OtherName__Alternatives4373); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSkipKeyword_46()); 
                    }

                    }


                    }
                    break;
                case 48 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2029:6: ( KEYWORD_87 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2029:6: ( KEYWORD_87 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2030:1: KEYWORD_87
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_47()); 
                    }
                    match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_rule__OtherName__Alternatives4393); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_47()); 
                    }

                    }


                    }
                    break;
                case 49 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2037:6: ( KEYWORD_88 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2037:6: ( KEYWORD_88 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2038:1: KEYWORD_88
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_48()); 
                    }
                    match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_rule__OtherName__Alternatives4413); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_48()); 
                    }

                    }


                    }
                    break;
                case 50 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2045:6: ( KEYWORD_46 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2045:6: ( KEYWORD_46 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2046:1: KEYWORD_46
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTempoKeyword_49()); 
                    }
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rule__OtherName__Alternatives4433); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTempoKeyword_49()); 
                    }

                    }


                    }
                    break;
                case 51 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2053:6: ( KEYWORD_39 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2053:6: ( KEYWORD_39 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2054:1: KEYWORD_39
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTimeKeyword_50()); 
                    }
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rule__OtherName__Alternatives4453); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTimeKeyword_50()); 
                    }

                    }


                    }
                    break;
                case 52 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2061:6: ( KEYWORD_47 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2061:6: ( KEYWORD_47 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2062:1: KEYWORD_47
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTimesKeyword_51()); 
                    }
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rule__OtherName__Alternatives4473); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTimesKeyword_51()); 
                    }

                    }


                    }
                    break;
                case 53 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2069:6: ( KEYWORD_79 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2069:6: ( KEYWORD_79 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2070:1: KEYWORD_79
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTransposeKeyword_52()); 
                    }
                    match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_rule__OtherName__Alternatives4493); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTransposeKeyword_52()); 
                    }

                    }


                    }
                    break;
                case 54 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2077:6: ( KEYWORD_40 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2077:6: ( KEYWORD_40 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2078:1: KEYWORD_40
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTypeKeyword_53()); 
                    }
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rule__OtherName__Alternatives4513); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTypeKeyword_53()); 
                    }

                    }


                    }
                    break;
                case 55 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2085:6: ( KEYWORD_48 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2085:6: ( KEYWORD_48 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2086:1: KEYWORD_48
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getUnsetKeyword_54()); 
                    }
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rule__OtherName__Alternatives4533); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getUnsetKeyword_54()); 
                    }

                    }


                    }
                    break;
                case 56 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2093:6: ( KEYWORD_41 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2093:6: ( KEYWORD_41 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2094:1: KEYWORD_41
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getWithKeyword_55()); 
                    }
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rule__OtherName__Alternatives4553); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2106:1: rule__SpecialCommandName__Alternatives : ( ( KEYWORD_64 ) | ( KEYWORD_66 ) | ( KEYWORD_55 ) | ( KEYWORD_84 ) | ( KEYWORD_61 ) | ( ruleOtherName ) );
    public final void rule__SpecialCommandName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2110:1: ( ( KEYWORD_64 ) | ( KEYWORD_66 ) | ( KEYWORD_55 ) | ( KEYWORD_84 ) | ( KEYWORD_61 ) | ( ruleOtherName ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case KEYWORD_64:
                {
                alt13=1;
                }
                break;
            case KEYWORD_66:
                {
                alt13=2;
                }
                break;
            case KEYWORD_55:
                {
                alt13=3;
                }
                break;
            case KEYWORD_84:
                {
                alt13=4;
                }
                break;
            case KEYWORD_61:
                {
                alt13=5;
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_65:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
                {
                alt13=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2106:1: rule__SpecialCommandName__Alternatives : ( ( KEYWORD_64 ) | ( KEYWORD_66 ) | ( KEYWORD_55 ) | ( KEYWORD_84 ) | ( KEYWORD_61 ) | ( ruleOtherName ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2111:1: ( KEYWORD_64 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2111:1: ( KEYWORD_64 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2112:1: KEYWORD_64
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0()); 
                    }
                    match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rule__SpecialCommandName__Alternatives4588); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2119:6: ( KEYWORD_66 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2119:6: ( KEYWORD_66 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2120:1: KEYWORD_66
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1()); 
                    }
                    match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_rule__SpecialCommandName__Alternatives4608); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2127:6: ( KEYWORD_55 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2127:6: ( KEYWORD_55 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2128:1: KEYWORD_55
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2()); 
                    }
                    match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_rule__SpecialCommandName__Alternatives4628); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2135:6: ( KEYWORD_84 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2135:6: ( KEYWORD_84 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2136:1: KEYWORD_84
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3()); 
                    }
                    match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_rule__SpecialCommandName__Alternatives4648); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2143:6: ( KEYWORD_61 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2143:6: ( KEYWORD_61 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2144:1: KEYWORD_61
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_4()); 
                    }
                    match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_rule__SpecialCommandName__Alternatives4668); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2151:6: ( ruleOtherName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2151:6: ( ruleOtherName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2152:1: ruleOtherName
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2162:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_14 ) | ( KEYWORD_16 ) | ( KEYWORD_20 ) );
    public final void rule__SpecialCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2166:1: ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_14 ) | ( KEYWORD_16 ) | ( KEYWORD_20 ) )
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
                    new NoViableAltException("2162:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_14 ) | ( KEYWORD_16 ) | ( KEYWORD_20 ) );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2167:1: ( KEYWORD_1 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2167:1: ( KEYWORD_1 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2168:1: KEYWORD_1
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2175:6: ( KEYWORD_7 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2175:6: ( KEYWORD_7 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2176:1: KEYWORD_7
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2183:6: ( KEYWORD_11 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2183:6: ( KEYWORD_11 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2184:1: KEYWORD_11
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2191:6: ( KEYWORD_13 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2191:6: ( KEYWORD_13 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2192:1: KEYWORD_13
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2199:6: ( KEYWORD_14 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2199:6: ( KEYWORD_14 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2200:1: KEYWORD_14
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:6: ( KEYWORD_16 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:6: ( KEYWORD_16 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2208:1: KEYWORD_16
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2215:6: ( KEYWORD_20 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2215:6: ( KEYWORD_20 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2216:1: KEYWORD_20
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2228:1: rule__UnparsedExpression__Alternatives : ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__UnparsedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2232:1: ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
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
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_28:
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
                int LA15_5 = input.LA(2);

                if ( (synpred90()) ) {
                    alt15=4;
                }
                else if ( (true) ) {
                    alt15=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2228:1: rule__UnparsedExpression__Alternatives : ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 15, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2228:1: rule__UnparsedExpression__Alternatives : ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2233:1: ( ruleUnparsedCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2233:1: ( ruleUnparsedCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2234:1: ruleUnparsedCommand
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2239:6: ( ruleUnparsedBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2239:6: ( ruleUnparsedBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2240:1: ruleUnparsedBlock
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2245:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2245:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2246:1: ruleScheme
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2251:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2251:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2252:1: ruleText
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2258:1: ruleNumber
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2268:1: rule__UnparsedCommand__CommandAlternatives_1_0 : ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) );
    public final void rule__UnparsedCommand__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2272:1: ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ALPHA) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=KEYWORD_89 && LA16_0<=KEYWORD_31)) ) {
                alt16=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2268:1: rule__UnparsedCommand__CommandAlternatives_1_0 : ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2273:1: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2273:1: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2274:1: ruleIdentifier
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2279:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2279:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2280:1: ruleSpecialCommandName
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2290:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) );
    public final void rule__Text__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2294:1: ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_28:
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
            case RULE_INT:
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
                    new NoViableAltException("2290:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2295:1: ( ruleSchemeTextLiteral )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2295:1: ( ruleSchemeTextLiteral )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2296:1: ruleSchemeTextLiteral
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2301:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2301:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2302:1: KEYWORD_5
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2309:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2309:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2310:1: KEYWORD_6
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2317:6: ( KEYWORD_4 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2317:6: ( KEYWORD_4 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2318:1: KEYWORD_4
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2325:6: ( KEYWORD_8 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2325:6: ( KEYWORD_8 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2326:1: KEYWORD_8
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2333:6: ( KEYWORD_10 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2333:6: ( KEYWORD_10 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2334:1: KEYWORD_10
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );
    public final void rule__SchemeExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2350:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) )
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 2, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 3, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 4, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 5, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_28:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 6, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 7, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 8, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 9, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 10, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 11, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 12, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 13, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 14, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 15, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_64:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 16, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_66:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 17, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_55:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 18, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_84:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 19, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_61:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 20, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_60:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 21, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_75:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 22, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_42:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 23, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_82:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 24, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_32:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 25, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_67:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 26, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_49:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 27, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_76:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 28, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_50:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 29, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_68:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 30, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_62:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 31, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_85:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 32, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_51:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 33, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_83:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 34, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_69:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 35, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_43:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 36, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_80:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 37, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_63:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 38, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_89:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 39, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_52:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 40, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_29:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 41, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_53:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 42, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_77:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 43, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_54:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 44, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_70:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 45, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_78:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 46, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_33:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 47, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_34:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 48, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_35:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 49, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_30:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 50, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_71:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 51, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_72:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 52, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_56:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 53, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_36:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 54, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_73:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 55, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_44:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 56, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_65:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 57, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_74:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 58, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_57:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 59, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_58:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 60, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_37:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 61, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_59:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 62, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_45:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 63, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_81:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 64, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_31:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 65, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_86:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 66, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_38:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 67, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_87:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 68, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_88:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 69, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_46:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 70, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_39:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 71, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_47:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 72, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_79:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 73, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_40:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 74, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_48:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 75, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_41:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 76, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 77, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 78, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 79, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ANY_OTHER:
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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 80, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 81, input);

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
                        new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 82, input);

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
                    new NoViableAltException("2346:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 )? ) );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2351:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2351:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2352:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2353:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==KEYWORD_4) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2353:2: rule__SchemeExpression__QuotedAssignment_0_0
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2357:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2357:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2358:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2359:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==KEYWORD_17) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2359:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2363:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2363:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2364:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2365:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KEYWORD_8) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2365:2: rule__SchemeExpression__UnquotedAssignment_0_2
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2369:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2369:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2370:1: ( rule__SchemeExpression__VariableAssignment_0_3 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getVariableAssignment_0_3()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2371:1: ( rule__SchemeExpression__VariableAssignment_0_3 )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==KEYWORD_3) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2371:2: rule__SchemeExpression__VariableAssignment_0_3
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2380:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );
    public final void rule__SchemeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_ALPHA) ) {
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
                            new NoViableAltException("2380:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 23, 8, input);

                        throw nvae;
                    }
                }
                else if ( (LA23_1==KEYWORD_5) ) {
                    alt23=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2380:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 23, 1, input);

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
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_28:
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
                int LA23_6 = input.LA(2);

                if ( (synpred108()) ) {
                    alt23=5;
                }
                else if ( (synpred109()) ) {
                    alt23=6;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2380:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 23, 6, input);

                    throw nvae;
                }
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
                    new NoViableAltException("2380:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2385:1: ( ruleSchemeBoolean )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2385:1: ( ruleSchemeBoolean )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2386:1: ruleSchemeBoolean
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2391:6: ( ruleSchemeList )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2391:6: ( ruleSchemeList )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2392:1: ruleSchemeList
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2397:6: ( ruleSchemeBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2397:6: ( ruleSchemeBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2398:1: ruleSchemeBlock
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2403:6: ( ruleSchemeCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2403:6: ( ruleSchemeCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2404:1: ruleSchemeCharacter
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2409:6: ( ruleSchemeText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2409:6: ( ruleSchemeText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2410:1: ruleSchemeText
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:6: ( ruleSchemeNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:6: ( ruleSchemeNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2416:1: ruleSchemeNumber
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2421:6: ( ruleSchemeMarkupCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2421:6: ( ruleSchemeMarkupCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2422:1: ruleSchemeMarkupCommand
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2432:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ALPHA ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeCharacter__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2436:1: ( ( RULE_ALPHA ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) )
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
                    new NoViableAltException("2432:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ALPHA ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2437:1: ( RULE_ALPHA )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2437:1: ( RULE_ALPHA )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2438:1: RULE_ALPHA
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2443:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2443:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2444:1: ruleSpecialCharacter
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2449:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2449:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2450:1: RULE_ANY_OTHER
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


    // $ANTLR start rule__SchemeId__Alternatives_1_0
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2460:1: rule__SchemeId__Alternatives_1_0 : ( ( KEYWORD_10 ) | ( KEYWORD_25 ) );
    public final void rule__SchemeId__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2464:1: ( ( KEYWORD_10 ) | ( KEYWORD_25 ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_10) ) {
                alt25=1;
            }
            else if ( (LA25_0==KEYWORD_25) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2460:1: rule__SchemeId__Alternatives_1_0 : ( ( KEYWORD_10 ) | ( KEYWORD_25 ) );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2465:1: ( KEYWORD_10 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2465:1: ( KEYWORD_10 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2466:1: KEYWORD_10
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeIdAccess().getColonKeyword_1_0_0()); 
                    }
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__SchemeId__Alternatives_1_05447); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeIdAccess().getColonKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2473:6: ( KEYWORD_25 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2473:6: ( KEYWORD_25 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2474:1: KEYWORD_25
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeIdAccess().getColonColonKeyword_1_0_1()); 
                    }
                    match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__SchemeId__Alternatives_1_05467); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeIdAccess().getColonColonKeyword_1_0_1()); 
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
    // $ANTLR end rule__SchemeId__Alternatives_1_0


    // $ANTLR start rule__SchemeTextLiteral__Alternatives
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2486:1: rule__SchemeTextLiteral__Alternatives : ( ( KEYWORD_28 ) | ( KEYWORD_12 ) | ( KEYWORD_9 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( ruleIdentifier ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeTextLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2490:1: ( ( KEYWORD_28 ) | ( KEYWORD_12 ) | ( KEYWORD_9 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( ruleIdentifier ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_ANY_OTHER ) )
            int alt26=9;
            switch ( input.LA(1) ) {
            case KEYWORD_28:
                {
                alt26=1;
                }
                break;
            case KEYWORD_12:
                {
                alt26=2;
                }
                break;
            case KEYWORD_9:
                {
                alt26=3;
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
                alt26=4;
                }
                break;
            case KEYWORD_89:
            case KEYWORD_87:
            case KEYWORD_88:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_82:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_65:
            case KEYWORD_66:
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
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_29:
            case KEYWORD_30:
            case KEYWORD_31:
                {
                alt26=5;
                }
                break;
            case RULE_ALPHA:
                {
                alt26=6;
                }
                break;
            case RULE_STRING:
                {
                alt26=7;
                }
                break;
            case RULE_INT:
                {
                alt26=8;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt26=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2486:1: rule__SchemeTextLiteral__Alternatives : ( ( KEYWORD_28 ) | ( KEYWORD_12 ) | ( KEYWORD_9 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( ruleIdentifier ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_ANY_OTHER ) );", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2491:1: ( KEYWORD_28 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2491:1: ( KEYWORD_28 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2492:1: KEYWORD_28
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__SchemeTextLiteral__Alternatives5502); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2499:6: ( KEYWORD_12 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2499:6: ( KEYWORD_12 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2500:1: KEYWORD_12
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__SchemeTextLiteral__Alternatives5522); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2507:6: ( KEYWORD_9 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2507:6: ( KEYWORD_9 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2508:1: KEYWORD_9
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getHyphenMinusKeyword_2()); 
                    }
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__SchemeTextLiteral__Alternatives5542); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getHyphenMinusKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2515:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2515:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2516:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSpecialCharacterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiteral__Alternatives5561);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2521:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2521:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2522:1: ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSpecialCommandNameParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_rule__SchemeTextLiteral__Alternatives5578);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2527:6: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2527:6: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2528:1: ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getIdentifierParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rule__SchemeTextLiteral__Alternatives5595);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2533:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2533:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2534:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSTRINGTerminalRuleCall_6()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SchemeTextLiteral__Alternatives5612); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getSTRINGTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2539:6: ( RULE_INT )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2539:6: ( RULE_INT )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2540:1: RULE_INT
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getINTTerminalRuleCall_7()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SchemeTextLiteral__Alternatives5629); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getINTTerminalRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2545:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2545:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2546:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getANY_OTHERTerminalRuleCall_8()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiteral__Alternatives5646); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getANY_OTHERTerminalRuleCall_8()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2556:1: rule__SchemeMarkupCommand__CommandAlternatives_1_0 : ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) );
    public final void rule__SchemeMarkupCommand__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2560:1: ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ALPHA) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=KEYWORD_89 && LA27_0<=KEYWORD_31)) ) {
                alt27=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2556:1: rule__SchemeMarkupCommand__CommandAlternatives_1_0 : ( ( ruleIdentifier ) | ( ruleSpecialCommandName ) );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2561:1: ( ruleIdentifier )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2561:1: ( ruleIdentifier )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2562:1: ruleIdentifier
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeMarkupCommandAccess().getCommandIdentifierParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05678);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2567:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2567:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2568:1: ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeMarkupCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05695);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2580:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2584:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2585:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05725);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05728);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2592:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2596:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2597:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2597:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2598:1: ( rule__Assignment__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2599:1: ( rule__Assignment__NameAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2599:2: rule__Assignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl5755);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2609:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2613:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2614:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15785);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__15788);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2621:1: rule__Assignment__Group__1__Impl : ( KEYWORD_12 ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2625:1: ( ( KEYWORD_12 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2626:1: ( KEYWORD_12 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2626:1: ( KEYWORD_12 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2627:1: KEYWORD_12
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__Assignment__Group__1__Impl5816); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2640:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2644:1: ( rule__Assignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2645:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__25847);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2651:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2655:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2656:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2656:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2657:1: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2658:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2658:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl5874);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2674:1: rule__PropertyAssignment__Group__0 : rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 ;
    public final void rule__PropertyAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2678:1: ( rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2679:2: rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__05910);
            rule__PropertyAssignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__05913);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2686:1: rule__PropertyAssignment__Group__0__Impl : ( ( rule__PropertyAssignment__IdAssignment_0 ) ) ;
    public final void rule__PropertyAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2690:1: ( ( ( rule__PropertyAssignment__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2691:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2691:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2692:1: ( rule__PropertyAssignment__IdAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2693:1: ( rule__PropertyAssignment__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2693:2: rule__PropertyAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl5940);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2703:1: rule__PropertyAssignment__Group__1 : rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 ;
    public final void rule__PropertyAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2707:1: ( rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2708:2: rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__15970);
            rule__PropertyAssignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__15973);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2715:1: rule__PropertyAssignment__Group__1__Impl : ( KEYWORD_12 ) ;
    public final void rule__PropertyAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2719:1: ( ( KEYWORD_12 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2720:1: ( KEYWORD_12 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2720:1: ( KEYWORD_12 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2721:1: KEYWORD_12
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__PropertyAssignment__Group__1__Impl6001); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2734:1: rule__PropertyAssignment__Group__2 : rule__PropertyAssignment__Group__2__Impl ;
    public final void rule__PropertyAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2738:1: ( rule__PropertyAssignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2739:2: rule__PropertyAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__26032);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2745:1: rule__PropertyAssignment__Group__2__Impl : ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) ;
    public final void rule__PropertyAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2749:1: ( ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2750:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2750:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2751:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2752:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2752:2: rule__PropertyAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl6059);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2768:1: rule__SimpleBlock__Group__0 : rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 ;
    public final void rule__SimpleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2772:1: ( rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2773:2: rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__06095);
            rule__SimpleBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__06098);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2780:1: rule__SimpleBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimpleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2784:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2785:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2785:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2786:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2787:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2789:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2799:1: rule__SimpleBlock__Group__1 : rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 ;
    public final void rule__SimpleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2803:1: ( rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2804:2: rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__16156);
            rule__SimpleBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__16159);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2811:1: rule__SimpleBlock__Group__1__Impl : ( KEYWORD_18 ) ;
    public final void rule__SimpleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2815:1: ( ( KEYWORD_18 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2816:1: ( KEYWORD_18 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2816:1: ( KEYWORD_18 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2817:1: KEYWORD_18
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__SimpleBlock__Group__1__Impl6187); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2830:1: rule__SimpleBlock__Group__2 : rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 ;
    public final void rule__SimpleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2834:1: ( rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2835:2: rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__26218);
            rule__SimpleBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__26221);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2842:1: rule__SimpleBlock__Group__2__Impl : ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimpleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2846:1: ( ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2847:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2847:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2848:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2849:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=KEYWORD_89 && LA28_0<=KEYWORD_31)||LA28_0==KEYWORD_26||(LA28_0>=KEYWORD_28 && LA28_0<=KEYWORD_2)||(LA28_0>=KEYWORD_4 && LA28_0<=KEYWORD_16)||LA28_0==KEYWORD_18||(LA28_0>=KEYWORD_20 && LA28_0<=RULE_ALPHA)||LA28_0==RULE_ANY_OTHER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2849:2: rule__SimpleBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl6248);
            	    rule__SimpleBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2859:1: rule__SimpleBlock__Group__3 : rule__SimpleBlock__Group__3__Impl ;
    public final void rule__SimpleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2863:1: ( rule__SimpleBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2864:2: rule__SimpleBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__36279);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2870:1: rule__SimpleBlock__Group__3__Impl : ( KEYWORD_19 ) ;
    public final void rule__SimpleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2874:1: ( ( KEYWORD_19 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2875:1: ( KEYWORD_19 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2875:1: ( KEYWORD_19 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2876:1: KEYWORD_19
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__SimpleBlock__Group__3__Impl6307); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2897:1: rule__SimultaneousBlock__Group__0 : rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 ;
    public final void rule__SimultaneousBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2901:1: ( rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2902:2: rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__06346);
            rule__SimultaneousBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__06349);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2909:1: rule__SimultaneousBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimultaneousBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2913:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2914:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2914:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2915:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2916:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2918:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2928:1: rule__SimultaneousBlock__Group__1 : rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 ;
    public final void rule__SimultaneousBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2932:1: ( rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2933:2: rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__16407);
            rule__SimultaneousBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__16410);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2940:1: rule__SimultaneousBlock__Group__1__Impl : ( KEYWORD_26 ) ;
    public final void rule__SimultaneousBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2944:1: ( ( KEYWORD_26 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2945:1: ( KEYWORD_26 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2945:1: ( KEYWORD_26 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2946:1: KEYWORD_26
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
            }
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__SimultaneousBlock__Group__1__Impl6438); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2959:1: rule__SimultaneousBlock__Group__2 : rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 ;
    public final void rule__SimultaneousBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2963:1: ( rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2964:2: rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__26469);
            rule__SimultaneousBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__26472);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2971:1: rule__SimultaneousBlock__Group__2__Impl : ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimultaneousBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2975:1: ( ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2976:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2976:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2977:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2978:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=KEYWORD_89 && LA29_0<=KEYWORD_31)||LA29_0==KEYWORD_26||(LA29_0>=KEYWORD_28 && LA29_0<=KEYWORD_2)||(LA29_0>=KEYWORD_4 && LA29_0<=KEYWORD_16)||LA29_0==KEYWORD_18||(LA29_0>=KEYWORD_20 && LA29_0<=RULE_ALPHA)||LA29_0==RULE_ANY_OTHER) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2978:2: rule__SimultaneousBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl6499);
            	    rule__SimultaneousBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2988:1: rule__SimultaneousBlock__Group__3 : rule__SimultaneousBlock__Group__3__Impl ;
    public final void rule__SimultaneousBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2992:1: ( rule__SimultaneousBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2993:2: rule__SimultaneousBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__36530);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2999:1: rule__SimultaneousBlock__Group__3__Impl : ( KEYWORD_27 ) ;
    public final void rule__SimultaneousBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3003:1: ( ( KEYWORD_27 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3004:1: ( KEYWORD_27 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3004:1: ( KEYWORD_27 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3005:1: KEYWORD_27
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            }
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__SimultaneousBlock__Group__3__Impl6558); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3026:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3030:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3031:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06597);
            rule__Include__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06600);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3038:1: rule__Include__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3042:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3043:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3043:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3044:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Include__Group__0__Impl6628); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3057:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3061:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3062:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16659);
            rule__Include__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16662);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3069:1: rule__Include__Group__1__Impl : ( KEYWORD_64 ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3073:1: ( ( KEYWORD_64 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3074:1: ( KEYWORD_64 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3074:1: ( KEYWORD_64 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3075:1: KEYWORD_64
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeKeyword_1()); 
            }
            match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rule__Include__Group__1__Impl6690); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3088:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3092:1: ( rule__Include__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3093:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26721);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3099:1: rule__Include__Group__2__Impl : ( ( rule__Include__ImportURIAssignment_2 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3103:1: ( ( ( rule__Include__ImportURIAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3104:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3104:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3105:1: ( rule__Include__ImportURIAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURIAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3106:1: ( rule__Include__ImportURIAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3106:2: rule__Include__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl6748);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3122:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3126:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3127:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__06784);
            rule__Version__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06787);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3134:1: rule__Version__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3138:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3139:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3139:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3140:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Version__Group__0__Impl6815); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3153:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3157:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3158:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__16846);
            rule__Version__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__2_in_rule__Version__Group__16849);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3165:1: rule__Version__Group__1__Impl : ( KEYWORD_66 ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3169:1: ( ( KEYWORD_66 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3170:1: ( KEYWORD_66 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3170:1: ( KEYWORD_66 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3171:1: KEYWORD_66
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
            }
            match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_rule__Version__Group__1__Impl6877); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3184:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3188:1: ( rule__Version__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3189:2: rule__Version__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__26908);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3195:1: rule__Version__Group__2__Impl : ( ( rule__Version__VersionAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3199:1: ( ( ( rule__Version__VersionAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3200:1: ( ( rule__Version__VersionAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3200:1: ( ( rule__Version__VersionAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3201:1: ( rule__Version__VersionAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3202:1: ( rule__Version__VersionAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3202:2: rule__Version__VersionAssignment_2
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_2_in_rule__Version__Group__2__Impl6935);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3218:1: rule__Markup__Group__0 : rule__Markup__Group__0__Impl rule__Markup__Group__1 ;
    public final void rule__Markup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3222:1: ( rule__Markup__Group__0__Impl rule__Markup__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3223:2: rule__Markup__Group__0__Impl rule__Markup__Group__1
            {
            pushFollow(FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__06971);
            rule__Markup__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__06974);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3230:1: rule__Markup__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Markup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3234:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3235:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3235:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3236:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Markup__Group__0__Impl7002); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3249:1: rule__Markup__Group__1 : rule__Markup__Group__1__Impl rule__Markup__Group__2 ;
    public final void rule__Markup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3253:1: ( rule__Markup__Group__1__Impl rule__Markup__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3254:2: rule__Markup__Group__1__Impl rule__Markup__Group__2
            {
            pushFollow(FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__17033);
            rule__Markup__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__2_in_rule__Markup__Group__17036);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3261:1: rule__Markup__Group__1__Impl : ( KEYWORD_55 ) ;
    public final void rule__Markup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3265:1: ( ( KEYWORD_55 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3266:1: ( KEYWORD_55 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3266:1: ( KEYWORD_55 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3267:1: KEYWORD_55
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getMarkupKeyword_1()); 
            }
            match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_rule__Markup__Group__1__Impl7064); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3280:1: rule__Markup__Group__2 : rule__Markup__Group__2__Impl ;
    public final void rule__Markup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3284:1: ( rule__Markup__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3285:2: rule__Markup__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Markup__Group__2__Impl_in_rule__Markup__Group__27095);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3291:1: rule__Markup__Group__2__Impl : ( ( rule__Markup__BodyAssignment_2 ) ) ;
    public final void rule__Markup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3295:1: ( ( ( rule__Markup__BodyAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3296:1: ( ( rule__Markup__BodyAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3296:1: ( ( rule__Markup__BodyAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3297:1: ( rule__Markup__BodyAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBodyAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3298:1: ( rule__Markup__BodyAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3298:2: rule__Markup__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Markup__BodyAssignment_2_in_rule__Markup__Group__2__Impl7122);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3314:1: rule__MarkupLines__Group__0 : rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1 ;
    public final void rule__MarkupLines__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3318:1: ( rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3319:2: rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__0__Impl_in_rule__MarkupLines__Group__07158);
            rule__MarkupLines__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupLines__Group__1_in_rule__MarkupLines__Group__07161);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3326:1: rule__MarkupLines__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__MarkupLines__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3330:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3331:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3331:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3332:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__MarkupLines__Group__0__Impl7189); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3345:1: rule__MarkupLines__Group__1 : rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2 ;
    public final void rule__MarkupLines__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3349:1: ( rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3350:2: rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__1__Impl_in_rule__MarkupLines__Group__17220);
            rule__MarkupLines__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupLines__Group__2_in_rule__MarkupLines__Group__17223);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3357:1: rule__MarkupLines__Group__1__Impl : ( KEYWORD_84 ) ;
    public final void rule__MarkupLines__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3361:1: ( ( KEYWORD_84 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3362:1: ( KEYWORD_84 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3362:1: ( KEYWORD_84 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3363:1: KEYWORD_84
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getMarkuplinesKeyword_1()); 
            }
            match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_rule__MarkupLines__Group__1__Impl7251); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3376:1: rule__MarkupLines__Group__2 : rule__MarkupLines__Group__2__Impl ;
    public final void rule__MarkupLines__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3380:1: ( rule__MarkupLines__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3381:2: rule__MarkupLines__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__2__Impl_in_rule__MarkupLines__Group__27282);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3387:1: rule__MarkupLines__Group__2__Impl : ( ( rule__MarkupLines__BodyAssignment_2 ) ) ;
    public final void rule__MarkupLines__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3391:1: ( ( ( rule__MarkupLines__BodyAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3392:1: ( ( rule__MarkupLines__BodyAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3392:1: ( ( rule__MarkupLines__BodyAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3393:1: ( rule__MarkupLines__BodyAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getBodyAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3394:1: ( rule__MarkupLines__BodyAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3394:2: rule__MarkupLines__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__MarkupLines__BodyAssignment_2_in_rule__MarkupLines__Group__2__Impl7309);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3410:1: rule__MarkupBody__Group__0 : rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1 ;
    public final void rule__MarkupBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3414:1: ( rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3415:2: rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__0__Impl_in_rule__MarkupBody__Group__07345);
            rule__MarkupBody__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBody__Group__1_in_rule__MarkupBody__Group__07348);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3422:1: rule__MarkupBody__Group__0__Impl : ( () ) ;
    public final void rule__MarkupBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3426:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3427:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3427:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3428:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getMarkupBodyAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3429:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3431:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3441:1: rule__MarkupBody__Group__1 : rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2 ;
    public final void rule__MarkupBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3445:1: ( rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3446:2: rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__1__Impl_in_rule__MarkupBody__Group__17406);
            rule__MarkupBody__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBody__Group__2_in_rule__MarkupBody__Group__17409);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3453:1: rule__MarkupBody__Group__1__Impl : ( ( rule__MarkupBody__CommandAssignment_1 )* ) ;
    public final void rule__MarkupBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3457:1: ( ( ( rule__MarkupBody__CommandAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3458:1: ( ( rule__MarkupBody__CommandAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3458:1: ( ( rule__MarkupBody__CommandAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3459:1: ( rule__MarkupBody__CommandAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3460:1: ( rule__MarkupBody__CommandAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==KEYWORD_15) ) {
                    int LA30_5 = input.LA(2);

                    if ( (synpred124()) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==KEYWORD_2) ) {
                    int LA30_7 = input.LA(2);

                    if ( (synpred124()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3460:2: rule__MarkupBody__CommandAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__MarkupBody__CommandAssignment_1_in_rule__MarkupBody__Group__1__Impl7436);
            	    rule__MarkupBody__CommandAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3470:1: rule__MarkupBody__Group__2 : rule__MarkupBody__Group__2__Impl ;
    public final void rule__MarkupBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3474:1: ( rule__MarkupBody__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3475:2: rule__MarkupBody__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__2__Impl_in_rule__MarkupBody__Group__27467);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3481:1: rule__MarkupBody__Group__2__Impl : ( ( rule__MarkupBody__BlockAssignment_2 )? ) ;
    public final void rule__MarkupBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3485:1: ( ( ( rule__MarkupBody__BlockAssignment_2 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3486:1: ( ( rule__MarkupBody__BlockAssignment_2 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3486:1: ( ( rule__MarkupBody__BlockAssignment_2 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3487:1: ( rule__MarkupBody__BlockAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getBlockAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3488:1: ( rule__MarkupBody__BlockAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_18) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred125()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3488:2: rule__MarkupBody__BlockAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MarkupBody__BlockAssignment_2_in_rule__MarkupBody__Group__2__Impl7494);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3504:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3508:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3509:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__07531);
            rule__Context__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__07534);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3516:1: rule__Context__Group__0__Impl : ( () ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3520:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3521:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3521:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3522:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getContextAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3523:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3525:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3535:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3539:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3540:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__17592);
            rule__Context__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__17595);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3547:1: rule__Context__Group__1__Impl : ( KEYWORD_15 ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3551:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3552:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3552:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3553:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getReverseSolidusKeyword_1()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Context__Group__1__Impl7623); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3566:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3570:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3571:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__27654);
            rule__Context__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__27657);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3578:1: rule__Context__Group__2__Impl : ( KEYWORD_61 ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3582:1: ( ( KEYWORD_61 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3583:1: ( KEYWORD_61 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3583:1: ( KEYWORD_61 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3584:1: KEYWORD_61
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getContextKeyword_2()); 
            }
            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_rule__Context__Group__2__Impl7685); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3597:1: rule__Context__Group__3 : rule__Context__Group__3__Impl ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3601:1: ( rule__Context__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3602:2: rule__Context__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__37716);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3608:1: rule__Context__Group__3__Impl : ( ( rule__Context__BlockAssignment_3 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3612:1: ( ( ( rule__Context__BlockAssignment_3 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3613:1: ( ( rule__Context__BlockAssignment_3 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3613:1: ( ( rule__Context__BlockAssignment_3 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3614:1: ( rule__Context__BlockAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getBlockAssignment_3()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3615:1: ( rule__Context__BlockAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_18) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred126()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3615:2: rule__Context__BlockAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Context__BlockAssignment_3_in_rule__Context__Group__3__Impl7743);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3633:1: rule__Other__Group__0 : rule__Other__Group__0__Impl rule__Other__Group__1 ;
    public final void rule__Other__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3637:1: ( rule__Other__Group__0__Impl rule__Other__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3638:2: rule__Other__Group__0__Impl rule__Other__Group__1
            {
            pushFollow(FOLLOW_rule__Other__Group__0__Impl_in_rule__Other__Group__07782);
            rule__Other__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Other__Group__1_in_rule__Other__Group__07785);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3645:1: rule__Other__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Other__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3649:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3650:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3650:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3651:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Other__Group__0__Impl7813); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3664:1: rule__Other__Group__1 : rule__Other__Group__1__Impl ;
    public final void rule__Other__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3668:1: ( rule__Other__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3669:2: rule__Other__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Other__Group__1__Impl_in_rule__Other__Group__17844);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3675:1: rule__Other__Group__1__Impl : ( ( rule__Other__KeywordAssignment_1 ) ) ;
    public final void rule__Other__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3679:1: ( ( ( rule__Other__KeywordAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3680:1: ( ( rule__Other__KeywordAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3680:1: ( ( rule__Other__KeywordAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3681:1: ( rule__Other__KeywordAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getKeywordAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3682:1: ( rule__Other__KeywordAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3682:2: rule__Other__KeywordAssignment_1
            {
            pushFollow(FOLLOW_rule__Other__KeywordAssignment_1_in_rule__Other__Group__1__Impl7871);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3696:1: rule__UnparsedBlock__Group__0 : rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1 ;
    public final void rule__UnparsedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3700:1: ( rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3701:2: rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__0__Impl_in_rule__UnparsedBlock__Group__07905);
            rule__UnparsedBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__1_in_rule__UnparsedBlock__Group__07908);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3708:1: rule__UnparsedBlock__Group__0__Impl : ( () ) ;
    public final void rule__UnparsedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3712:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3713:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3713:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3714:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getUnparsedBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3715:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3717:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3727:1: rule__UnparsedBlock__Group__1 : rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2 ;
    public final void rule__UnparsedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3731:1: ( rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3732:2: rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__1__Impl_in_rule__UnparsedBlock__Group__17966);
            rule__UnparsedBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__2_in_rule__UnparsedBlock__Group__17969);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3739:1: rule__UnparsedBlock__Group__1__Impl : ( KEYWORD_18 ) ;
    public final void rule__UnparsedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3743:1: ( ( KEYWORD_18 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3744:1: ( KEYWORD_18 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3744:1: ( KEYWORD_18 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3745:1: KEYWORD_18
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__UnparsedBlock__Group__1__Impl7997); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3758:1: rule__UnparsedBlock__Group__2 : rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3 ;
    public final void rule__UnparsedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3762:1: ( rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3763:2: rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__2__Impl_in_rule__UnparsedBlock__Group__28028);
            rule__UnparsedBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__3_in_rule__UnparsedBlock__Group__28031);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3770:1: rule__UnparsedBlock__Group__2__Impl : ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__UnparsedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3774:1: ( ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3775:1: ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3775:1: ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3776:1: ( rule__UnparsedBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3777:1: ( rule__UnparsedBlock__ExpressionsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=KEYWORD_89 && LA33_0<=KEYWORD_31)||(LA33_0>=KEYWORD_28 && LA33_0<=KEYWORD_2)||(LA33_0>=KEYWORD_4 && LA33_0<=KEYWORD_16)||LA33_0==KEYWORD_18||(LA33_0>=KEYWORD_20 && LA33_0<=RULE_ALPHA)||LA33_0==RULE_ANY_OTHER) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3777:2: rule__UnparsedBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__UnparsedBlock__ExpressionsAssignment_2_in_rule__UnparsedBlock__Group__2__Impl8058);
            	    rule__UnparsedBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3787:1: rule__UnparsedBlock__Group__3 : rule__UnparsedBlock__Group__3__Impl ;
    public final void rule__UnparsedBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3791:1: ( rule__UnparsedBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3792:2: rule__UnparsedBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__3__Impl_in_rule__UnparsedBlock__Group__38089);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3798:1: rule__UnparsedBlock__Group__3__Impl : ( KEYWORD_19 ) ;
    public final void rule__UnparsedBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3802:1: ( ( KEYWORD_19 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3803:1: ( KEYWORD_19 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3803:1: ( KEYWORD_19 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3804:1: KEYWORD_19
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__UnparsedBlock__Group__3__Impl8117); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3825:1: rule__UnparsedCommand__Group__0 : rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1 ;
    public final void rule__UnparsedCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3829:1: ( rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3830:2: rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__0__Impl_in_rule__UnparsedCommand__Group__08156);
            rule__UnparsedCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__1_in_rule__UnparsedCommand__Group__08159);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3837:1: rule__UnparsedCommand__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__UnparsedCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3841:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3842:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3842:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3843:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__UnparsedCommand__Group__0__Impl8187); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3856:1: rule__UnparsedCommand__Group__1 : rule__UnparsedCommand__Group__1__Impl ;
    public final void rule__UnparsedCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3860:1: ( rule__UnparsedCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3861:2: rule__UnparsedCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__1__Impl_in_rule__UnparsedCommand__Group__18218);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3867:1: rule__UnparsedCommand__Group__1__Impl : ( ( rule__UnparsedCommand__CommandAssignment_1 ) ) ;
    public final void rule__UnparsedCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3871:1: ( ( ( rule__UnparsedCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3872:1: ( ( rule__UnparsedCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3872:1: ( ( rule__UnparsedCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3873:1: ( rule__UnparsedCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3874:1: ( rule__UnparsedCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3874:2: rule__UnparsedCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__CommandAssignment_1_in_rule__UnparsedCommand__Group__1__Impl8245);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3888:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3892:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3893:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08279);
            rule__Reference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08282);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3900:1: rule__Reference__Group__0__Impl : ( KEYWORD_15 ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3904:1: ( ( KEYWORD_15 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3905:1: ( KEYWORD_15 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3905:1: ( KEYWORD_15 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3906:1: KEYWORD_15
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Reference__Group__0__Impl8310); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3919:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3923:1: ( rule__Reference__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3924:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18341);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3930:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__AssignmentAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3934:1: ( ( ( rule__Reference__AssignmentAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3935:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3935:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3936:1: ( rule__Reference__AssignmentAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3937:1: ( rule__Reference__AssignmentAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3937:2: rule__Reference__AssignmentAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl8368);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3951:1: rule__Scheme__Group__0 : rule__Scheme__Group__0__Impl rule__Scheme__Group__1 ;
    public final void rule__Scheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3955:1: ( rule__Scheme__Group__0__Impl rule__Scheme__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3956:2: rule__Scheme__Group__0__Impl rule__Scheme__Group__1
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__08402);
            rule__Scheme__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__08405);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3963:1: rule__Scheme__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__Scheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3967:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3968:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3968:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3969:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl8433); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3982:1: rule__Scheme__Group__1 : rule__Scheme__Group__1__Impl ;
    public final void rule__Scheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3986:1: ( rule__Scheme__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3987:2: rule__Scheme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__18464);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3993:1: rule__Scheme__Group__1__Impl : ( ( rule__Scheme__ValueAssignment_1 ) ) ;
    public final void rule__Scheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3997:1: ( ( ( rule__Scheme__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3998:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3998:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3999:1: ( rule__Scheme__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4000:1: ( rule__Scheme__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4000:2: rule__Scheme__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl8491);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4014:1: rule__SchemeExpression__Group__0 : rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 ;
    public final void rule__SchemeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4018:1: ( rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4019:2: rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__08525);
            rule__SchemeExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__08528);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4026:1: rule__SchemeExpression__Group__0__Impl : ( ( rule__SchemeExpression__Alternatives_0 )? ) ;
    public final void rule__SchemeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4030:1: ( ( ( rule__SchemeExpression__Alternatives_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4031:1: ( ( rule__SchemeExpression__Alternatives_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4031:1: ( ( rule__SchemeExpression__Alternatives_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4032:1: ( rule__SchemeExpression__Alternatives_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4033:1: ( rule__SchemeExpression__Alternatives_0 )?
            int alt34=2;
            switch ( input.LA(1) ) {
                case KEYWORD_3:
                case KEYWORD_4:
                case KEYWORD_8:
                case KEYWORD_17:
                    {
                    alt34=1;
                    }
                    break;
                case KEYWORD_2:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_5:
                    {
                    int LA34_3 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_23:
                    {
                    int LA34_4 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_22:
                    {
                    int LA34_5 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_28:
                    {
                    int LA34_6 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_12:
                    {
                    int LA34_7 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_9:
                    {
                    int LA34_8 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_1:
                    {
                    int LA34_9 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_7:
                    {
                    int LA34_10 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_11:
                    {
                    int LA34_11 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_13:
                    {
                    int LA34_12 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_14:
                    {
                    int LA34_13 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_16:
                    {
                    int LA34_14 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_20:
                    {
                    int LA34_15 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_64:
                    {
                    int LA34_16 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_66:
                    {
                    int LA34_17 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_55:
                    {
                    int LA34_18 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_84:
                    {
                    int LA34_19 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_61:
                    {
                    int LA34_20 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_60:
                    {
                    int LA34_21 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_75:
                    {
                    int LA34_22 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_42:
                    {
                    int LA34_23 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_82:
                    {
                    int LA34_24 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_32:
                    {
                    int LA34_25 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_67:
                    {
                    int LA34_26 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_49:
                    {
                    int LA34_27 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_76:
                    {
                    int LA34_28 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_50:
                    {
                    int LA34_29 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_68:
                    {
                    int LA34_30 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_62:
                    {
                    int LA34_31 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_85:
                    {
                    int LA34_32 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_51:
                    {
                    int LA34_33 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_83:
                    {
                    int LA34_34 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_69:
                    {
                    int LA34_35 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_43:
                    {
                    int LA34_36 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_80:
                    {
                    int LA34_37 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_63:
                    {
                    int LA34_38 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_89:
                    {
                    int LA34_39 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_52:
                    {
                    int LA34_40 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_29:
                    {
                    int LA34_41 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_53:
                    {
                    int LA34_42 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_77:
                    {
                    int LA34_43 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_54:
                    {
                    int LA34_44 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_70:
                    {
                    int LA34_45 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_78:
                    {
                    int LA34_46 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_33:
                    {
                    int LA34_47 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_34:
                    {
                    int LA34_48 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_35:
                    {
                    int LA34_49 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_30:
                    {
                    int LA34_50 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_71:
                    {
                    int LA34_51 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_72:
                    {
                    int LA34_52 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_56:
                    {
                    int LA34_53 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_36:
                    {
                    int LA34_54 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_73:
                    {
                    int LA34_55 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_44:
                    {
                    int LA34_56 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_65:
                    {
                    int LA34_57 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_74:
                    {
                    int LA34_58 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_57:
                    {
                    int LA34_59 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_58:
                    {
                    int LA34_60 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_37:
                    {
                    int LA34_61 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_59:
                    {
                    int LA34_62 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_45:
                    {
                    int LA34_63 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_81:
                    {
                    int LA34_64 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_31:
                    {
                    int LA34_65 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_86:
                    {
                    int LA34_66 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_38:
                    {
                    int LA34_67 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_87:
                    {
                    int LA34_68 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_88:
                    {
                    int LA34_69 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_46:
                    {
                    int LA34_70 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_39:
                    {
                    int LA34_71 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_47:
                    {
                    int LA34_72 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_79:
                    {
                    int LA34_73 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_40:
                    {
                    int LA34_74 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_48:
                    {
                    int LA34_75 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_41:
                    {
                    int LA34_76 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case RULE_ALPHA:
                    {
                    int LA34_77 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA34_78 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA34_79 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    int LA34_80 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
                case KEYWORD_21:
                    {
                    int LA34_81 = input.LA(2);

                    if ( (synpred128()) ) {
                        alt34=1;
                    }
                    }
                    break;
            }

            switch (alt34) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4033:2: rule__SchemeExpression__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl8555);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4043:1: rule__SchemeExpression__Group__1 : rule__SchemeExpression__Group__1__Impl ;
    public final void rule__SchemeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4047:1: ( rule__SchemeExpression__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4048:2: rule__SchemeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__18586);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4054:1: rule__SchemeExpression__Group__1__Impl : ( ( rule__SchemeExpression__ValueAssignment_1 ) ) ;
    public final void rule__SchemeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4058:1: ( ( ( rule__SchemeExpression__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4059:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4059:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4060:1: ( rule__SchemeExpression__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4061:1: ( rule__SchemeExpression__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4061:2: rule__SchemeExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl8613);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4075:1: rule__SchemeList__Group__0 : rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 ;
    public final void rule__SchemeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4079:1: ( rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4080:2: rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__08647);
            rule__SchemeList__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__08650);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4087:1: rule__SchemeList__Group__0__Impl : ( () ) ;
    public final void rule__SchemeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4091:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4092:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4092:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4093:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4094:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4096:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4106:1: rule__SchemeList__Group__1 : rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 ;
    public final void rule__SchemeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4110:1: ( rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4111:2: rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__18708);
            rule__SchemeList__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__18711);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4118:1: rule__SchemeList__Group__1__Impl : ( ( rule__SchemeList__VectorAssignment_1 )? ) ;
    public final void rule__SchemeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4122:1: ( ( ( rule__SchemeList__VectorAssignment_1 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4123:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4123:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4124:1: ( rule__SchemeList__VectorAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4125:1: ( rule__SchemeList__VectorAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_2) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4125:2: rule__SchemeList__VectorAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl8738);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4135:1: rule__SchemeList__Group__2 : rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 ;
    public final void rule__SchemeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4139:1: ( rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4140:2: rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__28769);
            rule__SchemeList__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__28772);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4147:1: rule__SchemeList__Group__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__SchemeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4151:1: ( ( KEYWORD_5 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4152:1: ( KEYWORD_5 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4152:1: ( KEYWORD_5 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4153:1: KEYWORD_5
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl8800); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4166:1: rule__SchemeList__Group__3 : rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 ;
    public final void rule__SchemeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4170:1: ( rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4171:2: rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__38831);
            rule__SchemeList__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__38834);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4178:1: rule__SchemeList__Group__3__Impl : ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) ;
    public final void rule__SchemeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4182:1: ( ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4183:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4183:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4184:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_3()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4185:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=KEYWORD_89 && LA36_0<=KEYWORD_23)||(LA36_0>=KEYWORD_28 && LA36_0<=KEYWORD_5)||(LA36_0>=KEYWORD_7 && LA36_0<=KEYWORD_9)||(LA36_0>=KEYWORD_11 && LA36_0<=KEYWORD_14)||(LA36_0>=KEYWORD_16 && LA36_0<=KEYWORD_17)||(LA36_0>=KEYWORD_20 && LA36_0<=RULE_ALPHA)||LA36_0==RULE_ANY_OTHER) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4185:2: rule__SchemeList__ExpressionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl8861);
            	    rule__SchemeList__ExpressionsAssignment_3();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4195:1: rule__SchemeList__Group__4 : rule__SchemeList__Group__4__Impl ;
    public final void rule__SchemeList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4199:1: ( rule__SchemeList__Group__4__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4200:2: rule__SchemeList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__48892);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4206:1: rule__SchemeList__Group__4__Impl : ( KEYWORD_6 ) ;
    public final void rule__SchemeList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4210:1: ( ( KEYWORD_6 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4211:1: ( KEYWORD_6 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4211:1: ( KEYWORD_6 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4212:1: KEYWORD_6
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl8920); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4235:1: rule__SchemeBlock__Group__0 : rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 ;
    public final void rule__SchemeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4239:1: ( rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4240:2: rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__08961);
            rule__SchemeBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__08964);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4247:1: rule__SchemeBlock__Group__0__Impl : ( KEYWORD_23 ) ;
    public final void rule__SchemeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4251:1: ( ( KEYWORD_23 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4252:1: ( KEYWORD_23 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4252:1: ( KEYWORD_23 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4253:1: KEYWORD_23
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 
            }
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__SchemeBlock__Group__0__Impl8992); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4266:1: rule__SchemeBlock__Group__1 : rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 ;
    public final void rule__SchemeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4270:1: ( rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4271:2: rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__19023);
            rule__SchemeBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__19026);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4278:1: rule__SchemeBlock__Group__1__Impl : ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__SchemeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4282:1: ( ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4283:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4283:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4284:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4284:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4285:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4286:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4286:2: rule__SchemeBlock__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl9055);
            rule__SchemeBlock__ExpressionsAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }

            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4289:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4290:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4291:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=KEYWORD_89 && LA37_0<=KEYWORD_31)||LA37_0==KEYWORD_26||(LA37_0>=KEYWORD_28 && LA37_0<=KEYWORD_2)||(LA37_0>=KEYWORD_4 && LA37_0<=KEYWORD_16)||LA37_0==KEYWORD_18||(LA37_0>=KEYWORD_20 && LA37_0<=RULE_ALPHA)||LA37_0==RULE_ANY_OTHER) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4291:2: rule__SchemeBlock__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl9067);
            	    rule__SchemeBlock__ExpressionsAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4302:1: rule__SchemeBlock__Group__2 : rule__SchemeBlock__Group__2__Impl ;
    public final void rule__SchemeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4306:1: ( rule__SchemeBlock__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4307:2: rule__SchemeBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__29100);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4313:1: rule__SchemeBlock__Group__2__Impl : ( KEYWORD_24 ) ;
    public final void rule__SchemeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4317:1: ( ( KEYWORD_24 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4318:1: ( KEYWORD_24 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4318:1: ( KEYWORD_24 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4319:1: KEYWORD_24
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 
            }
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__SchemeBlock__Group__2__Impl9128); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4338:1: rule__SchemeCharacter__Group__0 : rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 ;
    public final void rule__SchemeCharacter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4342:1: ( rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4343:2: rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__09165);
            rule__SchemeCharacter__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__09168);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4350:1: rule__SchemeCharacter__Group__0__Impl : ( KEYWORD_22 ) ;
    public final void rule__SchemeCharacter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4354:1: ( ( KEYWORD_22 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4355:1: ( KEYWORD_22 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4355:1: ( KEYWORD_22 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4356:1: KEYWORD_22
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__SchemeCharacter__Group__0__Impl9196); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4369:1: rule__SchemeCharacter__Group__1 : rule__SchemeCharacter__Group__1__Impl ;
    public final void rule__SchemeCharacter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4373:1: ( rule__SchemeCharacter__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4374:2: rule__SchemeCharacter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__19227);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4380:1: rule__SchemeCharacter__Group__1__Impl : ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) ;
    public final void rule__SchemeCharacter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4384:1: ( ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4385:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4385:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4386:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4387:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4387:2: rule__SchemeCharacter__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl9254);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4401:1: rule__SchemeId__Group__0 : rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1 ;
    public final void rule__SchemeId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4405:1: ( rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4406:2: rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeId__Group__0__Impl_in_rule__SchemeId__Group__09288);
            rule__SchemeId__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeId__Group__1_in_rule__SchemeId__Group__09291);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4413:1: rule__SchemeId__Group__0__Impl : ( ruleSchemeTextLiteral ) ;
    public final void rule__SchemeId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4417:1: ( ( ruleSchemeTextLiteral ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4418:1: ( ruleSchemeTextLiteral )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4418:1: ( ruleSchemeTextLiteral )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4419:1: ruleSchemeTextLiteral
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group__0__Impl9318);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4430:1: rule__SchemeId__Group__1 : rule__SchemeId__Group__1__Impl ;
    public final void rule__SchemeId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4434:1: ( rule__SchemeId__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4435:2: rule__SchemeId__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeId__Group__1__Impl_in_rule__SchemeId__Group__19347);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4441:1: rule__SchemeId__Group__1__Impl : ( ( rule__SchemeId__Group_1__0 )* ) ;
    public final void rule__SchemeId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4445:1: ( ( ( rule__SchemeId__Group_1__0 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4446:1: ( ( rule__SchemeId__Group_1__0 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4446:1: ( ( rule__SchemeId__Group_1__0 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4447:1: ( rule__SchemeId__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getGroup_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4448:1: ( rule__SchemeId__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==KEYWORD_10) ) {
                    switch ( input.LA(2) ) {
                    case RULE_ALPHA:
                        {
                        int LA38_4 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA38_5 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_28:
                        {
                        int LA38_6 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_12:
                        {
                        int LA38_7 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_9:
                        {
                        int LA38_8 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_1:
                        {
                        int LA38_9 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_7:
                        {
                        int LA38_10 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_11:
                        {
                        int LA38_11 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_13:
                        {
                        int LA38_12 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_14:
                        {
                        int LA38_13 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_16:
                        {
                        int LA38_14 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_20:
                        {
                        int LA38_15 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_64:
                        {
                        int LA38_16 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_66:
                        {
                        int LA38_17 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_55:
                        {
                        int LA38_18 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_84:
                        {
                        int LA38_19 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_61:
                        {
                        int LA38_20 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_60:
                        {
                        int LA38_21 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_75:
                        {
                        int LA38_22 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_42:
                        {
                        int LA38_23 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_82:
                        {
                        int LA38_24 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_32:
                        {
                        int LA38_25 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_67:
                        {
                        int LA38_26 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_49:
                        {
                        int LA38_27 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_76:
                        {
                        int LA38_28 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_50:
                        {
                        int LA38_29 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_68:
                        {
                        int LA38_30 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_62:
                        {
                        int LA38_31 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_85:
                        {
                        int LA38_32 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_51:
                        {
                        int LA38_33 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_83:
                        {
                        int LA38_34 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_69:
                        {
                        int LA38_35 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_43:
                        {
                        int LA38_36 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_80:
                        {
                        int LA38_37 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_63:
                        {
                        int LA38_38 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_89:
                        {
                        int LA38_39 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_52:
                        {
                        int LA38_40 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_29:
                        {
                        int LA38_41 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_53:
                        {
                        int LA38_42 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_77:
                        {
                        int LA38_43 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_54:
                        {
                        int LA38_44 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_70:
                        {
                        int LA38_45 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_78:
                        {
                        int LA38_46 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_33:
                        {
                        int LA38_47 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_34:
                        {
                        int LA38_48 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_35:
                        {
                        int LA38_49 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_30:
                        {
                        int LA38_50 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_71:
                        {
                        int LA38_51 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_72:
                        {
                        int LA38_52 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_56:
                        {
                        int LA38_53 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_36:
                        {
                        int LA38_54 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_73:
                        {
                        int LA38_55 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_44:
                        {
                        int LA38_56 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_65:
                        {
                        int LA38_57 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_74:
                        {
                        int LA38_58 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_57:
                        {
                        int LA38_59 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_58:
                        {
                        int LA38_60 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_37:
                        {
                        int LA38_61 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_59:
                        {
                        int LA38_62 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_45:
                        {
                        int LA38_63 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_81:
                        {
                        int LA38_64 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_31:
                        {
                        int LA38_65 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_86:
                        {
                        int LA38_66 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_38:
                        {
                        int LA38_67 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_87:
                        {
                        int LA38_68 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_88:
                        {
                        int LA38_69 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_46:
                        {
                        int LA38_70 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_39:
                        {
                        int LA38_71 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_47:
                        {
                        int LA38_72 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_79:
                        {
                        int LA38_73 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_40:
                        {
                        int LA38_74 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_48:
                        {
                        int LA38_75 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case KEYWORD_41:
                        {
                        int LA38_76 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case RULE_INT:
                        {
                        int LA38_77 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;
                    case RULE_ANY_OTHER:
                        {
                        int LA38_78 = input.LA(3);

                        if ( (synpred132()) ) {
                            alt38=1;
                        }


                        }
                        break;

                    }

                }
                else if ( (LA38_0==KEYWORD_25) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4448:2: rule__SchemeId__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SchemeId__Group_1__0_in_rule__SchemeId__Group__1__Impl9374);
            	    rule__SchemeId__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4462:1: rule__SchemeId__Group_1__0 : rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1 ;
    public final void rule__SchemeId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4466:1: ( rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4467:2: rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1
            {
            pushFollow(FOLLOW_rule__SchemeId__Group_1__0__Impl_in_rule__SchemeId__Group_1__09409);
            rule__SchemeId__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeId__Group_1__1_in_rule__SchemeId__Group_1__09412);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4474:1: rule__SchemeId__Group_1__0__Impl : ( ( rule__SchemeId__Alternatives_1_0 ) ) ;
    public final void rule__SchemeId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4478:1: ( ( ( rule__SchemeId__Alternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4479:1: ( ( rule__SchemeId__Alternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4479:1: ( ( rule__SchemeId__Alternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4480:1: ( rule__SchemeId__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4481:1: ( rule__SchemeId__Alternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4481:2: rule__SchemeId__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeId__Alternatives_1_0_in_rule__SchemeId__Group_1__0__Impl9439);
            rule__SchemeId__Alternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeIdAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4491:1: rule__SchemeId__Group_1__1 : rule__SchemeId__Group_1__1__Impl ;
    public final void rule__SchemeId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4495:1: ( rule__SchemeId__Group_1__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4496:2: rule__SchemeId__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeId__Group_1__1__Impl_in_rule__SchemeId__Group_1__19469);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4502:1: rule__SchemeId__Group_1__1__Impl : ( ruleSchemeTextLiteral ) ;
    public final void rule__SchemeId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4506:1: ( ( ruleSchemeTextLiteral ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4507:1: ( ruleSchemeTextLiteral )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4507:1: ( ruleSchemeTextLiteral )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4508:1: ruleSchemeTextLiteral
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group_1__1__Impl9496);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4523:1: rule__SchemeNumber__Group__0 : rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 ;
    public final void rule__SchemeNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4527:1: ( rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4528:2: rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__09529);
            rule__SchemeNumber__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__09532);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4535:1: rule__SchemeNumber__Group__0__Impl : ( ( rule__SchemeNumber__RadixAssignment_0 )? ) ;
    public final void rule__SchemeNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4539:1: ( ( ( rule__SchemeNumber__RadixAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4540:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4540:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4541:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4542:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KEYWORD_2) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4542:2: rule__SchemeNumber__RadixAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl9559);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4552:1: rule__SchemeNumber__Group__1 : rule__SchemeNumber__Group__1__Impl ;
    public final void rule__SchemeNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4556:1: ( rule__SchemeNumber__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4557:2: rule__SchemeNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__19590);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4563:1: rule__SchemeNumber__Group__1__Impl : ( ( rule__SchemeNumber__ValueAssignment_1 ) ) ;
    public final void rule__SchemeNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4567:1: ( ( ( rule__SchemeNumber__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4568:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4568:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4569:1: ( rule__SchemeNumber__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4570:1: ( rule__SchemeNumber__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4570:2: rule__SchemeNumber__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl9617);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4584:1: rule__SchemeNumberRadix__Group__0 : rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 ;
    public final void rule__SchemeNumberRadix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4588:1: ( rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4589:2: rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__09651);
            rule__SchemeNumberRadix__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__09654);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4596:1: rule__SchemeNumberRadix__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__SchemeNumberRadix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4600:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4601:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4601:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4602:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl9682); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4615:1: rule__SchemeNumberRadix__Group__1 : rule__SchemeNumberRadix__Group__1__Impl ;
    public final void rule__SchemeNumberRadix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4619:1: ( rule__SchemeNumberRadix__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4620:2: rule__SchemeNumberRadix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__19713);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4626:1: rule__SchemeNumberRadix__Group__1__Impl : ( RULE_ALPHA ) ;
    public final void rule__SchemeNumberRadix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4630:1: ( ( RULE_ALPHA ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4631:1: ( RULE_ALPHA )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4631:1: ( RULE_ALPHA )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4632:1: RULE_ALPHA
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getALPHATerminalRuleCall_1()); 
            }
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__SchemeNumberRadix__Group__1__Impl9740); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4647:1: rule__SchemeMarkupCommand__Group__0 : rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 ;
    public final void rule__SchemeMarkupCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4651:1: ( rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4652:2: rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__09773);
            rule__SchemeMarkupCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__09776);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4659:1: rule__SchemeMarkupCommand__Group__0__Impl : ( KEYWORD_21 ) ;
    public final void rule__SchemeMarkupCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4663:1: ( ( KEYWORD_21 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4664:1: ( KEYWORD_21 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4664:1: ( KEYWORD_21 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4665:1: KEYWORD_21
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0()); 
            }
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__SchemeMarkupCommand__Group__0__Impl9804); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4678:1: rule__SchemeMarkupCommand__Group__1 : rule__SchemeMarkupCommand__Group__1__Impl ;
    public final void rule__SchemeMarkupCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4682:1: ( rule__SchemeMarkupCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4683:2: rule__SchemeMarkupCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__19835);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4689:1: rule__SchemeMarkupCommand__Group__1__Impl : ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) ;
    public final void rule__SchemeMarkupCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4693:1: ( ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4694:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4694:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4695:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4696:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4696:2: rule__SchemeMarkupCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl9862);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4710:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4714:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4715:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__09896);
            rule__Identifier__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__09899);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4722:1: rule__Identifier__Group__0__Impl : ( RULE_ALPHA ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4726:1: ( ( RULE_ALPHA ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4727:1: ( RULE_ALPHA )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4727:1: ( RULE_ALPHA )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4728:1: RULE_ALPHA
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_0()); 
            }
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Identifier__Group__0__Impl9926); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4739:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4743:1: ( rule__Identifier__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4744:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__19955);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4750:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Group_1__0 )* ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4754:1: ( ( ( rule__Identifier__Group_1__0 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4755:1: ( ( rule__Identifier__Group_1__0 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4755:1: ( ( rule__Identifier__Group_1__0 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4756:1: ( rule__Identifier__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getGroup_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4757:1: ( rule__Identifier__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==KEYWORD_9) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ALPHA) ) {
                        int LA40_3 = input.LA(3);

                        if ( (synpred134()) ) {
                            alt40=1;
                        }


                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4757:2: rule__Identifier__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl9982);
            	    rule__Identifier__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4771:1: rule__Identifier__Group_1__0 : rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 ;
    public final void rule__Identifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4775:1: ( rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4776:2: rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__010017);
            rule__Identifier__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__010020);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4783:1: rule__Identifier__Group_1__0__Impl : ( KEYWORD_9 ) ;
    public final void rule__Identifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4787:1: ( ( KEYWORD_9 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4788:1: ( KEYWORD_9 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4788:1: ( KEYWORD_9 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4789:1: KEYWORD_9
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getHyphenMinusKeyword_1_0()); 
            }
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__Identifier__Group_1__0__Impl10048); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4802:1: rule__Identifier__Group_1__1 : rule__Identifier__Group_1__1__Impl ;
    public final void rule__Identifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4806:1: ( rule__Identifier__Group_1__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4807:2: rule__Identifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__110079);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4813:1: rule__Identifier__Group_1__1__Impl : ( RULE_ALPHA ) ;
    public final void rule__Identifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4817:1: ( ( RULE_ALPHA ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4818:1: ( RULE_ALPHA )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4818:1: ( RULE_ALPHA )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4819:1: RULE_ALPHA
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_1_1()); 
            }
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Identifier__Group_1__1__Impl10106); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4834:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4838:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4839:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_rule__Boolean__Group__0__Impl_in_rule__Boolean__Group__010139);
            rule__Boolean__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Boolean__Group__1_in_rule__Boolean__Group__010142);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4846:1: rule__Boolean__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4850:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4851:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4851:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4852:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Boolean__Group__0__Impl10170); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4865:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4869:1: ( rule__Boolean__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4870:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Boolean__Group__1__Impl_in_rule__Boolean__Group__110201);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4876:1: rule__Boolean__Group__1__Impl : ( RULE_ALPHA ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4880:1: ( ( RULE_ALPHA ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4881:1: ( RULE_ALPHA )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4881:1: ( RULE_ALPHA )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4882:1: RULE_ALPHA
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getALPHATerminalRuleCall_1()); 
            }
            match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Boolean__Group__1__Impl10228); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4898:1: rule__LilyPond__ExpressionsAssignment : ( ruleToplevelExpression ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4902:1: ( ( ruleToplevelExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4903:1: ( ruleToplevelExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4903:1: ( ruleToplevelExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4904:1: ruleToplevelExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment10266);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4913:1: rule__Assignment__NameAssignment_0 : ( ( rule__Assignment__NameAlternatives_0_0 ) ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4917:1: ( ( ( rule__Assignment__NameAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4918:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4918:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4919:1: ( rule__Assignment__NameAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4920:1: ( rule__Assignment__NameAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4920:2: rule__Assignment__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_010297);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4929:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4933:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4934:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4934:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4935:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_210330);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4944:1: rule__PropertyAssignment__IdAssignment_0 : ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) ;
    public final void rule__PropertyAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4948:1: ( ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4949:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4949:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4950:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4951:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4951:2: rule__PropertyAssignment__IdAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_010361);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4960:1: rule__PropertyAssignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__PropertyAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4964:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4965:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4965:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4966:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_210394);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4975:1: rule__SimpleBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4979:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4980:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4980:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4981:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_210425);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4990:1: rule__SimultaneousBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimultaneousBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4994:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4995:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4995:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4996:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_210456);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5005:1: rule__Include__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5009:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5010:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5010:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5011:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_210487); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5020:1: rule__Version__VersionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Version__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5024:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5025:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5025:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5026:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_210518); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5035:1: rule__Markup__BodyAssignment_2 : ( ruleMarkupBody ) ;
    public final void rule__Markup__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5039:1: ( ( ruleMarkupBody ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5040:1: ( ruleMarkupBody )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5040:1: ( ruleMarkupBody )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5041:1: ruleMarkupBody
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_rule__Markup__BodyAssignment_210549);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5050:1: rule__MarkupLines__BodyAssignment_2 : ( ruleMarkupBody ) ;
    public final void rule__MarkupLines__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5054:1: ( ( ruleMarkupBody ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5055:1: ( ruleMarkupBody )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5055:1: ( ruleMarkupBody )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5056:1: ruleMarkupBody
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_rule__MarkupLines__BodyAssignment_210580);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5065:1: rule__MarkupBody__CommandAssignment_1 : ( ( rule__MarkupBody__CommandAlternatives_1_0 ) ) ;
    public final void rule__MarkupBody__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5069:1: ( ( ( rule__MarkupBody__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5070:1: ( ( rule__MarkupBody__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5070:1: ( ( rule__MarkupBody__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5071:1: ( rule__MarkupBody__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5072:1: ( rule__MarkupBody__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5072:2: rule__MarkupBody__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__MarkupBody__CommandAlternatives_1_0_in_rule__MarkupBody__CommandAssignment_110611);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5081:1: rule__MarkupBody__BlockAssignment_2 : ( ruleUnparsedBlock ) ;
    public final void rule__MarkupBody__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5085:1: ( ( ruleUnparsedBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5086:1: ( ruleUnparsedBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5086:1: ( ruleUnparsedBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5087:1: ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_rule__MarkupBody__BlockAssignment_210644);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5096:1: rule__Context__BlockAssignment_3 : ( ruleUnparsedBlock ) ;
    public final void rule__Context__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5100:1: ( ( ruleUnparsedBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5101:1: ( ruleUnparsedBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5101:1: ( ruleUnparsedBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5102:1: ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getBlockUnparsedBlockParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_rule__Context__BlockAssignment_310675);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5111:1: rule__Other__KeywordAssignment_1 : ( ( rule__Other__KeywordAlternatives_1_0 ) ) ;
    public final void rule__Other__KeywordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5115:1: ( ( ( rule__Other__KeywordAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5116:1: ( ( rule__Other__KeywordAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5116:1: ( ( rule__Other__KeywordAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5117:1: ( rule__Other__KeywordAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getKeywordAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5118:1: ( rule__Other__KeywordAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5118:2: rule__Other__KeywordAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Other__KeywordAlternatives_1_0_in_rule__Other__KeywordAssignment_110706);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5127:1: rule__UnparsedBlock__ExpressionsAssignment_2 : ( ruleUnparsedExpression ) ;
    public final void rule__UnparsedBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5131:1: ( ( ruleUnparsedExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5132:1: ( ruleUnparsedExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5132:1: ( ruleUnparsedExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5133:1: ruleUnparsedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_rule__UnparsedBlock__ExpressionsAssignment_210739);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5142:1: rule__UnparsedCommand__CommandAssignment_1 : ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) ) ;
    public final void rule__UnparsedCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5146:1: ( ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5147:1: ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5147:1: ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5148:1: ( rule__UnparsedCommand__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5149:1: ( rule__UnparsedCommand__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5149:2: rule__UnparsedCommand__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__CommandAlternatives_1_0_in_rule__UnparsedCommand__CommandAssignment_110770);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5158:1: rule__Reference__AssignmentAssignment_1 : ( ( ruleIdentifier ) ) ;
    public final void rule__Reference__AssignmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5162:1: ( ( ( ruleIdentifier ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5163:1: ( ( ruleIdentifier ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5163:1: ( ( ruleIdentifier ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5164:1: ( ruleIdentifier )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5165:1: ( ruleIdentifier )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5166:1: ruleIdentifier
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentIdentifierParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Reference__AssignmentAssignment_110807);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5177:1: rule__Text__ValueAssignment : ( ( rule__Text__ValueAlternatives_0 ) ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5181:1: ( ( ( rule__Text__ValueAlternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5182:1: ( ( rule__Text__ValueAlternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5182:1: ( ( rule__Text__ValueAlternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5183:1: ( rule__Text__ValueAlternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5184:1: ( rule__Text__ValueAlternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5184:2: rule__Text__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment10842);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5193:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5197:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5198:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5198:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5199:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment10875); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5208:1: rule__Scheme__ValueAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__Scheme__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5212:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5213:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5213:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5214:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_110906);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5223:1: rule__SchemeExpression__QuotedAssignment_0_0 : ( ( KEYWORD_4 ) ) ;
    public final void rule__SchemeExpression__QuotedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5227:1: ( ( ( KEYWORD_4 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5228:1: ( ( KEYWORD_4 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5228:1: ( ( KEYWORD_4 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5229:1: ( KEYWORD_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5230:1: ( KEYWORD_4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5231:1: KEYWORD_4
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_010942); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5246:1: rule__SchemeExpression__QuasiquotedAssignment_0_1 : ( ( KEYWORD_17 ) ) ;
    public final void rule__SchemeExpression__QuasiquotedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5250:1: ( ( ( KEYWORD_17 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5251:1: ( ( KEYWORD_17 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5251:1: ( ( KEYWORD_17 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5252:1: ( KEYWORD_17 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5253:1: ( KEYWORD_17 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5254:1: KEYWORD_17
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__SchemeExpression__QuasiquotedAssignment_0_110986); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5269:1: rule__SchemeExpression__UnquotedAssignment_0_2 : ( ( KEYWORD_8 ) ) ;
    public final void rule__SchemeExpression__UnquotedAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5273:1: ( ( ( KEYWORD_8 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5274:1: ( ( KEYWORD_8 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5274:1: ( ( KEYWORD_8 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5275:1: ( KEYWORD_8 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5276:1: ( KEYWORD_8 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5277:1: KEYWORD_8
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_211030); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5292:1: rule__SchemeExpression__VariableAssignment_0_3 : ( ( KEYWORD_3 ) ) ;
    public final void rule__SchemeExpression__VariableAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5296:1: ( ( ( KEYWORD_3 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5297:1: ( ( KEYWORD_3 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5297:1: ( ( KEYWORD_3 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5298:1: ( KEYWORD_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5299:1: ( KEYWORD_3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5300:1: KEYWORD_3
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_311074); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5315:1: rule__SchemeExpression__ValueAssignment_1 : ( ruleSchemeValue ) ;
    public final void rule__SchemeExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5319:1: ( ( ruleSchemeValue ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5320:1: ( ruleSchemeValue )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5320:1: ( ruleSchemeValue )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5321:1: ruleSchemeValue
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_111113);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5330:1: rule__SchemeBoolean__ValueAssignment : ( ruleBoolean ) ;
    public final void rule__SchemeBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5334:1: ( ( ruleBoolean ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5335:1: ( ruleBoolean )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5335:1: ( ruleBoolean )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5336:1: ruleBoolean
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueBooleanParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__SchemeBoolean__ValueAssignment11144);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5345:1: rule__SchemeList__VectorAssignment_1 : ( ( KEYWORD_2 ) ) ;
    public final void rule__SchemeList__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5349:1: ( ( ( KEYWORD_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5350:1: ( ( KEYWORD_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5350:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5351:1: ( KEYWORD_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5352:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5353:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_111180); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5368:1: rule__SchemeList__ExpressionsAssignment_3 : ( ruleSchemeExpression ) ;
    public final void rule__SchemeList__ExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5372:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5373:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5373:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5374:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_311219);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5383:1: rule__SchemeBlock__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__SchemeBlock__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5387:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5388:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5388:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5389:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_111250);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5398:1: rule__SchemeCharacter__ValueAssignment_1 : ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) ;
    public final void rule__SchemeCharacter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5402:1: ( ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5403:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5403:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5404:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5405:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5405:2: rule__SchemeCharacter__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_111281);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5414:1: rule__SchemeText__ValueAssignment : ( ruleSchemeId ) ;
    public final void rule__SchemeText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5418:1: ( ( ruleSchemeId ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5419:1: ( ruleSchemeId )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5419:1: ( ruleSchemeId )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5420:1: ruleSchemeId
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueSchemeIdParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeId_in_rule__SchemeText__ValueAssignment11314);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5429:1: rule__SchemeNumber__RadixAssignment_0 : ( ruleSchemeNumberRadix ) ;
    public final void rule__SchemeNumber__RadixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5433:1: ( ( ruleSchemeNumberRadix ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5434:1: ( ruleSchemeNumberRadix )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5434:1: ( ruleSchemeNumberRadix )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5435:1: ruleSchemeNumberRadix
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_011345);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5444:1: rule__SchemeNumber__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SchemeNumber__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5448:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5449:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5449:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5450:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_111376); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5459:1: rule__SchemeMarkupCommand__CommandAssignment_1 : ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) ) ;
    public final void rule__SchemeMarkupCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5463:1: ( ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5464:1: ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5464:1: ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5465:1: ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5466:1: ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5466:2: rule__SchemeMarkupCommand__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__CommandAlternatives_1_0_in_rule__SchemeMarkupCommand__CommandAssignment_111407);
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:1: ( ( ruleAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:1: ( ruleAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1375:1: ( ruleAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1376:1: ruleAssignment
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1397:1: ( ( rulePropertyAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1397:1: ( rulePropertyAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1397:1: ( rulePropertyAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1398:1: rulePropertyAssignment
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

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1437:6: ( ( ruleText ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1437:6: ( ruleText )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1437:6: ( ruleText )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1438:1: ruleText
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_ruleText_in_synpred72952);
        ruleText();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred90
    public final void synpred90_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2251:6: ( ( ruleText ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2251:6: ( ruleText )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2251:6: ( ruleText )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2252:1: ruleText
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_ruleText_in_synpred904925);
        ruleText();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred90

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2351:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2351:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2351:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2352:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2353:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        int alt41=2;
        int LA41_0 = input.LA(1);

        if ( (LA41_0==KEYWORD_4) ) {
            alt41=1;
        }
        switch (alt41) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2353:2: rule__SchemeExpression__QuotedAssignment_0_0
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2357:6: ( ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2357:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2357:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2358:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2359:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        int alt42=2;
        int LA42_0 = input.LA(1);

        if ( (LA42_0==KEYWORD_17) ) {
            alt42=1;
        }
        switch (alt42) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2359:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2363:6: ( ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2363:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2363:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2364:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2365:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        int alt43=2;
        int LA43_0 = input.LA(1);

        if ( (LA43_0==KEYWORD_8) ) {
            alt43=1;
        }
        switch (alt43) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2365:2: rule__SchemeExpression__UnquotedAssignment_0_2
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2385:1: ( ( ruleSchemeBoolean ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2385:1: ( ruleSchemeBoolean )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2385:1: ( ruleSchemeBoolean )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2386:1: ruleSchemeBoolean
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

    // $ANTLR start synpred108
    public final void synpred108_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2409:6: ( ( ruleSchemeText ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2409:6: ( ruleSchemeText )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2409:6: ( ruleSchemeText )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2410:1: ruleSchemeText
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_ruleSchemeText_in_synpred1085314);
        ruleSchemeText();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred108

    // $ANTLR start synpred109
    public final void synpred109_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:6: ( ( ruleSchemeNumber ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:6: ( ruleSchemeNumber )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2415:6: ( ruleSchemeNumber )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2416:1: ruleSchemeNumber
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

    // $ANTLR start synpred124
    public final void synpred124_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3460:2: ( rule__MarkupBody__CommandAssignment_1 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3460:2: rule__MarkupBody__CommandAssignment_1
        {
        pushFollow(FOLLOW_rule__MarkupBody__CommandAssignment_1_in_synpred1247436);
        rule__MarkupBody__CommandAssignment_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred124

    // $ANTLR start synpred125
    public final void synpred125_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3488:2: ( rule__MarkupBody__BlockAssignment_2 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3488:2: rule__MarkupBody__BlockAssignment_2
        {
        pushFollow(FOLLOW_rule__MarkupBody__BlockAssignment_2_in_synpred1257494);
        rule__MarkupBody__BlockAssignment_2();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred125

    // $ANTLR start synpred126
    public final void synpred126_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3615:2: ( rule__Context__BlockAssignment_3 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3615:2: rule__Context__BlockAssignment_3
        {
        pushFollow(FOLLOW_rule__Context__BlockAssignment_3_in_synpred1267743);
        rule__Context__BlockAssignment_3();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred126

    // $ANTLR start synpred128
    public final void synpred128_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4033:2: ( rule__SchemeExpression__Alternatives_0 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4033:2: rule__SchemeExpression__Alternatives_0
        {
        pushFollow(FOLLOW_rule__SchemeExpression__Alternatives_0_in_synpred1288555);
        rule__SchemeExpression__Alternatives_0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred128

    // $ANTLR start synpred132
    public final void synpred132_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4448:2: ( rule__SchemeId__Group_1__0 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4448:2: rule__SchemeId__Group_1__0
        {
        pushFollow(FOLLOW_rule__SchemeId__Group_1__0_in_synpred1329374);
        rule__SchemeId__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred132

    // $ANTLR start synpred134
    public final void synpred134_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4757:2: ( rule__Identifier__Group_1__0 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4757:2: rule__Identifier__Group_1__0
        {
        pushFollow(FOLLOW_rule__Identifier__Group_1__0_in_synpred1349982);
        rule__Identifier__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred134

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
    public final boolean synpred128() {
        backtracking++;
        int start = input.mark();
        try {
            synpred128_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred134() {
        backtracking++;
        int start = input.mark();
        try {
            synpred134_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred90() {
        backtracking++;
        int start = input.mark();
        try {
            synpred90_fragment(); // can never throw exception
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
    public final boolean synpred125() {
        backtracking++;
        int start = input.mark();
        try {
            synpred125_fragment(); // can never throw exception
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
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
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
    public final boolean synpred108() {
        backtracking++;
        int start = input.mark();
        try {
            synpred108_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond97 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000020F5FFF741L});
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
    public static final BitSet FOLLOW_KEYWORD_60_in_rule__OtherName__Alternatives3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_rule__OtherName__Alternatives3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__OtherName__Alternatives3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_rule__OtherName__Alternatives3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rule__OtherName__Alternatives3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_rule__OtherName__Alternatives3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_rule__OtherName__Alternatives3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_rule__OtherName__Alternatives3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rule__OtherName__Alternatives3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_rule__OtherName__Alternatives3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rule__OtherName__Alternatives3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_rule__OtherName__Alternatives3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rule__OtherName__Alternatives3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_rule__OtherName__Alternatives3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_rule__OtherName__Alternatives3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rule__OtherName__Alternatives3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_rule__OtherName__Alternatives3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_rule__OtherName__Alternatives3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_89_in_rule__OtherName__Alternatives3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rule__OtherName__Alternatives3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__OtherName__Alternatives3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rule__OtherName__Alternatives3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_rule__OtherName__Alternatives3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rule__OtherName__Alternatives3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_rule__OtherName__Alternatives3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_rule__OtherName__Alternatives3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__OtherName__Alternatives3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rule__OtherName__Alternatives3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__OtherName__Alternatives4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__OtherName__Alternatives4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_rule__OtherName__Alternatives4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_rule__OtherName__Alternatives4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_rule__OtherName__Alternatives4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rule__OtherName__Alternatives4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_rule__OtherName__Alternatives4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rule__OtherName__Alternatives4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_rule__OtherName__Alternatives4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_rule__OtherName__Alternatives4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_rule__OtherName__Alternatives4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_rule__OtherName__Alternatives4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_rule__OtherName__Alternatives4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_rule__OtherName__Alternatives4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rule__OtherName__Alternatives4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_rule__OtherName__Alternatives4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__OtherName__Alternatives4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_rule__OtherName__Alternatives4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rule__OtherName__Alternatives4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_rule__OtherName__Alternatives4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_rule__OtherName__Alternatives4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rule__OtherName__Alternatives4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rule__OtherName__Alternatives4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rule__OtherName__Alternatives4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_rule__OtherName__Alternatives4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rule__OtherName__Alternatives4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rule__OtherName__Alternatives4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rule__OtherName__Alternatives4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rule__SpecialCommandName__Alternatives4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_rule__SpecialCommandName__Alternatives4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_rule__SpecialCommandName__Alternatives4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_rule__SpecialCommandName__Alternatives4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_rule__SpecialCommandName__Alternatives4668 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__SchemeId__Alternatives_1_05447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__SchemeId__Alternatives_1_05467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__SchemeTextLiteral__Alternatives5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__SchemeTextLiteral__Alternatives5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__SchemeTextLiteral__Alternatives5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiteral__Alternatives5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_rule__SchemeTextLiteral__Alternatives5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__SchemeTextLiteral__Alternatives5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SchemeTextLiteral__Alternatives5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SchemeTextLiteral__Alternatives5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiteral__Alternatives5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15785 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFF741L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__15788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__Assignment__Group__1__Impl5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__25847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__05910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__05913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__15970 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFF741L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__15973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__PropertyAssignment__Group__1__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__26032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__06095 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__06098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__16156 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020FDFFF741L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__16159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__SimpleBlock__Group__1__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__26218 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__26221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl6248 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000020F5FFF741L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__36279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__SimpleBlock__Group__3__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__06346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__06349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__16407 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFF7C1L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__SimultaneousBlock__Group__1__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__26469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__26472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl6499 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000020F5FFF741L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__36530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__SimultaneousBlock__Group__3__Impl6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06597 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Include__Group__0__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16659 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rule__Include__Group__1__Impl6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__06784 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Version__Group__0__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__16846 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__16849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_rule__Version__Group__1__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__26908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_2_in_rule__Version__Group__2__Impl6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__06971 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__06974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Markup__Group__0__Impl7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__17033 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800400L});
    public static final BitSet FOLLOW_rule__Markup__Group__2_in_rule__Markup__Group__17036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_rule__Markup__Group__1__Impl7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__2__Impl_in_rule__Markup__Group__27095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__BodyAssignment_2_in_rule__Markup__Group__2__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__0__Impl_in_rule__MarkupLines__Group__07158 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__1_in_rule__MarkupLines__Group__07161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__MarkupLines__Group__0__Impl7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__1__Impl_in_rule__MarkupLines__Group__17220 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800400L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__2_in_rule__MarkupLines__Group__17223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_rule__MarkupLines__Group__1__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__2__Impl_in_rule__MarkupLines__Group__27282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__BodyAssignment_2_in_rule__MarkupLines__Group__2__Impl7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__0__Impl_in_rule__MarkupBody__Group__07345 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800400L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__1_in_rule__MarkupBody__Group__07348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__1__Impl_in_rule__MarkupBody__Group__17406 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__2_in_rule__MarkupBody__Group__17409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAssignment_1_in_rule__MarkupBody__Group__1__Impl7436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800400L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__2__Impl_in_rule__MarkupBody__Group__27467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__BlockAssignment_2_in_rule__MarkupBody__Group__2__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__07531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__07534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__17592 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__17595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Context__Group__1__Impl7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__27654 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__27657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_rule__Context__Group__2__Impl7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__37716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__BlockAssignment_3_in_rule__Context__Group__3__Impl7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__Group__0__Impl_in_rule__Other__Group__07782 = new BitSet(new long[]{0xFFFFFEFD6FFFF7F0L,0x000000001168E201L});
    public static final BitSet FOLLOW_rule__Other__Group__1_in_rule__Other__Group__07785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Other__Group__0__Impl7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__Group__1__Impl_in_rule__Other__Group__17844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__KeywordAssignment_1_in_rule__Other__Group__1__Impl7871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__0__Impl_in_rule__UnparsedBlock__Group__07905 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__1_in_rule__UnparsedBlock__Group__07908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__1__Impl_in_rule__UnparsedBlock__Group__17966 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020FDFFF701L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__2_in_rule__UnparsedBlock__Group__17969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__UnparsedBlock__Group__1__Impl7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__2__Impl_in_rule__UnparsedBlock__Group__28028 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__3_in_rule__UnparsedBlock__Group__28031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__ExpressionsAssignment_2_in_rule__UnparsedBlock__Group__2__Impl8058 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000020F5FFF701L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__3__Impl_in_rule__UnparsedBlock__Group__38089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__UnparsedBlock__Group__3__Impl8117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__0__Impl_in_rule__UnparsedCommand__Group__08156 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000080000001L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__1_in_rule__UnparsedCommand__Group__08159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__UnparsedCommand__Group__0__Impl8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__1__Impl_in_rule__UnparsedCommand__Group__18218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__CommandAssignment_1_in_rule__UnparsedCommand__Group__1__Impl8245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08279 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Reference__Group__0__Impl8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__08402 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F37BBF0FL});
    public static final BitSet FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__08405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__18464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__08525 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17AA70FL});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__08528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__18586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__08647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__08650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__18708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__18711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__28769 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F37BFF0FL});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__28772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__38831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__38834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl8861 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000020F37BBF0FL});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__48892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl8920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__08961 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F5FFF741L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__08964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__SchemeBlock__Group__0__Impl8992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__19023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__19026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl9055 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000020F5FFF741L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl9067 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000020F5FFF741L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__29100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__SchemeBlock__Group__2__Impl9128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__09165 = new BitSet(new long[]{0x0000000000000000L,0x0000002091688200L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__09168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__SchemeCharacter__Group__0__Impl9196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__19227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__0__Impl_in_rule__SchemeId__Group__09288 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__1_in_rule__SchemeId__Group__09291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group__0__Impl9318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__1__Impl_in_rule__SchemeId__Group__19347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0_in_rule__SchemeId__Group__1__Impl9374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0__Impl_in_rule__SchemeId__Group_1__09409 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000020F17A8301L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__1_in_rule__SchemeId__Group_1__09412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Alternatives_1_0_in_rule__SchemeId__Group_1__0__Impl9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__1__Impl_in_rule__SchemeId__Group_1__19469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group_1__1__Impl9496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__09529 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__09532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__19590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl9617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__09651 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__09654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__19713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__SchemeNumberRadix__Group__1__Impl9740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__09773 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000080000001L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__09776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__SchemeMarkupCommand__Group__0__Impl9804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__19835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl9862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__09896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__09899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Identifier__Group__0__Impl9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__19955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl9982 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__010017 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__010020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__Identifier__Group_1__0__Impl10048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__110079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Identifier__Group_1__1__Impl10106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__0__Impl_in_rule__Boolean__Group__010139 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Boolean__Group__1_in_rule__Boolean__Group__010142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Boolean__Group__0__Impl10170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__1__Impl_in_rule__Boolean__Group__110201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Boolean__Group__1__Impl10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment10266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_010297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_210330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_010361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_210394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_210425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_210456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_210487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_210518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_rule__Markup__BodyAssignment_210549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_rule__MarkupLines__BodyAssignment_210580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAlternatives_1_0_in_rule__MarkupBody__CommandAssignment_110611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_rule__MarkupBody__BlockAssignment_210644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_rule__Context__BlockAssignment_310675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__KeywordAlternatives_1_0_in_rule__Other__KeywordAssignment_110706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_rule__UnparsedBlock__ExpressionsAssignment_210739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__CommandAlternatives_1_0_in_rule__UnparsedCommand__CommandAssignment_110770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Reference__AssignmentAssignment_110807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment10842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment10875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_110906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_010942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__SchemeExpression__QuasiquotedAssignment_0_110986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_211030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_311074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_111113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__SchemeBoolean__ValueAssignment11144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_111180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_311219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_111250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_111281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeId_in_rule__SchemeText__ValueAssignment11314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_011345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_111376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__CommandAlternatives_1_0_in_rule__SchemeMarkupCommand__CommandAssignment_111407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred22803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred32852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_synpred72952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_synpred904925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred985155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred1005174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred1025193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred1045246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_synpred1085314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred1095331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAssignment_1_in_synpred1247436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__BlockAssignment_2_in_synpred1257494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__BlockAssignment_3_in_synpred1267743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Alternatives_0_in_synpred1288555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0_in_synpred1329374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Group_1__0_in_synpred1349982 = new BitSet(new long[]{0x0000000000000002L});

}